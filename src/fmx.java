public class fmx extends fks<cgv> {
   private final fnj a;

   public fmx(fnj $$0) {
      super(fub::i);
      this.a = $$0.b("bone");
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fns $$2 = $$1.a("bone", fno.c(), fnl.a(0.0F, 0.0F, 0.0F));
      fns $$3 = $$2.a("projectile", fno.c(), fnl.a(0.0F, 0.0F, 0.0F));
      fns $$4 = $$3.a(
         "wind",
         fno.c().a(20, 112).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnn(0.0F)).a(0, 8).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnn(0.0F)),
         fnl.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a("cube_r1", fno.c().a(32, 24).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnn(-0.6F)), fnl.a(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
      $$4.a("cube_r2", fno.c().a(16, 40).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnn(-0.3F)), fnl.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
      $$3.a("wind_charge", fno.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fnn(0.0F)), fnl.a(0.0F, 0.0F, 0.0F));
      return fnp.a($$0, 64, 64);
   }

   public void a(cgv $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fnj a() {
      return this.a;
   }
}
