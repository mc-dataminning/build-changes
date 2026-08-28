public record chj(akv e) {
   public static final yn<wa, jr<chj>> a = yl.b(mc.F);
   public static final aku<chj> b = a("temperate");
   public static final aku<chj> c = a("warm");
   public static final aku<chj> d = a("cold");

   private static aku<chj> a(String $$0) {
      return aku.a(mc.F, akv.b($$0));
   }

   public static chj a(ke<chj> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chj a(ke<chj> $$0, aku<chj> $$1, String $$2) {
      return ke.a($$0, $$1, new chj(akv.b($$2)));
   }

   public akv a() {
      return this.e;
   }
}
