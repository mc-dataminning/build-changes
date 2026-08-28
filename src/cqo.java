public class cqo extends cqe {
   public cqo(bvi<? extends cqo> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqo(dgz $$0, bvy $$1, fbx $$2) {
      super(bvi.bh, $$1, $$2, $$0);
   }

   public cqo(dgz $$0, double $$1, double $$2, double $$3, fbx $$4) {
      super(bvi.bh, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         bva var7 = $$0.a();
         bva $$4 = this.q();
         int $$5 = var7.aG();
         var7.e(5.0F);
         btp $$6 = this.dV().a((cqe)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            ddt.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         bva $$3 = this.q();
         if (!($$3 instanceof bwa) || $$1.O().b(dgv.c)) {
            ji $$4 = $$0.b().a($$0.c());
            if (this.dU().u($$4)) {
               this.dU().b($$4, djr.a(this.dU(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.at();
      }
   }
}
