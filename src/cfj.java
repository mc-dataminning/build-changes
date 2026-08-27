public class cfj extends cel {
   private final bgr k;
   private final bwq l;

   public cfj(int $$0, cbt $$1, bgr $$2, final bwq $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3;
      int $$4 = 3;
      $$2.d_($$1.m);
      int $$5 = -18;
      this.a(new cgd($$2, 0, 8, 18) {
         @Override
         public boolean a(cjf $$0) {
            return $$0.a(cji.mZ) && !this.f() && $$3.g();
         }

         @Override
         public boolean c() {
            return $$3.g();
         }
      });
      this.a(new cgd($$2, 1, 8, 36) {
         @Override
         public boolean a(cjf $$0) {
            return $$3.l($$0);
         }

         @Override
         public boolean c() {
            return $$3.gM();
         }

         @Override
         public int a() {
            return 1;
         }
      });
      if (this.a($$3)) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < ((bwp)$$3).gl(); $$7++) {
               this.a(new cgd($$2, 2 + $$7 + $$6 * ((bwp)$$3).gl(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cgd($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cgd($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return !this.l.b(this.k) && this.k.a($$0) && this.l.bv() && this.l.e($$0) < 8.0F;
   }

   private boolean a(bwq $$0) {
      return $$0 instanceof bwp && ((bwp)$$0).t();
   }

   @Override
   public cjf a(cbu $$0, int $$1) {
      cjf $$2 = cjf.b;
      cgd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjf $$4 = $$3.e();
         $$2 = $$4.p();
         int $$5 = this.k.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return cjf.b;
            }
         } else if (this.b(1).a($$4) && !this.b(1).f()) {
            if (!this.a($$4, 1, 2, false)) {
               return cjf.b;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cjf.b;
            }
         } else if ($$5 <= 2 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cjf.b;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cjf.b;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cjf.b;
            }

            return cjf.b;
         }

         if ($$4.b()) {
            $$3.d(cjf.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cbu $$0) {
      super.b($$0);
      this.k.c($$0);
   }
}
