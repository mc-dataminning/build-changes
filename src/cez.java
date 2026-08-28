public record cez(akk d) {
   public static final akj<cez> a = a("temperate");
   public static final akj<cez> b = a("warm");
   public static final akj<cez> c = a("cold");

   private static akj<cez> a(String $$0) {
      return akj.a(lr.F, new akk($$0));
   }

   public static cez a(jw<cez> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cez a(jw<cez> $$0, akj<cez> $$1, String $$2) {
      return jw.a($$0, $$1, new cez(new akk($$2)));
   }

   public akk a() {
      return this.d;
   }
}
