import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cae extends byc implements bjx, bmh, bmw, bmz, bne {
   public static final int cg = 400;
   public static final int ch = 499;
   public static final int ci = 500;
   public static final double cj = 0.15;
   private static final float bU = (float)b(() -> 0.0);
   private static final float bV = (float)b(() -> 1.0);
   private static final float bX = (float)a(() -> 0.0);
   private static final float bY = (float)a(() -> 1.0);
   private static final float bZ = a($$0 -> 0);
   private static final float ca = a($$0 -> $$0 - 1);
   private static final float cb = 0.25F;
   private static final float cc = 0.5F;
   private static final Predicate<bmo> cd = $$0 -> $$0 instanceof cae && ((cae)$$0).gz();
   private static final bxd ce = bxd.b().a(16.0).d().a(cd);
   private static final cqh cf = cqh.a(cnj.pv, cnj.rz, cxa.ij.j(), cnj.os, cnj.ug, cnj.pZ, cnj.qa);
   private static final agn<Byte> cx = agq.a(cae.class, agp.a);
   private static final int cy = 2;
   private static final int cz = 4;
   private static final int cA = 8;
   private static final int cB = 16;
   private static final int cC = 32;
   private static final int cD = 64;
   public static final int ck = 0;
   public static final int cl = 1;
   public static final int cm = 2;
   private int cE;
   private int cF;
   private int cG;
   public int cn;
   public int co;
   protected boolean cp;
   protected bkl cq;
   protected int cr;
   protected float cs;
   protected boolean ct;
   private float cH;
   private float cI;
   private float cJ;
   private float cK;
   private float cL;
   private float cM;
   protected boolean cu = true;
   protected int cv;
   @Nullable
   private UUID cN;

   protected cae(bmc<? extends cae> $$0, ctx $$1) {
      super($$0, $$1);
      this.gB();
   }

   @Override
   protected void B() {
      this.bP.a(1, new bud(this, 1.2));
      this.bP.a(1, new buo(this, 1.2));
      this.bP.a(2, new bsw(this, 1.0, cae.class));
      this.bP.a(4, new btj(this, 1.0));
      this.bP.a(6, new bux(this, 0.7));
      this.bP.a(7, new bts(this, cfq.class, 6.0F));
      this.bP.a(8, new buf(this));
      if (this.gl()) {
         this.bP.a(9, new bug(this));
      }

      this.gv();
   }

   protected void gv() {
      this.bP.a(0, new bte(this));
      this.bP.a(3, new bus(this, 1.25, cqh.a(cnj.ug, cnj.pZ, cnj.qa), false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cx, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.an.b(cx) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cx);
      if ($$1) {
         this.an.b(cx, (byte)($$2 | $$0));
      } else {
         this.an.b(cx, (byte)($$2 & ~$$0));
      }
   }

   public boolean gu() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cN;
   }

   public void b(@Nullable UUID $$0) {
      this.cN = $$0;
   }

   public boolean gw() {
      return this.cp;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.cp = $$0;
   }

   @Override
   protected void C(float $$0) {
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
   public void a(@Nullable aru $$0) {
      this.cq.a(0, new cng(cnj.nK));
   }

   public void b(cfq $$0, cng $$1) {
      if (this.l($$1)) {
         this.cq.a(1, $$1.c(1));
         if (!$$0.fT().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gA() {
      return this.cr;
   }

   public void u(int $$0) {
      this.cr = $$0;
   }

   public int v(int $$0) {
      int $$1 = aup.a(this.gA() + $$0, 0, this.gG());
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
         ars $$0 = this.gm();
         if ($$0 != null) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), $$0, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
      if ($$0 > 1.0F) {
         this.a(art.mq, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (blw $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eI();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aup.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ac_() {
      return 2;
   }

   protected void gB() {
      bkl $$0 = this.cq;
      this.cq = new bkl(this.ac_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cq.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cng $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cq.a($$2, $$3.p());
            }
         }
      }

      this.cq.a(this);
      this.gC();
   }

   protected void gC() {
      if (!this.dL().B) {
         this.d(4, !this.cq.a(0).b());
      }
   }

   @Override
   public void a(bjv $$0) {
      boolean $$1 = this.i();
      this.gC();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.Z_(), 0.5F, 1.0F);
      }
   }

   public double gD() {
      return this.g(bnu.j);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
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
   protected ars gm() {
      return null;
   }

   @Nullable
   protected ars gE() {
      return null;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      if (!$$1.k()) {
         djp $$2 = this.dL().a_($$0.c());
         dek $$3 = $$1.w();
         if ($$2.a(cxa.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.cu) {
            this.cv++;
            if (this.cv > 5 && this.cv % 3 == 0) {
               this.a($$3);
            } else if (this.cv <= 5) {
               this.a(art.mt, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(art.mt, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(art.ms, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dek $$0) {
      return $$0 == dek.b || $$0 == dek.aT || $$0 == dek.B || $$0 == dek.aU || $$0 == dek.aS;
   }

   protected void a(dek $$0) {
      this.a(art.mn, $$0.a() * 0.15F, $$0.b());
   }

   public static bnt.a gF() {
      return bmq.C().a(bnu.j).a(bnu.n, 53.0).a(bnu.o, 0.225F).a(bnu.r, 1.0);
   }

   @Override
   public int fJ() {
      return 6;
   }

   public int gG() {
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
   public void b(cfq $$0) {
      if (!this.dL().B && (!this.bP() || this.w($$0)) && this.gu()) {
         $$0.a(this, this.cq);
      }
   }

   public bkc c(cfq $$0, cng $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2 & !$$0.fT().d) {
         $$1.h(1);
      }

      if (this.dL().B) {
         return bkc.b;
      } else {
         return $$2 ? bkc.a : bkc.d;
      }
   }

   protected boolean a(cfq $$0, cng $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cnj.pv)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cnj.rz)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(cxa.ij.j())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cnj.os)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cnj.ug)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dL().B && this.gu() && this.h() == 0 && !this.gj()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cnj.pZ) || $$1.a(cnj.qa)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dL().B && this.gu() && this.h() == 0 && !this.gj()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ev() < this.eM() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dL().a(jx.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dL().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gu()) && this.gA() < this.gG() && !this.dL().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.u();
         this.b(dnz.m);
      }

      return $$2;
   }

   protected void f(cfq $$0) {
      this.A(false);
      this.B(false);
      if (!this.dL().B) {
         $$0.r(this.dB());
         $$0.s(this.dD());
         $$0.m(this);
      }
   }

   @Override
   public boolean eY() {
      return super.eY() && this.bP() && this.i() || this.gx() || this.gy();
   }

   @Override
   public boolean m(cng $$0) {
      return cf.a($$0);
   }

   private void w() {
      this.cn = 1;
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.cq != null) {
         for (int $$0 = 0; $$0 < this.cq.b(); $$0++) {
            cng $$1 = this.cq.a($$0);
            if (!$$1.b() && !crt.e($$1)) {
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
      if (!this.dL().B && this.bx()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gI()) {
            if (!this.gx() && !this.bP() && this.ag.a(300) == 0 && this.dL().a_(this.dl().d()).a(cxa.i)) {
               this.A(true);
            }

            if (this.gx() && ++this.cE > 50) {
               this.cE = 0;
               this.A(false);
            }
         }

         this.gH();
      }
   }

   protected void gH() {
      if (this.gz() && this.o_() && !this.gx()) {
         bmo $$0 = this.dL().a(cae.class, ce, this, this.dq(), this.ds(), this.dw(), this.cH().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bO.a($$0, 0);
         }
      }
   }

   public boolean gI() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cF > 0 && ++this.cF > 30) {
         this.cF = 0;
         this.d(64, false);
      }

      if (this.cY() && this.cG > 0 && ++this.cG > 20) {
         this.cG = 0;
         this.B(false);
      }

      if (this.cn > 0 && ++this.cn > 8) {
         this.cn = 0;
      }

      if (this.co > 0) {
         this.co++;
         if (this.co > 300) {
            this.co = 0;
         }
      }

      this.cI = this.cH;
      if (this.gx()) {
         this.cH = this.cH + (1.0F - this.cH) * 0.4F + 0.05F;
         if (this.cH > 1.0F) {
            this.cH = 1.0F;
         }
      } else {
         this.cH = this.cH + ((0.0F - this.cH) * 0.4F - 0.05F);
         if (this.cH < 0.0F) {
            this.cH = 0.0F;
         }
      }

      this.cK = this.cJ;
      if (this.gy()) {
         this.cH = 0.0F;
         this.cI = this.cH;
         this.cJ = this.cJ + (1.0F - this.cJ) * 0.4F + 0.05F;
         if (this.cJ > 1.0F) {
            this.cJ = 1.0F;
         }
      } else {
         this.ct = false;
         this.cJ = this.cJ + ((0.8F * this.cJ * this.cJ * this.cJ - this.cJ) * 0.6F - 0.05F);
         if (this.cJ < 0.0F) {
            this.cJ = 0.0F;
         }
      }

      this.cM = this.cL;
      if (this.t(64)) {
         this.cL = this.cL + (1.0F - this.cL) * 0.7F + 0.05F;
         if (this.cL > 1.0F) {
            this.cL = 1.0F;
         }
      } else {
         this.cL = this.cL + ((0.0F - this.cL) * 0.7F - 0.05F);
         if (this.cL < 0.0F) {
            this.cL = 0.0F;
         }
      }
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      if (this.bP() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gu() && $$0.fI()) {
         this.b($$0);
         return bkc.a(this.dL().B);
      } else {
         cng $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bkc $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gO() && this.l($$2) && !this.gP()) {
               this.b($$0, $$2);
               return bkc.a(this.dL().B);
            }
         }

         this.f($$0);
         return bkc.a(this.dL().B);
      }
   }

   private void gf() {
      if (!this.dL().B) {
         this.cF = 1;
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
   public ars gJ() {
      return this.y();
   }

   public void gK() {
      if (this.gl() && this.cY()) {
         this.cG = 1;
         this.B(true);
      }
   }

   public void gL() {
      if (!this.gy()) {
         this.gK();
         ars $$0 = this.gE();
         if ($$0 != null) {
            this.a($$0, this.eW(), this.eX());
         }
      }
   }

   public boolean h(cfq $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof anf) {
         am.y.a((anf)$$0, this);
      }

      this.dL().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cfq $$0, emc $$1) {
      super.a($$0, $$1);
      emb $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dB();
      if (this.cX()) {
         if ($$1.e <= 0.0) {
            this.cv = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cs > 0.0F && !this.gw()) {
               this.b(this.cs, $$1);
            }

            this.cs = 0.0F;
         }
      }
   }

   protected emb j(bmo $$0) {
      return new emb($$0.dD() * 0.5F, $$0.dB());
   }

   @Override
   protected emc b(cfq $$0, emc $$1) {
      if (this.aC() && this.cs == 0.0F && this.gy() && !this.ct) {
         return emc.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new emc((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cfq $$0) {
      return (float)this.g(bnu.o);
   }

   protected void b(float $$0, emc $$1) {
      double $$2 = this.gD() * (double)$$0 * (double)this.aK();
      double $$3 = $$2 + (double)this.fa();
      emc $$4 = this.do();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = aup.a(this.dB() * (float) (Math.PI / 180.0));
         float $$6 = aup.b(this.dB() * (float) (Math.PI / 180.0));
         this.g(this.do().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gM() {
      this.a(art.mp, 0.4F, 1.0F);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gx());
      $$0.a("Bred", this.gz());
      $$0.a("Temper", this.gA());
      $$0.a("Tame", this.gu());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cq.a(0).b()) {
         $$0.a("SaddleItem", this.cq.a(0).b(new so()));
      }
   }

   @Override
   public void a(so $$0) {
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
         $$1 = aqv.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cng $$4 = cng.a($$0.p("SaddleItem"));
         if ($$4.a(cnj.nK)) {
            this.cq.a(0, $$4);
         }
      }

      this.gC();
   }

   @Override
   public boolean a(byc $$0) {
      return false;
   }

   protected boolean gN() {
      return !this.bP() && !this.bO() && this.gu() && !this.o_() && this.ev() >= this.eM() && this.gj();
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      return null;
   }

   protected void a(blr $$0, cae $$1) {
      this.a($$0, $$1, bnu.n, (double)bZ, (double)ca);
      this.a($$0, $$1, bnu.j, (double)bX, (double)bY);
      this.a($$0, $$1, bnu.o, (double)bU, (double)bV);
   }

   private void a(blr $$0, cae $$1, ih<bnp> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ag);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, auw $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = aup.a($$0, $$2, $$3);
         $$1 = aup.a($$1, $$2, $$3);
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

   public float D(float $$0) {
      return aup.i($$0, this.cI, this.cH);
   }

   public float E(float $$0) {
      return aup.i($$0, this.cK, this.cJ);
   }

   public float F(float $$0) {
      return aup.i($$0, this.cM, this.cL);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.ct = true;
            this.gK();
         }

         if ($$0 >= 90) {
            this.cs = 1.0F;
         } else {
            this.cs = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.ct = true;
      this.gK();
      this.gM();
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
   protected void a(blw $$0, blw.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bmo) {
         ((bmo)$$0).aU = this.aU;
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

   public boolean gO() {
      return false;
   }

   public boolean gP() {
      return !this.c(bmd.e).b();
   }

   public boolean l(cng $$0) {
      return false;
   }

   private bng a(final int $$0, final Predicate<cng> $$1) {
      return new bng() {
         @Override
         public cng a() {
            return cae.this.cq.a($$0);
         }

         @Override
         public boolean a(cng $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               cae.this.cq.a($$0, $$0);
               cae.this.gC();
               return true;
            }
         }
      };
   }

   @Override
   public bng a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cq.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(cnj.nK));
         }

         if ($$1 == 1) {
            if (!this.gO()) {
               return bng.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cq.b() ? bng.a(this.cq, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public bmo cN() {
      if (this.i()) {
         blw var2 = this.cQ();
         if (var2 instanceof cfq) {
            return (cfq)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private emc a(emc $$0, bmo $$1) {
      double $$2 = this.dq() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dw() + $$0.e;
      hx.a $$5 = new hx.a();
      UnmodifiableIterator var10 = $$1.fA().iterator();

      while (var10.hasNext()) {
         bna $$6 = (bna)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dL().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (chn.a($$8)) {
               elx $$9 = $$1.f($$6);
               emc $$10 = new emc($$2, (double)$$5.v() + $$8, $$4);
               if (chn.a(this.dL(), $$1, $$9.c($$10))) {
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
   public emc b(bmo $$0) {
      emc $$1 = a((double)this.dg(), (double)$$0.dg(), this.dB() + ($$0.fm() == bmi.b ? 90.0F : -90.0F));
      emc $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         emc $$3 = a((double)this.dg(), (double)$$0.dg(), this.dB() + ($$0.fm() == bmi.a ? 90.0F : -90.0F));
         emc $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dj();
      }
   }

   protected void a(auw $$0) {
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$3 == null) {
         $$3 = new blr.a(0.2F);
      }

      this.a($$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bjv $$0) {
      return this.cq != $$0;
   }

   public int gQ() {
      return this.Q();
   }

   @Override
   protected emc a(blw $$0, blz $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new emc(0.0, 0.15 * (double)this.cK * (double)$$2, -0.7 * (double)this.cK * (double)$$2).b(-this.dB() * (float) (Math.PI / 180.0)));
   }
}
