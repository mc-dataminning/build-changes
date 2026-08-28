public record cgl(alc e) {
   public static final zb<wo, jn<cgl>> a = yz.b(lv.F);
   public static final alb<cgl> b = a("temperate");
   public static final alb<cgl> c = a("warm");
   public static final alb<cgl> d = a("cold");

   private static alb<cgl> a(String $$0) {
      return alb.a(lv.F, alc.b($$0));
   }

   public static cgl a(ka<cgl> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cgl a(ka<cgl> $$0, alb<cgl> $$1, String $$2) {
      return ka.a($$0, $$1, new cgl(alc.b($$2)));
   }

   public alc a() {
      return this.e;
   }
}
