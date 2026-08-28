public class cql extends cqb {
   public cql(bvi<? extends cql> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cql(dgz $$0, bvx $$1, fbr $$2) {
      super(bvi.bi, $$1, $$2, $$0);
   }

   public cql(dgz $$0, double $$1, double $$2, double $$3, fbr $$4) {
      super(bvi.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         bvb var7 = $$0.a();
         bvb $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         btr $$6 = this.dX().a((cqb)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dds.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fbn $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         bvb $$3 = this.p();
         if (!($$3 instanceof bvz) || $$1.O().b(dgv.c)) {
            jh $$4 = $$0.b().a($$0.c());
            if (this.dW().u($$4)) {
               this.dW().b($$4, djq.a(this.dW(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }
}
