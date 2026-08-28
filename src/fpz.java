import com.mojang.blaze3d.systems.RenderSystem;

public class fpz extends fot<cre> {
   private static final akr E = akr.b("container/villager/out_of_stock");
   private static final akr F = akr.b("container/villager/experience_bar_background");
   private static final akr G = akr.b("container/villager/experience_bar_current");
   private static final akr H = akr.b("container/villager/experience_bar_result");
   private static final akr I = akr.b("container/villager/scroller");
   private static final akr J = akr.b("container/villager/scroller_disabled");
   private static final akr K = akr.b("container/villager/trade_arrow_out_of_stock");
   private static final akr L = akr.b("container/villager/trade_arrow");
   private static final akr M = akr.b("container/villager/discount_strikethrough");
   private static final akr N = akr.b("textures/gui/container/villager.png");
   private static final int O = 512;
   private static final int P = 256;
   private static final int Q = 99;
   private static final int R = 136;
   private static final int S = 16;
   private static final int T = 5;
   private static final int U = 35;
   private static final int V = 68;
   private static final int W = 6;
   private static final int X = 7;
   private static final int Y = 5;
   private static final int Z = 20;
   private static final int aa = 88;
   private static final int ab = 27;
   private static final int ac = 6;
   private static final int ad = 139;
   private static final int ae = 18;
   private static final int af = 94;
   private static final wz ag = wz.c("merchant.trades");
   private static final wz ah = wz.c("merchant.deprecated");
   private int ai;
   private final fpz.a[] aj = new fpz.a[7];
   int ak;
   private boolean al;

   public fpz(cre $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.v = 107;
   }

   private void E() {
      this.x.e(this.ai);
      this.x.h(this.ai);
      this.l.L().b(new aht(this.ai));
   }

   @Override
   protected void aT_() {
      super.aT_();
      int $$0 = (this.m - this.c) / 2;
      int $$1 = (this.n - this.r) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.aj[$$3] = this.c(new fpz.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fpz.a) {
               this.ai = ((fpz.a)$$0x).a() + this.ak;
               this.E();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fhz $$0, int $$1, int $$2) {
      int $$3 = this.x.n();
      if ($$3 > 0 && $$3 <= 5 && this.x.q()) {
         wz $$4 = wz.a("merchant.title", this.k, wz.c("merchant.level." + $$3));
         int $$5 = this.o.a($$4);
         int $$6 = 49 + this.c / 2 - $$5 / 2;
         $$0.a(this.o, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.o, this.k, 49 + this.c / 2 - this.o.a(this.k) / 2, 6, 4210752, false);
      }

      $$0.a(this.o, this.y, this.v, this.w, 4210752, false);
      int $$7 = this.o.a(ag);
      $$0.a(this.o, ag, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(N, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.r, 512, 256);
      dbv $$6 = this.x.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ai;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         dbu $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(E, this.A + 83 + 99, this.B + 35, 0, 28, 21);
         }
      }
   }

   private void a(fhz $$0, int $$1, int $$2, dbu $$3) {
      int $$4 = this.x.n();
      int $$5 = this.x.l();
      if ($$4 < 5) {
         $$0.a(F, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cml.b($$4);
         if ($$5 >= $$6 && cml.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cml.c($$4) - $$6);
            int $$9 = Math.min(ayo.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(G, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.x.m();
            if ($$10 > 0) {
               int $$11 = Math.min(ayo.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(H, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(fhz $$0, int $$1, int $$2, dbv $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.ak * $$6);
         if (this.ak == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(I, $$1 + 94, $$2 + 18 + $$8, 0, 6, 27);
      } else {
         $$0.a(J, $$1 + 94, $$2 + 18, 0, 6, 27);
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dbv $$4 = this.x.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.m - this.c) / 2;
         int $$6 = (this.n - this.r) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (dbu $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ak && $$9 < 7 + this.ak) {
               cuq $$11 = $$10.a();
               cuq $$12 = $$10.b();
               cuq $$13 = $$10.c();
               cuq $$14 = $$10.f();
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

         int $$16 = this.ai;
         dbu $$17 = $$4.get($$16);
         if (this.x.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.x.o()) {
            $$0.a(this.o, ah, $$1, $$2);
         }

         for (fpz.a $$18 : this.aj) {
            if ($$18.B()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.x.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fhz $$0, dbu $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.r()) {
         $$0.a(K, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(L, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(fhz $$0, cuq $$1, cuq $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.H() == $$1.H()) {
         $$0.a(this.o, $$1, $$3, $$4);
      } else {
         $$0.a(this.o, $$2, $$3, $$4, $$2.H() == 1 ? "1" : null);
         $$0.a(this.o, $$1, $$3 + 14, $$4, $$1.H() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(M, $$3 + 7, $$4 + 12, 0, 9, 2);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.x.p().size();
      if (this.a($$4)) {
         int $$5 = $$4 - 7;
         this.ak = ayo.a((int)((double)this.ak - $$3), 0, $$5);
      }

      return true;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.x.p().size();
      if (this.al) {
         int $$6 = this.B + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - (float)$$6 - 13.5F) / ((float)($$7 - $$6) - 27.0F);
         $$9 = $$9 * (float)$$8 + 0.5F;
         this.ak = ayo.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.al = false;
      int $$3 = (this.m - this.c) / 2;
      int $$4 = (this.n - this.r) / 2;
      if (this.a(this.x.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.al = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fim {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final fim.c $$3) {
         super($$0, $$1, 88, 20, wy.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fhz $$0, int $$1, int $$2) {
         if (this.i && fpz.this.x.p().size() > this.a + fpz.this.ak) {
            if ($$1 < this.D() + 20) {
               cuq $$3 = fpz.this.x.p().get(this.a + fpz.this.ak).b();
               $$0.b(fpz.this.o, $$3, $$1, $$2);
            } else if ($$1 < this.D() + 50 && $$1 > this.D() + 30) {
               cuq $$4 = fpz.this.x.p().get(this.a + fpz.this.ak).c();
               if (!$$4.e()) {
                  $$0.b(fpz.this.o, $$4, $$1, $$2);
               }
            } else if ($$1 > this.D() + 65) {
               cuq $$5 = fpz.this.x.p().get(this.a + fpz.this.ak).f();
               $$0.b(fpz.this.o, $$5, $$1, $$2);
            }
         }
      }
   }
}
