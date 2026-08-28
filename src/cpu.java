public class cpu extends cpk {
   public cpu(bur<? extends cpu> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpu(dgi $$0, bvg $$1, fba $$2) {
      super(bur.bi, $$1, $$2, $$0);
   }

   public cpu(dgi $$0, double $$1, double $$2, double $$3, fba $$4) {
      super(bur.bi, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buk var7 = $$0.a();
         buk $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         bta $$6 = this.dX().a((cpk)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            ddb.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         buk $$3 = this.p();
         if (!($$3 instanceof bvi) || $$1.O().b(dge.c)) {
            ji $$4 = $$0.b().a($$0.c());
            if (this.dW().u($$4)) {
               this.dW().b($$4, diz.a(this.dW(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }
}
