import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class byv extends bww implements biw, ble, blt, blw, bmb {
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
   private static final Predicate<bll> cc = $$0 -> $$0 instanceof byv && ((byv)$$0).gz();
   private static final bvx cd = bvx.b().a(16.0).d().a(cc);
   private static final coq ce = coq.a(clr.pt, clr.rx, cvh.ij.k(), clr.oq, clr.uc, clr.pX, clr.pY);
   private static final afs<Byte> cv = afv.a(byv.class, afu.a);
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
   protected bjj cp;
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

   protected byv(bkz<? extends byv> $$0, csf $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.gB();
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsz(this, 1.2));
      this.bO.a(1, new btk(this, 1.2));
      this.bO.a(2, new brs(this, 1.0, byv.class));
      this.bO.a(4, new bsf(this, 1.0));
      this.bO.a(6, new btt(this, 0.7));
      this.bO.a(7, new bso(this, cdz.class, 6.0F));
      this.bO.a(8, new btb(this));
      if (this.gl()) {
         this.bO.a(9, new btc(this));
      }

      this.gv();
   }

   protected void gv() {
      this.bO.a(0, new bsa(this));
      this.bO.a(3, new bto(this, 1.25, coq.a(clr.uc, clr.pX, clr.pY), false));
   }

   @Override
   protected void c_() {
      super.c_();
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

   public boolean gu() {
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

   public boolean gw() {
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
      if ($$0 > 6.0F && this.gx()) {
         this.A(false);
      }
   }

   public boolean gx() {
      return this.t(16);
   }

   public boolean gy() {
      return this.t(32);
   }

   public boolean gz() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_() && this.gu();
   }

   @Override
   public void a(@Nullable aqw $$0) {
      this.cp.a(0, new clo(clr.nK));
   }

   public void b(cdz $$0, clo $$1) {
      if (this.l($$1)) {
         this.cp.a(1, $$1.c(1));
         if (!$$0.fU().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gA() {
      return this.cq;
   }

   public void u(int $$0) {
      this.cq = $$0;
   }

   public int v(int $$0) {
      int $$1 = atq.a(this.gA() + $$0, 0, this.gG());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bu() {
      return !this.bP();
   }

   private void u() {
      this.gf();
      if (!this.aU()) {
         aqu $$0 = this.gm();
         if ($$0 != null) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), $$0, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bjt $$2) {
      if ($$0 > 1.0F) {
         this.a(aqv.lH, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (bkv $$4 : this.cU()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eJ();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return atq.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ac_() {
      return 2;
   }

   protected void gB() {
      bjj $$0 = this.cp;
      this.cp = new bjj(this.ac_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            clo $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.p());
            }
         }
      }

      this.cp.a(this);
      this.gC();
   }

   protected void gC() {
      if (!this.dN().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(biu $$0) {
      boolean $$1 = this.i();
      this.gC();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.Z_(), 0.5F, 1.0F);
      }
   }

   public double gD() {
      return this.b(bmr.h);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ag.a(3) == 0) {
         this.gK();
      }

      return $$2;
   }

   protected boolean gl() {
      return true;
   }

   @Nullable
   protected aqu gm() {
      return null;
   }

   @Nullable
   protected aqu gE() {
      return null;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      if (!$$1.k()) {
         dhn $$2 = this.dN().a_($$0.c());
         dcr $$3 = $$1.w();
         if ($$2.a(cvh.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(aqv.lK, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(aqv.lK, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(aqv.lJ, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dcr $$0) {
      return $$0 == dcr.b || $$0 == dcr.aT || $$0 == dcr.B || $$0 == dcr.aU || $$0 == dcr.aS;
   }

   protected void a(dcr $$0) {
      this.a(aqv.lE, $$0.a() * 0.15F, $$0.b());
   }

   public static bmq.a gF() {
      return bln.C().a(bmr.h).a(bmr.l, 53.0).a(bmr.m, 0.225F);
   }

   @Override
   public int fJ() {
      return 6;
   }

   public int gG() {
      return 100;
   }

   @Override
   protected float eX() {
      return 0.8F;
   }

   @Override
   public int Q() {
      return 400;
   }

   @Override
   public void b(cdz $$0) {
      if (!this.dN().B && (!this.bP() || this.x($$0)) && this.gu()) {
         $$0.a(this, this.cp);
      }
   }

   public bjb c(cdz $$0, clo $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2 & !$$0.fU().d) {
         $$1.h(1);
      }

      if (this.dN().B) {
         return bjb.b;
      } else {
         return $$2 ? bjb.a : bjb.d;
      }
   }

   protected boolean a(cdz $$0, clo $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(clr.pt)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(clr.rx)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(cvh.ij.k())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(clr.oq)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(clr.uc)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dN().B && this.gu() && this.h() == 0 && !this.gj()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(clr.pX) || $$1.a(clr.pY)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dN().B && this.gu() && this.h() == 0 && !this.gj()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ew() < this.eN() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dN().a(jw.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dN().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gu()) && this.gA() < this.gG() && !this.dN().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.u();
         this.a(dlx.m);
      }

      return $$2;
   }

   protected void f(cdz $$0) {
      this.A(false);
      this.B(false);
      if (!this.dN().B) {
         $$0.r(this.dD());
         $$0.s(this.dF());
         $$0.n(this);
      }
   }

   @Override
   public boolean eZ() {
      return super.eZ() && this.bP() && this.i() || this.gx() || this.gy();
   }

   @Override
   public boolean m(clo $$0) {
      return ce.a($$0);
   }

   private void w() {
      this.cm = 1;
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            clo $$1 = this.cp.a($$0);
            if (!$$1.b() && !cqb.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void d_() {
      if (this.ag.a(200) == 0) {
         this.w();
      }

      super.d_();
      if (!this.dN().B && this.bx()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gI()) {
            if (!this.gx() && !this.bP() && this.ag.a(300) == 0 && this.dN().a_(this.dn().d()).a(cvh.i)) {
               this.A(true);
            }

            if (this.gx() && ++this.cC > 50) {
               this.cC = 0;
               this.A(false);
            }
         }

         this.gH();
      }
   }

   protected void gH() {
      if (this.gz() && this.o_() && !this.gx()) {
         bll $$0 = this.dN().a(byv.class, cd, this, this.ds(), this.du(), this.dy(), this.cH().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bN.a($$0, 0);
         }
      }
   }

   public boolean gI() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cD > 0 && ++this.cD > 30) {
         this.cD = 0;
         this.d(64, false);
      }

      if (this.cZ() && this.cE > 0 && ++this.cE > 20) {
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
      if (this.gx()) {
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
      if (this.gy()) {
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
   public bjb b(cdz $$0, bja $$1) {
      if (this.bP() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gu() && $$0.fJ()) {
         this.b($$0);
         return bjb.a(this.dN().B);
      } else {
         clo $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bjb $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gO() && this.l($$2) && !this.gP()) {
               this.b($$0, $$2);
               return bjb.a(this.dN().B);
            }
         }

         this.f($$0);
         return bjb.a(this.dN().B);
      }
   }

   private void gf() {
      if (!this.dN().B) {
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
   public aqu gJ() {
      return this.y();
   }

   public void gK() {
      if (this.gl() && this.cZ()) {
         this.cE = 1;
         this.B(true);
      }
   }

   public void gL() {
      if (!this.gy()) {
         this.gK();
         aqu $$0 = this.gE();
         if ($$0 != null) {
            this.a($$0, this.eX(), this.eY());
         }
      }
   }

   public boolean h(cdz $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof amj) {
         al.x.a((amj)$$0, this);
      }

      this.dN().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cdz $$0, ejz $$1) {
      super.a($$0, $$1);
      ejy $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dD();
      if (this.cY()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gw()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected ejy j(bll $$0) {
      return new ejy($$0.dF() * 0.5F, $$0.dD());
   }

   @Override
   protected ejz b(cdz $$0, ejz $$1) {
      if (this.aC() && this.cr == 0.0F && this.gy() && !this.cs) {
         return ejz.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ejz((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cdz $$0) {
      return (float)this.b(bmr.m);
   }

   protected void b(float $$0, ejz $$1) {
      double $$2 = this.gD() * (double)$$0 * (double)this.aK();
      double $$3 = $$2 + (double)this.fb();
      ejz $$4 = this.dq();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = atq.a(this.dD() * (float) (Math.PI / 180.0));
         float $$6 = atq.b(this.dD() * (float) (Math.PI / 180.0));
         this.g(this.dq().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gM() {
      this.a(aqv.lG, 0.4F, 1.0F);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gx());
      $$0.a("Bred", this.gz());
      $$0.a("Temper", this.gA());
      $$0.a("Tame", this.gu());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new sd()));
      }
   }

   @Override
   public void a(sd $$0) {
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
         $$1 = apx.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         clo $$4 = clo.a($$0.p("SaddleItem"));
         if ($$4.a(clr.nK)) {
            this.cp.a(0, $$4);
         }
      }

      this.gC();
   }

   @Override
   public boolean a(bww $$0) {
      return false;
   }

   protected boolean gN() {
      return !this.bP() && !this.bO() && this.gu() && !this.o_() && this.ew() >= this.eN() && this.gj();
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      return null;
   }

   protected void a(bkq $$0, byv $$1) {
      this.a($$0, $$1, bmr.l, (double)bY, (double)bZ);
      this.a($$0, $$1, bmr.h, (double)bW, (double)bX);
      this.a($$0, $$1, bmr.m, (double)bT, (double)bU);
   }

   private void a(bkq $$0, byv $$1, bmm $$2, double $$3, double $$4) {
      double $$5 = a(this.c($$2), $$0.c($$2), $$3, $$4, this.ag);
      $$1.a($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, atw $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = atq.a($$0, $$2, $$3);
         $$1 = atq.a($$1, $$2, $$3);
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
      return atq.i($$0, this.cG, this.cF);
   }

   public float F(float $$0) {
      return atq.i($$0, this.cI, this.cH);
   }

   public float G(float $$0) {
      return atq.i($$0, this.cK, this.cJ);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cs = true;
            this.gK();
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
      this.gK();
      this.gM();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      ju $$1 = $$0 ? jw.M : jw.Z;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dN().a($$1, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bkv $$0, bkv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bll) {
         ((bll)$$0).aU = this.aU;
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
   public boolean e_() {
      return false;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gO() {
      return false;
   }

   public boolean gP() {
      return !this.c(bla.e).b();
   }

   public boolean l(clo $$0) {
      return false;
   }

   private bmd a(final int $$0, final Predicate<clo> $$1) {
      return new bmd() {
         @Override
         public clo a() {
            return byv.this.cp.a($$0);
         }

         @Override
         public boolean a(clo $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               byv.this.cp.a($$0, $$0);
               byv.this.gC();
               return true;
            }
         }
      };
   }

   @Override
   public bmd a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(clr.nK));
         }

         if ($$1 == 1) {
            if (!this.gO()) {
               return bmd.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? bmd.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public bll cO() {
      if (this.i()) {
         bkv var2 = this.cR();
         if (var2 instanceof cdz) {
            return (cdz)var2;
         }
      }

      return super.cO();
   }

   @Nullable
   private ejz a(ejz $$0, bll $$1) {
      double $$2 = this.ds() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dy() + $$0.e;
      hx.a $$5 = new hx.a();
      UnmodifiableIterator var10 = $$1.fB().iterator();

      while (var10.hasNext()) {
         blx $$6 = (blx)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dN().i($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cfv.a($$8)) {
               eju $$9 = $$1.e($$6);
               ejz $$10 = new ejz($$2, (double)$$5.v() + $$8, $$4);
               if (cfv.a(this.dN(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ib.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ejz b(bll $$0) {
      ejz $$1 = a((double)this.dh(), (double)$$0.dh(), this.dD() + ($$0.fn() == blf.b ? 90.0F : -90.0F));
      ejz $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ejz $$3 = a((double)this.dh(), (double)$$0.dh(), this.dD() + ($$0.fn() == blf.a ? 90.0F : -90.0F));
         ejz $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dl();
      }
   }

   protected void a(atw $$0) {
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$3 == null) {
         $$3 = new bkq.a(0.2F);
      }

      this.a($$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(biu $$0) {
      return this.cp != $$0;
   }

   public int gQ() {
      return this.Q();
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, this.a($$1, $$2) + 0.15F * this.cI * $$2, -0.7F * this.cI * $$2);
   }

   protected float a(bkw $$0, float $$1) {
      return $$0.b + (this.o_() ? 0.125F : -0.15625F) * $$1;
   }
}
