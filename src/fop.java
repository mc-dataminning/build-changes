public class fop extends fmk<cin> {
   private static final int a = 16;
   private final fpc b;
   private final fpc f;
   private final fpc g;

   public fop(fpc $$0) {
      super(fvt::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fpl $$2 = $$1.a("bone", fph.c(), fpe.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fph.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fpg(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fpg(0.0F)),
         fpe.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fph.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fpg(0.0F)), fpe.a(0.0F, 0.0F, 0.0F));
      return fpi.a($$0, 64, 32);
   }

   public void a(cin $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fpc a() {
      return this.b;
   }
}
