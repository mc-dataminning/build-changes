public record cfp(ale d) {
   public static final ald<cfp> a = a("temperate");
   public static final ald<cfp> b = a("warm");
   public static final ald<cfp> c = a("cold");

   private static ald<cfp> a(String $$0) {
      return ald.a(lq.B, new ale($$0));
   }

   public static cfp a(jv<cfp> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cfp a(jv<cfp> $$0, ald<cfp> $$1, String $$2) {
      return jv.a($$0, $$1, new cfp(new ale($$2)));
   }

   public ale a() {
      return this.d;
   }
}
