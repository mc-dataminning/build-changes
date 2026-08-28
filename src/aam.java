public class aam {
   public static final zy<aad> a = a("custom_payload");
   public static final zy<aae> b = a("disconnect");
   public static final zy<aaf> c = a("keep_alive");
   public static final zy<aag> d = a("ping");
   public static final zy<aah> e = a("resource_pack_pop");
   public static final zy<aai> f = a("resource_pack_push");
   public static final zy<aaj> g = a("store_cookie");
   public static final zy<aak> h = a("transfer");
   public static final zy<aal> i = a("update_tags");
   public static final zy<aao> j = b("client_information");
   public static final zy<aap> k = b("custom_payload");
   public static final zy<aaq> l = b("keep_alive");
   public static final zy<aar> m = b("pong");
   public static final zy<aas> n = b("resource_pack");

   private static <T extends zw<aac>> zy<T> a(String $$0) {
      return new zy<>(zx.b, new alf($$0));
   }

   private static <T extends zw<aan>> zy<T> b(String $$0) {
      return new zy<>(zx.a, new alf($$0));
   }
}
