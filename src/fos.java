public class fos extends hrm {
   private final gad a;
   private final fos.a b;
   private fve c = fve.a;

   public fos(fnz $$0, gad $$1) {
      super(fqu.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fos(xa $$0, gad $$1) {
      super(fqu.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fos(xa $$0, xa $$1, gad $$2) {
      super(fqu.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fos.a a(fnz $$0) {
      fmf $$1 = $$0.a;
      return a(xa.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fos.a a(xa $$0) {
      return a(xa.c("mco.errorMessage.generic"), $$0);
   }

   private static fos.a a(xa $$0, xa $$1) {
      return new fos.a($$0, $$1);
   }

   @Override
   public void aS_() {
      this.c(ful.a(wz.h, $$0 -> this.aP_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fve.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aP_() {
      this.m.a(this.a);
   }

   @Override
   public xa i() {
      return xa.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xa a, xa b) {
   }
}
