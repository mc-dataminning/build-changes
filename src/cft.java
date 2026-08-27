import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cft extends cdp implements bph, brt, bsh, bsk, bsp {
   public static final int cj = 400;
   public static final int ck = 499;
   public static final int cl = 500;
   public static final double cm = 0.15;
   private static final float bY = (float)b(() -> 0.0);
   private static final float bZ = (float)b(() -> 1.0);
   private static final float cb = (float)a(() -> 0.0);
   private static final float cc = (float)a(() -> 1.0);
   private static final float cd = a($$0 -> 0);
   private static final float ce = a($$0 -> $$0 - 1);
   private static final float cf = 0.25F;
   private static final float cg = 0.5F;
   private static final Predicate<bsa> ch = $$0 -> $$0 instanceof cft && ((cft)$$0).gJ();
   private static final ccq ci = ccq.b().a(16.0).d().a(ch);
   private static final ajm<Byte> cy = ajq.a(cft.class, ajo.a);
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
   protected bpv cs;
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
   private final bpf cQ = new eva() {
      @Override
      public csz f() {
         return cft.this.fQ();
      }

      @Override
      public void b(csz $$0) {
         cft.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(clh $$0) {
         return $$0.da() == cft.this || $$0.b(cft.this, 4.0);
      }
   };

   protected cft(brn<? extends cft> $$0, dad $$1) {
      super($$0, $$1);
      this.gL();
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzq(this, 1.2));
      this.bS.a(1, new cab(this, 1.2));
      this.bS.a(2, new byj(this, 1.0, cft.class));
      this.bS.a(4, new byw(this, 1.0));
      this.bS.a(6, new cak(this, 0.7));
      this.bS.a(7, new bzf(this, clh.class, 6.0F));
      this.bS.a(8, new bzs(this));
      if (this.gv()) {
         this.bS.a(9, new bzt(this));
      }

      this.gF();
   }

   protected void gF() {
      this.bS.a(0, new byr(this));
      this.bS.a(3, new caf(this, 1.25, $$0 -> $$0.a(avz.ag), false));
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cy, (byte)0);
   }

   protected boolean u(int $$0) {
      return (this.ao.a(cy) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(cy);
      if ($$1) {
         this.ao.a(cy, (byte)($$2 | $$0));
      } else {
         this.ao.a(cy, (byte)($$2 & ~$$0));
      }
   }

   public boolean gE() {
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

   public boolean gG() {
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
      if ($$0 > 6.0F && this.gH()) {
         this.A(false);
      }
   }

   public boolean gH() {
      return this.u(16);
   }

   public boolean gI() {
      return this.u(32);
   }

   public boolean gJ() {
      return this.u(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bB() && !this.p_() && this.gE();
   }

   @Override
   public void a(@Nullable avd $$0) {
      this.cs.a(0, new csz(ctc.nL));
   }

   public void b(clh $$0, csz $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.u(4);
   }

   public int gK() {
      return this.ct;
   }

   public void v(int $$0) {
      this.ct = $$0;
   }

   public int w(int $$0) {
      int $$1 = axz.a(this.gK() + $$0, 0, this.gP());
      this.v($$1);
      return $$1;
   }

   @Override
   public boolean by() {
      return !this.bQ();
   }

   private void r() {
      this.gp();
      if (!this.aU()) {
         avb $$0 = this.gw();
         if ($$0 != null) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), $$0, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqf $$2) {
      if ($$0 > 1.0F) {
         this.a(avc.mF, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bQ()) {
            for (brh $$4 : this.cU()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eL();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axz.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ab_() {
      return 1;
   }

   protected void gL() {
      bpv $$0 = this.cs;
      this.cs = new bpv(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cs.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            csz $$3 = $$0.a($$2);
            if (!$$3.d()) {
               this.cs.a($$2, $$3.r());
            }
         }
      }

      this.cs.a(this);
      this.gM();
   }

   protected void gM() {
      if (!this.dN().B) {
         this.d(4, !this.cs.a(0).d());
      }
   }

   @Override
   public void a(bpf $$0) {
      boolean $$1 = this.i();
      this.gM();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ah.a(3) == 0) {
         this.gT();
      }

      return $$2;
   }

   protected boolean gv() {
      return true;
   }

   @Nullable
   protected avb gw() {
      return null;
   }

   @Nullable
   protected avb gN() {
      return null;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      if (!$$1.k()) {
         dqh $$2 = this.dN().a_($$0.c());
         dkr $$3 = $$1.w();
         if ($$2.a(ddg.dN)) {
            $$3 = $$2.w();
         }

         if (this.bQ() && this.cw) {
            this.cx++;
            if (this.cx > 5 && this.cx % 3 == 0) {
               this.a($$3);
            } else if (this.cx <= 5) {
               this.a(avc.mI, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avc.mI, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avc.mH, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dkr $$0) {
      return $$0 == dkr.b || $$0 == dkr.aT || $$0 == dkr.B || $$0 == dkr.aU || $$0 == dkr.aS;
   }

   protected void a(dkr $$0) {
      this.a(avc.mC, $$0.a() * 0.15F, $$0.b());
   }

   public static btg.a gO() {
      return bsc.A().a(bth.m, 0.7).a(bth.q, 53.0).a(bth.r, 0.225F).a(bth.v, 1.0);
   }

   @Override
   public int fP() {
      return 6;
   }

   public int gP() {
      return 100;
   }

   @Override
   protected float fc() {
      return 0.8F;
   }

   @Override
   public int O() {
      return 400;
   }

   @Override
   public void b(clh $$0) {
      if (!this.dN().B && (!this.bQ() || this.x($$0)) && this.gE()) {
         $$0.a(this, this.cs);
      }
   }

   public bpm c(clh $$0, csz $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dN().B) {
         return bpm.b;
      } else {
         return $$2 ? bpm.a : bpm.d;
      }
   }

   protected boolean a(clh $$0, csz $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(ctc.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(ctc.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(ddg.ij.q())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(ctc.ot)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(ctc.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dN().B && this.gE() && this.g() == 0 && !this.gt()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(ctc.qa) || $$1.a(ctc.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dN().B && this.gE() && this.g() == 0 && !this.gt()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ey() < this.eP() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dN().a(kx.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dN().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gE()) && this.gK() < this.gP() && !this.dN().B) {
         this.w($$5);
         $$2 = true;
      }

      if ($$2) {
         this.r();
         this.a(dva.m);
      }

      return $$2;
   }

   protected void f(clh $$0) {
      this.A(false);
      this.B(false);
      if (!this.dN().B) {
         $$0.r(this.dD());
         $$0.s(this.dF());
         $$0.n(this);
      }
   }

   @Override
   public boolean fe() {
      return super.fe() && this.bQ() && this.i() || this.gH() || this.gI();
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.af);
   }

   private void u() {
      this.cp = 1;
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.cs != null) {
         for (int $$0 = 0; $$0 < this.cs.b(); $$0++) {
            csz $$1 = this.cs.a($$0);
            if (!$$1.d() && !cyh.g($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void n_() {
      if (this.ah.a(200) == 0) {
         this.u();
      }

      super.n_();
      if (!this.dN().B && this.bB()) {
         if (this.ah.a(900) == 0 && this.aR == 0) {
            this.c(1.0F);
         }

         if (this.gR()) {
            if (!this.gH() && !this.bQ() && this.ah.a(300) == 0 && this.dN().a_(this.dn().d()).a(ddg.i)) {
               this.A(true);
            }

            if (this.gH() && ++this.cG > 50) {
               this.cG = 0;
               this.A(false);
            }
         }

         this.gQ();
      }
   }

   protected void gQ() {
      if (this.gJ() && this.p_() && !this.gH()) {
         bsa $$0 = this.dN().a(cft.class, ci, this, this.ds(), this.du(), this.dy(), this.cI().g(16.0));
         if ($$0 != null && this.g((brh)$$0) > 4.0) {
            this.bR.a($$0, 0);
         }
      }
   }

   public boolean gR() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cH > 0 && ++this.cH > 30) {
         this.cH = 0;
         this.d(64, false);
      }

      if (this.cZ() && this.cI > 0 && ++this.cI > 20) {
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
      if (this.gH()) {
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
      if (this.gI()) {
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
   public bpm b(clh $$0, bpl $$1) {
      if (this.bQ() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gE() && $$0.fP()) {
         this.b($$0);
         return bpm.a(this.dN().B);
      } else {
         csz $$2 = $$0.b($$1);
         if (!$$2.d()) {
            bpm $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fR() && this.l($$2) && !this.fS()) {
               this.b($$0, $$2);
               return bpm.a(this.dN().B);
            }
         }

         this.f($$0);
         return bpm.a(this.dN().B);
      }
   }

   private void gp() {
      if (!this.dN().B) {
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
   public avb gS() {
      return this.v();
   }

   public void gT() {
      if (this.gv() && this.cZ()) {
         this.cI = 1;
         this.B(true);
      }
   }

   public void gU() {
      if (!this.gI()) {
         this.gT();
         this.b(this.gN());
      }
   }

   public boolean h(clh $$0) {
      this.b($$0.cx());
      this.x(true);
      if ($$0 instanceof aqi) {
         am.y.a((aqi)$$0, this);
      }

      this.dN().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(clh $$0, etp $$1) {
      super.a($$0, $$1);
      eto $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aZ = this.bb = this.dD();
      if (this.cY()) {
         if ($$1.e <= 0.0) {
            this.cx = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cu > 0.0F && !this.gG()) {
               this.b(this.cu, $$1);
            }

            this.cu = 0.0F;
         }
      }
   }

   protected eto j(bsa $$0) {
      return new eto($$0.dF() * 0.5F, $$0.dD());
   }

   @Override
   protected etp b(clh $$0, etp $$1) {
      if (this.aC() && this.cu == 0.0F && this.gI() && !this.cv) {
         return etp.b;
      } else {
         float $$2 = $$0.bp * 0.5F;
         float $$3 = $$0.br;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new etp((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(clh $$0) {
      return (float)this.g(bth.r);
   }

   protected void b(float $$0, etp $$1) {
      double $$2 = (double)this.w($$0);
      etp $$3 = this.dq();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = axz.a(this.dD() * (float) (Math.PI / 180.0));
         float $$5 = axz.b(this.dD() * (float) (Math.PI / 180.0));
         this.g(this.dq().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gV() {
      this.a(avc.mE, 0.4F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gH());
      $$0.a("Bred", this.gJ());
      $$0.a("Temper", this.gK());
      $$0.a("Tame", this.gE());
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      if (!this.cs.a(0).d()) {
         $$0.a("SaddleItem", this.cs.a(0).a(this.dP()));
      }
   }

   @Override
   public void a(ua $$0) {
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
         $$1 = aud.a(this.cM(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         csz $$4 = csz.a(this.dP(), (ux)$$0.p("SaddleItem")).orElse(csz.i);
         if ($$4.a(ctc.nL)) {
            this.cs.a(0, $$4);
         }
      }

      this.gM();
   }

   @Override
   public boolean a(cdp $$0) {
      return false;
   }

   protected boolean gW() {
      return !this.bQ() && !this.bP() && this.gE() && !this.p_() && this.ey() >= this.eP() && this.gt();
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return null;
   }

   protected void a(brb $$0, cft $$1) {
      this.a($$0, $$1, bth.q, (double)cd, (double)ce);
      this.a($$0, $$1, bth.m, (double)cb, (double)cc);
      this.a($$0, $$1, bth.r, (double)bY, (double)bZ);
   }

   private void a(brb $$0, cft $$1, iw<btc> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ayg $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = axz.a($$0, $$2, $$3);
         $$1 = axz.a($$1, $$2, $$3);
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
      return axz.i($$0, this.cK, this.cJ);
   }

   public float H(float $$0) {
      return axz.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return axz.i($$0, this.cO, this.cN);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cv = true;
            this.gT();
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
      this.gT();
      this.gV();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      kv $$1 = $$0 ? kx.O : kx.ab;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
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
   protected void a(brh $$0, brh.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bsa) {
         ((bsa)$$0).aZ = this.aZ;
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
   public bsr a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bsr() {
            @Override
            public csz a() {
               return cft.this.cs.a(0);
            }

            @Override
            public boolean a(csz $$0) {
               if (!$$0.d() && !$$0.a(ctc.nL)) {
                  return false;
               } else {
                  cft.this.cs.a(0, $$0);
                  cft.this.gM();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cs.b() ? bsr.a(this.cs, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bsa cO() {
      if (this.i()) {
         brh var2 = this.cR();
         if (var2 instanceof clh) {
            return (clh)var2;
         }
      }

      return super.cO();
   }

   @Nullable
   private etp a(etp $$0, bsa $$1) {
      double $$2 = this.ds() + $$0.c;
      double $$3 = this.cI().b;
      double $$4 = this.dy() + $$0.e;
      in.a $$5 = new in.a();
      UnmodifiableIterator var10 = $$1.fG().iterator();

      while (var10.hasNext()) {
         bsl $$6 = (bsl)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cI().e + 0.75;

         do {
            double $$8 = this.dN().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cnh.a($$8)) {
               etk $$9 = $$1.f($$6);
               etp $$10 = new etp($$2, (double)$$5.v() + $$8, $$4);
               if (cnh.a(this.dN(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(is.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public etp b(bsa $$0) {
      etp $$1 = a((double)this.dh(), (double)$$0.dh(), this.dD() + ($$0.fs() == bru.b ? 90.0F : -90.0F));
      etp $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         etp $$3 = a((double)this.dh(), (double)$$0.dh(), this.dD() + ($$0.fs() == bru.a ? 90.0F : -90.0F));
         etp $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dl();
      }
   }

   protected void a(ayg $$0) {
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      if ($$3 == null) {
         $$3 = new brb.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bpf $$0) {
      return this.cs != $$0;
   }

   public int gX() {
      return this.O();
   }

   @Override
   protected etp a(brh $$0, brk $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new etp(0.0, 0.15 * (double)this.cM * (double)$$2, -0.7 * (double)this.cM * (double)$$2).b(-this.dD() * (float) (Math.PI / 180.0)));
   }

   public final bpf gY() {
      return this.cQ;
   }
}
