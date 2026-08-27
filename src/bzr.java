import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class bzr extends bxs implements bjq, bly, bmn, bmq, bmv {
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
   private static final Predicate<bmf> cc = $$0 -> $$0 instanceof bzr && ((bzr)$$0).gy();
   private static final bwt cd = bwt.b().a(16.0).d().a(cc);
   private static final cps ce = cps.a(cmu.pt, cmu.rx, cwl.ij.k(), cmu.oq, cmu.ud, cmu.pX, cmu.pY);
   private static final agj<Byte> cw = agm.a(bzr.class, agl.a);
   private static final int cx = 2;
   private static final int cy = 4;
   private static final int cz = 8;
   private static final int cA = 16;
   private static final int cB = 32;
   private static final int cC = 64;
   public static final int cj = 0;
   public static final int ck = 1;
   public static final int cl = 2;
   private int cD;
   private int cE;
   private int cF;
   public int cm;
   public int cn;
   protected boolean co;
   protected bkd cp;
   protected int cq;
   protected float cr;
   protected boolean cs;
   private float cG;
   private float cH;
   private float cI;
   private float cJ;
   private float cK;
   private float cL;
   protected boolean ct = true;
   protected int cu;
   @Nullable
   private UUID cM;

   protected bzr(blt<? extends bzr> $$0, cti $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.gA();
   }

   @Override
   protected void B() {
      this.bO.a(1, new btu(this, 1.2));
      this.bO.a(1, new buf(this, 1.2));
      this.bO.a(2, new bsn(this, 1.0, bzr.class));
      this.bO.a(4, new bta(this, 1.0));
      this.bO.a(6, new buo(this, 0.7));
      this.bO.a(7, new btj(this, cfb.class, 6.0F));
      this.bO.a(8, new btw(this));
      if (this.gk()) {
         this.bO.a(9, new btx(this));
      }

      this.gu();
   }

   protected void gu() {
      this.bO.a(0, new bsv(this));
      this.bO.a(3, new buj(this, 1.25, cps.a(cmu.ud, cmu.pX, cmu.pY), false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cw, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.an.b(cw) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cw);
      if ($$1) {
         this.an.b(cw, (byte)($$2 | $$0));
      } else {
         this.an.b(cw, (byte)($$2 & ~$$0));
      }
   }

   public boolean gt() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cM;
   }

   public void b(@Nullable UUID $$0) {
      this.cM = $$0;
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
      return this.bx() && !this.o_() && this.gt();
   }

   @Override
   public void a(@Nullable arn $$0) {
      this.cp.a(0, new cmr(cmu.nK));
   }

   public void b(cfb $$0, cmr $$1) {
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
      int $$1 = aui.a(this.gz() + $$0, 0, this.gF());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bu() {
      return !this.bP();
   }

   private void u() {
      this.ge();
      if (!this.aU()) {
         arl $$0 = this.gl();
         if ($$0 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkn $$2) {
      if ($$0 > 1.0F) {
         this.a(arm.mb, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (blp $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eI();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aui.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ac_() {
      return 2;
   }

   protected void gA() {
      bkd $$0 = this.cp;
      this.cp = new bkd(this.ac_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cmr $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.p());
            }
         }
      }

      this.cp.a(this);
      this.gB();
   }

   protected void gB() {
      if (!this.dM().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(bjo $$0) {
      boolean $$1 = this.i();
      this.gB();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.Z_(), 0.5F, 1.0F);
      }
   }

   public double gC() {
      return this.b(bnl.h);
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
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
   protected arl gl() {
      return null;
   }

   @Nullable
   protected arl gD() {
      return null;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      if (!$$1.k()) {
         dja $$2 = this.dM().a_($$0.c());
         ddv $$3 = $$1.w();
         if ($$2.a(cwl.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(arm.me, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(arm.me, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(arm.md, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(ddv $$0) {
      return $$0 == ddv.b || $$0 == ddv.aT || $$0 == ddv.B || $$0 == ddv.aU || $$0 == ddv.aS;
   }

   protected void a(ddv $$0) {
      this.a(arm.lY, $$0.a() * 0.15F, $$0.b());
   }

   public static bnk.a gE() {
      return bmh.C().a(bnl.h).a(bnl.l, 53.0).a(bnl.m, 0.225F);
   }

   @Override
   public int fI() {
      return 6;
   }

   public int gF() {
      return 100;
   }

   @Override
   protected float eW() {
      return 0.8F;
   }

   @Override
   public int Q() {
      return 400;
   }

   @Override
   public void b(cfb $$0) {
      if (!this.dM().B && (!this.bP() || this.x($$0)) && this.gt()) {
         $$0.a(this, this.cp);
      }
   }

   public bjv c(cfb $$0, cmr $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2 & !$$0.fT().d) {
         $$1.h(1);
      }

      if (this.dM().B) {
         return bjv.b;
      } else {
         return $$2 ? bjv.a : bjv.d;
      }
   }

   protected boolean a(cfb $$0, cmr $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cmu.pt)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cmu.rx)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(cwl.ij.k())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cmu.oq)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cmu.ud)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dM().B && this.gt() && this.h() == 0 && !this.gi()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cmu.pX) || $$1.a(cmu.pY)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dM().B && this.gt() && this.h() == 0 && !this.gi()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ev() < this.eM() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dM().a(jx.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gt()) && this.gz() < this.gF() && !this.dM().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.u();
         this.a(dnk.m);
      }

      return $$2;
   }

   protected void f(cfb $$0) {
      this.A(false);
      this.B(false);
      if (!this.dM().B) {
         $$0.r(this.dC());
         $$0.s(this.dE());
         $$0.n(this);
      }
   }

   @Override
   public boolean eY() {
      return super.eY() && this.bP() && this.i() || this.gw() || this.gx();
   }

   @Override
   public boolean m(cmr $$0) {
      return ce.a($$0);
   }

   private void w() {
      this.cm = 1;
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            cmr $$1 = this.cp.a($$0);
            if (!$$1.b() && !cre.e($$1)) {
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
      if (!this.dM().B && this.bx()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gH()) {
            if (!this.gw() && !this.bP() && this.ag.a(300) == 0 && this.dM().a_(this.dm().d()).a(cwl.i)) {
               this.A(true);
            }

            if (this.gw() && ++this.cD > 50) {
               this.cD = 0;
               this.A(false);
            }
         }

         this.gG();
      }
   }

   protected void gG() {
      if (this.gy() && this.o_() && !this.gw()) {
         bmf $$0 = this.dM().a(bzr.class, cd, this, this.dr(), this.dt(), this.dx(), this.cH().g(16.0));
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
      if (this.cE > 0 && ++this.cE > 30) {
         this.cE = 0;
         this.d(64, false);
      }

      if (this.cY() && this.cF > 0 && ++this.cF > 20) {
         this.cF = 0;
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

      this.cH = this.cG;
      if (this.gw()) {
         this.cG = this.cG + (1.0F - this.cG) * 0.4F + 0.05F;
         if (this.cG > 1.0F) {
            this.cG = 1.0F;
         }
      } else {
         this.cG = this.cG + ((0.0F - this.cG) * 0.4F - 0.05F);
         if (this.cG < 0.0F) {
            this.cG = 0.0F;
         }
      }

      this.cJ = this.cI;
      if (this.gx()) {
         this.cG = 0.0F;
         this.cH = this.cG;
         this.cI = this.cI + (1.0F - this.cI) * 0.4F + 0.05F;
         if (this.cI > 1.0F) {
            this.cI = 1.0F;
         }
      } else {
         this.cs = false;
         this.cI = this.cI + ((0.8F * this.cI * this.cI * this.cI - this.cI) * 0.6F - 0.05F);
         if (this.cI < 0.0F) {
            this.cI = 0.0F;
         }
      }

      this.cL = this.cK;
      if (this.t(64)) {
         this.cK = this.cK + (1.0F - this.cK) * 0.7F + 0.05F;
         if (this.cK > 1.0F) {
            this.cK = 1.0F;
         }
      } else {
         this.cK = this.cK + ((0.0F - this.cK) * 0.7F - 0.05F);
         if (this.cK < 0.0F) {
            this.cK = 0.0F;
         }
      }
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      if (this.bP() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gt() && $$0.fI()) {
         this.b($$0);
         return bjv.a(this.dM().B);
      } else {
         cmr $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bjv $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gN() && this.l($$2) && !this.gO()) {
               this.b($$0, $$2);
               return bjv.a(this.dM().B);
            }
         }

         this.f($$0);
         return bjv.a(this.dM().B);
      }
   }

   private void ge() {
      if (!this.dM().B) {
         this.cE = 1;
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
   public arl gI() {
      return this.y();
   }

   public void gJ() {
      if (this.gk() && this.cY()) {
         this.cF = 1;
         this.B(true);
      }
   }

   public void gK() {
      if (!this.gx()) {
         this.gJ();
         arl $$0 = this.gD();
         if ($$0 != null) {
            this.a($$0, this.eW(), this.eX());
         }
      }
   }

   public boolean h(cfb $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof ana) {
         am.y.a((ana)$$0, this);
      }

      this.dM().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cfb $$0, elm $$1) {
      super.a($$0, $$1);
      ell $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dC();
      if (this.cX()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gv()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected ell j(bmf $$0) {
      return new ell($$0.dE() * 0.5F, $$0.dC());
   }

   @Override
   protected elm b(cfb $$0, elm $$1) {
      if (this.aC() && this.cr == 0.0F && this.gx() && !this.cs) {
         return elm.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new elm((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cfb $$0) {
      return (float)this.b(bnl.m);
   }

   protected void b(float $$0, elm $$1) {
      double $$2 = this.gC() * (double)$$0 * (double)this.aK();
      double $$3 = $$2 + (double)this.fa();
      elm $$4 = this.dp();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = aui.a(this.dC() * (float) (Math.PI / 180.0));
         float $$6 = aui.b(this.dC() * (float) (Math.PI / 180.0));
         this.g(this.dp().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gL() {
      this.a(arm.ma, 0.4F, 1.0F);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gw());
      $$0.a("Bred", this.gy());
      $$0.a("Temper", this.gz());
      $$0.a("Tame", this.gt());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new sl()));
      }
   }

   @Override
   public void a(sl $$0) {
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
         $$1 = aqo.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cmr $$4 = cmr.a($$0.p("SaddleItem"));
         if ($$4.a(cmu.nK)) {
            this.cp.a(0, $$4);
         }
      }

      this.gB();
   }

   @Override
   public boolean a(bxs $$0) {
      return false;
   }

   protected boolean gM() {
      return !this.bP() && !this.bO() && this.gt() && !this.o_() && this.ev() >= this.eM() && this.gi();
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      return null;
   }

   protected void a(blk $$0, bzr $$1) {
      this.a($$0, $$1, bnl.l, (double)bY, (double)bZ);
      this.a($$0, $$1, bnl.h, (double)bW, (double)bX);
      this.a($$0, $$1, bnl.m, (double)bT, (double)bU);
   }

   private void a(blk $$0, bzr $$1, bng $$2, double $$3, double $$4) {
      double $$5 = a(this.c($$2), $$0.c($$2), $$3, $$4, this.ag);
      $$1.a($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, aup $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = aui.a($$0, $$2, $$3);
         $$1 = aui.a($$1, $$2, $$3);
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
      return aui.i($$0, this.cH, this.cG);
   }

   public float F(float $$0) {
      return aui.i($$0, this.cJ, this.cI);
   }

   public float G(float $$0) {
      return aui.i($$0, this.cL, this.cK);
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
      jv $$1 = $$0 ? jx.O : jx.ab;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dM().a($$1, this.d(1.0), this.du() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(blp $$0, blp.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bmf) {
         ((bmf)$$0).aU = this.aU;
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
   protected float b(bmr $$0, blq $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gN() {
      return false;
   }

   public boolean gO() {
      return !this.c(blu.e).b();
   }

   public boolean l(cmr $$0) {
      return false;
   }

   private bmx a(final int $$0, final Predicate<cmr> $$1) {
      return new bmx() {
         @Override
         public cmr a() {
            return bzr.this.cp.a($$0);
         }

         @Override
         public boolean a(cmr $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               bzr.this.cp.a($$0, $$0);
               bzr.this.gB();
               return true;
            }
         }
      };
   }

   @Override
   public bmx a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(cmu.nK));
         }

         if ($$1 == 1) {
            if (!this.gN()) {
               return bmx.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? bmx.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public bmf cN() {
      if (this.i()) {
         blp var2 = this.cQ();
         if (var2 instanceof cfb) {
            return (cfb)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private elm a(elm $$0, bmf $$1) {
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dx() + $$0.e;
      hx.a $$5 = new hx.a();
      UnmodifiableIterator var10 = $$1.fA().iterator();

      while (var10.hasNext()) {
         bmr $$6 = (bmr)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dM().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cgy.a($$8)) {
               elh $$9 = $$1.e($$6);
               elm $$10 = new elm($$2, (double)$$5.v() + $$8, $$4);
               if (cgy.a(this.dM(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ic.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public elm b(bmf $$0) {
      elm $$1 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fm() == blz.b ? 90.0F : -90.0F));
      elm $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         elm $$3 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fm() == blz.a ? 90.0F : -90.0F));
         elm $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dk();
      }
   }

   protected void a(aup $$0) {
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      if ($$3 == null) {
         $$3 = new blk.a(0.2F);
      }

      this.a($$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bjo $$0) {
      return this.cp != $$0;
   }

   public int gP() {
      return this.Q();
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, this.a($$1, $$2) + 0.15F * this.cJ * $$2, -0.7F * this.cJ * $$2);
   }

   protected float a(blq $$0, float $$1) {
      return $$0.b + (this.o_() ? 0.125F : -0.15625F) * $$1;
   }
}
