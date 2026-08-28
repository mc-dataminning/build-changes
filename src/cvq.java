import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cvq extends cuq {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final btu u = new cwi();
   final btu v = new bui(2) {
      @Override
      public void e() {
         super.e();
         cvq.this.a(this);
      }
   };
   private final cvd w;

   public cvq(int $$0, cqx $$1) {
      this($$0, $$1, cvd.a);
   }

   public cvq(int $$0, cqx $$1, final cvd $$2) {
      super(cvz.p, $$0);
      this.w = $$2;
      this.a(new cwn(this.v, 0, 49, 19) {
         @Override
         public boolean a(cyy $$0) {
            return $$0.m() || dfn.c($$0);
         }
      });
      this.a(new cwn(this.v, 1, 49, 40) {
         @Override
         public boolean a(cyy $$0) {
            return $$0.m() || dfn.c($$0);
         }
      });
      this.a(new cwn(this.u, 2, 129, 34) {
         @Override
         public boolean a(cyy $$0) {
            return false;
         }

         @Override
         public void a(cqy $$0, cyy $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arq) {
                  bwr.a((arq)$$0x, fei.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cvq.this.v.a(0, cyy.k);
            cvq.this.v.a(1, cyy.k);
         }

         private int a(div $$0) {
            int $$1 = 0;
            $$1 += this.g(cvq.this.v.a(0));
            $$1 += this.g(cvq.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cyy $$0) {
            int $$1 = 0;
            dfr $$2 = dfn.b($$0);

            for (Entry<je<dfl>> $$3 : $$2.b()) {
               je<dfl> $$4 = (je<dfl>)$$3.getKey();
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
   public void a(btu $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cyy a(cyy $$0, cyy $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cyy.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cyy $$4 = !$$0.f() ? $$0 : $$1;
            return !dfn.c($$4) ? cyy.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cyy.k;
      }
   }

   private cyy b(cyy $$0, cyy $$1) {
      if (!$$0.a($$1.h())) {
         return cyy.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cyy.a($$0, $$1)) {
               return cyy.k;
            }

            $$6 = 2;
         }

         cyy $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kj.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cyy $$0, cyy $$1) {
      dfn.a($$0, $$1x -> {
         dfr $$2 = dfn.b($$1);

         for (Entry<je<dfl>> $$3 : $$2.b()) {
            je<dfl> $$4 = (je<dfl>)$$3.getKey();
            if (!$$4.a(axe.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cyy c(cyy $$0) {
      dfr $$1 = dfn.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axe.o)));
      if ($$0.a(czc.vB) && $$1.d()) {
         $$0 = $$0.a((diu)czc.rC);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cut.e($$2);
      }

      $$0.b(kj.r, $$2);
      return $$0;
   }

   @Override
   public void a(cqy $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cqy $$0) {
      return a(this.w, $$0, dmc.oC);
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         cyy $$5 = this.v.a(0);
         cyy $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cyy.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cyy.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cyy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
