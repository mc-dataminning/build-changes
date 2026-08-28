public class csb extends crr {
   public csb(bwo<? extends csb> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csb(dja $$0, bxe $$1, feq $$2) {
      super(bwo.bi, $$1, $$2, $$0);
   }

   public csb(dja $$0, double $$1, double $$2, double $$3, feq $$4) {
      super(bwo.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fen $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwf var7 = $$0.a();
         bwf $$4 = this.q();
         int $$5 = var7.aG();
         var7.e(5.0F);
         buu $$6 = this.dW().a((crr)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dfs.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fem $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         bwf $$3 = this.q();
         if (!($$3 instanceof bxg) || $$1.O().c(diw.d)) {
            iu $$4 = $$0.b().a($$0.c());
            if (this.dV().v($$4)) {
               this.dV().b($$4, dls.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(feo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
