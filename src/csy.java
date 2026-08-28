public class csy extends cso {
   public csy(bxe<? extends csy> $$0, djz $$1) {
      super($$0, $$1);
   }

   public csy(djz $$0, bxw $$1, ffs $$2) {
      super(bxe.bj, $$1, $$2, $$0);
   }

   public csy(djz $$0, double $$1, double $$2, double $$3, ffs $$4) {
      super(bxe.bj, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ffp $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         bwv var7 = $$0.a();
         bwv $$4 = this.q();
         int $$5 = var7.aE();
         var7.e(5.0F);
         bvk $$6 = this.dW().a((cso)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dgp.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         bwv $$3 = this.q();
         if (!($$3 instanceof bxy) || $$1.O().c(djv.d)) {
            iw $$4 = $$0.b().a($$0.c());
            if (this.dV().v($$4)) {
               this.dV().b($$4, dmr.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.aq();
      }
   }
}
