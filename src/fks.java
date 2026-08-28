public class fks extends hne {
   private final fwf a;
   private final fks.a b;
   private frg c = frg.a;

   public fks(fka $$0, fwf $$1) {
      super(fmu.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fks(wv $$0, fwf $$1) {
      super(fmu.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fks(wv $$0, wv $$1, fwf $$2) {
      super(fmu.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fks.a a(fka $$0) {
      fig $$1 = $$0.a;
      return a(wv.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fks.a a(wv $$0) {
      return a(wv.c("mco.errorMessage.generic"), $$0);
   }

   private static fks.a a(wv $$0, wv $$1) {
      return new fks.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.c(fqn.a(wu.h, $$0 -> this.aK_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = frg.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aK_() {
      this.m.a(this.a);
   }

   @Override
   public wv i() {
      return wv.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wv a, wv b) {
   }
}
