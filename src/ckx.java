public abstract class ckx extends bzb {
   private static final int bM = 100;
   private int bN;

   protected ckx(bxn<? extends ckx> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public boolean b(asc $$0) {
      ua $$1 = new ua();
      $$1.a("id", this.bI());
      this.h($$1);
      if ($$0.j($$1)) {
         this.aq();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void h() {
      this.bN++;
      super.h();
   }

   public boolean gK() {
      return this.bN > 100;
   }
}
