import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class chi extends cfe implements bqm, btf, btv, bty, bue {
   public static final int cl = 400;
   public static final int cm = 499;
   public static final int cn = 500;
   public static final double co = 0.15;
   private static final float ca = (float)b(() -> 0.0);
   private static final float cb = (float)b(() -> 1.0);
   private static final float cc = (float)a(() -> 0.0);
   private static final float ce = (float)a(() -> 1.0);
   private static final float cf = a($$0 -> 0);
   private static final float cg = a($$0 -> $$0 - 1);
   private static final float ch = 0.25F;
   private static final float ci = 0.5F;
   private static final Predicate<btn> cj = $$0 -> $$0 instanceof chi && ((chi)$$0).gF();
   private static final cef ck = cef.b().a(16.0).d().a(cj);
   private static final ajw<Byte> cB = aka.a(chi.class, ajy.a);
   private static final int cC = 2;
   private static final int cD = 4;
   private static final int cE = 8;
   private static final int cF = 16;
   private static final int cG = 32;
   private static final int cH = 64;
   public static final int cp = 0;
   public static final int cq = 1;
   private int cI;
   private int cJ;
   private int cK;
   public int cr;
   public int cs;
   protected boolean ct;
   protected bra cu;
   protected int cv;
   protected float cw;
   protected boolean cx;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   private float cP;
   private float cQ;
   protected boolean cy = true;
   protected int cz;
   @Nullable
   private UUID cR;
   private final bqk cS = new eyl() {
      @Override
      public cuq f() {
         return chi.this.fP();
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
         return $$0.dd() == chi.this || $$0.b(chi.this, 4.0);
      }
   };

   protected chi(bsx<? extends chi> $$0, dcw $$1) {
      super($$0, $$1);
      this.gI();
   }

   @Override
   protected void B() {
      this.bU.a(1, new cbf(this, 1.2));
      this.bU.a(1, new cbq(this, 1.2));
      this.bU.a(2, new bzy(this, 1.0, chi.class));
      this.bU.a(4, new cal(this, 1.0));
      this.bU.a(6, new cbz(this, 0.7));
      this.bU.a(7, new cau(this, cmx.class, 6.0F));
      this.bU.a(8, new cbh(this));
      if (this.gm()) {
         this.bU.a(9, new cbi(this));
      }

      this.gB();
   }

   protected void gB() {
      this.bU.a(0, new cag(this));
      this.bU.a(3, new cbu(this, 1.25, $$0 -> $$0.a(awn.ag), false));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cB, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.ao.a(cB) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(cB);
      if ($$1) {
         this.ao.a(cB, (byte)($$2 | $$0));
      } else {
         this.ao.a(cB, (byte)($$2 & ~$$0));
      }
   }

   public boolean gA() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID aa_() {
      return this.cR;
   }

   public void b(@Nullable UUID $$0) {
      this.cR = $$0;
   }

   public boolean gC() {
      return this.ct;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.ct = $$0;
   }

   @Override
   public boolean a(bsr $$0, float $$1) {
      if ($$1 > 6.0F && this.gD()) {
         this.A(false);
      }

      return true;
   }

   public boolean gD() {
      return this.t(16);
   }

   public boolean gE() {
      return this.t(32);
   }

   public boolean gF() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bE() && !this.o_() && this.gA();
   }

   @Override
   public void a(cuq $$0, @Nullable avq $$1) {
      this.cu.a(0, $$0);
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

   public int gG() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   public int v(int $$0) {
      int $$1 = ayo.a(this.gG() + $$0, 0, this.gM());
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
         avo $$0 = this.gn();
         if ($$0 != null) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), $$0, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
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
            for (bsr $$4 : this.cX()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eK();
         return true;
      }
   }

   public final int gH() {
      return w(this.af_());
   }

   public static int w(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gI() {
      bra $$0 = this.cu;
      this.cu = new bra(this.gH());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cu.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cuq $$3 = $$0.a($$2);
            if (!$$3.e()) {
               this.cu.a($$2, $$3.s());
            }
         }
      }

      this.cu.a(this);
      this.gJ();
   }

   protected void gJ() {
      if (!this.dP().B) {
         this.d(4, !this.cu.a(0).e());
      }
   }

   @Override
   public void a(bqk $$0) {
      boolean $$1 = this.i();
      this.gJ();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.ac_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ah.a(3) == 0) {
         this.gQ();
      }

      return $$2;
   }

   protected boolean gm() {
      return true;
   }

   @Nullable
   protected avo gn() {
      return null;
   }

   @Nullable
   protected avo gK() {
      return null;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      if (!$$1.k()) {
         dtc $$2 = this.dP().a_($$0.d());
         dnm $$3 = $$1.w();
         if ($$2.a(dga.dN)) {
            $$3 = $$2.w();
         }

         if (this.bT() && this.cy) {
            this.cz++;
            if (this.cz > 5 && this.cz % 3 == 0) {
               this.a($$3);
            } else if (this.cz <= 5) {
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

   public static buv.a gL() {
      return btp.C().a(buw.o, 0.7).a(buw.s, 53.0).a(buw.v, 0.225F).a(buw.B, 1.0).a(buw.x, 6.0).a(buw.k, 0.5);
   }

   @Override
   public int fO() {
      return 6;
   }

   public int gM() {
      return 100;
   }

   @Override
   protected float fb() {
      return 0.8F;
   }

   @Override
   public int R() {
      return 400;
   }

   @Override
   public void b(cmx $$0) {
      if (!this.dP().B && (!this.bT() || this.x($$0)) && this.gA()) {
         $$0.a(this, this.cu);
      }
   }

   public bqr c(cmx $$0, cuq $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dP().B) {
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
         if (!this.dP().B && this.gA() && this.g() == 0 && !this.gt()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cut.qa) || $$1.a(cut.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dP().B && this.gA() && this.g() == 0 && !this.gt()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.ex() < this.eO() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dP().a(lm.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dP().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gA()) && this.gG() < this.gM() && !this.dP().B) {
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
      this.A(false);
      this.B(false);
      if (!this.dP().B) {
         $$0.t(this.dF());
         $$0.u(this.dH());
         $$0.n(this);
      }
   }

   @Override
   public boolean fd() {
      return super.fd() && this.bT() && this.i() || this.gD() || this.gE();
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.af);
   }

   private void t() {
      this.cr = 1;
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.cu != null) {
         for (int $$0 = 0; $$0 < this.cu.b(); $$0++) {
            cuq $$1 = this.cu.a($$0);
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
      if (!this.dP().B && this.bE()) {
         if (this.ah.a(900) == 0 && this.aQ == 0) {
            this.c(1.0F);
         }

         if (this.gO()) {
            if (!this.gD() && !this.bT() && this.ah.a(300) == 0 && this.dP().a_(this.dp().e()).a(dga.i)) {
               this.A(true);
            }

            if (this.gD() && ++this.cI > 50) {
               this.cI = 0;
               this.A(false);
            }
         }

         this.gN();
      }
   }

   protected void gN() {
      if (this.gF() && this.o_() && !this.gD()) {
         btn $$0 = this.dP().a(chi.class, ck, this, this.du(), this.dw(), this.dA(), this.cL().g(16.0));
         if ($$0 != null && this.g($$0) > 4.0) {
            this.bT.a($$0, 0);
         }
      }
   }

   public boolean gO() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cJ > 0 && ++this.cJ > 30) {
         this.cJ = 0;
         this.d(64, false);
      }

      if (this.dc() && this.cK > 0 && ++this.cK > 20) {
         this.cK = 0;
         this.B(false);
      }

      if (this.cr > 0 && ++this.cr > 8) {
         this.cr = 0;
      }

      if (this.cs > 0) {
         this.cs++;
         if (this.cs > 300) {
            this.cs = 0;
         }
      }

      this.cM = this.cL;
      if (this.gD()) {
         this.cL = this.cL + (1.0F - this.cL) * 0.4F + 0.05F;
         if (this.cL > 1.0F) {
            this.cL = 1.0F;
         }
      } else {
         this.cL = this.cL + ((0.0F - this.cL) * 0.4F - 0.05F);
         if (this.cL < 0.0F) {
            this.cL = 0.0F;
         }
      }

      this.cO = this.cN;
      if (this.gE()) {
         this.cL = 0.0F;
         this.cM = this.cL;
         this.cN = this.cN + (1.0F - this.cN) * 0.4F + 0.05F;
         if (this.cN > 1.0F) {
            this.cN = 1.0F;
         }
      } else {
         this.cx = false;
         this.cN = this.cN + ((0.8F * this.cN * this.cN * this.cN - this.cN) * 0.6F - 0.05F);
         if (this.cN < 0.0F) {
            this.cN = 0.0F;
         }
      }

      this.cQ = this.cP;
      if (this.t(64)) {
         this.cP = this.cP + (1.0F - this.cP) * 0.7F + 0.05F;
         if (this.cP > 1.0F) {
            this.cP = 1.0F;
         }
      } else {
         this.cP = this.cP + ((0.0F - this.cP) * 0.7F - 0.05F);
         if (this.cP < 0.0F) {
            this.cP = 0.0F;
         }
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      if (this.bT() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gA() && $$0.fO()) {
         this.b($$0);
         return bqr.a(this.dP().B);
      } else {
         cuq $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqr $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.d(bsy.g) && this.l($$2) && !this.fQ()) {
               this.b($$0, $$2);
               return bqr.a(this.dP().B);
            }
         }

         this.a($$0);
         return bqr.a(this.dP().B);
      }
   }

   private void x() {
      if (!this.dP().B) {
         this.cJ = 1;
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
   public avo gP() {
      return this.v();
   }

   public void gQ() {
      if (this.gm() && this.dc()) {
         this.cK = 1;
         this.B(true);
      }
   }

   public void gR() {
      if (!this.gE()) {
         this.gQ();
         this.b(this.gK());
      }
   }

   public boolean g(cmx $$0) {
      this.b($$0.cA());
      this.x(true);
      if ($$0 instanceof aqv) {
         an.y.a((aqv)$$0, this);
      }

      this.dP().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cmx $$0, exa $$1) {
      super.a($$0, $$1);
      ewz $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aY = this.ba = this.dF();
      if (this.db()) {
         if ($$1.e <= 0.0) {
            this.cz = 0;
         }

         if (this.aF()) {
            this.y(false);
            if (this.cw > 0.0F && !this.gC()) {
               this.b(this.cw, $$1);
            }

            this.cw = 0.0F;
         }
      }
   }

   protected ewz j(btn $$0) {
      return new ewz($$0.dH() * 0.5F, $$0.dF());
   }

   @Override
   protected exa b(cmx $$0, exa $$1) {
      if (this.aF() && this.cw == 0.0F && this.gE() && !this.cx) {
         return exa.b;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new exa((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cmx $$0) {
      return (float)this.g(buw.v);
   }

   protected void b(float $$0, exa $$1) {
      double $$2 = (double)this.y($$0);
      exa $$3 = this.ds();
      this.n($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = ayo.a(this.dF() * (float) (Math.PI / 180.0));
         float $$5 = ayo.b(this.dF() * (float) (Math.PI / 180.0));
         this.i(this.ds().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gS() {
      this.a(avp.mO, 0.4F, 1.0F);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gD());
      $$0.a("Bred", this.gF());
      $$0.a("Temper", this.gG());
      $$0.a("Tame", this.gA());
      if (this.aa_() != null) {
         $$0.a("Owner", this.aa_());
      }

      if (!this.cu.a(0).e()) {
         $$0.a("SaddleItem", this.cu.a(0).a(this.dR()));
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.u($$0.h("Temper"));
      this.x($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = auq.a(this.cP(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cuq $$4 = cuq.a(this.dR(), (uy)$$0.p("SaddleItem")).orElse(cuq.l);
         if ($$4.a(cut.nL)) {
            this.cu.a(0, $$4);
         }
      }

      this.gJ();
   }

   @Override
   public boolean a(cfe $$0) {
      return false;
   }

   protected boolean gT() {
      return !this.bT() && !this.bS() && this.gA() && !this.o_() && this.ex() >= this.eO() && this.gt();
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return null;
   }

   protected void a(bsl $$0, chi $$1) {
      this.a($$0, $$1, buw.s, (double)cf, (double)cg);
      this.a($$0, $$1, buw.o, (double)cc, (double)ce);
      this.a($$0, $$1, buw.v, (double)ca, (double)cb);
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
      return ayo.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cO, this.cN);
   }

   public float J(float $$0) {
      return ayo.i($$0, this.cQ, this.cP);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cx = true;
            this.gQ();
         }

         if ($$0 >= 90) {
            this.cw = 1.0F;
         } else {
            this.cw = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cx = true;
      this.gQ();
      this.gS();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lk $$1 = $$0 ? lm.Q : lm.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dP().a($$1, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
               return chi.this.cu.a(0);
            }

            @Override
            public boolean a(cuq $$0) {
               if (!$$0.e() && !$$0.a(cut.nL)) {
                  return false;
               } else {
                  chi.this.cu.a(0, $$0);
                  chi.this.gJ();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cu.b() ? bug.a(this.cu, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public btn cR() {
      if (this.i()) {
         bsr var2 = this.cU();
         if (var2 instanceof cmx) {
            return (cmx)var2;
         }
      }

      return super.cR();
   }

   @Nullable
   private exa a(exa $$0, btn $$1) {
      double $$2 = this.du() + $$0.c;
      double $$3 = this.cL().b;
      double $$4 = this.dA() + $$0.e;
      jd.a $$5 = new jd.a();
      UnmodifiableIterator var10 = $$1.fF().iterator();

      while (var10.hasNext()) {
         bua $$6 = (bua)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cL().e + 0.75;

         do {
            double $$8 = this.dP().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (coy.a($$8)) {
               ewv $$9 = $$1.f($$6);
               exa $$10 = new exa($$2, (double)$$5.v() + $$8, $$4);
               if (coy.a(this.dP(), $$1, $$9.c($$10))) {
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
   public exa b(btn $$0) {
      exa $$1 = a((double)this.dk(), (double)$$0.dk(), this.dF() + ($$0.fr() == btg.b ? 90.0F : -90.0F));
      exa $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         exa $$3 = a((double)this.dk(), (double)$$0.dk(), this.dF() + ($$0.fr() == btg.a ? 90.0F : -90.0F));
         exa $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dn();
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
      return this.cu != $$0;
   }

   public int gU() {
      return this.R();
   }

   @Override
   protected exa a(bsr $$0, bsu $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new exa(0.0, 0.15 * (double)this.cO * (double)$$2, -0.7 * (double)this.cO * (double)$$2).b(-this.dF() * (float) (Math.PI / 180.0)));
   }

   public final bqk gV() {
      return this.cS;
   }

   public int af_() {
      return 0;
   }
}
