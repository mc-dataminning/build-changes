import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cef extends ccd implements bnv, bqh, bqv, bqy, brd {
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
   private static final Predicate<bqo> cg = $$0 -> $$0 instanceof cef && ((cef)$$0).gH();
   private static final cbe ch = cbe.b().a(16.0).d().a(cg);
   private static final cvg ci = cvg.a(crm.pv, crm.rz, dca.ij.p(), crm.os, crm.ui, crm.pZ, crm.qa);
   private static final aiy<Byte> cz = ajc.a(cef.class, aja.a);
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
   protected boj cs;
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
   private final bnt cQ = new etl() {
      @Override
      public crj f() {
         return cef.this.fP();
      }

      @Override
      public void a(crj $$0) {
         cef.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cjt $$0) {
         return $$0.cZ() == cef.this || $$0.b(cef.this, 4.0);
      }
   };

   protected cef(bqb<? extends cef> $$0, cyx $$1) {
      super($$0, $$1);
      this.gJ();
   }

   @Override
   protected void z() {
      this.bR.a(1, new bye(this, 1.2));
      this.bR.a(1, new byp(this, 1.2));
      this.bR.a(2, new bwx(this, 1.0, cef.class));
      this.bR.a(4, new bxk(this, 1.0));
      this.bR.a(6, new byy(this, 0.7));
      this.bR.a(7, new bxt(this, cjt.class, 6.0F));
      this.bR.a(8, new byg(this));
      if (this.gt()) {
         this.bR.a(9, new byh(this));
      }

      this.gD();
   }

   protected void gD() {
      this.bR.a(0, new bxf(this));
      this.bR.a(3, new byt(this, 1.25, cvg.a(crm.ui, crm.pZ, crm.qa), false));
   }

   @Override
   protected void a(ajc.a $$0) {
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
      return this.bA() && !this.p_() && this.gC();
   }

   @Override
   public void a(@Nullable aun $$0) {
      this.cs.a(0, new crj(crm.nK));
   }

   public void b(cjt $$0, crj $$1) {
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
      int $$1 = axk.a(this.gI() + $$0, 0, this.gN());
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
         aul $$0 = this.gu();
         if ($$0 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bot $$2) {
      if ($$0 > 1.0F) {
         this.a(aum.mA, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (bpv $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eK();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axk.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int aa_() {
      return 1;
   }

   protected void gJ() {
      boj $$0 = this.cs;
      this.cs = new boj(this.aa_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cs.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            crj $$3 = $$0.a($$2);
            if (!$$3.d()) {
               this.cs.a($$2, $$3.r());
            }
         }
      }

      this.cs.a(this);
      this.gK();
   }

   protected void gK() {
      if (!this.dM().B) {
         this.d(4, !this.cs.a(0).d());
      }
   }

   @Override
   public void a(bnt $$0) {
      boolean $$1 = this.i();
      this.gK();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.X_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
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
   protected aul gu() {
      return null;
   }

   @Nullable
   protected aul gL() {
      return null;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      if (!$$1.k()) {
         doz $$2 = this.dM().a_($$0.c());
         djk $$3 = $$1.w();
         if ($$2.a(dca.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.cw) {
            this.cx++;
            if (this.cx > 5 && this.cx % 3 == 0) {
               this.a($$3);
            } else if (this.cx <= 5) {
               this.a(aum.mD, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(aum.mD, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(aum.mC, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(djk $$0) {
      return $$0 == djk.b || $$0 == djk.aT || $$0 == djk.B || $$0 == djk.aU || $$0 == djk.aS;
   }

   protected void a(djk $$0) {
      this.a(aum.mx, $$0.a() * 0.15F, $$0.b());
   }

   public static bru.a gM() {
      return bqq.A().a(brv.m, 0.7).a(brv.q, 53.0).a(brv.r, 0.225F).a(brv.v, 1.0);
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
   public void b(cjt $$0) {
      if (!this.dM().B && (!this.bP() || this.x($$0)) && this.gC()) {
         $$0.a(this, this.cs);
      }
   }

   public boa c(cjt $$0, crj $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dM().B) {
         return boa.b;
      } else {
         return $$2 ? boa.a : boa.d;
      }
   }

   protected boolean a(cjt $$0, crj $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(crm.pv)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(crm.rz)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dca.ij.p())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(crm.os)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(crm.ui)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dM().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(crm.pZ) || $$1.a(crm.qa)) {
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

      if (this.p_() && $$4 > 0) {
         this.dM().a(kl.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         this.a(dts.m);
      }

      return $$2;
   }

   protected void f(cjt $$0) {
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
   public boolean o(crj $$0) {
      return ci.a($$0);
   }

   private void u() {
      this.cp = 1;
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.cs != null) {
         for (int $$0 = 0; $$0 < this.cs.b(); $$0++) {
            crj $$1 = this.cs.a($$0);
            if (!$$1.d() && !cwr.f($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void n_() {
      if (this.ag.a(200) == 0) {
         this.u();
      }

      super.n_();
      if (!this.dM().B && this.bA()) {
         if (this.ag.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gP()) {
            if (!this.gF() && !this.bP() && this.ag.a(300) == 0 && this.dM().a_(this.dm().d()).a(dca.i)) {
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
      if (this.gH() && this.p_() && !this.gF()) {
         bqo $$0 = this.dM().a(cef.class, ch, this, this.dr(), this.dt(), this.dx(), this.cH().g(16.0));
         if ($$0 != null && this.g((bpv)$$0) > 4.0) {
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
   public boa b(cjt $$0, bnz $$1) {
      if (this.bP() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gC() && $$0.fO()) {
         this.b($$0);
         return boa.a(this.dM().B);
      } else {
         crj $$2 = $$0.b($$1);
         if (!$$2.d()) {
            boa $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fQ() && this.l($$2) && !this.fR()) {
               this.b($$0, $$2);
               return boa.a(this.dM().B);
            }
         }

         this.f($$0);
         return boa.a(this.dM().B);
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
   public aul gQ() {
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

   public boolean h(cjt $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof apt) {
         am.y.a((apt)$$0, this);
      }

      this.dM().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cjt $$0, esa $$1) {
      super.a($$0, $$1);
      erz $$2 = this.j($$0);
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

   protected erz j(bqo $$0) {
      return new erz($$0.dE() * 0.5F, $$0.dC());
   }

   @Override
   protected esa b(cjt $$0, esa $$1) {
      if (this.aC() && this.cu == 0.0F && this.gG() && !this.cv) {
         return esa.b;
      } else {
         float $$2 = $$0.bn * 0.5F;
         float $$3 = $$0.bp;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new esa((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cjt $$0) {
      return (float)this.g(brv.r);
   }

   protected void b(float $$0, esa $$1) {
      double $$2 = (double)this.w($$0);
      esa $$3 = this.dp();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$4 = axk.a(this.dC() * (float) (Math.PI / 180.0));
         float $$5 = axk.b(this.dC() * (float) (Math.PI / 180.0));
         this.g(this.dp().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gT() {
      this.a(aum.mz, 0.4F, 1.0F);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gF());
      $$0.a("Bred", this.gH());
      $$0.a("Temper", this.gI());
      $$0.a("Tame", this.gC());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cs.a(0).d()) {
         $$0.a("SaddleItem", this.cs.a(0).a(this.dO()));
      }
   }

   @Override
   public void a(tm $$0) {
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
         $$1 = ato.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         crj $$4 = crj.a(this.dO(), (uj)$$0.p("SaddleItem")).orElse(crj.i);
         if ($$4.a(crm.nK)) {
            this.cs.a(0, $$4);
         }
      }

      this.gK();
   }

   @Override
   public boolean a(ccd $$0) {
      return false;
   }

   protected boolean gU() {
      return !this.bP() && !this.bO() && this.gC() && !this.p_() && this.ex() >= this.eO() && this.gr();
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      return null;
   }

   protected void a(bpp $$0, cef $$1) {
      this.a($$0, $$1, brv.q, (double)cc, (double)cd);
      this.a($$0, $$1, brv.m, (double)ca, (double)cb);
      this.a($$0, $$1, brv.r, (double)bX, (double)bY);
   }

   private void a(bpp $$0, cef $$1, il<brq> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ag);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, axr $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = axk.a($$0, $$2, $$3);
         $$1 = axk.a($$1, $$2, $$3);
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
      return axk.i($$0, this.cK, this.cJ);
   }

   public float H(float $$0) {
      return axk.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return axk.i($$0, this.cO, this.cN);
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
      kj $$1 = $$0 ? kl.P : kl.ac;

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
   protected void a(bpv $$0, bpv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bqo) {
         ((bqo)$$0).aX = this.aX;
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
   public boolean q_() {
      return false;
   }

   @Override
   public brf a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new brf() {
            @Override
            public crj a() {
               return cef.this.cs.a(0);
            }

            @Override
            public boolean a(crj $$0) {
               if (!$$0.d() && !$$0.a(crm.nK)) {
                  return false;
               } else {
                  cef.this.cs.a(0, $$0);
                  cef.this.gK();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cs.b() ? brf.a(this.cs, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bqo cN() {
      if (this.i()) {
         bpv var2 = this.cQ();
         if (var2 instanceof cjt) {
            return (cjt)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private esa a(esa $$0, bqo $$1) {
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dx() + $$0.e;
      ib.a $$5 = new ib.a();
      UnmodifiableIterator var10 = $$1.fF().iterator();

      while (var10.hasNext()) {
         bqz $$6 = (bqz)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dM().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (clt.a($$8)) {
               erv $$9 = $$1.f($$6);
               esa $$10 = new esa($$2, (double)$$5.v() + $$8, $$4);
               if (clt.a(this.dM(), $$1, $$9.c($$10))) {
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
   public esa b(bqo $$0) {
      esa $$1 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fr() == bqi.b ? 90.0F : -90.0F));
      esa $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         esa $$3 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fr() == bqi.a ? 90.0F : -90.0F));
         esa $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dk();
      }
   }

   protected void a(axr $$0) {
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$3 == null) {
         $$3 = new bpp.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bnt $$0) {
      return this.cs != $$0;
   }

   public int gV() {
      return this.O();
   }

   @Override
   protected esa a(bpv $$0, bpy $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new esa(0.0, 0.15 * (double)this.cM * (double)$$2, -0.7 * (double)this.cM * (double)$$2).b(-this.dC() * (float) (Math.PI / 180.0)));
   }

   public final bnt gW() {
      return this.cQ;
   }
}
