public abstract class bvf extends bjs {
   private static final int bW = 100;
   private int bX;

   protected bvf(bik<? extends bvf> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public boolean b(akj $$0) {
      qs $$1 = new qs();
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

   public boolean gi() {
      return this.bX > 100;
   }
}
