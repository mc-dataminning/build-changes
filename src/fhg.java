public class fhg<T extends bzu> extends ffb<T> implements fgy {
   private final fhn a = this.l.b("hat_rim");

   public fhg(fhn $$0) {
      super($$0);
   }

   public static fht c() {
      fhv $$0 = ffb.a(fhr.a, 0.0F);
      fhw $$1 = $$0.a();
      $$1.a("head", new fhs().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fhp.a);
      fhw $$2 = $$1.a("hat", fhs.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fhr(0.5F)), fhp.a);
      $$2.a("hat_rim", fhs.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fhp.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fhs.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fhr(0.05F)), fhp.a);
      $$1.a("right_arm", fhs.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhp.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fhs.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhp.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fhs.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhp.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fhs.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhp.a(2.0F, 12.0F, 0.0F));
      return fht.a($$0, 64, 64);
   }

   public static fht a(fhr $$0) {
      fhv $$1 = ffb.a($$0, 0.0F);
      fhw $$2 = $$1.a();
      $$2.a("head", fhs.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fhp.a);
      $$2.a("body", fhs.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhp.a);
      $$2.a("right_leg", fhs.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhp.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fhs.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhp.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fhs.c(), fhp.a);
      return fht.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fdo.a(this.o, this.n, $$0.fS(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
