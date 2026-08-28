public abstract class cfx extends buh {
   private static final int cb = 100;
   private int cc;

   protected cfx(bsv<? extends cfx> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public boolean b(arc $$0) {
      ur $$1 = new ur();
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
      this.cc++;
      super.l();
   }

   public boolean gz() {
      return this.cc > 100;
   }
}
