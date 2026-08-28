public class cup extends ctn {
   private static final ald m = ald.b("container/slot/saddle");
   private static final ald n = ald.b("container/slot/llama_armor");
   private static final ald o = ald.b("container/slot/horse_armor");
   private final btj p;
   private final ckn q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public cup(int $$0, cqh $$1, btj $$2, ckn $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.c_($$1.k);
      btj $$5 = $$3.h(bwc.g);
      btj $$6 = $$3.h(bwc.h);
      this.a(new ctr($$6, $$3, bwc.h, 0, 8, 18, m));
      ald $$7 = $$3 instanceof ckq ? n : o;
      this.a(new ctr($$5, $$3, bwc.g, 0, 8, 36, $$7));
      if ($$4 > 0) {
         for (int $$8 = 0; $$8 < 3; $$8++) {
            for (int $$9 = 0; $$9 < $$4; $$9++) {
               this.a(new cvk($$2, $$9 + $$8 * $$4, 80 + $$9 * 18, 18 + $$8 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqi $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bK() && $$0.b(this.q, 4.0);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return cxy.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cxy.k;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return cxy.k;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return cxy.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return cxy.k;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return cxy.k;
            }

            return cxy.k;
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
