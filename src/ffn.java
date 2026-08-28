public class ffn extends hct {
   private final fpt a;
   private final ffn.a b;
   private fkt c = fkt.a;

   public ffn(fev $$0, fpt $$1) {
      super(fhs.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ffn(xd $$0, fpt $$1) {
      super(fhs.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ffn(xd $$0, xd $$1, fpt $$2) {
      super(fhs.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static ffn.a a(fev $$0) {
      fdm $$1 = $$0.a;
      return a(xd.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static ffn.a a(xd $$0) {
      return a(xd.c("mco.errorMessage.generic"), $$0);
   }

   private static ffn.a a(xd $$0, xd $$1) {
      return new ffn.a($$0, $$1);
   }

   @Override
   public void aT_() {
      this.c(fka.a(xc.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fkt.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xd i() {
      return xd.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xd a, xd b) {
   }
}
