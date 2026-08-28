import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class css extends crs {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bsa u = new ctk();
   final bsa v = new bso(2) {
      @Override
      public void e() {
         super.e();
         css.this.a(this);
      }
   };
   private final csf w;

   public css(int $$0, coq $$1) {
      this($$0, $$1, csf.a);
   }

   public css(int $$0, coq $$1, final csf $$2) {
      super(ctb.p, $$0);
      this.w = $$2;
      this.a(new ctp(this.v, 0, 49, 19) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.m() || dby.c($$0);
         }
      });
      this.a(new ctp(this.v, 1, 49, 40) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.m() || dby.c($$0);
         }
      });
      this.a(new ctp(this.u, 2, 129, 34) {
         @Override
         public boolean a(cwf $$0) {
            return false;
         }

         @Override
         public void a(cor $$0, cwf $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arq) {
                  buu.a((arq)$$0x, ezr.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            css.this.v.a(0, cwf.k);
            css.this.v.a(1, cwf.k);
         }

         private int a(dff $$0) {
            int $$1 = 0;
            $$1 += this.g(css.this.v.a(0));
            $$1 += this.g(css.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cwf $$0) {
            int $$1 = 0;
            dcc $$2 = dby.b($$0);

            for (Entry<jq<dbw>> $$3 : $$2.b()) {
               jq<dbw> $$4 = (jq<dbw>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axg.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bsa $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cwf a(cwf $$0, cwf $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cwf.k;
      } else if ($$0.L() <= 1 && $$1.L() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cwf $$4 = !$$0.f() ? $$0 : $$1;
            return !dby.c($$4) ? cwf.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cwf.k;
      }
   }

   private cwf b(cwf $$0, cwf $$1) {
      if (!$$0.a($$1.h())) {
         return cwf.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cwf.a($$0, $$1)) {
               return cwf.k;
            }

            $$6 = 2;
         }

         cwf $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(ku.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cwf $$0, cwf $$1) {
      dby.a($$0, $$1x -> {
         dcc $$2 = dby.b($$1);

         for (Entry<jq<dbw>> $$3 : $$2.b()) {
            jq<dbw> $$4 = (jq<dbw>)$$3.getKey();
            if (!$$4.a(axg.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cwf c(cwf $$0) {
      dcc $$1 = dby.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axg.o)));
      if ($$0.a(cwj.uO) && $$1.d()) {
         $$0 = $$0.a((dfe)cwj.qQ);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = crv.e($$2);
      }

      $$0.b(ku.s, $$2);
      return $$0;
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cor $$0) {
      return a(this.w, $$0, dil.nZ);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         cwf $$5 = this.v.a(0);
         cwf $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwf.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwf.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
