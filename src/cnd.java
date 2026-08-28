public class cnd extends cmt {
   public cnd(bsj<? extends cnd> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cnd(dcd $$0, bsy $$1, double $$2, double $$3, double $$4) {
      super(bsj.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   public cnd(dcd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bsj.aQ, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      if (this.dP() instanceof aqk $$1) {
         bsd var7 = $$0.a();
         bsd $$4 = this.s();
         int $$5 = var7.aB();
         var7.d(5.0F);
         bqw $$6 = this.dQ().a((cmt)this, $$4);
         if (!var7.a($$6, 5.0F)) {
            var7.h($$5);
         } else {
            czl.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(evv $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsd $$1 = this.s();
         if (!($$1 instanceof bta) || this.dP().ab().b(dbz.c)) {
            ja $$2 = $$0.a().a($$0.b());
            if (this.dP().u($$2)) {
               this.dP().b($$2, des.a(this.dP(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      return false;
   }
}
