public class cjg extends cja {
   public cjg(bnu<?> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cjg(cvn $$0, double $$1, double $$2, double $$3) {
      super(bnu.ap, $$0, $$1, $$2, $$3);
   }

   @Override
   public blu a(chh $$0, blt $$1) {
      if ($$0.fI()) {
         return blu.d;
      } else if (this.bP()) {
         return blu.d;
      } else if (!this.dM().B) {
         return $$0.m(this) ? blu.b : blu.d;
      } else {
         return blu.a;
      }
   }

   @Override
   protected cou ai_() {
      return cpc.nL;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bP()) {
            this.bB();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bq();
         }
      }
   }

   @Override
   public cja.a w() {
      return cja.a.a;
   }
}
