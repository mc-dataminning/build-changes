public record cfl(alb d) {
   public static final ala<cfl> a = a("temperate");
   public static final ala<cfl> b = a("warm");
   public static final ala<cfl> c = a("cold");

   private static ala<cfl> a(String $$0) {
      return ala.a(lq.B, new alb($$0));
   }

   public static cfl a(jv<cfl> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cfl a(jv<cfl> $$0, ala<cfl> $$1, String $$2) {
      return jv.a($$0, $$1, new cfl(new alb($$2)));
   }

   public alb a() {
      return this.d;
   }
}
