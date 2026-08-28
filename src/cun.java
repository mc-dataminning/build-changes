import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cun extends ctn {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final btj u = new cvf();
   final btj v = new btx(2) {
      @Override
      public void e() {
         super.e();
         cun.this.a(this);
      }
   };
   private final cua w;

   public cun(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public cun(int $$0, cqh $$1, final cua $$2) {
      super(cuw.p, $$0);
      this.w = $$2;
      this.a(new cvk(this.v, 0, 49, 19) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.m() || dej.c($$0);
         }
      });
      this.a(new cvk(this.v, 1, 49, 40) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.m() || dej.c($$0);
         }
      });
      this.a(new cvk(this.u, 2, 129, 34) {
         @Override
         public boolean a(cxy $$0) {
            return false;
         }

         @Override
         public void a(cqi $$0, cxy $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arn) {
                  bwg.a((arn)$$0x, fcu.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cun.this.v.a(0, cxy.k);
            cun.this.v.a(1, cxy.k);
         }

         private int a(dhp $$0) {
            int $$1 = 0;
            $$1 += this.g(cun.this.v.a(0));
            $$1 += this.g(cun.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cxy $$0) {
            int $$1 = 0;
            den $$2 = dej.b($$0);

            for (Entry<js<deh>> $$3 : $$2.b()) {
               js<deh> $$4 = (js<deh>)$$3.getKey();
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
   public void a(btj $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cxy a(cxy $$0, cxy $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cxy.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cxy $$4 = !$$0.f() ? $$0 : $$1;
            return !dej.c($$4) ? cxy.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cxy.k;
      }
   }

   private cxy b(cxy $$0, cxy $$1) {
      if (!$$0.a($$1.h())) {
         return cxy.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cxy.a($$0, $$1)) {
               return cxy.k;
            }

            $$6 = 2;
         }

         cxy $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kx.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cxy $$0, cxy $$1) {
      dej.a($$0, $$1x -> {
         den $$2 = dej.b($$1);

         for (Entry<js<deh>> $$3 : $$2.b()) {
            js<deh> $$4 = (js<deh>)$$3.getKey();
            if (!$$4.a(axc.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cxy c(cxy $$0) {
      den $$1 = dej.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axc.o)));
      if ($$0.a(cyc.vz) && $$1.d()) {
         $$0 = $$0.a((dho)cyc.rA);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = ctq.e($$2);
      }

      $$0.b(kx.s, $$2);
      return $$0;
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cqi $$0) {
      return a(this.w, $$0, dkw.oB);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         cxy $$5 = this.v.a(0);
         cxy $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxy.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxy.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cxy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cxy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
