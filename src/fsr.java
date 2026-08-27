public class fsr extends fss {
   private final ftv b;
   protected final ftv a;

   public fsr(ftv $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fud a() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("head", fua.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ftx.a);
      return $$0;
   }

   public static fub b() {
      fud $$0 = a();
      fue $$1 = $$0.a();
      $$1.a("head").a("hat", fua.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ftz(0.25F)), ftx.a);
      return fub.a($$0, 64, 64);
   }

   public static fub c() {
      fud $$0 = a();
      return fub.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(ewr $$0, ewv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
