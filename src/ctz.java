public class ctz extends csx {
   private final bsx m;
   private final bsx n;
   private final cjw o;
   private static final int p = 1;
   private static final int q = 2;

   public ctz(int $$0, cpr $$1, bsx $$2, final cjw $$3, int $$4) {
      super(null, $$0);
      this.m = $$2;
      this.n = $$3.gX();
      this.o = $$3;
      $$2.c_($$1.k);
      this.a(new cuu($$2, 0, 8, 18) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.a(cxo.oe) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }
      });
      this.a(new ctb(this.n, $$3, bvn.g, 0, 8, 36, null) {
         @Override
         public boolean a(cxk $$0) {
            return $$3.a($$0, bvn.g);
         }

         @Override
         public boolean d() {
            return $$3.e(bvn.g);
         }
      });
      if ($$4 > 0) {
         for (int $$5 = 0; $$5 < 3; $$5++) {
            for (int $$6 = 0; $$6 < $$4; $$6++) {
               this.a(new cuu($$2, 1 + $$6 + $$5 * $$4, 80 + $$6 * 18, 18 + $$5 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cps $$0) {
      return !this.o.b(this.m) && this.m.a($$0) && this.n.a($$0) && this.o.bL() && $$0.b(this.o, 4.0);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return cxk.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cxk.k;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cxk.k;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cxk.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cxk.k;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cxk.k;
            }

            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.m.c($$0);
   }
}
