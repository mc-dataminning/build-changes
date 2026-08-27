public class cep extends ceg {
   public cep(bku<? extends cep> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cep(csa $$0, blg $$1, double $$2, double $$3, double $$4) {
      super(bku.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public cep(csa $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bku.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkq $$1 = $$0.a();
         bkq $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dO().a((ceg)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof blg) {
            this.a((blg)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ejq $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkq $$1 = this.w();
         if (!($$1 instanceof bli) || this.dN().Y().b(crw.c)) {
            ht $$2 = $$0.a().a($$0.b());
            if (this.dN().t($$2)) {
               this.dN().b($$2, cun.a(this.dN(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ejs $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      return false;
   }
}
