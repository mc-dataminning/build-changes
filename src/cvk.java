import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cvk extends cuk {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final btr u = new cwc();
   final btr v = new buf(2) {
      @Override
      public void e() {
         super.e();
         cvk.this.a(this);
      }
   };
   private final cux w;

   public cvk(int $$0, cqr $$1) {
      this($$0, $$1, cux.a);
   }

   public cvk(int $$0, cqr $$1, final cux $$2) {
      super(cvt.p, $$0);
      this.w = $$2;
      this.a(new cwh(this.v, 0, 49, 19) {
         @Override
         public boolean a(cys $$0) {
            return $$0.m() || dfh.c($$0);
         }
      });
      this.a(new cwh(this.v, 1, 49, 40) {
         @Override
         public boolean a(cys $$0) {
            return $$0.m() || dfh.c($$0);
         }
      });
      this.a(new cwh(this.u, 2, 129, 34) {
         @Override
         public boolean a(cys $$0) {
            return false;
         }

         @Override
         public void a(cqs $$0, cys $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aro) {
                  bwo.a((aro)$$0x, fdw.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cvk.this.v.a(0, cys.k);
            cvk.this.v.a(1, cys.k);
         }

         private int a(dip $$0) {
            int $$1 = 0;
            $$1 += this.g(cvk.this.v.a(0));
            $$1 += this.g(cvk.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cys $$0) {
            int $$1 = 0;
            dfl $$2 = dfh.b($$0);

            for (Entry<je<dff>> $$3 : $$2.b()) {
               je<dff> $$4 = (je<dff>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axc.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(btr $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cys a(cys $$0, cys $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cys.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cys $$4 = !$$0.f() ? $$0 : $$1;
            return !dfh.c($$4) ? cys.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cys.k;
      }
   }

   private cys b(cys $$0, cys $$1) {
      if (!$$0.a($$1.h())) {
         return cys.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cys.a($$0, $$1)) {
               return cys.k;
            }

            $$6 = 2;
         }

         cys $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kj.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cys $$0, cys $$1) {
      dfh.a($$0, $$1x -> {
         dfl $$2 = dfh.b($$1);

         for (Entry<je<dff>> $$3 : $$2.b()) {
            je<dff> $$4 = (je<dff>)$$3.getKey();
            if (!$$4.a(axc.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cys c(cys $$0) {
      dfl $$1 = dfh.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axc.o)));
      if ($$0.a(cyw.vz) && $$1.d()) {
         $$0 = $$0.a((dio)cyw.rA);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cun.e($$2);
      }

      $$0.b(kj.r, $$2);
      return $$0;
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cqs $$0) {
      return a(this.w, $$0, dlw.oB);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         cys $$5 = this.v.a(0);
         cys $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cys.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cys.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cys.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
