public class fmi<T extends cdc> extends fkc<T> implements flz {
   private final fmp a = this.l.b("hat_rim");

   public fmi(fmp $$0) {
      super($$0);
   }

   public static fmv c() {
      fmx $$0 = fkc.a(fmt.a, 0.0F);
      fmy $$1 = $$0.a();
      $$1.a("head", new fmu().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fmr.a);
      fmy $$2 = $$1.a("hat", fmu.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fmt(0.5F)), fmr.a);
      $$2.a("hat_rim", fmu.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fmr.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fmu.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fmt(0.05F)), fmr.a);
      $$1.a("right_arm", fmu.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmr.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fmu.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmr.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fmu.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmr.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fmu.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmr.a(2.0F, 12.0F, 0.0F));
      return fmv.a($$0, 64, 64);
   }

   public static fmv a(fmt $$0) {
      fmx $$1 = fkc.a($$0, 0.0F);
      fmy $$2 = $$1.a();
      $$2.a("head", fmu.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fmr.a);
      $$2.a("body", fmu.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmr.a);
      $$2.a("right_leg", fmu.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmr.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fmu.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmr.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fmu.c(), fmr.a);
      return fmv.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fio.a(this.o, this.n, $$0.fW(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
