public abstract class cfz extends buj {
   private static final int ce = 100;
   private int cf;

   protected cfz(bsw<? extends cfz> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public boolean b(aqu $$0) {
      ua $$1 = new ua();
      $$1.a("id", this.bD());
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
      this.cf++;
      super.l();
   }

   public boolean gA() {
      return this.cf > 100;
   }
}
