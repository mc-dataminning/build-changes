import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class csj extends crj {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final brr u = new ctb();
   final brr v = new bsf(2) {
      @Override
      public void e() {
         super.e();
         csj.this.a(this);
      }
   };
   private final crw w;

   public csj(int $$0, cog $$1) {
      this($$0, $$1, crw.a);
   }

   public csj(int $$0, cog $$1, final crw $$2) {
      super(css.p, $$0);
      this.w = $$2;
      this.a(new ctg(this.v, 0, 49, 19) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.m() || dbo.c($$0);
         }
      });
      this.a(new ctg(this.v, 1, 49, 40) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.m() || dbo.c($$0);
         }
      });
      this.a(new ctg(this.u, 2, 129, 34) {
         @Override
         public boolean a(cvx $$0) {
            return false;
         }

         @Override
         public void a(coh $$0, cvx $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arm) {
                  bul.a((arm)$$0x, ezh.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            csj.this.v.a(0, cvx.k);
            csj.this.v.a(1, cvx.k);
         }

         private int a(dev $$0) {
            int $$1 = 0;
            $$1 += this.g(csj.this.v.a(0));
            $$1 += this.g(csj.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cvx $$0) {
            int $$1 = 0;
            dbs $$2 = dbo.b($$0);

            for (Entry<jp<dbm>> $$3 : $$2.b()) {
               jp<dbm> $$4 = (jp<dbm>)$$3.getKey();
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
   public void a(brr $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cvx a(cvx $$0, cvx $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cvx.k;
      } else if ($$0.L() <= 1 && $$1.L() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cvx $$4 = !$$0.f() ? $$0 : $$1;
            return !dbo.c($$4) ? cvx.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cvx.k;
      }
   }

   private cvx b(cvx $$0, cvx $$1) {
      if (!$$0.a($$1.h())) {
         return cvx.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cvx.a($$0, $$1)) {
               return cvx.k;
            }

            $$6 = 2;
         }

         cvx $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kt.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cvx $$0, cvx $$1) {
      dbo.a($$0, $$1x -> {
         dbs $$2 = dbo.b($$1);

         for (Entry<jp<dbm>> $$3 : $$2.b()) {
            jp<dbm> $$4 = (jp<dbm>)$$3.getKey();
            if (!$$4.a(axc.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cvx c(cvx $$0) {
      dbs $$1 = dbo.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axc.o)));
      if ($$0.a(cwb.uy) && $$1.d()) {
         $$0 = $$0.a((deu)cwb.qQ);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = crm.e($$2);
      }

      $$0.b(kt.s, $$2);
      return $$0;
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(coh $$0) {
      return a(this.w, $$0, dia.nZ);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         cvx $$5 = this.v.a(0);
         cvx $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvx.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cvx.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cvx.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
