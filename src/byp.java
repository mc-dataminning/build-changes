public abstract class byp extends bna {
   private static final int bW = 100;
   private int bX;

   protected byp(blt<? extends byp> $$0, cti $$1) {
      super($$0, $$1);
   }

   public boolean b(ana $$0) {
      sl $$1 = new sl();
      $$1.a("id", this.bw());
      this.f($$1);
      if ($$0.h($$1)) {
         this.am();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.bX++;
      super.l();
   }

   public boolean gn() {
      return this.bX > 100;
   }
}
