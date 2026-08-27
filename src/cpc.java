import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cpc extends cod {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bpf s = new cpu();
   final bpf t = new bpv(2) {
      @Override
      public void e() {
         super.e();
         cpc.this.a(this);
      }
   };
   private final cop u;

   public cpc(int $$0, clg $$1) {
      this($$0, $$1, cop.a);
   }

   public cpc(int $$0, clg $$1, final cop $$2) {
      super(cpl.p, $$0);
      this.u = $$2;
      this.a(new cpz(this.t, 0, 49, 19) {
         @Override
         public boolean a(csz $$0) {
            return $$0.k() || cyh.c($$0);
         }
      });
      this.a(new cpz(this.t, 1, 49, 40) {
         @Override
         public boolean a(csz $$0) {
            return $$0.k() || cyh.c($$0);
         }
      });
      this.a(new cpz(this.s, 2, 129, 34) {
         @Override
         public boolean a(csz $$0) {
            return false;
         }

         @Override
         public void a(clh $$0, csz $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqh) {
                  brq.a((aqh)$$0x, etp.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cpc.this.t.a(0, csz.i);
            cpc.this.t.a(1, csz.i);
         }

         private int a(dad $$0) {
            int $$1 = 0;
            $$1 += this.g(cpc.this.t.a(0));
            $$1 += this.g(cpc.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(csz $$0) {
            int $$1 = 0;
            cyl $$2 = cyh.b($$0);

            for (Entry<iw<cyg>> $$3 : $$2.b()) {
               cyg $$4 = (cyg)((iw)$$3.getKey()).a();
               int $$5 = $$3.getIntValue();
               if (!$$4.b()) {
                  $$1 += $$4.c($$5);
               }
            }

            return $$1;
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpz($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpz($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bpf $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private csz a(csz $$0, csz $$1) {
      boolean $$2 = !$$0.d() || !$$1.d();
      if (!$$2) {
         return csz.i;
      } else if ($$0.G() <= 1 && $$1.G() <= 1) {
         boolean $$3 = !$$0.d() && !$$1.d();
         if (!$$3) {
            csz $$4 = !$$0.d() ? $$0 : $$1;
            return !cyh.c($$4) ? csz.i : this.c($$4.r());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return csz.i;
      }
   }

   private csz b(csz $$0, csz $$1) {
      if (!$$0.a($$1.f())) {
         return csz.i;
      } else {
         int $$2 = Math.max($$0.n(), $$1.n());
         int $$3 = $$0.n() - $$0.m();
         int $$4 = $$1.n() - $$1.m();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.k()) {
            if ($$0.i() < 2 || !csz.a($$0, $$1)) {
               return csz.i;
            }

            $$6 = 2;
         }

         csz $$7 = $$0.c($$6);
         if ($$7.k()) {
            $$7.b(ka.c, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(csz $$0, csz $$1) {
      cyh.a($$0, $$1x -> {
         cyl $$2 = cyh.b($$1);

         for (Entry<iw<cyg>> $$3 : $$2.b()) {
            cyg $$4 = (cyg)((iw)$$3.getKey()).a();
            if (!$$4.b() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private csz c(csz $$0) {
      cyl $$1 = cyh.a($$0, $$0x -> $$0x.a($$0xx -> !((cyg)$$0xx.a()).b()));
      if ($$0.a(ctc.uw) && $$1.d()) {
         $$0 = $$0.a(ctc.qP, $$0.G());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cof.e($$2);
      }

      $$0.b(ka.p, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(clh $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(clh $$0) {
      return a(this.u, $$0, ddg.nZ);
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         csz $$5 = this.t.a(0);
         csz $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return csz.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.d() && !$$6.d()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return csz.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return csz.i;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return csz.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.e(csz.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csz.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
