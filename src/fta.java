public class fta extends fqv<clb> {
   private static final int a = 16;
   private final ftm b;
   private final ftm f;
   private final ftm g;

   public fta(ftm $$0) {
      super(gah::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      ftv $$2 = $$1.a("bone", ftr.c(), fto.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         ftr.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new ftq(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new ftq(0.0F)),
         fto.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", ftr.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new ftq(0.0F)), fto.a(0.0F, 0.0F, 0.0F));
      return fts.a($$0, 64, 32);
   }

   public void a(clb $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public ftm a() {
      return this.b;
   }
}
