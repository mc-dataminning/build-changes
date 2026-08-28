public record cfr(alf d) {
   public static final ale<cfr> a = a("temperate");
   public static final ale<cfr> b = a("warm");
   public static final ale<cfr> c = a("cold");

   private static ale<cfr> a(String $$0) {
      return ale.a(lq.B, new alf($$0));
   }

   public static cfr a(jv<cfr> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cfr a(jv<cfr> $$0, ale<cfr> $$1, String $$2) {
      return jv.a($$0, $$1, new cfr(new alf($$2)));
   }

   public alf a() {
      return this.d;
   }
}
