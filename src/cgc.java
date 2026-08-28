public abstract class cgc extends bum {
   private static final int cb = 100;
   private int cc;

   protected cgc(bta<? extends cgc> $$0, dby $$1) {
      super($$0, $$1);
   }

   public boolean b(arg $$0) {
      us $$1 = new us();
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
