public abstract class bxt extends bmg {
   private static final int bW = 100;
   private int bX;

   protected bxt(bkz<? extends bxt> $$0, csf $$1) {
      super($$0, $$1);
   }

   public boolean b(amj $$0) {
      sd $$1 = new sd();
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

   public boolean go() {
      return this.bX > 100;
   }
}
