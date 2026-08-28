public record chj(alj e) {
   public static final zh<wu, jq<chj>> a = zf.b(ma.F);
   public static final ali<chj> b = a("temperate");
   public static final ali<chj> c = a("warm");
   public static final ali<chj> d = a("cold");

   private static ali<chj> a(String $$0) {
      return ali.a(ma.F, alj.b($$0));
   }

   public static chj a(kd<chj> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chj a(kd<chj> $$0, ali<chj> $$1, String $$2) {
      return kd.a($$0, $$1, new chj(alj.b($$2)));
   }

   public alj a() {
      return this.e;
   }
}
