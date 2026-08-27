public class fhq<T extends bzw> extends ffl<T> implements fhi {
   private final fhx a = this.l.b("hat_rim");

   public fhq(fhx $$0) {
      super($$0);
   }

   public static fid c() {
      fif $$0 = ffl.a(fib.a, 0.0F);
      fig $$1 = $$0.a();
      $$1.a("head", new fic().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fhz.a);
      fig $$2 = $$1.a("hat", fic.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fib(0.5F)), fhz.a);
      $$2.a("hat_rim", fic.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fhz.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fic.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fib(0.05F)), fhz.a);
      $$1.a("right_arm", fic.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhz.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fic.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhz.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fic.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhz.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fic.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhz.a(2.0F, 12.0F, 0.0F));
      return fid.a($$0, 64, 64);
   }

   public static fid a(fib $$0) {
      fif $$1 = ffl.a($$0, 0.0F);
      fig $$2 = $$1.a();
      $$2.a("head", fic.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fhz.a);
      $$2.a("body", fic.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhz.a);
      $$2.a("right_leg", fic.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhz.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fic.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhz.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fic.c(), fhz.a);
      return fid.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fdy.a(this.o, this.n, $$0.fS(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
