import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cqu extends cpw {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bqp s = new crm();
   final bqp t = new brf(2) {
      @Override
      public void e() {
         super.e();
         cqu.this.a(this);
      }
   };
   private final cqh u;

   public cqu(int $$0, cmy $$1) {
      this($$0, $$1, cqh.a);
   }

   public cqu(int $$0, cmy $$1, final cqh $$2) {
      super(crd.p, $$0);
      this.u = $$2;
      this.a(new crr(this.t, 0, 49, 19) {
         @Override
         public boolean a(cur $$0) {
            return $$0.l() || dad.c($$0);
         }
      });
      this.a(new crr(this.t, 1, 49, 40) {
         @Override
         public boolean a(cur $$0) {
            return $$0.l() || dad.c($$0);
         }
      });
      this.a(new crr(this.s, 2, 129, 34) {
         @Override
         public boolean a(cur $$0) {
            return false;
         }

         @Override
         public void a(cmz $$0, cur $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arf) {
                  bth.a((arf)$$0x, evt.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cqu.this.t.a(0, cur.l);
            cqu.this.t.a(1, cur.l);
         }

         private int a(dca $$0) {
            int $$1 = 0;
            $$1 += this.g(cqu.this.t.a(0));
            $$1 += this.g(cqu.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cur $$0) {
            int $$1 = 0;
            dah $$2 = dad.b($$0);

            for (Entry<ji<dac>> $$3 : $$2.b()) {
               dac $$4 = (dac)((ji)$$3.getKey()).a();
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
            this.a(new crr($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crr($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bqp $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cur a(cur $$0, cur $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return cur.l;
      } else if ($$0.I() <= 1 && $$1.I() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            cur $$4 = !$$0.e() ? $$0 : $$1;
            return !dad.c($$4) ? cur.l : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cur.l;
      }
   }

   private cur b(cur $$0, cur $$1) {
      if (!$$0.a($$1.g())) {
         return cur.l;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !cur.a($$0, $$1)) {
               return cur.l;
            }

            $$6 = 2;
         }

         cur $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(km.d, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cur $$0, cur $$1) {
      dad.a($$0, $$1x -> {
         dah $$2 = dad.b($$1);

         for (Entry<ji<dac>> $$3 : $$2.b()) {
            dac $$4 = (dac)((ji)$$3.getKey()).a();
            if (!$$4.b() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cur c(cur $$0) {
      dah $$1 = dad.a($$0, $$0x -> $$0x.a($$0xx -> !((dac)$$0xx.a()).b()));
      if ($$0.a(cuu.uw) && $$1.d()) {
         $$0 = $$0.a(cuu.qP, $$0.I());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cpy.e($$2);
      }

      $$0.b(km.r, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(cmz $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cmz $$0) {
      return a(this.u, $$0, dfd.nZ);
   }

   @Override
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         $$2 = $$4.s();
         cur $$5 = this.t.a(0);
         cur $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cur.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cur.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cur.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cur.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.e(cur.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cur.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
