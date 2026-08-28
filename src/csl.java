public class csl extends csb {
   public csl(bwr<? extends csl> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csl(djm $$0, bxj $$1, ffc $$2) {
      super(bwr.bi, $$1, $$2, $$0);
   }

   public csl(djm $$0, double $$1, double $$2, double $$3, ffc $$4) {
      super(bwr.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fez $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bwi var7 = $$0.a();
         bwi $$4 = this.q();
         int $$5 = var7.aE();
         var7.e(5.0F);
         bux $$6 = this.dV().a((csb)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dgc.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fey $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         bwi $$3 = this.q();
         if (!($$3 instanceof bxl) || $$1.O().c(dji.d)) {
            iv $$4 = $$0.b().a($$0.c());
            if (this.dU().v($$4)) {
               this.dU().b($$4, dme.a(this.dU(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(ffa $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.aq();
      }
   }
}
