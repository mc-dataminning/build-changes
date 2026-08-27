public class fov<T extends cfg> extends fmo<T> implements fol {
   private final fpc a = this.l.b("hat_rim");

   public fov(fpc $$0) {
      super($$0);
   }

   public static fpi c() {
      fpk $$0 = fmo.a(fpg.a, 0.0F);
      fpl $$1 = $$0.a();
      $$1.a("head", new fph().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fpe.a);
      fpl $$2 = $$1.a("hat", fph.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fpg(0.5F)), fpe.a);
      $$2.a("hat_rim", fph.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fpe.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fph.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fpg(0.05F)), fpe.a);
      $$1.a("right_arm", fph.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpe.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fph.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpe.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fph.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpe.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fph.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpe.a(2.0F, 12.0F, 0.0F));
      return fpi.a($$0, 64, 64);
   }

   public static fpi a(fpg $$0) {
      fpk $$1 = fmo.a($$0, 0.0F);
      fpl $$2 = $$1.a();
      $$2.a("head", fph.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fpe.a);
      $$2.a("body", fph.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fpe.a);
      $$2.a("right_leg", fph.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fpe.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fph.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fpe.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fph.c(), fpe.a);
      return fpi.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fkz.a(this.o, this.n, $$0.fY(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
