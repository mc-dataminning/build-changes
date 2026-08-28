public class cov extends cok {
   public cov(bty<? extends cov> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cov(dej $$0, bun $$1, eyw $$2) {
      super(bty.aQ, $$1, $$2, $$0);
   }

   public cov(dej $$0, double $$1, double $$2, double $$3, eyw $$4) {
      super(bty.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eyt $$0) {
      super.a($$0);
      if (this.dS() instanceof arj $$1) {
         btr var7 = $$0.a();
         btr $$4 = this.s();
         int $$5 = var7.aE();
         var7.d(5.0F);
         bsj $$6 = this.dT().a((cok)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            dbp.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(eys $$0) {
      super.a($$0);
      if (!this.dS().B) {
         btr $$1 = this.s();
         if (!($$1 instanceof bup) || this.dS().ac().b(def.c)) {
            jf $$2 = $$0.b().a($$0.c());
            if (this.dS().u($$2)) {
               this.dS().b($$2, dgz.a(this.dS(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.as();
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      return false;
   }
}
