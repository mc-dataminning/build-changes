public class fcq extends gve {
   private final fnb a;
   private final fcq.a b;
   private fhv c = fhv.a;

   public fcq(fbz $$0, fnb $$1) {
      super(fev.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcq(xo $$0, fnb $$1) {
      super(fev.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fcq(xo $$0, xo $$1, fnb $$2) {
      super(fev.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fcq.a a(fbz $$0) {
      fao $$1 = $$0.a;
      return a(xo.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fcq.a a(xo $$0) {
      return a(xo.c("mco.errorMessage.generic"), $$0);
   }

   private static fcq.a a(xo $$0, xo $$1) {
      return new fcq.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(fhc.a(xn.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fhv.a(this.p, this.b.b, this.n * 3 / 4);
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
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xo a, xo b) {
   }
}
