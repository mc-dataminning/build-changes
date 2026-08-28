public record cfs(alf d) {
   public static final ale<cfs> a = a("temperate");
   public static final ale<cfs> b = a("warm");
   public static final ale<cfs> c = a("cold");

   private static ale<cfs> a(String $$0) {
      return ale.a(lq.B, new alf($$0));
   }

   public static cfs a(jv<cfs> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cfs a(jv<cfs> $$0, ale<cfs> $$1, String $$2) {
      return jv.a($$0, $$1, new cfs(new alf($$2)));
   }

   public alf a() {
      return this.d;
   }
}
