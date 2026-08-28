public record chk(akv e) {
   public static final yn<wa, jr<chk>> a = yl.b(mc.F);
   public static final aku<chk> b = a("temperate");
   public static final aku<chk> c = a("warm");
   public static final aku<chk> d = a("cold");

   private static aku<chk> a(String $$0) {
      return aku.a(mc.F, akv.b($$0));
   }

   public static chk a(ke<chk> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chk a(ke<chk> $$0, aku<chk> $$1, String $$2) {
      return ke.a($$0, $$1, new chk(akv.b($$2)));
   }

   public akv a() {
      return this.e;
   }
}
