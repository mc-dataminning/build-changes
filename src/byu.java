public abstract class byu extends bnf {
   private static final int bW = 100;
   private int bX;

   protected byu(bly<? extends byu> $$0, cto $$1) {
      super($$0, $$1);
   }

   public boolean b(ane $$0) {
      sn $$1 = new sn();
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
