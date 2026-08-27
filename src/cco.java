import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cco extends cam implements bmg, boq, bpe, bph, bpm {
   public static final int ch = 400;
   public static final int ci = 499;
   public static final int cj = 500;
   public static final double ck = 0.15;
   private static final float bV = (float)b(() -> 0.0);
   private static final float bW = (float)b(() -> 1.0);
   private static final float bY = (float)a(() -> 0.0);
   private static final float bZ = (float)a(() -> 1.0);
   private static final float ca = a($$0 -> 0);
   private static final float cb = a($$0 -> $$0 - 1);
   private static final float cc = 0.25F;
   private static final float cd = 0.5F;
   private static final Predicate<box> ce = $$0 -> $$0 instanceof cco && ((cco)$$0).gF();
   private static final bzn cf = bzn.b().a(16.0).d().a(ce);
   private static final csp cg = csp.a(cpt.pv, cpt.rz, czh.ij.l(), cpt.os, cpt.ug, cpt.pZ, cpt.qa);
   private static final aii<Byte> cx = ail.a(cco.class, aik.a);
   private static final int cy = 2;
   private static final int cz = 4;
   private static final int cA = 8;
   private static final int cB = 16;
   private static final int cC = 32;
   private static final int cD = 64;
   public static final int cl = 0;
   public static final int cm = 1;
   private int cE;
   private int cF;
   private int cG;
   public int cn;
   public int co;
   protected boolean cp;
   protected bmu cq;
   protected int cr;
   protected float cs;
   protected boolean ct;
   private float cH;
   private float cI;
   private float cJ;
   private float cK;
   private float cL;
   private float cM;
   protected boolean cu = true;
   protected int cv;
   @Nullable
   private UUID cN;
   private final bme cO = new eqg() {
      @Override
      public cpq f() {
         return cco.this.fN();
      }

      @Override
      public void a(cpq $$0) {
         cco.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cia $$0) {
         return $$0.cW() == cco.this || $$0.b(cco.this, 4.0);
      }
   };

   protected cco(bol<? extends cco> $$0, cwe $$1) {
      super($$0, $$1);
      this.gH();
   }

   @Override
   protected void B() {
      this.bP.a(1, new bwn(this, 1.2));
      this.bP.a(1, new bwy(this, 1.2));
      this.bP.a(2, new bvg(this, 1.0, cco.class));
      this.bP.a(4, new bvt(this, 1.0));
      this.bP.a(6, new bxh(this, 0.7));
      this.bP.a(7, new bwc(this, cia.class, 6.0F));
      this.bP.a(8, new bwp(this));
      if (this.gr()) {
         this.bP.a(9, new bwq(this));
      }

      this.gB();
   }

   protected void gB() {
      this.bP.a(0, new bvo(this));
      this.bP.a(3, new bxc(this, 1.25, csp.a(cpt.ug, cpt.pZ, cpt.qa), false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cx, (byte)0);
   }

   protected boolean u(int $$0) {
      return (this.am.b(cx) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.am.b(cx);
      if ($$1) {
         this.am.b(cx, (byte)($$2 | $$0));
      } else {
         this.am.b(cx, (byte)($$2 & ~$$0));
      }
   }

   public boolean gA() {
      return this.u(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cN;
   }

   public void b(@Nullable UUID $$0) {
      this.cN = $$0;
   }

   public boolean gC() {
      return this.cp;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.cp = $$0;
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gD()) {
         this.A(false);
      }
   }

   public boolean gD() {
      return this.u(16);
   }

   public boolean gE() {
      return this.u(32);
   }

   public boolean gF() {
      return this.u(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_() && this.gA();
   }

   @Override
   public void a(@Nullable atq $$0) {
      this.cq.a(0, new cpq(cpt.nK));
   }

   public void b(cia $$0, cpq $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         if (!$$0.fW().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.u(4);
   }

   public int gG() {
      return this.cr;
   }

   public void v(int $$0) {
      this.cr = $$0;
   }

   public int w(int $$0) {
      int $$1 = awm.a(this.gG() + $$0, 0, this.gM());
      this.v($$1);
      return $$1;
   }

   @Override
   public boolean bu() {
      return !this.bM();
   }

   private void u() {
      this.gl();
      if (!this.aU()) {
         ato $$0 = this.gs();
         if ($$0 != null) {
            this.dJ().a(null, this.do(), this.dq(), this.du(), $$0, this.cY(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
      if ($$0 > 1.0F) {
         this.a(atp.mr, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bM()) {
            for (bof $$4 : this.cQ()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eH();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return awm.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ac_() {
      return 1;
   }

   protected void gH() {
      bmu $$0 = this.cq;
      this.cq = new bmu(this.ac_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cq.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cpq $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cq.a($$2, $$3.q());
            }
         }
      }

      this.cq.a(this);
      this.gI();
   }

   protected void gI() {
      if (!this.dJ().B) {
         this.d(4, !this.cq.a(0).b());
      }
   }

   @Override
   public void a(bme $$0) {
      boolean $$1 = this.i();
      this.gI();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.Z_(), 0.5F, 1.0F);
      }
   }

   public double gJ() {
      return this.g(bqe.j);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.af.a(3) == 0) {
         this.gQ();
      }

      return $$2;
   }

   protected boolean gr() {
      return true;
   }

   @Nullable
   protected ato gs() {
      return null;
   }

   @Nullable
   protected ato gK() {
      return null;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      if (!$$1.k()) {
         dme $$2 = this.dJ().a_($$0.c());
         dgr $$3 = $$1.w();
         if ($$2.a(czh.dN)) {
            $$3 = $$2.w();
         }

         if (this.bM() && this.cu) {
            this.cv++;
            if (this.cv > 5 && this.cv % 3 == 0) {
               this.a($$3);
            } else if (this.cv <= 5) {
               this.a(atp.mu, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(atp.mu, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(atp.mt, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dgr $$0) {
      return $$0 == dgr.b || $$0 == dgr.aT || $$0 == dgr.B || $$0 == dgr.aU || $$0 == dgr.aS;
   }

   protected void a(dgr $$0) {
      this.a(atp.mo, $$0.a() * 0.15F, $$0.b());
   }

   public static bqd.a gL() {
      return boz.C().a(bqe.j).a(bqe.n, 53.0).a(bqe.o, 0.225F).a(bqe.r, 1.0);
   }

   @Override
   public int fM() {
      return 6;
   }

   public int gM() {
      return 100;
   }

   @Override
   protected float eY() {
      return 0.8F;
   }

   @Override
   public int Q() {
      return 400;
   }

   @Override
   public void b(cia $$0) {
      if (!this.dJ().B && (!this.bM() || this.w($$0)) && this.gA()) {
         $$0.a(this, this.cq);
      }
   }

   public bml c(cia $$0, cpq $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2 & !$$0.fW().d) {
         $$1.h(1);
      }

      if (this.dJ().B) {
         return bml.b;
      } else {
         return $$2 ? bml.a : bml.d;
      }
   }

   protected boolean a(cia $$0, cpq $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cpt.pv)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cpt.rz)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(czh.ij.l())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cpt.os)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cpt.ug)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dJ().B && this.gA() && this.h() == 0 && !this.gp()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cpt.pZ) || $$1.a(cpt.qa)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dJ().B && this.gA() && this.h() == 0 && !this.gp()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.eu() < this.eL() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dJ().a(kb.M, this.d(1.0), this.dr() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dJ().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gA()) && this.gG() < this.gM() && !this.dJ().B) {
         this.w($$5);
         $$2 = true;
      }

      if ($$2) {
         this.u();
         this.b(dqr.m);
      }

      return $$2;
   }

   protected void f(cia $$0) {
      this.A(false);
      this.B(false);
      if (!this.dJ().B) {
         $$0.r(this.dz());
         $$0.s(this.dB());
         $$0.m(this);
      }
   }

   @Override
   public boolean fa() {
      return super.fa() && this.bM() && this.i() || this.gD() || this.gE();
   }

   @Override
   public boolean o(cpq $$0) {
      return cg.a($$0);
   }

   private void w() {
      this.cn = 1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.cq != null) {
         for (int $$0 = 0; $$0 < this.cq.b(); $$0++) {
            cpq $$1 = this.cq.a($$0);
            if (!$$1.b() && !cua.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void d_() {
      if (this.af.a(200) == 0) {
         this.w();
      }

      super.d_();
      if (!this.dJ().B && this.bx()) {
         if (this.af.a(900) == 0 && this.aN == 0) {
            this.c(1.0F);
         }

         if (this.gO()) {
            if (!this.gD() && !this.bM() && this.af.a(300) == 0 && this.dJ().a_(this.dj().d()).a(czh.i)) {
               this.A(true);
            }

            if (this.gD() && ++this.cE > 50) {
               this.cE = 0;
               this.A(false);
            }
         }

         this.gN();
      }
   }

   protected void gN() {
      if (this.gF() && this.o_() && !this.gD()) {
         box $$0 = this.dJ().a(cco.class, cf, this, this.do(), this.dq(), this.du(), this.cE().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bO.a($$0, 0);
         }
      }
   }

   public boolean gO() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cF > 0 && ++this.cF > 30) {
         this.cF = 0;
         this.d(64, false);
      }

      if (this.cV() && this.cG > 0 && ++this.cG > 20) {
         this.cG = 0;
         this.B(false);
      }

      if (this.cn > 0 && ++this.cn > 8) {
         this.cn = 0;
      }

      if (this.co > 0) {
         this.co++;
         if (this.co > 300) {
            this.co = 0;
         }
      }

      this.cI = this.cH;
      if (this.gD()) {
         this.cH = this.cH + (1.0F - this.cH) * 0.4F + 0.05F;
         if (this.cH > 1.0F) {
            this.cH = 1.0F;
         }
      } else {
         this.cH = this.cH + ((0.0F - this.cH) * 0.4F - 0.05F);
         if (this.cH < 0.0F) {
            this.cH = 0.0F;
         }
      }

      this.cK = this.cJ;
      if (this.gE()) {
         this.cH = 0.0F;
         this.cI = this.cH;
         this.cJ = this.cJ + (1.0F - this.cJ) * 0.4F + 0.05F;
         if (this.cJ > 1.0F) {
            this.cJ = 1.0F;
         }
      } else {
         this.ct = false;
         this.cJ = this.cJ + ((0.8F * this.cJ * this.cJ * this.cJ - this.cJ) * 0.6F - 0.05F);
         if (this.cJ < 0.0F) {
            this.cJ = 0.0F;
         }
      }

      this.cM = this.cL;
      if (this.u(64)) {
         this.cL = this.cL + (1.0F - this.cL) * 0.7F + 0.05F;
         if (this.cL > 1.0F) {
            this.cL = 1.0F;
         }
      } else {
         this.cL = this.cL + ((0.0F - this.cL) * 0.7F - 0.05F);
         if (this.cL < 0.0F) {
            this.cL = 0.0F;
         }
      }
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      if (this.bM() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gA() && $$0.fK()) {
         this.b($$0);
         return bml.a(this.dJ().B);
      } else {
         cpq $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bml $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fO() && this.l($$2) && !this.fP()) {
               this.b($$0, $$2);
               return bml.a(this.dJ().B);
            }
         }

         this.f($$0);
         return bml.a(this.dJ().B);
      }
   }

   private void gl() {
      if (!this.dJ().B) {
         this.cF = 1;
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
   public ato gP() {
      return this.y();
   }

   public void gQ() {
      if (this.gr() && this.cV()) {
         this.cG = 1;
         this.B(true);
      }
   }

   public void gR() {
      if (!this.gE()) {
         this.gQ();
         this.b(this.gK());
      }
   }

   public boolean h(cia $$0) {
      this.b($$0.ct());
      this.x(true);
      if ($$0 instanceof apb) {
         am.y.a((apb)$$0, this);
      }

      this.dJ().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cia $$0, eov $$1) {
      super.a($$0, $$1);
      eou $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.M = this.aV = this.aX = this.dz();
      if (this.cU()) {
         if ($$1.e <= 0.0) {
            this.cv = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cs > 0.0F && !this.gC()) {
               this.b(this.cs, $$1);
            }

            this.cs = 0.0F;
         }
      }
   }

   protected eou j(box $$0) {
      return new eou($$0.dB() * 0.5F, $$0.dz());
   }

   @Override
   protected eov b(cia $$0, eov $$1) {
      if (this.aC() && this.cs == 0.0F && this.gE() && !this.ct) {
         return eov.b;
      } else {
         float $$2 = $$0.bl * 0.5F;
         float $$3 = $$0.bn;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new eov((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cia $$0) {
      return (float)this.g(bqe.o);
   }

   protected void b(float $$0, eov $$1) {
      double $$2 = this.gJ() * (double)$$0 * (double)this.aK();
      double $$3 = $$2 + (double)this.fc();
      eov $$4 = this.dm();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.at = true;
      if ($$1.e > 0.0) {
         float $$5 = awm.a(this.dz() * (float) (Math.PI / 180.0));
         float $$6 = awm.b(this.dz() * (float) (Math.PI / 180.0));
         this.g(this.dm().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gS() {
      this.a(atp.mq, 0.4F, 1.0F);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gD());
      $$0.a("Bred", this.gF());
      $$0.a("Temper", this.gG());
      $$0.a("Tame", this.gA());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cq.a(0).b()) {
         $$0.a("SaddleItem", this.cq.a(0).b(new sy()));
      }
   }

   @Override
   public void a(sy $$0) {
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
         $$1 = asr.a(this.cI(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cpq $$4 = cpq.a($$0.p("SaddleItem"));
         if ($$4.a(cpt.nK)) {
            this.cq.a(0, $$4);
         }
      }

      this.gI();
   }

   @Override
   public boolean a(cam $$0) {
      return false;
   }

   protected boolean gT() {
      return !this.bM() && !this.bL() && this.gA() && !this.o_() && this.eu() >= this.eL() && this.gp();
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      return null;
   }

   protected void a(boa $$0, cco $$1) {
      this.a($$0, $$1, bqe.n, (double)ca, (double)cb);
      this.a($$0, $$1, bqe.j, (double)bY, (double)bZ);
      this.a($$0, $$1, bqe.o, (double)bV, (double)bW);
   }

   private void a(boa $$0, cco $$1, il<bpz> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.af);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, awt $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = awm.a($$0, $$2, $$3);
         $$1 = awm.a($$1, $$2, $$3);
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
      return awm.i($$0, this.cI, this.cH);
   }

   public float F(float $$0) {
      return awm.i($$0, this.cK, this.cJ);
   }

   public float G(float $$0) {
      return awm.i($$0, this.cM, this.cL);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.ct = true;
            this.gQ();
         }

         if ($$0 >= 90) {
            this.cs = 1.0F;
         } else {
            this.cs = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.ct = true;
      this.gQ();
      this.gS();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      jz $$1 = $$0 ? kb.O : kb.ab;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dJ().a($$1, this.d(1.0), this.dr() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bof $$0, bof.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof box) {
         ((box)$$0).aV = this.aV;
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
   public boolean e_() {
      return false;
   }

   @Override
   public bpo a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bpo() {
            @Override
            public cpq a() {
               return cco.this.cq.a(0);
            }

            @Override
            public boolean a(cpq $$0) {
               if (!$$0.b() && !$$0.a(cpt.nK)) {
                  return false;
               } else {
                  cco.this.cq.a(0, $$0);
                  cco.this.gI();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cq.b() ? bpo.a(this.cq, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public box cK() {
      if (this.i()) {
         bof var2 = this.cN();
         if (var2 instanceof cia) {
            return (cia)var2;
         }
      }

      return super.cK();
   }

   @Nullable
   private eov a(eov $$0, box $$1) {
      double $$2 = this.do() + $$0.c;
      double $$3 = this.cE().b;
      double $$4 = this.du() + $$0.e;
      ib.a $$5 = new ib.a();
      UnmodifiableIterator var10 = $$1.fC().iterator();

      while (var10.hasNext()) {
         bpi $$6 = (bpi)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cE().e + 0.75;

         do {
            double $$8 = this.dJ().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cjy.a($$8)) {
               eoq $$9 = $$1.f($$6);
               eov $$10 = new eov($$2, (double)$$5.v() + $$8, $$4);
               if (cjy.a(this.dJ(), $$1, $$9.c($$10))) {
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
   public eov b(box $$0) {
      eov $$1 = a((double)this.dd(), (double)$$0.dd(), this.dz() + ($$0.fo() == bor.b ? 90.0F : -90.0F));
      eov $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         eov $$3 = a((double)this.dd(), (double)$$0.dd(), this.dz() + ($$0.fo() == bor.a ? 90.0F : -90.0F));
         eov $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dh();
      }
   }

   protected void a(awt $$0) {
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$3 == null) {
         $$3 = new boa.a(0.2F);
      }

      this.a($$0.F_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bme $$0) {
      return this.cq != $$0;
   }

   public int gU() {
      return this.Q();
   }

   @Override
   protected eov a(bof $$0, boi $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new eov(0.0, 0.15 * (double)this.cK * (double)$$2, -0.7 * (double)this.cK * (double)$$2).b(-this.dz() * (float) (Math.PI / 180.0)));
   }

   public final bme gV() {
      return this.cO;
   }
}
