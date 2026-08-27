public record cep(akm d) {
   public static final akl<cep> a = a("temperate");
   public static final akl<cep> b = a("warm");
   public static final akl<cep> c = a("cold");

   private static akl<cep> a(String $$0) {
      return akl.a(lf.B, new akm($$0));
   }

   public static cep a(jk<cep> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cep a(jk<cep> $$0, akl<cep> $$1, String $$2) {
      return jk.a($$0, $$1, new cep(new akm($$2)));
   }

   public akm a() {
      return this.d;
   }
}
