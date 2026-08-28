public class cws extends cvq {
   private static final ali m = ali.b("container/slot/saddle");
   private static final ali n = ali.b("container/slot/llama_armor");
   private static final ali o = ali.b("container/slot/horse_armor");
   private final buk p;
   private final clt q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public cws(int $$0, crw $$1, buk $$2, final clt $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.c_($$1.h);
      buk $$5 = $$3.h(bxd.h);
      this.a(new cvu($$5, $$3, bxd.h, 0, 8, 18, m) {
         @Override
         public boolean b() {
            return $$3.e(bxd.h) && $$3.an().a(axh.J);
         }
      });
      final boolean $$6 = $$3 instanceof clw;
      ali $$7 = $$6 ? n : o;
      buk $$8 = $$3.h(bxd.g);
      this.a(new cvu($$8, $$3, bxd.g, 0, 8, 36, $$7) {
         @Override
         public boolean b() {
            return $$3.e(bxd.g) && ($$3.an().a(axh.K) || $$6);
         }
      });
      if ($$4 > 0) {
         for (int $$9 = 0; $$9 < 3; $$9++) {
            for (int $$10 = 0; $$10 < $$4; $$10++) {
               this.a(new cxn($$2, $$10 + $$9 * $$4, 80 + $$10 * 18, 18 + $$9 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crx $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bJ() && $$0.b(this.q, 4.0);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return czy.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return czy.k;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return czy.k;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return czy.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return czy.k;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return czy.k;
            }

            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
