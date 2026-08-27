public abstract class caq extends bpa {
   private static final int bW = 100;
   private int bX;

   protected caq(bnu<? extends caq> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public boolean b(aow $$0) {
      sw $$1 = new sw();
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

   public boolean gp() {
      return this.bX > 100;
   }
}
