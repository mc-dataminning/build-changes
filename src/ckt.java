public class ckt extends ckn {
   public ckt(bpc<?> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public ckt(cwz $$0, double $$1, double $$2, double $$3) {
      super(bpc.aq, $$0, $$1, $$2, $$3);
   }

   @Override
   public bnc a(cis $$0, bnb $$1) {
      if ($$0.fO()) {
         return bnc.d;
      } else if (this.bP()) {
         return bnc.d;
      } else if (!this.dM().B) {
         return $$0.n(this) ? bnc.b : bnc.d;
      } else {
         return bnc.a;
      }
   }

   @Override
   protected cqf ah_() {
      return cqn.nL;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bP()) {
            this.bE();
         }

         if (this.N() == 0) {
            this.n(-this.O());
            this.d(10);
            this.b(50.0F);
            this.bt();
         }
      }
   }

   @Override
   public ckn.a v() {
      return ckn.a.a;
   }
}
