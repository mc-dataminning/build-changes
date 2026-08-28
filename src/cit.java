import javax.annotation.Nullable;

public class cit extends chp {
   private static final ajx<ji> bG = akb.a(cit.class, ajz.o);
   private static final ajx<Boolean> bH = akb.a(cit.class, ajz.k);
   private static final ajx<Boolean> bJ = akb.a(cit.class, ajz.k);
   private static final ajx<ji> bK = akb.a(cit.class, ajz.o);
   private static final ajx<Boolean> bL = akb.a(cit.class, ajz.k);
   private static final ajx<Boolean> bM = akb.a(cit.class, ajz.k);
   private static final float bN = 0.3F;
   private static final bvd bO = bvi.bA.n().a(bvc.a().a(bvb.a, 0.0F, bvi.bA.m(), -0.25F)).a(0.3F);
   int bP;
   public static final cgp.a bF = ($$0, $$1) -> $$0.n_() && !$$0.bj();

   public cit(bvi<? extends cit> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.j, 0.0F);
      this.a(eun.t, -1.0F);
      this.a(eun.s, -1.0F);
      this.a(eun.r, -1.0F);
      this.bz = new cit.e(this);
   }

   public void i(ji $$0) {
      this.al.a(bG, $$0);
   }

   ji gs() {
      return this.al.a(bG);
   }

   void j(ji $$0) {
      this.al.a(bK, $$0);
   }

   ji gt() {
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

   boolean gu() {
      return this.al.a(bL);
   }

   void y(boolean $$0) {
      this.al.a(bL, $$0);
   }

   boolean gv() {
      return this.al.a(bM);
   }

   void z(boolean $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bG, ji.c);
      $$0.a(bH, false);
      $$0.a(bK, ji.c);
      $$0.a(bL, false);
      $$0.a(bM, false);
      $$0.a(bJ, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gs().u());
      $$0.a("HomePosY", this.gs().v());
      $$0.a("HomePosZ", this.gs().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gt().u());
      $$0.a("TravelPosY", this.gt().v());
      $$0.a("TravelPosZ", this.gt().w());
   }

   @Override
   public void a(tq $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new ji($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new ji($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.i(this.du());
      this.j(ji.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bvi<cit> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$3.v() < $$1.P() + 4 && dtc.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cit.f(this, 1.2));
      this.bC.a(1, new cit.a(this, 1.0));
      this.bC.a(1, new cit.d(this, 1.0));
      this.bC.a(2, new cee(this, 1.1, $$0 -> $$0.a(awy.az), false));
      this.bC.a(3, new cit.c(this, 1.0));
      this.bC.a(4, new cit.b(this, 1.0));
      this.bC.a(7, new cit.i(this, 1.0));
      this.bC.a(8, new cde(this, cpr.class, 8.0F));
      this.bC.a(9, new cit.h(this, 1.0, 100));
   }

   public static bxf.a x() {
      return chp.gx().a(bxg.s, 30.0).a(bxg.v, 0.25).a(bxg.B, 1.0);
   }

   @Override
   public boolean cI() {
      return false;
   }

   @Override
   public int S() {
      return 200;
   }

   @Nullable
   @Override
   protected avz u() {
      return !this.bj() && this.aJ() && !this.n_() ? awa.Bd : super.u();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected avz aV() {
      return awa.Bo;
   }

   @Nullable
   @Override
   protected avz e(btp $$0) {
      return this.n_() ? awa.Bk : awa.Bj;
   }

   @Nullable
   @Override
   protected avz l_() {
      return this.n_() ? awa.Bf : awa.Be;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      avz $$2 = this.n_() ? awa.Bn : awa.Bm;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gz() {
      return super.gz() && !this.q();
   }

   @Override
   protected float aU() {
      return this.X + 0.15F;
   }

   @Override
   public float ei() {
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cit.g(this, $$0);
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return bvi.bA.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.az);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      if (!this.gu() && $$1.b_($$0).a(awv.a)) {
         return 10.0F;
      } else {
         return dtc.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bJ() && this.t() && this.bP >= 1 && this.bP % 5 == 0) {
         ji $$0 = this.du();
         if (dtc.a(this.dU(), $$0)) {
            this.dU().c(2001, $$0, dke.j(this.dU().a_($$0.e())));
            this.a(ecp.u);
         }
      }
   }

   @Override
   protected void X_() {
      super.X_();
      if (!this.n_() && this.dU() instanceof ard $$0 && $$0.O().b(dgv.f)) {
         this.a($$0, cxl.oW, 1);
      }
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.9));
         if (this.f() == null && (!this.gu() || !this.gs().a(this.ds(), 20.0))) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
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
   public void a(ard $$0, bvx $$1) {
      this.a($$0, this.dV().c(), Float.MAX_VALUE);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   static class a extends cci {
      private final cit d;

      a(cit $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         are $$0 = this.a.gB();
         if ($$0 == null && this.c.gB() != null) {
            $$0 = this.c.gB();
         }

         if ($$0 != null) {
            $$0.a(awk.P);
            ap.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gD();
         this.c.gD();
         azh $$1 = this.a.dX();
         if (a(this.b).O().b(dgv.f)) {
            this.b.b(new bvn(this.b, this.a.dz(), this.a.dB(), this.a.dF(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends ccw {
      private final cit a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cit $$0, double $$1) {
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
            return this.a.dX().a(b(700)) != 0 ? false : !this.a.gs().a(this.a.ds(), 64.0);
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
         return !this.a.gs().a(this.a.ds(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         ji $$0 = this.a.gs();
         boolean $$1 = $$0.a(this.a.ds(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.O().k()) {
            fbx $$2 = fbx.c($$0);
            fbx $$3 = cgt.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cgt.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dU().a_(ji.a((kb)$$3)).a(dkg.J)) {
               $$3 = cgt.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cdj {
      private static final int g = 1200;
      private final cit h;

      c(cit $$0, double $$1) {
         super($$0, $$0.n_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bj() && this.d <= 1200 && this.a(this.h.dU(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.n_() && !this.h.bj()) {
            return super.b();
         } else {
            return !this.h.gu() && !this.h.bj() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dhc $$0, ji $$1) {
         return $$0.a_($$1).a(dkg.J);
      }
   }

   static class d extends cdj {
      private final cit g;

      d(cit $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.gs().a(this.g.ds(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.gs().a(this.g.ds(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         ji $$0 = this.g.du();
         if (!this.g.bj() && this.m()) {
            if (this.g.bP < 1) {
               this.g.x(true);
            } else if (this.g.bP > this.a(200)) {
               dgz $$1 = this.g.dU();
               $$1.a(null, $$0, awa.Bl, awb.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               ji $$2 = this.e.d();
               dxq $$3 = dkg.mH.m().b(dtc.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(ecp.i, $$2, ecp.a.a(this.g, $$3));
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
      protected boolean a(dhc $$0, ji $$1) {
         return !$$0.u($$1.d()) ? false : dtc.b($$0, $$1);
      }
   }

   static class e extends cbz {
      private final cit l;

      e(cit $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.i(this.l.dx().b(0.0, 0.005, 0.0));
            if (!this.l.gs().a(this.l.ds(), 16.0)) {
               this.l.C(Math.max(this.l.fq() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.C(Math.max(this.l.fq() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.C(Math.max(this.l.fq() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cbz.a.b && !this.l.O().k()) {
            double $$0 = this.e - this.l.dz();
            double $$1 = this.f - this.l.dB();
            double $$2 = this.g - this.l.dF();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayz.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dK(), $$4, 90.0F));
               this.l.aV = this.l.dK();
               float $$5 = (float)(this.h * this.l.h(bxg.v));
               this.l.C(ayz.h(0.125F, this.l.fq(), $$5));
               this.l.i(this.l.dx().b(0.0, (double)this.l.fq() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends cdp {
      f(cit $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            ji $$0 = this.a(this.c.dU(), this.c, 7);
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

   static class g extends cfh {
      g(cit $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ji $$0) {
         if (this.a instanceof cit $$1 && $$1.gv()) {
            return this.b.a_($$0).a(dkg.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cdt {
      private final cit i;

      h(cit $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gu() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends ccw {
      private final cit a;
      private final double b;
      private boolean c;

      i(cit $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gu() && !this.a.q() && this.a.bj();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azh $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dB() > (double)(this.a.dU().P() - 1)) {
            $$4 = 0;
         }

         ji $$6 = ji.a((double)$$3 + this.a.dz(), (double)$$4 + this.a.dB(), (double)$$5 + this.a.dF());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.O().k()) {
            fbx $$0 = fbx.c(this.a.gt());
            fbx $$1 = cgt.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgt.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayz.a($$1.d);
               int $$3 = ayz.a($$1.f);
               int $$4 = 34;
               if (!this.a.dU().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
         return !this.a.O().k() && !this.c && !this.a.gu() && !this.a.gC() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.z(false);
         super.e();
      }
   }
}
