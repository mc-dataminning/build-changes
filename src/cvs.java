public class cvs extends cuq {
   private static final alg m = alg.b("container/slot/saddle");
   private static final alg n = alg.b("container/slot/llama_armor");
   private static final alg o = alg.b("container/slot/horse_armor");
   private final btu p;
   private final cld q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public cvs(int $$0, cqx $$1, btu $$2, final cld $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.c_($$1.k);
      btu $$5 = $$3.h(bwn.h);
      this.a(new cuu($$5, $$3, bwn.h, 0, 8, 18, m) {
         @Override
         public boolean b() {
            return $$3.e(bwn.h) && $$3.aq().a(axf.J);
         }
      });
      final boolean $$6 = $$3 instanceof clg;
      alg $$7 = $$6 ? n : o;
      btu $$8 = $$3.h(bwn.g);
      this.a(new cuu($$8, $$3, bwn.g, 0, 8, 36, $$7) {
         @Override
         public boolean b() {
            return $$3.e(bwn.g) && ($$3.aq().a(axf.K) || $$6);
         }
      });
      if ($$4 > 0) {
         for (int $$9 = 0; $$9 < 3; $$9++) {
            for (int $$10 = 0; $$10 < $$4; $$10++) {
               this.a(new cwn($$2, $$10 + $$9 * $$4, 80 + $$10 * 18, 18 + $$9 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqy $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bK() && $$0.b(this.q, 4.0);
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return cyy.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cyy.k;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return cyy.k;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return cyy.k;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return cyy.k;
            }

            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cqy $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
