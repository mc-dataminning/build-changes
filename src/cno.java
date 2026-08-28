public class cno extends cne {
   public cno(bsv<? extends cno> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cno(dbt $$0, btk $$1, double $$2, double $$3, double $$4) {
      super(bsv.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   public cno(dbt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bsv.aQ, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(evj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsp $$1 = $$0.a();
         bsp $$2 = this.s();
         int $$3 = $$1.aB();
         $$1.g(5);
         if (!$$1.a(this.dQ().a((cne)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof btk) {
            this.a((btk)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(evi $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsp $$1 = this.s();
         if (!($$1 instanceof btm) || this.dP().ab().b(dbp.c)) {
            iz $$2 = $$0.a().a($$0.b());
            if (this.dP().u($$2)) {
               this.dP().b($$2, deh.a(this.dP(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(evk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      return false;
   }
}
