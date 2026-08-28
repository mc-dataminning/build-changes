public abstract class cfo extends bty {
   private static final int cd = 100;
   private int ce;

   protected cfo(bsm<? extends cfo> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public boolean b(aqn $$0) {
      tx $$1 = new tx();
      $$1.a("id", this.bD());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ap();
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

   public boolean gx() {
      return this.ce > 100;
   }
}
