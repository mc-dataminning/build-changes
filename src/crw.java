public class crw extends crm {
   public crw(bwm<? extends crw> $$0, div $$1) {
      super($$0, $$1);
   }

   public crw(div $$0, bxc $$1, fei $$2) {
      super(bwm.bi, $$1, $$2, $$0);
   }

   public crw(div $$0, double $$1, double $$2, double $$3, fei $$4) {
      super(bwm.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwd var7 = $$0.a();
         bwd $$4 = this.q();
         int $$5 = var7.aG();
         var7.e(5.0F);
         bus $$6 = this.dW().a((crm)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dfn.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fee $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwd $$3 = this.q();
         if (!($$3 instanceof bxe) || $$1.O().c(dir.c)) {
            iu $$4 = $$0.b().a($$0.c());
            if (this.dV().v($$4)) {
               this.dV().b($$4, dln.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
