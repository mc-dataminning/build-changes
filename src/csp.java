public class csp extends cst {
   private final cro a;
   private final cnu b;
   private int g;

   public csp(cnu $$0, cro $$1, bri $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cvp $$0) {
      return false;
   }

   @Override
   public cvp a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().J());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cvp $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cvp $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dS(), this.b, this.g);
      }

      if (this.c instanceof csn $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cnu $$0, cvp $$1) {
      this.b_($$1);
      czw.a $$2 = this.a.aD_();
      czw $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jw<cvp> $$6 = $$0.dS().r().c(dan.a, $$3, $$0.dS());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.az_();
            cvp $$10 = this.a.a($$9);
            cvp $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (cvp.c($$10, $$11)) {
                  $$11.g($$10.J());
                  this.a.a($$9, $$11);
               } else if (!this.b.gc().f($$11)) {
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
