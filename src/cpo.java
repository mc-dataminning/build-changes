public class cpo extends cpe {
   public cpo(bup<? extends cpo> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpo(dff $$0, bve $$1, ezr $$2) {
      super(bup.aQ, $$1, $$2, $$0);
   }

   public cpo(dff $$0, double $$1, double $$2, double $$3, ezr $$4) {
      super(bup.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      if (this.dY() instanceof arq $$1) {
         bui var7 = $$0.a();
         bui $$4 = this.s();
         int $$5 = var7.aI();
         var7.d(5.0F);
         bsy $$6 = this.dZ().a((cpe)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            dby.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ezn $$0) {
      super.a($$0);
      if (!this.dY().C) {
         bui $$1 = this.s();
         if (!($$1 instanceof bvg) || this.dY().ac().b(dfb.c)) {
            jh $$2 = $$0.b().a($$0.c());
            if (this.dY().u($$2)) {
               this.dY().b($$2, dhw.a(this.dY(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (!this.dY().C) {
         this.av();
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return false;
   }
}
