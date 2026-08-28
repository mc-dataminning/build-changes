public class fou extends hro {
   private final gaf a;
   private final fou.a b;
   private fvg c = fvg.a;

   public fou(fob $$0, gaf $$1) {
      super(fqw.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fou(xc $$0, gaf $$1) {
      super(fqw.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fou(xc $$0, xc $$1, gaf $$2) {
      super(fqw.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fou.a a(fob $$0) {
      fmh $$1 = $$0.a;
      return a(xc.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fou.a a(xc $$0) {
      return a(xc.c("mco.errorMessage.generic"), $$0);
   }

   private static fou.a a(xc $$0, xc $$1) {
      return new fou.a($$0, $$1);
   }

   @Override
   public void aS_() {
      this.c(fun.a(xb.h, $$0 -> this.aP_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fvg.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aP_() {
      this.m.a(this.a);
   }

   @Override
   public xc i() {
      return xc.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xc a, xc b) {
   }
}
