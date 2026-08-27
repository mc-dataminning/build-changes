public abstract class bsi extends bgv {
   private static final int bW = 100;
   private int bX;

   protected bsi(bfn<? extends bsi> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public boolean b(aig $$0) {
      qr $$1 = new qr();
      $$1.a("id", this.br());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ai();
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

   public boolean gh() {
      return this.bX > 100;
   }
}
