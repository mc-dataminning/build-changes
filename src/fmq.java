public class fmq<T extends cdi> extends fkk<T> implements fmh {
   private final fmx a = this.l.b("hat_rim");

   public fmq(fmx $$0) {
      super($$0);
   }

   public static fnd c() {
      fnf $$0 = fkk.a(fnb.a, 0.0F);
      fng $$1 = $$0.a();
      $$1.a("head", new fnc().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fmz.a);
      fng $$2 = $$1.a("hat", fnc.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fnb(0.5F)), fmz.a);
      $$2.a("hat_rim", fnc.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fmz.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fnc.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fnb(0.05F)), fmz.a);
      $$1.a("right_arm", fnc.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmz.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fnc.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmz.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fnc.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmz.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fnc.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmz.a(2.0F, 12.0F, 0.0F));
      return fnd.a($$0, 64, 64);
   }

   public static fnd a(fnb $$0) {
      fnf $$1 = fkk.a($$0, 0.0F);
      fng $$2 = $$1.a();
      $$2.a("head", fnc.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fmz.a);
      $$2.a("body", fnc.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmz.a);
      $$2.a("right_leg", fnc.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmz.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fnc.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmz.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fnc.c(), fmz.a);
      return fnd.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fiw.a(this.o, this.n, $$0.fW(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
