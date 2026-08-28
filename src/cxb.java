import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cxb extends cwb {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final buv u = new cxu();
   final buv v = new bvj(2) {
      @Override
      public void e() {
         super.e();
         cxb.this.a(this);
      }
   };
   private final cwo w;

   public cxb(int $$0, csh $$1) {
      this($$0, $$1, cwo.a);
   }

   public cxb(int $$0, csh $$1, final cwo $$2) {
      super(cxk.p, $$0);
      this.w = $$2;
      this.a(new cxz(this.v, 0, 49, 19) {
         @Override
         public boolean a(dak $$0) {
            return $$0.m() || dgz.c($$0);
         }
      });
      this.a(new cxz(this.v, 1, 49, 40) {
         @Override
         public boolean a(dak $$0) {
            return $$0.m() || dgz.c($$0);
         }
      });
      this.a(new cxz(this.u, 2, 129, 34) {
         @Override
         public boolean a(dak $$0) {
            return false;
         }

         @Override
         public void a(csi $$0, dak $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof asb) {
                  bxs.a((asb)$$0x, fgc.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cxb.this.v.a(0, dak.l);
            cxb.this.v.a(1, dak.l);
         }

         private int a(dkj $$0) {
            int $$1 = 0;
            $$1 += this.g(cxb.this.v.a(0));
            $$1 += this.g(cxb.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(dak $$0) {
            int $$1 = 0;
            dhd $$2 = dgz.b($$0);

            for (Entry<jg<dgx>> $$3 : $$2.b()) {
               jg<dgx> $$4 = (jg<dgx>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axp.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(buv $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private dak a(dak $$0, dak $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return dak.l;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            dak $$4 = !$$0.f() ? $$0 : $$1;
            return !dgz.c($$4) ? dak.l : this.b($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return dak.l;
      }
   }

   private dak b(dak $$0, dak $$1) {
      if (!$$0.a($$1.h())) {
         return dak.l;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !dak.a($$0, $$1)) {
               return dak.l;
            }

            $$6 = 2;
         }

         dak $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kl.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.b($$7);
      }
   }

   private void c(dak $$0, dak $$1) {
      dgz.a($$0, $$1x -> {
         dhd $$2 = dgz.b($$1);

         for (Entry<jg<dgx>> $$3 : $$2.b()) {
            jg<dgx> $$4 = (jg<dgx>)$$3.getKey();
            if (!$$4.a(axp.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private dak b(dak $$0) {
      dhd $$1 = dgz.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axp.o)));
      if ($$0.a(dao.vG) && $$1.d()) {
         $$0 = $$0.a((dki)dao.rF);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cwe.e($$2);
      }

      $$0.b(kl.r, $$2);
      return $$0;
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(csi $$0) {
      return a(this.w, $$0, dnq.oF);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         dak $$5 = this.v.a(0);
         dak $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return dak.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return dak.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return dak.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
