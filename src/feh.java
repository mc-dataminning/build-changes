import com.mojang.blaze3d.systems.RenderSystem;

public class feh extends fdb<cit> {
   private static final agt x = new agt("container/villager/out_of_stock");
   private static final agt y = new agt("container/villager/experience_bar_background");
   private static final agt z = new agt("container/villager/experience_bar_current");
   private static final agt A = new agt("container/villager/experience_bar_result");
   private static final agt B = new agt("container/villager/scroller");
   private static final agt C = new agt("container/villager/scroller_disabled");
   private static final agt D = new agt("container/villager/trade_arrow_out_of_stock");
   private static final agt E = new agt("container/villager/trade_arrow");
   private static final agt F = new agt("container/villager/discount_strikethrough");
   private static final agt G = new agt("textures/gui/container/villager.png");
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
   private static final vb Z = vb.c("merchant.trades");
   private static final vb aa = vb.c("merchant.deprecated");
   private int ab;
   private final feh.a[] ac = new feh.a[7];
   int ad;
   private boolean ae;

   public feh(cit $$0, ceq $$1, vb $$2) {
      super($$0, $$1, $$2);
      this.c = 276;
      this.n = 107;
   }

   private void E() {
      this.p.e(this.ab);
      this.p.h(this.ab);
      this.f.I().b(new aeg(this.ab));
   }

   @Override
   protected void aP_() {
      super.aP_();
      int $$0 = (this.g - this.c) / 2;
      int $$1 = (this.h - this.k) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.ac[$$3] = this.d(new feh.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof feh.a) {
               this.ab = ((feh.a)$$0x).a() + this.ad;
               this.E();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(evw $$0, int $$1, int $$2) {
      int $$3 = this.p.n();
      if ($$3 > 0 && $$3 <= 5 && this.p.q()) {
         vb $$4 = vb.a("merchant.title", this.e, vb.c("merchant.level." + $$3));
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
   protected void a(evw $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(G, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.k, 512, 256);
      crx $$6 = this.p.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ab;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         crw $$8 = $$6.get($$7);
         if ($$8.p()) {
            $$0.a(x, this.t + 83 + 99, this.u + 35, 0, 28, 21);
         }
      }
   }

   private void a(evw $$0, int $$1, int $$2, crw $$3) {
      int $$4 = this.p.n();
      int $$5 = this.p.l();
      if ($$4 < 5) {
         $$0.a(y, $$1 + 136, $$2 + 16, 0, 102, 5);
         int $$6 = cef.b($$4);
         if ($$5 >= $$6 && cef.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cef.c($$4) - $$6);
            int $$9 = Math.min(aty.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(z, 102, 5, 0, 0, $$1 + 136, $$2 + 16, 0, $$9, 5);
            int $$10 = this.p.m();
            if ($$10 > 0) {
               int $$11 = Math.min(aty.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(A, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, 0, $$11, 5);
            }
         }
      }
   }

   private void a(evw $$0, int $$1, int $$2, crx $$3) {
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      crx $$4 = this.p.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.g - this.c) / 2;
         int $$6 = (this.h - this.k) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (crw $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ad && $$9 < 7 + this.ad) {
               cmh $$11 = $$10.a();
               cmh $$12 = $$10.b();
               cmh $$13 = $$10.c();
               cmh $$14 = $$10.d();
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
         crw $$17 = $$4.get($$16);
         if (this.p.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.p() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.p.o()) {
            $$0.a(this.i, aa, $$1, $$2);
         }

         for (feh.a $$18 : this.ac) {
            if ($$18.n()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.j = $$18.a < this.p.p().size();
         }

         RenderSystem.enableDepthTest();
      }

      this.a($$0, $$1, $$2);
   }

   private void a(evw $$0, crw $$1, int $$2, int $$3) {
      RenderSystem.enableBlend();
      if ($$1.p()) {
         $$0.a(D, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      } else {
         $$0.a(E, $$2 + 5 + 35 + 20, $$3 + 3, 0, 10, 9);
      }
   }

   private void a(evw $$0, cmh $$1, cmh $$2, int $$3, int $$4) {
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
         this.ad = aty.a((int)((double)this.ad - $$3), 0, $$5);
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
         this.ad = aty.a((int)$$9, 0, $$8);
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

   class a extends ewh {
      final int a;

      public a(int $$0, int $$1, int $$2, ewh.c $$3) {
         super($$0, $$1, 88, 20, va.a, $$3, p);
         this.a = $$2;
         this.j = false;
      }

      public int a() {
         return this.a;
      }

      public void a(evw $$0, int $$1, int $$2) {
         if (this.h && feh.this.p.p().size() > this.a + feh.this.ad) {
            if ($$1 < this.p() + 20) {
               cmh $$3 = feh.this.p.p().get(this.a + feh.this.ad).b();
               $$0.b(feh.this.i, $$3, $$1, $$2);
            } else if ($$1 < this.p() + 50 && $$1 > this.p() + 30) {
               cmh $$4 = feh.this.p.p().get(this.a + feh.this.ad).c();
               if (!$$4.b()) {
                  $$0.b(feh.this.i, $$4, $$1, $$2);
               }
            } else if ($$1 > this.p() + 65) {
               cmh $$5 = feh.this.p.p().get(this.a + feh.this.ad).d();
               $$0.b(feh.this.i, $$5, $$1, $$2);
            }
         }
      }
   }
}
