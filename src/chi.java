import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class chi extends cfe implements bqm, btf, btv, bty, bue {
   public static final int cn = 400;
   public static final int co = 499;
   public static final int cp = 500;
   public static final double cq = 0.15;
   private static final float cc = (float)b(() -> 0.0);
   private static final float cd = (float)b(() -> 1.0);
   private static final float ce = (float)a(() -> 0.0);
   private static final float cg = (float)a(() -> 1.0);
   private static final float ch = a($$0 -> 0);
   private static final float ci = a($$0 -> $$0 - 1);
   private static final float cj = 0.25F;
   private static final float ck = 0.5F;
   private static final Predicate<btn> cl = $$0 -> $$0 instanceof chi && ((chi)$$0).gE();
   private static final cef cm = cef.b().a(16.0).d().a(cl);
   private static final ajw<Byte> cD = aka.a(chi.class, ajy.a);
   private static final int cE = 2;
   private static final int cF = 4;
   private static final int cG = 8;
   private static final int cH = 16;
   private static final int cI = 32;
   private static final int cJ = 64;
   public static final int cr = 0;
   public static final int cs = 1;
   private int cK;
   private int cL;
   private int cM;
   public int ct;
   public int cu;
   protected boolean cv;
   protected bra cw;
   protected int cx;
   protected float cy;
   protected boolean cz;
   private float cN;
   private float cO;
   private float cP;
   private float cQ;
   private float cR;
   private float cS;
   protected boolean cA = true;
   protected int cB;
   @Nullable
   private UUID cT;
   private final bqk cU = new eyn() {
      @Override
      public cuq f() {
         return chi.this.fO();
      }

      @Override
      public void b(cuq $$0) {
         chi.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cmx $$0) {
         return $$0.dc() == chi.this || $$0.b(chi.this, 4.0);
      }
   };

   protected chi(bsx<? extends chi> $$0, dcw $$1) {
      super($$0, $$1);
      this.gH();
   }

   @Override
   protected void B() {
      this.bW.a(1, new cbf(this, 1.2));
      this.bW.a(1, new cbq(this, 1.2));
      this.bW.a(2, new bzy(this, 1.0, chi.class));
      this.bW.a(4, new cal(this, 1.0));
      this.bW.a(6, new cbz(this, 0.7));
      this.bW.a(7, new cau(this, cmx.class, 6.0F));
      this.bW.a(8, new cbh(this));
      if (this.gl()) {
         this.bW.a(9, new cbi(this));
      }

      this.gA();
   }

   protected void gA() {
      this.bW.a(0, new cag(this));
      this.bW.a(3, new cbu(this, 1.25, $$0 -> $$0.a(awn.ag), false));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cD, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.ao.a(cD) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(cD);
      if ($$1) {
         this.ao.a(cD, (byte)($$2 | $$0));
      } else {
         this.ao.a(cD, (byte)($$2 & ~$$0));
      }
   }

   public boolean gz() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID aa_() {
      return this.cT;
   }

   public void b(@Nullable UUID $$0) {
      this.cT = $$0;
   }

   public boolean gB() {
      return this.cv;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   public void z(boolean $$0) {
      this.cv = $$0;
   }

   @Override
   public boolean a(bsr $$0, float $$1) {
      if ($$1 > 6.0F && this.gC()) {
         this.B(false);
      }

      return true;
   }

   public boolean gC() {
      return this.t(16);
   }

   public boolean gD() {
      return this.t(32);
   }

   public boolean gE() {
      return this.t(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bE() && !this.o_() && this.gz();
   }

   @Override
   public void a(cuq $$0, @Nullable avq $$1) {
      this.cw.a(0, $$0);
   }

   public void b(cmx $$0, cuq $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gF() {
      return this.cx;
   }

   public void u(int $$0) {
      this.cx = $$0;
   }

   public int v(int $$0) {
      int $$1 = ayo.a(this.gF() + $$0, 0, this.gL());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bB() {
      return !this.bT();
   }

   private void s() {
      this.x();
      if (!this.aX()) {
         avo $$0 = this.gm();
         if ($$0 != null) {
            this.dO().a(null, this.dt(), this.dv(), this.dz(), $$0, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      if ($$0 > 1.0F) {
         this.a(avp.mP, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bT()) {
            for (bsr $$4 : this.cW()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eJ();
         return true;
      }
   }

   public final int gG() {
      return w(this.af_());
   }

   public static int w(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gH() {
      bra $$0 = this.cw;
      this.cw = new bra(this.gG());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cw.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cuq $$3 = $$0.a($$2);
            if (!$$3.e()) {
               this.cw.a($$2, $$3.s());
            }
         }
      }

      this.cw.a(this);
      this.gI();
   }

   protected void gI() {
      if (!this.dO().B) {
         this.d(4, !this.cw.a(0).e());
      }
   }

   @Override
   public void a(bqk $$0) {
      boolean $$1 = this.i();
      this.gI();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.ac_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ah.a(3) == 0) {
         this.gP();
      }

      return $$2;
   }

   protected boolean gl() {
      return true;
   }

   @Nullable
   protected avo gm() {
      return null;
   }

   @Nullable
   protected avo gJ() {
      return null;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      if (!$$1.k()) {
         dtc $$2 = this.dO().a_($$0.d());
         dnm $$3 = $$1.w();
         if ($$2.a(dga.dN)) {
            $$3 = $$2.w();
         }

         if (this.bT() && this.cA) {
            this.cB++;
            if (this.cB > 5 && this.cB % 3 == 0) {
               this.a($$3);
            } else if (this.cB <= 5) {
               this.a(avp.mS, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avp.mS, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avp.mR, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dnm $$0) {
      return $$0 == dnm.b || $$0 == dnm.aT || $$0 == dnm.B || $$0 == dnm.aU || $$0 == dnm.aS;
   }

   protected void a(dnm $$0) {
      this.a(avp.mM, $$0.a() * 0.15F, $$0.b());
   }

   public static buv.a gK() {
      return btp.C().a(buw.o, 0.7).a(buw.s, 53.0).a(buw.v, 0.225F).a(buw.B, 1.0).a(buw.x, 6.0).a(buw.k, 0.5);
   }

   @Override
   public int fN() {
      return 6;
   }

   public int gL() {
      return 100;
   }

   @Override
   protected float fa() {
      return 0.8F;
   }

   @Override
   public int R() {
      return 400;
   }

   @Override
   public void b(cmx $$0) {
      if (!this.dO().B && (!this.bT() || this.x($$0)) && this.gz()) {
         $$0.a(this, this.cw);
      }
   }

   public bqr c(cmx $$0, cuq $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dO().B) {
         return bqr.c;
      } else {
         return $$2 ? bqr.a : bqr.e;
      }
   }

   protected boolean a(cmx $$0, cuq $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cut.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cut.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dga.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cut.ou)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cut.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dO().B && this.gz() && this.g() == 0 && !this.gs()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cut.qa) || $$1.a(cut.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dO().B && this.gz() && this.g() == 0 && !this.gs()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.ew() < this.eN() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dO().a(lm.O, this.d(1.0), this.dw() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dO().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gz()) && this.gF() < this.gL() && !this.dO().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.s();
         this.a(dxz.m);
      }

      return $$2;
   }

   protected void a(cmx $$0) {
      this.B(false);
      this.C(false);
      if (!this.dO().B) {
         $$0.t(this.dE());
         $$0.u(this.dG());
         $$0.n(this);
      }
   }

   @Override
   public boolean fc() {
      return super.fc() && this.bT() && this.i() || this.gC() || this.gD();
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.af);
   }

   private void t() {
      this.ct = 1;
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.cw != null) {
         for (int $$0 = 0; $$0 < this.cw.b(); $$0++) {
            cuq $$1 = this.cw.a($$0);
            if (!$$1.e() && !dae.a($$1, dad.D)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void m_() {
      if (this.ah.a(200) == 0) {
         this.t();
      }

      super.m_();
      if (!this.dO().B && this.bE()) {
         if (this.ah.a(900) == 0 && this.aQ == 0) {
            this.c(1.0F);
         }

         if (this.gN()) {
            if (!this.gC() && !this.bT() && this.ah.a(300) == 0 && this.dO().a_(this.do().e()).a(dga.i)) {
               this.B(true);
            }

            if (this.gC() && ++this.cK > 50) {
               this.cK = 0;
               this.B(false);
            }
         }

         this.gM();
      }
   }

   protected void gM() {
      if (this.gE() && this.o_() && !this.gC()) {
         btn $$0 = this.dO().a(chi.class, cm, this, this.dt(), this.dv(), this.dz(), this.cK().g(16.0));
         if ($$0 != null && this.g($$0) > 4.0) {
            this.bV.a($$0, 0);
         }
      }
   }

   public boolean gN() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cL > 0 && ++this.cL > 30) {
         this.cL = 0;
         this.d(64, false);
      }

      if (this.db() && this.cM > 0 && ++this.cM > 20) {
         this.cM = 0;
         this.C(false);
      }

      if (this.ct > 0 && ++this.ct > 8) {
         this.ct = 0;
      }

      if (this.cu > 0) {
         this.cu++;
         if (this.cu > 300) {
            this.cu = 0;
         }
      }

      this.cO = this.cN;
      if (this.gC()) {
         this.cN = this.cN + (1.0F - this.cN) * 0.4F + 0.05F;
         if (this.cN > 1.0F) {
            this.cN = 1.0F;
         }
      } else {
         this.cN = this.cN + ((0.0F - this.cN) * 0.4F - 0.05F);
         if (this.cN < 0.0F) {
            this.cN = 0.0F;
         }
      }

      this.cQ = this.cP;
      if (this.gD()) {
         this.cN = 0.0F;
         this.cO = this.cN;
         this.cP = this.cP + (1.0F - this.cP) * 0.4F + 0.05F;
         if (this.cP > 1.0F) {
            this.cP = 1.0F;
         }
      } else {
         this.cz = false;
         this.cP = this.cP + ((0.8F * this.cP * this.cP * this.cP - this.cP) * 0.6F - 0.05F);
         if (this.cP < 0.0F) {
            this.cP = 0.0F;
         }
      }

      this.cS = this.cR;
      if (this.t(64)) {
         this.cR = this.cR + (1.0F - this.cR) * 0.7F + 0.05F;
         if (this.cR > 1.0F) {
            this.cR = 1.0F;
         }
      } else {
         this.cR = this.cR + ((0.0F - this.cR) * 0.7F - 0.05F);
         if (this.cR < 0.0F) {
            this.cR = 0.0F;
         }
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      if (this.bT() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gz() && $$0.fN()) {
         this.b($$0);
         return bqr.a(this.dO().B);
      } else {
         cuq $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqr $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.d(bsy.g) && this.l($$2) && !this.fP()) {
               this.b($$0, $$2);
               return bqr.a(this.dO().B);
            }
         }

         this.a($$0);
         return bqr.a(this.dO().B);
      }
   }

   private void x() {
      if (!this.dO().B) {
         this.cL = 1;
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
   public avo gO() {
      return this.v();
   }

   public void gP() {
      if (this.gl() && this.db()) {
         this.cM = 1;
         this.C(true);
      }
   }

   public void gQ() {
      if (!this.gD()) {
         this.gP();
         this.b(this.gJ());
      }
   }

   public boolean g(cmx $$0) {
      this.b($$0.cz());
      this.y(true);
      if ($$0 instanceof aqv) {
         an.y.a((aqv)$$0, this);
      }

      this.dO().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cmx $$0, exc $$1) {
      super.a($$0, $$1);
      exb $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aY = this.ba = this.dE();
      if (this.da()) {
         if ($$1.e <= 0.0) {
            this.cB = 0;
         }

         if (this.aF()) {
            this.z(false);
            if (this.cy > 0.0F && !this.gB()) {
               this.b(this.cy, $$1);
            }

            this.cy = 0.0F;
         }
      }
   }

   protected exb j(btn $$0) {
      return new exb($$0.dG() * 0.5F, $$0.dE());
   }

   @Override
   protected exc b(cmx $$0, exc $$1) {
      if (this.aF() && this.cy == 0.0F && this.gD() && !this.cz) {
         return exc.b;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new exc((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cmx $$0) {
      return (float)this.g(buw.v);
   }

   protected void b(float $$0, exc $$1) {
      double $$2 = (double)this.y($$0);
      exc $$3 = this.dr();
      this.n($$3.c, $$2, $$3.e);
      this.z(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = ayo.a(this.dE() * (float) (Math.PI / 180.0));
         float $$5 = ayo.b(this.dE() * (float) (Math.PI / 180.0));
         this.i(this.dr().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gR() {
      this.a(avp.mO, 0.4F, 1.0F);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gC());
      $$0.a("Bred", this.gE());
      $$0.a("Temper", this.gF());
      $$0.a("Tame", this.gz());
      if (this.aa_() != null) {
         $$0.a("Owner", this.aa_());
      }

      if (!this.cw.a(0).e()) {
         $$0.a("SaddleItem", this.cw.a(0).a(this.dQ()));
      }
   }

   @Override
   public void a(ub $$0) {
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
         $$1 = auq.a(this.cO(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cuq $$4 = cuq.a(this.dQ(), (uy)$$0.p("SaddleItem")).orElse(cuq.l);
         if ($$4.a(cut.nL)) {
            this.cw.a(0, $$4);
         }
      }

      this.gI();
   }

   @Override
   public boolean a(cfe $$0) {
      return false;
   }

   protected boolean gS() {
      return !this.bT() && !this.bS() && this.gz() && !this.o_() && this.ew() >= this.eN() && this.gs();
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return null;
   }

   protected void a(bsl $$0, chi $$1) {
      this.a($$0, $$1, buw.s, (double)ch, (double)ci);
      this.a($$0, $$1, buw.o, (double)ce, (double)cg);
      this.a($$0, $$1, buw.v, (double)cc, (double)cd);
   }

   private void a(bsl $$0, chi $$1, jm<bur> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ayw $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayo.a($$0, $$2, $$3);
         $$1 = ayo.a($$1, $$2, $$3);
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

   public float H(float $$0) {
      return ayo.i($$0, this.cO, this.cN);
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cQ, this.cP);
   }

   public float J(float $$0) {
      return ayo.i($$0, this.cS, this.cR);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cz = true;
            this.gP();
         }

         if ($$0 >= 90) {
            this.cy = 1.0F;
         } else {
            this.cy = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cz = true;
      this.gP();
      this.gR();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      lk $$1 = $$0 ? lm.Q : lm.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dO().a($$1, this.d(1.0), this.dw() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bsr $$0, bsr.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btn) {
         ((btn)$$0).aY = this.aY;
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
   public bug a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bug() {
            @Override
            public cuq a() {
               return chi.this.cw.a(0);
            }

            @Override
            public boolean a(cuq $$0) {
               if (!$$0.e() && !$$0.a(cut.nL)) {
                  return false;
               } else {
                  chi.this.cw.a(0, $$0);
                  chi.this.gI();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cw.b() ? bug.a(this.cw, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public btn cQ() {
      if (this.i()) {
         bsr var2 = this.cT();
         if (var2 instanceof cmx) {
            return (cmx)var2;
         }
      }

      return super.cQ();
   }

   @Nullable
   private exc a(exc $$0, btn $$1) {
      double $$2 = this.dt() + $$0.c;
      double $$3 = this.cK().b;
      double $$4 = this.dz() + $$0.e;
      jd.a $$5 = new jd.a();
      UnmodifiableIterator var10 = $$1.fE().iterator();

      while (var10.hasNext()) {
         bua $$6 = (bua)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cK().e + 0.75;

         do {
            double $$8 = this.dO().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (coy.a($$8)) {
               ewx $$9 = $$1.f($$6);
               exc $$10 = new exc($$2, (double)$$5.v() + $$8, $$4);
               if (coy.a(this.dO(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ji.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public exc b(btn $$0) {
      exc $$1 = a((double)this.dj(), (double)$$0.dj(), this.dE() + ($$0.fq() == btg.b ? 90.0F : -90.0F));
      exc $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         exc $$3 = a((double)this.dj(), (double)$$0.dj(), this.dE() + ($$0.fq() == btg.a ? 90.0F : -90.0F));
         exc $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dm();
      }
   }

   protected void a(ayw $$0) {
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsl.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bqk $$0) {
      return this.cw != $$0;
   }

   public int gT() {
      return this.R();
   }

   @Override
   protected exc a(bsr $$0, bsu $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new exc(0.0, 0.15 * (double)this.cQ * (double)$$2, -0.7 * (double)this.cQ * (double)$$2).b(-this.dE() * (float) (Math.PI / 180.0)));
   }

   public final bqk gU() {
      return this.cU;
   }

   public int af_() {
      return 0;
   }
}
