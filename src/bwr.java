public abstract class bwr extends ble {
   private static final int bW = 100;
   private int bX;

   protected bwr(bjx<? extends bwr> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public boolean b(alr $$0) {
      rt $$1 = new rt();
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
