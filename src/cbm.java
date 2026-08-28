public class cbm extends ccl {
   private final cgu g;

   public cbm(cgu $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gu() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(dfe $$0, jh $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dvj $$2 = $$0.a_($$1);
         if ($$2.a(dig.cv)) {
            return dst.a($$0, $$1) < 1;
         } else {
            return $$2.a(dig.cD) && $$2.c(dlk.b) ? true : $$2.a(axa.S, $$0x -> $$0x.d(dhx.b).map($$0xx -> $$0xx != dvw.a).orElse(true));
         }
      }
   }
}
