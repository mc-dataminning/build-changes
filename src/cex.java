import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cex extends cct implements bol, bqx, brl, bro, brt {
   public static final int ck = 400;
   public static final int cl = 499;
   public static final int cm = 500;
   public static final double cn = 0.15;
   private static final float bY = (float)b(() -> 0.0);
   private static final float bZ = (float)b(() -> 1.0);
   private static final float cb = (float)a(() -> 0.0);
   private static final float cc = (float)a(() -> 1.0);
   private static final float cd = a($$0 -> 0);
   private static final float ce = a($$0 -> $$0 - 1);
   private static final float cf = 0.25F;
   private static final float cg = 0.5F;
   private static final Predicate<bre> ch = $$0 -> $$0 instanceof cex && ((cex)$$0).gJ();
   private static final cbu ci = cbu.b().a(16.0).d().a(ch);
   private static final cwd cj = cwd.a(csg.pw, csg.rA, dcx.ij.p(), csg.ot, csg.uk, csg.qa, csg.qb);
   private static final ajk<Byte> cA = ajo.a(cex.class, ajm.a);
   private static final int cB = 2;
   private static final int cC = 4;
   private static final int cD = 8;
   private static final int cE = 16;
   private static final int cF = 32;
   private static final int cG = 64;
   public static final int co = 0;
   public static final int cp = 1;
   private int cH;
   private int cI;
   private int cJ;
   public int cq;
   public int cr;
   protected boolean cs;
   protected boz ct;
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
   private final boj cR = new euq() {
      @Override
      public csd f() {
         return cex.this.fQ();
      }

      @Override
      public void a(csd $$0) {
         cex.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(ckl $$0) {
         return $$0.da() == cex.this || $$0.b(cex.this, 4.0);
      }
   };

   protected cex(bqr<? extends cex> $$0, czu $$1) {
      super($$0, $$1);
      this.gL();
   }

   @Override
   protected void z() {
      this.bS.a(1, new byu(this, 1.2));
      this.bS.a(1, new bzf(this, 1.2));
      this.bS.a(2, new bxn(this, 1.0, cex.class));
      this.bS.a(4, new bya(this, 1.0));
      this.bS.a(6, new bzo(this, 0.7));
      this.bS.a(7, new byj(this, ckl.class, 6.0F));
      this.bS.a(8, new byw(this));
      if (this.gv()) {
         this.bS.a(9, new byx(this));
      }

      this.gF();
   }

   protected void gF() {
      this.bS.a(0, new bxv(this));
      this.bS.a(3, new bzj(this, 1.25, cwd.a(csg.uk, csg.qa, csg.qb), false));
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cA, (byte)0);
   }

   protected boolean u(int $$0) {
      return (this.ao.a(cA) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(cA);
      if ($$1) {
         this.ao.a(cA, (byte)($$2 | $$0));
      } else {
         this.ao.a(cA, (byte)($$2 & ~$$0));
      }
   }

   public boolean gE() {
      return this.u(2);
   }

   @Nullable
   @Override
   public UUID W_() {
      return this.cQ;
   }

   public void b(@Nullable UUID $$0) {
      this.cQ = $$0;
   }

   public boolean gG() {
      return this.cs;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.cs = $$0;
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
   public void a(@Nullable ava $$0) {
      this.ct.a(0, new csd(csg.nL));
   }

   public void b(ckl $$0, csd $$1) {
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
      return this.cu;
   }

   public void v(int $$0) {
      this.cu = $$0;
   }

   public int w(int $$0) {
      int $$1 = axw.a(this.gK() + $$0, 0, this.gP());
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
         auy $$0 = this.gw();
         if ($$0 != null) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), $$0, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bpj $$2) {
      if ($$0 > 1.0F) {
         this.a(auz.mF, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bQ()) {
            for (bql $$4 : this.cU()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eL();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axw.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ab_() {
      return 1;
   }

   protected void gL() {
      boz $$0 = this.ct;
      this.ct = new boz(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ct.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            csd $$3 = $$0.a($$2);
            if (!$$3.d()) {
               this.ct.a($$2, $$3.r());
            }
         }
      }

      this.ct.a(this);
      this.gM();
   }

   protected void gM() {
      if (!this.dN().B) {
         this.d(4, !this.ct.a(0).d());
      }
   }

   @Override
   public void a(boj $$0) {
      boolean $$1 = this.i();
      this.gM();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
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
   protected auy gw() {
      return null;
   }

   @Nullable
   protected auy gN() {
      return null;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      if (!$$1.k()) {
         dpy $$2 = this.dN().a_($$0.c());
         dki $$3 = $$1.w();
         if ($$2.a(dcx.dN)) {
            $$3 = $$2.w();
         }

         if (this.bQ() && this.cx) {
            this.cy++;
            if (this.cy > 5 && this.cy % 3 == 0) {
               this.a($$3);
            } else if (this.cy <= 5) {
               this.a(auz.mI, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(auz.mI, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(auz.mH, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dki $$0) {
      return $$0 == dki.b || $$0 == dki.aT || $$0 == dki.B || $$0 == dki.aU || $$0 == dki.aS;
   }

   protected void a(dki $$0) {
      this.a(auz.mC, $$0.a() * 0.15F, $$0.b());
   }

   public static bsk.a gO() {
      return brg.A().a(bsl.m, 0.7).a(bsl.q, 53.0).a(bsl.r, 0.225F).a(bsl.v, 1.0);
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
   public void b(ckl $$0) {
      if (!this.dN().B && (!this.bQ() || this.x($$0)) && this.gE()) {
         $$0.a(this, this.ct);
      }
   }

   public boq c(ckl $$0, csd $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dN().B) {
         return boq.b;
      } else {
         return $$2 ? boq.a : boq.d;
      }
   }

   protected boolean a(ckl $$0, csd $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(csg.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(csg.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dcx.ij.p())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(csg.ot)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(csg.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dN().B && this.gE() && this.g() == 0 && !this.gt()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(csg.qa) || $$1.a(csg.qb)) {
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
         this.dN().a(kw.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         this.a(dur.m);
      }

      return $$2;
   }

   protected void f(ckl $$0) {
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
   public boolean o(csd $$0) {
      return cj.a($$0);
   }

   private void u() {
      this.cq = 1;
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.ct != null) {
         for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
            csd $$1 = this.ct.a($$0);
            if (!$$1.d() && !cxo.g($$1)) {
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
            if (!this.gH() && !this.bQ() && this.ah.a(300) == 0 && this.dN().a_(this.dn().d()).a(dcx.i)) {
               this.A(true);
            }

            if (this.gH() && ++this.cH > 50) {
               this.cH = 0;
               this.A(false);
            }
         }

         this.gQ();
      }
   }

   protected void gQ() {
      if (this.gJ() && this.p_() && !this.gH()) {
         bre $$0 = this.dN().a(cex.class, ci, this, this.ds(), this.du(), this.dy(), this.cI().g(16.0));
         if ($$0 != null && this.g((bql)$$0) > 4.0) {
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
      if (this.cI > 0 && ++this.cI > 30) {
         this.cI = 0;
         this.d(64, false);
      }

      if (this.cZ() && this.cJ > 0 && ++this.cJ > 20) {
         this.cJ = 0;
         this.B(false);
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
      if (this.gH()) {
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
      if (this.gI()) {
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
      if (this.u(64)) {
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
   public boq b(ckl $$0, bop $$1) {
      if (this.bQ() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gE() && $$0.fP()) {
         this.b($$0);
         return boq.a(this.dN().B);
      } else {
         csd $$2 = $$0.b($$1);
         if (!$$2.d()) {
            boq $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fR() && this.l($$2) && !this.fS()) {
               this.b($$0, $$2);
               return boq.a(this.dN().B);
            }
         }

         this.f($$0);
         return boq.a(this.dN().B);
      }
   }

   private void gp() {
      if (!this.dN().B) {
         this.cI = 1;
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
   public auy gS() {
      return this.v();
   }

   public void gT() {
      if (this.gv() && this.cZ()) {
         this.cJ = 1;
         this.B(true);
      }
   }

   public void gU() {
      if (!this.gI()) {
         this.gT();
         this.b(this.gN());
      }
   }

   public boolean h(ckl $$0) {
      this.b($$0.cx());
      this.x(true);
      if ($$0 instanceof aqf) {
         am.y.a((aqf)$$0, this);
      }

      this.dN().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(ckl $$0, etf $$1) {
      super.a($$0, $$1);
      ete $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aZ = this.bb = this.dD();
      if (this.cY()) {
         if ($$1.e <= 0.0) {
            this.cy = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cv > 0.0F && !this.gG()) {
               this.b(this.cv, $$1);
            }

            this.cv = 0.0F;
         }
      }
   }

   protected ete j(bre $$0) {
      return new ete($$0.dF() * 0.5F, $$0.dD());
   }

   @Override
   protected etf b(ckl $$0, etf $$1) {
      if (this.aC() && this.cv == 0.0F && this.gI() && !this.cw) {
         return etf.b;
      } else {
         float $$2 = $$0.bp * 0.5F;
         float $$3 = $$0.br;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new etf((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(ckl $$0) {
      return (float)this.g(bsl.r);
   }

   protected void b(float $$0, etf $$1) {
      double $$2 = (double)this.w($$0);
      etf $$3 = this.dq();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = axw.a(this.dD() * (float) (Math.PI / 180.0));
         float $$5 = axw.b(this.dD() * (float) (Math.PI / 180.0));
         this.g(this.dq().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gV() {
      this.a(auz.mE, 0.4F, 1.0F);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gH());
      $$0.a("Bred", this.gJ());
      $$0.a("Temper", this.gK());
      $$0.a("Tame", this.gE());
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      if (!this.ct.a(0).d()) {
         $$0.a("SaddleItem", this.ct.a(0).a(this.dP()));
      }
   }

   @Override
   public void a(ty $$0) {
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
         $$1 = aua.a(this.cM(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         csd $$4 = csd.a(this.dP(), (uv)$$0.p("SaddleItem")).orElse(csd.i);
         if ($$4.a(csg.nL)) {
            this.ct.a(0, $$4);
         }
      }

      this.gM();
   }

   @Override
   public boolean a(cct $$0) {
      return false;
   }

   protected boolean gW() {
      return !this.bQ() && !this.bP() && this.gE() && !this.p_() && this.ey() >= this.eP() && this.gt();
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      return null;
   }

   protected void a(bqf $$0, cex $$1) {
      this.a($$0, $$1, bsl.q, (double)cd, (double)ce);
      this.a($$0, $$1, bsl.m, (double)cb, (double)cc);
      this.a($$0, $$1, bsl.r, (double)bY, (double)bZ);
   }

   private void a(bqf $$0, cex $$1, iv<bsg> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ayd $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = axw.a($$0, $$2, $$3);
         $$1 = axw.a($$1, $$2, $$3);
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
      return axw.i($$0, this.cL, this.cK);
   }

   public float H(float $$0) {
      return axw.i($$0, this.cN, this.cM);
   }

   public float I(float $$0) {
      return axw.i($$0, this.cP, this.cO);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cw = true;
            this.gT();
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
      this.gT();
      this.gV();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      ku $$1 = $$0 ? kw.O : kw.ab;

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
   protected void a(bql $$0, bql.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bre) {
         ((bre)$$0).aZ = this.aZ;
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
   public brv a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new brv() {
            @Override
            public csd a() {
               return cex.this.ct.a(0);
            }

            @Override
            public boolean a(csd $$0) {
               if (!$$0.d() && !$$0.a(csg.nL)) {
                  return false;
               } else {
                  cex.this.ct.a(0, $$0);
                  cex.this.gM();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ct.b() ? brv.a(this.ct, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bre cO() {
      if (this.i()) {
         bql var2 = this.cR();
         if (var2 instanceof ckl) {
            return (ckl)var2;
         }
      }

      return super.cO();
   }

   @Nullable
   private etf a(etf $$0, bre $$1) {
      double $$2 = this.ds() + $$0.c;
      double $$3 = this.cI().b;
      double $$4 = this.dy() + $$0.e;
      im.a $$5 = new im.a();
      UnmodifiableIterator var10 = $$1.fG().iterator();

      while (var10.hasNext()) {
         brp $$6 = (brp)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cI().e + 0.75;

         do {
            double $$8 = this.dN().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cml.a($$8)) {
               eta $$9 = $$1.f($$6);
               etf $$10 = new etf($$2, (double)$$5.v() + $$8, $$4);
               if (cml.a(this.dN(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ir.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public etf b(bre $$0) {
      etf $$1 = a((double)this.dh(), (double)$$0.dh(), this.dD() + ($$0.fs() == bqy.b ? 90.0F : -90.0F));
      etf $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         etf $$3 = a((double)this.dh(), (double)$$0.dh(), this.dD() + ($$0.fs() == bqy.a ? 90.0F : -90.0F));
         etf $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dl();
      }
   }

   protected void a(ayd $$0) {
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if ($$3 == null) {
         $$3 = new bqf.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(boj $$0) {
      return this.ct != $$0;
   }

   public int gX() {
      return this.O();
   }

   @Override
   protected etf a(bql $$0, bqo $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new etf(0.0, 0.15 * (double)this.cN * (double)$$2, -0.7 * (double)this.cN * (double)$$2).b(-this.dD() * (float) (Math.PI / 180.0)));
   }

   public final boj gY() {
      return this.cR;
   }
}
