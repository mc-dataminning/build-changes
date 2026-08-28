public record cfd(akk e) {
   public static final ys<wf, jj<cfd>> a = yq.b(lr.F);
   public static final akj<cfd> b = a("temperate");
   public static final akj<cfd> c = a("warm");
   public static final akj<cfd> d = a("cold");

   private static akj<cfd> a(String $$0) {
      return akj.a(lr.F, new akk($$0));
   }

   public static cfd a(jw<cfd> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cfd a(jw<cfd> $$0, akj<cfd> $$1, String $$2) {
      return jw.a($$0, $$1, new cfd(new akk($$2)));
   }

   public akk a() {
      return this.e;
   }
}
