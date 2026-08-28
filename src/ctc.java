import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class ctc extends csc {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bsd u = new ctu();
   final bsd v = new bsr(2) {
      @Override
      public void e() {
         super.e();
         ctc.this.a(this);
      }
   };
   private final csp w;

   public ctc(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public ctc(int $$0, cow $$1, final csp $$2) {
      super(ctl.p, $$0);
      this.w = $$2;
      this.a(new ctz(this.v, 0, 49, 19) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.m() || ddb.c($$0);
         }
      });
      this.a(new ctz(this.v, 1, 49, 40) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.m() || ddb.c($$0);
         }
      });
      this.a(new ctz(this.u, 2, 129, 34) {
         @Override
         public boolean a(cwp $$0) {
            return false;
         }

         @Override
         public void a(cox $$0, cwp $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof ard) {
                  bux.a((ard)$$0x, fba.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            ctc.this.v.a(0, cwp.j);
            ctc.this.v.a(1, cwp.j);
         }

         private int a(dgi $$0) {
            int $$1 = 0;
            $$1 += this.g(ctc.this.v.a(0));
            $$1 += this.g(ctc.this.v.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.A.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cwp $$0) {
            int $$1 = 0;
            ddf $$2 = ddb.b($$0);

            for (Entry<jr<dcz>> $$3 : $$2.b()) {
               jr<dcz> $$4 = (jr<dcz>)$$3.getKey();
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

   private cwp a(cwp $$0, cwp $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return cwp.j;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            cwp $$4 = !$$0.f() ? $$0 : $$1;
            return !ddb.c($$4) ? cwp.j : this.c($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cwp.j;
      }
   }

   private cwp b(cwp $$0, cwp $$1) {
      if (!$$0.a($$1.h())) {
         return cwp.j;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !cwp.a($$0, $$1)) {
               return cwp.j;
            }

            $$6 = 2;
         }

         cwp $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kv.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cwp $$0, cwp $$1) {
      ddb.a($$0, $$1x -> {
         ddf $$2 = ddb.b($$1);

         for (Entry<jr<dcz>> $$3 : $$2.b()) {
            jr<dcz> $$4 = (jr<dcz>)$$3.getKey();
            if (!$$4.a(aws.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cwp c(cwp $$0) {
      ddf $$1 = ddb.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(aws.o)));
      if ($$0.a(cwt.vv) && $$1.d()) {
         $$0 = $$0.a((dgh)cwt.rw);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = csf.e($$2);
      }

      $$0.b(kv.s, $$2);
      return $$0;
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cox $$0) {
      return a(this.w, $$0, djo.oB);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         cwp $$5 = this.v.a(0);
         cwp $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwp.j;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwp.j;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
