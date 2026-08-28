public class csi extends csa {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final csn u;
   long v;
   public final bsb p = new bsp(2) {
      @Override
      public void e() {
         csi.this.a(this);
         super.e();
      }
   };
   private final cts w = new cts() {
      @Override
      public void e() {
         csi.this.a(this);
         super.e();
      }
   };

   public csi(int $$0, cou $$1) {
      this($$0, $$1, csn.a);
   }

   public csi(int $$0, cou $$1, final csn $$2) {
      super(ctj.x, $$0);
      this.u = $$2;
      this.a(new ctx(this.p, 0, 15, 15) {
         @Override
         public boolean a(cwn $$0) {
            return $$0.b(kv.L);
         }
      });
      this.a(new ctx(this.p, 1, 15, 52) {
         @Override
         public boolean a(cwn $$0) {
            return $$0.a(cwr.rv) || $$0.a(cwr.vi) || $$0.a(cwr.gi);
         }
      });
      this.a(new ctx(this.w, 2, 145, 39) {
         @Override
         public boolean a(cwn $$0) {
            return false;
         }

         @Override
         public void a(cov $$0, cwn $$1) {
            csi.this.k.get(0).a(1);
            csi.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dW(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (csi.this.v != $$2xx) {
                  $$0x.a(null, $$1x, avz.Bi, awa.e, 1.0F, 1.0F);
                  csi.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cov $$0) {
      return a(this.u, $$0, djm.oz);
   }

   @Override
   public void a(bsb $$0) {
      cwn $$1 = this.p.a(0);
      cwn $$2 = this.p.a(1);
      cwn $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cwn $$0, cwn $$1, cwn $$2) {
      this.u.a(($$3, $$4) -> {
         eur $$5 = cxa.b($$0, $$3);
         if ($$5 != null) {
            cwn $$6;
            if ($$1.a(cwr.rv) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kv.N, czk.b);
               this.d();
            } else if ($$1.a(cwr.gi) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kv.N, czk.a);
               this.d();
            } else {
               if (!$$1.a(cwr.vi)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cwn.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cwn $$0, ctx $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dW(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cwn.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(kv.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwn.j;
               }
            } else if (!$$4.a(cwr.rv) && !$$4.a(cwr.vi) && !$$4.a(cwr.gi)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwn.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwn.j;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cwn.j;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
