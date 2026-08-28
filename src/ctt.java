import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class ctt extends cst {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bst u = new cul();
   final bst v = new bth(2) {
      @Override
      public void e() {
         super.e();
         ctt.this.a(this);
      }
   };
   private final ctg w;

   public ctt(int $$0, cpn $$1) {
      this($$0, $$1, ctg.a);
   }

   public ctt(int $$0, cpn $$1, final ctg $$2) {
      super(cuc.p, $$0);
      this.w = $$2;
      this.a(new cuq(this.v, 0, 49, 19) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.m() || dds.c($$0);
         }
      });
      this.a(new cuq(this.v, 1, 49, 40) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.m() || dds.c($$0);
         }
      });
      this.a(new cuq(this.u, 2, 129, 34) {
         @Override
         public boolean a(cxg $$0) {
            return false;
         }

         @Override
         public void a(cpo $$0, cxg $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arx) {
                  bvn.a((arx)$$0x, fbr.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            ctt.this.v.a(0, cxg.j);
            ctt.this.v.a(1, cxg.j);
         }

         private int a(dgz $$0) {
            int $$1 = 0;
            $$1 += this.g(ctt.this.v.a(0));
            $$1 += this.g(ctt.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cxg $$0) {
            int $$1 = 0;
            ddw $$2 = dds.b($$0);

            for (Entry<jq<ddq>> $$3 : $$2.b()) {
               jq<ddq> $$4 = (jq<ddq>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axn.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bst $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cxg a(cxg $$0, cxg $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cxg.j;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cxg $$4 = !$$0.f() ? $$0 : $$1;
            return !dds.c($$4) ? cxg.j : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cxg.j;
      }
   }

   private cxg b(cxg $$0, cxg $$1) {
      if (!$$0.a($$1.h())) {
         return cxg.j;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cxg.a($$0, $$1)) {
               return cxg.j;
            }

            $$6 = 2;
         }

         cxg $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(ku.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cxg $$0, cxg $$1) {
      dds.a($$0, $$1x -> {
         ddw $$2 = dds.b($$1);

         for (Entry<jq<ddq>> $$3 : $$2.b()) {
            jq<ddq> $$4 = (jq<ddq>)$$3.getKey();
            if (!$$4.a(axn.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cxg c(cxg $$0) {
      ddw $$1 = dds.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axn.o)));
      if ($$0.a(cxk.vv) && $$1.d()) {
         $$0 = $$0.a((dgy)cxk.rw);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = csw.e($$2);
      }

      $$0.b(ku.s, $$2);
      return $$0;
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cpo $$0) {
      return a(this.w, $$0, dkf.oB);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         cxg $$5 = this.v.a(0);
         cxg $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxg.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxg.j;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
