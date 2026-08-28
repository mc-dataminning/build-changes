import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cwf extends cvf {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final btz u = new cwx();
   final btz v = new bun(2) {
      @Override
      public void e() {
         super.e();
         cwf.this.a(this);
      }
   };
   private final cvs w;

   public cwf(int $$0, crl $$1) {
      this($$0, $$1, cvs.a);
   }

   public cwf(int $$0, crl $$1, final cvs $$2) {
      super(cwo.p, $$0);
      this.w = $$2;
      this.a(new cxc(this.v, 0, 49, 19) {
         @Override
         public boolean a(czn $$0) {
            return $$0.m() || dgc.c($$0);
         }
      });
      this.a(new cxc(this.v, 1, 49, 40) {
         @Override
         public boolean a(czn $$0) {
            return $$0.m() || dgc.c($$0);
         }
      });
      this.a(new cxc(this.u, 2, 129, 34) {
         @Override
         public boolean a(czn $$0) {
            return false;
         }

         @Override
         public void a(crm $$0, czn $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arq) {
                  bww.a((arq)$$0x, ffc.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cwf.this.v.a(0, czn.k);
            cwf.this.v.a(1, czn.k);
         }

         private int a(djm $$0) {
            int $$1 = 0;
            $$1 += this.g(cwf.this.v.a(0));
            $$1 += this.g(cwf.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(czn $$0) {
            int $$1 = 0;
            dgg $$2 = dgc.b($$0);

            for (Entry<jf<dga>> $$3 : $$2.b()) {
               jf<dga> $$4 = (jf<dga>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axe.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(btz $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private czn a(czn $$0, czn $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return czn.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            czn $$4 = !$$0.f() ? $$0 : $$1;
            return !dgc.c($$4) ? czn.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return czn.k;
      }
   }

   private czn b(czn $$0, czn $$1) {
      if (!$$0.a($$1.h())) {
         return czn.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !czn.a($$0, $$1)) {
               return czn.k;
            }

            $$6 = 2;
         }

         czn $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kk.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(czn $$0, czn $$1) {
      dgc.a($$0, $$1x -> {
         dgg $$2 = dgc.b($$1);

         for (Entry<jf<dga>> $$3 : $$2.b()) {
            jf<dga> $$4 = (jf<dga>)$$3.getKey();
            if (!$$4.a(axe.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private czn c(czn $$0) {
      dgg $$1 = dgc.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axe.o)));
      if ($$0.a(czr.vG) && $$1.d()) {
         $$0 = $$0.a((djl)czr.rF);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cvi.e($$2);
      }

      $$0.b(kk.r, $$2);
      return $$0;
   }

   @Override
   public void a(crm $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(crm $$0) {
      return a(this.w, $$0, dmt.oF);
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         czn $$5 = this.v.a(0);
         czn $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return czn.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return czn.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return czn.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czn.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
