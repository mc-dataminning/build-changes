import com.mojang.blaze3d.systems.RenderSystem;

public class fph extends foa<cqs> {
   private static final akk D = new akk("container/villager/out_of_stock");
   private static final akk E = new akk("container/villager/experience_bar_background");
   private static final akk F = new akk("container/villager/experience_bar_current");
   private static final akk G = new akk("container/villager/experience_bar_result");
   private static final akk H = new akk("container/villager/scroller");
   private static final akk I = new akk("container/villager/scroller_disabled");
   private static final akk J = new akk("container/villager/trade_arrow_out_of_stock");
   private static final akk K = new akk("container/villager/trade_arrow");
   private static final akk L = new akk("container/villager/discount_strikethrough");
   private static final akk M = new akk("textures/gui/container/villager.png");
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
   private static final wu af = wu.c("merchant.trades");
   private static final wu ag = wu.c("merchant.deprecated");
   private int ah;
   private final fph.a[] ai = new fph.a[7];
   int aj;
   private boolean ak;

   public fph(cqs $$0, cmk $$1, wu $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.u = 107;
   }

   private void F() {
      this.w.e(this.ah);
      this.w.h(this.ah);
      this.l.L().b(new ahm(this.ah));
   }

   @Override
   protected void aP_() {
      super.aP_();
      int $$0 = (this.m - this.c) / 2;
      int $$1 = (this.n - this.q) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.ai[$$3] = this.c(new fph.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fph.a) {
               this.ah = ((fph.a)$$0x).a() + this.aj;
               this.F();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fhh $$0, int $$1, int $$2) {
      int $$3 = this.w.n();
      if ($$3 > 0 && $$3 <= 5 && this.w.q()) {
         wu $$4 = wu.a("merchant.title", this.k, wu.c("merchant.level." + $$3));
         int $$5 = this.o.a($$4);
         int $$6 = 49 + this.c / 2 - $$5 / 2;
         $$0.a(this.o, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.o, this.k, 49 + this.c / 2 - this.o.a(this.k) / 2, 6, 4210752, false);
      }

      $$0.a(this.o, this.x, this.u, this.v, 4210752, false);
      int $$7 = this.o.a(af);
      $$0.a(this.o, af, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(fhh $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(M, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.q, 512, 256);
      dbf $$6 = this.w.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ah;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         dbe $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(D, this.z + 83 + 99, this.A + 35, 0, 28, 21);
         }
      }
   }

   private void a(fhh $$0, int $$1, int $$2, dbe $$3) {
      int $$4 = this.w.n();
      int $$5 = this.w.l();
      if ($$4 < 5) {
         $$0.a(E, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = clz.b($$4);
         if ($$5 >= $$6 && clz.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(clz.c($$4) - $$6);
            int $$9 = Math.min(ayg.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(F, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.w.m();
            if ($$10 > 0) {
               int $$11 = Math.min(ayg.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(G, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(fhh $$0, int $$1, int $$2, dbf $$3) {
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dbf $$4 = this.w.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.m - this.c) / 2;
         int $$6 = (this.n - this.q) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (dbe $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.aj && $$9 < 7 + this.aj) {
               cud $$11 = $$10.a();
               cud $$12 = $$10.b();
               cud $$13 = $$10.c();
               cud $$14 = $$10.f();
               $$0.c().a();
               $$0.c().a(0.0F, 0.0F, 100.0F);
               int $$15 = $$7 + 2;
               this.a($$0, $$12, $$11, $$8, $$15);
               if (!$$13.e()) {
                  $$0.b($$13, $$5 + 5 + 35, $$15);
                  $$0.a(this.o, $$13, $$5 + 5 + 35, $$15);
               }

               this.a($$0, $$10, $$5, $$15);
               $$0.b($$14, $$5 + 5 + 68, $$15);
               $$0.a(this.o, $$14, $$5 + 5 + 68, $$15);
               $$0.c().b();
               $$7 += 20;
               $$9++;
            } else {
               $$9++;
            }
         }

         int $$16 = this.ah;
         dbe $$17 = $$4.get($$16);
         if (this.w.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.w.o()) {
            $$0.a(this.o, ag, $$1, $$2);
         }

         for (fph.a $$18 : this.ai) {
            if ($$18.B()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.w.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fhh $$0, dbe $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.r()) {
         $$0.a(J, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(K, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(fhh $$0, cud $$1, cud $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.H() == $$1.H()) {
         $$0.a(this.o, $$1, $$3, $$4);
      } else {
         $$0.a(this.o, $$2, $$3, $$4, $$2.H() == 1 ? "1" : null);
         $$0.a(this.o, $$1, $$3 + 14, $$4, $$1.H() == 1 ? "1" : null);
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
         this.aj = ayg.a((int)((double)this.aj - $$3), 0, $$5);
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
         this.aj = ayg.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ak = false;
      int $$3 = (this.m - this.c) / 2;
      int $$4 = (this.n - this.q) / 2;
      if (this.a(this.w.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.ak = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fhu {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final fhu.c $$3) {
         super($$0, $$1, 88, 20, wt.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fhh $$0, int $$1, int $$2) {
         if (this.i && fph.this.w.p().size() > this.a + fph.this.aj) {
            if ($$1 < this.D() + 20) {
               cud $$3 = fph.this.w.p().get(this.a + fph.this.aj).b();
               $$0.b(fph.this.o, $$3, $$1, $$2);
            } else if ($$1 < this.D() + 50 && $$1 > this.D() + 30) {
               cud $$4 = fph.this.w.p().get(this.a + fph.this.aj).c();
               if (!$$4.e()) {
                  $$0.b(fph.this.o, $$4, $$1, $$2);
               }
            } else if ($$1 > this.D() + 65) {
               cud $$5 = fph.this.w.p().get(this.a + fph.this.aj).f();
               $$0.b(fph.this.o, $$5, $$1, $$2);
            }
         }
      }
   }
}
