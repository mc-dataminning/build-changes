public abstract class bxo extends bmb {
   private static final int bW = 100;
   private int bX;

   protected bxo(bku<? extends bxo> $$0, csa $$1) {
      super($$0, $$1);
   }

   public boolean b(amf $$0) {
      rz $$1 = new rz();
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
