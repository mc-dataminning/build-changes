public class fmj extends fke<cgm> {
   private final fmv a;

   public fmj(fmv $$0) {
      super(ftn::i);
      this.a = $$0.b("bone");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("bone", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$3 = $$2.a("projectile", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$4 = $$3.a(
         "wind",
         fna.c().a(20, 112).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmz(0.0F)).a(0, 8).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmz(0.0F)),
         fmx.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a("cube_r1", fna.c().a(32, 24).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmz(-0.6F)), fmx.a(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
      $$4.a("cube_r2", fna.c().a(16, 40).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmz(-0.3F)), fmx.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
      $$3.a("wind_charge", fna.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fmz(0.0F)), fmx.a(0.0F, 0.0F, 0.0F));
      return fnb.a($$0, 64, 64);
   }

   public void a(cgm $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fmv a() {
      return this.a;
   }
}
