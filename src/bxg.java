public abstract class bxg extends blt {
   private static final int bW = 100;
   private int bX;

   protected bxg(bkm<? extends bxg> $$0, crs $$1) {
      super($$0, $$1);
   }

   public boolean b(amb $$0) {
      rz $$1 = new rz();
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

   public boolean gn() {
      return this.bX > 100;
   }
}
