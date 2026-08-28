import com.google.common.collect.UnmodifiableIterator;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class cjw extends chp implements bst, bvq, bwf, bwi, bwo {
   public static final int bQ = 400;
   public static final int bR = 499;
   public static final int bS = 500;
   public static final double bT = 0.15;
   private static final float bF = (float)b(() -> 0.0);
   private static final float bG = (float)b(() -> 1.0);
   private static final float bH = (float)a(() -> 0.0);
   private static final float bJ = (float)a(() -> 1.0);
   private static final float bK = a($$0 -> 0);
   private static final float bL = a($$0 -> $$0 - 1);
   private static final float bM = 0.25F;
   private static final float bN = 0.5F;
   private static final cgp.a bO = ($$0, $$1) -> {
      if ($$0 instanceof cjw $$2 && $$2.gO()) {
         return true;
      }

      return false;
   };
   private static final cgp bP = cgp.b().a(16.0).d().a(bO);
   private static final ajx<Byte> cg = akb.a(cjw.class, ajz.a);
   private static final int ch = 2;
   private static final int ci = 4;
   private static final int cj = 8;
   private static final int ck = 16;
   private static final int cl = 32;
   private static final int cm = 64;
   public static final int bU = 0;
   public static final int bV = 1;
   public static final int bW = 3;
   private int cp;
   private int cq;
   private int cr;
   public int bX;
   public int bY;
   protected boolean bZ;
   protected btf ca;
   protected int cb;
   protected float cc;
   protected boolean cd;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   protected boolean ce = true;
   protected int cf;
   @Nullable
   private bvf<bvy> cy;
   private final bsr cz = new fdj() {
      @Override
      public cxh f() {
         return cjw.this.aj();
      }

      @Override
      public void b(cxh $$0) {
         cjw.this.h($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cpr $$0) {
         return $$0.dj() == cjw.this || $$0.b(cjw.this, 4.0);
      }
   };

   protected cjw(bvi<? extends cjw> $$0, dgz $$1) {
      super($$0, $$1);
      this.gR();
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdp(this, 1.2));
      this.bC.a(1, new cea(this, 1.2));
      this.bC.a(2, new cci(this, 1.0, cjw.class));
      this.bC.a(4, new ccv(this, 1.0));
      this.bC.a(6, new cej(this, 0.7));
      this.bC.a(7, new cde(this, cpr.class, 6.0F));
      this.bC.a(8, new cdr(this));
      if (this.gt()) {
         this.bC.a(9, new cds(this));
      }

      this.gK();
   }

   protected void gK() {
      this.bC.a(0, new ccq(this));
      this.bC.a(3, new cee(this, 1.25, $$0 -> $$0.a(awy.aj), false));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cg, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(cg) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(cg);
      if ($$1) {
         this.al.a(cg, (byte)($$2 | $$0));
      } else {
         this.al.a(cg, (byte)($$2 & ~$$0));
      }
   }

   public boolean gJ() {
      return this.s(2);
   }

   @Nullable
   @Override
   public bvf<bvy> W_() {
      return this.cy;
   }

   public void k(@Nullable bvy $$0) {
      this.cy = $$0 != null ? new bvf<>($$0) : null;
   }

   public boolean gL() {
      return this.bZ;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bva $$0, float $$1) {
      if ($$1 > 6.0F && this.gM()) {
         this.A(false);
      }

      return true;
   }

   public boolean gM() {
      return this.s(16);
   }

   public boolean gN() {
      return this.s(32);
   }

   public boolean gO() {
      return this.s(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean e() {
      return this.bJ() && !this.n_() && this.gJ();
   }

   @Override
   public void a(cxh $$0, @Nullable awb $$1) {
      this.ca.a(0, $$0);
   }

   public void b(cpr $$0, cxh $$1) {
      if (this.a($$1, bvj.g)) {
         this.h($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bvj $$0) {
      return $$0 == bvj.g && this.gJ() || super.f($$0);
   }

   @Override
   public boolean j() {
      return this.s(4);
   }

   public int gP() {
      return this.cb;
   }

   public void t(int $$0) {
      this.cb = $$0;
   }

   public int u(int $$0) {
      int $$1 = ayz.a(this.gP() + $$0, 0, this.gV());
      this.t($$1);
      return $$1;
   }

   @Override
   public boolean bG() {
      return !this.bZ();
   }

   private void q() {
      this.x();
      if (!this.bb()) {
         avz $$0 = this.gu();
         if ($$0 != null) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), $$0, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, btp $$2) {
      if ($$0 > 1.0F) {
         this.a(awa.nn, 0.4F, 1.0F);
      }

      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bZ()) {
            for (bva $$4 : this.db()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eO();
         return true;
      }
   }

   public final int gQ() {
      return v(this.ad_());
   }

   public static int v(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gR() {
      btf $$0 = this.ca;
      this.ca = new btf(this.gQ());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ca.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cxh $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ca.a($$2, $$3.v());
            }
         }
      }

      this.ca.a(this);
      this.gS();
   }

   protected void gS() {
      if (!this.dU().C) {
         this.d(4, !this.ca.a(0).f());
      }
   }

   @Override
   public void a(bsr $$0) {
      boolean $$1 = this.j();
      this.gS();
      if (this.af > 20 && !$$1 && this.j()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gY();
      }

      return $$3;
   }

   protected boolean gt() {
      return true;
   }

   @Nullable
   protected avz gu() {
      return null;
   }

   @Nullable
   protected avz gT() {
      return null;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      if (!$$1.n()) {
         dxq $$2 = this.dU().a_($$0.d());
         drx $$3 = $$1.A();
         if ($$2.a(dkg.ea)) {
            $$3 = $$2.A();
         }

         if (this.bZ() && this.ce) {
            this.cf++;
            if (this.cf > 5 && this.cf % 3 == 0) {
               this.a($$3);
            } else if (this.cf <= 5) {
               this.a(awa.nq, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awa.nq, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awa.np, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(drx $$0) {
      return $$0 == drx.b || $$0 == drx.aU || $$0 == drx.B || $$0 == drx.aV || $$0 == drx.aT;
   }

   protected void a(drx $$0) {
      this.a(awa.nk, $$0.a() * 0.15F, $$0.b());
   }

   public static bxf.a gU() {
      return chp.gx().a(bxg.o, 0.7).a(bxg.s, 53.0).a(bxg.v, 0.225F).a(bxg.B, 1.0).a(bxg.x, 6.0).a(bxg.k, 0.5);
   }

   @Override
   public int ai() {
      return 6;
   }

   public int gV() {
      return 100;
   }

   @Override
   protected float fg() {
      return 0.8F;
   }

   @Override
   public int S() {
      return 400;
   }

   @Override
   public void b(cpr $$0) {
      if (!this.dU().C && (!this.bZ() || this.y($$0)) && this.gJ()) {
         $$0.a(this, this.ca);
      }
   }

   public bsy c(cpr $$0, cxh $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bsy)(!$$2 && !this.dU().C ? bsy.e : bsy.b);
   }

   protected boolean a(cpr $$0, cxh $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cxl.qd)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cxl.sz)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dkg.iH.i())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cxl.pb)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cxl.vl)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dU().C && this.gJ() && this.g() == 0 && !this.gC()) {
            $$2 = true;
            this.e($$0);
         }
      } else if ($$1.a(cxl.qH) || $$1.a(cxl.qI)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dU().C && this.gJ() && this.g() == 0 && !this.gC()) {
            $$2 = true;
            this.e($$0);
         }
      }

      if (this.eE() < this.eS() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.n_() && $$4 > 0) {
         this.dU().a(lt.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dU().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gJ()) && this.gP() < this.gV() && !this.dU().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(ecp.m);
      }

      return $$2;
   }

   protected void a(cpr $$0) {
      this.A(false);
      this.B(false);
      if (!this.dU().C) {
         $$0.w(this.dK());
         $$0.x(this.dM());
         $$0.n(this);
      }
   }

   @Override
   public boolean fi() {
      return super.fi() && this.bZ() && this.j() || this.gM() || this.gN();
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ai);
   }

   private void t() {
      this.bX = 1;
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.ca != null) {
         for (int $$1 = 0; $$1 < this.ca.b(); $$1++) {
            cxh $$2 = this.ca.a($$1);
            if (!$$2.f() && !ddt.a($$2, dds.D)) {
               this.a($$0, $$2);
            }
         }
      }
   }

   @Override
   public void k_() {
      if (this.ae.a(200) == 0) {
         this.t();
      }

      super.k_();
      if (this.dU() instanceof ard $$0 && this.bJ()) {
         if (this.ae.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gW()) {
            if (!this.gM() && !this.bZ() && this.ae.a(300) == 0 && $$0.a_(this.du().e()).a(dkg.i)) {
               this.A(true);
            }

            if (this.gM() && ++this.cp > 50) {
               this.cp = 0;
               this.A(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(ard $$0) {
      if (this.gO() && this.n_() && !this.gM()) {
         bvy $$1 = $$0.a(cjw.class, bP, this, this.dz(), this.dB(), this.dF(), this.cQ().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bB.a($$1, 0);
         }
      }
   }

   public boolean gW() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.cq > 0 && ++this.cq > 30) {
         this.cq = 0;
         this.d(64, false);
      }

      if (this.di() && this.cr > 0 && ++this.cr > 20) {
         this.cr = 0;
         this.B(false);
      }

      if (this.bX > 0 && ++this.bX > 8) {
         this.bX = 0;
      }

      if (this.bY > 0) {
         this.bY++;
         if (this.bY > 300) {
            this.bY = 0;
         }
      }

      this.ct = this.cs;
      if (this.gM()) {
         this.cs = this.cs + (1.0F - this.cs) * 0.4F + 0.05F;
         if (this.cs > 1.0F) {
            this.cs = 1.0F;
         }
      } else {
         this.cs = this.cs + ((0.0F - this.cs) * 0.4F - 0.05F);
         if (this.cs < 0.0F) {
            this.cs = 0.0F;
         }
      }

      this.cv = this.cu;
      if (this.gN()) {
         this.cs = 0.0F;
         this.ct = this.cs;
         this.cu = this.cu + (1.0F - this.cu) * 0.4F + 0.05F;
         if (this.cu > 1.0F) {
            this.cu = 1.0F;
         }
      } else {
         this.cd = false;
         this.cu = this.cu + ((0.8F * this.cu * this.cu * this.cu - this.cu) * 0.6F - 0.05F);
         if (this.cu < 0.0F) {
            this.cu = 0.0F;
         }
      }

      this.cx = this.cw;
      if (this.s(64)) {
         this.cw = this.cw + (1.0F - this.cw) * 0.7F + 0.05F;
         if (this.cw > 1.0F) {
            this.cw = 1.0F;
         }
      } else {
         this.cw = this.cw + ((0.0F - this.cw) * 0.7F - 0.05F);
         if (this.cw < 0.0F) {
            this.cw = 0.0F;
         }
      }
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      if (this.bZ() || this.n_()) {
         return super.b($$0, $$1);
      } else if (this.gJ() && $$0.ga()) {
         this.b($$0);
         return bsy.a;
      } else {
         cxh $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bsy $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bvj.g) && !this.ak()) {
               this.b($$0, $$2);
               return bsy.a;
            }
         }

         this.a($$0);
         return bsy.a;
      }
   }

   private void x() {
      if (!this.dU().C) {
         this.cq = 1;
         this.d(64, true);
      }
   }

   public void A(boolean $$0) {
      this.d(16, $$0);
   }

   public void B(boolean $$0) {
      if ($$0) {
         this.A(false);
      }

      this.d(32, $$0);
   }

   @Nullable
   public avz gX() {
      return this.u();
   }

   public void gY() {
      if (this.gt() && this.di()) {
         this.cr = 1;
         this.B(true);
      }
   }

   public void gZ() {
      if (!this.gN()) {
         this.gY();
         this.b(this.gT());
      }
   }

   public boolean f(cpr $$0) {
      this.k($$0);
      this.x(true);
      if ($$0 instanceof are) {
         ap.y.a((are)$$0, this);
      }

      this.dU().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cpr $$0, fbx $$1) {
      super.a($$0, $$1);
      fbw $$2 = this.j($$0);
      this.b($$2.j, $$2.i);
      this.N = this.aV = this.aX = this.dK();
      if (this.df()) {
         if ($$1.f <= 0.0) {
            this.cf = 0;
         }

         if (this.aJ()) {
            this.y(false);
            if (this.cc > 0.0F && !this.gL()) {
               this.b(this.cc, $$1);
            }

            this.cc = 0.0F;
         }
      }
   }

   protected fbw j(bvy $$0) {
      return new fbw($$0.dM() * 0.5F, $$0.dK());
   }

   @Override
   protected fbx b(cpr $$0, fbx $$1) {
      if (this.aJ() && this.cc == 0.0F && this.gN() && !this.cd) {
         return fbx.c;
      } else {
         float $$2 = $$0.bg * 0.5F;
         float $$3 = $$0.bi;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new fbx((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float c(cpr $$0) {
      return (float)this.h(bxg.v);
   }

   protected void b(float $$0, fbx $$1) {
      double $$2 = (double)this.A($$0);
      fbx $$3 = this.dx();
      this.n($$3.d, $$2, $$3.f);
      this.y(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = ayz.a(this.dK() * (float) (Math.PI / 180.0));
         float $$5 = ayz.b(this.dK() * (float) (Math.PI / 180.0));
         this.i(this.dx().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void ha() {
      this.a(awa.nm, 0.4F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gM());
      $$0.a("Bred", this.gO());
      $$0.a("Temper", this.gP());
      $$0.a("Tame", this.gJ());
      if (this.cy != null) {
         this.cy.a($$0, "Owner");
      }

      if (!this.ca.a(0).f()) {
         $$0.a("SaddleItem", this.ca.a(0).a(this.dW()));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.t($$0.h("Temper"));
      this.x($$0.q("Tame"));
      this.cy = bvf.a($$0, "Owner", this.dU());
      if ($$0.b("SaddleItem", 10)) {
         cxh $$1 = cxh.a(this.dW(), (un)$$0.p("SaddleItem")).orElse(cxh.k);
         if ($$1.a(cxl.op)) {
            this.ca.a(0, $$1);
         }
      }

      this.gS();
   }

   @Override
   public boolean a(chp $$0) {
      return false;
   }

   protected boolean hb() {
      return !this.bZ() && !this.bY() && this.gJ() && !this.n_() && this.eE() >= this.eS() && this.gC();
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return null;
   }

   protected void a(buq $$0, cjw $$1) {
      this.a($$0, $$1, bxg.s, (double)bK, (double)bL);
      this.a($$0, $$1, bxg.o, (double)bH, (double)bJ);
      this.a($$0, $$1, bxg.v, (double)bF, (double)bG);
   }

   private void a(buq $$0, cjw $$1, jr<bxb> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.ae);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azh $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayz.a($$0, $$2, $$3);
         $$1 = ayz.a($$1, $$2, $$3);
         double $$5 = 0.15 * ($$3 - $$2);
         double $$6 = Math.abs($$0 - $$1) + $$5 * 2.0;
         double $$7 = ($$0 + $$1) / 2.0;
         double $$8 = ($$4.j() + $$4.j() + $$4.j()) / 3.0 - 0.5;
         double $$9 = $$7 + $$6 * $$8;
         if ($$9 > $$3) {
            double $$10 = $$9 - $$3;
            return $$3 - $$10;
         } else if ($$9 < $$2) {
            double $$11 = $$2 - $$9;
            return $$2 + $$11;
         } else {
            return $$9;
         }
      }
   }

   public float K(float $$0) {
      return ayz.h($$0, this.ct, this.cs);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.cv, this.cu);
   }

   public float M(float $$0) {
      return ayz.h($$0, this.cx, this.cw);
   }

   @Override
   public void b(int $$0) {
      if (this.j()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cd = true;
            this.gY();
         }

         if ($$0 >= 90) {
            this.cc = 1.0F;
         } else {
            this.cc = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.j();
   }

   @Override
   public void c(int $$0) {
      this.cd = true;
      this.gY();
      this.ha();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lr $$1 = $$0 ? lt.S : lt.ah;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dU().a($$1, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.C(true);
      } else if ($$0 == 6) {
         this.C(false);
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void a(bva $$0, bva.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bvy) {
         ((bvy)$$0).aV = this.aV;
      }
   }

   protected static float a(IntUnaryOperator $$0) {
      return 15.0F + (float)$$0.applyAsInt(8) + (float)$$0.applyAsInt(9);
   }

   protected static double a(DoubleSupplier $$0) {
      return 0.4F + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2;
   }

   protected static double b(DoubleSupplier $$0) {
      return (0.45F + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3) * 0.25;
   }

   @Override
   public boolean d_() {
      return false;
   }

   @Override
   public bwq a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bwq() {
            @Override
            public cxh a() {
               return cjw.this.ca.a(0);
            }

            @Override
            public boolean a(cxh $$0) {
               if (!$$0.f() && !$$0.a(cxl.op)) {
                  return false;
               } else {
                  cjw.this.ca.a(0, $$0);
                  cjw.this.gS();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ca.b() ? bwq.a(this.ca, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bvy cV() {
      if (this.j()) {
         bva var2 = this.cY();
         if (var2 instanceof cpr) {
            return (cpr)var2;
         }
      }

      return super.cV();
   }

   @Nullable
   private fbx a(fbx $$0, bvy $$1) {
      double $$2 = this.dz() + $$0.d;
      double $$3 = this.cQ().b;
      double $$4 = this.dF() + $$0.f;
      ji.a $$5 = new ji.a();
      UnmodifiableIterator var10 = $$1.fQ().iterator();

      while (var10.hasNext()) {
         bwk $$6 = (bwk)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cQ().e + 0.75;

         do {
            double $$8 = this.dU().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (crw.a($$8)) {
               fbs $$9 = $$1.f($$6);
               fbx $$10 = new fbx($$2, (double)$$5.v() + $$8, $$4);
               if (crw.a(this.dU(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jn.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public fbx b(bvy $$0) {
      fbx $$1 = a((double)this.dp(), (double)$$0.dp(), this.dK() + ($$0.fA() == bvr.b ? 90.0F : -90.0F));
      fbx $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         fbx $$3 = a((double)this.dp(), (double)$$0.dp(), this.dK() + ($$0.fA() == bvr.a ? 90.0F : -90.0F));
         fbx $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.ds();
      }
   }

   protected void a(azh $$0) {
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$3 == null) {
         $$3 = new buq.a(0.2F);
      }

      this.a($$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bsr $$0) {
      return this.ca != $$0;
   }

   public int hc() {
      return this.S();
   }

   @Override
   protected fbx a(bva $$0, bvd $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new fbx(0.0, 0.15 * (double)this.cv * (double)$$2, -0.7 * (double)this.cv * (double)$$2).b(-this.dK() * (float) (Math.PI / 180.0)));
   }

   public final bsr hd() {
      return this.cz;
   }

   public int ad_() {
      return 0;
   }
}
