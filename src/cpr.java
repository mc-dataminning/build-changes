import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cpr extends cot {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bpn s = new cqj();
   final bpn t = new bqd(2) {
      @Override
      public void e() {
         super.e();
         cpr.this.a(this);
      }
   };
   private final cpe u;

   public cpr(int $$0, clv $$1) {
      this($$0, $$1, cpe.a);
   }

   public cpr(int $$0, clv $$1, final cpe $$2) {
      super(cqa.p, $$0);
      this.u = $$2;
      this.a(new cqo(this.t, 0, 49, 19) {
         @Override
         public boolean a(cto $$0) {
            return $$0.l() || cza.c($$0);
         }
      });
      this.a(new cqo(this.t, 1, 49, 40) {
         @Override
         public boolean a(cto $$0) {
            return $$0.l() || cza.c($$0);
         }
      });
      this.a(new cqo(this.s, 2, 129, 34) {
         @Override
         public boolean a(cto $$0) {
            return false;
         }

         @Override
         public void a(clw $$0, cto $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aqm) {
                  bse.a((aqm)$$0x, euk.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cpr.this.t.a(0, cto.i);
            cpr.this.t.a(1, cto.i);
         }

         private int a(dax $$0) {
            int $$1 = 0;
            $$1 += this.g(cpr.this.t.a(0));
            $$1 += this.g(cpr.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cto $$0) {
            int $$1 = 0;
            cze $$2 = cza.b($$0);

            for (Entry<ix<cyz>> $$3 : $$2.b()) {
               cyz $$4 = (cyz)((ix)$$3.getKey()).a();
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
            this.a(new cqo($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cqo($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bpn $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cto a(cto $$0, cto $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return cto.i;
      } else if ($$0.I() <= 1 && $$1.I() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            cto $$4 = !$$0.e() ? $$0 : $$1;
            return !cza.c($$4) ? cto.i : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cto.i;
      }
   }

   private cto b(cto $$0, cto $$1) {
      if (!$$0.a($$1.g())) {
         return cto.i;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !cto.a($$0, $$1)) {
               return cto.i;
            }

            $$6 = 2;
         }

         cto $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(kb.c, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cto $$0, cto $$1) {
      cza.a($$0, $$1x -> {
         cze $$2 = cza.b($$1);

         for (Entry<ix<cyz>> $$3 : $$2.b()) {
            cyz $$4 = (cyz)((ix)$$3.getKey()).a();
            if (!$$4.b() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cto c(cto $$0) {
      cze $$1 = cza.a($$0, $$0x -> $$0x.a($$0xx -> !((cyz)$$0xx.a()).b()));
      if ($$0.a(ctr.uw) && $$1.d()) {
         $$0 = $$0.a(ctr.qP, $$0.I());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cov.e($$2);
      }

      $$0.b(kb.q, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(clw $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(clw $$0) {
      return a(this.u, $$0, dea.nZ);
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         cto $$5 = this.t.a(0);
         cto $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cto.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cto.i;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cto.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
