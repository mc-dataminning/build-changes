public class cwu extends cvs {
   private static final alk m = alk.b("container/slot/saddle");
   private static final alk n = alk.b("container/slot/llama_armor");
   private static final alk o = alk.b("container/slot/horse_armor");
   private final bum p;
   private final clv q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public cwu(int $$0, cry $$1, bum $$2, final clv $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.c_($$1.h);
      bum $$5 = $$3.h(bxf.h);
      this.a(new cvw($$5, $$3, bxf.h, 0, 8, 18, m) {
         @Override
         public boolean b() {
            return $$3.e(bxf.h) && $$3.an().a(axj.J);
         }
      });
      final boolean $$6 = $$3 instanceof cly;
      alk $$7 = $$6 ? n : o;
      bum $$8 = $$3.h(bxf.g);
      this.a(new cvw($$8, $$3, bxf.g, 0, 8, 36, $$7) {
         @Override
         public boolean b() {
            return $$3.e(bxf.g) && ($$3.an().a(axj.K) || $$6);
         }
      });
      if ($$4 > 0) {
         for (int $$9 = 0; $$9 < 3; $$9++) {
            for (int $$10 = 0; $$10 < $$4; $$10++) {
               this.a(new cxp($$2, $$10 + $$9 * $$4, 80 + $$10 * 18, 18 + $$9 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crz $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bJ() && $$0.b(this.q, 4.0);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return daa.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return daa.k;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return daa.k;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return daa.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return daa.k;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return daa.k;
            }

            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
