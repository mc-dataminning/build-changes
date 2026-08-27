public class cfb extends ced {
   private final bgj k;
   private final bwi l;

   public cfb(int $$0, cbl $$1, bgj $$2, final bwi $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3;
      int $$4 = 3;
      $$2.d_($$1.m);
      int $$5 = -18;
      this.a(new cfv($$2, 0, 8, 18) {
         @Override
         public boolean a(cix $$0) {
            return $$0.a(cja.mZ) && !this.f() && $$3.g();
         }

         @Override
         public boolean c() {
            return $$3.g();
         }
      });
      this.a(new cfv($$2, 1, 8, 36) {
         @Override
         public boolean a(cix $$0) {
            return $$3.l($$0);
         }

         @Override
         public boolean c() {
            return $$3.gJ();
         }

         @Override
         public int a() {
            return 1;
         }
      });
      if (this.a($$3)) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < ((bwh)$$3).gi(); $$7++) {
               this.a(new cfv($$2, 2 + $$7 + $$6 * ((bwh)$$3).gi(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cfv($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cfv($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean a(cbm $$0) {
      return !this.l.b(this.k) && this.k.a($$0) && this.l.bv() && this.l.e($$0) < 8.0F;
   }

   private boolean a(bwi $$0) {
      return $$0 instanceof bwh && ((bwh)$$0).q();
   }

   @Override
   public cix a(cbm $$0, int $$1) {
      cix $$2 = cix.b;
      cfv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cix $$4 = $$3.e();
         $$2 = $$4.p();
         int $$5 = this.k.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return cix.b;
            }
         } else if (this.b(1).a($$4) && !this.b(1).f()) {
            if (!this.a($$4, 1, 2, false)) {
               return cix.b;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cix.b;
            }
         } else if ($$5 <= 2 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cix.b;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cix.b;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cix.b;
            }

            return cix.b;
         }

         if ($$4.b()) {
            $$3.d(cix.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cbm $$0) {
      super.b($$0);
      this.k.c($$0);
   }
}
