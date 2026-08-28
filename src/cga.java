public abstract class cga extends buk {
   private static final int cb = 100;
   private int cc;

   protected cga(bsy<? extends cga> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public boolean b(arf $$0) {
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
