public class ftj extends fre<cli> {
   private static final int a = 16;
   private final ftv b;
   private final ftv f;
   private final ftv g;

   public ftj(ftv $$0) {
      super(gaq::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      fue $$2 = $$1.a("bone", fua.c(), ftx.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fua.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new ftz(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new ftz(0.0F)),
         ftx.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fua.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new ftz(0.0F)), ftx.a(0.0F, 0.0F, 0.0F));
      return fub.a($$0, 64, 32);
   }

   public void a(cli $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public ftv a() {
      return this.b;
   }
}
