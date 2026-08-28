public class cxd extends cwb {
   private static final alr m = alr.b("container/slot/saddle");
   private static final alr n = alr.b("container/slot/llama_armor");
   private static final alr o = alr.b("container/slot/horse_armor");
   private final buv p;
   private final cme q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public cxd(int $$0, csh $$1, buv $$2, final cme $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.c_($$1.h);
      buv $$5 = $$3.h(bxo.h);
      this.a(new cwf($$5, $$3, bxo.h, 0, 8, 18, m) {
         @Override
         public boolean b() {
            return $$3.e(bxo.h) && $$3.an().a(axq.J);
         }
      });
      final boolean $$6 = $$3 instanceof cmh;
      alr $$7 = $$6 ? n : o;
      buv $$8 = $$3.h(bxo.g);
      this.a(new cwf($$8, $$3, bxo.g, 0, 8, 36, $$7) {
         @Override
         public boolean b() {
            return $$3.e(bxo.g) && ($$3.an().a(axq.K) || $$6);
         }
      });
      if ($$4 > 0) {
         for (int $$9 = 0; $$9 < 3; $$9++) {
            for (int $$10 = 0; $$10 < $$4; $$10++) {
               this.a(new cxz($$2, $$10 + $$9 * $$4, 80 + $$10 * 18, 18 + $$9 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(csi $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bJ() && $$0.b(this.q, 4.0);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return dak.l;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return dak.l;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return dak.l;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return dak.l;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return dak.l;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return dak.l;
            }

            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
