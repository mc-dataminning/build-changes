import com.mojang.blaze3d.systems.RenderSystem;

public class fls extends fkm<cny> {
   private static final ajt A = new ajt("container/villager/out_of_stock");
   private static final ajt B = new ajt("container/villager/experience_bar_background");
   private static final ajt C = new ajt("container/villager/experience_bar_current");
   private static final ajt D = new ajt("container/villager/experience_bar_result");
   private static final ajt E = new ajt("container/villager/scroller");
   private static final ajt F = new ajt("container/villager/scroller_disabled");
   private static final ajt G = new ajt("container/villager/trade_arrow_out_of_stock");
   private static final ajt H = new ajt("container/villager/trade_arrow");
   private static final ajt I = new ajt("container/villager/discount_strikethrough");
   private static final ajt J = new ajt("textures/gui/container/villager.png");
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
   private static final wg ac = wg.c("merchant.trades");
   private static final wg ad = wg.c("merchant.deprecated");
   private int ae;
   private final fls.a[] af = new fls.a[7];
   int ag;
   private boolean ah;

   public fls(cny $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.q = 107;
   }

   private void E() {
      this.s.e(this.ae);
      this.s.h(this.ae);
      this.j.L().b(new agv(this.ae));
   }

   @Override
   protected void aN_() {
      super.aN_();
      int $$0 = (this.k - this.c) / 2;
      int $$1 = (this.l - this.d) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.af[$$3] = this.c(new fls.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fls.a) {
               this.ae = ((fls.a)$$0x).a() + this.ag;
               this.E();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fdc $$0, int $$1, int $$2) {
      int $$3 = this.s.n();
      if ($$3 > 0 && $$3 <= 5 && this.s.q()) {
         wg $$4 = wg.a("merchant.title", this.i, wg.c("merchant.level." + $$3));
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
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(J, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.d, 512, 256);
      cxw $$6 = this.s.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ae;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         cxv $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(A, this.w + 83 + 99, this.x + 35, 0, 28, 21);
         }
      }
   }

   private void a(fdc $$0, int $$1, int $$2, cxv $$3) {
      int $$4 = this.s.n();
      int $$5 = this.s.l();
      if ($$4 < 5) {
         $$0.a(B, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cjh.b($$4);
         if ($$5 >= $$6 && cjh.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cjh.c($$4) - $$6);
            int $$9 = Math.min(axk.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(C, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.s.m();
            if ($$10 > 0) {
               int $$11 = Math.min(axk.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(D, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(fdc $$0, int $$1, int $$2, cxw $$3) {
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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      cxw $$4 = this.s.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.k - this.c) / 2;
         int $$6 = (this.l - this.d) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (cxv $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ag && $$9 < 7 + this.ag) {
               crj $$11 = $$10.a();
               crj $$12 = $$10.b();
               crj $$13 = $$10.c();
               crj $$14 = $$10.f();
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
         cxv $$17 = $$4.get($$16);
         if (this.s.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.s.o()) {
            $$0.a(this.m, ad, $$1, $$2);
         }

         for (fls.a $$18 : this.af) {
            if ($$18.A()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.s.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fdc $$0, cxv $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.r()) {
         $$0.a(G, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(H, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(fdc $$0, crj $$1, crj $$2, int $$3, int $$4) {
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
         this.ag = axk.a((int)((double)this.ag - $$3), 0, $$5);
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
         this.ag = axk.a((int)$$9, 0, $$8);
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

   class a extends fdp {
      final int a;

      public a(int $$0, int $$1, int $$2, fdp.c $$3) {
         super($$0, $$1, 88, 20, wf.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fdc $$0, int $$1, int $$2) {
         if (this.i && fls.this.s.p().size() > this.a + fls.this.ag) {
            if ($$1 < this.C() + 20) {
               crj $$3 = fls.this.s.p().get(this.a + fls.this.ag).b();
               $$0.b(fls.this.m, $$3, $$1, $$2);
            } else if ($$1 < this.C() + 50 && $$1 > this.C() + 30) {
               crj $$4 = fls.this.s.p().get(this.a + fls.this.ag).c();
               if (!$$4.d()) {
                  $$0.b(fls.this.m, $$4, $$1, $$2);
               }
            } else if ($$1 > this.C() + 65) {
               crj $$5 = fls.this.s.p().get(this.a + fls.this.ag).f();
               $$0.b(fls.this.m, $$5, $$1, $$2);
            }
         }
      }
   }
}
