public record cfp(akr e) {
   public static final yx<wk, jm<cfp>> a = yv.b(lu.F);
   public static final akq<cfp> b = a("temperate");
   public static final akq<cfp> c = a("warm");
   public static final akq<cfp> d = a("cold");

   private static akq<cfp> a(String $$0) {
      return akq.a(lu.F, akr.b($$0));
   }

   public static cfp a(jz<cfp> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cfp a(jz<cfp> $$0, akq<cfp> $$1, String $$2) {
      return jz.a($$0, $$1, new cfp(akr.b($$2)));
   }

   public akr a() {
      return this.e;
   }
}
