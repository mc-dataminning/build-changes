public abstract class cgb extends bul {
   private static final int cg = 100;
   private int ch;

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
      this.ch++;
      super.l();
   }

   public boolean gy() {
      return this.ch > 100;
   }
}
