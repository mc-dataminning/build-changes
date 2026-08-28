public abstract class cjx extends bya {
   private static final int bK = 100;
   private int bL;

   protected cjx(bwo<? extends cjx> $$0, dja $$1) {
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
      this.bL++;
      super.h();
   }

   public boolean gH() {
      return this.bL > 100;
   }
}
