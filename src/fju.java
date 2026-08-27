public class fju<T extends cbt> extends fhp<T> implements fjm {
   private final fkb a = this.l.b("hat_rim");

   public fju(fkb $$0) {
      super($$0);
   }

   public static fkh c() {
      fkj $$0 = fhp.a(fkf.a, 0.0F);
      fkk $$1 = $$0.a();
      $$1.a("head", new fkg().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fkd.a);
      fkk $$2 = $$1.a("hat", fkg.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fkf(0.5F)), fkd.a);
      $$2.a("hat_rim", fkg.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fkd.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fkg.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fkf(0.05F)), fkd.a);
      $$1.a("right_arm", fkg.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkd.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fkg.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkd.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fkg.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkd.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fkg.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkd.a(2.0F, 12.0F, 0.0F));
      return fkh.a($$0, 64, 64);
   }

   public static fkh a(fkf $$0) {
      fkj $$1 = fhp.a($$0, 0.0F);
      fkk $$2 = $$1.a();
      $$2.a("head", fkg.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fkd.a);
      $$2.a("body", fkg.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fkd.a);
      $$2.a("right_leg", fkg.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fkd.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fkg.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fkd.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fkg.c(), fkd.a);
      return fkh.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fgc.a(this.o, this.n, $$0.fW(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
