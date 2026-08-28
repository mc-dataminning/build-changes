public class csw extends csm {
   public csw(bxc<? extends csw> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csw(djx $$0, bxu $$1, ffq $$2) {
      super(bxc.bj, $$1, $$2, $$0);
   }

   public csw(djx $$0, double $$1, double $$2, double $$3, ffq $$4) {
      super(bxc.bj, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ffn $$0) {
      super.a($$0);
      if (this.dV() instanceof ars $$1) {
         bwt var7 = $$0.a();
         bwt $$4 = this.q();
         int $$5 = var7.aE();
         var7.e(5.0F);
         bvi $$6 = this.dW().a((csm)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dgn.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ffm $$0) {
      super.a($$0);
      if (this.dV() instanceof ars $$1) {
         bwt $$3 = this.q();
         if (!($$3 instanceof bxw) || $$1.O().c(djt.d)) {
            iv $$4 = $$0.b().a($$0.c());
            if (this.dV().v($$4)) {
               this.dV().b($$4, dmp.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.aq();
      }
   }
}
