import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class cnn extends cmp {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bnt s = new cof();
   final bnt t = new boj(2) {
      @Override
      public void e() {
         super.e();
         cnn.this.a(this);
      }
   };
   private final cna u;

   public cnn(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public cnn(int $$0, cjs $$1, final cna $$2) {
      super(cnw.p, $$0);
      this.u = $$2;
      this.a(new cok(this.t, 0, 49, 19) {
         @Override
         public boolean a(crj $$0) {
            return $$0.k() || $$0.a(crm.uu) || $$0.A();
         }
      });
      this.a(new cok(this.t, 1, 49, 40) {
         @Override
         public boolean a(crj $$0) {
            return $$0.k() || $$0.a(crm.uu) || $$0.A();
         }
      });
      this.a(new cok(this.s, 2, 129, 34) {
         @Override
         public boolean a(crj $$0) {
            return false;
         }

         @Override
         public void a(cjt $$0, crj $$1) {
            $$2.a(($$0x, $$1x) -> {
               if ($$0x instanceof aps) {
                  bqe.a((aps)$$0x, esa.b($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            });
            cnn.this.t.a(0, crj.i);
            cnn.this.t.a(1, crj.i);
         }

         private int a(cyx $$0) {
            int $$1 = 0;
            $$1 += this.g(cnn.this.t.a(0));
            $$1 += this.g(cnn.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.z.a($$2);
            } else {
               return 0;
            }
         }

         private int g(crj $$0) {
            int $$1 = 0;
            cwx $$2 = cwr.b($$0);

            for (Entry<il<cwq>> $$3 : $$2.b()) {
               cwq $$4 = (cwq)((il)$$3.getKey()).a();
               int $$5 = $$3.getIntValue();
               if (!$$4.c()) {
                  $$1 += $$4.a($$5);
               }
            }

            return $$1;
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cok($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cok($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public void a(bnt $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }
   }

   private void l() {
      crj $$0 = this.t.a(0);
      crj $$1 = this.t.a(1);
      boolean $$2 = !$$0.d() || !$$1.d();
      boolean $$3 = !$$0.d() && !$$1.d();
      if (!$$2) {
         this.s.a(0, crj.i);
      } else {
         boolean $$4 = !$$0.d() && !$$0.a(crm.uu) && !$$0.A() || !$$1.d() && !$$1.a(crm.uu) && !$$1.A();
         if ($$0.G() > 1 || $$1.G() > 1 || !$$3 && $$4) {
            this.s.a(0, crj.i);
            this.d();
            return;
         }

         int $$5 = 1;
         int $$10;
         crj $$11;
         if ($$3) {
            if (!$$0.a($$1.f())) {
               this.s.a(0, crj.i);
               this.d();
               return;
            }

            cre $$6 = $$0.f();
            int $$7 = $$6.r() - $$0.m();
            int $$8 = $$6.r() - $$1.m();
            int $$9 = $$7 + $$8 + $$6.r() * 5 / 100;
            $$10 = Math.max($$6.r() - $$9, 0);
            $$11 = this.a($$0, $$1);
            if (!$$11.k()) {
               if (!crj.a($$0, $$1)) {
                  this.s.a(0, crj.i);
                  this.d();
                  return;
               }

               $$5 = 2;
            }
         } else {
            boolean $$12 = !$$0.d();
            $$10 = $$12 ? $$0.m() : $$1.m();
            $$11 = $$12 ? $$0 : $$1;
         }

         this.s.a(0, this.a($$11, $$10, $$5));
      }

      this.d();
   }

   private crj a(crj $$0, crj $$1) {
      crj $$2 = $$0.r();
      cwr.a($$2, $$1x -> {
         cwx $$2x = cwr.b($$1);

         for (Entry<il<cwq>> $$3 : $$2x.b()) {
            cwq $$4 = (cwq)((il)$$3.getKey()).a();
            if (!$$4.c() || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
      return $$2;
   }

   private crj a(crj $$0, int $$1, int $$2) {
      crj $$3 = $$0.c($$2);
      $$3.b($$1);
      cwx $$4 = cwr.a($$3, $$0x -> $$0x.a($$0xx -> !((cwq)$$0xx.a()).c()));
      if ($$3.a(crm.uu) && $$4.d()) {
         $$3 = $$3.a(crm.qO, $$2);
      }

      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$4.c(); $$6++) {
         $$5 = cmr.e($$5);
      }

      $$3.b(jp.l, Integer.valueOf($$5));
      return $$3;
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.u.a(($$1, $$2) -> this.a($$0, this.t));
   }

   @Override
   public boolean a(cjt $$0) {
      return a(this.u, $$0, dca.nZ);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         crj $$5 = this.t.a(0);
         crj $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.d() && !$$6.d()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return crj.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return crj.i;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return crj.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
