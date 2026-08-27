public class bzj extends bza {
   public bzj(bfn<? extends bzj> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzj(cmm $$0, bfz $$1, double $$2, double $$3, double $$4) {
      super(bfn.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public bzj(cmm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bfn.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(eef $$0) {
      super.a($$0);
      if (!this.dI().B) {
         bfj $$1 = $$0.a();
         bfj $$2 = this.v();
         int $$3 = $$1.av();
         $$1.g(5);
         if (!$$1.a(this.dJ().a((bza)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bfz) {
            this.a((bfz)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(eee $$0) {
      super.a($$0);
      if (!this.dI().B) {
         bfj $$1 = this.v();
         if (!($$1 instanceof bgb) || this.dI().X().b(cmi.c)) {
            gu $$2 = $$0.a().a($$0.b());
            if (this.dI().t($$2)) {
               this.dI().b($$2, cpb.a(this.dI(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);
      if (!this.dI().B) {
         this.ai();
      }
   }

   @Override
   public boolean bo() {
      return false;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      return false;
   }
}
