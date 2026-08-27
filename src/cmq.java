public class cmq extends clq {
   private final bmw k;
   private final bmw l;
   private final cdg m;
   private static final int n = 1;
   private static final int o = 2;

   public cmq(int $$0, cit $$1, bmw $$2, final cdg $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3.gW();
      this.m = $$3;
      int $$4 = 3;
      $$2.d_($$1.m);
      int $$5 = -18;
      this.a(new cnl($$2, 0, 8, 18) {
         @Override
         public boolean a(cqm $$0) {
            return $$0.a(cqp.nK) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }
      });
      this.a(new cnl(this.l, 0, 8, 36) {
         @Override
         public boolean a(cqm $$0) {
            return $$3.l($$0);
         }

         @Override
         public boolean d() {
            return $$3.fQ();
         }

         @Override
         public int a() {
            return 1;
         }
      });
      if (this.a($$3)) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < ((cdf)$$3).gv(); $$7++) {
               this.a(new cnl($$2, 1 + $$7 + $$6 * ((cdf)$$3).gv(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cnl($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cnl($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return !this.m.b(this.k) && this.k.a($$0) && this.l.a($$0) && this.m.bA() && $$0.b(this.m, 4.0);
   }

   private boolean a(cdg $$0) {
      if ($$0 instanceof cdf $$1 && $$1.s()) {
         return true;
      }

      return false;
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         int $$5 = this.k.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return cqm.h;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cqm.h;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cqm.h;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cqm.h;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cqm.h;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cqm.h;
            }

            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.k.c($$0);
   }
}
