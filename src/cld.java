import com.google.common.collect.UnmodifiableIterator;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class cld extends cis implements bwu, bxj, bxm {
   public static final int bQ = 499;
   public static final int bR = 500;
   public static final double bS = 0.15;
   private static final float bF = (float)b(() -> 0.0);
   private static final float bG = (float)b(() -> 1.0);
   private static final float bH = (float)a(() -> 0.0);
   private static final float bJ = (float)a(() -> 1.0);
   private static final float bK = a($$0 -> 0);
   private static final float bL = a($$0 -> $$0 - 1);
   private static final float bM = 0.25F;
   private static final float bN = 0.5F;
   private static final chr.a bO = ($$0, $$1) -> {
      if ($$0 instanceof cld $$2 && $$2.gM()) {
         return true;
      }

      return false;
   };
   private static final chr bP = chr.b().a(16.0).d().a(bO);
   private static final akj<Byte> cd = akn.a(cld.class, akl.a);
   private static final int ce = 2;
   private static final int cf = 8;
   private static final int cg = 16;
   private static final int ch = 32;
   private static final int ci = 64;
   public static final int bT = 3;
   private int cj;
   private int ck;
   private int cl;
   public int bU;
   public int bV;
   protected boolean bW;
   protected bui bX;
   protected int bY;
   protected float bZ;
   protected boolean ca;
   private float cm;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   protected boolean cb = true;
   protected int cc;
   @Nullable
   private bwj<bxc> cu;

   protected cld(bwm<? extends cld> $$0, div $$1) {
      super($$0, $$1);
      this.gP();
   }

   @Override
   protected void D() {
      this.bC.a(1, new cer(this, 1.2));
      this.bC.a(1, new cfc(this, 1.2));
      this.bC.a(2, new cdk(this, 1.0, cld.class));
      this.bC.a(4, new cdx(this, 1.0));
      this.bC.a(6, new cfl(this, 0.7));
      this.bC.a(7, new ceg(this, cqy.class, 6.0F));
      this.bC.a(8, new cet(this));
      if (this.gr()) {
         this.bC.a(9, new ceu(this));
      }

      this.gI();
   }

   protected void gI() {
      this.bC.a(0, new cds(this));
      this.bC.a(3, new cfg(this, 1.25, $$0 -> $$0.a(axk.aj), false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cd, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(cd) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(cd);
      if ($$1) {
         this.al.a(cd, (byte)($$2 | $$0));
      } else {
         this.al.a(cd, (byte)($$2 & ~$$0));
      }
   }

   public boolean gH() {
      return this.s(2);
   }

   @Nullable
   @Override
   public bwj<bxc> d() {
      return this.cu;
   }

   public void j(@Nullable bxc $$0) {
      this.cu = $$0 != null ? new bwj<>($$0) : null;
   }

   public boolean gJ() {
      return this.bW;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.bW = $$0;
   }

   @Override
   public boolean a(bwd $$0, float $$1) {
      if ($$1 > 6.0F && this.gK()) {
         this.A(false);
      }

      return true;
   }

   public boolean gK() {
      return this.s(16);
   }

   public boolean gL() {
      return this.s(32);
   }

   public boolean gM() {
      return this.s(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean e(bwn $$0) {
      return $$0 != bwn.h ? super.e($$0) : this.bK() && !this.n_() && this.gH();
   }

   public void b(cqy $$0, cyy $$1) {
      if (this.a($$1, bwn.g)) {
         this.i($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bwn $$0) {
      return ($$0 == bwn.g || $$0 == bwn.h) && this.gH() || super.f($$0);
   }

   public int gN() {
      return this.bY;
   }

   public void t(int $$0) {
      this.bY = $$0;
   }

   public int u(int $$0) {
      int $$1 = azm.a(this.gN() + $$0, 0, this.gS());
      this.t($$1);
      return $$1;
   }

   @Override
   public boolean bH() {
      return !this.ca();
   }

   private void q() {
      this.x();
      if (!this.bb()) {
         awm $$0 = this.gs();
         if ($$0 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bus $$2) {
      if ($$0 > 1.0) {
         this.a(awn.no, 0.4F, 1.0F);
      }

      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         this.b($$0, $$1, $$2);
         this.eP();
         return true;
      }
   }

   public final int gO() {
      return v(this.aa_());
   }

   public static int v(int $$0) {
      return $$0 * 3;
   }

   protected void gP() {
      bui $$0 = this.bX;
      this.bX = new bui(this.gO());
      if ($$0 != null) {
         int $$1 = Math.min($$0.b(), this.bX.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cyy $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.bX.a($$2, $$3.v());
            }
         }
      }
   }

   @Override
   protected je<awm> a(bwn $$0, cyy $$1, dhh $$2) {
      return (je<awm>)($$0 == bwn.h ? awn.np : super.a($$0, $$1, $$2));
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gV();
      }

      return $$3;
   }

   protected boolean gr() {
      return true;
   }

   @Nullable
   protected awm gs() {
      return null;
   }

   @Nullable
   protected awm gQ() {
      return null;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      if (!$$1.n()) {
         dzz $$2 = this.dV().a_($$0.d());
         dtv $$3 = $$1.A();
         if ($$2.a(dmc.eb)) {
            $$3 = $$2.A();
         }

         if (this.ca() && this.cb) {
            this.cc++;
            if (this.cc > 5 && this.cc % 3 == 0) {
               this.a($$3);
            } else if (this.cc <= 5) {
               this.a(awn.nr, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awn.nr, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awn.nq, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dtv $$0) {
      return $$0 == dtv.b || $$0 == dtv.aU || $$0 == dtv.B || $$0 == dtv.aV || $$0 == dtv.aT;
   }

   protected void a(dtv $$0) {
      this.a(awn.nl, $$0.a() * 0.15F, $$0.b());
   }

   public static byh.a gR() {
      return cis.gv().a(byi.o, 0.7).a(byi.s, 53.0).a(byi.v, 0.225F).a(byi.B, 1.0).a(byi.x, 6.0).a(byi.k, 0.5);
   }

   @Override
   public int ai() {
      return 6;
   }

   public int gS() {
      return 100;
   }

   @Override
   protected float fd() {
      return 0.8F;
   }

   @Override
   public int S() {
      return 400;
   }

   @Override
   public void b(cqy $$0) {
      if (!this.dV().C && (!this.ca() || this.y($$0)) && this.gH()) {
         $$0.a(this, this.bX);
      }
   }

   public bub c(cqy $$0, cyy $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bub)(!$$2 && !this.dV().C ? bub.e : bub.b);
   }

   protected boolean a(cqy $$0, cyy $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(czc.qh)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(czc.sD)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dmc.iI.h())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(czc.pf)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(czc.vp)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dV().C && this.gH() && this.g() == 0 && !this.gA()) {
            $$2 = true;
            this.e($$0);
         }
      } else if ($$1.a(czc.qL) || $$1.a(czc.qM)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dV().C && this.gH() && this.g() == 0 && !this.gA()) {
            $$2 = true;
            this.e($$0);
         }
      }

      if (this.eF() < this.eT() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.n_() && $$4 > 0) {
         this.dV().a(lx.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gH()) && this.gN() < this.gS() && !this.dV().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(eez.m);
      }

      return $$2;
   }

   protected void a(cqy $$0) {
      this.A(false);
      this.B(false);
      if (!this.dV().C) {
         $$0.w(this.dL());
         $$0.x(this.dN());
         $$0.n(this);
      }
   }

   @Override
   public boolean ff() {
      return super.ff() && this.ca() && this.ak() || this.gK() || this.gL();
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ai);
   }

   private void t() {
      this.bU = 1;
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (this.bX != null) {
         for (int $$1 = 0; $$1 < this.bX.b(); $$1++) {
            cyy $$2 = this.bX.a($$1);
            if (!$$2.f() && !dfn.a($$2, dfm.D)) {
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
      if (this.dV() instanceof arq $$0 && this.bK()) {
         if (this.ae.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gT()) {
            if (!this.gK() && !this.ca() && this.ae.a(300) == 0 && $$0.a_(this.dv().e()).a(dmc.i)) {
               this.A(true);
            }

            if (this.gK() && ++this.cj > 50) {
               this.cj = 0;
               this.A(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(arq $$0) {
      if (this.gM() && this.n_() && !this.gK()) {
         bxc $$1 = $$0.a(cld.class, bP, this, this.dA(), this.dC(), this.dG(), this.cR().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bB.a($$1, 0);
         }
      }
   }

   public boolean gT() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.ck > 0 && ++this.ck > 30) {
         this.ck = 0;
         this.d(64, false);
      }

      if (this.dj() && this.cl > 0 && ++this.cl > 20) {
         this.cl = 0;
         this.B(false);
      }

      if (this.bU > 0 && ++this.bU > 8) {
         this.bU = 0;
      }

      if (this.bV > 0) {
         this.bV++;
         if (this.bV > 300) {
            this.bV = 0;
         }
      }

      this.cp = this.cm;
      if (this.gK()) {
         this.cm = this.cm + (1.0F - this.cm) * 0.4F + 0.05F;
         if (this.cm > 1.0F) {
            this.cm = 1.0F;
         }
      } else {
         this.cm = this.cm + ((0.0F - this.cm) * 0.4F - 0.05F);
         if (this.cm < 0.0F) {
            this.cm = 0.0F;
         }
      }

      this.cr = this.cq;
      if (this.gL()) {
         this.cm = 0.0F;
         this.cp = this.cm;
         this.cq = this.cq + (1.0F - this.cq) * 0.4F + 0.05F;
         if (this.cq > 1.0F) {
            this.cq = 1.0F;
         }
      } else {
         this.ca = false;
         this.cq = this.cq + ((0.8F * this.cq * this.cq * this.cq - this.cq) * 0.6F - 0.05F);
         if (this.cq < 0.0F) {
            this.cq = 0.0F;
         }
      }

      this.ct = this.cs;
      if (this.s(64)) {
         this.cs = this.cs + (1.0F - this.cs) * 0.7F + 0.05F;
         if (this.cs > 1.0F) {
            this.cs = 1.0F;
         }
      } else {
         this.cs = this.cs + ((0.0F - this.cs) * 0.7F - 0.05F);
         if (this.cs < 0.0F) {
            this.cs = 0.0F;
         }
      }
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      if (this.ca() || this.n_()) {
         return super.b($$0, $$1);
      } else if (this.gH() && $$0.fX()) {
         this.b($$0);
         return bub.a;
      } else {
         cyy $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bub $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bwn.g) && !this.fW()) {
               this.b($$0, $$2);
               return bub.a;
            }
         }

         this.a($$0);
         return bub.a;
      }
   }

   private void x() {
      if (!this.dV().C) {
         this.ck = 1;
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
   public awm gU() {
      return this.u();
   }

   public void gV() {
      if (this.gr() && this.dj()) {
         this.cl = 1;
         this.B(true);
      }
   }

   public void gW() {
      if (!this.gL()) {
         this.gV();
         this.b(this.gQ());
      }
   }

   public boolean f(cqy $$0) {
      this.j($$0);
      this.x(true);
      if ($$0 instanceof arr) {
         ap.y.a((arr)$$0, this);
      }

      this.dV().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cqy $$0, fei $$1) {
      super.a($$0, $$1);
      feh $$2 = this.i($$0);
      this.b($$2.j, $$2.i);
      this.N = this.aV = this.aX = this.dL();
      if (this.dg()) {
         if ($$1.f <= 0.0) {
            this.cc = 0;
         }

         if (this.aJ()) {
            this.y(false);
            if (this.bZ > 0.0F && !this.gJ()) {
               this.b(this.bZ, $$1);
            }

            this.bZ = 0.0F;
         }
      }
   }

   protected feh i(bxc $$0) {
      return new feh($$0.dN() * 0.5F, $$0.dL());
   }

   @Override
   protected fei b(cqy $$0, fei $$1) {
      if (this.aJ() && this.bZ == 0.0F && this.gL() && !this.ca) {
         return fei.c;
      } else {
         float $$2 = $$0.bg * 0.5F;
         float $$3 = $$0.bi;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new fei((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float c(cqy $$0) {
      return (float)this.h(byi.v);
   }

   protected void b(float $$0, fei $$1) {
      double $$2 = (double)this.z($$0);
      fei $$3 = this.dy();
      this.n($$3.d, $$2, $$3.f);
      this.y(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = azm.a(this.dL() * (float) (Math.PI / 180.0));
         float $$5 = azm.b(this.dL() * (float) (Math.PI / 180.0));
         this.i(this.dy().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gX() {
      this.a(awn.nn, 0.4F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gK());
      $$0.a("Bred", this.gM());
      $$0.a("Temper", this.gN());
      $$0.a("Tame", this.gH());
      if (this.cu != null) {
         this.cu.a($$0, "Owner");
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.t($$0.h("Temper"));
      this.x($$0.q("Tame"));
      this.cu = bwj.a($$0, "Owner", this.dV());
   }

   @Override
   public boolean a(cis $$0) {
      return false;
   }

   protected boolean gY() {
      return !this.ca() && !this.bZ() && this.gH() && !this.n_() && this.eF() >= this.eT() && this.gA();
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return null;
   }

   protected void a(bvt $$0, cld $$1) {
      this.a($$0, $$1, byi.s, (double)bK, (double)bL);
      this.a($$0, $$1, byi.o, (double)bH, (double)bJ);
      this.a($$0, $$1, byi.v, (double)bF, (double)bG);
   }

   private void a(bvt $$0, cld $$1, je<byd> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.ae);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azv $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azm.a($$0, $$2, $$3);
         $$1 = azm.a($$1, $$2, $$3);
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

   public float J(float $$0) {
      return azm.h($$0, this.cp, this.cm);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cr, this.cq);
   }

   public float L(float $$0) {
      return azm.h($$0, this.ct, this.cs);
   }

   @Override
   public void b(int $$0) {
      if (this.ak()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.ca = true;
            this.gV();
         }

         if ($$0 >= 90) {
            this.bZ = 1.0F;
         } else {
            this.bZ = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.ak();
   }

   @Override
   public void c(int $$0) {
      this.ca = true;
      this.gV();
      this.gX();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lv $$1 = $$0 ? lx.S : lx.ah;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bwd $$0, bwd.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxc) {
         ((bxc)$$0).aV = this.aV;
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
   public bxt a_(int $$0) {
      int $$1 = $$0 - 500;
      return $$1 >= 0 && $$1 < this.bX.b() ? bxt.a(this.bX, $$1) : super.a_($$0);
   }

   @Nullable
   @Override
   public bxc cW() {
      if (this.ak()) {
         bwd var2 = this.cZ();
         if (var2 instanceof cqy) {
            return (cqy)var2;
         }
      }

      return super.cW();
   }

   @Nullable
   private fei a(fei $$0, bxc $$1) {
      double $$2 = this.dA() + $$0.d;
      double $$3 = this.cR().b;
      double $$4 = this.dG() + $$0.f;
      iu.a $$5 = new iu.a();
      UnmodifiableIterator var10 = $$1.fN().iterator();

      while (var10.hasNext()) {
         bxo $$6 = (bxo)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cR().e + 0.75;

         do {
            double $$8 = this.dV().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (ctq.a($$8)) {
               fed $$9 = $$1.f($$6);
               fei $$10 = new fei($$2, (double)$$5.v() + $$8, $$4);
               if (ctq.a(this.dV(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ja.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public fei b(bxc $$0) {
      fei $$1 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fx() == bwv.b ? 90.0F : -90.0F));
      fei $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         fei $$3 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fx() == bwv.a ? 90.0F : -90.0F));
         fei $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dt();
      }
   }

   protected void a(azv $$0) {
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$3 == null) {
         $$3 = new bvt.a(0.2F);
      }

      this.a($$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean a(btu $$0) {
      return this.bX != $$0;
   }

   public int gZ() {
      return this.S();
   }

   @Override
   protected fei a(bwd $$0, bwg $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new fei(0.0, 0.15 * (double)this.cr * (double)$$2, -0.7 * (double)this.cr * (double)$$2).b(-this.dL() * (float) (Math.PI / 180.0)));
   }

   public int aa_() {
      return 0;
   }
}
