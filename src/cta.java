import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cta extends csa {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bsb u = new cts();
   final bsb v = new bsp(2) {
      @Override
      public void e() {
         super.e();
         cta.this.a(this);
      }
   };
   private final csn w;

   public cta(int $$0, cou $$1) {
      this($$0, $$1, csn.a);
   }

   public cta(int $$0, cou $$1, final csn $$2) {
      super(ctj.p, $$0);
      this.w = $$2;
      this.a(new ctx(this.v, 0, 49, 19) {
         @Override
         public boolean a(cwn $$0) {
            return $$0.m() || dcz.c($$0);
         }
      });
      this.a(new ctx(this.v, 1, 49, 40) {
         @Override
         public boolean a(cwn $$0) {
            return $$0.m() || dcz.c($$0);
         }
      });
      this.a(new ctx(this.u, 2, 129, 34) {
         @Override
         public boolean a(cwn $$0) {
            return false;
         }

         @Override
         public void a(cov $$0, cwn $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arc) {
                  buv.a((arc)$$0x, fay.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cta.this.v.a(0, cwn.j);
            cta.this.v.a(1, cwn.j);
         }

         private int a(dgg $$0) {
            int $$1 = 0;
            $$1 += this.g(cta.this.v.a(0));
            $$1 += this.g(cta.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cwn $$0) {
            int $$1 = 0;
            ddd $$2 = dcz.b($$0);

            for (Entry<jr<dcx>> $$3 : $$2.b()) {
               jr<dcx> $$4 = (jr<dcx>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(awr.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bsb $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cwn a(cwn $$0, cwn $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cwn.j;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cwn $$4 = !$$0.f() ? $$0 : $$1;
            return !dcz.c($$4) ? cwn.j : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cwn.j;
      }
   }

   private cwn b(cwn $$0, cwn $$1) {
      if (!$$0.a($$1.h())) {
         return cwn.j;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cwn.a($$0, $$1)) {
               return cwn.j;
            }

            $$6 = 2;
         }

         cwn $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kv.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cwn $$0, cwn $$1) {
      dcz.a($$0, $$1x -> {
         ddd $$2 = dcz.b($$1);

         for (Entry<jr<dcx>> $$3 : $$2.b()) {
            jr<dcx> $$4 = (jr<dcx>)$$3.getKey();
            if (!$$4.a(awr.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cwn c(cwn $$0) {
      ddd $$1 = dcz.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(awr.o)));
      if ($$0.a(cwr.vv) && $$1.d()) {
         $$0 = $$0.a((dgf)cwr.rw);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = csd.e($$2);
      }

      $$0.b(kv.s, $$2);
      return $$0;
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cov $$0) {
      return a(this.w, $$0, djm.oB);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         cwn $$5 = this.v.a(0);
         cwn $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwn.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwn.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwn.j;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwn.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
