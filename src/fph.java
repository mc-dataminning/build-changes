import com.mojang.blaze3d.systems.RenderSystem;

public class fph extends foa<crc> {
   private static final ale D = new ale("container/villager/out_of_stock");
   private static final ale E = new ale("container/villager/experience_bar_background");
   private static final ale F = new ale("container/villager/experience_bar_current");
   private static final ale G = new ale("container/villager/experience_bar_result");
   private static final ale H = new ale("container/villager/scroller");
   private static final ale I = new ale("container/villager/scroller_disabled");
   private static final ale J = new ale("container/villager/trade_arrow_out_of_stock");
   private static final ale K = new ale("container/villager/trade_arrow");
   private static final ale L = new ale("container/villager/discount_strikethrough");
   private static final ale M = new ale("textures/gui/container/villager.png");
   private static final int N = 512;
   private static final int O = 256;
   private static final int P = 99;
   private static final int Q = 136;
   private static final int R = 16;
   private static final int S = 5;
   private static final int T = 35;
   private static final int U = 68;
   private static final int V = 6;
   private static final int W = 7;
   private static final int X = 5;
   private static final int Y = 20;
   private static final int Z = 88;
   private static final int aa = 27;
   private static final int ab = 6;
   private static final int ac = 139;
   private static final int ad = 18;
   private static final int ae = 94;
   private static final xo af = xo.c("merchant.trades");
   private static final xo ag = xo.c("merchant.deprecated");
   private int ah;
   private final fph.a[] ai = new fph.a[7];
   int aj;
   private boolean ak;

   public fph(crc $$0, cmv $$1, xo $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.u = 107;
   }

   private void I() {
      this.w.e(this.ah);
      this.w.h(this.ah);
      this.m.L().b(new aig(this.ah));
   }

   @Override
   protected void aM_() {
      super.aM_();
      int $$0 = (this.n - this.c) / 2;
      int $$1 = (this.o - this.d) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.ai[$$3] = this.c(new fph.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fph.a) {
               this.ah = ((fph.a)$$0x).a() + this.aj;
               this.I();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fgq $$0, int $$1, int $$2) {
      int $$3 = this.w.n();
      if ($$3 > 0 && $$3 <= 5 && this.w.q()) {
         xo $$4 = xo.a("merchant.title", this.l, xo.c("merchant.level." + $$3));
         int $$5 = this.p.a($$4);
         int $$6 = 49 + this.c / 2 - $$5 / 2;
         $$0.a(this.p, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.p, this.l, 49 + this.c / 2 - this.p.a(this.l) / 2, 6, 4210752, false);
      }

      $$0.a(this.p, this.x, this.u, this.v, 4210752, false);
      int $$7 = this.p.a(af);
      $$0.a(this.p, af, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(fgq $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(M, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.d, 512, 256);
      daw $$6 = this.w.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ah;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         dav $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(D, this.z + 83 + 99, this.A + 35, 0, 28, 21);
         }
      }
   }

   private void a(fgq $$0, int $$1, int $$2, dav $$3) {
      int $$4 = this.w.n();
      int $$5 = this.w.l();
      if ($$4 < 5) {
         $$0.a(E, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cmk.b($$4);
         if ($$5 >= $$6 && cmk.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cmk.c($$4) - $$6);
            int $$9 = Math.min(ayy.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(F, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.w.m();
            if ($$10 > 0) {
               int $$11 = Math.min(ayy.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(G, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(fgq $$0, int $$1, int $$2, daw $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.aj * $$6);
         if (this.aj == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(H, $$1 + 94, $$2 + 18 + $$8, 0, 6, 27);
      } else {
         $$0.a(I, $$1 + 94, $$2 + 18, 0, 6, 27);
      }
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      daw $$4 = this.w.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.n - this.c) / 2;
         int $$6 = (this.o - this.d) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (dav $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.aj && $$9 < 7 + this.aj) {
               cuo $$11 = $$10.a();
               cuo $$12 = $$10.b();
               cuo $$13 = $$10.c();
               cuo $$14 = $$10.f();
               $$0.c().a();
               $$0.c().a(0.0F, 0.0F, 100.0F);
               int $$15 = $$7 + 2;
               this.a($$0, $$12, $$11, $$8, $$15);
               if (!$$13.e()) {
                  $$0.b($$13, $$5 + 5 + 35, $$15);
                  $$0.a(this.p, $$13, $$5 + 5 + 35, $$15);
               }

               this.a($$0, $$10, $$5, $$15);
               $$0.b($$14, $$5 + 5 + 68, $$15);
               $$0.a(this.p, $$14, $$5 + 5 + 68, $$15);
               $$0.c().b();
               $$7 += 20;
               $$9++;
            } else {
               $$9++;
            }
         }

         int $$16 = this.ah;
         dav $$17 = $$4.get($$16);
         if (this.w.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.w.o()) {
            $$0.a(this.p, ag, $$1, $$2);
         }

         for (fph.a $$18 : this.ai) {
            if ($$18.A()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.w.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fgq $$0, dav $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.r()) {
         $$0.a(J, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(K, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(fgq $$0, cuo $$1, cuo $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.I() == $$1.I()) {
         $$0.a(this.p, $$1, $$3, $$4);
      } else {
         $$0.a(this.p, $$2, $$3, $$4, $$2.I() == 1 ? "1" : null);
         $$0.a(this.p, $$1, $$3 + 14, $$4, $$1.I() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(L, $$3 + 7, $$4 + 12, 0, 9, 2);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.w.p().size();
      if (this.a($$4)) {
         int $$5 = $$4 - 7;
         this.aj = ayy.a((int)((double)this.aj - $$3), 0, $$5);
      }

      return true;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.w.p().size();
      if (this.ak) {
         int $$6 = this.A + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - (float)$$6 - 13.5F) / ((float)($$7 - $$6) - 27.0F);
         $$9 = $$9 * (float)$$8 + 0.5F;
         this.aj = ayy.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ak = false;
      int $$3 = (this.n - this.c) / 2;
      int $$4 = (this.o - this.d) / 2;
      if (this.a(this.w.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.ak = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fhd {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final fhd.c $$3) {
         super($$0, $$1, 88, 20, xn.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fgq $$0, int $$1, int $$2) {
         if (this.i && fph.this.w.p().size() > this.a + fph.this.aj) {
            if ($$1 < this.C() + 20) {
               cuo $$3 = fph.this.w.p().get(this.a + fph.this.aj).b();
               $$0.b(fph.this.p, $$3, $$1, $$2);
            } else if ($$1 < this.C() + 50 && $$1 > this.C() + 30) {
               cuo $$4 = fph.this.w.p().get(this.a + fph.this.aj).c();
               if (!$$4.e()) {
                  $$0.b(fph.this.p, $$4, $$1, $$2);
               }
            } else if ($$1 > this.C() + 65) {
               cuo $$5 = fph.this.w.p().get(this.a + fph.this.aj).f();
               $$0.b(fph.this.p, $$5, $$1, $$2);
            }
         }
      }
   }
}
