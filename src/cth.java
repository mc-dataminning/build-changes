public class cth extends csx {
   public cth(bxn<? extends cth> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public cth(dkj $$0, byf $$1, fgc $$2) {
      super(bxn.bj, $$1, $$2, $$0);
   }

   public cth(dkj $$0, double $$1, double $$2, double $$3, fgc $$4) {
      super(bxn.bj, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ffz $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         bxe var7 = $$0.a();
         bxe $$4 = this.q();
         int $$5 = var7.aE();
         var7.e(5.0F);
         bvt $$6 = this.dW().a((csx)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dgz.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ffy $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         bxe $$3 = this.q();
         if (!($$3 instanceof byh) || $$1.O().c(dkf.d)) {
            iw $$4 = $$0.b().a($$0.c());
            if (this.dV().v($$4)) {
               this.dV().b($$4, dnb.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.aq();
      }
   }
}
