public record cer(akn d) {
   public static final akm<cer> a = a("temperate");
   public static final akm<cer> b = a("warm");
   public static final akm<cer> c = a("cold");

   private static akm<cer> a(String $$0) {
      return akm.a(lf.B, new akn($$0));
   }

   public static cer a(jk<cer> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cer a(jk<cer> $$0, akm<cer> $$1, String $$2) {
      return jk.a($$0, $$1, new cer(new akn($$2)));
   }

   public akn a() {
      return this.d;
   }
}
