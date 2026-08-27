import com.mojang.blaze3d.systems.RenderSystem;

public class fcz extends fbt<chv> {
   private static final agi x = new agi("container/villager/out_of_stock");
   private static final agi y = new agi("container/villager/experience_bar_background");
   private static final agi z = new agi("container/villager/experience_bar_current");
   private static final agi A = new agi("container/villager/experience_bar_result");
   private static final agi B = new agi("container/villager/scroller");
   private static final agi C = new agi("container/villager/scroller_disabled");
   private static final agi D = new agi("container/villager/trade_arrow_out_of_stock");
   private static final agi E = new agi("container/villager/trade_arrow");
   private static final agi F = new agi("container/villager/discount_strikethrough");
   private static final agi G = new agi("textures/gui/container/villager.png");
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
   private static final ur Z = ur.c("merchant.trades");
   private static final ur aa = ur.c("merchant.deprecated");
   private int ab;
   private final fcz.a[] ac = new fcz.a[7];
   int ad;
   private boolean ae;

   public fcz(chv $$0, cdt $$1, ur $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.n = 107;
   }

   private void E() {
      this.p.e(this.ab);
      this.p.h(this.ab);
      this.f.I().b(new adv(this.ab));
   }

   @Override
   protected void aP_() {
      super.aP_();
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.ac[$$3] = this.d(new fcz.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fcz.a) {
               this.ab = ((fcz.a)$$0x).a() + this.ad;
               this.E();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(euo $$0, int $$1, int $$2) {
      int $$3 = this.p.n();
      if ($$3 > 0 && $$3 <= 5 && this.p.q()) {
         ur $$4 = ur.a("merchant.title", this.e, ur.c("merchant.level." + $$3));
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
   protected void a(euo $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(G, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.k, 512, 256);
      cqz $$6 = this.p.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ab;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         cqy $$8 = $$6.get($$7);
         if ($$8.p()) {
            $$0.a(x, this.t + 83 + 99, this.u + 35, 0, 28, 21);
         }
      }
   }

   private void a(euo $$0, int $$1, int $$2, cqy $$3) {
      int $$4 = this.p.n();
      int $$5 = this.p.l();
      if ($$4 < 5) {
         $$0.a(y, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cdi.b($$4);
         if ($$5 >= $$6 && cdi.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cdi.c($$4) - $$6);
            int $$9 = Math.min(atm.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(z, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.p.m();
            if ($$10 > 0) {
               int $$11 = Math.min(atm.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(A, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(euo $$0, int $$1, int $$2, cqz $$3) {
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
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      cqz $$4 = this.p.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.g - this.c) / 2;
         int $$6 = (this.h - this.k) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (cqy $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ad && $$9 < 7 + this.ad) {
               clj $$11 = $$10.a();
               clj $$12 = $$10.b();
               clj $$13 = $$10.c();
               clj $$14 = $$10.d();
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
         cqy $$17 = $$4.get($$16);
         if (this.p.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.p() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.p.o()) {
            $$0.a(this.i, aa, $$1, $$2);
         }

         for (fcz.a $$18 : this.ac) {
            if ($$18.n()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.j = $$18.a < this.p.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(euo $$0, cqy $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.p()) {
         $$0.a(D, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(E, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(euo $$0, clj $$1, clj $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.L() == $$1.L()) {
         $$0.a(this.i, $$1, $$3, $$4);
      } else {
         $$0.a(this.i, $$2, $$3, $$4, $$2.L() == 1 ? "1" : null);
         $$0.a(this.i, $$1, $$3 + 14, $$4, $$1.L() == 1 ? "1" : null);
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
         this.ad = atm.a((int)((double)this.ad - $$3), 0, $$5);
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
         this.ad = atm.a((int)$$9, 0, $$8);
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

   class a extends euz {
      final int a;

      public a(int $$0, int $$1, int $$2, euz.c $$3) {
         super($$0, $$1, 88, 20, uq.a, $$3, p);
         this.a = $$2;
         this.j = false;
      }

      public int a() {
         return this.a;
      }

      public void a(euo $$0, int $$1, int $$2) {
         if (this.h && fcz.this.p.p().size() > this.a + fcz.this.ad) {
            if ($$1 < this.p() + 20) {
               clj $$3 = fcz.this.p.p().get(this.a + fcz.this.ad).b();
               $$0.b(fcz.this.i, $$3, $$1, $$2);
            } else if ($$1 < this.p() + 50 && $$1 > this.p() + 30) {
               clj $$4 = fcz.this.p.p().get(this.a + fcz.this.ad).c();
               if (!$$4.b()) {
                  $$0.b(fcz.this.i, $$4, $$1, $$2);
               }
            } else if ($$1 > this.p() + 65) {
               clj $$5 = fcz.this.p.p().get(this.a + fcz.this.ad).d();
               $$0.b(fcz.this.i, $$5, $$1, $$2);
            }
         }
      }
   }
}
