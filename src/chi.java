public record chi(aku e) {
   public static final ym<vz, jr<chi>> a = yk.b(mc.F);
   public static final akt<chi> b = a("temperate");
   public static final akt<chi> c = a("warm");
   public static final akt<chi> d = a("cold");

   private static akt<chi> a(String $$0) {
      return akt.a(mc.F, aku.b($$0));
   }

   public static chi a(ke<chi> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chi a(ke<chi> $$0, akt<chi> $$1, String $$2) {
      return ke.a($$0, $$1, new chi(aku.b($$2)));
   }

   public aku a() {
      return this.e;
   }
}
