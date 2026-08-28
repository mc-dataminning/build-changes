import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class ctx extends csx {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bsx u = new cup();
   final bsx v = new btl(2) {
      @Override
      public void e() {
         super.e();
         ctx.this.a(this);
      }
   };
   private final ctk w;

   public ctx(int $$0, cpr $$1) {
      this($$0, $$1, ctk.a);
   }

   public ctx(int $$0, cpr $$1, final ctk $$2) {
      super(cug.p, $$0);
      this.w = $$2;
      this.a(new cuu(this.v, 0, 49, 19) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.m() || ddt.c($$0);
         }
      });
      this.a(new cuu(this.v, 1, 49, 40) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.m() || ddt.c($$0);
         }
      });
      this.a(new cuu(this.u, 2, 129, 34) {
         @Override
         public boolean a(cxk $$0) {
            return false;
         }

         @Override
         public void a(cps $$0, cxk $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof ash) {
                  bvr.a((ash)$$0x, fbs.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            ctx.this.v.a(0, cxk.k);
            ctx.this.v.a(1, cxk.k);
         }

         private int a(dha $$0) {
            int $$1 = 0;
            $$1 += this.g(ctx.this.v.a(0));
            $$1 += this.g(ctx.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cxk $$0) {
            int $$1 = 0;
            ddx $$2 = ddt.b($$0);

            for (Entry<jq<ddr>> $$3 : $$2.b()) {
               jq<ddr> $$4 = (jq<ddr>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axx.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bsx $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cxk a(cxk $$0, cxk $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cxk.k;
      } else if ($$0.L() <= 1 && $$1.L() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cxk $$4 = !$$0.f() ? $$0 : $$1;
            return !ddt.c($$4) ? cxk.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cxk.k;
      }
   }

   private cxk b(cxk $$0, cxk $$1) {
      if (!$$0.a($$1.h())) {
         return cxk.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cxk.a($$0, $$1)) {
               return cxk.k;
            }

            $$6 = 2;
         }

         cxk $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(ku.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cxk $$0, cxk $$1) {
      ddt.a($$0, $$1x -> {
         ddx $$2 = ddt.b($$1);

         for (Entry<jq<ddr>> $$3 : $$2.b()) {
            jq<ddr> $$4 = (jq<ddr>)$$3.getKey();
            if (!$$4.a(axx.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cxk c(cxk $$0) {
      ddx $$1 = ddt.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axx.o)));
      if ($$0.a(cxo.vm) && $$1.d()) {
         $$0 = $$0.a((dgz)cxo.rn);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cta.e($$2);
      }

      $$0.b(ku.s, $$2);
      return $$0;
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cps $$0) {
      return a(this.w, $$0, dkg.ou);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         cxk $$5 = this.v.a(0);
         cxk $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxk.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxk.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cxk.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
