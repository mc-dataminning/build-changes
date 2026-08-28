public class cnt extends cnj {
   public cnt(bsx<? extends cnt> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnt(dcw $$0, btn $$1, exa $$2) {
      super(bsx.aQ, $$1, $$2, $$0);
   }

   public cnt(dcw $$0, double $$1, double $$2, double $$3, exa $$4) {
      super(bsx.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ewx $$0) {
      super.a($$0);
      if (this.dP() instanceof aqu $$1) {
         bsr var7 = $$0.a();
         bsr $$4 = this.s();
         int $$5 = var7.aC();
         var7.d(5.0F);
         brk $$6 = this.dQ().a((cnj)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            dae.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(eww $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsr $$1 = this.s();
         if (!($$1 instanceof btp) || this.dP().ab().b(dcs.c)) {
            jd $$2 = $$0.a().a($$0.b());
            if (this.dP().u($$2)) {
               this.dP().b($$2, dfl.a(this.dP(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ewy $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.aq();
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return false;
   }
}
