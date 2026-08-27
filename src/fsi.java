public class fsi extends fsj {
   private final ftm b;
   protected final ftm a;

   public fsi(ftm $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static ftu a() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("head", ftr.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fto.a);
      return $$0;
   }

   public static fts b() {
      ftu $$0 = a();
      ftv $$1 = $$0.a();
      $$1.a("head").a("hat", ftr.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ftq(0.25F)), fto.a);
      return fts.a($$0, 64, 64);
   }

   public static fts c() {
      ftu $$0 = a();
      return fts.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(ewi $$0, ewm $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
