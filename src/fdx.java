public class fdx<T extends bwv> extends fbs<T> implements fdp {
   private final fee a = this.l.b("hat_rim");

   public fdx(fee $$0) {
      super($$0);
   }

   public static fek c() {
      fem $$0 = fbs.a(fei.a, 0.0F);
      fen $$1 = $$0.a();
      $$1.a("head", new fej().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), feg.a);
      fen $$2 = $$1.a("hat", fej.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fei(0.5F)), feg.a);
      $$2.a("hat_rim", fej.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), feg.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fej.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fei(0.05F)), feg.a);
      $$1.a("right_arm", fej.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), feg.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fej.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), feg.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fej.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), feg.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fej.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), feg.a(2.0F, 12.0F, 0.0F));
      return fek.a($$0, 64, 64);
   }

   public static fek a(fei $$0) {
      fem $$1 = fbs.a($$0, 0.0F);
      fen $$2 = $$1.a();
      $$2.a("head", fej.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), feg.a);
      $$2.a("body", fej.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), feg.a);
      $$2.a("right_leg", fej.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), feg.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fej.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), feg.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fej.c(), feg.a);
      return fek.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      faf.a(this.o, this.n, $$0.fS(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
