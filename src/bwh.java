import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class bwh extends bui implements bgj, bip, bje, bjh, bjn {
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
   private static final Predicate<biw> cc = $$0 -> $$0 instanceof bwh && ((bwh)$$0).gt();
   private static final btj cd = btj.b().a(16.0).d().a(cc);
   private static final clw ce = clw.a(ciz.oI, ciz.qM, csl.ij.k(), ciz.nF, ciz.tq, ciz.pm, ciz.pn);
   private static final adx<Byte> cv = aea.a(bwh.class, adz.a);
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
   protected bgv cp;
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

   protected bwh(bik<? extends bwh> $$0, cpk $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.gv();
   }

   @Override
   protected void w() {
      this.bO.a(1, new bql(this, 1.2));
      this.bO.a(1, new bqw(this, 1.2));
      this.bO.a(2, new bpe(this, 1.0, bwh.class));
      this.bO.a(4, new bpr(this, 1.0));
      this.bO.a(6, new brf(this, 0.7));
      this.bO.a(7, new bqa(this, cbl.class, 6.0F));
      this.bO.a(8, new bqn(this));
      if (this.gf()) {
         this.bO.a(9, new bqo(this));
      }

      this.gp();
   }

   protected void gp() {
      this.bO.a(0, new bpm(this));
      this.bO.a(3, new bra(this, 1.25, clw.a(ciz.tq, ciz.pm, ciz.pn), false));
   }

   @Override
   protected void a_() {
      super.a_();
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

   public boolean go() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID U_() {
      return this.cL;
   }

   public void b(@Nullable UUID $$0) {
      this.cL = $$0;
   }

   public boolean gq() {
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
      if ($$0 > 6.0F && this.gr()) {
         this.A(false);
      }
   }

   public boolean gr() {
      return this.t(16);
   }

   public boolean gs() {
      return this.t(32);
   }

   public boolean gt() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bv() && !this.i_() && this.go();
   }

   @Override
   public void a(@Nullable aov $$0) {
      this.cp.a(0, new ciw(ciz.mZ));
   }

   public void b(cbl $$0, ciw $$1) {
      if (this.l($$1)) {
         this.cp.a(1, $$1.c(1));
         if (!$$0.fR().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gu() {
      return this.cq;
   }

   public void u(int $$0) {
      this.cq = $$0;
   }

   public int v(int $$0) {
      int $$1 = aro.a(this.gu() + $$0, 0, this.gA());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bs() {
      return !this.bO();
   }

   private void p() {
      this.fZ();
      if (!this.aS()) {
         aot $$0 = this.gg();
         if ($$0 != null) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), $$0, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhe $$2) {
      if ($$0 > 1.0F) {
         this.a(aou.ln, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bO()) {
            for (big $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eG();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aro.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int V_() {
      return 2;
   }

   protected void gv() {
      bgv $$0 = this.cp;
      this.cp = new bgv(this.V_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            ciw $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.p());
            }
         }
      }

      this.cp.a(this);
      this.gw();
   }

   protected void gw() {
      if (!this.dK().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(bgh $$0) {
      boolean $$1 = this.i();
      this.gw();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.R_(), 0.5F, 1.0F);
      }
   }

   public double gx() {
      return this.b(bkd.n);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ag.a(3) == 0) {
         this.gE();
      }

      return $$2;
   }

   protected boolean gf() {
      return true;
   }

   @Nullable
   protected aot gg() {
      return null;
   }

   @Nullable
   protected aot gy() {
      return null;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      if (!$$1.k()) {
         dey $$2 = this.dK().a_($$0.c());
         czx $$3 = $$1.w();
         if ($$2.a(csl.dN)) {
            $$3 = $$2.w();
         }

         if (this.bO() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(aou.lq, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(aou.lq, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(aou.lp, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(czx $$0) {
      return $$0 == czx.b || $$0 == czx.aP || $$0 == czx.B || $$0 == czx.aQ || $$0 == czx.aO;
   }

   protected void a(czx $$0) {
      this.a(aou.lk, $$0.a() * 0.15F, $$0.b());
   }

   public static bkc.a gz() {
      return biy.x().a(bkd.n).a(bkd.a, 53.0).a(bkd.d, 0.225F);
   }

   @Override
   public int Z() {
      return 6;
   }

   public int gA() {
      return 100;
   }

   @Override
   protected float eU() {
      return 0.8F;
   }

   @Override
   public int L() {
      return 400;
   }

   @Override
   public void b(cbl $$0) {
      if (!this.dK().B && (!this.bO() || this.x($$0)) && this.go()) {
         $$0.a(this, this.cp);
      }
   }

   public bgo c(cbl $$0, ciw $$1) {
      boolean $$2 = this.a($$0, $$1);
      if (!$$0.fR().d) {
         $$1.h(1);
      }

      if (this.dK().B) {
         return bgo.b;
      } else {
         return $$2 ? bgo.a : bgo.d;
      }
   }

   protected boolean a(cbl $$0, ciw $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(ciz.oI)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(ciz.qM)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(csl.ij.k())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(ciz.nF)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(ciz.tq)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dK().B && this.go() && this.h() == 0 && !this.gd()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(ciz.pm) || $$1.a(ciz.pn)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dK().B && this.go() && this.h() == 0 && !this.gd()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.et() < this.eK() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.i_() && $$4 > 0) {
         this.dK().a(iw.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dK().B) {
            this.b_($$4);
         }

         $$2 = true;
      }

      if ($$5 > 0 && ($$2 || !this.go()) && this.gu() < this.gA()) {
         $$2 = true;
         if (!this.dK().B) {
            this.v($$5);
         }
      }

      if ($$2) {
         this.p();
         this.a(dji.m);
      }

      return $$2;
   }

   protected void f(cbl $$0) {
      this.A(false);
      this.B(false);
      if (!this.dK().B) {
         $$0.r(this.dA());
         $$0.s(this.dC());
         $$0.n(this);
      }
   }

   @Override
   public boolean eW() {
      return super.eW() && this.bO() && this.i() || this.gr() || this.gs();
   }

   @Override
   public boolean m(ciw $$0) {
      return ce.a($$0);
   }

   private void q() {
      this.cm = 1;
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            ciw $$1 = this.cp.a($$0);
            if (!$$1.b() && !cnf.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void b_() {
      if (this.ag.a(200) == 0) {
         this.q();
      }

      super.b_();
      if (!this.dK().B && this.bv()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gC()) {
            if (!this.gr() && !this.bO() && this.ag.a(300) == 0 && this.dK().a_(this.dk().d()).a(csl.i)) {
               this.A(true);
            }

            if (this.gr() && ++this.cC > 50) {
               this.cC = 0;
               this.A(false);
            }
         }

         this.gB();
      }
   }

   protected void gB() {
      if (this.gt() && this.i_() && !this.gr()) {
         biw $$0 = this.dK().a(bwh.class, cd, this, this.dp(), this.dr(), this.dv(), this.cG().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bN.a($$0, 0);
         }
      }
   }

   public boolean gC() {
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
      if (this.gr()) {
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
      if (this.gs()) {
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
   public bgo b(cbl $$0, bgn $$1) {
      if (this.bO() || this.i_()) {
         return super.b($$0, $$1);
      } else if (this.go() && $$0.fG()) {
         this.b($$0);
         return bgo.a(this.dK().B);
      } else {
         ciw $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bgo $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gI() && this.l($$2) && !this.gJ()) {
               this.b($$0, $$2);
               return bgo.a(this.dK().B);
            }
         }

         this.f($$0);
         return bgo.a(this.dK().B);
      }
   }

   private void fZ() {
      if (!this.dK().B) {
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
   public aot gD() {
      return this.r();
   }

   public void gE() {
      if (this.gf() && this.cX()) {
         this.cE = 1;
         this.B(true);
      }
   }

   public void gF() {
      if (!this.gs()) {
         this.gE();
         aot $$0 = this.gy();
         if ($$0 != null) {
            this.a($$0, this.eU(), this.eV());
         }
      }
   }

   public boolean h(cbl $$0) {
      this.b($$0.cv());
      this.x(true);
      if ($$0 instanceof akj) {
         ai.x.a((akj)$$0, this);
      }

      this.dK().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cbl $$0, ehf $$1) {
      super.a($$0, $$1);
      ehe $$2 = this.l($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dA();
      if (this.cW()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aA()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gq()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected ehe l(biw $$0) {
      return new ehe($$0.dC() * 0.5F, $$0.dA());
   }

   @Override
   protected ehf b(cbl $$0, ehf $$1) {
      if (this.aA() && this.cr == 0.0F && this.gs() && !this.cs) {
         return ehf.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ehf((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cbl $$0) {
      return (float)this.b(bkd.d);
   }

   protected void b(float $$0, ehf $$1) {
      double $$2 = this.gx() * (double)$$0 * (double)this.aI();
      double $$3 = $$2 + (double)this.eY();
      ehf $$4 = this.dn();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = aro.a(this.dA() * (float) (Math.PI / 180.0));
         float $$6 = aro.b(this.dA() * (float) (Math.PI / 180.0));
         this.f(this.dn().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gG() {
      this.a(aou.lm, 0.4F, 1.0F);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gr());
      $$0.a("Bred", this.gt());
      $$0.a("Temper", this.gu());
      $$0.a("Tame", this.go());
      if (this.U_() != null) {
         $$0.a("Owner", this.U_());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new qs()));
      }
   }

   @Override
   public void a(qs $$0) {
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
         $$1 = anw.a(this.cK(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         ciw $$4 = ciw.a($$0.p("SaddleItem"));
         if ($$4.a(ciz.mZ)) {
            this.cp.a(0, $$4);
         }
      }

      this.gw();
   }

   @Override
   public boolean a(bui $$0) {
      return false;
   }

   protected boolean gH() {
      return !this.bO() && !this.bN() && this.go() && !this.i_() && this.et() >= this.eK() && this.gd();
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      return null;
   }

   protected void a(bib $$0, bwh $$1) {
      this.a($$0, $$1, bkd.a, (double)bY, (double)bZ);
      this.a($$0, $$1, bkd.n, (double)bW, (double)bX);
      this.a($$0, $$1, bkd.d, (double)bT, (double)bU);
   }

   private void a(bib $$0, bwh $$1, bjy $$2, double $$3, double $$4) {
      double $$5 = a(this.c($$2), $$0.c($$2), $$3, $$4, this.ag);
      $$1.a($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, art $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = aro.a($$0, $$2, $$3);
         $$1 = aro.a($$1, $$2, $$3);
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
      return aro.i($$0, this.cG, this.cF);
   }

   public float F(float $$0) {
      return aro.i($$0, this.cI, this.cH);
   }

   public float G(float $$0) {
      return aro.i($$0, this.cK, this.cJ);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cs = true;
            this.gE();
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
      this.gE();
      this.gG();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      iu $$1 = $$0 ? iw.M : iw.Z;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dK().a($$1, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(big $$0, big.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof biw) {
         ((biw)$$0).aU = this.aU;
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
   public boolean j_() {
      return false;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gI() {
      return false;
   }

   public boolean gJ() {
      return !this.c(bil.e).b();
   }

   public boolean l(ciw $$0) {
      return false;
   }

   private bjp a(final int $$0, final Predicate<ciw> $$1) {
      return new bjp() {
         @Override
         public ciw a() {
            return bwh.this.cp.a($$0);
         }

         @Override
         public boolean a(ciw $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               bwh.this.cp.a($$0, $$0);
               bwh.this.gw();
               return true;
            }
         }
      };
   }

   @Override
   public bjp a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(ciz.mZ));
         }

         if ($$1 == 1) {
            if (!this.gI()) {
               return bjp.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? bjp.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public biw cN() {
      if (this.i()) {
         big var2 = this.cQ();
         if (var2 instanceof cbl) {
            return (cbl)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private ehf a(ehf $$0, biw $$1) {
      double $$2 = this.dp() + $$0.c;
      double $$3 = this.cG().b;
      double $$4 = this.dv() + $$0.e;
      gv.a $$5 = new gv.a();
      UnmodifiableIterator var10 = $$1.fy().iterator();

      while (var10.hasNext()) {
         bji $$6 = (bji)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cG().e + 0.75;

         do {
            double $$8 = this.dK().i($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cdh.a($$8)) {
               eha $$9 = $$1.e($$6);
               ehf $$10 = new ehf($$2, (double)$$5.v() + $$8, $$4);
               if (cdh.a(this.dK(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(hb.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ehf b(biw $$0) {
      ehf $$1 = a((double)this.df(), (double)$$0.df(), this.dA() + ($$0.fk() == biq.b ? 90.0F : -90.0F));
      ehf $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ehf $$3 = a((double)this.df(), (double)$$0.df(), this.dA() + ($$0.fk() == biq.a ? 90.0F : -90.0F));
         ehf $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.di();
      }
   }

   protected void a(art $$0) {
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$3 == null) {
         $$3 = new bib.a(0.2F);
      }

      this.a($$0.y_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bgh $$0) {
      return this.cp != $$0;
   }

   public int gK() {
      return this.L();
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, this.a($$1, $$2) + 0.15F * this.cI * $$2, -0.7F * this.cI * $$2);
   }

   protected float a(bih $$0, float $$1) {
      return $$0.b + (this.i_() ? 0.125F : -0.15625F) * $$1;
   }
}
