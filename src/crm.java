public class crm extends crq {
   private final cql a;
   private final cmx b;
   private int g;

   public crm(cmx $$0, cql $$1, bqk $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cuq $$0) {
      return false;
   }

   @Override
   public cuq a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cuq $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cuq $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dP(), this.b, this.g);
      }

      if (this.c instanceof crk $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cmx $$0, cuq $$1) {
      this.b_($$1);
      cyp.a $$2 = this.a.aF_();
      cyp $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jv<cuq> $$6 = $$0.dP().r().c(czf.a, $$3, $$0.dP());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.f();
            cuq $$10 = this.a.a($$9);
            cuq $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.e()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.e()) {
               if ($$10.e()) {
                  this.a.a($$9, $$11);
               } else if (cuq.c($$10, $$11)) {
                  $$11.g($$10.H());
                  this.a.a($$9, $$11);
               } else if (!this.b.fZ().f($$11)) {
                  this.b.a($$11, false);
               }
            }
         }
      }
   }

   @Override
   public boolean f() {
      return true;
   }
}
