public abstract class cgb extends bul {
   private static final int ce = 100;
   private int cf;

   protected cgb(bsx<? extends cgb> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public boolean b(aqv $$0) {
      ub $$1 = new ub();
      $$1.a("id", this.bD());
      this.f($$1);
      if ($$0.h($$1)) {
         this.aq();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.cf++;
      super.l();
   }

   public boolean gz() {
      return this.cf > 100;
   }
}
