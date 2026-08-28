import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class civ extends cgr implements bry, but, bvh, bvk, bvq {
   public static final int cj = 400;
   public static final int ck = 499;
   public static final int cl = 500;
   public static final double cm = 0.15;
   private static final float bY = (float)b(() -> 0.0);
   private static final float bZ = (float)b(() -> 1.0);
   private static final float ca = (float)a(() -> 0.0);
   private static final float cc = (float)a(() -> 1.0);
   private static final float cd = a($$0 -> 0);
   private static final float ce = a($$0 -> $$0 - 1);
   private static final float cf = 0.25F;
   private static final float cg = 0.5F;
   private static final Predicate<bva> ch = $$0 -> $$0 instanceof civ && ((civ)$$0).gQ();
   private static final cfr ci = cfr.b().a(16.0).d().a(ch);
   private static final akl<Byte> cA = akp.a(civ.class, akn.a);
   private static final int cB = 2;
   private static final int cC = 4;
   private static final int cD = 8;
   private static final int cE = 16;
   private static final int cF = 32;
   private static final int cG = 64;
   public static final int cn = 0;
   public static final int co = 1;
   public static final int cp = 3;
   private int cH;
   private int cI;
   private int cJ;
   public int cq;
   public int cr;
   protected boolean cs;
   protected bsk ct;
   protected int cu;
   protected float cv;
   protected boolean cw;
   private float cK;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   private float cP;
   protected boolean cx = true;
   protected int cy;
   @Nullable
   private UUID cQ;
   private final brw cR = new faz() {
      @Override
      public cwb f() {
         return civ.this.ak();
      }

      @Override
      public void b(cwb $$0) {
         civ.this.j($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(com $$0) {
         return $$0.dl() == civ.this || $$0.b(civ.this, 4.0);
      }
   };

   protected civ(bul<? extends civ> $$0, dfb $$1) {
      super($$0, $$1);
      this.gT();
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccr(this, 1.2));
      this.bS.a(1, new cdc(this, 1.2));
      this.bS.a(2, new cbk(this, 1.0, civ.class));
      this.bS.a(4, new cbx(this, 1.0));
      this.bS.a(6, new cdl(this, 0.7));
      this.bS.a(7, new ccg(this, com.class, 6.0F));
      this.bS.a(8, new cct(this));
      if (this.gv()) {
         this.bS.a(9, new ccu(this));
      }

      this.gM();
   }

   protected void gM() {
      this.bS.a(0, new cbs(this));
      this.bS.a(3, new cdg(this, 1.25, $$0 -> $$0.a(axj.aj), false));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cA, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.am.a(cA) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.am.a(cA);
      if ($$1) {
         this.am.a(cA, (byte)($$2 | $$0));
      } else {
         this.am.a(cA, (byte)($$2 & ~$$0));
      }
   }

   public boolean gL() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID ab_() {
      return this.cQ;
   }

   public void b(@Nullable UUID $$0) {
      this.cQ = $$0;
   }

   public boolean gN() {
      return this.cs;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   public void z(boolean $$0) {
      this.cs = $$0;
   }

   @Override
   public boolean a(bue $$0, float $$1) {
      if ($$1 > 6.0F && this.gO()) {
         this.B(false);
      }

      return true;
   }

   public boolean gO() {
      return this.t(16);
   }

   public boolean gP() {
      return this.t(32);
   }

   public boolean gQ() {
      return this.t(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bM() && !this.p_() && this.gL();
   }

   @Override
   public void a(cwb $$0, @Nullable awm $$1) {
      this.ct.a(0, $$0);
   }

   public void b(com $$0, cwb $$1) {
      if (this.a($$1, bum.g)) {
         this.j($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bum $$0) {
      return $$0 == bum.g && this.gL() || super.f($$0);
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gR() {
      return this.cu;
   }

   public void u(int $$0) {
      this.cu = $$0;
   }

   public int v(int $$0) {
      int $$1 = azk.a(this.gR() + $$0, 0, this.gX());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bJ() {
      return !this.cb();
   }

   private void q() {
      this.y();
      if (!this.bc()) {
         awk $$0 = this.gw();
         if ($$0 != null) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), $$0, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      if ($$0 > 1.0F) {
         this.a(awl.mO, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.cb()) {
            for (bue $$4 : this.de()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eR();
         return true;
      }
   }

   public final int gS() {
      return w(this.ag_());
   }

   public static int w(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gT() {
      bsk $$0 = this.ct;
      this.ct = new bsk(this.gS());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ct.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cwb $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ct.a($$2, $$3.v());
            }
         }
      }

      this.ct.a(this);
      this.gU();
   }

   protected void gU() {
      if (!this.dX().C) {
         this.d(4, !this.ct.a(0).f());
      }
   }

   @Override
   public void a(brw $$0) {
      boolean $$1 = this.i();
      this.gU();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.ad_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.af.a(3) == 0) {
         this.hb();
      }

      return $$2;
   }

   protected boolean gv() {
      return true;
   }

   @Nullable
   protected awk gw() {
      return null;
   }

   @Nullable
   protected awk gV() {
      return null;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      if (!$$1.n()) {
         dvj $$2 = this.dX().a_($$0.d());
         dpr $$3 = $$1.A();
         if ($$2.a(dig.dN)) {
            $$3 = $$2.A();
         }

         if (this.cb() && this.cx) {
            this.cy++;
            if (this.cy > 5 && this.cy % 3 == 0) {
               this.a($$3);
            } else if (this.cy <= 5) {
               this.a(awl.mR, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awl.mR, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awl.mQ, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dpr $$0) {
      return $$0 == dpr.b || $$0 == dpr.aT || $$0 == dpr.B || $$0 == dpr.aU || $$0 == dpr.aS;
   }

   protected void a(dpr $$0) {
      this.a(awl.mL, $$0.a() * 0.15F, $$0.b());
   }

   public static bwh.a gW() {
      return cgr.gz().a(bwi.o, 0.7).a(bwi.s, 53.0).a(bwi.v, 0.225F).a(bwi.B, 1.0).a(bwi.x, 6.0).a(bwi.k, 0.5);
   }

   @Override
   public int aj() {
      return 6;
   }

   public int gX() {
      return 100;
   }

   @Override
   protected float fi() {
      return 0.8F;
   }

   @Override
   public int T() {
      return 400;
   }

   @Override
   public void b(com $$0) {
      if (!this.dX().C && (!this.cb() || this.y($$0)) && this.gL()) {
         $$0.a(this, this.ct);
      }
   }

   public bsd c(com $$0, cwb $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bsd)(!$$2 && !this.dX().C ? bsd.e : bsd.b);
   }

   protected boolean a(com $$0, cwb $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cwf.px)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cwf.rB)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dig.ij.j())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cwf.ov)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cwf.um)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dX().C && this.gL() && this.g() == 0 && !this.gE()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cwf.qb) || $$1.a(cwf.qc)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dX().C && this.gL() && this.g() == 0 && !this.gE()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eG() < this.eV() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dX().a(lr.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dX().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gL()) && this.gR() < this.gX() && !this.dX().C) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(eag.m);
      }

      return $$2;
   }

   protected void a(com $$0) {
      this.B(false);
      this.C(false);
      if (!this.dX().C) {
         $$0.v(this.dN());
         $$0.w(this.dP());
         $$0.n(this);
      }
   }

   @Override
   public boolean fk() {
      return super.fk() && this.cb() && this.i() || this.gO() || this.gP();
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ai);
   }

   private void t() {
      this.cq = 1;
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.ct != null) {
         for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
            cwb $$1 = this.ct.a($$0);
            if (!$$1.f() && !dbu.a($$1, dbt.D)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void n_() {
      if (this.af.a(200) == 0) {
         this.t();
      }

      super.n_();
      if (!this.dX().C && this.bM()) {
         if (this.af.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gZ()) {
            if (!this.gO() && !this.cb() && this.af.a(300) == 0 && this.dX().a_(this.dx().e()).a(dig.i)) {
               this.B(true);
            }

            if (this.gO() && ++this.cH > 50) {
               this.cH = 0;
               this.B(false);
            }
         }

         this.gY();
      }
   }

   protected void gY() {
      if (this.gQ() && this.p_() && !this.gO()) {
         bva $$0 = this.dX().a(civ.class, ci, this, this.dC(), this.dE(), this.dI(), this.cS().g(16.0));
         if ($$0 != null && this.g($$0) > 4.0) {
            this.bR.a($$0, 0);
         }
      }
   }

   public boolean gZ() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cI > 0 && ++this.cI > 30) {
         this.cI = 0;
         this.d(64, false);
      }

      if (this.dk() && this.cJ > 0 && ++this.cJ > 20) {
         this.cJ = 0;
         this.C(false);
      }

      if (this.cq > 0 && ++this.cq > 8) {
         this.cq = 0;
      }

      if (this.cr > 0) {
         this.cr++;
         if (this.cr > 300) {
            this.cr = 0;
         }
      }

      this.cL = this.cK;
      if (this.gO()) {
         this.cK = this.cK + (1.0F - this.cK) * 0.4F + 0.05F;
         if (this.cK > 1.0F) {
            this.cK = 1.0F;
         }
      } else {
         this.cK = this.cK + ((0.0F - this.cK) * 0.4F - 0.05F);
         if (this.cK < 0.0F) {
            this.cK = 0.0F;
         }
      }

      this.cN = this.cM;
      if (this.gP()) {
         this.cK = 0.0F;
         this.cL = this.cK;
         this.cM = this.cM + (1.0F - this.cM) * 0.4F + 0.05F;
         if (this.cM > 1.0F) {
            this.cM = 1.0F;
         }
      } else {
         this.cw = false;
         this.cM = this.cM + ((0.8F * this.cM * this.cM * this.cM - this.cM) * 0.6F - 0.05F);
         if (this.cM < 0.0F) {
            this.cM = 0.0F;
         }
      }

      this.cP = this.cO;
      if (this.t(64)) {
         this.cO = this.cO + (1.0F - this.cO) * 0.7F + 0.05F;
         if (this.cO > 1.0F) {
            this.cO = 1.0F;
         }
      } else {
         this.cO = this.cO + ((0.0F - this.cO) * 0.7F - 0.05F);
         if (this.cO < 0.0F) {
            this.cO = 0.0F;
         }
      }
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      if (this.cb() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gL() && $$0.ga()) {
         this.b($$0);
         return bsd.a;
      } else {
         cwb $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bsd $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bum.g) && !this.al()) {
               this.b($$0, $$2);
               return bsd.a;
            }
         }

         this.a($$0);
         return bsd.a;
      }
   }

   private void y() {
      if (!this.dX().C) {
         this.cI = 1;
         this.d(64, true);
      }
   }

   public void B(boolean $$0) {
      this.d(16, $$0);
   }

   public void C(boolean $$0) {
      if ($$0) {
         this.B(false);
      }

      this.d(32, $$0);
   }

   @Nullable
   public awk ha() {
      return this.w();
   }

   public void hb() {
      if (this.gv() && this.dk()) {
         this.cJ = 1;
         this.C(true);
      }
   }

   public void hc() {
      if (!this.gP()) {
         this.hb();
         this.b(this.gV());
      }
   }

   public boolean g(com $$0) {
      this.b($$0.cH());
      this.y(true);
      if ($$0 instanceof aro) {
         ao.y.a((aro)$$0, this);
      }

      this.dX().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(com $$0, ezn $$1) {
      super.a($$0, $$1);
      ezm $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aX = this.aZ = this.dN();
      if (this.dj()) {
         if ($$1.f <= 0.0) {
            this.cy = 0;
         }

         if (this.aK()) {
            this.z(false);
            if (this.cv > 0.0F && !this.gN()) {
               this.b(this.cv, $$1);
            }

            this.cv = 0.0F;
         }
      }
   }

   protected ezm j(bva $$0) {
      return new ezm($$0.dP() * 0.5F, $$0.dN());
   }

   @Override
   protected ezn b(com $$0, ezn $$1) {
      if (this.aK() && this.cv == 0.0F && this.gP() && !this.cw) {
         return ezn.c;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ezn((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(com $$0) {
      return (float)this.h(bwi.v);
   }

   protected void b(float $$0, ezn $$1) {
      double $$2 = (double)this.A($$0);
      ezn $$3 = this.dA();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.as = true;
      if ($$1.f > 0.0) {
         float $$4 = azk.a(this.dN() * (float) (Math.PI / 180.0));
         float $$5 = azk.b(this.dN() * (float) (Math.PI / 180.0));
         this.h(this.dA().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void hd() {
      this.a(awl.mN, 0.4F, 1.0F);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gO());
      $$0.a("Bred", this.gQ());
      $$0.a("Temper", this.gR());
      $$0.a("Tame", this.gL());
      if (this.ab_() != null) {
         $$0.a("Owner", this.ab_());
      }

      if (!this.ct.a(0).f()) {
         $$0.a("SaddleItem", this.ct.a(0).a(this.dZ()));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.B($$0.q("EatingHaystack"));
      this.A($$0.q("Bred"));
      this.u($$0.h("Temper"));
      this.y($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avn.a(this.cW(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cwb $$4 = cwb.a(this.dZ(), (vh)$$0.p("SaddleItem")).orElse(cwb.k);
         if ($$4.a(cwf.nL)) {
            this.ct.a(0, $$4);
         }
      }

      this.gU();
   }

   @Override
   public boolean a(cgr $$0) {
      return false;
   }

   protected boolean he() {
      return !this.cb() && !this.ca() && this.gL() && !this.p_() && this.eG() >= this.eV() && this.gE();
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return null;
   }

   protected void a(btv $$0, civ $$1) {
      this.a($$0, $$1, bwi.s, (double)cd, (double)ce);
      this.a($$0, $$1, bwi.o, (double)ca, (double)cc);
      this.a($$0, $$1, bwi.v, (double)bY, (double)bZ);
   }

   private void a(btv $$0, civ $$1, jq<bwd> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.af);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azs $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azk.a($$0, $$2, $$3);
         $$1 = azk.a($$1, $$2, $$3);
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
      return azk.h($$0, this.cL, this.cK);
   }

   public float K(float $$0) {
      return azk.h($$0, this.cN, this.cM);
   }

   public float L(float $$0) {
      return azk.h($$0, this.cP, this.cO);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cw = true;
            this.hb();
         }

         if ($$0 >= 90) {
            this.cv = 1.0F;
         } else {
            this.cv = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cw = true;
      this.hb();
      this.hd();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      lp $$1 = $$0 ? lr.Q : lr.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dX().a($$1, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.D(true);
      } else if ($$0 == 6) {
         this.D(false);
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void a(bue $$0, bue.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bva) {
         ((bva)$$0).aX = this.aX;
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
   public bvs a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bvs() {
            @Override
            public cwb a() {
               return civ.this.ct.a(0);
            }

            @Override
            public boolean a(cwb $$0) {
               if (!$$0.f() && !$$0.a(cwf.nL)) {
                  return false;
               } else {
                  civ.this.ct.a(0, $$0);
                  civ.this.gU();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ct.b() ? bvs.a(this.ct, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bva cY() {
      if (this.i()) {
         bue var2 = this.db();
         if (var2 instanceof com) {
            return (com)var2;
         }
      }

      return super.cY();
   }

   @Nullable
   private ezn a(ezn $$0, bva $$1) {
      double $$2 = this.dC() + $$0.d;
      double $$3 = this.cS().b;
      double $$4 = this.dI() + $$0.f;
      jh.a $$5 = new jh.a();
      UnmodifiableIterator var10 = $$1.fQ().iterator();

      while (var10.hasNext()) {
         bvm $$6 = (bvm)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cS().e + 0.75;

         do {
            double $$8 = this.dX().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cqp.a($$8)) {
               ezi $$9 = $$1.f($$6);
               ezn $$10 = new ezn($$2, (double)$$5.v() + $$8, $$4);
               if (cqp.a(this.dX(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jm.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ezn b(bva $$0) {
      ezn $$1 = a((double)this.ds(), (double)$$0.ds(), this.dN() + ($$0.fA() == buu.b ? 90.0F : -90.0F));
      ezn $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ezn $$3 = a((double)this.ds(), (double)$$0.ds(), this.dN() + ($$0.fA() == buu.a ? 90.0F : -90.0F));
         ezn $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dv();
      }
   }

   protected void a(azs $$0) {
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$3 == null) {
         $$3 = new btv.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(brw $$0) {
      return this.ct != $$0;
   }

   public int hf() {
      return this.T();
   }

   @Override
   protected ezn a(bue $$0, buh $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ezn(0.0, 0.15 * (double)this.cN * (double)$$2, -0.7 * (double)this.cN * (double)$$2).b(-this.dN() * (float) (Math.PI / 180.0)));
   }

   public final brw hg() {
      return this.cR;
   }

   public int ag_() {
      return 0;
   }
}
