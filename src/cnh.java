public class cnh extends cmx {
   public cnh(bsn<? extends cnh> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnh(dcg $$0, btc $$1, ewh $$2) {
      super(bsn.aQ, $$1, $$2, $$0);
   }

   public cnh(dcg $$0, double $$1, double $$2, double $$3, ewh $$4) {
      super(bsn.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      if (this.dR() instanceof aqm $$1) {
         bsh var7 = $$0.a();
         bsh $$4 = this.s();
         int $$5 = var7.aD();
         var7.d(5.0F);
         bra $$6 = this.dS().a((cmx)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            czo.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dR().B) {
         bsh $$1 = this.s();
         if (!($$1 instanceof bte) || this.dR().ab().b(dcc.c)) {
            ja $$2 = $$0.a().a($$0.b());
            if (this.dR().u($$2)) {
               this.dR().b($$2, dev.a(this.dR(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.aq();
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return false;
   }
}
