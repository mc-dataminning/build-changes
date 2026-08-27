import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cbv extends bzt implements blp, bnz, bon, boq, bov {
   public static final int cf = 400;
   public static final int cg = 499;
   public static final int ch = 500;
   public static final double ci = 0.15;
   private static final float bT = (float)b(() -> 0.0);
   private static final float bU = (float)b(() -> 1.0);
   private static final float bW = (float)a(() -> 0.0);
   private static final float bX = (float)a(() -> 1.0);
   private static final float bY = a($$0 -> 0);
   private static final float bZ = a($$0 -> $$0 - 1);
   private static final float ca = 0.25F;
   private static final float cb = 0.5F;
   private static final Predicate<bog> cc = $$0 -> $$0 instanceof cbv && ((cbv)$$0).gA();
   private static final byu cd = byu.b().a(16.0).d().a(cc);
   private static final cry ce = cry.a(cpc.pv, cpc.rz, cyq.ij.j(), cpc.os, cpc.ug, cpc.pZ, cpc.qa);
   private static final aie<Byte> cw = aih.a(cbv.class, aig.a);
   private static final int cx = 2;
   private static final int cy = 4;
   private static final int cz = 8;
   private static final int cA = 16;
   private static final int cB = 32;
   private static final int cC = 64;
   public static final int cj = 0;
   public static final int ck = 1;
   public static final int cl = 2;
   private int cD;
   private int cE;
   private int cF;
   public int cm;
   public int cn;
   protected boolean co;
   protected bmd cp;
   protected int cq;
   protected float cr;
   protected boolean cs;
   private float cG;
   private float cH;
   private float cI;
   private float cJ;
   private float cK;
   private float cL;
   protected boolean ct = true;
   protected int cu;
   @Nullable
   private UUID cM;

   protected cbv(bnu<? extends cbv> $$0, cvn $$1) {
      super($$0, $$1);
      this.gC();
   }

   @Override
   protected void B() {
      this.bO.a(1, new bvu(this, 1.2));
      this.bO.a(1, new bwf(this, 1.2));
      this.bO.a(2, new bun(this, 1.0, cbv.class));
      this.bO.a(4, new bva(this, 1.0));
      this.bO.a(6, new bwo(this, 0.7));
      this.bO.a(7, new bvj(this, chh.class, 6.0F));
      this.bO.a(8, new bvw(this));
      if (this.gm()) {
         this.bO.a(9, new bvx(this));
      }

      this.gw();
   }

   protected void gw() {
      this.bO.a(0, new buv(this));
      this.bO.a(3, new bwj(this, 1.25, cry.a(cpc.ug, cpc.pZ, cpc.qa), false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cw, (byte)0);
   }

   protected boolean u(int $$0) {
      return (this.am.b(cw) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.am.b(cw);
      if ($$1) {
         this.am.b(cw, (byte)($$2 | $$0));
      } else {
         this.am.b(cw, (byte)($$2 & ~$$0));
      }
   }

   public boolean gv() {
      return this.u(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cM;
   }

   public void b(@Nullable UUID $$0) {
      this.cM = $$0;
   }

   public boolean gx() {
      return this.co;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.co = $$0;
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gy()) {
         this.A(false);
      }
   }

   public boolean gy() {
      return this.u(16);
   }

   public boolean gz() {
      return this.u(32);
   }

   public boolean gA() {
      return this.u(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_() && this.gv();
   }

   @Override
   public void a(@Nullable atl $$0) {
      this.cp.a(0, new coz(cpc.nK));
   }

   public void b(chh $$0, coz $$1) {
      if (this.l($$1)) {
         this.cp.a(1, $$1.c(1));
         if (!$$0.fU().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.u(4);
   }

   public int gB() {
      return this.cq;
   }

   public void v(int $$0) {
      this.cq = $$0;
   }

   public int w(int $$0) {
      int $$1 = awh.a(this.gB() + $$0, 0, this.gH());
      this.v($$1);
      return $$1;
   }

   @Override
   public boolean bu() {
      return !this.bP();
   }

   private void u() {
      this.gg();
      if (!this.aU()) {
         atj $$0 = this.gn();
         if ($$0 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bmn $$2) {
      if ($$0 > 1.0F) {
         this.a(atk.mq, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (bno $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eJ();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return awh.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ac_() {
      return 2;
   }

   protected void gC() {
      bmd $$0 = this.cp;
      this.cp = new bmd(this.ac_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            coz $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.q());
            }
         }
      }

      this.cp.a(this);
      this.gD();
   }

   protected void gD() {
      if (!this.dM().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(bln $$0) {
      boolean $$1 = this.i();
      this.gD();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.Z_(), 0.5F, 1.0F);
      }
   }

   public double gE() {
      return this.g(bpl.j);
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.af.a(3) == 0) {
         this.gL();
      }

      return $$2;
   }

   protected boolean gm() {
      return true;
   }

   @Nullable
   protected atj gn() {
      return null;
   }

   @Nullable
   protected atj gF() {
      return null;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      if (!$$1.k()) {
         dlf $$2 = this.dM().a_($$0.c());
         dga $$3 = $$1.w();
         if ($$2.a(cyq.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(atk.mt, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(atk.mt, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(atk.ms, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dga $$0) {
      return $$0 == dga.b || $$0 == dga.aT || $$0 == dga.B || $$0 == dga.aU || $$0 == dga.aS;
   }

   protected void a(dga $$0) {
      this.a(atk.mn, $$0.a() * 0.15F, $$0.b());
   }

   public static bpk.a gG() {
      return boi.C().a(bpl.j).a(bpl.n, 53.0).a(bpl.o, 0.225F).a(bpl.r, 1.0);
   }

   @Override
   public int fK() {
      return 6;
   }

   public int gH() {
      return 100;
   }

   @Override
   protected float eW() {
      return 0.8F;
   }

   @Override
   public int Q() {
      return 400;
   }

   @Override
   public void b(chh $$0) {
      if (!this.dM().B && (!this.bP() || this.w($$0)) && this.gv()) {
         $$0.a(this, this.cp);
      }
   }

   public blu c(chh $$0, coz $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2 & !$$0.fU().d) {
         $$1.h(1);
      }

      if (this.dM().B) {
         return blu.b;
      } else {
         return $$2 ? blu.a : blu.d;
      }
   }

   protected boolean a(chh $$0, coz $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cpc.pv)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cpc.rz)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(cyq.ij.j())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cpc.os)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cpc.ug)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dM().B && this.gv() && this.h() == 0 && !this.gk()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cpc.pZ) || $$1.a(cpc.qa)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dM().B && this.gv() && this.h() == 0 && !this.gk()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ew() < this.eN() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dM().a(jz.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gv()) && this.gB() < this.gH() && !this.dM().B) {
         this.w($$5);
         $$2 = true;
      }

      if ($$2) {
         this.u();
         this.b(dpp.m);
      }

      return $$2;
   }

   protected void f(chh $$0) {
      this.A(false);
      this.B(false);
      if (!this.dM().B) {
         $$0.r(this.dC());
         $$0.s(this.dE());
         $$0.m(this);
      }
   }

   @Override
   public boolean eY() {
      return super.eY() && this.bP() && this.i() || this.gy() || this.gz();
   }

   @Override
   public boolean m(coz $$0) {
      return ce.a($$0);
   }

   private void w() {
      this.cm = 1;
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            coz $$1 = this.cp.a($$0);
            if (!$$1.b() && !ctj.e($$1)) {
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
      if (!this.dM().B && this.bx()) {
         if (this.af.a(900) == 0 && this.aM == 0) {
            this.c(1.0F);
         }

         if (this.gJ()) {
            if (!this.gy() && !this.bP() && this.af.a(300) == 0 && this.dM().a_(this.dm().d()).a(cyq.i)) {
               this.A(true);
            }

            if (this.gy() && ++this.cD > 50) {
               this.cD = 0;
               this.A(false);
            }
         }

         this.gI();
      }
   }

   protected void gI() {
      if (this.gA() && this.o_() && !this.gy()) {
         bog $$0 = this.dM().a(cbv.class, cd, this, this.dr(), this.dt(), this.dx(), this.cH().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bN.a($$0, 0);
         }
      }
   }

   public boolean gJ() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cE > 0 && ++this.cE > 30) {
         this.cE = 0;
         this.d(64, false);
      }

      if (this.cY() && this.cF > 0 && ++this.cF > 20) {
         this.cF = 0;
         this.B(false);
      }

      if (this.cm > 0 && ++this.cm > 8) {
         this.cm = 0;
      }

      if (this.cn > 0) {
         this.cn++;
         if (this.cn > 300) {
            this.cn = 0;
         }
      }

      this.cH = this.cG;
      if (this.gy()) {
         this.cG = this.cG + (1.0F - this.cG) * 0.4F + 0.05F;
         if (this.cG > 1.0F) {
            this.cG = 1.0F;
         }
      } else {
         this.cG = this.cG + ((0.0F - this.cG) * 0.4F - 0.05F);
         if (this.cG < 0.0F) {
            this.cG = 0.0F;
         }
      }

      this.cJ = this.cI;
      if (this.gz()) {
         this.cG = 0.0F;
         this.cH = this.cG;
         this.cI = this.cI + (1.0F - this.cI) * 0.4F + 0.05F;
         if (this.cI > 1.0F) {
            this.cI = 1.0F;
         }
      } else {
         this.cs = false;
         this.cI = this.cI + ((0.8F * this.cI * this.cI * this.cI - this.cI) * 0.6F - 0.05F);
         if (this.cI < 0.0F) {
            this.cI = 0.0F;
         }
      }

      this.cL = this.cK;
      if (this.u(64)) {
         this.cK = this.cK + (1.0F - this.cK) * 0.7F + 0.05F;
         if (this.cK > 1.0F) {
            this.cK = 1.0F;
         }
      } else {
         this.cK = this.cK + ((0.0F - this.cK) * 0.7F - 0.05F);
         if (this.cK < 0.0F) {
            this.cK = 0.0F;
         }
      }
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      if (this.bP() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gv() && $$0.fI()) {
         this.b($$0);
         return blu.a(this.dM().B);
      } else {
         coz $$2 = $$0.b($$1);
         if (!$$2.b()) {
            blu $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gP() && this.l($$2) && !this.gQ()) {
               this.b($$0, $$2);
               return blu.a(this.dM().B);
            }
         }

         this.f($$0);
         return blu.a(this.dM().B);
      }
   }

   private void gg() {
      if (!this.dM().B) {
         this.cE = 1;
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
   public atj gK() {
      return this.y();
   }

   public void gL() {
      if (this.gm() && this.cY()) {
         this.cF = 1;
         this.B(true);
      }
   }

   public void gM() {
      if (!this.gz()) {
         this.gL();
         this.b(this.gF());
      }
   }

   public boolean h(chh $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof aow) {
         am.y.a((aow)$$0, this);
      }

      this.dM().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(chh $$0, ens $$1) {
      super.a($$0, $$1);
      enr $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.M = this.aU = this.aW = this.dC();
      if (this.cX()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gx()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected enr j(bog $$0) {
      return new enr($$0.dE() * 0.5F, $$0.dC());
   }

   @Override
   protected ens b(chh $$0, ens $$1) {
      if (this.aC() && this.cr == 0.0F && this.gz() && !this.cs) {
         return ens.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ens((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(chh $$0) {
      return (float)this.g(bpl.o);
   }

   protected void b(float $$0, ens $$1) {
      double $$2 = this.gE() * (double)$$0 * (double)this.aK();
      double $$3 = $$2 + (double)this.fa();
      ens $$4 = this.dp();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.at = true;
      if ($$1.e > 0.0) {
         float $$5 = awh.a(this.dC() * (float) (Math.PI / 180.0));
         float $$6 = awh.b(this.dC() * (float) (Math.PI / 180.0));
         this.g(this.dp().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gN() {
      this.a(atk.mp, 0.4F, 1.0F);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gy());
      $$0.a("Bred", this.gA());
      $$0.a("Temper", this.gB());
      $$0.a("Tame", this.gv());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new sw()));
      }
   }

   @Override
   public void a(sw $$0) {
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
         $$1 = asm.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         coz $$4 = coz.a($$0.p("SaddleItem"));
         if ($$4.a(cpc.nK)) {
            this.cp.a(0, $$4);
         }
      }

      this.gD();
   }

   @Override
   public boolean a(bzt $$0) {
      return false;
   }

   protected boolean gO() {
      return !this.bP() && !this.bO() && this.gv() && !this.o_() && this.ew() >= this.eN() && this.gk();
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return null;
   }

   protected void a(bnj $$0, cbv $$1) {
      this.a($$0, $$1, bpl.n, (double)bY, (double)bZ);
      this.a($$0, $$1, bpl.j, (double)bW, (double)bX);
      this.a($$0, $$1, bpl.o, (double)bT, (double)bU);
   }

   private void a(bnj $$0, cbv $$1, ij<bpg> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.af);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, awo $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = awh.a($$0, $$2, $$3);
         $$1 = awh.a($$1, $$2, $$3);
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
      return awh.i($$0, this.cH, this.cG);
   }

   public float F(float $$0) {
      return awh.i($$0, this.cJ, this.cI);
   }

   public float G(float $$0) {
      return awh.i($$0, this.cL, this.cK);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cs = true;
            this.gL();
         }

         if ($$0 >= 90) {
            this.cr = 1.0F;
         } else {
            this.cr = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cs = true;
      this.gL();
      this.gN();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      jx $$1 = $$0 ? jz.O : jz.ab;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dM().a($$1, this.d(1.0), this.du() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bno $$0, bno.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bog) {
         ((bog)$$0).aU = this.aU;
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

   public boolean gP() {
      return false;
   }

   public boolean gQ() {
      return !this.c(bnv.e).b();
   }

   public boolean l(coz $$0) {
      return false;
   }

   private box a(final int $$0, final Predicate<coz> $$1) {
      return new box() {
         @Override
         public coz a() {
            return cbv.this.cp.a($$0);
         }

         @Override
         public boolean a(coz $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               cbv.this.cp.a($$0, $$0);
               cbv.this.gD();
               return true;
            }
         }
      };
   }

   @Override
   public box a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(cpc.nK));
         }

         if ($$1 == 1) {
            if (!this.gP()) {
               return box.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? box.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public bog cN() {
      if (this.i()) {
         bno var2 = this.cQ();
         if (var2 instanceof chh) {
            return (chh)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private ens a(ens $$0, bog $$1) {
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dx() + $$0.e;
      hz.a $$5 = new hz.a();
      UnmodifiableIterator var10 = $$1.fA().iterator();

      while (var10.hasNext()) {
         bor $$6 = (bor)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dM().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cjf.a($$8)) {
               enn $$9 = $$1.f($$6);
               ens $$10 = new ens($$2, (double)$$5.v() + $$8, $$4);
               if (cjf.a(this.dM(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ie.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ens b(bog $$0) {
      ens $$1 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fm() == boa.b ? 90.0F : -90.0F));
      ens $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ens $$3 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fm() == boa.a ? 90.0F : -90.0F));
         ens $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dk();
      }
   }

   protected void a(awo $$0) {
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      if ($$3 == null) {
         $$3 = new bnj.a(0.2F);
      }

      this.a($$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bln $$0) {
      return this.cp != $$0;
   }

   public int gR() {
      return this.Q();
   }

   @Override
   protected ens a(bno $$0, bnr $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ens(0.0, 0.15 * (double)this.cJ * (double)$$2, -0.7 * (double)this.cJ * (double)$$2).b(-this.dC() * (float) (Math.PI / 180.0)));
   }
}
