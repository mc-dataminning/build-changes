public class fto<T extends chz> extends fri<T> implements ftf {
   private final ftv a = this.l.b("hat_rim");

   public fto(ftv $$0) {
      super($$0);
   }

   public static fub c() {
      fud $$0 = fri.a(ftz.a, 0.0F);
      fue $$1 = $$0.a();
      $$1.a("head", new fua().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), ftx.a);
      fue $$2 = $$1.a("hat", fua.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ftz(0.5F)), ftx.a);
      $$2.a("hat_rim", fua.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), ftx.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fua.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ftz(0.05F)), ftx.a);
      $$1.a("right_arm", fua.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), ftx.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fua.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), ftx.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fua.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ftx.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fua.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ftx.a(2.0F, 12.0F, 0.0F));
      return fub.a($$0, 64, 64);
   }

   public static fub a(ftz $$0) {
      fud $$1 = fri.a($$0, 0.0F);
      fue $$2 = $$1.a();
      $$2.a("head", fua.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), ftx.a);
      $$2.a("body", fua.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), ftx.a);
      $$2.a("right_leg", fua.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), ftx.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fua.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), ftx.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fua.c(), ftx.a);
      return fub.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fps.a(this.o, this.n, $$0.gf(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
