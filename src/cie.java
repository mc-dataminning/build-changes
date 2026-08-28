import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cie extends cga implements brk, bud, bur, buu, buz {
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
   private static final Predicate<buk> ch = $$0 -> $$0 instanceof cie && ((cie)$$0).gL();
   private static final cfa ci = cfa.b().a(16.0).d().a(ch);
   private static final akg<Byte> cA = akk.a(cie.class, aki.a);
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
   protected brw ct;
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
   private final bri cR = new fae() {
      @Override
      public cvp f() {
         return cie.this.fT();
      }

      @Override
      public void b(cvp $$0) {
         cie.this.l($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cnu $$0) {
         return $$0.dg() == cie.this || $$0.b(cie.this, 4.0);
      }
   };

   protected cie(btv<? extends cie> $$0, deg $$1) {
      super($$0, $$1);
      this.gO();
   }

   @Override
   protected void D() {
      this.bS.a(1, new cca(this, 1.2));
      this.bS.a(1, new ccl(this, 1.2));
      this.bS.a(2, new cat(this, 1.0, cie.class));
      this.bS.a(4, new cbg(this, 1.0));
      this.bS.a(6, new ccu(this, 0.7));
      this.bS.a(7, new cbp(this, cnu.class, 6.0F));
      this.bS.a(8, new ccc(this));
      if (this.gq()) {
         this.bS.a(9, new ccd(this));
      }

      this.gH();
   }

   protected void gH() {
      this.bS.a(0, new cbb(this));
      this.bS.a(3, new ccp(this, 1.25, $$0 -> $$0.a(axc.ag), false));
   }

   @Override
   protected void a(akk.a $$0) {
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

   public boolean gG() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID Z_() {
      return this.cQ;
   }

   public void b(@Nullable UUID $$0) {
      this.cQ = $$0;
   }

   public boolean gI() {
      return this.cs;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   public void z(boolean $$0) {
      this.cs = $$0;
   }

   @Override
   public boolean a(bto $$0, float $$1) {
      if ($$1 > 6.0F && this.gJ()) {
         this.B(false);
      }

      return true;
   }

   public boolean gJ() {
      return this.t(16);
   }

   public boolean gK() {
      return this.t(32);
   }

   public boolean gL() {
      return this.t(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_() && this.gG();
   }

   @Override
   public void a(cvp $$0, @Nullable awf $$1) {
      this.ct.a(0, $$0);
   }

   public void b(cnu $$0, cvp $$1) {
      if (this.k($$1)) {
         this.l($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gM() {
      return this.cu;
   }

   public void u(int $$0) {
      this.cu = $$0;
   }

   public int v(int $$0) {
      int $$1 = azd.a(this.gM() + $$0, 0, this.gS());
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
         awd $$0 = this.gr();
         if ($$0 != null) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), $$0, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsg $$2) {
      if ($$0 > 1.0F) {
         this.a(awe.mQ, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bX()) {
            for (bto $$4 : this.da()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eM();
         return true;
      }
   }

   public final int gN() {
      return w(this.ae_());
   }

   public static int w(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gO() {
      brw $$0 = this.ct;
      this.ct = new brw(this.gN());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ct.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cvp $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ct.a($$2, $$3.u());
            }
         }
      }

      this.ct.a(this);
      this.gP();
   }

   protected void gP() {
      if (!this.dS().B) {
         this.d(4, !this.ct.a(0).f());
      }
   }

   @Override
   public void a(bri $$0) {
      boolean $$1 = this.i();
      this.gP();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.ab_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.af.a(3) == 0) {
         this.gW();
      }

      return $$2;
   }

   protected boolean gq() {
      return true;
   }

   @Nullable
   protected awd gr() {
      return null;
   }

   @Nullable
   protected awd gQ() {
      return null;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      if (!$$1.n()) {
         duo $$2 = this.dS().a_($$0.d());
         dox $$3 = $$1.A();
         if ($$2.a(dhl.dN)) {
            $$3 = $$2.A();
         }

         if (this.bX() && this.cx) {
            this.cy++;
            if (this.cy > 5 && this.cy % 3 == 0) {
               this.a($$3);
            } else if (this.cy <= 5) {
               this.a(awe.mT, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awe.mT, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awe.mS, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dox $$0) {
      return $$0 == dox.b || $$0 == dox.aT || $$0 == dox.B || $$0 == dox.aU || $$0 == dox.aS;
   }

   protected void a(dox $$0) {
      this.a(awe.mN, $$0.a() * 0.15F, $$0.b());
   }

   public static bvq.a gR() {
      return cga.gu().a(bvr.o, 0.7).a(bvr.s, 53.0).a(bvr.v, 0.225F).a(bvr.B, 1.0).a(bvr.x, 6.0).a(bvr.k, 0.5);
   }

   @Override
   public int fS() {
      return 6;
   }

   public int gS() {
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
   public void b(cnu $$0) {
      if (!this.dS().B && (!this.bX() || this.y($$0)) && this.gG()) {
         $$0.a(this, this.ct);
      }
   }

   public brp c(cnu $$0, cvp $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (brp)(!$$2 && !this.dS().B ? brp.e : brp.b);
   }

   protected boolean a(cnu $$0, cvp $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cvt.px)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cvt.rB)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dhl.ij.q())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cvt.ov)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cvt.um)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dS().B && this.gG() && this.g() == 0 && !this.gz()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cvt.qb) || $$1.a(cvt.qc)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dS().B && this.gG() && this.g() == 0 && !this.gz()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eA() < this.eQ() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dS().a(ln.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dS().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gG()) && this.gM() < this.gS() && !this.dS().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(dzl.m);
      }

      return $$2;
   }

   protected void a(cnu $$0) {
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
      return super.ff() && this.bX() && this.i() || this.gJ() || this.gK();
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.af);
   }

   private void t() {
      this.cq = 1;
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.ct != null) {
         for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
            cvp $$1 = this.ct.a($$0);
            if (!$$1.f() && !dbm.a($$1, dbl.D)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void m_() {
      if (this.af.a(200) == 0) {
         this.t();
      }

      super.m_();
      if (!this.dS().B && this.bI()) {
         if (this.af.a(900) == 0 && this.aL == 0) {
            this.c(1.0F);
         }

         if (this.gU()) {
            if (!this.gJ() && !this.bX() && this.af.a(300) == 0 && this.dS().a_(this.ds().e()).a(dhl.i)) {
               this.B(true);
            }

            if (this.gJ() && ++this.cH > 50) {
               this.cH = 0;
               this.B(false);
            }
         }

         this.gT();
      }
   }

   protected void gT() {
      if (this.gL() && this.o_() && !this.gJ()) {
         buk $$0 = this.dS().a(cie.class, ci, this, this.dx(), this.dz(), this.dD(), this.cO().g(16.0));
         if ($$0 != null && this.g($$0) > 4.0) {
            this.bR.a($$0, 0);
         }
      }
   }

   public boolean gU() {
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
      if (this.gJ()) {
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
      if (this.gK()) {
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
   public brp b(cnu $$0, bro $$1) {
      if (this.bX() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gG() && $$0.fS()) {
         this.b($$0);
         return brp.a;
      } else {
         cvp $$2 = $$0.b($$1);
         if (!$$2.f()) {
            brp $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.e(btw.g) && this.k($$2) && !this.fU()) {
               this.b($$0, $$2);
               return brp.a;
            }
         }

         this.a($$0);
         return brp.a;
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
   public awd gV() {
      return this.w();
   }

   public void gW() {
      if (this.gq() && this.df()) {
         this.cJ = 1;
         this.C(true);
      }
   }

   public void gX() {
      if (!this.gK()) {
         this.gW();
         this.b(this.gQ());
      }
   }

   public boolean g(cnu $$0) {
      this.b($$0.cD());
      this.y(true);
      if ($$0 instanceof ari) {
         an.y.a((ari)$$0, this);
      }

      this.dS().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cnu $$0, eys $$1) {
      super.a($$0, $$1);
      eyr $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aT = this.aV = this.dI();
      if (this.de()) {
         if ($$1.f <= 0.0) {
            this.cy = 0;
         }

         if (this.aH()) {
            this.z(false);
            if (this.cv > 0.0F && !this.gI()) {
               this.b(this.cv, $$1);
            }

            this.cv = 0.0F;
         }
      }
   }

   protected eyr j(buk $$0) {
      return new eyr($$0.dK() * 0.5F, $$0.dI());
   }

   @Override
   protected eys b(cnu $$0, eys $$1) {
      if (this.aH() && this.cv == 0.0F && this.gK() && !this.cw) {
         return eys.c;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new eys((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cnu $$0) {
      return (float)this.h(bvr.v);
   }

   protected void b(float $$0, eys $$1) {
      double $$2 = (double)this.A($$0);
      eys $$3 = this.dv();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.as = true;
      if ($$1.f > 0.0) {
         float $$4 = azd.a(this.dI() * (float) (Math.PI / 180.0));
         float $$5 = azd.b(this.dI() * (float) (Math.PI / 180.0));
         this.h(this.dv().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gY() {
      this.a(awe.mP, 0.4F, 1.0F);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gJ());
      $$0.a("Bred", this.gL());
      $$0.a("Temper", this.gM());
      $$0.a("Tame", this.gG());
      if (this.Z_() != null) {
         $$0.a("Owner", this.Z_());
      }

      if (!this.ct.a(0).f()) {
         $$0.a("SaddleItem", this.ct.a(0).a(this.dU()));
      }
   }

   @Override
   public void a(uf $$0) {
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
         $$1 = avg.a(this.cS(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cvp $$4 = cvp.a(this.dU(), (vc)$$0.p("SaddleItem")).orElse(cvp.k);
         if ($$4.a(cvt.nL)) {
            this.ct.a(0, $$4);
         }
      }

      this.gP();
   }

   @Override
   public boolean a(cga $$0) {
      return false;
   }

   protected boolean gZ() {
      return !this.bX() && !this.bW() && this.gG() && !this.o_() && this.eA() >= this.eQ() && this.gz();
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return null;
   }

   protected void a(bth $$0, cie $$1) {
      this.a($$0, $$1, bvr.s, (double)cd, (double)ce);
      this.a($$0, $$1, bvr.o, (double)ca, (double)cc);
      this.a($$0, $$1, bvr.v, (double)bY, (double)bZ);
   }

   private void a(bth $$0, cie $$1, jn<bvm> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.af);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azl $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azd.a($$0, $$2, $$3);
         $$1 = azd.a($$1, $$2, $$3);
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
      return azd.h($$0, this.cL, this.cK);
   }

   public float K(float $$0) {
      return azd.h($$0, this.cN, this.cM);
   }

   public float L(float $$0) {
      return azd.h($$0, this.cP, this.cO);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cw = true;
            this.gW();
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
      this.gW();
      this.gY();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      ll $$1 = $$0 ? ln.Q : ln.ae;

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
   protected void a(bto $$0, bto.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof buk) {
         ((buk)$$0).aT = this.aT;
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
   public bvb a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bvb() {
            @Override
            public cvp a() {
               return cie.this.ct.a(0);
            }

            @Override
            public boolean a(cvp $$0) {
               if (!$$0.f() && !$$0.a(cvt.nL)) {
                  return false;
               } else {
                  cie.this.ct.a(0, $$0);
                  cie.this.gP();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ct.b() ? bvb.a(this.ct, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public buk cU() {
      if (this.i()) {
         bto var2 = this.cX();
         if (var2 instanceof cnu) {
            return (cnu)var2;
         }
      }

      return super.cU();
   }

   @Nullable
   private eys a(eys $$0, buk $$1) {
      double $$2 = this.dx() + $$0.d;
      double $$3 = this.cO().b;
      double $$4 = this.dD() + $$0.f;
      je.a $$5 = new je.a();
      UnmodifiableIterator var10 = $$1.fJ().iterator();

      while (var10.hasNext()) {
         buw $$6 = (buw)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cO().e + 0.75;

         do {
            double $$8 = this.dS().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cpx.a($$8)) {
               eyn $$9 = $$1.f($$6);
               eys $$10 = new eys($$2, (double)$$5.v() + $$8, $$4);
               if (cpx.a(this.dS(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jj.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public eys b(buk $$0) {
      eys $$1 = a((double)this.dn(), (double)$$0.dn(), this.dI() + ($$0.fu() == bue.b ? 90.0F : -90.0F));
      eys $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         eys $$3 = a((double)this.dn(), (double)$$0.dn(), this.dI() + ($$0.fu() == bue.a ? 90.0F : -90.0F));
         eys $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dq();
      }
   }

   protected void a(azl $$0) {
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$3 == null) {
         $$3 = new bth.a(0.2F);
      }

      this.a($$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bri $$0) {
      return this.ct != $$0;
   }

   public int ha() {
      return this.T();
   }

   @Override
   protected eys a(bto $$0, btr $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new eys(0.0, 0.15 * (double)this.cN * (double)$$2, -0.7 * (double)this.cN * (double)$$2).b(-this.dI() * (float) (Math.PI / 180.0)));
   }

   public final bri hb() {
      return this.cR;
   }

   public int ae_() {
      return 0;
   }
}
