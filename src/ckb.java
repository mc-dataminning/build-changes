public abstract class ckb extends byf {
   private static final int bK = 100;
   private int bL;

   protected ckb(bwr<? extends ckb> $$0, djm $$1) {
      super($$0, $$1);
   }

   public boolean b(arr $$0) {
      tz $$1 = new tz();
      $$1.a("id", this.bH());
      this.f($$1);
      if ($$0.h($$1)) {
         this.aq();
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

   public boolean gJ() {
      return this.bL > 100;
   }
}
