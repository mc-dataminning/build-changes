public class ccp extends ccg {
   public ccp(biu<? extends ccp> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccp(cpv $$0, bjg $$1, double $$2, double $$3, double $$4) {
      super(biu.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public ccp(cpv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(biu.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ehk $$0) {
      super.a($$0);
      if (!this.dL().B) {
         biq $$1 = $$0.a();
         biq $$2 = this.v();
         int $$3 = $$1.ax();
         $$1.g(5);
         if (!$$1.a(this.dM().a((ccg)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bjg) {
            this.a((bjg)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ehj $$0) {
      super.a($$0);
      if (!this.dL().B) {
         biq $$1 = this.v();
         if (!($$1 instanceof bji) || this.dL().X().b(cpr.c)) {
            gw $$2 = $$0.a().a($$0.b());
            if (this.dL().t($$2)) {
               this.dL().b($$2, csj.a(this.dL(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      return false;
   }
}
