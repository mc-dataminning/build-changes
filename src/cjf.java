public abstract class cjf extends bxn {
   private static final int bI = 100;
   private int bJ;

   protected cjf(bwb<? extends cjf> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public boolean b(aro $$0) {
      tw $$1 = new tw();
      $$1.a("id", this.bJ());
      this.f($$1);
      if ($$0.h($$1)) {
         this.at();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void h() {
      this.bJ++;
      super.h();
   }

   public boolean gG() {
      return this.bJ > 100;
   }
}
