public abstract class bvh extends bju {
   private static final int bW = 100;
   private int bX;

   protected bvh(bim<? extends bvh> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public boolean b(akl $$0) {
      qr $$1 = new qr();
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
