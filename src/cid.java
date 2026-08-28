public record cid(alz e) {
   public static final zt<xg, jq<cid>> a = zr.b(mb.F);
   public static final aly<cid> b = a("temperate");
   public static final aly<cid> c = a("warm");
   public static final aly<cid> d = a("cold");

   private static aly<cid> a(String $$0) {
      return aly.a(mb.F, alz.b($$0));
   }

   public static cid a(kd<cid> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cid a(kd<cid> $$0, aly<cid> $$1, String $$2) {
      return kd.a($$0, $$1, new cid(alz.b($$2)));
   }

   public alz a() {
      return this.e;
   }
}
