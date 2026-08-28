public class cpv extends cpl {
   public cpv(but<? extends cpv> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cpv(dgj $$0, bvi $$1, fbb $$2) {
      super(but.bh, $$1, $$2, $$0);
   }

   public cpv(dgj $$0, double $$1, double $$2, double $$3, fbb $$4) {
      super(but.bh, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         bum var7 = $$0.a();
         bum $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         btc $$6 = this.dW().a((cpl)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            ddc.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         bum $$3 = this.p();
         if (!($$3 instanceof bvk) || $$1.O().b(dgf.c)) {
            ji $$4 = $$0.b().a($$0.c());
            if (this.dV().u($$4)) {
               this.dV().b($$4, dja.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(faz $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
