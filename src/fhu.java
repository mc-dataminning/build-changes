public class fhu extends hfq {
   private final frw a;
   private final fhu.a b;
   private fmw c = fmw.a;

   public fhu(fhc $$0, frw $$1) {
      super(fjv.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fhu(xj $$0, frw $$1) {
      super(fjv.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fhu(xj $$0, xj $$1, frw $$2) {
      super(fjv.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fhu.a a(fhc $$0) {
      ffj $$1 = $$0.a;
      return a(xj.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fhu.a a(xj $$0) {
      return a(xj.c("mco.errorMessage.generic"), $$0);
   }

   private static fhu.a a(xj $$0, xj $$1) {
      return new fhu.a($$0, $$1);
   }

   @Override
   public void aR_() {
      this.c(fmd.a(xi.h, $$0 -> this.aO_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fmw.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   @Override
   public xj i() {
      return xj.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xj a, xj b) {
   }
}
