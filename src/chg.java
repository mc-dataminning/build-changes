public record chg(all e) {
   public static final zj<ww, jq<chg>> a = zh.b(ma.F);
   public static final alk<chg> b = a("temperate");
   public static final alk<chg> c = a("warm");
   public static final alk<chg> d = a("cold");

   private static alk<chg> a(String $$0) {
      return alk.a(ma.F, all.b($$0));
   }

   public static chg a(kd<chg> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static chg a(kd<chg> $$0, alk<chg> $$1, String $$2) {
      return kd.a($$0, $$1, new chg(all.b($$2)));
   }

   public all a() {
      return this.e;
   }
}
