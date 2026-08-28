public record chi(akv e) {
   public static final yn<wa, jr<chi>> a = yl.b(mc.F);
   public static final aku<chi> b = a("temperate");
   public static final aku<chi> c = a("warm");
   public static final aku<chi> d = a("cold");

   private static aku<chi> a(String $$0) {
      return aku.a(mc.F, akv.b($$0));
   }

   public static chi a(ke<chi> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chi a(ke<chi> $$0, aku<chi> $$1, String $$2) {
      return ke.a($$0, $$1, new chi(akv.b($$2)));
   }

   public akv a() {
      return this.e;
   }
}
