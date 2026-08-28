import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cvv extends cuv {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final btw u = new cwn();
   final btw v = new buk(2) {
      @Override
      public void e() {
         super.e();
         cvv.this.a(this);
      }
   };
   private final cvi w;

   public cvv(int $$0, crb $$1) {
      this($$0, $$1, cvi.a);
   }

   public cvv(int $$0, crb $$1, final cvi $$2) {
      super(cwe.p, $$0);
      this.w = $$2;
      this.a(new cws(this.v, 0, 49, 19) {
         @Override
         public boolean a(czd $$0) {
            return $$0.m() || dfs.c($$0);
         }
      });
      this.a(new cws(this.v, 1, 49, 40) {
         @Override
         public boolean a(czd $$0) {
            return $$0.m() || dfs.c($$0);
         }
      });
      this.a(new cws(this.u, 2, 129, 34) {
         @Override
         public boolean a(czd $$0) {
            return false;
         }

         @Override
         public void a(crc $$0, czd $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arq) {
                  bwt.a((arq)$$0x, feq.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cvv.this.v.a(0, czd.k);
            cvv.this.v.a(1, czd.k);
         }

         private int a(dja $$0) {
            int $$1 = 0;
            $$1 += this.g(cvv.this.v.a(0));
            $$1 += this.g(cvv.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(czd $$0) {
            int $$1 = 0;
            dfw $$2 = dfs.b($$0);

            for (Entry<je<dfq>> $$3 : $$2.b()) {
               je<dfq> $$4 = (je<dfq>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axe.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(btw $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private czd a(czd $$0, czd $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return czd.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            czd $$4 = !$$0.f() ? $$0 : $$1;
            return !dfs.c($$4) ? czd.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return czd.k;
      }
   }

   private czd b(czd $$0, czd $$1) {
      if (!$$0.a($$1.h())) {
         return czd.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !czd.a($$0, $$1)) {
               return czd.k;
            }

            $$6 = 2;
         }

         czd $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kj.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(czd $$0, czd $$1) {
      dfs.a($$0, $$1x -> {
         dfw $$2 = dfs.b($$1);

         for (Entry<je<dfq>> $$3 : $$2.b()) {
            je<dfq> $$4 = (je<dfq>)$$3.getKey();
            if (!$$4.a(axe.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private czd c(czd $$0) {
      dfw $$1 = dfs.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axe.o)));
      if ($$0.a(czh.vG) && $$1.d()) {
         $$0 = $$0.a((diz)czh.rF);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cuy.e($$2);
      }

      $$0.b(kj.r, $$2);
      return $$0;
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(crc $$0) {
      return a(this.w, $$0, dmh.oF);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         czd $$5 = this.v.a(0);
         czd $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return czd.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return czd.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return czd.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return czd.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czd.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
