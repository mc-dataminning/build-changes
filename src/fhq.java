import com.mojang.blaze3d.systems.RenderSystem;

public class fhq extends fgk<clo> {
   private static final aiy x = new aiy("container/villager/out_of_stock");
   private static final aiy y = new aiy("container/villager/experience_bar_background");
   private static final aiy z = new aiy("container/villager/experience_bar_current");
   private static final aiy A = new aiy("container/villager/experience_bar_result");
   private static final aiy B = new aiy("container/villager/scroller");
   private static final aiy C = new aiy("container/villager/scroller_disabled");
   private static final aiy D = new aiy("container/villager/trade_arrow_out_of_stock");
   private static final aiy E = new aiy("container/villager/trade_arrow");
   private static final aiy F = new aiy("container/villager/discount_strikethrough");
   private static final aiy G = new aiy("textures/gui/container/villager.png");
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
   private static final vq Z = vq.c("merchant.trades");
   private static final vq aa = vq.c("merchant.deprecated");
   private int ab;
   private final fhq.a[] ac = new fhq.a[7];
   int ad;
   private boolean ae;

   public fhq(clo $$0, chk $$1, vq $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.n = 107;
   }

   private void I() {
      this.p.e(this.ab);
      this.p.h(this.ab);
      this.f.K().b(new agb(this.ab));
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.ac[$$3] = this.c(new fhq.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fhq.a) {
               this.ab = ((fhq.a)$$0x).a() + this.ad;
               this.I();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(ezb $$0, int $$1, int $$2) {
      int $$3 = this.p.n();
      if ($$3 > 0 && $$3 <= 5 && this.p.q()) {
         vq $$4 = vq.a("merchant.title", this.e, vq.c("merchant.level." + $$3));
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
   protected void a(ezb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(G, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.k, 512, 256);
      cuq $$6 = this.p.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ab;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         cup $$8 = $$6.get($$7);
         if ($$8.q()) {
            $$0.a(x, this.t + 83 + 99, this.u + 35, 0, 28, 21);
         }
      }
   }

   private void a(ezb $$0, int $$1, int $$2, cup $$3) {
      int $$4 = this.p.n();
      int $$5 = this.p.l();
      if ($$4 < 5) {
         $$0.a(y, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cgz.b($$4);
         if ($$5 >= $$6 && cgz.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cgz.c($$4) - $$6);
            int $$9 = Math.min(awi.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(z, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.p.m();
            if ($$10 > 0) {
               int $$11 = Math.min(awi.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(A, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(ezb $$0, int $$1, int $$2, cuq $$3) {
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      cuq $$4 = this.p.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.g - this.c) / 2;
         int $$6 = (this.h - this.k) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (cup $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ad && $$9 < 7 + this.ad) {
               cpd $$11 = $$10.a();
               cpd $$12 = $$10.b();
               cpd $$13 = $$10.c();
               cpd $$14 = $$10.d();
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
         cup $$17 = $$4.get($$16);
         if (this.p.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.q() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.p.o()) {
            $$0.a(this.i, aa, $$1, $$2);
         }

         for (fhq.a $$18 : this.ac) {
            if ($$18.z()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.p.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(ezb $$0, cup $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.q()) {
         $$0.a(D, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(E, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(ezb $$0, cpd $$1, cpd $$2, int $$3, int $$4) {
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
         this.ad = awi.a((int)((double)this.ad - $$3), 0, $$5);
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
         this.ad = awi.a((int)$$9, 0, $$8);
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

   class a extends ezo {
      final int a;

      public a(int $$0, int $$1, int $$2, ezo.c $$3) {
         super($$0, $$1, 88, 20, vp.a, $$3, p);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(ezb $$0, int $$1, int $$2) {
         if (this.i && fhq.this.p.p().size() > this.a + fhq.this.ad) {
            if ($$1 < this.B() + 20) {
               cpd $$3 = fhq.this.p.p().get(this.a + fhq.this.ad).b();
               $$0.b(fhq.this.i, $$3, $$1, $$2);
            } else if ($$1 < this.B() + 50 && $$1 > this.B() + 30) {
               cpd $$4 = fhq.this.p.p().get(this.a + fhq.this.ad).c();
               if (!$$4.b()) {
                  $$0.b(fhq.this.i, $$4, $$1, $$2);
               }
            } else if ($$1 > this.B() + 65) {
               cpd $$5 = fhq.this.p.p().get(this.a + fhq.this.ad).d();
               $$0.b(fhq.this.i, $$5, $$1, $$2);
            }
         }
      }
   }
}
