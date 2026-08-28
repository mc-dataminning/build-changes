public class com extends coc {
   public com(btq<? extends com> $$0, dds $$1) {
      super($$0, $$1);
   }

   public com(dds $$0, buf $$1, eye $$2) {
      super(btq.aQ, $$1, $$2, $$0);
   }

   public com(dds $$0, double $$1, double $$2, double $$3, eye $$4) {
      super(btq.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eyb $$0) {
      super.a($$0);
      if (this.dS() instanceof arg $$1) {
         btj var7 = $$0.a();
         btj $$4 = this.s();
         int $$5 = var7.aE();
         var7.d(5.0F);
         bsb $$6 = this.dT().a((coc)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            day.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(eya $$0) {
      super.a($$0);
      if (!this.dS().B) {
         btj $$1 = this.s();
         if (!($$1 instanceof buh) || this.dS().ac().b(ddo.c)) {
            je $$2 = $$0.a().a($$0.b());
            if (this.dS().u($$2)) {
               this.dS().b($$2, dgi.a(this.dS(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(eyc $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.as();
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      return false;
   }
}
