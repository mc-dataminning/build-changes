import com.mojang.blaze3d.systems.RenderSystem;

public class ewu extends evp<ccm> {
   private static final acq w = new acq("textures/gui/container/villager2.png");
   private static final int x = 512;
   private static final int y = 256;
   private static final int z = 99;
   private static final int A = 136;
   private static final int C = 16;
   private static final int D = 5;
   private static final int E = 35;
   private static final int F = 68;
   private static final int G = 6;
   private static final int H = 7;
   private static final int I = 5;
   private static final int J = 20;
   private static final int K = 88;
   private static final int L = 27;
   private static final int M = 6;
   private static final int N = 139;
   private static final int O = 18;
   private static final int P = 94;
   private static final sw Q = sw.c("merchant.trades");
   private static final sw R = sw.b(" - ");
   private static final sw S = sw.c("merchant.deprecated");
   private int T;
   private final ewu.a[] U = new ewu.a[7];
   int V;
   private boolean W;

   public ewu(ccm $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.n = 107;
   }

   private void D() {
      this.p.e(this.T);
      this.p.h(this.T);
      this.f.I().a(new aam(this.T));
   }

   @Override
   protected void b() {
      super.b();
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.U[$$3] = this.d(new ewu.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof ewu.a) {
               this.T = ((ewu.a)$$0x).a() + this.V;
               this.D();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(eox $$0, int $$1, int $$2) {
      int $$3 = this.p.n();
      if ($$3 > 0 && $$3 <= 5 && this.p.q()) {
         sw $$4 = this.e.e().b(R).b(sw.c("merchant.level." + $$3));
         int $$5 = this.i.a($$4);
         int $$6 = 49 + this.c / 2 - $$5 / 2;
         $$0.a(this.i, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.i, this.e, 49 + this.c / 2 - this.i.a(this.e) / 2, 6, 4210752, false);
      }

      $$0.a(this.i, this.q, this.n, this.o, 4210752, false);
      int $$7 = this.i.a(Q);
      $$0.a(this.i, Q, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(w, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.k, 512, 256);
      cll $$6 = this.p.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.T;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         clk $$8 = $$6.get($$7);
         if ($$8.p()) {
            $$0.a(w, this.s + 83 + 99, this.t + 35, 0, 311.0F, 0.0F, 28, 21, 512, 256);
         }
      }
   }

   private void a(eox $$0, int $$1, int $$2, clk $$3) {
      int $$4 = this.p.n();
      int $$5 = this.p.l();
      if ($$4 < 5) {
         $$0.a(w, $$1 + 136, $$2 + 16, 0, 0.0F, 186.0F, 102, 5, 512, 256);
         int $$6 = byc.b($$4);
         if ($$5 >= $$6 && byc.d($$4)) {
            int $$7 = 100;
            float $$8 = 100.0F / (float)(byc.c($$4) - $$6);
            int $$9 = Math.min(apa.d($$8 * (float)($$5 - $$6)), 100);
            $$0.a(w, $$1 + 136, $$2 + 16, 0, 0.0F, 191.0F, $$9 + 1, 5, 512, 256);
            int $$10 = this.p.m();
            if ($$10 > 0) {
               int $$11 = Math.min(apa.d((float)$$10 * $$8), 100 - $$9);
               $$0.a(w, $$1 + 136 + $$9 + 1, $$2 + 16 + 1, 0, 2.0F, 182.0F, $$11, 3, 512, 256);
            }
         }
      }
   }

   private void a(eox $$0, int $$1, int $$2, cll $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.V * $$6);
         if (this.V == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(w, $$1 + 94, $$2 + 18 + $$8, 0, 0.0F, 199.0F, 6, 27, 512, 256);
      } else {
         $$0.a(w, $$1 + 94, $$2 + 18, 0, 6.0F, 199.0F, 6, 27, 512, 256);
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
      cll $$4 = this.p.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.g - this.c) / 2;
         int $$6 = (this.h - this.k) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (clk $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.V && $$9 < 7 + this.V) {
               cfz $$11 = $$10.a();
               cfz $$12 = $$10.b();
               cfz $$13 = $$10.c();
               cfz $$14 = $$10.d();
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

         int $$16 = this.T;
         clk $$17 = $$4.get($$16);
         if (this.p.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.p() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.p.o()) {
            $$0.a(this.i, S, $$1, $$2);
         }

         for (ewu.a $$18 : this.U) {
            if ($$18.n()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.s = $$18.a < this.p.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(eox $$0, clk $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.p()) {
         $$0.a(w, $$2 + 5 + 35 + 20, $$3 + 3, 0, 25.0F, 171.0F, 10, 9, 512, 256);
      } else {
         $$0.a(w, $$2 + 5 + 35 + 20, $$3 + 3, 0, 15.0F, 171.0F, 10, 9, 512, 256);
      }
   }

   private void a(eox $$0, cfz $$1, cfz $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.L() == $$1.L()) {
         $$0.a(this.i, $$1, $$3, $$4);
      } else {
         $$0.a(this.i, $$2, $$3, $$4, $$2.L() == 1 ? "1" : null);
         $$0.a(this.i, $$1, $$3 + 14, $$4, $$1.L() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(w, $$3 + 7, $$4 + 12, 0, 0.0F, 176.0F, 9, 2, 512, 256);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2) {
      int $$3 = this.p.p().size();
      if (this.a($$3)) {
         int $$4 = $$3 - 7;
         this.V = apa.a((int)((double)this.V - $$2), 0, $$4);
      }

      return true;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.p.p().size();
      if (this.W) {
         int $$6 = this.t + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - (float)$$6 - 13.5F) / ((float)($$7 - $$6) - 27.0F);
         $$9 = $$9 * (float)$$8 + 0.5F;
         this.V = apa.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.W = false;
      int $$3 = (this.g - this.c) / 2;
      int $$4 = (this.h - this.k) / 2;
      if (this.a(this.p.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.W = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends epi {
      final int a;

      public a(int $$0, int $$1, int $$2, epi.c $$3) {
         super($$0, $$1, 88, 20, sv.a, $$3, x);
         this.a = $$2;
         this.s = false;
      }

      @Override
      public int a() {
         return this.a;
      }

      public void a(eox $$0, int $$1, int $$2) {
         if (this.q && ewu.this.p.p().size() > this.a + ewu.this.V) {
            if ($$1 < this.p() + 20) {
               cfz $$3 = ewu.this.p.p().get(this.a + ewu.this.V).b();
               $$0.b(ewu.this.i, $$3, $$1, $$2);
            } else if ($$1 < this.p() + 50 && $$1 > this.p() + 30) {
               cfz $$4 = ewu.this.p.p().get(this.a + ewu.this.V).c();
               if (!$$4.b()) {
                  $$0.b(ewu.this.i, $$4, $$1, $$2);
               }
            } else if ($$1 > this.p() + 65) {
               cfz $$5 = ewu.this.p.p().get(this.a + ewu.this.V).d();
               $$0.b(ewu.this.i, $$5, $$1, $$2);
            }
         }
      }
   }
}
