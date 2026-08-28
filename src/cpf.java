public class cpf extends cov {
   public cpf(bug<? extends cpf> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpf(dev $$0, buv $$1, ezh $$2) {
      super(bug.aQ, $$1, $$2, $$0);
   }

   public cpf(dev $$0, double $$1, double $$2, double $$3, ezh $$4) {
      super(bug.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      if (this.dX() instanceof arm $$1) {
         btz var7 = $$0.a();
         btz $$4 = this.s();
         int $$5 = var7.aG();
         var7.d(5.0F);
         bsp $$6 = this.dY().a((cov)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            dbo.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(ezd $$0) {
      super.a($$0);
      if (!this.dX().C) {
         btz $$1 = this.s();
         if (!($$1 instanceof bux) || this.dX().ac().b(der.c)) {
            jg $$2 = $$0.b().a($$0.c());
            if (this.dX().u($$2)) {
               this.dX().b($$2, dhl.a(this.dX(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.au();
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return false;
   }
}
