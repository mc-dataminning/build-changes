public abstract class chs extends bwb {
   private static final int cc = 100;
   private int cd;

   protected chs(bup<? extends chs> $$0, dff $$1) {
      super($$0, $$1);
   }

   public boolean b(arr $$0) {
      un $$1 = new un();
      $$1.a("id", this.bM());
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

   public boolean gL() {
      return this.cd > 100;
   }
}
