public class flr<T extends ccs> extends fjl<T> implements fli {
   private final fly a = this.l.b("hat_rim");

   public flr(fly $$0) {
      super($$0);
   }

   public static fme c() {
      fmg $$0 = fjl.a(fmc.a, 0.0F);
      fmh $$1 = $$0.a();
      $$1.a("head", new fmd().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fma.a);
      fmh $$2 = $$1.a("hat", fmd.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fmc(0.5F)), fma.a);
      $$2.a("hat_rim", fmd.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fma.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fmd.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fmc(0.05F)), fma.a);
      $$1.a("right_arm", fmd.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fma.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fmd.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fma.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fmd.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fma.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fmd.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fma.a(2.0F, 12.0F, 0.0F));
      return fme.a($$0, 64, 64);
   }

   public static fme a(fmc $$0) {
      fmg $$1 = fjl.a($$0, 0.0F);
      fmh $$2 = $$1.a();
      $$2.a("head", fmd.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fma.a);
      $$2.a("body", fmd.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fma.a);
      $$2.a("right_leg", fmd.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fma.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fmd.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fma.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fmd.c(), fma.a);
      return fme.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fhx.a(this.o, this.n, $$0.fW(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
