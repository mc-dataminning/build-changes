public class cqt extends cqj {
   public cqt(bvq<? extends cqt> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqt(dhh $$0, bwf $$1, fbx $$2) {
      super(bvq.bi, $$1, $$2, $$0);
   }

   public cqt(dhh $$0, double $$1, double $$2, double $$3, fbx $$4) {
      super(bvq.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bvj var7 = $$0.a();
         bvj $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         btz $$6 = this.dW().a((cqj)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dea.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bvj $$3 = this.p();
         if (!($$3 instanceof bwh) || $$1.N().b(dhd.c)) {
            jh $$4 = $$0.b().a($$0.c());
            if (this.dV().u($$4)) {
               this.dV().b($$4, djy.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
