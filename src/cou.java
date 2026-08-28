public class cou extends coo {
   public cou(bsv<?> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cou(dbt $$0, double $$1, double $$2, double $$3) {
      super(bsv.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public bqp a(cms $$0, bqo $$1) {
      if ($$0.fR()) {
         return bqp.e;
      } else if (this.bS()) {
         return bqp.e;
      } else if (!this.dP().B) {
         return $$0.n(this) ? bqp.c : bqp.e;
      } else {
         return bqp.a;
      }
   }

   @Override
   protected cuf ah_() {
      return cun.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bS()) {
            this.bH();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bv();
         }
      }
   }

   @Override
   public coo.a v() {
      return coo.a.a;
   }
}
