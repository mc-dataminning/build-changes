import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cqn extends cpp {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bqi s = new crf();
   final bqi t = new bqy(2) {
      @Override
      public void e() {
         super.e();
         cqn.this.a(this);
      }
   };
   private final cqa u;

   public cqn(int $$0, cmr $$1) {
      this($$0, $$1, cqa.a);
   }

   public cqn(int $$0, cmr $$1, final cqa $$2) {
      super(cqw.p, $$0);
      this.u = $$2;
      this.a(new crk(this.t, 0, 49, 19) {
         @Override
         public boolean a(cuk $$0) {
            return $$0.l() || czw.c($$0);
         }
      });
      this.a(new crk(this.t, 1, 49, 40) {
         @Override
         public boolean a(cuk $$0) {
            return $$0.l() || czw.c($$0);
         }
      });
      this.a(new crk(this.s, 2, 129, 34) {
         @Override
         public boolean a(cuk $$0) {
            return false;
         }

         @Override
         public void a(cms $$0, cuk $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arb) {
                  bta.a((arb)$$0x, evm.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cqn.this.t.a(0, cuk.l);
            cqn.this.t.a(1, cuk.l);
         }

         private int a(dbt $$0) {
            int $$1 = 0;
            $$1 += this.g(cqn.this.t.a(0));
            $$1 += this.g(cqn.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cuk $$0) {
            int $$1 = 0;
            daa $$2 = czw.b($$0);

            for (Entry<ji<czv>> $$3 : $$2.b()) {
               czv $$4 = (czv)((ji)$$3.getKey()).a();
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
            this.a(new crk($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crk($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bqi $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cuk a(cuk $$0, cuk $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return cuk.l;
      } else if ($$0.I() <= 1 && $$1.I() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            cuk $$4 = !$$0.e() ? $$0 : $$1;
            return !czw.c($$4) ? cuk.l : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cuk.l;
      }
   }

   private cuk b(cuk $$0, cuk $$1) {
      if (!$$0.a($$1.g())) {
         return cuk.l;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !cuk.a($$0, $$1)) {
               return cuk.l;
            }

            $$6 = 2;
         }

         cuk $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(km.c, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cuk $$0, cuk $$1) {
      czw.a($$0, $$1x -> {
         daa $$2 = czw.b($$1);

         for (Entry<ji<czv>> $$3 : $$2.b()) {
            czv $$4 = (czv)((ji)$$3.getKey()).a();
            if (!$$4.b() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cuk c(cuk $$0) {
      daa $$1 = czw.a($$0, $$0x -> $$0x.a($$0xx -> !((czv)$$0xx.a()).b()));
      if ($$0.a(cun.uw) && $$1.d()) {
         $$0 = $$0.a(cun.qP, $$0.I());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cpr.e($$2);
      }

      $$0.b(km.q, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cms $$0) {
      return a(this.u, $$0, dew.nZ);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         cuk $$5 = this.t.a(0);
         cuk $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cuk.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cuk.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cuk.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cuk.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
