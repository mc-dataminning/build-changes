import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class crw extends cqw {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bri u = new cso();
   final bri v = new brw(2) {
      @Override
      public void e() {
         super.e();
         crw.this.a(this);
      }
   };
   private final crj w;

   public crw(int $$0, cnt $$1) {
      this($$0, $$1, crj.a);
   }

   public crw(int $$0, cnt $$1, final crj $$2) {
      super(csf.p, $$0);
      this.w = $$2;
      this.a(new cst(this.v, 0, 49, 19) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.m() || dbm.c($$0);
         }
      });
      this.a(new cst(this.v, 1, 49, 40) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.m() || dbm.c($$0);
         }
      });
      this.a(new cst(this.u, 2, 129, 34) {
         @Override
         public boolean a(cvp $$0) {
            return false;
         }

         @Override
         public void a(cnu $$0, cvp $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arh) {
                  bua.a((arh)$$0x, eys.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            crw.this.v.a(0, cvp.k);
            crw.this.v.a(1, cvp.k);
         }

         private int a(deg $$0) {
            int $$1 = 0;
            $$1 += this.g(crw.this.v.a(0));
            $$1 += this.g(crw.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cvp $$0) {
            int $$1 = 0;
            dbq $$2 = dbm.b($$0);

            for (Entry<jn<dbk>> $$3 : $$2.b()) {
               jn<dbk> $$4 = (jn<dbk>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(aww.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bri $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cvp a(cvp $$0, cvp $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cvp.k;
      } else if ($$0.J() <= 1 && $$1.J() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cvp $$4 = !$$0.f() ? $$0 : $$1;
            return !dbm.c($$4) ? cvp.k : this.c($$4.u());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cvp.k;
      }
   }

   private cvp b(cvp $$0, cvp $$1) {
      if (!$$0.a($$1.h())) {
         return cvp.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cvp.a($$0, $$1)) {
               return cvp.k;
            }

            $$6 = 2;
         }

         cvp $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kr.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cvp $$0, cvp $$1) {
      dbm.a($$0, $$1x -> {
         dbq $$2 = dbm.b($$1);

         for (Entry<jn<dbk>> $$3 : $$2.b()) {
            jn<dbk> $$4 = (jn<dbk>)$$3.getKey();
            if (!$$4.a(aww.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cvp c(cvp $$0) {
      dbq $$1 = dbm.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(aww.o)));
      if ($$0.a(cvt.uy) && $$1.d()) {
         $$0 = $$0.a((def)cvt.qQ);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cqz.e($$2);
      }

      $$0.b(kr.r, $$2);
      return $$0;
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cnu $$0) {
      return a(this.w, $$0, dhl.nZ);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         cvp $$5 = this.v.a(0);
         cvp $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cvp.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cvp.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
