import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class ctw extends csw {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bsr u = new cuo();
   final bsr v = new btf(2) {
      @Override
      public void e() {
         super.e();
         ctw.this.a(this);
      }
   };
   private final ctj w;

   public ctw(int $$0, cpq $$1) {
      this($$0, $$1, ctj.a);
   }

   public ctw(int $$0, cpq $$1, final ctj $$2) {
      super(cuf.p, $$0);
      this.w = $$2;
      this.a(new cut(this.v, 0, 49, 19) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.m() || ddt.c($$0);
         }
      });
      this.a(new cut(this.v, 1, 49, 40) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.m() || ddt.c($$0);
         }
      });
      this.a(new cut(this.u, 2, 129, 34) {
         @Override
         public boolean a(cxh $$0) {
            return false;
         }

         @Override
         public void a(cpr $$0, cxh $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof ard) {
                  bvn.a((ard)$$0x, fbx.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            ctw.this.v.a(0, cxh.k);
            ctw.this.v.a(1, cxh.k);
         }

         private int a(dgz $$0) {
            int $$1 = 0;
            $$1 += this.g(ctw.this.v.a(0));
            $$1 += this.g(ctw.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cxh $$0) {
            int $$1 = 0;
            ddx $$2 = ddt.b($$0);

            for (Entry<jr<ddr>> $$3 : $$2.b()) {
               jr<ddr> $$4 = (jr<ddr>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(aws.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bsr $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cxh a(cxh $$0, cxh $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cxh.k;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cxh $$4 = !$$0.f() ? $$0 : $$1;
            return !ddt.c($$4) ? cxh.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cxh.k;
      }
   }

   private cxh b(cxh $$0, cxh $$1) {
      if (!$$0.a($$1.h())) {
         return cxh.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cxh.a($$0, $$1)) {
               return cxh.k;
            }

            $$6 = 2;
         }

         cxh $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kv.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cxh $$0, cxh $$1) {
      ddt.a($$0, $$1x -> {
         ddx $$2 = ddt.b($$1);

         for (Entry<jr<ddr>> $$3 : $$2.b()) {
            jr<ddr> $$4 = (jr<ddr>)$$3.getKey();
            if (!$$4.a(aws.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cxh c(cxh $$0) {
      ddx $$1 = ddt.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(aws.o)));
      if ($$0.a(cxl.vx) && $$1.d()) {
         $$0 = $$0.a((dgy)cxl.ry);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = csz.e($$2);
      }

      $$0.b(kv.s, $$2);
      return $$0;
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cpr $$0) {
      return a(this.w, $$0, dkg.oB);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         cxh $$5 = this.v.a(0);
         cxh $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxh.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxh.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxh.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
