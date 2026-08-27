public abstract class bvq extends bkd {
   private static final int bW = 100;
   private int bX;

   protected bvq(biw<? extends bvq> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public boolean b(akt $$0) {
      qy $$1 = new qy();
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

   public boolean gm() {
      return this.bX > 100;
   }
}
