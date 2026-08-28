public record cih(alz e) {
   public static final zt<xg, jq<cih>> a = zr.b(mb.F);
   public static final aly<cih> b = a("temperate");
   public static final aly<cih> c = a("warm");
   public static final aly<cih> d = a("cold");

   private static aly<cih> a(String $$0) {
      return aly.a(mb.F, alz.b($$0));
   }

   public static cih a(kd<cih> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cih a(kd<cih> $$0, aly<cih> $$1, String $$2) {
      return kd.a($$0, $$1, new cih(alz.b($$2)));
   }

   public alz a() {
      return this.e;
   }
}
