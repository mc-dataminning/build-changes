public class ctb extends crz {
   private final bsd m;
   private final bsd n;
   private final cjc o;
   private static final int p = 1;
   private static final int q = 2;

   public ctb(int $$0, cot $$1, bsd $$2, final cjc $$3, int $$4) {
      super(null, $$0);
      this.m = $$2;
      this.n = $$3.gX();
      this.o = $$3;
      $$2.c_($$1.k);
      this.a(new ctw($$2, 0, 8, 18) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.a(cwq.nL) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }
      });
      this.a(new csd(this.n, $$3, but.g, 0, 8, 36, null) {
         @Override
         public boolean a(cwm $$0) {
            return $$3.a($$0, but.g);
         }

         @Override
         public boolean d() {
            return $$3.e(but.g);
         }
      });
      if ($$4 > 0) {
         for (int $$5 = 0; $$5 < 3; $$5++) {
            for (int $$6 = 0; $$6 < $$4; $$6++) {
               this.a(new ctw($$2, 1 + $$6 + $$5 * $$4, 80 + $$6 * 18, 18 + $$5 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cou $$0) {
      return !this.o.b(this.m) && this.m.a($$0) && this.n.a($$0) && this.o.bL() && $$0.b(this.o, 4.0);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return cwm.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cwm.k;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cwm.k;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cwm.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cwm.k;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cwm.k;
            }

            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.m.c($$0);
   }
}
