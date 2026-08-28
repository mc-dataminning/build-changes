public class fsv extends frp<csz> {
   private static final ali G = ali.b("container/villager/out_of_stock");
   private static final ali H = ali.b("container/villager/experience_bar_background");
   private static final ali I = ali.b("container/villager/experience_bar_current");
   private static final ali J = ali.b("container/villager/experience_bar_result");
   private static final ali K = ali.b("container/villager/scroller");
   private static final ali L = ali.b("container/villager/scroller_disabled");
   private static final ali M = ali.b("container/villager/trade_arrow_out_of_stock");
   private static final ali N = ali.b("container/villager/trade_arrow");
   private static final ali O = ali.b("container/villager/discount_strikethrough");
   private static final ali P = ali.b("textures/gui/container/villager.png");
   private static final int Q = 512;
   private static final int R = 256;
   private static final int S = 99;
   private static final int T = 136;
   private static final int U = 16;
   private static final int V = 5;
   private static final int W = 35;
   private static final int X = 68;
   private static final int Y = 6;
   private static final int Z = 7;
   private static final int aa = 5;
   private static final int ab = 20;
   private static final int ac = 88;
   private static final int ad = 27;
   private static final int ae = 6;
   private static final int af = 139;
   private static final int ag = 18;
   private static final int ah = 94;
   private static final xi ai = xi.c("merchant.trades");
   private static final xi aj = xi.c("merchant.deprecated");
   private int ak;
   private final fsv.a[] al = new fsv.a[7];
   int am;
   private boolean an;

   public fsv(csz $$0, col $$1, xi $$2) {
      super($$0, $$1, $$2);
      this.s = 276;
      this.x = 107;
   }

   private void F() {
      this.z.e(this.ak);
      this.z.h(this.ak);
      this.m.L().b(new aii(this.ak));
   }

   @Override
   protected void aR_() {
      super.aR_();
      int $$0 = (this.n - this.s) / 2;
      int $$1 = (this.o - this.u) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.al[$$3] = this.c(new fsv.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fsv.a) {
               this.ak = ((fsv.a)$$0x).a() + this.am;
               this.F();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fku $$0, int $$1, int $$2) {
      int $$3 = this.z.n();
      if ($$3 > 0 && $$3 <= 5 && this.z.q()) {
         xi $$4 = xi.a("merchant.title", this.l, xi.c("merchant.level." + $$3));
         int $$5 = this.p.a($$4);
         int $$6 = 49 + this.s / 2 - $$5 / 2;
         $$0.a(this.p, $$4, $$6, 6, 4210752, false);
      } else {
         $$0.a(this.p, this.l, 49 + this.s / 2 - this.p.a(this.l) / 2, 6, 4210752, false);
      }

      $$0.a(this.p, this.A, this.x, this.y, 4210752, false);
      int $$7 = this.p.a(ai);
      $$0.a(this.p, ai, 5 - $$7 / 2 + 48, 6, 4210752, false);
   }

   @Override
   protected void a(fku $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gir::B, P, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 512, 256);
      ddz $$6 = this.z.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ak;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         ddy $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(gir::B, G, this.C + 83 + 99, this.D + 35, 28, 21);
         }
      }
   }

   private void a(fku $$0, int $$1, int $$2, ddy $$3) {
      int $$4 = this.z.n();
      int $$5 = this.z.l();
      if ($$4 < 5) {
         $$0.a(gir::B, H, $$1 + 136, $$2 + 16, 102, 5);
         int $$6 = cnz.b($$4);
         if ($$5 >= $$6 && cnz.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cnz.c($$4) - $$6);
            int $$9 = Math.min(azk.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(gir::B, I, 102, 5, 0, 0, $$1 + 136, $$2 + 16, $$9, 5);
            int $$10 = this.z.m();
            if ($$10 > 0) {
               int $$11 = Math.min(azk.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(gir::B, J, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, $$11, 5);
            }
         }
      }
   }

   private void a(fku $$0, int $$1, int $$2, ddz $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.am * $$6);
         if (this.am == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(gir::B, K, $$1 + 94, $$2 + 18 + $$8, 6, 27);
      } else {
         $$0.a(gir::B, L, $$1 + 94, $$2 + 18, 6, 27);
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddz $$4 = this.z.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.n - this.s) / 2;
         int $$6 = (this.o - this.u) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (ddy $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.am && $$9 < 7 + this.am) {
               cwb $$11 = $$10.a();
               cwb $$12 = $$10.b();
               cwb $$13 = $$10.c();
               cwb $$14 = $$10.f();
               $$0.c().a();
               $$0.c().a(0.0F, 0.0F, 100.0F);
               int $$15 = $$7 + 2;
               this.a($$0, $$12, $$11, $$8, $$15);
               if (!$$13.f()) {
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

         int $$16 = this.ak;
         ddy $$17 = $$4.get($$16);
         if (this.z.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.z.o()) {
            $$0.a(this.p, aj, $$1, $$2);
         }

         for (fsv.a $$18 : this.al) {
            if ($$18.B()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.z.p().size();
         }
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fku $$0, ddy $$1, int $$2, int $$3) {
      if ($$1.r()) {
         $$0.a(gir::B, M, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      } else {
         $$0.a(gir::B, N, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      }
   }

   private void a(fku $$0, cwb $$1, cwb $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.L() == $$1.L()) {
         $$0.a(this.p, $$1, $$3, $$4);
      } else {
         $$0.a(this.p, $$2, $$3, $$4, $$2.L() == 1 ? "1" : null);
         $$0.a(this.p, $$1, $$3 + 14, $$4, $$1.L() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(gir::B, O, $$3 + 7, $$4 + 12, 9, 2);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else {
         int $$4 = this.z.p().size();
         if (this.a($$4)) {
            int $$5 = $$4 - 7;
            this.am = azk.a((int)((double)this.am - $$3), 0, $$5);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.z.p().size();
      if (this.an) {
         int $$6 = this.D + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - (float)$$6 - 13.5F) / ((float)($$7 - $$6) - 27.0F);
         $$9 = $$9 * (float)$$8 + 0.5F;
         this.am = azk.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.an = false;
      int $$3 = (this.n - this.s) / 2;
      int $$4 = (this.o - this.u) / 2;
      if (this.a(this.z.p().size())
         && $$0 > (double)($$3 + 94)
         && $$0 < (double)($$3 + 94 + 6)
         && $$1 > (double)($$4 + 18)
         && $$1 <= (double)($$4 + 18 + 139 + 1)) {
         this.an = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends flh {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final flh.c $$3) {
         super($$0, $$1, 88, 20, xh.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fku $$0, int $$1, int $$2) {
         if (this.i && fsv.this.z.p().size() > this.a + fsv.this.am) {
            if ($$1 < this.D() + 20) {
               cwb $$3 = fsv.this.z.p().get(this.a + fsv.this.am).b();
               $$0.b(fsv.this.p, $$3, $$1, $$2);
            } else if ($$1 < this.D() + 50 && $$1 > this.D() + 30) {
               cwb $$4 = fsv.this.z.p().get(this.a + fsv.this.am).c();
               if (!$$4.f()) {
                  $$0.b(fsv.this.p, $$4, $$1, $$2);
               }
            } else if ($$1 > this.D() + 65) {
               cwb $$5 = fsv.this.z.p().get(this.a + fsv.this.am).f();
               $$0.b(fsv.this.p, $$5, $$1, $$2);
            }
         }
      }
   }
}
