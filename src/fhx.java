public class fhx<T extends cad> extends ffs<T> implements fhp {
   private final fie a = this.l.b("hat_rim");

   public fhx(fie $$0) {
      super($$0);
   }

   public static fik c() {
      fim $$0 = ffs.a(fii.a, 0.0F);
      fin $$1 = $$0.a();
      $$1.a("head", new fij().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fig.a);
      fin $$2 = $$1.a("hat", fij.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fii(0.5F)), fig.a);
      $$2.a("hat_rim", fij.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fig.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fij.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fii(0.05F)), fig.a);
      $$1.a("right_arm", fij.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fig.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fij.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fig.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fij.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fig.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fij.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fig.a(2.0F, 12.0F, 0.0F));
      return fik.a($$0, 64, 64);
   }

   public static fik a(fii $$0) {
      fim $$1 = ffs.a($$0, 0.0F);
      fin $$2 = $$1.a();
      $$2.a("head", fij.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fig.a);
      $$2.a("body", fij.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fig.a);
      $$2.a("right_leg", fij.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fig.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fij.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fig.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fij.c(), fig.a);
      return fik.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fef.a(this.o, this.n, $$0.fV(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
