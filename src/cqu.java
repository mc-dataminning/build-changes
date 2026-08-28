public class cqu extends cqk {
   public cqu(bvr<? extends cqu> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqu(dhi $$0, bwg $$1, fby $$2) {
      super(bvr.bi, $$1, $$2, $$0);
   }

   public cqu(dhi $$0, double $$1, double $$2, double $$3, fby $$4) {
      super(bvr.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         bvk var7 = $$0.a();
         bvk $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         bua $$6 = this.dX().a((cqk)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            deb.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         bvk $$3 = this.p();
         if (!($$3 instanceof bwi) || $$1.N().b(dhe.c)) {
            jh $$4 = $$0.b().a($$0.c());
            if (this.dW().u($$4)) {
               this.dW().b($$4, djz.a(this.dW(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fbw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }
}
