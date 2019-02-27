package TestUrl;

import java.io.UnsupportedEncodingException;

public class TestURL {

	public static void main(String[] args) {
		String utf8 = urlEncodeUTF8("http://yac888.xyz/WechatVote/getcode");
		System.out.println(utf8);
		//http%3A%2F%2Flocalhost%2FWechatVote%2Findex.html%3Faid%3D1
	}
	
		/**
		 * URL±àÂë£¨ utf-8£©
		 **
		 * @param source
		 * @return
		 */
		public static String urlEncodeUTF8(String source) {
			String result = source;
			try {
				result = java.net.URLEncoder.encode(source, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return result;
		}
}
