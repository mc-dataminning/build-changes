public class fjp extends hhp {
   private final ftr a;
   private final fjp.a b;
   private fos c = fos.a;

   public fjp(fix $$0, ftr $$1) {
      super(flq.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fjp(xv $$0, ftr $$1) {
      super(flq.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fjp(xv $$0, xv $$1, ftr $$2) {
      super(flq.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fjp.a a(fix $$0) {
      fhd $$1 = $$0.a;
      return a(xv.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fjp.a a(xv $$0) {
      return a(xv.c("mco.errorMessage.generic"), $$0);
   }

   private static fjp.a a(xv $$0, xv $$1) {
      return new fjp.a($$0, $$1);
   }

   @Override
   public void aT_() {
      this.c(fny.a(xu.h, $$0 -> this.aP_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fos.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aP_() {
      this.m.a(this.a);
   }

   @Override
   public xv i() {
      return xv.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xv a, xv b) {
   }
}
