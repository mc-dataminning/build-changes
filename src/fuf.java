public class fuf extends fsa<clt> {
   private static final int a = 16;
   private final fur b;
   private final fur f;
   private final fur g;

   public fuf(fur $$0) {
      super(gbm::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("bone", fuw.c(), fut.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fuw.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fuv(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fuv(0.0F)),
         fut.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fuw.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fuv(0.0F)), fut.a(0.0F, 0.0F, 0.0F));
      return fux.a($$0, 64, 32);
   }

   public void a(clt $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fur a() {
      return this.b;
   }
}
