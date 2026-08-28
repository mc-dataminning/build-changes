public record cfn(akq e) {
   public static final yw<wj, jm<cfn>> a = yu.b(lu.F);
   public static final akp<cfn> b = a("temperate");
   public static final akp<cfn> c = a("warm");
   public static final akp<cfn> d = a("cold");

   private static akp<cfn> a(String $$0) {
      return akp.a(lu.F, akq.b($$0));
   }

   public static cfn a(jz<cfn> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cfn a(jz<cfn> $$0, akp<cfn> $$1, String $$2) {
      return jz.a($$0, $$1, new cfn(akq.b($$2)));
   }

   public akq a() {
      return this.e;
   }
}
