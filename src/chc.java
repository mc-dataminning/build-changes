public record chc(ali e) {
   public static final zg<wt, jq<chc>> a = ze.b(lz.F);
   public static final alh<chc> b = a("temperate");
   public static final alh<chc> c = a("warm");
   public static final alh<chc> d = a("cold");

   private static alh<chc> a(String $$0) {
      return alh.a(lz.F, ali.b($$0));
   }

   public static chc a(kd<chc> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chc a(kd<chc> $$0, alh<chc> $$1, String $$2) {
      return kd.a($$0, $$1, new chc(ali.b($$2)));
   }

   public ali a() {
      return this.e;
   }
}
