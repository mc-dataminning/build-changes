public class cos extends coh {
   public cos(btv<? extends cos> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cos(deg $$0, buk $$1, eys $$2) {
      super(btv.aQ, $$1, $$2, $$0);
   }

   public cos(deg $$0, double $$1, double $$2, double $$3, eys $$4) {
      super(btv.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eyp $$0) {
      super.a($$0);
      if (this.dS() instanceof arh $$1) {
         bto var7 = $$0.a();
         bto $$4 = this.s();
         int $$5 = var7.aE();
         var7.d(5.0F);
         bsg $$6 = this.dT().a((coh)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            dbm.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(eyo $$0) {
      super.a($$0);
      if (!this.dS().B) {
         bto $$1 = this.s();
         if (!($$1 instanceof bum) || this.dS().ac().b(dec.c)) {
            je $$2 = $$0.b().a($$0.c());
            if (this.dS().u($$2)) {
               this.dS().b($$2, dgw.a(this.dS(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.as();
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      return false;
   }
}
