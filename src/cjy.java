import javax.annotation.Nullable;

public class cjy extends cis {
   private static final akj<iu> bG = akn.a(cjy.class, akl.o);
   private static final akj<Boolean> bH = akn.a(cjy.class, akl.k);
   private static final akj<Boolean> bJ = akn.a(cjy.class, akl.k);
   private static final akj<iu> bK = akn.a(cjy.class, akl.o);
   private static final akj<Boolean> bL = akn.a(cjy.class, akl.k);
   private static final akj<Boolean> bM = akn.a(cjy.class, akl.k);
   private static final float bN = 0.3F;
   private static final bwg bO = bwm.bB.n().a(bwf.a().a(bwe.a, 0.0F, bwm.bB.m(), -0.25F)).a(0.3F);
   int bP;
   public static final chr.a bF = ($$0, $$1) -> $$0.n_() && !$$0.bj();

   public cjy(bwm<? extends cjy> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.j, 0.0F);
      this.a(ewx.t, -1.0F);
      this.a(ewx.s, -1.0F);
      this.a(ewx.r, -1.0F);
      this.bz = new cjy.e(this);
   }

   public void h(iu $$0) {
      this.al.a(bG, $$0);
   }

   iu gq() {
      return this.al.a(bG);
   }

   void i(iu $$0) {
      this.al.a(bK, $$0);
   }

   iu gr() {
      return this.al.a(bK);
   }

   public boolean q() {
      return this.al.a(bH);
   }

   void w(boolean $$0) {
      this.al.a(bH, $$0);
   }

   public boolean t() {
      return this.al.a(bJ);
   }

   void x(boolean $$0) {
      this.bP = $$0 ? 1 : 0;
      this.al.a(bJ, $$0);
   }

   boolean gs() {
      return this.al.a(bL);
   }

   void y(boolean $$0) {
      this.al.a(bL, $$0);
   }

   boolean gt() {
      return this.al.a(bM);
   }

   void z(boolean $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, iu.c);
      $$0.a(bH, false);
      $$0.a(bK, iu.c);
      $$0.a(bL, false);
      $$0.a(bM, false);
      $$0.a(bJ, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gq().u());
      $$0.a("HomePosY", this.gq().v());
      $$0.a("HomePosZ", this.gq().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gr().u());
      $$0.a("TravelPosY", this.gr().v());
      $$0.a("TravelPosZ", this.gr().w());
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
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.h(this.dv());
      this.i(iu.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bwm<cjy> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$3.v() < $$1.P() + 4 && dve.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cjy.f(this, 1.2));
      this.bC.a(1, new cjy.a(this, 1.0));
      this.bC.a(1, new cjy.d(this, 1.0));
      this.bC.a(2, new cfg(this, 1.1, $$0 -> $$0.a(axk.az), false));
      this.bC.a(3, new cjy.c(this, 1.0));
      this.bC.a(4, new cjy.b(this, 1.0));
      this.bC.a(7, new cjy.i(this, 1.0));
      this.bC.a(8, new ceg(this, cqy.class, 8.0F));
      this.bC.a(9, new cjy.h(this, 1.0, 100));
   }

   public static byh.a x() {
      return cis.gv().a(byi.s, 30.0).a(byi.v, 0.25).a(byi.B, 1.0);
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
      return !this.bj() && this.aJ() && !this.n_() ? awn.Bg : super.u();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected awm aV() {
      return awn.Br;
   }

   @Nullable
   @Override
   protected awm e(bus $$0) {
      return this.n_() ? awn.Bn : awn.Bm;
   }

   @Nullable
   @Override
   protected awm l_() {
      return this.n_() ? awn.Bi : awn.Bh;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      awm $$2 = this.n_() ? awn.Bq : awn.Bp;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gx() {
      return super.gx() && !this.q();
   }

   @Override
   protected float aU() {
      return this.X + 0.15F;
   }

   @Override
   public float ej() {
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected cgm b(div $$0) {
      return new cjy.g(this, $$0);
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return bwm.bB.a($$0, bwl.e);
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.az);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      if (!this.gs() && $$1.b_($$0).a(axh.a)) {
         return 10.0F;
      } else {
         return dve.a($$1, $$0) ? 10.0F : $$1.x($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bK() && this.t() && this.bP >= 1 && this.bP % 5 == 0) {
         iu $$0 = this.dv();
         if (dve.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, dma.j(this.dV().a_($$0.e())));
            this.a(eez.u);
         }
      }
   }

   @Override
   protected void j() {
      super.j();
      if (!this.n_() && this.dV() instanceof arq $$0 && $$0.O().c(dir.f)) {
         this.a($$0, czc.pa, 1);
      }
   }

   @Override
   public void a_(fei $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null && (!this.gs() || !this.gq().a(this.dt(), 20.0))) {
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
   public void a(arq $$0, bxb $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   static class a extends cdk {
      private final cjy d;

      a(cjy $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         arr $$0 = this.a.gz();
         if ($$0 == null && this.c.gz() != null) {
            $$0 = this.c.gz();
         }

         if ($$0 != null) {
            $$0.a(awx.P);
            ap.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gB();
         this.c.gB();
         azv $$1 = this.a.dY();
         if (a(this.b).O().c(dir.f)) {
            this.b.b(new bwr(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cdy {
      private final cjy a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cjy $$0, double $$1) {
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
            return this.a.dY().a(b(700)) != 0 ? false : !this.a.gq().a(this.a.dt(), 64.0);
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
         return !this.a.gq().a(this.a.dt(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         iu $$0 = this.a.gq();
         boolean $$1 = $$0.a(this.a.dt(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.O().k()) {
            fei $$2 = fei.c($$0);
            fei $$3 = chv.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = chv.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(iu.a((jo)$$3)).a(dmc.J)) {
               $$3 = chv.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cel {
      private static final int g = 1200;
      private final cjy h;

      c(cjy $$0, double $$1) {
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
            return !this.h.gs() && !this.h.bj() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(diy $$0, iu $$1) {
         return $$0.a_($$1).a(dmc.J);
      }
   }

   static class d extends cel {
      private final cjy g;

      d(cjy $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.gq().a(this.g.dt(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.gq().a(this.g.dt(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         iu $$0 = this.g.dv();
         if (!this.g.bj() && this.m()) {
            if (this.g.bP < 1) {
               this.g.x(true);
            } else if (this.g.bP > this.a(200)) {
               div $$1 = this.g.dV();
               $$1.a(null, $$0, awn.Bo, awo.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               iu $$2 = this.e.d();
               dzz $$3 = dmc.mI.m().b(dve.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(eez.i, $$2, eez.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.bP++;
            }
         }
      }

      @Override
      protected boolean a(diy $$0, iu $$1) {
         return !$$0.v($$1.d()) ? false : dve.b($$0, $$1);
      }
   }

   static class e extends cdb {
      private final cjy l;

      e(cjy $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
            if (!this.l.gq().a(this.l.dt(), 16.0)) {
               this.l.B(Math.max(this.l.fn() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.B(Math.max(this.l.fn() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.B(Math.max(this.l.fn() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cdb.a.b && !this.l.O().k()) {
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
               float $$5 = (float)(this.h * this.l.h(byi.v));
               this.l.B(azm.h(0.125F, this.l.fn(), $$5));
               this.l.i(this.l.dy().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class f extends cer {
      f(cjy $$0, double $$1) {
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

   static class g extends cgj {
      g(cjy $$0, div $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(iu $$0) {
         if (this.a instanceof cjy $$1 && $$1.gt()) {
            return this.b.a_($$0).a(dmc.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cev {
      private final cjy i;

      h(cjy $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gs() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cdy {
      private final cjy a;
      private final double b;
      private boolean c;

      i(cjy $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gs() && !this.a.q() && this.a.bj();
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
            fei $$0 = fei.c(this.a.gr());
            fei $$1 = chv.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chv.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
         return !this.a.O().k() && !this.c && !this.a.gs() && !this.a.gA() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.z(false);
         super.e();
      }
   }
}
