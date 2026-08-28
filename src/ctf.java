public class ctf extends csd {
   static final akv m = akv.b("container/slot/saddle");
   private static final akv n = akv.b("container/slot/llama_armor");
   private static final akv o = akv.b("container/slot/horse_armor");
   private final bse p;
   private final bse q;
   private final cjd r;
   private static final int s = 1;
   private static final int t = 2;

   public ctf(int $$0, cox $$1, bse $$2, final cjd $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3.hd();
      this.r = $$3;
      $$2.c_($$1.k);
      this.a(new cua($$2, 0, 8, 18) {
         @Override
         public boolean a(cwq $$0) {
            return $$0.a(cwu.on) && !this.h() && $$3.f();
         }

         @Override
         public boolean d() {
            return $$3.f();
         }

         @Override
         public akv b() {
            return ctf.m;
         }
      });
      akv $$5 = $$3 instanceof cjg ? n : o;
      this.a(new csh(this.q, $$3, buu.g, 0, 8, 36, $$5) {
         @Override
         public boolean a(cwq $$0) {
            return $$3.a($$0, buu.g);
         }

         @Override
         public boolean d() {
            return $$3.e(buu.g);
         }
      });
      if ($$4 > 0) {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            for (int $$7 = 0; $$7 < $$4; $$7++) {
               this.a(new cua($$2, 1 + $$7 + $$6 * $$4, 80 + $$7 * 18, 18 + $$6 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(coy $$0) {
      return !this.r.b(this.p) && this.p.a($$0) && this.q.a($$0) && this.r.bL() && $$0.b(this.r, 4.0);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.p.b() + 1;
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return cwq.j;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return cwq.j;
            }
         } else if (this.b(0).a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cwq.j;
            }
         } else if ($$5 <= 1 || !this.a($$4, 2, $$5, false)) {
            int $$7 = $$5 + 27;
            int $$9 = $$7 + 9;
            if ($$1 >= $$7 && $$1 < $$9) {
               if (!this.a($$4, $$5, $$7, false)) {
                  return cwq.j;
               }
            } else if ($$1 >= $$5 && $$1 < $$7) {
               if (!this.a($$4, $$7, $$9, false)) {
                  return cwq.j;
               }
            } else if (!this.a($$4, $$7, $$7, false)) {
               return cwq.j;
            }

            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
