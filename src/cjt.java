public abstract class cjt extends bxy {
   private static final int bJ = 100;
   private int bK;

   protected cjt(bwm<? extends cjt> $$0, div $$1) {
      super($$0, $$1);
   }

   public boolean b(arr $$0) {
      tz $$1 = new tz();
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
      this.bK++;
      super.h();
   }

   public boolean gG() {
      return this.bK > 100;
   }
}
