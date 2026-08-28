public class fcs extends gvg {
   private final fnd a;
   private final fcs.a b;
   private fhx c = fhx.a;

   public fcs(fcb $$0, fnd $$1) {
      super(fex.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcs(xp $$0, fnd $$1) {
      super(fex.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcs(xp $$0, xp $$1, fnd $$2) {
      super(fex.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fcs.a a(fcb $$0) {
      faq $$1 = $$0.a;
      return a(xp.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fcs.a a(xp $$0) {
      return a(xp.c("mco.errorMessage.generic"), $$0);
   }

   private static fcs.a a(xp $$0, xp $$1) {
      return new fcs.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(fhe.a(xo.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fhx.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xp i() {
      return xp.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xp a, xp b) {
   }
}
