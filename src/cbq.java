public class cbq extends ccp {
   private final cgy g;

   public cbq(cgy $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gv() && super.b();
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
   protected boolean a(dfi $$0, jh $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dvo $$2 = $$0.a_($$1);
         if ($$2.a(dil.cv)) {
            return dsy.a($$0, $$1) < 1;
         } else {
            return $$2.a(dil.cD) && $$2.c(dlp.b) ? true : $$2.a(axd.S, $$0x -> $$0x.d(dic.b).map($$0xx -> $$0xx != dwb.a).orElse(true));
         }
      }
   }
}
