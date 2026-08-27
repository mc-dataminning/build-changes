public class cik extends chk {
   private final bje k;
   private final bzh l;

   public cik(int $$0, ceq $$1, bje $$2, final bzh $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3;
      int $$4 = 3;
      $$2.d_($$1.m);
      int $$5 = -18;
      this.a(new cjf($$2, 0, 8, 18) {
         @Override
         public boolean a(cmh $$0) {
            return $$0.a(cmk.nK) && !this.h() && $$3.g();
         }

         @Override
         public boolean d() {
            return $$3.g();
         }
      });
      this.a(new cjf($$2, 1, 8, 36) {
         @Override
         public boolean a(cmh $$0) {
            return $$3.l($$0);
         }

         @Override
         public boolean d() {
            return $$3.gN();
         }

         @Override
         public int a() {
            return 1;
         }
      });
      if (this.a($$3)) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < ((bzg)$$3).gm(); $$7++) {
               this.a(new cjf($$2, 2 + $$7 + $$6 * ((bzg)$$3).gm(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cjf($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cjf($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean a(cer $$0) {
      return !this.l.b(this.k) && this.k.a($$0) && this.l.bx() && this.l.e($$0) < 8.0F;
   }

   private boolean a(bzh $$0) {
      return $$0 instanceof bzg && ((bzg)$$0).w();
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         int $$5 = this.k.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return cmh.f;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cmh.f;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cmh.f;
            }
         } else if ($$5 <= 2 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cmh.f;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cmh.f;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cmh.f;
            }

            return cmh.f;
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.k.c($$0);
   }
}
