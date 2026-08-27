public abstract class cdf extends brp {
   private static final int ca = 100;
   private int cb;

   protected cdf(bqg<? extends cdf> $$0, czg $$1) {
      super($$0, $$1);
   }

   public boolean b(apv $$0) {
      to $$1 = new to();
      $$1.a("id", this.bz());
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
      this.cb++;
      super.l();
   }

   public boolean gw() {
      return this.cb > 100;
   }
}
