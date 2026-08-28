public record cfo(ale d) {
   public static final ald<cfo> a = a("temperate");
   public static final ald<cfo> b = a("warm");
   public static final ald<cfo> c = a("cold");

   private static ald<cfo> a(String $$0) {
      return ald.a(lq.B, new ale($$0));
   }

   public static cfo a(jv<cfo> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cfo a(jv<cfo> $$0, ald<cfo> $$1, String $$2) {
      return jv.a($$0, $$1, new cfo(new ale($$2)));
   }

   public ale a() {
      return this.d;
   }
}
