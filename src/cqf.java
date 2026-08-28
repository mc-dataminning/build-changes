public class cqf extends cpe {
   private final bpw k;
   private final bpw l;
   private final cgs m;
   private static final int n = 1;
   private static final int o = 2;

   public cqf(int $$0, cmg $$1, bpw $$2, final cgs $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3.gW();
      this.m = $$3;
      int $$4 = 3;
      $$2.d_($$1.l);
      int $$5 = -18;
      this.a(new cra($$2, 0, 8, 18) {
         @Override
         public boolean a(cua $$0) {
            return $$0.a(cud.nL) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }
      });
      this.a(new cph(this.l, $$3, bsk.g, 0, 8, 36, null) {
         @Override
         public boolean a(cua $$0) {
            return $$3.l($$0);
         }

         @Override
         public boolean d() {
            return $$3.fO();
         }
      });
      if (this.a($$3)) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < ((cgr)$$3).gv(); $$7++) {
               this.a(new cra($$2, 1 + $$7 + $$6 * ((cgr)$$3).gv(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cra($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cra($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean b(cmh $$0) {
      return !this.m.b(this.k) && this.k.a($$0) && this.l.a($$0) && this.m.bD() && $$0.b(this.m, 4.0);
   }

   private boolean a(cgs $$0) {
      if ($$0 instanceof cgr $$1 && $$1.u()) {
         return true;
      }

      return false;
   }

   @Override
   public cua b(cmh $$0, int $$1) {
      cua $$2 = cua.l;
      cra $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cua $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.k.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return cua.l;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cua.l;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cua.l;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cua.l;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cua.l;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cua.l;
            }

            return cua.l;
         }

         if ($$4.e()) {
            $$3.e(cua.l);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cmh $$0) {
      super.a($$0);
      this.k.c($$0);
   }
}
