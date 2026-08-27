public abstract class cdq extends bsa {
   private static final int cb = 100;
   private int cc;

   protected cdq(bqr<? extends cdq> $$0, czu $$1) {
      super($$0, $$1);
   }

   public boolean b(aqf $$0) {
      ty $$1 = new ty();
      $$1.a("id", this.bA());
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
      this.cc++;
      super.l();
   }

   public boolean gy() {
      return this.cc > 100;
   }
}
