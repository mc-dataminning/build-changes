public class cng extends cmw {
   public cng(bsm<? extends cng> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cng(dcf $$0, btb $$1, ewf $$2) {
      super(bsm.aQ, $$1, $$2, $$0);
   }

   public cng(dcf $$0, double $$1, double $$2, double $$3, ewf $$4) {
      super(bsm.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqm $$1) {
         bsg var7 = $$0.a();
         bsg $$4 = this.s();
         int $$5 = var7.aC();
         var7.d(5.0F);
         bqz $$6 = this.dR().a((cmw)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            czn.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ewb $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         bsg $$1 = this.s();
         if (!($$1 instanceof btd) || this.dQ().ab().b(dcb.c)) {
            ja $$2 = $$0.a().a($$0.b());
            if (this.dQ().u($$2)) {
               this.dQ().b($$2, deu.a(this.dQ(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.ap();
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      return false;
   }
}
