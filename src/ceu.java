public class ceu extends ceo {
   public ceu(bjx<?> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public ceu(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bib a(ccx $$0, bia $$1) {
      if ($$0.fI()) {
         return bib.d;
      } else if (this.bO()) {
         return bib.d;
      } else if (!this.dL().B) {
         return $$0.n(this) ? bib.b : bib.d;
      } else {
         return bib.a;
      }
   }

   @Override
   protected cke ag_() {
      return ckm.na;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bO()) {
            this.bA();
         }

         if (this.N() == 0) {
            this.m(-this.O());
            this.d(10);
            this.b(50.0F);
            this.bo();
         }
      }
   }

   @Override
   public ceo.a v() {
      return ceo.a.a;
   }
}
