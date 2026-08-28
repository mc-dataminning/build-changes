public class cty extends csw {
   static final aku m = aku.b("container/slot/saddle");
   private static final aku n = aku.b("container/slot/llama_armor");
   private static final aku o = aku.b("container/slot/horse_armor");
   private final bsr p;
   private final bsr q;
   private final cjw r;
   private static final int s = 1;
   private static final int t = 2;

   public cty(int $$0, cpq $$1, bsr $$2, final cjw $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3.hd();
      this.r = $$3;
      $$2.c_($$1.k);
      this.a(new cut($$2, 0, 8, 18) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.a(cxl.op) && !this.h() && $$3.e();
         }

         @Override
         public boolean d() {
            return $$3.e();
         }

         @Override
         public aku b() {
            return cty.m;
         }
      });
      aku $$5 = $$3 instanceof cjz ? n : o;
      this.a(new cta(this.q, $$3, bvj.g, 0, 8, 36, $$5) {
         @Override
         public boolean a(cxh $$0) {
            return $$3.a($$0, bvj.g);
         }

         @Override
         public boolean d() {
            return $$3.e(bvj.g);
         }
      });
      if ($$4 > 0) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < $$4; $$7++) {
               this.a(new cut($$2, 1 + $$7 + $$6 * $$4, 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpr $$0) {
      return !this.r.b(this.p) && this.p.a($$0) && this.q.a($$0) && this.r.bJ() && $$0.b(this.r, 4.0);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.p.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return cxh.k;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cxh.k;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cxh.k;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cxh.k;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cxh.k;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cxh.k;
            }

            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
