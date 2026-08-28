public class fhn extends hff {
   private final frp a;
   private final fhn.a b;
   private fmp c = fmp.a;

   public fhn(fgv $$0, frp $$1) {
      super(fjo.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fhn(xl $$0, frp $$1) {
      super(fjo.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fhn(xl $$0, xl $$1, frp $$2) {
      super(fjo.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fhn.a a(fgv $$0) {
      ffc $$1 = $$0.a;
      return a(xl.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fhn.a a(xl $$0) {
      return a(xl.c("mco.errorMessage.generic"), $$0);
   }

   private static fhn.a a(xl $$0, xl $$1) {
      return new fhn.a($$0, $$1);
   }

   @Override
   public void aS_() {
      this.c(flw.a(xk.h, $$0 -> this.aP_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fmp.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aP_() {
      this.m.a(this.a);
   }

   @Override
   public xl i() {
      return xl.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xl a, xl b) {
   }
}
