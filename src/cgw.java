import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cgw extends ces implements bqc, bsv, btk, btn, bts {
   public static final int cl = 400;
   public static final int cm = 499;
   public static final int cn = 500;
   public static final double co = 0.15;
   private static final float ca = (float)b(() -> 0.0);
   private static final float cb = (float)b(() -> 1.0);
   private static final float cd = (float)a(() -> 0.0);
   private static final float ce = (float)a(() -> 1.0);
   private static final float cf = a($$0 -> 0);
   private static final float cg = a($$0 -> $$0 - 1);
   private static final float ch = 0.25F;
   private static final float ci = 0.5F;
   private static final Predicate<btc> cj = $$0 -> $$0 instanceof cgw && ((cgw)$$0).gH();
   private static final cdt ck = cdt.b().a(16.0).d().a(cj);
   private static final ajp<Byte> cA = ajt.a(cgw.class, ajr.a);
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
   protected bqq cu;
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
   private final bqa cS = new exs() {
      @Override
      public cud f() {
         return cgw.this.fO();
      }

      @Override
      public void b(cud $$0) {
         cgw.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cml $$0) {
         return $$0.de() == cgw.this || $$0.b(cgw.this, 4.0);
      }
   };

   protected cgw(bsn<? extends cgw> $$0, dcg $$1) {
      super($$0, $$1);
      this.gJ();
   }

   @Override
   protected void z() {
      this.bU.a(1, new cat(this, 1.2));
      this.bU.a(1, new cbe(this, 1.2));
      this.bU.a(2, new bzm(this, 1.0, cgw.class));
      this.bU.a(4, new bzz(this, 1.0));
      this.bU.a(6, new cbn(this, 0.7));
      this.bU.a(7, new cai(this, cml.class, 6.0F));
      this.bU.a(8, new cav(this));
      if (this.gt()) {
         this.bU.a(9, new caw(this));
      }

      this.gD();
   }

   protected void gD() {
      this.bU.a(0, new bzu(this));
      this.bU.a(3, new cbi(this, 1.25, $$0 -> $$0.a(awf.ag), false));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cA, (byte)0);
   }

   protected boolean t(int $$0) {
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

   public boolean gC() {
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

   public boolean gE() {
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
      if ($$0 > 6.0F && this.gF()) {
         this.A(false);
      }
   }

   public boolean gF() {
      return this.t(16);
   }

   public boolean gG() {
      return this.t(32);
   }

   public boolean gH() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bF() && !this.o_() && this.gC();
   }

   @Override
   public void a(@Nullable avi $$0) {
      this.cu.a(0, new cud(cug.nL));
   }

   public void b(cml $$0, cud $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gI() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   public int v(int $$0) {
      int $$1 = ayg.a(this.gI() + $$0, 0, this.gN());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bC() {
      return !this.bU();
   }

   private void s() {
      this.gn();
      if (!this.aY()) {
         avg $$0 = this.gu();
         if ($$0 != null) {
            this.dR().a(null, this.dw(), this.dy(), this.dC(), $$0, this.dg(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      if ($$0 > 1.0F) {
         this.a(avh.mP, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bU()) {
            for (bsh $$4 : this.cY()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eL();
         return true;
      }
   }

   protected int ab_() {
      return 1;
   }

   protected void gJ() {
      bqq $$0 = this.cu;
      this.cu = new bqq(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cu.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cud $$3 = $$0.a($$2);
            if (!$$3.e()) {
               this.cu.a($$2, $$3.s());
            }
         }
      }

      this.cu.a(this);
      this.gK();
   }

   protected void gK() {
      if (!this.dR().B) {
         this.d(4, !this.cu.a(0).e());
      }
   }

   @Override
   public void a(bqa $$0) {
      boolean $$1 = this.i();
      this.gK();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ah.a(3) == 0) {
         this.gR();
      }

      return $$2;
   }

   protected boolean gt() {
      return true;
   }

   @Nullable
   protected avg gu() {
      return null;
   }

   @Nullable
   protected avg gL() {
      return null;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      if (!$$1.k()) {
         dsl $$2 = this.dR().a_($$0.c());
         dmv $$3 = $$1.w();
         if ($$2.a(dfk.dN)) {
            $$3 = $$2.w();
         }

         if (this.bU() && this.cy) {
            this.cz++;
            if (this.cz > 5 && this.cz % 3 == 0) {
               this.a($$3);
            } else if (this.cz <= 5) {
               this.a(avh.mS, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avh.mS, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avh.mR, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dmv $$0) {
      return $$0 == dmv.b || $$0 == dmv.aT || $$0 == dmv.B || $$0 == dmv.aU || $$0 == dmv.aS;
   }

   protected void a(dmv $$0) {
      this.a(avh.mM, $$0.a() * 0.15F, $$0.b());
   }

   public static buj.a gM() {
      return bte.A().a(buk.o, 0.7).a(buk.s, 53.0).a(buk.v, 0.225F).a(buk.B, 1.0).a(buk.x, 6.0).a(buk.k, 0.5);
   }

   @Override
   public int af() {
      return 6;
   }

   public int gN() {
      return 100;
   }

   @Override
   protected float fc() {
      return 0.8F;
   }

   @Override
   public int P() {
      return 400;
   }

   @Override
   public void b(cml $$0) {
      if (!this.dR().B && (!this.bU() || this.x($$0)) && this.gC()) {
         $$0.a(this, this.cu);
      }
   }

   public bqh c(cml $$0, cud $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dR().B) {
         return bqh.c;
      } else {
         return $$2 ? bqh.a : bqh.e;
      }
   }

   protected boolean a(cml $$0, cud $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cug.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cug.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dfk.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cug.ou)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cug.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dR().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cug.qa) || $$1.a(cug.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dR().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ey() < this.eP() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dR().a(lj.O, this.d(1.0), this.dz() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dR().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gC()) && this.gI() < this.gN() && !this.dR().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.s();
         this.a(dxh.m);
      }

      return $$2;
   }

   protected void f(cml $$0) {
      this.A(false);
      this.B(false);
      if (!this.dR().B) {
         $$0.s(this.dH());
         $$0.t(this.dJ());
         $$0.n(this);
      }
   }

   @Override
   public boolean fe() {
      return super.fe() && this.bU() && this.i() || this.gF() || this.gG();
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.af);
   }

   private void t() {
      this.cr = 1;
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.cu != null) {
         for (int $$0 = 0; $$0 < this.cu.b(); $$0++) {
            cud $$1 = this.cu.a($$0);
            if (!$$1.e() && !czo.a($$1, czn.D)) {
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
      if (!this.dR().B && this.bF()) {
         if (this.ah.a(900) == 0 && this.aR == 0) {
            this.c(1.0F);
         }

         if (this.gP()) {
            if (!this.gF() && !this.bU() && this.ah.a(300) == 0 && this.dR().a_(this.dr().d()).a(dfk.i)) {
               this.A(true);
            }

            if (this.gF() && ++this.cI > 50) {
               this.cI = 0;
               this.A(false);
            }
         }

         this.gO();
      }
   }

   protected void gO() {
      if (this.gH() && this.o_() && !this.gF()) {
         btc $$0 = this.dR().a(cgw.class, ck, this, this.dw(), this.dy(), this.dC(), this.cM().g(16.0));
         if ($$0 != null && this.g((bsh)$$0) > 4.0) {
            this.bT.a($$0, 0);
         }
      }
   }

   public boolean gP() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cJ > 0 && ++this.cJ > 30) {
         this.cJ = 0;
         this.d(64, false);
      }

      if (this.dd() && this.cK > 0 && ++this.cK > 20) {
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
      if (this.gF()) {
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
      if (this.gG()) {
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
   public bqh b(cml $$0, bqg $$1) {
      if (this.bU() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gC() && $$0.fP()) {
         this.b($$0);
         return bqh.a(this.dR().B);
      } else {
         cud $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqh $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.d(bso.g) && this.l($$2) && !this.fP()) {
               this.b($$0, $$2);
               return bqh.a(this.dR().B);
            }
         }

         this.f($$0);
         return bqh.a(this.dR().B);
      }
   }

   private void gn() {
      if (!this.dR().B) {
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
   public avg gQ() {
      return this.v();
   }

   public void gR() {
      if (this.gt() && this.dd()) {
         this.cK = 1;
         this.B(true);
      }
   }

   public void gS() {
      if (!this.gG()) {
         this.gR();
         this.b(this.gL());
      }
   }

   public boolean h(cml $$0) {
      this.b($$0.cB());
      this.x(true);
      if ($$0 instanceof aqn) {
         am.y.a((aqn)$$0, this);
      }

      this.dR().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cml $$0, ewh $$1) {
      super.a($$0, $$1);
      ewg $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aZ = this.bb = this.dH();
      if (this.dc()) {
         if ($$1.e <= 0.0) {
            this.cz = 0;
         }

         if (this.aG()) {
            this.y(false);
            if (this.cw > 0.0F && !this.gE()) {
               this.b(this.cw, $$1);
            }

            this.cw = 0.0F;
         }
      }
   }

   protected ewg j(btc $$0) {
      return new ewg($$0.dJ() * 0.5F, $$0.dH());
   }

   @Override
   protected ewh b(cml $$0, ewh $$1) {
      if (this.aG() && this.cw == 0.0F && this.gG() && !this.cx) {
         return ewh.b;
      } else {
         float $$2 = $$0.bp * 0.5F;
         float $$3 = $$0.br;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ewh((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cml $$0) {
      return (float)this.g(buk.v);
   }

   protected void b(float $$0, ewh $$1) {
      double $$2 = (double)this.x($$0);
      ewh $$3 = this.du();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = ayg.a(this.dH() * (float) (Math.PI / 180.0));
         float $$5 = ayg.b(this.dH() * (float) (Math.PI / 180.0));
         this.j(this.du().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gT() {
      this.a(avh.mO, 0.4F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gF());
      $$0.a("Bred", this.gH());
      $$0.a("Temper", this.gI());
      $$0.a("Tame", this.gC());
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      if (!this.cu.a(0).e()) {
         $$0.a("SaddleItem", this.cu.a(0).a(this.dT()));
      }
   }

   @Override
   public void a(tx $$0) {
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
         $$1 = aui.a(this.cQ(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cud $$4 = cud.a(this.dT(), (uu)$$0.p("SaddleItem")).orElse(cud.l);
         if ($$4.a(cug.nL)) {
            this.cu.a(0, $$4);
         }
      }

      this.gK();
   }

   @Override
   public boolean a(ces $$0) {
      return false;
   }

   protected boolean gU() {
      return !this.bU() && !this.bT() && this.gC() && !this.o_() && this.ey() >= this.eP() && this.gr();
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      return null;
   }

   protected void a(bsb $$0, cgw $$1) {
      this.a($$0, $$1, buk.s, (double)cf, (double)cg);
      this.a($$0, $$1, buk.o, (double)cd, (double)ce);
      this.a($$0, $$1, buk.v, (double)ca, (double)cb);
   }

   private void a(bsb $$0, cgw $$1, jj<buf> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ayo $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayg.a($$0, $$2, $$3);
         $$1 = ayg.a($$1, $$2, $$3);
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
      return ayg.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cO, this.cN);
   }

   public float J(float $$0) {
      return ayg.i($$0, this.cQ, this.cP);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cx = true;
            this.gR();
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
      this.gR();
      this.gT();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lh $$1 = $$0 ? lj.Q : lj.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dR().a($$1, this.d(1.0), this.dz() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bsh $$0, bsh.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btc) {
         ((btc)$$0).aZ = this.aZ;
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
   public btu a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new btu() {
            @Override
            public cud a() {
               return cgw.this.cu.a(0);
            }

            @Override
            public boolean a(cud $$0) {
               if (!$$0.e() && !$$0.a(cug.nL)) {
                  return false;
               } else {
                  cgw.this.cu.a(0, $$0);
                  cgw.this.gK();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cu.b() ? btu.a(this.cu, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public btc cS() {
      if (this.i()) {
         bsh var2 = this.cV();
         if (var2 instanceof cml) {
            return (cml)var2;
         }
      }

      return super.cS();
   }

   @Nullable
   private ewh a(ewh $$0, btc $$1) {
      double $$2 = this.dw() + $$0.c;
      double $$3 = this.cM().b;
      double $$4 = this.dC() + $$0.e;
      ja.a $$5 = new ja.a();
      UnmodifiableIterator var10 = $$1.fG().iterator();

      while (var10.hasNext()) {
         bto $$6 = (bto)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cM().e + 0.75;

         do {
            double $$8 = this.dR().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (col.a($$8)) {
               ewc $$9 = $$1.f($$6);
               ewh $$10 = new ewh($$2, (double)$$5.v() + $$8, $$4);
               if (col.a(this.dR(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jf.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ewh b(btc $$0) {
      ewh $$1 = a((double)this.dl(), (double)$$0.dl(), this.dH() + ($$0.fs() == bsw.b ? 90.0F : -90.0F));
      ewh $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ewh $$3 = a((double)this.dl(), (double)$$0.dl(), this.dH() + ($$0.fs() == bsw.a ? 90.0F : -90.0F));
         ewh $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dp();
      }
   }

   protected void a(ayo $$0) {
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$3 == null) {
         $$3 = new bsb.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bqa $$0) {
      return this.cu != $$0;
   }

   public int gV() {
      return this.P();
   }

   @Override
   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ewh(0.0, 0.15 * (double)this.cO * (double)$$2, -0.7 * (double)this.cO * (double)$$2).b(-this.dH() * (float) (Math.PI / 180.0)));
   }

   public final bqa gW() {
      return this.cS;
   }
}
