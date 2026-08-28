public class fcn extends gvb {
   private final fmy a;
   private final fcn.a b;
   private fhs c = fhs.a;

   public fcn(fbw $$0, fmy $$1) {
      super(fes.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcn(xl $$0, fmy $$1) {
      super(fes.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcn(xl $$0, xl $$1, fmy $$2) {
      super(fes.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fcn.a a(fbw $$0) {
      fal $$1 = $$0.a;
      return a(xl.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fcn.a a(xl $$0) {
      return a(xl.c("mco.errorMessage.generic"), $$0);
   }

   private static fcn.a a(xl $$0, xl $$1) {
      return new fcn.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.c(fgz.a(xk.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fhs.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xl i() {
      return xl.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xl a, xl b) {
   }
}
