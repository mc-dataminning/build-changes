public abstract class byz extends bnj {
   private static final int bX = 100;
   private int bY;

   protected byz(bmc<? extends byz> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public boolean b(anf $$0) {
      so $$1 = new so();
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
      this.bY++;
      super.l();
   }

   public boolean go() {
      return this.bY > 100;
   }
}
