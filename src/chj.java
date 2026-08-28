public abstract class chj extends bvs {
   private static final int cc = 100;
   private int cd;

   protected chj(bug<? extends chj> $$0, dev $$1) {
      super($$0, $$1);
   }

   public boolean b(arn $$0) {
      uj $$1 = new uj();
      $$1.a("id", this.bL());
      this.f($$1);
      if ($$0.h($$1)) {
         this.au();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.cd++;
      super.l();
   }

   public boolean gL() {
      return this.cd > 100;
   }
}
