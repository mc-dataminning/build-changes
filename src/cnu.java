import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cnu extends cmw {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bny s = new com();
   final bny t = new boo(2) {
      @Override
      public void e() {
         super.e();
         cnu.this.a(this);
      }
   };
   private final cnh u;

   public cnu(int $$0, cjz $$1) {
      this($$0, $$1, cnh.a);
   }

   public cnu(int $$0, cjz $$1, final cnh $$2) {
      super(cod.p, $$0);
      this.u = $$2;
      this.a(new cos(this.t, 0, 49, 19) {
         @Override
         public boolean a(crs $$0) {
            return $$0.k() || cxa.c($$0);
         }
      });
      this.a(new cos(this.t, 1, 49, 40) {
         @Override
         public boolean a(crs $$0) {
            return $$0.k() || cxa.c($$0);
         }
      });
      this.a(new cos(this.s, 2, 129, 34) {
         @Override
         public boolean a(crs $$0) {
            return false;
         }

         @Override
         public void a(cka $$0, crs $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof apu) {
                  bqj.a((apu)$$0x, esj.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cnu.this.t.a(0, crs.i);
            cnu.this.t.a(1, crs.i);
         }

         private int a(czg $$0) {
            int $$1 = 0;
            $$1 += this.g(cnu.this.t.a(0));
            $$1 += this.g(cnu.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(crs $$0) {
            int $$1 = 0;
            cxg $$2 = cxa.b($$0);

            for (Entry<in<cwz>> $$3 : $$2.b()) {
               cwz $$4 = (cwz)((in)$$3.getKey()).a();
               int $$5 = $$3.getIntValue();
               if (!$$4.c()) {
                  $$1 += $$4.a($$5);
               }
            }

            return $$1;
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cos($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cos($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bny $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private crs a(crs $$0, crs $$1) {
      boolean $$2 = !$$0.d() || !$$1.d();
      if (!$$2) {
         return crs.i;
      } else if ($$0.G() <= 1 && $$1.G() <= 1) {
         boolean $$3 = !$$0.d() && !$$1.d();
         if (!$$3) {
            crs $$4 = !$$0.d() ? $$0 : $$1;
            return !cxa.c($$4) ? crs.i : this.c($$4.r());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return crs.i;
      }
   }

   private crs b(crs $$0, crs $$1) {
      if (!$$0.a($$1.f())) {
         return crs.i;
      } else {
         crn $$2 = $$0.f();
         int $$3 = $$2.r() - $$0.m();
         int $$4 = $$2.r() - $$1.m();
         int $$5 = $$3 + $$4 + $$2.r() * 5 / 100;
         int $$6 = Math.max($$2.r() - $$5, 0);
         int $$7 = 1;
         if (!$$0.k()) {
            if ($$0.i() < 2 || !crs.a($$0, $$1)) {
               return crs.i;
            }

            $$7 = 2;
         }

         crs $$8 = $$0.c($$7);
         if ($$8.k()) {
            $$8.b($$6);
         }

         this.c($$0, $$1);
         return this.c($$8);
      }
   }

   private void c(crs $$0, crs $$1) {
      cxa.a($$0, $$1x -> {
         cxg $$2 = cxa.b($$1);

         for (Entry<in<cwz>> $$3 : $$2.b()) {
            cwz $$4 = (cwz)((in)$$3.getKey()).a();
            if (!$$4.c() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private crs c(crs $$0) {
      cxg $$1 = cxa.a($$0, $$0x -> $$0x.a($$0xx -> !((cwz)$$0xx.a()).c()));
      if ($$0.a(crv.uu) && $$1.d()) {
         $$0 = $$0.a(crv.qO, $$0.G());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cmy.e($$2);
      }

      $$0.b(jr.l, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cka $$0) {
      return a(this.u, $$0, dcj.nZ);
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         crs $$5 = this.t.a(0);
         crs $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return crs.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.d() && !$$6.d()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return crs.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return crs.i;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return crs.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
