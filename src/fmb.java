import com.mojang.blaze3d.systems.RenderSystem;

public class fmb extends fkv<cof> {
   private static final ajv A = new ajv("container/villager/out_of_stock");
   private static final ajv B = new ajv("container/villager/experience_bar_background");
   private static final ajv C = new ajv("container/villager/experience_bar_current");
   private static final ajv D = new ajv("container/villager/experience_bar_result");
   private static final ajv E = new ajv("container/villager/scroller");
   private static final ajv F = new ajv("container/villager/scroller_disabled");
   private static final ajv G = new ajv("container/villager/trade_arrow_out_of_stock");
   private static final ajv H = new ajv("container/villager/trade_arrow");
   private static final ajv I = new ajv("container/villager/discount_strikethrough");
   private static final ajv J = new ajv("textures/gui/container/villager.png");
   private static final int K = 512;
   private static final int L = 256;
   private static final int M = 99;
   private static final int N = 136;
   private static final int O = 16;
   private static final int P = 5;
   private static final int Q = 35;
   private static final int R = 68;
   private static final int S = 6;
   private static final int T = 7;
   private static final int U = 5;
   private static final int V = 20;
   private static final int W = 88;
   private static final int X = 27;
   private static final int Y = 6;
   private static final int Z = 139;
   private static final int aa = 18;
   private static final int ab = 94;
   private static final wi ac = wi.c("merchant.trades");
   private static final wi ad = wi.c("merchant.deprecated");
   private int ae;
   private final fmb.a[] af = new fmb.a[7];
   int ag;
   private boolean ah;

   public fmb(cof $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.q = 107;
   }

   private void E() {
      this.s.e(this.ae);
      this.s.h(this.ae);
      this.j.L().b(new agx(this.ae));
   }

   @Override
   protected void aM_() {
      super.aM_();
      int $$0 = (this.k - this.c) / 2;
      int $$1 = (this.l - this.d) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.af[$$3] = this.c(new fmb.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fmb.a) {
               this.ae = ((fmb.a)$$0x).a() + this.ag;
               this.E();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fdl $$0, int $$1, int $$2) {
      int $$3 = this.s.n();
      if ($$3 > 0 && $$3 <= 5 && this.s.q()) {
         wi $$4 = wi.a("merchant.title", this.i, wi.c("merchant.level." + $$3));
         int $$5 = this.m.a($$4);
         int $$6 = 49 + this.c / 2 - $$5 / 2;
         $$0.a(this.m, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.m, this.i, 49 + this.c / 2 - this.m.a(this.i) / 2, 6, 4210752, false);
      }

      $$0.a(this.m, this.u, this.q, this.r, 4210752, false);
      int $$7 = this.m.a(ac);
      $$0.a(this.m, ac, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(J, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.d, 512, 256);
      cyf $$6 = this.s.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ae;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         cye $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(A, this.w + 83 + 99, this.x + 35, 0, 28, 21);
         }
      }
   }

   private void a(fdl $$0, int $$1, int $$2, cye $$3) {
      int $$4 = this.s.n();
      int $$5 = this.s.l();
      if ($$4 < 5) {
         $$0.a(B, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cjo.b($$4);
         if ($$5 >= $$6 && cjo.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cjo.c($$4) - $$6);
            int $$9 = Math.min(axm.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(C, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.s.m();
            if ($$10 > 0) {
               int $$11 = Math.min(axm.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(D, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(fdl $$0, int $$1, int $$2, cyf $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.ag * $$6);
         if (this.ag == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(E, $$1 + 94, $$2 + 18 + $$8, 0, 6, 27);
      } else {
         $$0.a(F, $$1 + 94, $$2 + 18, 0, 6, 27);
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      cyf $$4 = this.s.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.k - this.c) / 2;
         int $$6 = (this.l - this.d) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (cye $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ag && $$9 < 7 + this.ag) {
               crs $$11 = $$10.a();
               crs $$12 = $$10.b();
               crs $$13 = $$10.c();
               crs $$14 = $$10.f();
               $$0.c().a();
               $$0.c().a(0.0F, 0.0F, 100.0F);
               int $$15 = $$7 + 2;
               this.a($$0, $$12, $$11, $$8, $$15);
               if (!$$13.d()) {
                  $$0.b($$13, $$5 + 5 + 35, $$15);
                  $$0.a(this.m, $$13, $$5 + 5 + 35, $$15);
               }

               this.a($$0, $$10, $$5, $$15);
               $$0.b($$14, $$5 + 5 + 68, $$15);
               $$0.a(this.m, $$14, $$5 + 5 + 68, $$15);
               $$0.c().b();
               $$7 += 20;
               $$9++;
            } else {
               $$9++;
            }
         }

         int $$16 = this.ae;
         cye $$17 = $$4.get($$16);
         if (this.s.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.s.o()) {
            $$0.a(this.m, ad, $$1, $$2);
         }

         for (fmb.a $$18 : this.af) {
            if ($$18.A()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.s.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fdl $$0, cye $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.r()) {
         $$0.a(G, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(H, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(fdl $$0, crs $$1, crs $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.G() == $$1.G()) {
         $$0.a(this.m, $$1, $$3, $$4);
      } else {
         $$0.a(this.m, $$2, $$3, $$4, $$2.G() == 1 ? "1" : null);
         $$0.a(this.m, $$1, $$3 + 14, $$4, $$1.G() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(I, $$3 + 7, $$4 + 12, 0, 9, 2);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.s.p().size();
      if (this.a($$4)) {
         int $$5 = $$4 - 7;
         this.ag = axm.a((int)((double)this.ag - $$3), 0, $$5);
      }

      return true;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.s.p().size();
      if (this.ah) {
         int $$6 = this.x + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - (float)$$6 - 13.5F) / ((float)($$7 - $$6) - 27.0F);
         $$9 = $$9 * (float)$$8 + 0.5F;
         this.ag = axm.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ah = false;
      int $$3 = (this.k - this.c) / 2;
      int $$4 = (this.l - this.d) / 2;
      if (this.a(this.s.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.ah = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fdy {
      final int a;

      public a(int $$0, int $$1, int $$2, fdy.c $$3) {
         super($$0, $$1, 88, 20, wh.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fdl $$0, int $$1, int $$2) {
         if (this.i && fmb.this.s.p().size() > this.a + fmb.this.ag) {
            if ($$1 < this.C() + 20) {
               crs $$3 = fmb.this.s.p().get(this.a + fmb.this.ag).b();
               $$0.b(fmb.this.m, $$3, $$1, $$2);
            } else if ($$1 < this.C() + 50 && $$1 > this.C() + 30) {
               crs $$4 = fmb.this.s.p().get(this.a + fmb.this.ag).c();
               if (!$$4.d()) {
                  $$0.b(fmb.this.m, $$4, $$1, $$2);
               }
            } else if ($$1 > this.C() + 65) {
               crs $$5 = fmb.this.s.p().get(this.a + fmb.this.ag).f();
               $$0.b(fmb.this.m, $$5, $$1, $$2);
            }
         }
      }
   }
}
