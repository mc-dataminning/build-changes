public class cuu extends cuy {
   private final ctt a;
   private final cpw b;
   private int g;

   public cuu(cpw $$0, ctt $$1, btb $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cxo $$0) {
      return false;
   }

   @Override
   public cxo a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cxo $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cxo $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dV(), this.b, this.g);
      }

      if (this.c instanceof cus $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   private static jz<cxo> a(dbr $$0) {
      jz<cxo> $$1 = jz.a($$0.a(), cxo.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, $$0.a($$2));
      }

      return $$1;
   }

   private jz<cxo> a(dbr $$0, dhh $$1) {
      return $$1 instanceof ash $$2 ? $$2.s().a(dco.a, $$0, $$2).map($$1x -> ((dbs)$$1x.b()).a($$0)).orElseGet(() -> a($$0)) : dbs.b($$0);
   }

   @Override
   public void a(cpw $$0, cxo $$1) {
      this.b_($$1);
      dbr.a $$2 = this.a.aD_();
      dbr $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jz<cxo> $$6 = this.a($$3, $$0.dV());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.az_();
            cxo $$10 = this.a.a($$9);
            cxo $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (cxo.c($$10, $$11)) {
                  $$11.g($$10.L());
                  this.a.a($$9, $$11);
               } else if (!this.b.gg().f($$11)) {
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
