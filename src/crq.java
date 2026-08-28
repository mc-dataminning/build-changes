import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class crq extends cqq {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final brd u = new csi();
   final brd v = new brr(2) {
      @Override
      public void e() {
         super.e();
         crq.this.a(this);
      }
   };
   private final crd w;

   public crq(int $$0, cno $$1) {
      this($$0, $$1, crd.a);
   }

   public crq(int $$0, cno $$1, final crd $$2) {
      super(crz.p, $$0);
      this.w = $$2;
      this.a(new csn(this.v, 0, 49, 19) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.m() || day.c($$0);
         }
      });
      this.a(new csn(this.v, 1, 49, 40) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.m() || day.c($$0);
         }
      });
      this.a(new csn(this.u, 2, 129, 34) {
         @Override
         public boolean a(cvl $$0) {
            return false;
         }

         @Override
         public void a(cnp $$0, cvl $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arg) {
                  btv.a((arg)$$0x, eye.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            crq.this.v.a(0, cvl.k);
            crq.this.v.a(1, cvl.k);
         }

         private int a(dds $$0) {
            int $$1 = 0;
            $$1 += this.g(crq.this.v.a(0));
            $$1 += this.g(crq.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cvl $$0) {
            int $$1 = 0;
            dbc $$2 = day.b($$0);

            for (Entry<jn<daw>> $$3 : $$2.b()) {
               jn<daw> $$4 = (jn<daw>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(awv.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(brd $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cvl a(cvl $$0, cvl $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cvl.k;
      } else if ($$0.J() <= 1 && $$1.J() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cvl $$4 = !$$0.f() ? $$0 : $$1;
            return !day.c($$4) ? cvl.k : this.c($$4.u());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cvl.k;
      }
   }

   private cvl b(cvl $$0, cvl $$1) {
      if (!$$0.a($$1.h())) {
         return cvl.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cvl.a($$0, $$1)) {
               return cvl.k;
            }

            $$6 = 2;
         }

         cvl $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kr.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cvl $$0, cvl $$1) {
      day.a($$0, $$1x -> {
         dbc $$2 = day.b($$1);

         for (Entry<jn<daw>> $$3 : $$2.b()) {
            jn<daw> $$4 = (jn<daw>)$$3.getKey();
            if (!$$4.a(awv.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cvl c(cvl $$0) {
      dbc $$1 = day.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(awv.o)));
      if ($$0.a(cvo.uy) && $$1.d()) {
         $$0 = $$0.a((ddr)cvo.qQ);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cqt.e($$2);
      }

      $$0.b(kr.r, $$2);
      return $$0;
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cnp $$0) {
      return a(this.w, $$0, dgx.nZ);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         cvl $$5 = this.v.a(0);
         cvl $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cvl.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cvl.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
