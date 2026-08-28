public class cav extends cbu {
   private final cgd g;

   public cav(cgd $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gp() && super.b();
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
   protected boolean a(dej $$0, je $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         duo $$2 = $$0.a_($$1);
         if ($$2.a(dhl.cv)) {
            return drz.a($$0, $$1) < 1;
         } else {
            return $$2.a(dhl.cD) && $$2.c(dkq.b) ? true : $$2.a(awt.S, $$0x -> $$0x.d(dhc.b).map($$0xx -> $$0xx != dvb.a).orElse(true));
         }
      }
   }
}
