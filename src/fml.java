public class fml extends fkg<cgn> {
   private final fmx a;

   public fml(fmx $$0) {
      super(ftp::i);
      this.a = $$0.b("bone");
   }

   public static fnd b() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fng $$2 = $$1.a("bone", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$3 = $$2.a("projectile", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$4 = $$3.a(
         "wind",
         fnc.c().a(20, 112).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnb(0.0F)).a(0, 8).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnb(0.0F)),
         fmz.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a("cube_r1", fnc.c().a(32, 24).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnb(-0.6F)), fmz.a(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
      $$4.a("cube_r2", fnc.c().a(16, 40).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnb(-0.3F)), fmz.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
      $$3.a("wind_charge", fnc.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fnb(0.0F)), fmz.a(0.0F, 0.0F, 0.0F));
      return fnd.a($$0, 64, 64);
   }

   public void a(cgn $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fmx a() {
      return this.a;
   }
}
