public record chz(alp e) {
   public static final zi<wv, jq<chz>> a = zg.b(mb.F);
   public static final alo<chz> b = a("temperate");
   public static final alo<chz> c = a("warm");
   public static final alo<chz> d = a("cold");

   private static alo<chz> a(String $$0) {
      return alo.a(mb.F, alp.b($$0));
   }

   public static chz a(kd<chz> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chz a(kd<chz> $$0, alo<chz> $$1, String $$2) {
      return kd.a($$0, $$1, new chz(alp.b($$2)));
   }

   public alp a() {
      return this.e;
   }
}
