public class csk extends csc {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final csp u;
   long v;
   public final bsc p = new bsq(2) {
      @Override
      public void e() {
         csk.this.a(this);
         super.e();
      }
   };
   private final ctu w = new ctu() {
      @Override
      public void e() {
         csk.this.a(this);
         super.e();
      }
   };

   public csk(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public csk(int $$0, cow $$1, final csp $$2) {
      super(ctl.x, $$0);
      this.u = $$2;
      this.a(new ctz(this.p, 0, 15, 15) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.b(kv.L);
         }
      });
      this.a(new ctz(this.p, 1, 15, 52) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.a(cwt.rv) || $$0.a(cwt.vi) || $$0.a(cwt.gi);
         }
      });
      this.a(new ctz(this.w, 2, 145, 39) {
         @Override
         public boolean a(cwp $$0) {
            return false;
         }

         @Override
         public void a(cox $$0, cwp $$1) {
            csk.this.k.get(0).a(1);
            csk.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dW(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (csk.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awa.Bj, awb.e, 1.0F, 1.0F);
                  csk.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cox $$0) {
      return a(this.u, $$0, djo.oz);
   }

   @Override
   public void a(bsc $$0) {
      cwp $$1 = this.p.a(0);
      cwp $$2 = this.p.a(1);
      cwp $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cwp $$0, cwp $$1, cwp $$2) {
      this.u.a(($$3, $$4) -> {
         eut $$5 = cxc.b($$0, $$3);
         if ($$5 != null) {
            cwp $$6;
            if ($$1.a(cwt.rv) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kv.N, czm.b);
               this.d();
            } else if ($$1.a(cwt.gi) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kv.N, czm.a);
               this.d();
            } else {
               if (!$$1.a(cwt.vi)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cwp.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cwp $$0, ctz $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dW(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(kv.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwp.j;
               }
            } else if (!$$4.a(cwt.rv) && !$$4.a(cwt.vi) && !$$4.a(cwt.gi)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwp.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwp.j;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
