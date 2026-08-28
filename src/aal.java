public class aal {
   public static final zx<aac> a = a("custom_payload");
   public static final zx<aad> b = a("disconnect");
   public static final zx<aae> c = a("keep_alive");
   public static final zx<aaf> d = a("ping");
   public static final zx<aag> e = a("resource_pack_pop");
   public static final zx<aah> f = a("resource_pack_push");
   public static final zx<aai> g = a("store_cookie");
   public static final zx<aaj> h = a("transfer");
   public static final zx<aak> i = a("update_tags");
   public static final zx<aan> j = b("client_information");
   public static final zx<aao> k = b("custom_payload");
   public static final zx<aap> l = b("keep_alive");
   public static final zx<aaq> m = b("pong");
   public static final zx<aar> n = b("resource_pack");

   private static <T extends zv<aab>> zx<T> a(String $$0) {
      return new zx<>(zw.b, new ale($$0));
   }

   private static <T extends zv<aam>> zx<T> b(String $$0) {
      return new zx<>(zw.a, new ale($$0));
   }
}
