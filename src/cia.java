public record cia(aku e) {
   public static final yn<wa, jr<cia>> a = yl.b(mc.F);
   public static final akt<cia> b = a(cir.a.a());
   public static final akt<cia> c = a(cir.b.a());
   public static final akt<cia> d = a(cir.c.a());

   private static akt<cia> a(String $$0) {
      return akt.a(mc.F, aku.b($$0));
   }

   public static cia a(ke<cia> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cia a(ke<cia> $$0, akt<cia> $$1, String $$2) {
      return ke.a($$0, $$1, new cia(aku.b($$2)));
   }

   public aku a() {
      return this.e;
   }
}
