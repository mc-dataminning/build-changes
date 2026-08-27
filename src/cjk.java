public class cjk extends cje {
   public cjk(bnw<?> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cjk(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.ap, $$0, $$1, $$2, $$3);
   }

   @Override
   public blw a(chl $$0, blv $$1) {
      if ($$0.fI()) {
         return blw.d;
      } else if (this.bP()) {
         return blw.d;
      } else if (!this.dM().B) {
         return $$0.m(this) ? blw.b : blw.d;
      } else {
         return blw.a;
      }
   }

   @Override
   protected coy ai_() {
      return cpg.nL;
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
   public cje.a w() {
      return cje.a.a;
   }
}
