import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cqs extends cpu {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bqn s = new crk();
   final bqn t = new brd(2) {
      @Override
      public void e() {
         super.e();
         cqs.this.a(this);
      }
   };
   private final cqf u;

   public cqs(int $$0, cmw $$1) {
      this($$0, $$1, cqf.a);
   }

   public cqs(int $$0, cmw $$1, final cqf $$2) {
      super(crb.p, $$0);
      this.u = $$2;
      this.a(new crp(this.t, 0, 49, 19) {
         @Override
         public boolean a(cup $$0) {
            return $$0.l() || dab.c($$0);
         }
      });
      this.a(new crp(this.t, 1, 49, 40) {
         @Override
         public boolean a(cup $$0) {
            return $$0.l() || dab.c($$0);
         }
      });
      this.a(new crp(this.s, 2, 129, 34) {
         @Override
         public boolean a(cup $$0) {
            return false;
         }

         @Override
         public void a(cmx $$0, cup $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof arf) {
                  btf.a((arf)$$0x, evr.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cqs.this.t.a(0, cup.l);
            cqs.this.t.a(1, cup.l);
         }

         private int a(dby $$0) {
            int $$1 = 0;
            $$1 += this.g(cqs.this.t.a(0));
            $$1 += this.g(cqs.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cup $$0) {
            int $$1 = 0;
            daf $$2 = dab.b($$0);

            for (Entry<ji<daa>> $$3 : $$2.b()) {
               daa $$4 = (daa)((ji)$$3.getKey()).a();
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
            this.a(new crp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crp($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bqn $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      this.s.a(0, this.a(this.t.a(0), this.t.a(1)));
      this.d();
   }

   private cup a(cup $$0, cup $$1) {
      boolean $$2 = !$$0.e() || !$$1.e();
      if (!$$2) {
         return cup.l;
      } else if ($$0.I() <= 1 && $$1.I() <= 1) {
         boolean $$3 = !$$0.e() && !$$1.e();
         if (!$$3) {
            cup $$4 = !$$0.e() ? $$0 : $$1;
            return !dab.c($$4) ? cup.l : this.c($$4.s());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return cup.l;
      }
   }

   private cup b(cup $$0, cup $$1) {
      if (!$$0.a($$1.g())) {
         return cup.l;
      } else {
         int $$2 = Math.max($$0.o(), $$1.o());
         int $$3 = $$0.o() - $$0.n();
         int $$4 = $$1.o() - $$1.n();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.l()) {
            if ($$0.j() < 2 || !cup.a($$0, $$1)) {
               return cup.l;
            }

            $$6 = 2;
         }

         cup $$7 = $$0.c($$6);
         if ($$7.l()) {
            $$7.b(km.d, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.c($$7);
      }
   }

   private void c(cup $$0, cup $$1) {
      dab.a($$0, $$1x -> {
         daf $$2 = dab.b($$1);

         for (Entry<ji<daa>> $$3 : $$2.b()) {
            daa $$4 = (daa)((ji)$$3.getKey()).a();
            if (!$$4.b() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private cup c(cup $$0) {
      daf $$1 = dab.a($$0, $$0x -> $$0x.a($$0xx -> !((daa)$$0xx.a()).b()));
      if ($$0.a(cus.uw) && $$1.d()) {
         $$0 = $$0.a(cus.qP, $$0.I());
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cpw.e($$2);
      }

      $$0.b(km.r, Integer.valueOf($$2));
      return $$0;
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cmx $$0) {
      return a(this.u, $$0, dfb.nZ);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         cup $$5 = this.t.a(0);
         cup $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.e() && !$$6.e()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cup.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cup.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return cup.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
