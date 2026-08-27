import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cof extends cnh {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final boj s = new coy();
   final boj t = new boz(2) {
      @Override
      public void e() {
         super.e();
         cof.this.a(this);
      }
   };
   private final cns u;

   public cof(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public cof(int $$0, ckk $$1, final cns $$2) {
      super(cop.p, $$0);
      this.u = $$2;
      this.a(new cpd(this.t, 0, 49, 19) {
         @Override
         public boolean a(csd $$0) {
            return $$0.k() || cxo.c($$0);
         }
      });
      this.a(new cpd(this.t, 1, 49, 40) {
         @Override
         public boolean a(csd $$0) {
            return $$0.k() || cxo.c($$0);
         }
      });
      this.a(new cpd(this.s, 2, 129, 34) {
         @Override
         public boolean a(csd $$0) {
            return false;
         }

         @Override
         public void a(ckl $$0, csd $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqe) {
                  bqu.a((aqe)$$0x, etf.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cof.this.t.a(0, csd.i);
            cof.this.t.a(1, csd.i);
         }

         private int a(czu $$0) {
            int $$1 = 0;
            $$1 += this.g(cof.this.t.a(0));
            $$1 += this.g(cof.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(csd $$0) {
            int $$1 = 0;
            cxu $$2 = cxo.b($$0);

            for (Entry<iv<cxn>> $$3 : $$2.b()) {
               cxn $$4 = (cxn)((iv)$$3.getKey()).a();
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
            this.a(new cpd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpd($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(boj $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private csd a(csd $$0, csd $$1) {
      boolean $$2 = !$$0.d() || !$$1.d();
      if (!$$2) {
         return csd.i;
      } else if ($$0.G() <= 1 && $$1.G() <= 1) {
         boolean $$3 = !$$0.d() && !$$1.d();
         if (!$$3) {
            csd $$4 = !$$0.d() ? $$0 : $$1;
            return !cxo.c($$4) ? csd.i : this.c($$4.r());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return csd.i;
      }
   }

   private csd b(csd $$0, csd $$1) {
      if (!$$0.a($$1.f())) {
         return csd.i;
      } else {
         cry $$2 = $$0.f();
         int $$3 = $$2.r() - $$0.m();
         int $$4 = $$2.r() - $$1.m();
         int $$5 = $$3 + $$4 + $$2.r() * 5 / 100;
         int $$6 = Math.max($$2.r() - $$5, 0);
         int $$7 = 1;
         if (!$$0.k()) {
            if ($$0.i() < 2 || !csd.a($$0, $$1)) {
               return csd.i;
            }

            $$7 = 2;
         }

         csd $$8 = $$0.c($$7);
         if ($$8.k()) {
            $$8.b($$6);
         }

         this.c($$0, $$1);
         return this.c($$8);
      }
   }

   private void c(csd $$0, csd $$1) {
      cxo.a($$0, $$1x -> {
         cxu $$2 = cxo.b($$1);

         for (Entry<iv<cxn>> $$3 : $$2.b()) {
            cxn $$4 = (cxn)((iv)$$3.getKey()).a();
            if (!$$4.c() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private csd c(csd $$0) {
      cxu $$1 = cxo.a($$0, $$0x -> $$0x.a($$0xx -> !((cxn)$$0xx.a()).c()));
      if ($$0.a(csg.uw) && $$1.d()) {
         $$0 = $$0.a(csg.qP, $$0.G());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cnj.e($$2);
      }

      $$0.b(jz.l, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(ckl $$0) {
      return a(this.u, $$0, dcx.nZ);
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         csd $$5 = this.t.a(0);
         csd $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return csd.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.d() && !$$6.d()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return csd.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return csd.i;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return csd.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return csd.i;
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csd.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
