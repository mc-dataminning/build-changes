public class btd extends cgb {
   private static final ajv<Integer> ce = ajz.a(btd.class, ajx.b);

   public btd(bsw<? extends btd> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected lk s() {
      return lm.aP;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
   }

   @Override
   protected avn t() {
      return avo.kJ;
   }

   @Override
   protected avn v() {
      return avo.kG;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.kI;
   }

   @Override
   protected avn n_() {
      return avo.kH;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void m_() {
      super.m_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dQ().a(lm.aQ, this.d(0.6), this.dy(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.ao.a(ce, $$0);
   }

   public int x() {
      return this.ao.a(ce);
   }

   public static boolean a(bsw<? extends btl> $$0, ddj $$1, btp $$2, jd $$3, ayv $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dfy.G);
   }
}
