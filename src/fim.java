import com.mojang.blaze3d.systems.RenderSystem;

public class fim extends fhg<cmd> {
   private static final ajc x = new ajc("container/villager/out_of_stock");
   private static final ajc y = new ajc("container/villager/experience_bar_background");
   private static final ajc z = new ajc("container/villager/experience_bar_current");
   private static final ajc A = new ajc("container/villager/experience_bar_result");
   private static final ajc B = new ajc("container/villager/scroller");
   private static final ajc C = new ajc("container/villager/scroller_disabled");
   private static final ajc D = new ajc("container/villager/trade_arrow_out_of_stock");
   private static final ajc E = new ajc("container/villager/trade_arrow");
   private static final ajc F = new ajc("container/villager/discount_strikethrough");
   private static final ajc G = new ajc("textures/gui/container/villager.png");
   private static final int H = 512;
   private static final int I = 256;
   private static final int J = 99;
   private static final int K = 136;
   private static final int L = 16;
   private static final int M = 5;
   private static final int N = 35;
   private static final int O = 68;
   private static final int P = 6;
   private static final int Q = 7;
   private static final int R = 5;
   private static final int S = 20;
   private static final int T = 88;
   private static final int U = 27;
   private static final int V = 6;
   private static final int W = 139;
   private static final int X = 18;
   private static final int Y = 94;
   private static final vs Z = vs.c("merchant.trades");
   private static final vs aa = vs.c("merchant.deprecated");
   private int ab;
   private final fim.a[] ac = new fim.a[7];
   int ad;
   private boolean ae;

   public fim(cmd $$0, chz $$1, vs $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.n = 107;
   }

   private void I() {
      this.p.e(this.ab);
      this.p.h(this.ab);
      this.f.K().b(new agf(this.ab));
   }

   @Override
   protected void aP_() {
      super.aP_();
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.ac[$$3] = this.c(new fim.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fim.a) {
               this.ab = ((fim.a)$$0x).a() + this.ad;
               this.I();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(ezx $$0, int $$1, int $$2) {
      int $$3 = this.p.n();
      if ($$3 > 0 && $$3 <= 5 && this.p.q()) {
         vs $$4 = vs.a("merchant.title", this.e, vs.c("merchant.level." + $$3));
         int $$5 = this.i.a($$4);
         int $$6 = 49 + this.c / 2 - $$5 / 2;
         $$0.a(this.i, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.i, this.e, 49 + this.c / 2 - this.i.a(this.e) / 2, 6, 4210752, false);
      }

      $$0.a(this.i, this.q, this.n, this.o, 4210752, false);
      int $$7 = this.i.a(Z);
      $$0.a(this.i, Z, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(ezx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(G, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.k, 512, 256);
      cvd $$6 = this.p.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ab;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         cvc $$8 = $$6.get($$7);
         if ($$8.q()) {
            $$0.a(x, this.t + 83 + 99, this.u + 35, 0, 28, 21);
         }
      }
   }

   private void a(ezx $$0, int $$1, int $$2, cvc $$3) {
      int $$4 = this.p.n();
      int $$5 = this.p.l();
      if ($$4 < 5) {
         $$0.a(y, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cho.b($$4);
         if ($$5 >= $$6 && cho.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cho.c($$4) - $$6);
            int $$9 = Math.min(awm.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(z, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.p.m();
            if ($$10 > 0) {
               int $$11 = Math.min(awm.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(A, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(ezx $$0, int $$1, int $$2, cvd $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.ad * $$6);
         if (this.ad == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(B, $$1 + 94, $$2 + 18 + $$8, 0, 6, 27);
      } else {
         $$0.a(C, $$1 + 94, $$2 + 18, 0, 6, 27);
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      cvd $$4 = this.p.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.g - this.c) / 2;
         int $$6 = (this.h - this.k) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (cvc $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ad && $$9 < 7 + this.ad) {
               cpq $$11 = $$10.a();
               cpq $$12 = $$10.b();
               cpq $$13 = $$10.c();
               cpq $$14 = $$10.d();
               $$0.c().a();
               $$0.c().a(0.0F, 0.0F, 100.0F);
               int $$15 = $$7 + 2;
               this.a($$0, $$12, $$11, $$8, $$15);
               if (!$$13.b()) {
                  $$0.b($$13, $$5 + 5 + 35, $$15);
                  $$0.a(this.i, $$13, $$5 + 5 + 35, $$15);
               }

               this.a($$0, $$10, $$5, $$15);
               $$0.b($$14, $$5 + 5 + 68, $$15);
               $$0.a(this.i, $$14, $$5 + 5 + 68, $$15);
               $$0.c().b();
               $$7 += 20;
               $$9++;
            } else {
               $$9++;
            }
         }

         int $$16 = this.ab;
         cvc $$17 = $$4.get($$16);
         if (this.p.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.q() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.p.o()) {
            $$0.a(this.i, aa, $$1, $$2);
         }

         for (fim.a $$18 : this.ac) {
            if ($$18.z()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.p.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(ezx $$0, cvc $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.q()) {
         $$0.a(D, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(E, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(ezx $$0, cpq $$1, cpq $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.M() == $$1.M()) {
         $$0.a(this.i, $$1, $$3, $$4);
      } else {
         $$0.a(this.i, $$2, $$3, $$4, $$2.M() == 1 ? "1" : null);
         $$0.a(this.i, $$1, $$3 + 14, $$4, $$1.M() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(F, $$3 + 7, $$4 + 12, 0, 9, 2);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.p.p().size();
      if (this.a($$4)) {
         int $$5 = $$4 - 7;
         this.ad = awm.a((int)((double)this.ad - $$3), 0, $$5);
      }

      return true;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.p.p().size();
      if (this.ae) {
         int $$6 = this.u + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - (float)$$6 - 13.5F) / ((float)($$7 - $$6) - 27.0F);
         $$9 = $$9 * (float)$$8 + 0.5F;
         this.ad = awm.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ae = false;
      int $$3 = (this.g - this.c) / 2;
      int $$4 = (this.h - this.k) / 2;
      if (this.a(this.p.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.ae = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fak {
      final int a;

      public a(int $$0, int $$1, int $$2, fak.c $$3) {
         super($$0, $$1, 88, 20, vr.a, $$3, p);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(ezx $$0, int $$1, int $$2) {
         if (this.i && fim.this.p.p().size() > this.a + fim.this.ad) {
            if ($$1 < this.B() + 20) {
               cpq $$3 = fim.this.p.p().get(this.a + fim.this.ad).b();
               $$0.b(fim.this.i, $$3, $$1, $$2);
            } else if ($$1 < this.B() + 50 && $$1 > this.B() + 30) {
               cpq $$4 = fim.this.p.p().get(this.a + fim.this.ad).c();
               if (!$$4.b()) {
                  $$0.b(fim.this.i, $$4, $$1, $$2);
               }
            } else if ($$1 > this.B() + 65) {
               cpq $$5 = fim.this.p.p().get(this.a + fim.this.ad).d();
               $$0.b(fim.this.i, $$5, $$1, $$2);
            }
         }
      }
   }
}
