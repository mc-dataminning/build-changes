import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cih extends cgd implements brn, bug, buu, bux, bvc {
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
   private static final Predicate<bun> ch = $$0 -> $$0 instanceof cih && ((cih)$$0).gK();
   private static final cfd ci = cfd.b().a(16.0).d().a(ch);
   private static final akh<Byte> cA = akl.a(cih.class, akj.a);
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
   protected brz ct;
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
   private final brl cR = new fai() {
      @Override
      public cvs f() {
         return cih.this.fT();
      }

      @Override
      public void b(cvs $$0) {
         cih.this.l($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cnx $$0) {
         return $$0.dg() == cih.this || $$0.b(cih.this, 4.0);
      }
   };

   protected cih(bty<? extends cih> $$0, dej $$1) {
      super($$0, $$1);
      this.gN();
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccd(this, 1.2));
      this.bS.a(1, new cco(this, 1.2));
      this.bS.a(2, new caw(this, 1.0, cih.class));
      this.bS.a(4, new cbj(this, 1.0));
      this.bS.a(6, new ccx(this, 0.7));
      this.bS.a(7, new cbs(this, cnx.class, 6.0F));
      this.bS.a(8, new ccf(this));
      if (this.gp()) {
         this.bS.a(9, new ccg(this));
      }

      this.gG();
   }

   protected void gG() {
      this.bS.a(0, new cbe(this));
      this.bS.a(3, new ccs(this, 1.25, $$0 -> $$0.a(axe.ag), false));
   }

   @Override
   protected void a(akl.a $$0) {
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

   public boolean gF() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID aa_() {
      return this.cQ;
   }

   public void b(@Nullable UUID $$0) {
      this.cQ = $$0;
   }

   public boolean gH() {
      return this.cs;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   public void z(boolean $$0) {
      this.cs = $$0;
   }

   @Override
   public boolean a(btr $$0, float $$1) {
      if ($$1 > 6.0F && this.gI()) {
         this.B(false);
      }

      return true;
   }

   public boolean gI() {
      return this.t(16);
   }

   public boolean gJ() {
      return this.t(32);
   }

   public boolean gK() {
      return this.t(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bI() && !this.p_() && this.gF();
   }

   @Override
   public void a(cvs $$0, @Nullable awh $$1) {
      this.ct.a(0, $$0);
   }

   public void b(cnx $$0, cvs $$1) {
      if (this.k($$1)) {
         this.l($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gL() {
      return this.cu;
   }

   public void u(int $$0) {
      this.cu = $$0;
   }

   public int v(int $$0) {
      int $$1 = azf.a(this.gL() + $$0, 0, this.gR());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bF() {
      return !this.bX();
   }

   private void q() {
      this.y();
      if (!this.ba()) {
         awf $$0 = this.gq();
         if ($$0 != null) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), $$0, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsj $$2) {
      if ($$0 > 1.0F) {
         this.a(awg.mQ, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bX()) {
            for (btr $$4 : this.da()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eM();
         return true;
      }
   }

   public final int gM() {
      return w(this.af_());
   }

   public static int w(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gN() {
      brz $$0 = this.ct;
      this.ct = new brz(this.gM());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ct.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cvs $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ct.a($$2, $$3.u());
            }
         }
      }

      this.ct.a(this);
      this.gO();
   }

   protected void gO() {
      if (!this.dS().B) {
         this.d(4, !this.ct.a(0).f());
      }
   }

   @Override
   public void a(brl $$0) {
      boolean $$1 = this.i();
      this.gO();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.ac_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.af.a(3) == 0) {
         this.gV();
      }

      return $$2;
   }

   protected boolean gp() {
      return true;
   }

   @Nullable
   protected awf gq() {
      return null;
   }

   @Nullable
   protected awf gP() {
      return null;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      if (!$$1.n()) {
         dus $$2 = this.dS().a_($$0.d());
         dpa $$3 = $$1.A();
         if ($$2.a(dho.dN)) {
            $$3 = $$2.A();
         }

         if (this.bX() && this.cx) {
            this.cy++;
            if (this.cy > 5 && this.cy % 3 == 0) {
               this.a($$3);
            } else if (this.cy <= 5) {
               this.a(awg.mT, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awg.mT, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awg.mS, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dpa $$0) {
      return $$0 == dpa.b || $$0 == dpa.aT || $$0 == dpa.B || $$0 == dpa.aU || $$0 == dpa.aS;
   }

   protected void a(dpa $$0) {
      this.a(awg.mN, $$0.a() * 0.15F, $$0.b());
   }

   public static bvt.a gQ() {
      return cgd.gt().a(bvu.o, 0.7).a(bvu.s, 53.0).a(bvu.v, 0.225F).a(bvu.B, 1.0).a(bvu.x, 6.0).a(bvu.k, 0.5);
   }

   @Override
   public int fS() {
      return 6;
   }

   public int gR() {
      return 100;
   }

   @Override
   protected float fd() {
      return 0.8F;
   }

   @Override
   public int T() {
      return 400;
   }

   @Override
   public void b(cnx $$0) {
      if (!this.dS().B && (!this.bX() || this.y($$0)) && this.gF()) {
         $$0.a(this, this.ct);
      }
   }

   public brs c(cnx $$0, cvs $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (brs)(!$$2 && !this.dS().B ? brs.e : brs.b);
   }

   protected boolean a(cnx $$0, cvs $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cvw.px)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cvw.rB)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dho.ij.q())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cvw.ov)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cvw.um)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dS().B && this.gF() && this.g() == 0 && !this.gy()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cvw.qb) || $$1.a(cvw.qc)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dS().B && this.gF() && this.g() == 0 && !this.gy()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eB() < this.eQ() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dS().a(lo.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dS().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gF()) && this.gL() < this.gR() && !this.dS().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(dzp.m);
      }

      return $$2;
   }

   protected void a(cnx $$0) {
      this.B(false);
      this.C(false);
      if (!this.dS().B) {
         $$0.v(this.dI());
         $$0.w(this.dK());
         $$0.n(this);
      }
   }

   @Override
   public boolean ff() {
      return super.ff() && this.bX() && this.i() || this.gI() || this.gJ();
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.af);
   }

   private void t() {
      this.cq = 1;
   }

   @Override
   protected void eE() {
      super.eE();
      if (this.ct != null) {
         for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
            cvs $$1 = this.ct.a($$0);
            if (!$$1.f() && !dbp.a($$1, dbo.D)) {
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
      if (!this.dS().B && this.bI()) {
         if (this.af.a(900) == 0 && this.aL == 0) {
            this.c(1.0F);
         }

         if (this.gT()) {
            if (!this.gI() && !this.bX() && this.af.a(300) == 0 && this.dS().a_(this.ds().e()).a(dho.i)) {
               this.B(true);
            }

            if (this.gI() && ++this.cH > 50) {
               this.cH = 0;
               this.B(false);
            }
         }

         this.gS();
      }
   }

   protected void gS() {
      if (this.gK() && this.p_() && !this.gI()) {
         bun $$0 = this.dS().a(cih.class, ci, this, this.dx(), this.dz(), this.dD(), this.cO().g(16.0));
         if ($$0 != null && this.g($$0) > 4.0) {
            this.bR.a($$0, 0);
         }
      }
   }

   public boolean gT() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cI > 0 && ++this.cI > 30) {
         this.cI = 0;
         this.d(64, false);
      }

      if (this.df() && this.cJ > 0 && ++this.cJ > 20) {
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
      if (this.gI()) {
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
      if (this.gJ()) {
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
   public brs b(cnx $$0, brr $$1) {
      if (this.bX() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gF() && $$0.fT()) {
         this.b($$0);
         return brs.a;
      } else {
         cvs $$2 = $$0.b($$1);
         if (!$$2.f()) {
            brs $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.e(btz.g) && this.k($$2) && !this.fU()) {
               this.b($$0, $$2);
               return brs.a;
            }
         }

         this.a($$0);
         return brs.a;
      }
   }

   private void y() {
      if (!this.dS().B) {
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
   public awf gU() {
      return this.w();
   }

   public void gV() {
      if (this.gp() && this.df()) {
         this.cJ = 1;
         this.C(true);
      }
   }

   public void gW() {
      if (!this.gJ()) {
         this.gV();
         this.b(this.gP());
      }
   }

   public boolean g(cnx $$0) {
      this.b($$0.cD());
      this.y(true);
      if ($$0 instanceof ark) {
         an.y.a((ark)$$0, this);
      }

      this.dS().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cnx $$0, eyw $$1) {
      super.a($$0, $$1);
      eyv $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aT = this.aV = this.dI();
      if (this.de()) {
         if ($$1.f <= 0.0) {
            this.cy = 0;
         }

         if (this.aH()) {
            this.z(false);
            if (this.cv > 0.0F && !this.gH()) {
               this.b(this.cv, $$1);
            }

            this.cv = 0.0F;
         }
      }
   }

   protected eyv j(bun $$0) {
      return new eyv($$0.dK() * 0.5F, $$0.dI());
   }

   @Override
   protected eyw b(cnx $$0, eyw $$1) {
      if (this.aH() && this.cv == 0.0F && this.gJ() && !this.cw) {
         return eyw.c;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new eyw((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cnx $$0) {
      return (float)this.h(bvu.v);
   }

   protected void b(float $$0, eyw $$1) {
      double $$2 = (double)this.A($$0);
      eyw $$3 = this.dv();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.as = true;
      if ($$1.f > 0.0) {
         float $$4 = azf.a(this.dI() * (float) (Math.PI / 180.0));
         float $$5 = azf.b(this.dI() * (float) (Math.PI / 180.0));
         this.h(this.dv().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gX() {
      this.a(awg.mP, 0.4F, 1.0F);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gI());
      $$0.a("Bred", this.gK());
      $$0.a("Temper", this.gL());
      $$0.a("Tame", this.gF());
      if (this.aa_() != null) {
         $$0.a("Owner", this.aa_());
      }

      if (!this.ct.a(0).f()) {
         $$0.a("SaddleItem", this.ct.a(0).a(this.dU()));
      }
   }

   @Override
   public void a(ug $$0) {
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
         $$1 = avi.a(this.cS(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cvs $$4 = cvs.a(this.dU(), (vd)$$0.p("SaddleItem")).orElse(cvs.k);
         if ($$4.a(cvw.nL)) {
            this.ct.a(0, $$4);
         }
      }

      this.gO();
   }

   @Override
   public boolean a(cgd $$0) {
      return false;
   }

   protected boolean gY() {
      return !this.bX() && !this.bW() && this.gF() && !this.p_() && this.eB() >= this.eQ() && this.gy();
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return null;
   }

   protected void a(btk $$0, cih $$1) {
      this.a($$0, $$1, bvu.s, (double)cd, (double)ce);
      this.a($$0, $$1, bvu.o, (double)ca, (double)cc);
      this.a($$0, $$1, bvu.v, (double)bY, (double)bZ);
   }

   private void a(btk $$0, cih $$1, jo<bvp> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.af);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azn $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azf.a($$0, $$2, $$3);
         $$1 = azf.a($$1, $$2, $$3);
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
      return azf.h($$0, this.cL, this.cK);
   }

   public float K(float $$0) {
      return azf.h($$0, this.cN, this.cM);
   }

   public float L(float $$0) {
      return azf.h($$0, this.cP, this.cO);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cw = true;
            this.gV();
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
      this.gV();
      this.gX();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      lm $$1 = $$0 ? lo.Q : lo.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dS().a($$1, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(btr $$0, btr.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bun) {
         ((bun)$$0).aT = this.aT;
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
   public bve a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bve() {
            @Override
            public cvs a() {
               return cih.this.ct.a(0);
            }

            @Override
            public boolean a(cvs $$0) {
               if (!$$0.f() && !$$0.a(cvw.nL)) {
                  return false;
               } else {
                  cih.this.ct.a(0, $$0);
                  cih.this.gO();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ct.b() ? bve.a(this.ct, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bun cU() {
      if (this.i()) {
         btr var2 = this.cX();
         if (var2 instanceof cnx) {
            return (cnx)var2;
         }
      }

      return super.cU();
   }

   @Nullable
   private eyw a(eyw $$0, bun $$1) {
      double $$2 = this.dx() + $$0.d;
      double $$3 = this.cO().b;
      double $$4 = this.dD() + $$0.f;
      jf.a $$5 = new jf.a();
      UnmodifiableIterator var10 = $$1.fK().iterator();

      while (var10.hasNext()) {
         buz $$6 = (buz)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cO().e + 0.75;

         do {
            double $$8 = this.dS().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cqa.a($$8)) {
               eyr $$9 = $$1.f($$6);
               eyw $$10 = new eyw($$2, (double)$$5.v() + $$8, $$4);
               if (cqa.a(this.dS(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jk.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public eyw b(bun $$0) {
      eyw $$1 = a((double)this.dn(), (double)$$0.dn(), this.dI() + ($$0.fu() == buh.b ? 90.0F : -90.0F));
      eyw $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         eyw $$3 = a((double)this.dn(), (double)$$0.dn(), this.dI() + ($$0.fu() == buh.a ? 90.0F : -90.0F));
         eyw $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dq();
      }
   }

   protected void a(azn $$0) {
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$3 == null) {
         $$3 = new btk.a(0.2F);
      }

      this.a($$0.D_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(brl $$0) {
      return this.ct != $$0;
   }

   public int gZ() {
      return this.T();
   }

   @Override
   protected eyw a(btr $$0, btu $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new eyw(0.0, 0.15 * (double)this.cN * (double)$$2, -0.7 * (double)this.cN * (double)$$2).b(-this.dI() * (float) (Math.PI / 180.0)));
   }

   public final brl ha() {
      return this.cR;
   }

   public int af_() {
      return 0;
   }
}
