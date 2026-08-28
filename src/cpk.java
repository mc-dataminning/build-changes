public class cpk extends cpa {
   public cpk(bul<? extends cpk> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpk(dfb $$0, bva $$1, ezn $$2) {
      super(bul.aQ, $$1, $$2, $$0);
   }

   public cpk(dfb $$0, double $$1, double $$2, double $$3, ezn $$4) {
      super(bul.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      if (this.dX() instanceof arn $$1) {
         bue var7 = $$0.a();
         bue $$4 = this.s();
         int $$5 = var7.aH();
         var7.d(5.0F);
         bsu $$6 = this.dY().a((cpa)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            dbu.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ezj $$0) {
      super.a($$0);
      if (!this.dX().C) {
         bue $$1 = this.s();
         if (!($$1 instanceof bvc) || this.dX().ac().b(dex.c)) {
            jh $$2 = $$0.b().a($$0.c());
            if (this.dX().u($$2)) {
               this.dX().b($$2, dhr.a(this.dX(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.av();
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return false;
   }
}
