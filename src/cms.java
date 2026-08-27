public class cms extends cmi {
   public cms(bsa<? extends cms> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cms(dax $$0, bso $$1, double $$2, double $$3, double $$4) {
      super(bsa.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   public cms(dax $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bsa.aQ, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bru $$1 = $$0.a();
         bru $$2 = this.s();
         int $$3 = $$1.aB();
         $$1.g(5);
         if (!$$1.a(this.dQ().a((cmi)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof bso) {
            this.a((bso)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(eug $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bru $$1 = this.s();
         if (!($$1 instanceof bsq) || this.dP().aa().b(dat.c)) {
            io $$2 = $$0.a().a($$0.b());
            if (this.dP().u($$2)) {
               this.dP().b($$2, ddl.a(this.dP(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   public boolean bz() {
      return false;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      return false;
   }
}
