public record chh(aku e) {
   public static final ym<vz, jr<chh>> a = yk.b(mc.F);
   public static final akt<chh> b = a("temperate");
   public static final akt<chh> c = a("warm");
   public static final akt<chh> d = a("cold");

   private static akt<chh> a(String $$0) {
      return akt.a(mc.F, aku.b($$0));
   }

   public static chh a(ke<chh> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chh a(ke<chh> $$0, akt<chh> $$1, String $$2) {
      return ke.a($$0, $$1, new chh(aku.b($$2)));
   }

   public aku a() {
      return this.e;
   }
}
