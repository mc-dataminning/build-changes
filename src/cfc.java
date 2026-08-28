public record cfc(akk d) {
   public static final akj<cfc> a = a("temperate");
   public static final akj<cfc> b = a("warm");
   public static final akj<cfc> c = a("cold");

   private static akj<cfc> a(String $$0) {
      return akj.a(lr.F, new akk($$0));
   }

   public static cfc a(jw<cfc> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cfc a(jw<cfc> $$0, akj<cfc> $$1, String $$2) {
      return jw.a($$0, $$1, new cfc(new akk($$2)));
   }

   public akk a() {
      return this.d;
   }
}
