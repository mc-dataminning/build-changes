public abstract class cgd extends bun {
   private static final int cb = 100;
   private int cc;

   protected cgd(btb<? extends cgd> $$0, dbz $$1) {
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
