public class fct extends gvh {
   private final fne a;
   private final fct.a b;
   private fhy c = fhy.a;

   public fct(fcc $$0, fne $$1) {
      super(fey.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fct(xp $$0, fne $$1) {
      super(fey.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fct(xp $$0, xp $$1, fne $$2) {
      super(fey.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fct.a a(fcc $$0) {
      far $$1 = $$0.a;
      return a(xp.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fct.a a(xp $$0) {
      return a(xp.c("mco.errorMessage.generic"), $$0);
   }

   private static fct.a a(xp $$0, xp $$1) {
      return new fct.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(fhf.a(xo.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fhy.a(this.p, this.b.b, this.n * 3 / 4);
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xp a, xp b) {
   }
}
