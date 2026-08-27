public class flm extends fjh<cfw> {
   private final fly a;

   public flm(fly $$0) {
      super(fsq::i);
      this.a = $$0.b("bone");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("bone", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$3 = $$2.a("projectile", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$4 = $$3.a(
         "wind",
         fmd.c().a(20, 112).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmc(0.0F)).a(0, 8).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmc(0.0F)),
         fma.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a("cube_r1", fmd.c().a(32, 24).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmc(-0.6F)), fma.a(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
      $$4.a("cube_r2", fmd.c().a(16, 40).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmc(-0.3F)), fma.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
      $$3.a("wind_charge", fmd.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fmc(0.0F)), fma.a(0.0F, 0.0F, 0.0F));
      return fme.a($$0, 64, 64);
   }

   public void a(cfw $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fly a() {
      return this.a;
   }
}
