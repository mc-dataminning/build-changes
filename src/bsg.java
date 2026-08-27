public class bsg extends cfd {
   private static final ajy<Integer> cl = akc.a(bsg.class, aka.b);

   public bsg(bsb<? extends bsg> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected kz r() {
      return lb.aQ;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cl, 0);
   }

   @Override
   protected avn t() {
      return avo.kW;
   }

   @Override
   protected avn u() {
      return avo.kT;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.kV;
   }

   @Override
   protected avn n_() {
      return avo.kU;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(uk $$0) {
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

      this.dU().a(lb.aR, this.d(0.6), this.dC(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.as.a(cl, $$0);
   }

   public int x() {
      return this.as.a(cl);
   }

   public static boolean a(bsb<? extends bso> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dfe.al);
   }
}
