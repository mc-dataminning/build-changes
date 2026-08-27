public abstract class cfg extends bsw {
   protected cfg(bsb<? extends cfg> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this);
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public int er() {
      return 1 + this.dU().A.a(3);
   }

   protected void b(int $$0) {
      if (this.bI() && !this.bl()) {
         this.k($$0 - 1);
         if (this.cq() == -20) {
            this.k(0);
            this.a(this.dX().i(), 2.0F);
         }
      } else {
         this.k(300);
      }
   }

   @Override
   public void au() {
      int $$0 = this.cq();
      super.au();
      this.b($$0);
   }

   @Override
   public boolean cH() {
      return false;
   }

   @Override
   public boolean a(cly $$0) {
      return false;
   }

   public static boolean c(bsb<? extends cfg> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(awj.a) && $$1.a_($$3.c()).a(dfe.al);
   }
}
