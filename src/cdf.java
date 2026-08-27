import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cdf extends cbd implements bmx, bph, bpv, bpy, bqd {
   public static final int cj = 400;
   public static final int ck = 499;
   public static final int cl = 500;
   public static final double cm = 0.15;
   private static final float bX = (float)b(() -> 0.0);
   private static final float bY = (float)b(() -> 1.0);
   private static final float ca = (float)a(() -> 0.0);
   private static final float cb = (float)a(() -> 1.0);
   private static final float cc = a($$0 -> 0);
   private static final float cd = a($$0 -> $$0 - 1);
   private static final float ce = 0.25F;
   private static final float cf = 0.5F;
   private static final Predicate<bpo> cg = $$0 -> $$0 instanceof cdf && ((cdf)$$0).gH();
   private static final cae ch = cae.b().a(16.0).d().a(cg);
   private static final ctk ci = ctk.a(cqn.pv, cqn.rz, dac.ij.l(), cqn.os, cqn.uh, cqn.pZ, cqn.qa);
   private static final aim<Byte> cz = aiq.a(cdf.class, aio.a);
   private static final int cA = 2;
   private static final int cB = 4;
   private static final int cC = 8;
   private static final int cD = 16;
   private static final int cE = 32;
   private static final int cF = 64;
   public static final int cn = 0;
   public static final int co = 1;
   private int cG;
   private int cH;
   private int cI;
   public int cp;
   public int cq;
   protected boolean cr;
   protected bnl cs;
   protected int ct;
   protected float cu;
   protected boolean cv;
   private float cJ;
   private float cK;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   protected boolean cw = true;
   protected int cx;
   @Nullable
   private UUID cP;
   private final bmv cQ = new erc() {
      @Override
      public cqk f() {
         return cdf.this.fP();
      }

      @Override
      public void a(cqk $$0) {
         cdf.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cis $$0) {
         return $$0.cZ() == cdf.this || $$0.b(cdf.this, 4.0);
      }
   };

   protected cdf(bpc<? extends cdf> $$0, cwz $$1) {
      super($$0, $$1);
      this.gJ();
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxe(this, 1.2));
      this.bR.a(1, new bxp(this, 1.2));
      this.bR.a(2, new bvx(this, 1.0, cdf.class));
      this.bR.a(4, new bwk(this, 1.0));
      this.bR.a(6, new bxy(this, 0.7));
      this.bR.a(7, new bwt(this, cis.class, 6.0F));
      this.bR.a(8, new bxg(this));
      if (this.gt()) {
         this.bR.a(9, new bxh(this));
      }

      this.gD();
   }

   protected void gD() {
      this.bR.a(0, new bwf(this));
      this.bR.a(3, new bxt(this, 1.25, ctk.a(cqn.uh, cqn.pZ, cqn.qa), false));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cz, (byte)0);
   }

   protected boolean u(int $$0) {
      return (this.an.a(cz) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.an.a(cz);
      if ($$1) {
         this.an.a(cz, (byte)($$2 | $$0));
      } else {
         this.an.a(cz, (byte)($$2 & ~$$0));
      }
   }

   public boolean gC() {
      return this.u(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cP;
   }

   public void b(@Nullable UUID $$0) {
      this.cP = $$0;
   }

   public boolean gE() {
      return this.cr;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.cr = $$0;
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gF()) {
         this.A(false);
      }
   }

   public boolean gF() {
      return this.u(16);
   }

   public boolean gG() {
      return this.u(32);
   }

   public boolean gH() {
      return this.u(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bA() && !this.o_() && this.gC();
   }

   @Override
   public void a(@Nullable atz $$0) {
      this.cs.a(0, new cqk(cqn.nK));
   }

   public void b(cis $$0, cqk $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.u(4);
   }

   public int gI() {
      return this.ct;
   }

   public void v(int $$0) {
      this.ct = $$0;
   }

   public int w(int $$0) {
      int $$1 = aww.a(this.gI() + $$0, 0, this.gN());
      this.v($$1);
      return $$1;
   }

   @Override
   public boolean bx() {
      return !this.bP();
   }

   private void r() {
      this.gn();
      if (!this.aU()) {
         atx $$0 = this.gu();
         if ($$0 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bnv $$2) {
      if ($$0 > 1.0F) {
         this.a(aty.mu, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (bow $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eK();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aww.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int aa_() {
      return 1;
   }

   protected void gJ() {
      bnl $$0 = this.cs;
      this.cs = new bnl(this.aa_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cs.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cqk $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cs.a($$2, $$3.q());
            }
         }
      }

      this.cs.a(this);
      this.gK();
   }

   protected void gK() {
      if (!this.dM().B) {
         this.d(4, !this.cs.a(0).b());
      }
   }

   @Override
   public void a(bmv $$0) {
      boolean $$1 = this.i();
      this.gK();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.X_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ag.a(3) == 0) {
         this.gR();
      }

      return $$2;
   }

   protected boolean gt() {
      return true;
   }

   @Nullable
   protected atx gu() {
      return null;
   }

   @Nullable
   protected atx gL() {
      return null;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      if (!$$1.k()) {
         dmz $$2 = this.dM().a_($$0.c());
         dhm $$3 = $$1.w();
         if ($$2.a(dac.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.cw) {
            this.cx++;
            if (this.cx > 5 && this.cx % 3 == 0) {
               this.a($$3);
            } else if (this.cx <= 5) {
               this.a(aty.mx, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(aty.mx, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(aty.mw, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dhm $$0) {
      return $$0 == dhm.b || $$0 == dhm.aT || $$0 == dhm.B || $$0 == dhm.aU || $$0 == dhm.aS;
   }

   protected void a(dhm $$0) {
      this.a(aty.mr, $$0.a() * 0.15F, $$0.b());
   }

   public static bqu.a gM() {
      return bpq.A().a(bqv.m, 0.7).a(bqv.q, 53.0).a(bqv.r, 0.225F).a(bqv.v, 1.0);
   }

   @Override
   public int fO() {
      return 6;
   }

   public int gN() {
      return 100;
   }

   @Override
   protected float fb() {
      return 0.8F;
   }

   @Override
   public int O() {
      return 400;
   }

   @Override
   public void b(cis $$0) {
      if (!this.dM().B && (!this.bP() || this.x($$0)) && this.gC()) {
         $$0.a(this, this.cs);
      }
   }

   public bnc c(cis $$0, cqk $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dM().B) {
         return bnc.b;
      } else {
         return $$2 ? bnc.a : bnc.d;
      }
   }

   protected boolean a(cis $$0, cqk $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cqn.pv)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cqn.rz)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dac.ij.l())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cqn.os)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cqn.uh)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dM().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cqn.pZ) || $$1.a(cqn.qa)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dM().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ex() < this.eO() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dM().a(kc.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gC()) && this.gI() < this.gN() && !this.dM().B) {
         this.w($$5);
         $$2 = true;
      }

      if ($$2) {
         this.r();
         this.b(drn.m);
      }

      return $$2;
   }

   protected void f(cis $$0) {
      this.A(false);
      this.B(false);
      if (!this.dM().B) {
         $$0.r(this.dC());
         $$0.s(this.dE());
         $$0.n(this);
      }
   }

   @Override
   public boolean fd() {
      return super.fd() && this.bP() && this.i() || this.gF() || this.gG();
   }

   @Override
   public boolean o(cqk $$0) {
      return ci.a($$0);
   }

   private void s() {
      this.cp = 1;
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.cs != null) {
         for (int $$0 = 0; $$0 < this.cs.b(); $$0++) {
            cqk $$1 = this.cs.a($$0);
            if (!$$1.b() && !cuv.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void m_() {
      if (this.ag.a(200) == 0) {
         this.s();
      }

      super.m_();
      if (!this.dM().B && this.bA()) {
         if (this.ag.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gP()) {
            if (!this.gF() && !this.bP() && this.ag.a(300) == 0 && this.dM().a_(this.dm().d()).a(dac.i)) {
               this.A(true);
            }

            if (this.gF() && ++this.cG > 50) {
               this.cG = 0;
               this.A(false);
            }
         }

         this.gO();
      }
   }

   protected void gO() {
      if (this.gH() && this.o_() && !this.gF()) {
         bpo $$0 = this.dM().a(cdf.class, ch, this, this.dr(), this.dt(), this.dx(), this.cH().g(16.0));
         if ($$0 != null && this.g((bow)$$0) > 4.0) {
            this.bQ.a($$0, 0);
         }
      }
   }

   public boolean gP() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cH > 0 && ++this.cH > 30) {
         this.cH = 0;
         this.d(64, false);
      }

      if (this.cY() && this.cI > 0 && ++this.cI > 20) {
         this.cI = 0;
         this.B(false);
      }

      if (this.cp > 0 && ++this.cp > 8) {
         this.cp = 0;
      }

      if (this.cq > 0) {
         this.cq++;
         if (this.cq > 300) {
            this.cq = 0;
         }
      }

      this.cK = this.cJ;
      if (this.gF()) {
         this.cJ = this.cJ + (1.0F - this.cJ) * 0.4F + 0.05F;
         if (this.cJ > 1.0F) {
            this.cJ = 1.0F;
         }
      } else {
         this.cJ = this.cJ + ((0.0F - this.cJ) * 0.4F - 0.05F);
         if (this.cJ < 0.0F) {
            this.cJ = 0.0F;
         }
      }

      this.cM = this.cL;
      if (this.gG()) {
         this.cJ = 0.0F;
         this.cK = this.cJ;
         this.cL = this.cL + (1.0F - this.cL) * 0.4F + 0.05F;
         if (this.cL > 1.0F) {
            this.cL = 1.0F;
         }
      } else {
         this.cv = false;
         this.cL = this.cL + ((0.8F * this.cL * this.cL * this.cL - this.cL) * 0.6F - 0.05F);
         if (this.cL < 0.0F) {
            this.cL = 0.0F;
         }
      }

      this.cO = this.cN;
      if (this.u(64)) {
         this.cN = this.cN + (1.0F - this.cN) * 0.7F + 0.05F;
         if (this.cN > 1.0F) {
            this.cN = 1.0F;
         }
      } else {
         this.cN = this.cN + ((0.0F - this.cN) * 0.7F - 0.05F);
         if (this.cN < 0.0F) {
            this.cN = 0.0F;
         }
      }
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      if (this.bP() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gC() && $$0.fO()) {
         this.b($$0);
         return bnc.a(this.dM().B);
      } else {
         cqk $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bnc $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fQ() && this.l($$2) && !this.fR()) {
               this.b($$0, $$2);
               return bnc.a(this.dM().B);
            }
         }

         this.f($$0);
         return bnc.a(this.dM().B);
      }
   }

   private void gn() {
      if (!this.dM().B) {
         this.cH = 1;
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
   public atx gQ() {
      return this.v();
   }

   public void gR() {
      if (this.gt() && this.cY()) {
         this.cI = 1;
         this.B(true);
      }
   }

   public void gS() {
      if (!this.gG()) {
         this.gR();
         this.b(this.gL());
      }
   }

   public boolean h(cis $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof apg) {
         am.y.a((apg)$$0, this);
      }

      this.dM().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cis $$0, epr $$1) {
      super.a($$0, $$1);
      epq $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aX = this.aZ = this.dC();
      if (this.cX()) {
         if ($$1.e <= 0.0) {
            this.cx = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cu > 0.0F && !this.gE()) {
               this.b(this.cu, $$1);
            }

            this.cu = 0.0F;
         }
      }
   }

   protected epq j(bpo $$0) {
      return new epq($$0.dE() * 0.5F, $$0.dC());
   }

   @Override
   protected epr b(cis $$0, epr $$1) {
      if (this.aC() && this.cu == 0.0F && this.gG() && !this.cv) {
         return epr.b;
      } else {
         float $$2 = $$0.bn * 0.5F;
         float $$3 = $$0.bp;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new epr((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cis $$0) {
      return (float)this.g(bqv.r);
   }

   protected void b(float $$0, epr $$1) {
      double $$2 = (double)this.w($$0);
      epr $$3 = this.dp();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$4 = aww.a(this.dC() * (float) (Math.PI / 180.0));
         float $$5 = aww.b(this.dC() * (float) (Math.PI / 180.0));
         this.g(this.dp().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gT() {
      this.a(aty.mt, 0.4F, 1.0F);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gF());
      $$0.a("Bred", this.gH());
      $$0.a("Temper", this.gI());
      $$0.a("Tame", this.gC());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cs.a(0).b()) {
         $$0.a("SaddleItem", this.cs.a(0).b(new ta()));
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.v($$0.h("Temper"));
      this.x($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = ata.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cqk $$4 = cqk.a($$0.p("SaddleItem"));
         if ($$4.a(cqn.nK)) {
            this.cs.a(0, $$4);
         }
      }

      this.gK();
   }

   @Override
   public boolean a(cbd $$0) {
      return false;
   }

   protected boolean gU() {
      return !this.bP() && !this.bO() && this.gC() && !this.o_() && this.ex() >= this.eO() && this.gr();
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      return null;
   }

   protected void a(bor $$0, cdf $$1) {
      this.a($$0, $$1, bqv.q, (double)cc, (double)cd);
      this.a($$0, $$1, bqv.m, (double)ca, (double)cb);
      this.a($$0, $$1, bqv.r, (double)bX, (double)bY);
   }

   private void a(bor $$0, cdf $$1, il<bqq> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ag);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, axd $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = aww.a($$0, $$2, $$3);
         $$1 = aww.a($$1, $$2, $$3);
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

   public float G(float $$0) {
      return aww.i($$0, this.cK, this.cJ);
   }

   public float H(float $$0) {
      return aww.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return aww.i($$0, this.cO, this.cN);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cv = true;
            this.gR();
         }

         if ($$0 >= 90) {
            this.cu = 1.0F;
         } else {
            this.cu = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cv = true;
      this.gR();
      this.gT();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      ka $$1 = $$0 ? kc.P : kc.ac;

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
   protected void a(bow $$0, bow.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bpo) {
         ((bpo)$$0).aX = this.aX;
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
   public boolean p_() {
      return false;
   }

   @Override
   public bqf a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bqf() {
            @Override
            public cqk a() {
               return cdf.this.cs.a(0);
            }

            @Override
            public boolean a(cqk $$0) {
               if (!$$0.b() && !$$0.a(cqn.nK)) {
                  return false;
               } else {
                  cdf.this.cs.a(0, $$0);
                  cdf.this.gK();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cs.b() ? bqf.a(this.cs, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bpo cN() {
      if (this.i()) {
         bow var2 = this.cQ();
         if (var2 instanceof cis) {
            return (cis)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private epr a(epr $$0, bpo $$1) {
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dx() + $$0.e;
      ib.a $$5 = new ib.a();
      UnmodifiableIterator var10 = $$1.fF().iterator();

      while (var10.hasNext()) {
         bpz $$6 = (bpz)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dM().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cks.a($$8)) {
               epm $$9 = $$1.f($$6);
               epr $$10 = new epr($$2, (double)$$5.v() + $$8, $$4);
               if (cks.a(this.dM(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ih.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public epr b(bpo $$0) {
      epr $$1 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fr() == bpi.b ? 90.0F : -90.0F));
      epr $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         epr $$3 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fr() == bpi.a ? 90.0F : -90.0F));
         epr $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dk();
      }
   }

   protected void a(axd $$0) {
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      if ($$3 == null) {
         $$3 = new bor.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bmv $$0) {
      return this.cs != $$0;
   }

   public int gV() {
      return this.O();
   }

   @Override
   protected epr a(bow $$0, boz $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new epr(0.0, 0.15 * (double)this.cM * (double)$$2, -0.7 * (double)this.cM * (double)$$2).b(-this.dC() * (float) (Math.PI / 180.0)));
   }

   public final bmv gW() {
      return this.cQ;
   }
}
