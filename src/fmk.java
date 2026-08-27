public class fmk extends fkf<cgm> {
   private final fmw a;

   public fmk(fmw $$0) {
      super(fto::i);
      this.a = $$0.b("bone");
   }

   public static fnc b() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      fnf $$2 = $$1.a("bone", fnb.c(), fmy.a(0.0F, 0.0F, 0.0F));
      fnf $$3 = $$2.a("projectile", fnb.c(), fmy.a(0.0F, 0.0F, 0.0F));
      fnf $$4 = $$3.a(
         "wind",
         fnb.c().a(20, 112).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fna(0.0F)).a(0, 8).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fna(0.0F)),
         fmy.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a("cube_r1", fnb.c().a(32, 24).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fna(-0.6F)), fmy.a(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
      $$4.a("cube_r2", fnb.c().a(16, 40).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fna(-0.3F)), fmy.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
      $$3.a("wind_charge", fnb.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fna(0.0F)), fmy.a(0.0F, 0.0F, 0.0F));
      return fnc.a($$0, 64, 64);
   }

   public void a(cgm $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fmw a() {
      return this.a;
   }
}
