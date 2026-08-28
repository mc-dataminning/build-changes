public class cpr extends cph {
   public cpr(bus<? extends cpr> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpr(dfm $$0, bvh $$1, ezy $$2) {
      super(bus.be, $$1, $$2, $$0);
   }

   public cpr(dfm $$0, double $$1, double $$2, double $$3, ezy $$4) {
      super(bus.be, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         bul var7 = $$0.a();
         bul $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         btb $$6 = this.dW().a((cph)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dcf.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ezu $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         bul $$3 = this.p();
         if (!($$3 instanceof bvj) || $$1.N().b(dfi.c)) {
            jh $$4 = $$0.b().a($$0.c());
            if (this.dV().u($$4)) {
               this.dV().b($$4, did.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
