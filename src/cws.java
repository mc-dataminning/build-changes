import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cws extends cvs {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bum u = new cxk();
   final bum v = new bva(2) {
      @Override
      public void e() {
         super.e();
         cws.this.a(this);
      }
   };
   private final cwf w;

   public cws(int $$0, cry $$1) {
      this($$0, $$1, cwf.a);
   }

   public cws(int $$0, cry $$1, final cwf $$2) {
      super(cxb.p, $$0);
      this.w = $$2;
      this.a(new cxp(this.v, 0, 49, 19) {
         @Override
         public boolean a(daa $$0) {
            return $$0.m() || dgp.c($$0);
         }
      });
      this.a(new cxp(this.v, 1, 49, 40) {
         @Override
         public boolean a(daa $$0) {
            return $$0.m() || dgp.c($$0);
         }
      });
      this.a(new cxp(this.u, 2, 129, 34) {
         @Override
         public boolean a(daa $$0) {
            return false;
         }

         @Override
         public void a(crz $$0, daa $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aru) {
                  bxj.a((aru)$$0x, ffs.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cws.this.v.a(0, daa.k);
            cws.this.v.a(1, daa.k);
         }

         private int a(djz $$0) {
            int $$1 = 0;
            $$1 += this.g(cws.this.v.a(0));
            $$1 += this.g(cws.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(daa $$0) {
            int $$1 = 0;
            dgt $$2 = dgp.b($$0);

            for (Entry<jg<dgn>> $$3 : $$2.b()) {
               jg<dgn> $$4 = (jg<dgn>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axi.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bum $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private daa a(daa $$0, daa $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return daa.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            daa $$4 = !$$0.f() ? $$0 : $$1;
            return !dgp.c($$4) ? daa.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return daa.k;
      }
   }

   private daa b(daa $$0, daa $$1) {
      if (!$$0.a($$1.h())) {
         return daa.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !daa.a($$0, $$1)) {
               return daa.k;
            }

            $$6 = 2;
         }

         daa $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kl.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(daa $$0, daa $$1) {
      dgp.a($$0, $$1x -> {
         dgt $$2 = dgp.b($$1);

         for (Entry<jg<dgn>> $$3 : $$2.b()) {
            jg<dgn> $$4 = (jg<dgn>)$$3.getKey();
            if (!$$4.a(axi.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private daa c(daa $$0) {
      dgt $$1 = dgp.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axi.o)));
      if ($$0.a(dae.vG) && $$1.d()) {
         $$0 = $$0.a((djy)dae.rF);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cvv.e($$2);
      }

      $$0.b(kl.r, $$2);
      return $$0;
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(crz $$0) {
      return a(this.w, $$0, dng.oF);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         daa $$5 = this.v.a(0);
         daa $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return daa.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return daa.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return daa.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return daa.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
