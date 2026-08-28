public record cii(alz e) {
   public static final zt<xg, jq<cii>> a = zr.b(mb.F);
   public static final aly<cii> b = a("temperate");
   public static final aly<cii> c = a("warm");
   public static final aly<cii> d = a("cold");

   private static aly<cii> a(String $$0) {
      return aly.a(mb.F, alz.b($$0));
   }

   public static cii a(kd<cii> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cii a(kd<cii> $$0, aly<cii> $$1, String $$2) {
      return kd.a($$0, $$1, new cii(alz.b($$2)));
   }

   public alz a() {
      return this.e;
   }
}
