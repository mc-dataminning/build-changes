import com.mojang.blaze3d.systems.RenderSystem;

public class fpk extends fod<crf> {
   private static final alf D = new alf("container/villager/out_of_stock");
   private static final alf E = new alf("container/villager/experience_bar_background");
   private static final alf F = new alf("container/villager/experience_bar_current");
   private static final alf G = new alf("container/villager/experience_bar_result");
   private static final alf H = new alf("container/villager/scroller");
   private static final alf I = new alf("container/villager/scroller_disabled");
   private static final alf J = new alf("container/villager/trade_arrow_out_of_stock");
   private static final alf K = new alf("container/villager/trade_arrow");
   private static final alf L = new alf("container/villager/discount_strikethrough");
   private static final alf M = new alf("textures/gui/container/villager.png");
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
   private static final xp af = xp.c("merchant.trades");
   private static final xp ag = xp.c("merchant.deprecated");
   private int ah;
   private final fpk.a[] ai = new fpk.a[7];
   int aj;
   private boolean ak;

   public fpk(crf $$0, cmy $$1, xp $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.u = 107;
   }

   private void I() {
      this.w.e(this.ah);
      this.w.h(this.ah);
      this.m.L().b(new aih(this.ah));
   }

   @Override
   protected void aM_() {
      super.aM_();
      int $$0 = (this.n - this.c) / 2;
      int $$1 = (this.o - this.d) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.ai[$$3] = this.c(new fpk.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fpk.a) {
               this.ah = ((fpk.a)$$0x).a() + this.aj;
               this.I();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fgt $$0, int $$1, int $$2) {
      int $$3 = this.w.n();
      if ($$3 > 0 && $$3 <= 5 && this.w.q()) {
         xp $$4 = xp.a("merchant.title", this.l, xp.c("merchant.level." + $$3));
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
   protected void a(fgt $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(M, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.d, 512, 256);
      daz $$6 = this.w.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ah;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         day $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(D, this.z + 83 + 99, this.A + 35, 0, 28, 21);
         }
      }
   }

   private void a(fgt $$0, int $$1, int $$2, day $$3) {
      int $$4 = this.w.n();
      int $$5 = this.w.l();
      if ($$4 < 5) {
         $$0.a(E, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cmn.b($$4);
         if ($$5 >= $$6 && cmn.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cmn.c($$4) - $$6);
            int $$9 = Math.min(ayz.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(F, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.w.m();
            if ($$10 > 0) {
               int $$11 = Math.min(ayz.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(G, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(fgt $$0, int $$1, int $$2, daz $$3) {
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
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      daz $$4 = this.w.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.n - this.c) / 2;
         int $$6 = (this.o - this.d) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (day $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.aj && $$9 < 7 + this.aj) {
               cur $$11 = $$10.a();
               cur $$12 = $$10.b();
               cur $$13 = $$10.c();
               cur $$14 = $$10.f();
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
         day $$17 = $$4.get($$16);
         if (this.w.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.w.o()) {
            $$0.a(this.p, ag, $$1, $$2);
         }

         for (fpk.a $$18 : this.ai) {
            if ($$18.A()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.w.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fgt $$0, day $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.r()) {
         $$0.a(J, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(K, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(fgt $$0, cur $$1, cur $$2, int $$3, int $$4) {
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
         this.aj = ayz.a((int)((double)this.aj - $$3), 0, $$5);
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
         this.aj = ayz.a((int)$$9, 0, $$8);
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

   class a extends fhg {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final fhg.c $$3) {
         super($$0, $$1, 88, 20, xo.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fgt $$0, int $$1, int $$2) {
         if (this.i && fpk.this.w.p().size() > this.a + fpk.this.aj) {
            if ($$1 < this.C() + 20) {
               cur $$3 = fpk.this.w.p().get(this.a + fpk.this.aj).b();
               $$0.b(fpk.this.p, $$3, $$1, $$2);
            } else if ($$1 < this.C() + 50 && $$1 > this.C() + 30) {
               cur $$4 = fpk.this.w.p().get(this.a + fpk.this.aj).c();
               if (!$$4.e()) {
                  $$0.b(fpk.this.p, $$4, $$1, $$2);
               }
            } else if ($$1 > this.C() + 65) {
               cur $$5 = fpk.this.w.p().get(this.a + fpk.this.aj).f();
               $$0.b(fpk.this.p, $$5, $$1, $$2);
            }
         }
      }
   }
}
