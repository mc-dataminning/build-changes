public class cnp extends cmp {
   private final bnt k;
   private final bnt l;
   private final cef m;
   private static final int n = 1;
   private static final int o = 2;

   public cnp(int $$0, cjs $$1, bnt $$2, final cef $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3.gW();
      this.m = $$3;
      int $$4 = 3;
      $$2.d_($$1.m);
      int $$5 = -18;
      this.a(new cok($$2, 0, 8, 18) {
         @Override
         public boolean a(crj $$0) {
            return $$0.a(crm.nK) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }
      });
      this.a(new cok(this.l, 0, 8, 36) {
         @Override
         public boolean a(crj $$0) {
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
            for (int $$7 = 0; $$7 < ((cee)$$3).gv(); $$7++) {
               this.a(new cok($$2, 1 + $$7 + $$6 * ((cee)$$3).gv(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cok($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cok($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return !this.m.b(this.k) && this.k.a($$0) && this.l.a($$0) && this.m.bA() && $$0.b(this.m, 4.0);
   }

   private boolean a(cef $$0) {
      if ($$0 instanceof cee $$1 && $$1.u()) {
         return true;
      }

      return false;
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         int $$5 = this.k.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return crj.i;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return crj.i;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return crj.i;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return crj.i;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return crj.i;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return crj.i;
            }

            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.k.c($$0);
   }
}
