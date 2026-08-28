public class fcr extends gvf {
   private final fnc a;
   private final fcr.a b;
   private fhw c = fhw.a;

   public fcr(fca $$0, fnc $$1) {
      super(few.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcr(xo $$0, fnc $$1) {
      super(few.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcr(xo $$0, xo $$1, fnc $$2) {
      super(few.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fcr.a a(fca $$0) {
      fap $$1 = $$0.a;
      return a(xo.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fcr.a a(xo $$0) {
      return a(xo.c("mco.errorMessage.generic"), $$0);
   }

   private static fcr.a a(xo $$0, xo $$1) {
      return new fcr.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(fhd.a(xn.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fhw.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xo i() {
      return xo.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xo a, xo b) {
   }
}
