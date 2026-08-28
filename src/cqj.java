public class cqj extends cpi {
   private final bqa k;
   private final bqa l;
   private final cgw m;
   private static final int n = 1;
   private static final int o = 2;

   public cqj(int $$0, cmk $$1, bqa $$2, final cgw $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3.gW();
      this.m = $$3;
      int $$4 = 3;
      $$2.d_($$1.l);
      int $$5 = -18;
      this.a(new cre($$2, 0, 8, 18) {
         @Override
         public boolean a(cud $$0) {
            return $$0.a(cug.nL) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }
      });
      this.a(new cpl(this.l, $$3, bso.g, 0, 8, 36, null) {
         @Override
         public boolean a(cud $$0) {
            return $$3.l($$0);
         }

         @Override
         public boolean d() {
            return $$3.d(bso.g);
         }
      });
      if (this.a($$3)) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < ((cgv)$$3).gv(); $$7++) {
               this.a(new cre($$2, 1 + $$7 + $$6 * ((cgv)$$3).gv(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cre($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cre($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean b(cml $$0) {
      return !this.m.b(this.k) && this.k.a($$0) && this.l.a($$0) && this.m.bF() && $$0.b(this.m, 4.0);
   }

   private boolean a(cgw $$0) {
      if ($$0 instanceof cgv $$1 && $$1.t()) {
         return true;
      }

      return false;
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.k.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return cud.l;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cud.l;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cud.l;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cud.l;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cud.l;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cud.l;
            }

            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.k.c($$0);
   }
}
