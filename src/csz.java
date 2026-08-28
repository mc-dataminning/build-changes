import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class csz extends crz {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bsd u = new ctr();
   final bsd v = new bsr(2) {
      @Override
      public void e() {
         super.e();
         csz.this.a(this);
      }
   };
   private final csm w;

   public csz(int $$0, cot $$1) {
      this($$0, $$1, csm.a);
   }

   public csz(int $$0, cot $$1, final csm $$2) {
      super(cti.p, $$0);
      this.w = $$2;
      this.a(new ctw(this.v, 0, 49, 19) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.m() || dcf.c($$0);
         }
      });
      this.a(new ctw(this.v, 1, 49, 40) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.m() || dcf.c($$0);
         }
      });
      this.a(new ctw(this.u, 2, 129, 34) {
         @Override
         public boolean a(cwm $$0) {
            return false;
         }

         @Override
         public void a(cou $$0, cwm $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arp) {
                  bux.a((arp)$$0x, ezy.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            csz.this.v.a(0, cwm.k);
            csz.this.v.a(1, cwm.k);
         }

         private int a(dfm $$0) {
            int $$1 = 0;
            $$1 += this.g(csz.this.v.a(0));
            $$1 += this.g(csz.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cwm $$0) {
            int $$1 = 0;
            dcj $$2 = dcf.b($$0);

            for (Entry<jq<dcd>> $$3 : $$2.b()) {
               jq<dcd> $$4 = (jq<dcd>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(axf.o)) {
                  $$1 += $$4.a().b($$5);
               }
            }

            return $$1;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bsd $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private cwm a(cwm $$0, cwm $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cwm.k;
      } else if ($$0.L() <= 1 && $$1.L() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cwm $$4 = !$$0.f() ? $$0 : $$1;
            return !dcf.c($$4) ? cwm.k : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cwm.k;
      }
   }

   private cwm b(cwm $$0, cwm $$1) {
      if (!$$0.a($$1.h())) {
         return cwm.k;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cwm.a($$0, $$1)) {
               return cwm.k;
            }

            $$6 = 2;
         }

         cwm $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(ku.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cwm $$0, cwm $$1) {
      dcf.a($$0, $$1x -> {
         dcj $$2 = dcf.b($$1);

         for (Entry<jq<dcd>> $$3 : $$2.b()) {
            jq<dcd> $$4 = (jq<dcd>)$$3.getKey();
            if (!$$4.a(axf.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cwm c(cwm $$0) {
      dcj $$1 = dcf.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(axf.o)));
      if ($$0.a(cwq.uO) && $$1.d()) {
         $$0 = $$0.a((dfl)cwq.qQ);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = csc.e($$2);
      }

      $$0.b(ku.s, $$2);
      return $$0;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cou $$0) {
      return a(this.w, $$0, dis.nZ);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         cwm $$5 = this.v.a(0);
         cwm $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwm.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwm.k;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
