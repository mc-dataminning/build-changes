import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cwq extends cvq {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final buk u = new cxi();
   final buk v = new buy(2) {
      @Override
      public void e() {
         super.e();
         cwq.this.a(this);
      }
   };
   private final cwd w;

   public cwq(int $$0, crw $$1) {
      this($$0, $$1, cwd.a);
   }

   public cwq(int $$0, crw $$1, final cwd $$2) {
      super(cwz.p, $$0);
      this.w = $$2;
      this.a(new cxn(this.v, 0, 49, 19) {
         @Override
         public boolean a(czy $$0) {
            return $$0.m() || dgn.c($$0);
         }
      });
      this.a(new cxn(this.v, 1, 49, 40) {
         @Override
         public boolean a(czy $$0) {
            return $$0.m() || dgn.c($$0);
         }
      });
      this.a(new cxn(this.u, 2, 129, 34) {
         @Override
         public boolean a(czy $$0) {
            return false;
         }

         @Override
         public void a(crx $$0, czy $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof ars) {
                  bxh.a((ars)$$0x, ffq.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cwq.this.v.a(0, czy.k);
            cwq.this.v.a(1, czy.k);
         }

         private int a(djx $$0) {
            int $$1 = 0;
            $$1 += this.g(cwq.this.v.a(0));
            $$1 += this.g(cwq.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(czy $$0) {
            int $$1 = 0;
            dgr $$2 = dgn.b($$0);

            for (Entry<jf<dgl>> $$3 : $$2.b()) {
               jf<dgl> $$4 = (jf<dgl>)$$3.getKey();
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
   public void a(buk $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private czy a(czy $$0, czy $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return czy.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            czy $$4 = !$$0.f() ? $$0 : $$1;
            return !dgn.c($$4) ? czy.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return czy.k;
      }
   }

   private czy b(czy $$0, czy $$1) {
      if (!$$0.a($$1.h())) {
         return czy.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !czy.a($$0, $$1)) {
               return czy.k;
            }

            $$6 = 2;
         }

         czy $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kk.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(czy $$0, czy $$1) {
      dgn.a($$0, $$1x -> {
         dgr $$2 = dgn.b($$1);

         for (Entry<jf<dgl>> $$3 : $$2.b()) {
            jf<dgl> $$4 = (jf<dgl>)$$3.getKey();
            if (!$$4.a(axg.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private czy c(czy $$0) {
      dgr $$1 = dgn.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axg.o)));
      if ($$0.a(dac.vG) && $$1.d()) {
         $$0 = $$0.a((djw)dac.rF);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cvt.e($$2);
      }

      $$0.b(kk.r, $$2);
      return $$0;
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(crx $$0) {
      return a(this.w, $$0, dne.oF);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         czy $$5 = this.v.a(0);
         czy $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return czy.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return czy.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return czy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
