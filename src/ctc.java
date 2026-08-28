public class ctc extends ctg {
   private final csb a;
   private final coh b;
   private int g;

   public ctc(coh $$0, csb $$1, brr $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cvx $$0) {
      return false;
   }

   @Override
   public cvx a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cvx $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cvx $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dX(), this.b, this.g);
      }

      if (this.c instanceof cta $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(coh $$0, cvx $$1) {
      this.b_($$1);
      czy.a $$2 = this.a.aE_();
      czy $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jy<cvx> $$6 = $$0.dX().r().c(dap.a, $$3, $$0.dX());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.aA_();
            cvx $$10 = this.a.a($$9);
            cvx $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (cvx.c($$10, $$11)) {
                  $$11.g($$10.L());
                  this.a.a($$9, $$11);
               } else if (!this.b.gk().f($$11)) {
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
