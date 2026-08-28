public record cfq(alf d) {
   public static final ale<cfq> a = a("temperate");
   public static final ale<cfq> b = a("warm");
   public static final ale<cfq> c = a("cold");

   private static ale<cfq> a(String $$0) {
      return ale.a(lq.B, new alf($$0));
   }

   public static cfq a(jv<cfq> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cfq a(jv<cfq> $$0, ale<cfq> $$1, String $$2) {
      return jv.a($$0, $$1, new cfq(new alf($$2)));
   }

   public alf a() {
      return this.d;
   }
}
