public class cpt extends cpj {
   public cpt(bur<? extends cpt> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpt(dgh $$0, bvg $$1, faz $$2) {
      super(bur.bh, $$1, $$2, $$0);
   }

   public cpt(dgh $$0, double $$1, double $$2, double $$3, faz $$4) {
      super(bur.bh, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         buk var7 = $$0.a();
         buk $$4 = this.p();
         int $$5 = var7.aG();
         var7.d(5.0F);
         bta $$6 = this.dW().a((cpj)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            dda.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fav $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         buk $$3 = this.p();
         if (!($$3 instanceof bvi) || $$1.O().b(dgd.c)) {
            ji $$4 = $$0.b().a($$0.c());
            if (this.dV().u($$4)) {
               this.dV().b($$4, diy.a(this.dV(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }
}
