public class evx extends gob {
   private final fgh a;
   private final evx.a b;
   private fbd c = fbd.a;

   public evx(evg $$0, fgh $$1) {
      super(eyc.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public evx(vs $$0, fgh $$1) {
      super(eyc.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public evx(vs $$0, vs $$1, fgh $$2) {
      super(eyc.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static evx.a a(evg $$0) {
      etv $$1 = $$0.a;
      return a(vs.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static evx.a a(vs $$0) {
      return a(vs.c("mco.errorMessage.generic"), $$0);
   }

   private static evx.a a(vs $$0, vs $$1) {
      return new evx.a($$0, $$1);
   }

   @Override
   public void aP_() {
      this.c(fak.a(vr.h, $$0 -> this.d()).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = fbd.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public void d() {
      this.f.a(this.a);
   }

   @Override
   public vs i() {
      return vs.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vs a, vs b) {
   }
}
