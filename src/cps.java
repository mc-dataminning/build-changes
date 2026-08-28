public class cps extends cpi {
   public cps(buq<? extends cps> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cps(dgg $$0, bvf $$1, fay $$2) {
      super(buq.bh, $$1, $$2, $$0);
   }

   public cps(dgg $$0, double $$1, double $$2, double $$3, fay $$4) {
      super(buq.bh, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fav $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buj var7 = $$0.a();
         buj $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         bsz $$6 = this.dX().a((cpi)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dcz.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fau $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buj $$3 = this.p();
         if (!($$3 instanceof bvh) || $$1.O().b(dgc.c)) {
            ji $$4 = $$0.b().a($$0.c());
            if (this.dW().u($$4)) {
               this.dW().b($$4, dix.a(this.dW(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }
}
