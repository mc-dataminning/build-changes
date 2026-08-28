public class aau {
   public static final aae<aaj> a = a("custom_payload");
   public static final aae<aak> b = a("custom_report_details");
   public static final aae<aal> c = a("disconnect");
   public static final aae<aam> d = a("keep_alive");
   public static final aae<aan> e = a("ping");
   public static final aae<aao> f = a("resource_pack_pop");
   public static final aae<aap> g = a("resource_pack_push");
   public static final aae<aaq> h = a("server_links");
   public static final aae<aar> i = a("store_cookie");
   public static final aae<aas> j = a("transfer");
   public static final aae<aat> k = a("update_tags");
   public static final aae<aaw> l = b("client_information");
   public static final aae<aax> m = b("custom_payload");
   public static final aae<aay> n = b("keep_alive");
   public static final aae<aaz> o = b("pong");
   public static final aae<aba> p = b("resource_pack");

   private static <T extends aac<aai>> aae<T> a(String $$0) {
      return new aae<>(aad.b, alz.b($$0));
   }

   private static <T extends aac<aav>> aae<T> b(String $$0) {
      return new aae<>(aad.a, alz.b($$0));
   }
}
