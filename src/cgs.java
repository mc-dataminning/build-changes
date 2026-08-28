import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cgs extends ceo implements bpy, bsr, btg, btj, bto {
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
   private static final Predicate<bsy> cj = $$0 -> $$0 instanceof cgs && ((cgs)$$0).gH();
   private static final cdp ck = cdp.b().a(16.0).d().a(cj);
   private static final ajp<Byte> cB = ajt.a(cgs.class, ajr.a);
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
   protected bqm cu;
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
   private final bpw cS = new exk() {
      @Override
      public cua f() {
         return cgs.this.fN();
      }

      @Override
      public void b(cua $$0) {
         cgs.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cmh $$0) {
         return $$0.dc() == cgs.this || $$0.b(cgs.this, 4.0);
      }
   };

   protected cgs(bsj<? extends cgs> $$0, dcd $$1) {
      super($$0, $$1);
      this.gJ();
   }

   @Override
   protected void z() {
      this.bU.a(1, new cap(this, 1.2));
      this.bU.a(1, new cba(this, 1.2));
      this.bU.a(2, new bzi(this, 1.0, cgs.class));
      this.bU.a(4, new bzv(this, 1.0));
      this.bU.a(6, new cbj(this, 0.7));
      this.bU.a(7, new cae(this, cmh.class, 6.0F));
      this.bU.a(8, new car(this));
      if (this.gt()) {
         this.bU.a(9, new cas(this));
      }

      this.gD();
   }

   protected void gD() {
      this.bU.a(0, new bzq(this));
      this.bU.a(3, new cbe(this, 1.25, $$0 -> $$0.a(awd.ag), false));
   }

   @Override
   protected void a(ajt.a $$0) {
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
      return this.bD() && !this.p_() && this.gC();
   }

   @Override
   public void a(@Nullable avg $$0) {
      this.cu.a(0, new cua(cud.nL));
   }

   public void b(cmh $$0, cua $$1) {
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
      int $$1 = aye.a(this.gI() + $$0, 0, this.gN());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bA() {
      return !this.bS();
   }

   private void s() {
      this.gn();
      if (!this.aW()) {
         ave $$0 = this.gu();
         if ($$0 != null) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), $$0, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqw $$2) {
      if ($$0 > 1.0F) {
         this.a(avf.mP, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bS()) {
            for (bsd $$4 : this.cW()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eJ();
         return true;
      }
   }

   protected int ab_() {
      return 1;
   }

   protected void gJ() {
      bqm $$0 = this.cu;
      this.cu = new bqm(this.ab_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cu.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cua $$3 = $$0.a($$2);
            if (!$$3.e()) {
               this.cu.a($$2, $$3.s());
            }
         }
      }

      this.cu.a(this);
      this.gK();
   }

   protected void gK() {
      if (!this.dP().B) {
         this.d(4, !this.cu.a(0).e());
      }
   }

   @Override
   public void a(bpw $$0) {
      boolean $$1 = this.i();
      this.gK();
      if (this.ai > 20 && !$$1 && this.i()) {
         this.a(this.Y_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
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
   protected ave gu() {
      return null;
   }

   @Nullable
   protected ave gL() {
      return null;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      if (!$$1.k()) {
         dsh $$2 = this.dP().a_($$0.c());
         dms $$3 = $$1.w();
         if ($$2.a(dfh.dN)) {
            $$3 = $$2.w();
         }

         if (this.bS() && this.cy) {
            this.cz++;
            if (this.cz > 5 && this.cz % 3 == 0) {
               this.a($$3);
            } else if (this.cz <= 5) {
               this.a(avf.mS, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avf.mS, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avf.mR, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dms $$0) {
      return $$0 == dms.b || $$0 == dms.aT || $$0 == dms.B || $$0 == dms.aU || $$0 == dms.aS;
   }

   protected void a(dms $$0) {
      this.a(avf.mM, $$0.a() * 0.15F, $$0.b());
   }

   public static buf.a gM() {
      return bta.A().a(bug.o, 0.7).a(bug.s, 53.0).a(bug.v, 0.225F).a(bug.B, 1.0).a(bug.x, 6.0).a(bug.k, 0.5);
   }

   @Override
   public int fM() {
      return 6;
   }

   public int gN() {
      return 100;
   }

   @Override
   protected float fa() {
      return 0.8F;
   }

   @Override
   public int P() {
      return 400;
   }

   @Override
   public void b(cmh $$0) {
      if (!this.dP().B && (!this.bS() || this.x($$0)) && this.gC()) {
         $$0.a(this, this.cu);
      }
   }

   public bqd c(cmh $$0, cua $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dP().B) {
         return bqd.c;
      } else {
         return $$2 ? bqd.a : bqd.e;
      }
   }

   protected boolean a(cmh $$0, cua $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cud.pw)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cud.rA)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dfh.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cud.ot)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cud.uk)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dP().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cud.qa) || $$1.a(cud.qb)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dP().B && this.gC() && this.g() == 0 && !this.gr()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ew() < this.eN() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dP().a(lj.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dP().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gC()) && this.gI() < this.gN() && !this.dP().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.s();
         this.a(dxa.m);
      }

      return $$2;
   }

   protected void f(cmh $$0) {
      this.A(false);
      this.B(false);
      if (!this.dP().B) {
         $$0.s(this.dF());
         $$0.t(this.dH());
         $$0.n(this);
      }
   }

   @Override
   public boolean fc() {
      return super.fc() && this.bS() && this.i() || this.gF() || this.gG();
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.af);
   }

   private void u() {
      this.cr = 1;
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.cu != null) {
         for (int $$0 = 0; $$0 < this.cu.b(); $$0++) {
            cua $$1 = this.cu.a($$0);
            if (!$$1.e() && !czl.a($$1, czk.E)) {
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
      if (!this.dP().B && this.bD()) {
         if (this.ah.a(900) == 0 && this.aQ == 0) {
            this.c(1.0F);
         }

         if (this.gP()) {
            if (!this.gF() && !this.bS() && this.ah.a(300) == 0 && this.dP().a_(this.dp().d()).a(dfh.i)) {
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
      if (this.gH() && this.p_() && !this.gF()) {
         bsy $$0 = this.dP().a(cgs.class, ck, this, this.du(), this.dw(), this.dA(), this.cK().g(16.0));
         if ($$0 != null && this.g((bsd)$$0) > 4.0) {
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

      if (this.db() && this.cK > 0 && ++this.cK > 20) {
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
   public bqd b(cmh $$0, bqc $$1) {
      if (this.bS() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gC() && $$0.fN()) {
         this.b($$0);
         return bqd.a(this.dP().B);
      } else {
         cua $$2 = $$0.b($$1);
         if (!$$2.e()) {
            bqd $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.fO() && this.l($$2) && !this.fP()) {
               this.b($$0, $$2);
               return bqd.a(this.dP().B);
            }
         }

         this.f($$0);
         return bqd.a(this.dP().B);
      }
   }

   private void gn() {
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
   public ave gQ() {
      return this.v();
   }

   public void gR() {
      if (this.gt() && this.db()) {
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

   public boolean h(cmh $$0) {
      this.b($$0.cz());
      this.x(true);
      if ($$0 instanceof aql) {
         am.y.a((aql)$$0, this);
      }

      this.dP().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cmh $$0, evz $$1) {
      super.a($$0, $$1);
      evy $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aY = this.ba = this.dF();
      if (this.da()) {
         if ($$1.e <= 0.0) {
            this.cz = 0;
         }

         if (this.aE()) {
            this.y(false);
            if (this.cw > 0.0F && !this.gE()) {
               this.b(this.cw, $$1);
            }

            this.cw = 0.0F;
         }
      }
   }

   protected evy j(bsy $$0) {
      return new evy($$0.dH() * 0.5F, $$0.dF());
   }

   @Override
   protected evz b(cmh $$0, evz $$1) {
      if (this.aE() && this.cw == 0.0F && this.gG() && !this.cx) {
         return evz.b;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new evz((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cmh $$0) {
      return (float)this.g(bug.v);
   }

   protected void b(float $$0, evz $$1) {
      double $$2 = (double)this.x($$0);
      evz $$3 = this.ds();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.av = true;
      if ($$1.e > 0.0) {
         float $$4 = aye.a(this.dF() * (float) (Math.PI / 180.0));
         float $$5 = aye.b(this.dF() * (float) (Math.PI / 180.0));
         this.h(this.ds().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gT() {
      this.a(avf.mO, 0.4F, 1.0F);
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
         $$0.a("SaddleItem", this.cu.a(0).a(this.dR()));
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
         $$1 = aug.a(this.cO(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cua $$4 = cua.a(this.dR(), (uu)$$0.p("SaddleItem")).orElse(cua.l);
         if ($$4.a(cud.nL)) {
            this.cu.a(0, $$4);
         }
      }

      this.gK();
   }

   @Override
   public boolean a(ceo $$0) {
      return false;
   }

   protected boolean gU() {
      return !this.bS() && !this.bR() && this.gC() && !this.p_() && this.ew() >= this.eN() && this.gr();
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      return null;
   }

   protected void a(brx $$0, cgs $$1) {
      this.a($$0, $$1, bug.s, (double)cf, (double)cg);
      this.a($$0, $$1, bug.o, (double)cd, (double)ce);
      this.a($$0, $$1, bug.v, (double)ca, (double)cb);
   }

   private void a(brx $$0, cgs $$1, jj<bub> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.ah);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, aym $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = aye.a($$0, $$2, $$3);
         $$1 = aye.a($$1, $$2, $$3);
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
      return aye.i($$0, this.cM, this.cL);
   }

   public float I(float $$0) {
      return aye.i($$0, this.cO, this.cN);
   }

   public float J(float $$0) {
      return aye.i($$0, this.cQ, this.cP);
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
   protected void a(bsd $$0, bsd.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bsy) {
         ((bsy)$$0).aY = this.aY;
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
   public btq a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new btq() {
            @Override
            public cua a() {
               return cgs.this.cu.a(0);
            }

            @Override
            public boolean a(cua $$0) {
               if (!$$0.e() && !$$0.a(cud.nL)) {
                  return false;
               } else {
                  cgs.this.cu.a(0, $$0);
                  cgs.this.gK();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cu.b() ? btq.a(this.cu, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bsy cQ() {
      if (this.i()) {
         bsd var2 = this.cT();
         if (var2 instanceof cmh) {
            return (cmh)var2;
         }
      }

      return super.cQ();
   }

   @Nullable
   private evz a(evz $$0, bsy $$1) {
      double $$2 = this.du() + $$0.c;
      double $$3 = this.cK().b;
      double $$4 = this.dA() + $$0.e;
      ja.a $$5 = new ja.a();
      UnmodifiableIterator var10 = $$1.fE().iterator();

      while (var10.hasNext()) {
         btk $$6 = (btk)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cK().e + 0.75;

         do {
            double $$8 = this.dP().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (coh.a($$8)) {
               evu $$9 = $$1.f($$6);
               evz $$10 = new evz($$2, (double)$$5.v() + $$8, $$4);
               if (coh.a(this.dP(), $$1, $$9.c($$10))) {
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
   public evz b(bsy $$0) {
      evz $$1 = a((double)this.dj(), (double)$$0.dj(), this.dF() + ($$0.fq() == bss.b ? 90.0F : -90.0F));
      evz $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         evz $$3 = a((double)this.dj(), (double)$$0.dj(), this.dF() + ($$0.fq() == bss.a ? 90.0F : -90.0F));
         evz $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dn();
      }
   }

   protected void a(aym $$0) {
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$3 == null) {
         $$3 = new brx.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bpw $$0) {
      return this.cu != $$0;
   }

   public int gV() {
      return this.P();
   }

   @Override
   protected evz a(bsd $$0, bsg $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new evz(0.0, 0.15 * (double)this.cO * (double)$$2, -0.7 * (double)this.cO * (double)$$2).b(-this.dF() * (float) (Math.PI / 180.0)));
   }

   public final bpw gW() {
      return this.cS;
   }
}
