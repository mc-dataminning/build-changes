public record cea(akh d) {
   public static final akg<cea> a = a("temperate");
   public static final akg<cea> b = a("warm");
   public static final akg<cea> c = a("cold");

   private static akg<cea> a(String $$0) {
      return akg.a(le.B, new akh($$0));
   }

   public static cea a(jj<cea> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cea a(jj<cea> $$0, akg<cea> $$1, String $$2) {
      return jj.a($$0, $$1, new cea(new akh($$2)));
   }

   public akh a() {
      return this.d;
   }
}
