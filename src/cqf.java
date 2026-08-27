import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cqf extends cpg {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bpt s = new cqz();
   final bpt t = new bqj(2) {
      @Override
      public void e() {
         super.e();
         cqf.this.a(this);
      }
   };
   private final cpr u;

   public cqf(int $$0, clx $$1) {
      this($$0, $$1, cpr.a);
   }

   public cqf(int $$0, clx $$1, final cpr $$2) {
      super(cqo.q, $$0);
      this.u = $$2;
      this.a(new cre(this.t, 0, 49, 19) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.k() || dae.c($$0);
         }
      });
      this.a(new cre(this.t, 1, 49, 40) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.k() || dae.c($$0);
         }
      });
      this.a(new cre(this.s, 2, 129, 34) {
         @Override
         public boolean a(cuh $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, cuh $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqt) {
                  bse.a((aqt)$$0x, ewu.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cqf.this.t.a(0, cuh.i);
            cqf.this.t.a(1, cuh.i);
         }

         private int a(dca $$0) {
            int $$1 = 0;
            $$1 += this.d(cqf.this.t.a(0));
            $$1 += this.d(cqf.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int d(cuh $$0) {
            int $$1 = 0;
            dai $$2 = dae.b($$0);

            for (Entry<ja<dad>> $$3 : $$2.b()) {
               dad $$4 = (dad)((ja)$$3.getKey()).a();
               int $$5 = $$3.getIntValue();
               if (!$$4.b()) {
                  $$1 += $$4.c($$5);
               }
            }

            return $$1;
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bpt $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cuh a(cuh $$0, cuh $$1) {
      boolean $$2 = !$$0.d() || !$$1.d();
      if (!$$2) {
         return cuh.i;
      } else if ($$0.G() <= 1 && $$1.G() <= 1) {
         boolean $$3 = !$$0.d() && !$$1.d();
         if (!$$3) {
            cuh $$4 = !$$0.d() ? $$0 : $$1;
            return !dae.c($$4) ? cuh.i : this.c($$4.r());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cuh.i;
      }
   }

   private cuh b(cuh $$0, cuh $$1) {
      if (!$$0.a($$1.f())) {
         return cuh.i;
      } else {
         int $$2 = Math.max($$0.n(), $$1.n());
         int $$3 = $$0.n() - $$0.m();
         int $$4 = $$1.n() - $$1.m();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.k()) {
            if ($$0.i() < 2 || !cuh.a($$0, $$1)) {
               return cuh.i;
            }

            $$6 = 2;
         }

         cuh $$7 = $$0.c($$6);
         if ($$7.k()) {
            $$7.b(ke.c, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cuh $$0, cuh $$1) {
      dae.a($$0, $$1x -> {
         dai $$2 = dae.b($$1);

         for (Entry<ja<dad>> $$3 : $$2.b()) {
            dad $$4 = (dad)((ja)$$3.getKey()).a();
            if (!$$4.b() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cuh c(cuh $$0) {
      dai $$1 = dae.a($$0, $$0x -> $$0x.a($$0xx -> !((dad)$$0xx.a()).b()));
      if ($$0.a(cuk.wh) && $$1.d()) {
         $$0 = $$0.a(cuk.sm, $$0.G());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cpi.e($$2);
      }

      $$0.b(ke.p, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.u, $$0, dfe.oX);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         cuh $$5 = this.t.a(0);
         cuh $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.d() && !$$6.d()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuh.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuh.i;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
