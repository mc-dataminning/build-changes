public class cqp extends cqf {
   public cqp(bvm<? extends cqp> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqp(dha $$0, bwb $$1, fbs $$2) {
      super(bvm.bi, $$1, $$2, $$0);
   }

   public cqp(dha $$0, double $$1, double $$2, double $$3, fbs $$4) {
      super(bvm.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bvf var7 = $$0.a();
         bvf $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         btv $$6 = this.dW().a((cqf)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            ddt.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (this.dV() instanceof ash $$1) {
         bvf $$3 = this.p();
         if (!($$3 instanceof bwd) || $$1.N().b(dgw.c)) {
            jh $$4 = $$0.b().a($$0.c());
            if (this.dV().u($$4)) {
               this.dV().b($$4, djr.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
