public record cgg(alb e) {
   public static final zb<wo, jn<cgg>> a = yz.b(lv.F);
   public static final ala<cgg> b = a("temperate");
   public static final ala<cgg> c = a("warm");
   public static final ala<cgg> d = a("cold");

   private static ala<cgg> a(String $$0) {
      return ala.a(lv.F, alb.b($$0));
   }

   public static cgg a(ka<cgg> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cgg a(ka<cgg> $$0, ala<cgg> $$1, String $$2) {
      return ka.a($$0, $$1, new cgg(alb.b($$2)));
   }

   public alb a() {
      return this.e;
   }
}
