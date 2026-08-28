public class csi extends cry {
   public csi(bwr<? extends csi> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csi(djh $$0, bxj $$1, fex $$2) {
      super(bwr.bi, $$1, $$2, $$0);
   }

   public csi(djh $$0, double $$1, double $$2, double $$3, fex $$4) {
      super(bwr.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(feu $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bwi var7 = $$0.a();
         bwi $$4 = this.q();
         int $$5 = var7.aE();
         var7.e(5.0F);
         bux $$6 = this.dV().a((cry)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dfz.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fet $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bwi $$3 = this.q();
         if (!($$3 instanceof bxl) || $$1.O().c(djd.d)) {
            iv $$4 = $$0.b().a($$0.c());
            if (this.dU().v($$4)) {
               this.dU().b($$4, dlz.a(this.dU(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.aq();
      }
   }
}
