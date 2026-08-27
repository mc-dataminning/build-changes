public class ciw extends cim {
   public ciw(bol<? extends ciw> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ciw(cwe $$0, box $$1, double $$2, double $$3, double $$4) {
      super(bol.aO, $$1, $$2, $$3, $$4, $$0);
   }

   public ciw(cwe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bol.aO, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         bof $$1 = $$0.a();
         bof $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dK().a((cim)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof box) {
            this.a((box)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(eor $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         bof $$1 = this.w();
         if (!($$1 instanceof boz) || this.dJ().Z().b(cwa.c)) {
            ib $$2 = $$0.a().a($$0.b());
            if (this.dJ().u($$2)) {
               this.dJ().b($$2, cys.a(this.dJ(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      return false;
   }
}
