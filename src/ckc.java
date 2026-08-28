import javax.annotation.Nullable;

public class ckc extends ciu {
   private static final akj<iu> bH = akn.a(ckc.class, akl.o);
   private static final akj<Boolean> bI = akn.a(ckc.class, akl.k);
   private static final akj<Boolean> bK = akn.a(ckc.class, akl.k);
   private static final akj<iu> bL = akn.a(ckc.class, akl.o);
   private static final akj<Boolean> bM = akn.a(ckc.class, akl.k);
   private static final akj<Boolean> bN = akn.a(ckc.class, akl.k);
   private static final float bO = 0.3F;
   private static final bwi bP = bwo.bB.n().a(bwh.a().a(bwg.a, 0.0F, bwo.bB.m(), -0.25F)).a(0.3F);
   int bQ;
   public static final cht.a bG = ($$0, $$1) -> $$0.n_() && !$$0.bj();

   public ckc(bwo<? extends ckc> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.j, 0.0F);
      this.a(exf.t, -1.0F);
      this.a(exf.s, -1.0F);
      this.a(exf.r, -1.0F);
      this.bA = new ckc.e(this);
   }

   public void h(iu $$0) {
      this.al.a(bH, $$0);
   }

   iu gr() {
      return this.al.a(bH);
   }

   void i(iu $$0) {
      this.al.a(bL, $$0);
   }

   iu gs() {
      return this.al.a(bL);
   }

   public boolean q() {
      return this.al.a(bI);
   }

   void w(boolean $$0) {
      this.al.a(bI, $$0);
   }

   public boolean t() {
      return this.al.a(bK);
   }

   void x(boolean $$0) {
      this.bQ = $$0 ? 1 : 0;
      this.al.a(bK, $$0);
   }

   boolean gt() {
      return this.al.a(bM);
   }

   void y(boolean $$0) {
      this.al.a(bM, $$0);
   }

   boolean gu() {
      return this.al.a(bN);
   }

   void z(boolean $$0) {
      this.al.a(bN, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, iu.c);
      $$0.a(bI, false);
      $$0.a(bL, iu.c);
      $$0.a(bM, false);
      $$0.a(bN, false);
      $$0.a(bK, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gr().u());
      $$0.a("HomePosY", this.gr().v());
      $$0.a("HomePosZ", this.gr().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gs().u());
      $$0.a("TravelPosY", this.gs().v());
      $$0.a("TravelPosZ", this.gs().w());
   }

   @Override
   public void a(tz $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new iu($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new iu($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.h(this.dv());
      this.i(iu.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bwo<ckc> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$3.v() < $$1.P() + 4 && dvm.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bD.a(0, new ckc.f(this, 1.2));
      this.bD.a(1, new ckc.a(this, 1.0));
      this.bD.a(1, new ckc.d(this, 1.0));
      this.bD.a(2, new cfi(this, 1.1, $$0 -> $$0.a(axk.aA), false));
      this.bD.a(3, new ckc.c(this, 1.0));
      this.bD.a(4, new ckc.b(this, 1.0));
      this.bD.a(7, new ckc.i(this, 1.0));
      this.bD.a(8, new cei(this, crc.class, 8.0F));
      this.bD.a(9, new ckc.h(this, 1.0, 100));
   }

   public static byj.a x() {
      return ciu.gw().a(byk.s, 30.0).a(byk.v, 0.25).a(byk.B, 1.0);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public int S() {
      return 200;
   }

   @Nullable
   @Override
   protected awm u() {
      return !this.bj() && this.aJ() && !this.n_() ? awn.Bj : super.u();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected awm aV() {
      return awn.Bu;
   }

   @Nullable
   @Override
   protected awm e(buu $$0) {
      return this.n_() ? awn.Bq : awn.Bp;
   }

   @Nullable
   @Override
   protected awm l_() {
      return this.n_() ? awn.Bl : awn.Bk;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      awm $$2 = this.n_() ? awn.Bt : awn.Bs;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gy() {
      return super.gy() && !this.q();
   }

   @Override
   protected float aU() {
      return this.X + 0.15F;
   }

   @Override
   public float ek() {
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected cgo b(dja $$0) {
      return new ckc.g(this, $$0);
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return bwo.bB.a($$0, bwn.e);
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.aA);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      if (!this.gt() && $$1.b_($$0).a(axh.a)) {
         return 10.0F;
      } else {
         return dvm.a($$1, $$0) ? 10.0F : $$1.x($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bK() && this.t() && this.bQ >= 1 && this.bQ % 5 == 0) {
         iu $$0 = this.dv();
         if (dvm.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, dmf.j(this.dV().a_($$0.e())));
            this.a(efh.u);
         }
      }
   }

   @Override
   protected void j() {
      super.j();
      if (!this.n_() && this.dV() instanceof arq $$0 && $$0.O().c(diw.g)) {
         this.a($$0, czh.pd, 1);
      }
   }

   @Override
   public void a_(feq $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bxi.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null && (!this.gt() || !this.gr().a(this.dt(), 20.0))) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public void a(arq $$0, bxd $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bP : super.e($$0);
   }

   static class a extends cdm {
      private final ckc d;

      a(ckc $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         arr $$0 = this.a.gA();
         if ($$0 == null && this.c.gA() != null) {
            $$0 = this.c.gA();
         }

         if ($$0 != null) {
            $$0.a(awx.P);
            ap.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gC();
         this.c.gC();
         azv $$1 = this.a.dY();
         if (a(this.b).O().c(diw.g)) {
            this.b.b(new bwt(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cea {
      private final ckc a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(ckc $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.n_()) {
            return false;
         } else if (this.a.q()) {
            return true;
         } else {
            return this.a.dY().a(b(700)) != 0 ? false : !this.a.gr().a(this.a.dt(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
      }

      @Override
      public boolean c() {
         return !this.a.gr().a(this.a.dt(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         iu $$0 = this.a.gr();
         boolean $$1 = $$0.a(this.a.dt(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.O().k()) {
            feq $$2 = feq.c($$0);
            feq $$3 = chx.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = chx.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(iu.a((jo)$$3)).a(dmh.J)) {
               $$3 = chx.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cen {
      private static final int g = 1200;
      private final ckc h;

      c(ckc $$0, double $$1) {
         super($$0, $$0.n_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bj() && this.d <= 1200 && this.a(this.h.dV(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.n_() && !this.h.bj()) {
            return super.b();
         } else {
            return !this.h.gt() && !this.h.bj() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(djd $$0, iu $$1) {
         return $$0.a_($$1).a(dmh.J);
      }
   }

   static class d extends cen {
      private final ckc g;

      d(ckc $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.gr().a(this.g.dt(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.gr().a(this.g.dt(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         iu $$0 = this.g.dv();
         if (!this.g.bj() && this.m()) {
            if (this.g.bQ < 1) {
               this.g.x(true);
            } else if (this.g.bQ > this.a(200)) {
               dja $$1 = this.g.dV();
               $$1.a(null, $$0, awn.Br, awo.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               iu $$2 = this.e.d();
               eah $$3 = dmh.mL.m().b(dvm.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(efh.i, $$2, efh.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.bQ++;
            }
         }
      }

      @Override
      protected boolean a(djd $$0, iu $$1) {
         return !$$0.v($$1.d()) ? false : dvm.b($$0, $$1);
      }
   }

   static class e extends cdd {
      private final ckc l;

      e(ckc $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
            if (!this.l.gr().a(this.l.dt(), 16.0)) {
               this.l.B(Math.max(this.l.fo() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.B(Math.max(this.l.fo() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.B(Math.max(this.l.fo() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cdd.a.b && !this.l.O().k()) {
            double $$0 = this.e - this.l.dA();
            double $$1 = this.f - this.l.dC();
            double $$2 = this.g - this.l.dG();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.B(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azm.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$4, 90.0F));
               this.l.aV = this.l.dL();
               float $$5 = (float)(this.h * this.l.h(byk.v));
               this.l.B(azm.h(0.125F, this.l.fo(), $$5));
               this.l.i(this.l.dy().b(0.0, (double)this.l.fo() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class f extends cet {
      f(ckc $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            iu $$0 = this.a(this.c.dV(), this.c, 7);
            if ($$0 != null) {
               this.e = (double)$$0.u();
               this.f = (double)$$0.v();
               this.g = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends cgl {
      g(ckc $$0, dja $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(iu $$0) {
         if (this.a instanceof ckc $$1 && $$1.gu()) {
            return this.b.a_($$0).a(dmh.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cex {
      private final ckc i;

      h(ckc $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gt() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cea {
      private final ckc a;
      private final double b;
      private boolean c;

      i(ckc $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gt() && !this.a.q() && this.a.bj();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azv $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dC() > (double)(this.a.dV().P() - 1)) {
            $$4 = 0;
         }

         iu $$6 = iu.a((double)$$3 + this.a.dA(), (double)$$4 + this.a.dC(), (double)$$5 + this.a.dG());
         this.a.i($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.O().k()) {
            feq $$0 = feq.c(this.a.gs());
            feq $$1 = chx.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chx.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azm.a($$1.d);
               int $$3 = azm.a($$1.f);
               int $$4 = 34;
               if (!this.a.dV().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      @Override
      public boolean c() {
         return !this.a.O().k() && !this.c && !this.a.gt() && !this.a.gB() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.z(false);
         super.e();
      }
   }
}
