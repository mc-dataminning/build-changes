public abstract class bvj extends bjw {
   private static final int bW = 100;
   private int bX;

   protected bvj(bip<? extends bvj> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public boolean b(ako $$0) {
      qu $$1 = new qu();
      $$1.a("id", this.bu());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ak();
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

   public boolean gj() {
      return this.bX > 100;
   }
}
