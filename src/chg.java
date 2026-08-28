import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class chg extends cfc implements bql, bte, btt, btw, buc {
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
   private static final Predicate<btl> cj = $$0 -> $$0 instanceof chg && ((chg)$$0).gG();
   private static final ced ck = ced.b().a(16.0).d().a(cj);
   private static final ajv<Byte> cB = ajz.a(chg.class, ajx.a);
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
   protected bqz cu;
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
   private final bqj cS = new eyh() {
      @Override
      public cuo f() {
         return chg.this.fN();
      }

      @Override
      public void b(cuo $$0) {
         chg.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cmv $$0) {
         return $$0.dd() == chg.this || $$0.b(chg.this, 4.0);
      }
   };

   protected chg(bsw<? extends chg> $$0, dcu $$1) {
      super($$0, $$1);
      this.gI();
   }

   @Override
   protected void z() {
      this.bU.a(1, new cbd(this, 1.2));
      this.bU.a(1, new cbo(this, 1.2));
      this.bU.a(2, new bzw(this, 1.0, chg.class));
      this.bU.a(4, new caj(this, 1.0));
      this.bU.a(6, new cbx(this, 0.7));
      this.bU.a(7, new cas(this, cmv.class, 6.0F));
      this.bU.a(8, new cbf(this));
      if (this.gn()) {
         this.bU.a(9, new cbg(this));
      }

      this.gC();
   }

   protected void gC() {
      this.bU.a(0, new cae(this));
      this.bU.a(3, new cbs(this, 1.25, $$0 -> $$0.a(awm.ag), false));
   }

   @Override
   protected void a(ajz.a $$0) {
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

   public boolean gB() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID W_() {
      return this.cR;
   }

   public void b(@Nullable UUID $$0) {
      this.cR = $$0;
   }

   public boolean gD() {
      return this.ct;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.ct = $$0;
   }

   @Override
   protected void G(float $$0) {
      if ($$0 > 6.0F && this.gE()) {
         this.A(false);
      }
   }

   public boolean gE() {
      return this.t(16);
   }

   public boolean gF() {
      return this.t(32);
   }

   public boolean gG() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bE() && !this.o_() && this.gB();
   }

   @Override
   public void a(@Nullable avp $$0) {
      this.cu.a(0, new cuo(cur.nL));
   }

   public void b(cmv $$0, cuo $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gH() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   public int v(int $$0) {
      int $$1 = ayn.a(this.gH() + $$0, 0, this.gM());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bB() {
      return !this.bT();
   }

   private void s() {
      this.gm();
      if (!this.aX()) {
         avn $$0 = this.go();
         if ($$0 != null) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$0, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
      if ($$0 > 1.0F) {
         this.a(avo.mP, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bT()) {
            for (bsq $$4 : this.cX()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eK();
         return true;
      }
   }

   protected int ab_() {
      return 1;
   }

   protected void gI() {
      bqz $$0 = this.cu;
      this.cu = new bqz(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cu.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cuo $$3 = $$0.a($$2);
            if (!$$3.e()) {
               this.cu.a($$2, $$3.s());
            }
         }
      }

      this.cu.a(this);
      this.gJ();
   }

   protected void gJ() {
      if (!this.dQ().B) {
         this.d(4, !this.cu.a(0).e());
      }
   }

   @Override
   public void a(bqj $$0) {
      boolean $$1 = this.i();
      this.gJ();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ah.a(3) == 0) {
         this.gQ();
      }

      return $$2;
   }

   protected boolean gn() {
      return true;
   }

   @Nullable
   protected avn go() {
      return null;
   }

   @Nullable
   protected avn gK() {
      return null;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      if (!$$1.k()) {
         dta $$2 = this.dQ().a_($$0.c());
         dnk $$3 = $$1.w();
         if ($$2.a(dfy.dN)) {
            $$3 = $$2.w();
         }

         if (this.bT() && this.cy) {
            this.cz++;
            if (this.cz > 5 && this.cz % 3 == 0) {
               this.a($$3);
            } else if (this.cz <= 5) {
               this.a(avo.mS, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avo.mS, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avo.mR, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dnk $$0) {
      return $$0 == dnk.b || $$0 == dnk.aT || $$0 == dnk.B || $$0 == dnk.aU || $$0 == dnk.aS;
   }

   protected void a(dnk $$0) {
      this.a(avo.mM, $$0.a() * 0.15F, $$0.b());
   }

   public static but.a gL() {
      return btn.A().a(buu.o, 0.7).a(buu.s, 53.0).a(buu.v, 0.225F).a(buu.B, 1.0).a(buu.x, 6.0).a(buu.k, 0.5);
   }

   @Override
   public int af() {
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
   public int P() {
      return 400;
   }

   @Override
   public void b(cmv $$0) {
      if (!this.dQ().B && (!this.bT() || this.x($$0)) && this.gB()) {
         $$0.a(this, this.cu);
      }
   }

   public bqq c(cmv $$0, cuo $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dQ().B) {
         return bqq.c;
      } else {
         return $$2 ? bqq.a : bqq.e;
      }
   }

   protected boolean a(cmv $$0, cuo $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cur.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cur.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dfy.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cur.ou)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cur.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dQ().B && this.gB() && this.g() == 0 && !this.gu()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cur.qa) || $$1.a(cur.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dQ().B && this.gB() && this.g() == 0 && !this.gu()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ex() < this.eO() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dQ().a(lm.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dQ().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gB()) && this.gH() < this.gM() && !this.dQ().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.s();
         this.a(dxw.m);
      }

      return $$2;
   }

   protected void f(cmv $$0) {
      this.A(false);
      this.B(false);
      if (!this.dQ().B) {
         $$0.s(this.dG());
         $$0.t(this.dI());
         $$0.n(this);
      }
   }

   @Override
   public boolean fd() {
      return super.fd() && this.bT() && this.i() || this.gE() || this.gF();
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.af);
   }

   private void t() {
      this.cr = 1;
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.cu != null) {
         for (int $$0 = 0; $$0 < this.cu.b(); $$0++) {
            cuo $$1 = this.cu.a($$0);
            if (!$$1.e() && !dac.a($$1, dab.D)) {
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
      if (!this.dQ().B && this.bE()) {
         if (this.ah.a(900) == 0 && this.aQ == 0) {
            this.c(1.0F);
         }

         if (this.gO()) {
            if (!this.gE() && !this.bT() && this.ah.a(300) == 0 && this.dQ().a_(this.dq().d()).a(dfy.i)) {
               this.A(true);
            }

            if (this.gE() && ++this.cI > 50) {
               this.cI = 0;
               this.A(false);
            }
         }

         this.gN();
      }
   }

   protected void gN() {
      if (this.gG() && this.o_() && !this.gE()) {
         btl $$0 = this.dQ().a(chg.class, ck, this, this.dv(), this.dx(), this.dB(), this.cL().g(16.0));
         if ($$0 != null && this.g((bsq)$$0) > 4.0) {
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
      if (this.gE()) {
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
      if (this.gF()) {
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
   public bqq b(cmv $$0, bqp $$1) {
      if (this.bT() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gB() && $$0.fO()) {
         this.b($$0);
         return bqq.a(this.dQ().B);
      } else {
         cuo $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqq $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.d(bsx.g) && this.l($$2) && !this.fO()) {
               this.b($$0, $$2);
               return bqq.a(this.dQ().B);
            }
         }

         this.f($$0);
         return bqq.a(this.dQ().B);
      }
   }

   private void gm() {
      if (!this.dQ().B) {
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
   public avn gP() {
      return this.v();
   }

   public void gQ() {
      if (this.gn() && this.dc()) {
         this.cK = 1;
         this.B(true);
      }
   }

   public void gR() {
      if (!this.gF()) {
         this.gQ();
         this.b(this.gK());
      }
   }

   public boolean h(cmv $$0) {
      this.b($$0.cA());
      this.x(true);
      if ($$0 instanceof aqu) {
         an.y.a((aqu)$$0, this);
      }

      this.dQ().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cmv $$0, eww $$1) {
      super.a($$0, $$1);
      ewv $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aY = this.ba = this.dG();
      if (this.db()) {
         if ($$1.e <= 0.0) {
            this.cz = 0;
         }

         if (this.aF()) {
            this.y(false);
            if (this.cw > 0.0F && !this.gD()) {
               this.b(this.cw, $$1);
            }

            this.cw = 0.0F;
         }
      }
   }

   protected ewv j(btl $$0) {
      return new ewv($$0.dI() * 0.5F, $$0.dG());
   }

   @Override
   protected eww b(cmv $$0, eww $$1) {
      if (this.aF() && this.cw == 0.0F && this.gF() && !this.cx) {
         return eww.b;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new eww((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cmv $$0) {
      return (float)this.g(buu.v);
   }

   protected void b(float $$0, eww $$1) {
      double $$2 = (double)this.x($$0);
      eww $$3 = this.dt();
      this.n($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = ayn.a(this.dG() * (float) (Math.PI / 180.0));
         float $$5 = ayn.b(this.dG() * (float) (Math.PI / 180.0));
         this.i(this.dt().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gS() {
      this.a(avo.mO, 0.4F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gE());
      $$0.a("Bred", this.gG());
      $$0.a("Temper", this.gH());
      $$0.a("Tame", this.gB());
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      if (!this.cu.a(0).e()) {
         $$0.a("SaddleItem", this.cu.a(0).a(this.dS()));
      }
   }

   @Override
   public void a(ua $$0) {
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
         $$1 = aup.a(this.cP(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cuo $$4 = cuo.a(this.dS(), (ux)$$0.p("SaddleItem")).orElse(cuo.l);
         if ($$4.a(cur.nL)) {
            this.cu.a(0, $$4);
         }
      }

      this.gJ();
   }

   @Override
   public boolean a(cfc $$0) {
      return false;
   }

   protected boolean gT() {
      return !this.bT() && !this.bS() && this.gB() && !this.o_() && this.ex() >= this.eO() && this.gu();
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      return null;
   }

   protected void a(bsk $$0, chg $$1) {
      this.a($$0, $$1, buu.s, (double)cf, (double)cg);
      this.a($$0, $$1, buu.o, (double)cc, (double)ce);
      this.a($$0, $$1, buu.v, (double)ca, (double)cb);
   }

   private void a(bsk $$0, chg $$1, jm<bup> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ayv $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayn.a($$0, $$2, $$3);
         $$1 = ayn.a($$1, $$2, $$3);
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
      return ayn.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return ayn.i($$0, this.cO, this.cN);
   }

   public float J(float $$0) {
      return ayn.i($$0, this.cQ, this.cP);
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
         this.dQ().a($$1, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bsq $$0, bsq.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btl) {
         ((btl)$$0).aY = this.aY;
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
   public bue a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bue() {
            @Override
            public cuo a() {
               return chg.this.cu.a(0);
            }

            @Override
            public boolean a(cuo $$0) {
               if (!$$0.e() && !$$0.a(cur.nL)) {
                  return false;
               } else {
                  chg.this.cu.a(0, $$0);
                  chg.this.gJ();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cu.b() ? bue.a(this.cu, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public btl cR() {
      if (this.i()) {
         bsq var2 = this.cU();
         if (var2 instanceof cmv) {
            return (cmv)var2;
         }
      }

      return super.cR();
   }

   @Nullable
   private eww a(eww $$0, btl $$1) {
      double $$2 = this.dv() + $$0.c;
      double $$3 = this.cL().b;
      double $$4 = this.dB() + $$0.e;
      jd.a $$5 = new jd.a();
      UnmodifiableIterator var10 = $$1.fF().iterator();

      while (var10.hasNext()) {
         bty $$6 = (bty)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cL().e + 0.75;

         do {
            double $$8 = this.dQ().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cow.a($$8)) {
               ewr $$9 = $$1.f($$6);
               eww $$10 = new eww($$2, (double)$$5.v() + $$8, $$4);
               if (cow.a(this.dQ(), $$1, $$9.c($$10))) {
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
   public eww b(btl $$0) {
      eww $$1 = a((double)this.dk(), (double)$$0.dk(), this.dG() + ($$0.fr() == btf.b ? 90.0F : -90.0F));
      eww $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         eww $$3 = a((double)this.dk(), (double)$$0.dk(), this.dG() + ($$0.fr() == btf.a ? 90.0F : -90.0F));
         eww $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.do();
      }
   }

   protected void a(ayv $$0) {
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$3 == null) {
         $$3 = new bsk.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bqj $$0) {
      return this.cu != $$0;
   }

   public int gU() {
      return this.P();
   }

   @Override
   protected eww a(bsq $$0, bst $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new eww(0.0, 0.15 * (double)this.cO * (double)$$2, -0.7 * (double)this.cO * (double)$$2).b(-this.dG() * (float) (Math.PI / 180.0)));
   }

   public final bqj gV() {
      return this.cS;
   }
}
