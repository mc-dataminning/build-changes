public abstract class cfp extends btz {
   private static final int cd = 100;
   private int ce;

   protected cfp(bsn<? extends cfp> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public boolean b(aqn $$0) {
      tx $$1 = new tx();
      $$1.a("id", this.bE());
      this.f($$1);
      if ($$0.h($$1)) {
         this.aq();
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
