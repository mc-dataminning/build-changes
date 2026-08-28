public class fgu extends hep {
   private final fra a;
   private final fgu.a b;
   private fma c = fma.a;

   public fgu(fgc $$0, fra $$1) {
      super(fiz.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fgu(xi $$0, fra $$1) {
      super(fiz.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fgu(xi $$0, xi $$1, fra $$2) {
      super(fiz.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fgu.a a(fgc $$0) {
      fet $$1 = $$0.a;
      return a(xi.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fgu.a a(xi $$0) {
      return a(xi.c("mco.errorMessage.generic"), $$0);
   }

   private static fgu.a a(xi $$0, xi $$1) {
      return new fgu.a($$0, $$1);
   }

   @Override
   public void aR_() {
      this.c(flh.a(xh.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fma.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xi i() {
      return xi.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xi a, xi b) {
   }
}
