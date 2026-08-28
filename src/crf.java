public class crf extends cqv {
   public crf(bwb<? extends crf> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public crf(dhp $$0, bwr $$1, fcu $$2) {
      super(bwb.bh, $$1, $$2, $$0);
   }

   public crf(dhp $$0, double $$1, double $$2, double $$3, fcu $$4) {
      super(bwb.bh, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fcr $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         bvs var7 = $$0.a();
         bvs $$4 = this.q();
         int $$5 = var7.aG();
         var7.e(5.0F);
         buh $$6 = this.dW().a((cqv)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dej.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fcq $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         bvs $$3 = this.q();
         if (!($$3 instanceof bwt) || $$1.O().c(dhl.c)) {
            jj $$4 = $$0.b().a($$0.c());
            if (this.dV().u($$4)) {
               this.dV().b($$4, dkh.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
