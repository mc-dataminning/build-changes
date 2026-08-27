public abstract class bvu extends bkh {
   private static final int bW = 100;
   private int bX;

   protected bvu(bja<? extends bvu> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public boolean b(aku $$0) {
      qw $$1 = new qw();
      $$1.a("id", this.bu());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ak();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.bX++;
      super.l();
   }

   public boolean gn() {
      return this.bX > 100;
   }
}
