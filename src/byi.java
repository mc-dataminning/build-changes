import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class byi extends bwj implements bil, bkr, blg, blj, blo {
   public static final int cf = 400;
   public static final int cg = 499;
   public static final int ch = 500;
   public static final double ci = 0.15;
   private static final float bT = (float)b(() -> 0.0);
   private static final float bU = (float)b(() -> 1.0);
   private static final float bW = (float)a(() -> 0.0);
   private static final float bX = (float)a(() -> 1.0);
   private static final float bY = a($$0 -> 0);
   private static final float bZ = a($$0 -> $$0 - 1);
   private static final float ca = 0.25F;
   private static final float cb = 0.5F;
   private static final Predicate<bky> cc = $$0 -> $$0 instanceof byi && ((byi)$$0).gy();
   private static final bvk cd = bvk.b().a(16.0).d().a(cc);
   private static final coc ce = coc.a(cle.oI, cle.qM, cuv.ij.k(), cle.nF, cle.tr, cle.pm, cle.pn);
   private static final afm<Byte> cv = afp.a(byi.class, afo.a);
   private static final int cw = 2;
   private static final int cx = 4;
   private static final int cy = 8;
   private static final int cz = 16;
   private static final int cA = 32;
   private static final int cB = 64;
   public static final int cj = 0;
   public static final int ck = 1;
   public static final int cl = 2;
   private int cC;
   private int cD;
   private int cE;
   public int cm;
   public int cn;
   protected boolean co;
   protected bix cp;
   protected int cq;
   protected float cr;
   protected boolean cs;
   private float cF;
   private float cG;
   private float cH;
   private float cI;
   private float cJ;
   private float cK;
   protected boolean ct = true;
   protected int cu;
   @Nullable
   private UUID cL;

   protected byi(bkm<? extends byi> $$0, crs $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.gA();
   }

   @Override
   protected void z() {
      this.bO.a(1, new bsm(this, 1.2));
      this.bO.a(1, new bsx(this, 1.2));
      this.bO.a(2, new brf(this, 1.0, byi.class));
      this.bO.a(4, new brs(this, 1.0));
      this.bO.a(6, new btg(this, 0.7));
      this.bO.a(7, new bsb(this, cdm.class, 6.0F));
      this.bO.a(8, new bso(this));
      if (this.gk()) {
         this.bO.a(9, new bsp(this));
      }

      this.gu();
   }

   protected void gu() {
      this.bO.a(0, new brn(this));
      this.bO.a(3, new btb(this, 1.25, coc.a(cle.tr, cle.pm, cle.pn), false));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cv, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.an.b(cv) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cv);
      if ($$1) {
         this.an.b(cv, (byte)($$2 | $$0));
      } else {
         this.an.b(cv, (byte)($$2 & ~$$0));
      }
   }

   public boolean gt() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cL;
   }

   public void b(@Nullable UUID $$0) {
      this.cL = $$0;
   }

   public boolean gv() {
      return this.co;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.co = $$0;
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gw()) {
         this.A(false);
      }
   }

   public boolean gw() {
      return this.t(16);
   }

   public boolean gx() {
      return this.t(32);
   }

   public boolean gy() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bv() && !this.n_() && this.gt();
   }

   @Override
   public void a(@Nullable aqo $$0) {
      this.cp.a(0, new clb(cle.mZ));
   }

   public void b(cdm $$0, clb $$1) {
      if (this.l($$1)) {
         this.cp.a(1, $$1.c(1));
         if (!$$0.fT().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gz() {
      return this.cq;
   }

   public void u(int $$0) {
      this.cq = $$0;
   }

   public int v(int $$0) {
      int $$1 = ati.a(this.gz() + $$0, 0, this.gF());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bs() {
      return !this.bO();
   }

   private void s() {
      this.ge();
      if (!this.aS()) {
         aqm $$0 = this.gl();
         if ($$0 != null) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), $$0, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bjg $$2) {
      if ($$0 > 1.0F) {
         this.a(aqn.lr, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bO()) {
            for (bki $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eH();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ati.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int aa_() {
      return 2;
   }

   protected void gA() {
      bix $$0 = this.cp;
      this.cp = new bix(this.aa_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            clb $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.p());
            }
         }
      }

      this.cp.a(this);
      this.gB();
   }

   protected void gB() {
      if (!this.dL().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(bij $$0) {
      boolean $$1 = this.i();
      this.gB();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.X_(), 0.5F, 1.0F);
      }
   }

   public double gC() {
      return this.b(bme.h);
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ag.a(3) == 0) {
         this.gJ();
      }

      return $$2;
   }

   protected boolean gk() {
      return true;
   }

   @Nullable
   protected aqm gl() {
      return null;
   }

   @Nullable
   protected aqm gD() {
      return null;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      if (!$$1.k()) {
         dgw $$2 = this.dL().a_($$0.c());
         dcf $$3 = $$1.w();
         if ($$2.a(cuv.dN)) {
            $$3 = $$2.w();
         }

         if (this.bO() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(aqn.lu, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(aqn.lu, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(aqn.lt, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dcf $$0) {
      return $$0 == dcf.b || $$0 == dcf.aP || $$0 == dcf.B || $$0 == dcf.aQ || $$0 == dcf.aO;
   }

   protected void a(dcf $$0) {
      this.a(aqn.lo, $$0.a() * 0.15F, $$0.b());
   }

   public static bmd.a gE() {
      return bla.A().a(bme.h).a(bme.l, 53.0).a(bme.m, 0.225F);
   }

   @Override
   public int fI() {
      return 6;
   }

   public int gF() {
      return 100;
   }

   @Override
   protected float eV() {
      return 0.8F;
   }

   @Override
   public int O() {
      return 400;
   }

   @Override
   public void b(cdm $$0) {
      if (!this.dL().B && (!this.bO() || this.x($$0)) && this.gt()) {
         $$0.a(this, this.cp);
      }
   }

   public biq c(cdm $$0, clb $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2 & !$$0.fT().d) {
         $$1.h(1);
      }

      if (this.dL().B) {
         return biq.b;
      } else {
         return $$2 ? biq.a : biq.d;
      }
   }

   protected boolean a(cdm $$0, clb $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cle.oI)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cle.qM)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(cuv.ij.k())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cle.nF)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cle.tr)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dL().B && this.gt() && this.h() == 0 && !this.gi()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cle.pm) || $$1.a(cle.pn)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dL().B && this.gt() && this.h() == 0 && !this.gi()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.eu() < this.eL() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.n_() && $$4 > 0) {
         this.dL().a(js.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dL().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gt()) && this.gz() < this.gF() && !this.dL().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.s();
         this.a(dlg.m);
      }

      return $$2;
   }

   protected void f(cdm $$0) {
      this.A(false);
      this.B(false);
      if (!this.dL().B) {
         $$0.r(this.dB());
         $$0.s(this.dD());
         $$0.n(this);
      }
   }

   @Override
   public boolean eX() {
      return super.eX() && this.bO() && this.i() || this.gw() || this.gx();
   }

   @Override
   public boolean m(clb $$0) {
      return ce.a($$0);
   }

   private void t() {
      this.cm = 1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            clb $$1 = this.cp.a($$0);
            if (!$$1.b() && !cpo.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void c_() {
      if (this.ag.a(200) == 0) {
         this.t();
      }

      super.c_();
      if (!this.dL().B && this.bv()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gH()) {
            if (!this.gw() && !this.bO() && this.ag.a(300) == 0 && this.dL().a_(this.dl().d()).a(cuv.i)) {
               this.A(true);
            }

            if (this.gw() && ++this.cC > 50) {
               this.cC = 0;
               this.A(false);
            }
         }

         this.gG();
      }
   }

   protected void gG() {
      if (this.gy() && this.n_() && !this.gw()) {
         bky $$0 = this.dL().a(byi.class, cd, this, this.dq(), this.ds(), this.dw(), this.cG().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bN.a($$0, 0);
         }
      }
   }

   public boolean gH() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cD > 0 && ++this.cD > 30) {
         this.cD = 0;
         this.d(64, false);
      }

      if (this.cX() && this.cE > 0 && ++this.cE > 20) {
         this.cE = 0;
         this.B(false);
      }

      if (this.cm > 0 && ++this.cm > 8) {
         this.cm = 0;
      }

      if (this.cn > 0) {
         this.cn++;
         if (this.cn > 300) {
            this.cn = 0;
         }
      }

      this.cG = this.cF;
      if (this.gw()) {
         this.cF = this.cF + (1.0F - this.cF) * 0.4F + 0.05F;
         if (this.cF > 1.0F) {
            this.cF = 1.0F;
         }
      } else {
         this.cF = this.cF + ((0.0F - this.cF) * 0.4F - 0.05F);
         if (this.cF < 0.0F) {
            this.cF = 0.0F;
         }
      }

      this.cI = this.cH;
      if (this.gx()) {
         this.cF = 0.0F;
         this.cG = this.cF;
         this.cH = this.cH + (1.0F - this.cH) * 0.4F + 0.05F;
         if (this.cH > 1.0F) {
            this.cH = 1.0F;
         }
      } else {
         this.cs = false;
         this.cH = this.cH + ((0.8F * this.cH * this.cH * this.cH - this.cH) * 0.6F - 0.05F);
         if (this.cH < 0.0F) {
            this.cH = 0.0F;
         }
      }

      this.cK = this.cJ;
      if (this.t(64)) {
         this.cJ = this.cJ + (1.0F - this.cJ) * 0.7F + 0.05F;
         if (this.cJ > 1.0F) {
            this.cJ = 1.0F;
         }
      } else {
         this.cJ = this.cJ + ((0.0F - this.cJ) * 0.7F - 0.05F);
         if (this.cJ < 0.0F) {
            this.cJ = 0.0F;
         }
      }
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      if (this.bO() || this.n_()) {
         return super.b($$0, $$1);
      } else if (this.gt() && $$0.fI()) {
         this.b($$0);
         return biq.a(this.dL().B);
      } else {
         clb $$2 = $$0.b($$1);
         if (!$$2.b()) {
            biq $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gN() && this.l($$2) && !this.gO()) {
               this.b($$0, $$2);
               return biq.a(this.dL().B);
            }
         }

         this.f($$0);
         return biq.a(this.dL().B);
      }
   }

   private void ge() {
      if (!this.dL().B) {
         this.cD = 1;
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
   public aqm gI() {
      return this.w();
   }

   public void gJ() {
      if (this.gk() && this.cX()) {
         this.cE = 1;
         this.B(true);
      }
   }

   public void gK() {
      if (!this.gx()) {
         this.gJ();
         aqm $$0 = this.gD();
         if ($$0 != null) {
            this.a($$0, this.eV(), this.eW());
         }
      }
   }

   public boolean h(cdm $$0) {
      this.b($$0.cv());
      this.x(true);
      if ($$0 instanceof amb) {
         al.x.a((amb)$$0, this);
      }

      this.dL().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cdm $$0, eji $$1) {
      super.a($$0, $$1);
      ejh $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dB();
      if (this.cW()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aA()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gv()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected ejh j(bky $$0) {
      return new ejh($$0.dD() * 0.5F, $$0.dB());
   }

   @Override
   protected eji b(cdm $$0, eji $$1) {
      if (this.aA() && this.cr == 0.0F && this.gx() && !this.cs) {
         return eji.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new eji((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cdm $$0) {
      return (float)this.b(bme.m);
   }

   protected void b(float $$0, eji $$1) {
      double $$2 = this.gC() * (double)$$0 * (double)this.aI();
      double $$3 = $$2 + (double)this.eZ();
      eji $$4 = this.do();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = ati.a(this.dB() * (float) (Math.PI / 180.0));
         float $$6 = ati.b(this.dB() * (float) (Math.PI / 180.0));
         this.f(this.do().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gL() {
      this.a(aqn.lq, 0.4F, 1.0F);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gw());
      $$0.a("Bred", this.gy());
      $$0.a("Temper", this.gz());
      $$0.a("Tame", this.gt());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.u($$0.h("Temper"));
      this.x($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = app.a(this.cK(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         clb $$4 = clb.a($$0.p("SaddleItem"));
         if ($$4.a(cle.mZ)) {
            this.cp.a(0, $$4);
         }
      }

      this.gB();
   }

   @Override
   public boolean a(bwj $$0) {
      return false;
   }

   protected boolean gM() {
      return !this.bO() && !this.bN() && this.gt() && !this.n_() && this.eu() >= this.eL() && this.gi();
   }

   @Nullable
   @Override
   public bkd a(ama $$0, bkd $$1) {
      return null;
   }

   protected void a(bkd $$0, byi $$1) {
      this.a($$0, $$1, bme.l, (double)bY, (double)bZ);
      this.a($$0, $$1, bme.h, (double)bW, (double)bX);
      this.a($$0, $$1, bme.m, (double)bT, (double)bU);
   }

   private void a(bkd $$0, byi $$1, blz $$2, double $$3, double $$4) {
      double $$5 = a(this.c($$2), $$0.c($$2), $$3, $$4, this.ag);
      $$1.a($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ato $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ati.a($$0, $$2, $$3);
         $$1 = ati.a($$1, $$2, $$3);
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

   public float E(float $$0) {
      return ati.i($$0, this.cG, this.cF);
   }

   public float F(float $$0) {
      return ati.i($$0, this.cI, this.cH);
   }

   public float G(float $$0) {
      return ati.i($$0, this.cK, this.cJ);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cs = true;
            this.gJ();
         }

         if ($$0 >= 90) {
            this.cr = 1.0F;
         } else {
            this.cr = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cs = true;
      this.gJ();
      this.gL();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      jq $$1 = $$0 ? js.M : js.Z;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bki $$0, bki.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bky) {
         ((bky)$$0).aU = this.aU;
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
   protected float b(blk $$0, bkj $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gN() {
      return false;
   }

   public boolean gO() {
      return !this.c(bkn.e).b();
   }

   public boolean l(clb $$0) {
      return false;
   }

   private blq a(final int $$0, final Predicate<clb> $$1) {
      return new blq() {
         @Override
         public clb a() {
            return byi.this.cp.a($$0);
         }

         @Override
         public boolean a(clb $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               byi.this.cp.a($$0, $$0);
               byi.this.gB();
               return true;
            }
         }
      };
   }

   @Override
   public blq a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(cle.mZ));
         }

         if ($$1 == 1) {
            if (!this.gN()) {
               return blq.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? blq.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public bky cN() {
      if (this.i()) {
         bki var2 = this.cQ();
         if (var2 instanceof cdm) {
            return (cdm)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private eji a(eji $$0, bky $$1) {
      double $$2 = this.dq() + $$0.c;
      double $$3 = this.cG().b;
      double $$4 = this.dw() + $$0.e;
      ht.a $$5 = new ht.a();
      UnmodifiableIterator var10 = $$1.fA().iterator();

      while (var10.hasNext()) {
         blk $$6 = (blk)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cG().e + 0.75;

         do {
            double $$8 = this.dL().i($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cfi.a($$8)) {
               ejd $$9 = $$1.e($$6);
               eji $$10 = new eji($$2, (double)$$5.v() + $$8, $$4);
               if (cfi.a(this.dL(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(hx.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public eji b(bky $$0) {
      eji $$1 = a((double)this.df(), (double)$$0.df(), this.dB() + ($$0.fm() == bks.b ? 90.0F : -90.0F));
      eji $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         eji $$3 = a((double)this.df(), (double)$$0.df(), this.dB() + ($$0.fm() == bks.a ? 90.0F : -90.0F));
         eji $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dj();
      }
   }

   protected void a(ato $$0) {
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkd.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bij $$0) {
      return this.cp != $$0;
   }

   public int gP() {
      return this.O();
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, this.a($$1, $$2) + 0.15F * this.cI * $$2, -0.7F * this.cI * $$2);
   }

   protected float a(bkj $$0, float $$1) {
      return $$0.b + (this.n_() ? 0.125F : -0.15625F) * $$1;
   }
}
