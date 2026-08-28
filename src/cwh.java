public class cwh extends cvf {
   private static final alg m = alg.b("container/slot/saddle");
   private static final alg n = alg.b("container/slot/llama_armor");
   private static final alg o = alg.b("container/slot/horse_armor");
   private final btz p;
   private final cli q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public cwh(int $$0, crl $$1, btz $$2, final cli $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.c_($$1.h);
      btz $$5 = $$3.h(bws.h);
      this.a(new cvj($$5, $$3, bws.h, 0, 8, 18, m) {
         @Override
         public boolean b() {
            return $$3.e(bws.h) && $$3.an().a(axf.J);
         }
      });
      final boolean $$6 = $$3 instanceof cll;
      alg $$7 = $$6 ? n : o;
      btz $$8 = $$3.h(bws.g);
      this.a(new cvj($$8, $$3, bws.g, 0, 8, 36, $$7) {
         @Override
         public boolean b() {
            return $$3.e(bws.g) && ($$3.an().a(axf.K) || $$6);
         }
      });
      if ($$4 > 0) {
         for (int $$9 = 0; $$9 < 3; $$9++) {
            for (int $$10 = 0; $$10 < $$4; $$10++) {
               this.a(new cxc($$2, $$10 + $$9 * $$4, 80 + $$10 * 18, 18 + $$9 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crm $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bI() && $$0.b(this.q, 4.0);
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return czn.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return czn.k;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return czn.k;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return czn.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return czn.k;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return czn.k;
            }

            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crm $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
