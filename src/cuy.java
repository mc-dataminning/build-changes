public class cuy extends cuq {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cvd u;
   long v;
   public final btu p = new bui(2) {
      @Override
      public void e() {
         cuy.this.a(this);
         super.e();
      }
   };
   private final cwi w = new cwi() {
      @Override
      public void e() {
         cuy.this.a(this);
         super.e();
      }
   };

   public cuy(int $$0, cqx $$1) {
      this($$0, $$1, cvd.a);
   }

   public cuy(int $$0, cqx $$1, final cvd $$2) {
      super(cvz.x, $$0);
      this.u = $$2;
      this.a(new cwn(this.p, 0, 15, 15) {
         @Override
         public boolean a(cyy $$0) {
            return $$0.c(kj.M);
         }
      });
      this.a(new cwn(this.p, 1, 15, 52) {
         @Override
         public boolean a(cyy $$0) {
            return $$0.a(czc.rB) || $$0.a(czc.vo) || $$0.a(czc.gm);
         }
      });
      this.a(new cwn(this.w, 2, 145, 39) {
         @Override
         public boolean a(cyy $$0) {
            return false;
         }

         @Override
         public void a(cqy $$0, cyy $$1) {
            cuy.this.k.get(0).a(1);
            cuy.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dV(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cuy.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awn.Bv, awo.e, 1.0F, 1.0F);
                  cuy.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqy $$0) {
      return a(this.u, $$0, dmc.oA);
   }

   @Override
   public void a(btu $$0) {
      cyy $$1 = this.p.a(0);
      cyy $$2 = this.p.a(1);
      cyy $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cyy $$0, cyy $$1, cyy $$2) {
      this.u.a(($$3, $$4) -> {
         eyb $$5 = czl.b($$0, $$3);
         if ($$5 != null) {
            cyy $$6;
            if ($$1.a(czc.rB) && !$$5.i && $$5.g < 4) {
               $$6 = $$0.c(1);
               $$6.b(kj.O, dbv.b);
               this.d();
            } else if ($$1.a(czc.gm) && !$$5.i) {
               $$6 = $$0.c(1);
               $$6.b(kj.O, dbv.a);
               this.d();
            } else {
               if (!$$1.a(czc.vo)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cyy.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cyy $$0, cwn $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kj.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cyy.k;
               }
            } else if (!$$4.a(czc.rB) && !$$4.a(czc.vo) && !$$4.a(czc.gm)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cyy.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cyy.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return cyy.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cqy $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
