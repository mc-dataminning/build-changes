import com.google.common.collect.UnmodifiableIterator;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class clh extends ciu implements bww, bxl, bxo {
   public static final int bR = 499;
   public static final int bS = 500;
   public static final double bT = 0.15;
   private static final float bG = (float)b(() -> 0.0);
   private static final float bH = (float)b(() -> 1.0);
   private static final float bI = (float)a(() -> 0.0);
   private static final float bK = (float)a(() -> 1.0);
   private static final float bL = a($$0 -> 0);
   private static final float bM = a($$0 -> $$0 - 1);
   private static final float bN = 0.25F;
   private static final float bO = 0.5F;
   private static final cht.a bP = ($$0, $$1) -> {
      if ($$0 instanceof clh $$2 && $$2.gN()) {
         return true;
      }

      return false;
   };
   private static final cht bQ = cht.b().a(16.0).d().a(bP);
   private static final akj<Byte> ce = akn.a(clh.class, akl.a);
   private static final int cf = 2;
   private static final int cg = 8;
   private static final int ch = 16;
   private static final int ci = 32;
   private static final int cj = 64;
   public static final int bU = 3;
   private int ck;
   private int cl;
   private int cm;
   public int bV;
   public int bW;
   protected boolean bX;
   protected buk bY;
   protected int bZ;
   protected float ca;
   protected boolean cb;
   private float cn;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;
   protected boolean cc = true;
   protected int cd;
   @Nullable
   private bwl<bxe> cv;

   protected clh(bwo<? extends clh> $$0, dja $$1) {
      super($$0, $$1);
      this.gQ();
   }

   @Override
   protected void D() {
      this.bD.a(1, new cet(this, 1.2));
      this.bD.a(1, new cfe(this, 1.2));
      this.bD.a(2, new cdm(this, 1.0, clh.class));
      this.bD.a(4, new cdz(this, 1.0));
      this.bD.a(6, new cfn(this, 0.7));
      this.bD.a(7, new cei(this, crc.class, 6.0F));
      this.bD.a(8, new cev(this));
      if (this.gs()) {
         this.bD.a(9, new cew(this));
      }

      this.gJ();
   }

   protected void gJ() {
      this.bD.a(0, new cdu(this));
      this.bD.a(3, new cfi(this, 1.25, $$0 -> $$0.a(axk.ak), false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ce, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(ce) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(ce);
      if ($$1) {
         this.al.a(ce, (byte)($$2 | $$0));
      } else {
         this.al.a(ce, (byte)($$2 & ~$$0));
      }
   }

   public boolean gI() {
      return this.s(2);
   }

   @Nullable
   @Override
   public bwl<bxe> d() {
      return this.cv;
   }

   public void j(@Nullable bxe $$0) {
      this.cv = $$0 != null ? new bwl<>($$0) : null;
   }

   public boolean gK() {
      return this.bX;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.bX = $$0;
   }

   @Override
   public boolean a(bwf $$0, float $$1) {
      if ($$1 > 6.0F && this.gL()) {
         this.A(false);
      }

      return true;
   }

   public boolean gL() {
      return this.s(16);
   }

   public boolean gM() {
      return this.s(32);
   }

   public boolean gN() {
      return this.s(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean e(bwp $$0) {
      return $$0 != bwp.h ? super.e($$0) : this.bK() && !this.n_() && this.gI();
   }

   public void b(crc $$0, czd $$1) {
      if (this.a($$1, bwp.g)) {
         this.h($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bwp $$0) {
      return ($$0 == bwp.g || $$0 == bwp.h) && this.gI() || super.f($$0);
   }

   public int gO() {
      return this.bZ;
   }

   public void t(int $$0) {
      this.bZ = $$0;
   }

   public int u(int $$0) {
      int $$1 = azm.a(this.gO() + $$0, 0, this.gT());
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
         awm $$0 = this.gt();
         if ($$0 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(double $$0, float $$1, buu $$2) {
      if ($$0 > 1.0) {
         this.a(awn.nr, 0.4F, 1.0F);
      }

      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         this.b($$0, $$1, $$2);
         this.eQ();
         return true;
      }
   }

   public final int gP() {
      return v(this.ab_());
   }

   public static int v(int $$0) {
      return $$0 * 3;
   }

   protected void gQ() {
      buk $$0 = this.bY;
      this.bY = new buk(this.gP());
      if ($$0 != null) {
         int $$1 = Math.min($$0.b(), this.bY.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            czd $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.bY.a($$2, $$3.v());
            }
         }
      }
   }

   @Override
   protected je<awm> a(bwp $$0, czd $$1, dhm $$2) {
      return (je<awm>)($$0 == bwp.h ? awn.ns : super.a($$0, $$1, $$2));
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gW();
      }

      return $$3;
   }

   protected boolean gs() {
      return true;
   }

   @Nullable
   protected awm gt() {
      return null;
   }

   @Nullable
   protected awm gR() {
      return null;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      if (!$$1.n()) {
         eah $$2 = this.dV().a_($$0.d());
         duc $$3 = $$1.A();
         if ($$2.a(dmh.ed)) {
            $$3 = $$2.A();
         }

         if (this.ca() && this.cc) {
            this.cd++;
            if (this.cd > 5 && this.cd % 3 == 0) {
               this.a($$3);
            } else if (this.cd <= 5) {
               this.a(awn.nu, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awn.nu, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awn.nt, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(duc $$0) {
      return $$0 == duc.b || $$0 == duc.aV || $$0 == duc.B || $$0 == duc.aW || $$0 == duc.aU;
   }

   protected void a(duc $$0) {
      this.a(awn.no, $$0.a() * 0.15F, $$0.b());
   }

   public static byj.a gS() {
      return ciu.gw().a(byk.o, 0.7).a(byk.s, 53.0).a(byk.v, 0.225F).a(byk.B, 1.0).a(byk.x, 6.0).a(byk.k, 0.5);
   }

   @Override
   public int ai() {
      return 6;
   }

   public int gT() {
      return 100;
   }

   @Override
   protected float fe() {
      return 0.8F;
   }

   @Override
   public int S() {
      return 400;
   }

   @Override
   public void b(crc $$0) {
      if (!this.dV().C && (!this.ca() || this.y($$0)) && this.gI()) {
         $$0.a(this, this.bY);
      }
   }

   public bud c(crc $$0, czd $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bud)(!$$2 && !this.dV().C ? bud.e : bud.b);
   }

   protected boolean a(crc $$0, czd $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(czh.qk)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(czh.sI)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dmh.iL.h())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(czh.pi)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(czh.vu)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dV().C && this.gI() && this.g() == 0 && !this.gB()) {
            $$2 = true;
            this.e($$0);
         }
      } else if ($$1.a(czh.qO) || $$1.a(czh.qP)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dV().C && this.gI() && this.g() == 0 && !this.gB()) {
            $$2 = true;
            this.e($$0);
         }
      }

      if (this.eG() < this.eU() && $$3 > 0.0F) {
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

      if ($$5 > 0 && ($$2 || !this.gI()) && this.gO() < this.gT() && !this.dV().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(efh.m);
      }

      return $$2;
   }

   protected void a(crc $$0) {
      this.A(false);
      this.B(false);
      if (!this.dV().C) {
         $$0.w(this.dL());
         $$0.x(this.dN());
         $$0.n(this);
      }
   }

   @Override
   public boolean fg() {
      return super.fg() && this.ca() && this.ak() || this.gL() || this.gM();
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.aj);
   }

   private void t() {
      this.bV = 1;
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (this.bY != null) {
         for (int $$1 = 0; $$1 < this.bY.b(); $$1++) {
            czd $$2 = this.bY.a($$1);
            if (!$$2.f() && !dfs.a($$2, dfr.D)) {
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

         if (this.gU()) {
            if (!this.gL() && !this.ca() && this.ae.a(300) == 0 && $$0.a_(this.dv().e()).a(dmh.i)) {
               this.A(true);
            }

            if (this.gL() && ++this.ck > 50) {
               this.ck = 0;
               this.A(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(arq $$0) {
      if (this.gN() && this.n_() && !this.gL()) {
         bxe $$1 = $$0.a(clh.class, bQ, this, this.dA(), this.dC(), this.dG(), this.cR().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bC.a($$1, 0);
         }
      }
   }

   public boolean gU() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.cl > 0 && ++this.cl > 30) {
         this.cl = 0;
         this.d(64, false);
      }

      if (this.dj() && this.cm > 0 && ++this.cm > 20) {
         this.cm = 0;
         this.B(false);
      }

      if (this.bV > 0 && ++this.bV > 8) {
         this.bV = 0;
      }

      if (this.bW > 0) {
         this.bW++;
         if (this.bW > 300) {
            this.bW = 0;
         }
      }

      this.cq = this.cn;
      if (this.gL()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F + 0.05F;
         if (this.cn > 1.0F) {
            this.cn = 1.0F;
         }
      } else {
         this.cn = this.cn + ((0.0F - this.cn) * 0.4F - 0.05F);
         if (this.cn < 0.0F) {
            this.cn = 0.0F;
         }
      }

      this.cs = this.cr;
      if (this.gM()) {
         this.cn = 0.0F;
         this.cq = this.cn;
         this.cr = this.cr + (1.0F - this.cr) * 0.4F + 0.05F;
         if (this.cr > 1.0F) {
            this.cr = 1.0F;
         }
      } else {
         this.cb = false;
         this.cr = this.cr + ((0.8F * this.cr * this.cr * this.cr - this.cr) * 0.6F - 0.05F);
         if (this.cr < 0.0F) {
            this.cr = 0.0F;
         }
      }

      this.cu = this.ct;
      if (this.s(64)) {
         this.ct = this.ct + (1.0F - this.ct) * 0.7F + 0.05F;
         if (this.ct > 1.0F) {
            this.ct = 1.0F;
         }
      } else {
         this.ct = this.ct + ((0.0F - this.ct) * 0.7F - 0.05F);
         if (this.ct < 0.0F) {
            this.ct = 0.0F;
         }
      }
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      if (this.ca() || this.n_()) {
         return super.b($$0, $$1);
      } else if (this.gI() && $$0.fY()) {
         this.b($$0);
         return bud.a;
      } else {
         czd $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bud $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bwp.g) && !this.fX()) {
               this.b($$0, $$2);
               return bud.a;
            }
         }

         this.a($$0);
         return bud.a;
      }
   }

   private void x() {
      if (!this.dV().C) {
         this.cl = 1;
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
   public awm gV() {
      return this.u();
   }

   public void gW() {
      if (this.gs() && this.dj()) {
         this.cm = 1;
         this.B(true);
      }
   }

   public void gX() {
      if (!this.gM()) {
         this.gW();
         this.b(this.gR());
      }
   }

   public boolean f(crc $$0) {
      this.j($$0);
      this.x(true);
      if ($$0 instanceof arr) {
         ap.y.a((arr)$$0, this);
      }

      this.dV().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(crc $$0, feq $$1) {
      super.a($$0, $$1);
      fep $$2 = this.i($$0);
      this.b($$2.j, $$2.i);
      this.N = this.aV = this.aX = this.dL();
      if (this.dg()) {
         if ($$1.f <= 0.0) {
            this.cd = 0;
         }

         if (this.aJ()) {
            this.y(false);
            if (this.ca > 0.0F && !this.gK()) {
               this.b(this.ca, $$1);
            }

            this.ca = 0.0F;
         }
      }
   }

   protected fep i(bxe $$0) {
      return new fep($$0.dN() * 0.5F, $$0.dL());
   }

   @Override
   protected feq b(crc $$0, feq $$1) {
      if (this.aJ() && this.ca == 0.0F && this.gM() && !this.cb) {
         return feq.c;
      } else {
         float $$2 = $$0.bg * 0.5F;
         float $$3 = $$0.bi;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new feq((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float c(crc $$0) {
      return (float)this.h(byk.v);
   }

   protected void b(float $$0, feq $$1) {
      double $$2 = (double)this.z($$0);
      feq $$3 = this.dy();
      this.n($$3.d, $$2, $$3.f);
      this.y(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = azm.a(this.dL() * (float) (Math.PI / 180.0));
         float $$5 = azm.b(this.dL() * (float) (Math.PI / 180.0));
         this.i(this.dy().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gY() {
      this.a(awn.nq, 0.4F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gL());
      $$0.a("Bred", this.gN());
      $$0.a("Temper", this.gO());
      $$0.a("Tame", this.gI());
      if (this.cv != null) {
         this.cv.a($$0, "Owner");
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.t($$0.h("Temper"));
      this.x($$0.q("Tame"));
      this.cv = bwl.a($$0, "Owner", this.dV());
   }

   @Override
   public boolean a(ciu $$0) {
      return false;
   }

   protected boolean gZ() {
      return !this.ca() && !this.bZ() && this.gI() && !this.n_() && this.eG() >= this.eU() && this.gB();
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return null;
   }

   protected void a(bvv $$0, clh $$1) {
      this.a($$0, $$1, byk.s, (double)bL, (double)bM);
      this.a($$0, $$1, byk.o, (double)bI, (double)bK);
      this.a($$0, $$1, byk.v, (double)bG, (double)bH);
   }

   private void a(bvv $$0, clh $$1, je<byf> $$2, double $$3, double $$4) {
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
      return azm.h($$0, this.cq, this.cn);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cs, this.cr);
   }

   public float L(float $$0) {
      return azm.h($$0, this.cu, this.ct);
   }

   @Override
   public void b(int $$0) {
      if (this.ak()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cb = true;
            this.gW();
         }

         if ($$0 >= 90) {
            this.ca = 1.0F;
         } else {
            this.ca = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.ak();
   }

   @Override
   public void c(int $$0) {
      this.cb = true;
      this.gW();
      this.gY();
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
   protected void a(bwf $$0, bwf.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxe) {
         ((bxe)$$0).aV = this.aV;
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
   public bxv a_(int $$0) {
      int $$1 = $$0 - 500;
      return $$1 >= 0 && $$1 < this.bY.b() ? bxv.a(this.bY, $$1) : super.a_($$0);
   }

   @Nullable
   @Override
   public bxe cW() {
      if (this.ak()) {
         bwf var2 = this.cZ();
         if (var2 instanceof crc) {
            return (crc)var2;
         }
      }

      return super.cW();
   }

   @Nullable
   private feq a(feq $$0, bxe $$1) {
      double $$2 = this.dA() + $$0.d;
      double $$3 = this.cR().b;
      double $$4 = this.dG() + $$0.f;
      iu.a $$5 = new iu.a();
      UnmodifiableIterator var10 = $$1.fO().iterator();

      while (var10.hasNext()) {
         bxq $$6 = (bxq)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cR().e + 0.75;

         do {
            double $$8 = this.dV().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (ctv.a($$8)) {
               fel $$9 = $$1.f($$6);
               feq $$10 = new feq($$2, (double)$$5.v() + $$8, $$4);
               if (ctv.a(this.dV(), $$1, $$9.c($$10))) {
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
   public feq b(bxe $$0) {
      feq $$1 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fy() == bwx.b ? 90.0F : -90.0F));
      feq $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         feq $$3 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fy() == bwx.a ? 90.0F : -90.0F));
         feq $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dt();
      }
   }

   protected void a(azv $$0) {
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$3 == null) {
         $$3 = new bvv.a(0.2F);
      }

      this.a($$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean a(btw $$0) {
      return this.bY != $$0;
   }

   public int ha() {
      return this.S();
   }

   @Override
   protected feq a(bwf $$0, bwi $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new feq(0.0, 0.15 * (double)this.cs * (double)$$2, -0.7 * (double)this.cs * (double)$$2).b(-this.dL() * (float) (Math.PI / 180.0)));
   }

   public int ab_() {
      return 0;
   }
}
