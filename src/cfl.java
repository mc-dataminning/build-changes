public abstract class cfl extends btv {
   private static final int cd = 100;
   private int ce;

   protected cfl(bsj<? extends cfl> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public boolean b(aql $$0) {
      tx $$1 = new tx();
      $$1.a("id", this.bC());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ao();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.ce++;
      super.l();
   }

   public boolean gw() {
      return this.ce > 100;
   }
}
