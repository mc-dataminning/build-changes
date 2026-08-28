public class cvm extends cuk {
   private static final ale m = ale.b("container/slot/saddle");
   private static final ale n = ale.b("container/slot/llama_armor");
   private static final ale o = ale.b("container/slot/horse_armor");
   private final btr p;
   private final ckx q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public cvm(int $$0, cqr $$1, btr $$2, final ckx $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.c_($$1.k);
      btr $$5 = $$3.h(bwk.h);
      this.a(new cuo($$5, $$3, bwk.h, 0, 8, 18, m));
      ale $$6 = $$3 instanceof cla ? n : o;
      btr $$7 = $$3.h(bwk.g);
      this.a(new cuo($$7, $$3, bwk.g, 0, 8, 36, $$6) {
         @Override
         public boolean b() {
            return $$3.e(bwk.g) && $$3.aq().a(axd.K);
         }
      });
      if ($$4 > 0) {
         for (int $$8 = 0; $$8 < 3; $$8++) {
            for (int $$9 = 0; $$9 < $$4; $$9++) {
               this.a(new cwh($$2, $$9 + $$8 * $$4, 80 + $$9 * 18, 18 + $$8 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqs $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bK() && $$0.b(this.q, 4.0);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return cys.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cys.k;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return cys.k;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return cys.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return cys.k;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return cys.k;
            }

            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
