public class fop extends fmk<cin> {
   private final fpc a;

   public fop(fpc $$0) {
      super(fvu::i);
      this.a = $$0.b("bone");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fpl $$2 = $$1.a("bone", fph.c(), fpe.a(0.0F, 0.0F, 0.0F));
      fpl $$3 = $$2.a("projectile", fph.c(), fpe.a(0.0F, 0.0F, 0.0F));
      fpl $$4 = $$3.a(
         "wind",
         fph.c().a(20, 112).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpg(0.0F)).a(0, 8).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpg(0.0F)),
         fpe.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a("cube_r1", fph.c().a(32, 24).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpg(-0.6F)), fpe.a(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
      $$4.a("cube_r2", fph.c().a(16, 40).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpg(-0.3F)), fpe.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
      $$3.a("wind_charge", fph.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fpg(0.0F)), fpe.a(0.0F, 0.0F, 0.0F));
      return fpi.a($$0, 64, 64);
   }

   public void a(cin $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fpc a() {
      return this.a;
   }
}
