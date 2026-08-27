public abstract class cem extends bsw {
   private static final int cb = 100;
   private int cc;

   protected cem(brn<? extends cem> $$0, dad $$1) {
      super($$0, $$1);
   }

   public boolean b(aqi $$0) {
      ua $$1 = new ua();
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
