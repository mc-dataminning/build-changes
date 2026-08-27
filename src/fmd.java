public class fmd extends fjy<cgg> {
   private final fmp a;

   public fmd(fmp $$0) {
      super(fth::i);
      this.a = $$0.b("bone");
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      fmy $$2 = $$1.a("bone", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$3 = $$2.a("projectile", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$4 = $$3.a(
         "wind",
         fmu.c().a(20, 112).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmt(0.0F)).a(0, 8).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmt(0.0F)),
         fmr.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a("cube_r1", fmu.c().a(32, 24).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmt(-0.6F)), fmr.a(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
      $$4.a("cube_r2", fmu.c().a(16, 40).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmt(-0.3F)), fmr.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
      $$3.a("wind_charge", fmu.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fmt(0.0F)), fmr.a(0.0F, 0.0F, 0.0F));
      return fmv.a($$0, 64, 64);
   }

   public void a(cgg $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fmp a() {
      return this.a;
   }
}
