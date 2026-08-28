public abstract class cho extends bvx {
   private static final int cc = 100;
   private int cd;

   protected cho(bul<? extends cho> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public boolean b(aro $$0) {
      uk $$1 = new uk();
      $$1.a("id", this.bL());
      this.f($$1);
      if ($$0.h($$1)) {
         this.av();
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

   public boolean gK() {
      return this.cd > 100;
   }
}
