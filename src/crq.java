public class crq extends crg {
   public crq(bwj<? extends crq> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crq(dip $$0, bwz $$1, fdw $$2) {
      super(bwj.bi, $$1, $$2, $$0);
   }

   public crq(dip $$0, double $$1, double $$2, double $$3, fdw $$4) {
      super(bwj.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fdt $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         bwa var7 = $$0.a();
         bwa $$4 = this.q();
         int $$5 = var7.aG();
         var7.e(5.0F);
         bup $$6 = this.dW().a((crg)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dfh.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fds $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         bwa $$3 = this.q();
         if (!($$3 instanceof bxb) || $$1.O().c(dil.c)) {
            iu $$4 = $$0.b().a($$0.c());
            if (this.dV().v($$4)) {
               this.dV().b($$4, dlh.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fdu $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
