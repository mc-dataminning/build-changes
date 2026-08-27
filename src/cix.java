public class cix extends cjd {
   public cix(bsb<? extends cix> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 100.0).a(btv.r, 0.5).a(btv.c, 20.0).a(btv.d, 50.0);
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return $$1.w($$0);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.cb.a(2, new cba<>(this, 1.0, false));
      this.cb.a(7, new cay(this, 1.0));
      this.cc.a(1, new cbd(this).a(cjz.class));
      this.cc.a(2, new cbe<>(this, cly.class, true));
      this.cc.a(3, new cbe<>(this, clg.class, false));
      this.cc.a(3, new cbe<>(this, ceq.class, true));
      this.cc.a(5, new cbe<>(this, cff.class, 10, true, false, cff.ch));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(8, new cag(this));
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dU().d_(this.du()).b();
         if (this.fg().d() && this.bV() && this.al.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }
}
