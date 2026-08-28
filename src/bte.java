public class bte extends cgd {
   private static final ajw<Integer> ce = aka.a(bte.class, ajy.b);

   public bte(bsx<? extends bte> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected lk s() {
      return lm.aP;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
   }

   @Override
   protected avo t() {
      return avp.kJ;
   }

   @Override
   protected avo v() {
      return avp.kG;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.kI;
   }

   @Override
   protected avo n_() {
      return avp.kH;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(ub $$0) {
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

      this.dO().a(lm.aQ, this.d(0.6), this.dw(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
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

   public static boolean a(bsx<? extends btn> $$0, ddl $$1, btr $$2, jd $$3, ayw $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dga.G);
   }
}
