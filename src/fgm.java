public class fgm extends hee {
   private final fqs a;
   private final fgm.a b;
   private fls c = fls.a;

   public fgm(ffu $$0, fqs $$1) {
      super(fir.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fgm(xh $$0, fqs $$1) {
      super(fir.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fgm(xh $$0, xh $$1, fqs $$2) {
      super(fir.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fgm.a a(ffu $$0) {
      fel $$1 = $$0.a;
      return a(xh.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fgm.a a(xh $$0) {
      return a(xh.c("mco.errorMessage.generic"), $$0);
   }

   private static fgm.a a(xh $$0, xh $$1) {
      return new fgm.a($$0, $$1);
   }

   @Override
   public void aS_() {
      this.c(fkz.a(xg.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fls.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xh i() {
      return xh.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xh a, xh b) {
   }
}
