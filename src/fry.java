public class fry extends fqs<csh> {
   private static final alc G = alc.b("container/villager/out_of_stock");
   private static final alc H = alc.b("container/villager/experience_bar_background");
   private static final alc I = alc.b("container/villager/experience_bar_current");
   private static final alc J = alc.b("container/villager/experience_bar_result");
   private static final alc K = alc.b("container/villager/scroller");
   private static final alc L = alc.b("container/villager/scroller_disabled");
   private static final alc M = alc.b("container/villager/trade_arrow_out_of_stock");
   private static final alc N = alc.b("container/villager/trade_arrow");
   private static final alc O = alc.b("container/villager/discount_strikethrough");
   private static final alc P = alc.b("textures/gui/container/villager.png");
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
   private static final xd ai = xd.c("merchant.trades");
   private static final xd aj = xd.c("merchant.deprecated");
   private int ak;
   private final fry.a[] al = new fry.a[7];
   int am;
   private boolean an;

   public fry(csh $$0, cnt $$1, xd $$2) {
      super($$0, $$1, $$2);
      this.s = 276;
      this.x = 107;
   }

   private void F() {
      this.z.e(this.ak);
      this.z.h(this.ak);
      this.m.L().b(new aid(this.ak));
   }

   @Override
   protected void aR_() {
      super.aR_();
      int $$0 = (this.n - this.s) / 2;
      int $$1 = (this.o - this.u) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.al[$$3] = this.c(new fry.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof fry.a) {
               this.ak = ((fry.a)$$0x).a() + this.am;
               this.F();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void b(fjx $$0, int $$1, int $$2) {
      int $$3 = this.z.n();
      if ($$3 > 0 && $$3 <= 5 && this.z.q()) {
         xd $$4 = xd.a("merchant.title", this.l, xd.c("merchant.level." + $$3));
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
   protected void a(fjx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(ghq::B, P, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 512, 256);
      dde $$6 = this.z.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ak;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         ddd $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(ghq::B, G, this.C + 83 + 99, this.D + 35, 28, 21);
         }
      }
   }

   private void a(fjx $$0, int $$1, int $$2, ddd $$3) {
      int $$4 = this.z.n();
      int $$5 = this.z.l();
      if ($$4 < 5) {
         $$0.a(ghq::B, H, $$1 + 136, $$2 + 16, 102, 5);
         int $$6 = cni.b($$4);
         if ($$5 >= $$6 && cni.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (float)(cni.c($$4) - $$6);
            int $$9 = Math.min(azd.d($$8 * (float)($$5 - $$6)), 102);
            $$0.a(ghq::B, I, 102, 5, 0, 0, $$1 + 136, $$2 + 16, $$9, 5);
            int $$10 = this.z.m();
            if ($$10 > 0) {
               int $$11 = Math.min(azd.d((float)$$10 * $$8), 102 - $$9);
               $$0.a(ghq::B, J, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, $$11, 5);
            }
         }
      }
   }

   private void a(fjx $$0, int $$1, int $$2, dde $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.am * $$6);
         if (this.am == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(ghq::B, K, $$1 + 94, $$2 + 18 + $$8, 6, 27);
      } else {
         $$0.a(ghq::B, L, $$1 + 94, $$2 + 18, 6, 27);
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dde $$4 = this.z.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.n - this.s) / 2;
         int $$6 = (this.o - this.u) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (ddd $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.am && $$9 < 7 + this.am) {
               cvp $$11 = $$10.a();
               cvp $$12 = $$10.b();
               cvp $$13 = $$10.c();
               cvp $$14 = $$10.f();
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
         ddd $$17 = $$4.get($$16);
         if (this.z.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, (double)$$2) && this.z.o()) {
            $$0.a(this.p, aj, $$1, $$2);
         }

         for (fry.a $$18 : this.al) {
            if ($$18.B()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.z.p().size();
         }
      }

      this.a($$0, $$1, $$2);
   }

   private void a(fjx $$0, ddd $$1, int $$2, int $$3) {
      if ($$1.r()) {
         $$0.a(ghq::B, M, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      } else {
         $$0.a(ghq::B, N, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      }
   }

   private void a(fjx $$0, cvp $$1, cvp $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.J() == $$1.J()) {
         $$0.a(this.p, $$1, $$3, $$4);
      } else {
         $$0.a(this.p, $$2, $$3, $$4, $$2.J() == 1 ? "1" : null);
         $$0.a(this.p, $$1, $$3 + 14, $$4, $$1.J() == 1 ? "1" : null);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 300.0F);
         $$0.a(ghq::B, O, $$3 + 7, $$4 + 12, 9, 2);
         $$0.c().b();
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.z.p().size();
      if (this.a($$4)) {
         int $$5 = $$4 - 7;
         this.am = azd.a((int)((double)this.am - $$3), 0, $$5);
      }

      return true;
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
         this.am = azd.a((int)$$9, 0, $$8);
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

   class a extends fkk {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final fkk.c $$3) {
         super($$0, $$1, 88, 20, xc.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fjx $$0, int $$1, int $$2) {
         if (this.i && fry.this.z.p().size() > this.a + fry.this.am) {
            if ($$1 < this.D() + 20) {
               cvp $$3 = fry.this.z.p().get(this.a + fry.this.am).b();
               $$0.b(fry.this.p, $$3, $$1, $$2);
            } else if ($$1 < this.D() + 50 && $$1 > this.D() + 30) {
               cvp $$4 = fry.this.z.p().get(this.a + fry.this.am).c();
               if (!$$4.f()) {
                  $$0.b(fry.this.p, $$4, $$1, $$2);
               }
            } else if ($$1 > this.D() + 65) {
               cvp $$5 = fry.this.z.p().get(this.a + fry.this.am).f();
               $$0.b(fry.this.p, $$5, $$1, $$2);
            }
         }
      }
   }
}
