import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cub extends ctb {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final btb u = new cut();
   final btb v = new btp(2) {
      @Override
      public void e() {
         super.e();
         cub.this.a(this);
      }
   };
   private final cto w;

   public cub(int $$0, cpv $$1) {
      this($$0, $$1, cto.a);
   }

   public cub(int $$0, cpv $$1, final cto $$2) {
      super(cuk.p, $$0);
      this.w = $$2;
      this.a(new cuy(this.v, 0, 49, 19) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.m() || dea.c($$0);
         }
      });
      this.a(new cuy(this.v, 1, 49, 40) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.m() || dea.c($$0);
         }
      });
      this.a(new cuy(this.u, 2, 129, 34) {
         @Override
         public boolean a(cxo $$0) {
            return false;
         }

         @Override
         public void a(cpw $$0, cxo $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof ash) {
                  bvv.a((ash)$$0x, fbx.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cub.this.v.a(0, cxo.j);
            cub.this.v.a(1, cxo.j);
         }

         private int a(dhh $$0) {
            int $$1 = 0;
            $$1 += this.g(cub.this.v.a(0));
            $$1 += this.g(cub.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cxo $$0) {
            int $$1 = 0;
            dee $$2 = dea.b($$0);

            for (Entry<jq<ddy>> $$3 : $$2.b()) {
               jq<ddy> $$4 = (jq<ddy>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axx.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(btb $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cxo a(cxo $$0, cxo $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cxo.j;
      } else if ($$0.L() <= 1 && $$1.L() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cxo $$4 = !$$0.f() ? $$0 : $$1;
            return !dea.c($$4) ? cxo.j : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cxo.j;
      }
   }

   private cxo b(cxo $$0, cxo $$1) {
      if (!$$0.a($$1.h())) {
         return cxo.j;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cxo.a($$0, $$1)) {
               return cxo.j;
            }

            $$6 = 2;
         }

         cxo $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(ku.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cxo $$0, cxo $$1) {
      dea.a($$0, $$1x -> {
         dee $$2 = dea.b($$1);

         for (Entry<jq<ddy>> $$3 : $$2.b()) {
            jq<ddy> $$4 = (jq<ddy>)$$3.getKey();
            if (!$$4.a(axx.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cxo c(cxo $$0) {
      dee $$1 = dea.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axx.o)));
      if ($$0.a(cxs.vm) && $$1.d()) {
         $$0 = $$0.a((dhg)cxs.rn);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cte.e($$2);
      }

      $$0.b(ku.s, $$2);
      return $$0;
   }

   @Override
   public void a(cpw $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cpw $$0) {
      return a(this.w, $$0, dkn.ou);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.j;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         cxo $$5 = this.v.a(0);
         cxo $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxo.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cxo.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cxo.j;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cxo.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxo.j;
         }

         if ($$4.f()) {
            $$3.e(cxo.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxo.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
