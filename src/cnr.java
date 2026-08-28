public class cnr extends cnh {
   public cnr(bsw<? extends cnr> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnr(dcu $$0, btl $$1, eww $$2) {
      super(bsw.aQ, $$1, $$2, $$0);
   }

   public cnr(dcu $$0, double $$1, double $$2, double $$3, eww $$4) {
      super(bsw.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqt $$1) {
         bsq var7 = $$0.a();
         bsq $$4 = this.s();
         int $$5 = var7.aC();
         var7.d(5.0F);
         brj $$6 = this.dR().a((cnh)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            dac.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         bsq $$1 = this.s();
         if (!($$1 instanceof btn) || this.dQ().ab().b(dcq.c)) {
            jd $$2 = $$0.a().a($$0.b());
            if (this.dQ().u($$2)) {
               this.dQ().b($$2, dfj.a(this.dQ(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.aq();
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      return false;
   }
}
