import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cem extends cci implements boa, bqm, bra, brd, bri {
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
   private static final Predicate<bqt> cg = $$0 -> $$0 instanceof cem && ((cem)$$0).gH();
   private static final cbj ch = cbj.b().a(16.0).d().a(cg);
   private static final cvp ci = cvp.a(crv.pv, crv.rz, dcj.ij.p(), crv.os, crv.ui, crv.pZ, crv.qa);
   private static final aja<Byte> cz = aje.a(cem.class, ajc.a);
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
   protected boo cs;
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
   private final bny cQ = new etu() {
      @Override
      public crs f() {
         return cem.this.fP();
      }

      @Override
      public void a(crs $$0) {
         cem.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cka $$0) {
         return $$0.cZ() == cem.this || $$0.b(cem.this, 4.0);
      }
   };

   protected cem(bqg<? extends cem> $$0, czg $$1) {
      super($$0, $$1);
      this.gJ();
   }

   @Override
   protected void z() {
      this.bR.a(1, new byj(this, 1.2));
      this.bR.a(1, new byu(this, 1.2));
      this.bR.a(2, new bxc(this, 1.0, cem.class));
      this.bR.a(4, new bxp(this, 1.0));
      this.bR.a(6, new bzd(this, 0.7));
      this.bR.a(7, new bxy(this, cka.class, 6.0F));
      this.bR.a(8, new byl(this));
      if (this.gt()) {
         this.bR.a(9, new bym(this));
      }

      this.gD();
   }

   protected void gD() {
      this.bR.a(0, new bxk(this));
      this.bR.a(3, new byy(this, 1.25, cvp.a(crv.ui, crv.pZ, crv.qa), false));
   }

   @Override
   protected void a(aje.a $$0) {
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
   public UUID W_() {
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
   public void a(@Nullable aup $$0) {
      this.cs.a(0, new crs(crv.nK));
   }

   public void b(cka $$0, crs $$1) {
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
      int $$1 = axm.a(this.gI() + $$0, 0, this.gN());
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
         aun $$0 = this.gu();
         if ($$0 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, boy $$2) {
      if ($$0 > 1.0F) {
         this.a(auo.mA, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (bqa $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eK();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axm.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ab_() {
      return 1;
   }

   protected void gJ() {
      boo $$0 = this.cs;
      this.cs = new boo(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cs.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            crs $$3 = $$0.a($$2);
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
   public void a(bny $$0) {
      boolean $$1 = this.i();
      this.gK();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
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
   protected aun gu() {
      return null;
   }

   @Nullable
   protected aun gL() {
      return null;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      if (!$$1.k()) {
         dpi $$2 = this.dM().a_($$0.c());
         djt $$3 = $$1.w();
         if ($$2.a(dcj.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.cw) {
            this.cx++;
            if (this.cx > 5 && this.cx % 3 == 0) {
               this.a($$3);
            } else if (this.cx <= 5) {
               this.a(auo.mD, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(auo.mD, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(auo.mC, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(djt $$0) {
      return $$0 == djt.b || $$0 == djt.aT || $$0 == djt.B || $$0 == djt.aU || $$0 == djt.aS;
   }

   protected void a(djt $$0) {
      this.a(auo.mx, $$0.a() * 0.15F, $$0.b());
   }

   public static brz.a gM() {
      return bqv.A().a(bsa.m, 0.7).a(bsa.q, 53.0).a(bsa.r, 0.225F).a(bsa.v, 1.0);
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
   public void b(cka $$0) {
      if (!this.dM().B && (!this.bP() || this.x($$0)) && this.gC()) {
         $$0.a(this, this.cs);
      }
   }

   public bof c(cka $$0, crs $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dM().B) {
         return bof.b;
      } else {
         return $$2 ? bof.a : bof.d;
      }
   }

   protected boolean a(cka $$0, crs $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(crv.pv)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(crv.rz)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dcj.ij.p())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(crv.os)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(crv.ui)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dM().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(crv.pZ) || $$1.a(crv.qa)) {
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
         this.dM().a(kn.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         this.a(dub.m);
      }

      return $$2;
   }

   protected void f(cka $$0) {
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
   public boolean o(crs $$0) {
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
            crs $$1 = this.cs.a($$0);
            if (!$$1.d() && !cxa.g($$1)) {
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
            if (!this.gF() && !this.bP() && this.ag.a(300) == 0 && this.dM().a_(this.dm().d()).a(dcj.i)) {
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
         bqt $$0 = this.dM().a(cem.class, ch, this, this.dr(), this.dt(), this.dx(), this.cH().g(16.0));
         if ($$0 != null && this.g((bqa)$$0) > 4.0) {
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
   public bof b(cka $$0, boe $$1) {
      if (this.bP() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gC() && $$0.fO()) {
         this.b($$0);
         return bof.a(this.dM().B);
      } else {
         crs $$2 = $$0.b($$1);
         if (!$$2.d()) {
            bof $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fQ() && this.l($$2) && !this.fR()) {
               this.b($$0, $$2);
               return bof.a(this.dM().B);
            }
         }

         this.f($$0);
         return bof.a(this.dM().B);
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
   public aun gQ() {
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

   public boolean h(cka $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof apv) {
         am.y.a((apv)$$0, this);
      }

      this.dM().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cka $$0, esj $$1) {
      super.a($$0, $$1);
      esi $$2 = this.j($$0);
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

   protected esi j(bqt $$0) {
      return new esi($$0.dE() * 0.5F, $$0.dC());
   }

   @Override
   protected esj b(cka $$0, esj $$1) {
      if (this.aC() && this.cu == 0.0F && this.gG() && !this.cv) {
         return esj.b;
      } else {
         float $$2 = $$0.bn * 0.5F;
         float $$3 = $$0.bp;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new esj((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cka $$0) {
      return (float)this.g(bsa.r);
   }

   protected void b(float $$0, esj $$1) {
      double $$2 = (double)this.w($$0);
      esj $$3 = this.dp();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$4 = axm.a(this.dC() * (float) (Math.PI / 180.0));
         float $$5 = axm.b(this.dC() * (float) (Math.PI / 180.0));
         this.g(this.dp().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gT() {
      this.a(auo.mz, 0.4F, 1.0F);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gF());
      $$0.a("Bred", this.gH());
      $$0.a("Temper", this.gI());
      $$0.a("Tame", this.gC());
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      if (!this.cs.a(0).d()) {
         $$0.a("SaddleItem", this.cs.a(0).a(this.dO()));
      }
   }

   @Override
   public void a(to $$0) {
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
         $$1 = atq.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         crs $$4 = crs.a(this.dO(), (ul)$$0.p("SaddleItem")).orElse(crs.i);
         if ($$4.a(crv.nK)) {
            this.cs.a(0, $$4);
         }
      }

      this.gK();
   }

   @Override
   public boolean a(cci $$0) {
      return false;
   }

   protected boolean gU() {
      return !this.bP() && !this.bO() && this.gC() && !this.p_() && this.ex() >= this.eO() && this.gr();
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      return null;
   }

   protected void a(bpu $$0, cem $$1) {
      this.a($$0, $$1, bsa.q, (double)cc, (double)cd);
      this.a($$0, $$1, bsa.m, (double)ca, (double)cb);
      this.a($$0, $$1, bsa.r, (double)bX, (double)bY);
   }

   private void a(bpu $$0, cem $$1, in<brv> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ag);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, axt $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = axm.a($$0, $$2, $$3);
         $$1 = axm.a($$1, $$2, $$3);
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
      return axm.i($$0, this.cK, this.cJ);
   }

   public float H(float $$0) {
      return axm.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return axm.i($$0, this.cO, this.cN);
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
      kl $$1 = $$0 ? kn.P : kn.ac;

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
   protected void a(bqa $$0, bqa.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bqt) {
         ((bqt)$$0).aX = this.aX;
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
   public brk a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new brk() {
            @Override
            public crs a() {
               return cem.this.cs.a(0);
            }

            @Override
            public boolean a(crs $$0) {
               if (!$$0.d() && !$$0.a(crv.nK)) {
                  return false;
               } else {
                  cem.this.cs.a(0, $$0);
                  cem.this.gK();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cs.b() ? brk.a(this.cs, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bqt cN() {
      if (this.i()) {
         bqa var2 = this.cQ();
         if (var2 instanceof cka) {
            return (cka)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private esj a(esj $$0, bqt $$1) {
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dx() + $$0.e;
      id.a $$5 = new id.a();
      UnmodifiableIterator var10 = $$1.fF().iterator();

      while (var10.hasNext()) {
         bre $$6 = (bre)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dM().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cma.a($$8)) {
               ese $$9 = $$1.f($$6);
               esj $$10 = new esj($$2, (double)$$5.v() + $$8, $$4);
               if (cma.a(this.dM(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ij.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public esj b(bqt $$0) {
      esj $$1 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fr() == bqn.b ? 90.0F : -90.0F));
      esj $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         esj $$3 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fr() == bqn.a ? 90.0F : -90.0F));
         esj $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dk();
      }
   }

   protected void a(axt $$0) {
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$3 == null) {
         $$3 = new bpu.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bny $$0) {
      return this.cs != $$0;
   }

   public int gV() {
      return this.O();
   }

   @Override
   protected esj a(bqa $$0, bqd $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new esj(0.0, 0.15 * (double)this.cM * (double)$$2, -0.7 * (double)this.cM * (double)$$2).b(-this.dC() * (float) (Math.PI / 180.0)));
   }

   public final bny gW() {
      return this.cQ;
   }
}
