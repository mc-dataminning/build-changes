public class cqv extends cpv {
   private final bqo k;
   private final bqo l;
   private final chk m;
   private static final int n = 1;
   private static final int o = 2;

   public cqv(int $$0, cmx $$1, bqo $$2, final chk $$3) {
      super(null, $$0);
      this.k = $$2;
      this.l = $$3.gZ();
      this.m = $$3;
      int $$4 = 3;
      $$2.d_($$1.l);
      int $$5 = -18;
      this.a(new crq($$2, 0, 8, 18) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.a(cut.nL) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }
      });
      this.a(new crq(this.l, 0, 8, 36) {
         @Override
         public boolean a(cuq $$0) {
            return $$3.l($$0);
         }

         @Override
         public boolean d() {
            return $$3.fS();
         }

         @Override
         public int a() {
            return 1;
         }
      });
      if (this.a($$3)) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < ((chj)$$3).gy(); $$7++) {
               this.a(new crq($$2, 1 + $$7 + $$6 * ((chj)$$3).gy(), 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crq($$1, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 102 + $$8 * 18 + -18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crq($$1, $$10, 8 + $$10 * 18, 142));
      }
   }

   @Override
   public boolean a(cmy $$0) {
      return !this.m.b(this.k) && this.k.a($$0) && this.l.a($$0) && this.m.bD() && $$0.b(this.m, 4.0);
   }

   private boolean a(chk $$0) {
      if ($$0 instanceof chj $$1 && $$1.u()) {
         return true;
      }

      return false;
   }

   @Override
   public cuq a(cmy $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.k.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.i.size(), true)) {
               return cuq.l;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cuq.l;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cuq.l;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cuq.l;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cuq.l;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cuq.l;
            }

            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cmy $$0) {
      super.b($$0);
      this.k.c($$0);
   }
}
