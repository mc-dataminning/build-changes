import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class bzw extends bxx implements bjv, bmd, bms, bmv, bna {
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
   private static final Predicate<bmk> cc = $$0 -> $$0 instanceof bzw && ((bzw)$$0).gy();
   private static final bwy cd = bwy.b().a(16.0).d().a(cc);
   private static final cpy ce = cpy.a(cna.pt, cna.rx, cwr.ij.k(), cna.oq, cna.ud, cna.pX, cna.pY);
   private static final agm<Byte> cw = agp.a(bzw.class, ago.a);
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
   protected bki cp;
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

   protected bzw(bly<? extends bzw> $$0, cto $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.gA();
   }

   @Override
   protected void B() {
      this.bO.a(1, new btz(this, 1.2));
      this.bO.a(1, new buk(this, 1.2));
      this.bO.a(2, new bss(this, 1.0, bzw.class));
      this.bO.a(4, new btf(this, 1.0));
      this.bO.a(6, new but(this, 0.7));
      this.bO.a(7, new bto(this, cfh.class, 6.0F));
      this.bO.a(8, new bub(this));
      if (this.gk()) {
         this.bO.a(9, new buc(this));
      }

      this.gu();
   }

   protected void gu() {
      this.bO.a(0, new bta(this));
      this.bO.a(3, new buo(this, 1.25, cpy.a(cna.ud, cna.pX, cna.pY), false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cw, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.an.b(cw) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cw);
      if ($$1) {
         this.an.b(cw, (byte)($$2 | $$0));
      } else {
         this.an.b(cw, (byte)($$2 & ~$$0));
      }
   }

   public boolean gt() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cM;
   }

   public void b(@Nullable UUID $$0) {
      this.cM = $$0;
   }

   public boolean gv() {
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
      if ($$0 > 6.0F && this.gw()) {
         this.A(false);
      }
   }

   public boolean gw() {
      return this.t(16);
   }

   public boolean gx() {
      return this.t(32);
   }

   public boolean gy() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_() && this.gt();
   }

   @Override
   public void a(@Nullable ars $$0) {
      this.cp.a(0, new cmx(cna.nK));
   }

   public void b(cfh $$0, cmx $$1) {
      if (this.l($$1)) {
         this.cp.a(1, $$1.c(1));
         if (!$$0.fT().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gz() {
      return this.cq;
   }

   public void u(int $$0) {
      this.cq = $$0;
   }

   public int v(int $$0) {
      int $$1 = aun.a(this.gz() + $$0, 0, this.gF());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bu() {
      return !this.bP();
   }

   private void u() {
      this.ge();
      if (!this.aU()) {
         arq $$0 = this.gl();
         if ($$0 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bks $$2) {
      if ($$0 > 1.0F) {
         this.a(arr.mb, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bP()) {
            for (blu $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eI();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aun.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ac_() {
      return 2;
   }

   protected void gA() {
      bki $$0 = this.cp;
      this.cp = new bki(this.ac_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cmx $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.p());
            }
         }
      }

      this.cp.a(this);
      this.gB();
   }

   protected void gB() {
      if (!this.dM().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(bjt $$0) {
      boolean $$1 = this.i();
      this.gB();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.Z_(), 0.5F, 1.0F);
      }
   }

   public double gC() {
      return this.b(bnq.h);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ag.a(3) == 0) {
         this.gJ();
      }

      return $$2;
   }

   protected boolean gk() {
      return true;
   }

   @Nullable
   protected arq gl() {
      return null;
   }

   @Nullable
   protected arq gD() {
      return null;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      if (!$$1.k()) {
         djg $$2 = this.dM().a_($$0.c());
         deb $$3 = $$1.w();
         if ($$2.a(cwr.dN)) {
            $$3 = $$2.w();
         }

         if (this.bP() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(arr.me, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(arr.me, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(arr.md, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(deb $$0) {
      return $$0 == deb.b || $$0 == deb.aT || $$0 == deb.B || $$0 == deb.aU || $$0 == deb.aS;
   }

   protected void a(deb $$0) {
      this.a(arr.lY, $$0.a() * 0.15F, $$0.b());
   }

   public static bnp.a gE() {
      return bmm.C().a(bnq.h).a(bnq.l, 53.0).a(bnq.m, 0.225F);
   }

   @Override
   public int fI() {
      return 6;
   }

   public int gF() {
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
   public void b(cfh $$0) {
      if (!this.dM().B && (!this.bP() || this.x($$0)) && this.gt()) {
         $$0.a(this, this.cp);
      }
   }

   public bka c(cfh $$0, cmx $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2 & !$$0.fT().d) {
         $$1.h(1);
      }

      if (this.dM().B) {
         return bka.b;
      } else {
         return $$2 ? bka.a : bka.d;
      }
   }

   protected boolean a(cfh $$0, cmx $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cna.pt)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cna.rx)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(cwr.ij.k())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cna.oq)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cna.ud)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dM().B && this.gt() && this.h() == 0 && !this.gi()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cna.pX) || $$1.a(cna.pY)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dM().B && this.gt() && this.h() == 0 && !this.gi()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.ev() < this.eM() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dM().a(jx.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gt()) && this.gz() < this.gF() && !this.dM().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.u();
         this.a(dnq.m);
      }

      return $$2;
   }

   protected void f(cfh $$0) {
      this.A(false);
      this.B(false);
      if (!this.dM().B) {
         $$0.r(this.dC());
         $$0.s(this.dE());
         $$0.n(this);
      }
   }

   @Override
   public boolean eY() {
      return super.eY() && this.bP() && this.i() || this.gw() || this.gx();
   }

   @Override
   public boolean m(cmx $$0) {
      return ce.a($$0);
   }

   private void w() {
      this.cm = 1;
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            cmx $$1 = this.cp.a($$0);
            if (!$$1.b() && !crk.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void d_() {
      if (this.ag.a(200) == 0) {
         this.w();
      }

      super.d_();
      if (!this.dM().B && this.bx()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gH()) {
            if (!this.gw() && !this.bP() && this.ag.a(300) == 0 && this.dM().a_(this.dm().d()).a(cwr.i)) {
               this.A(true);
            }

            if (this.gw() && ++this.cD > 50) {
               this.cD = 0;
               this.A(false);
            }
         }

         this.gG();
      }
   }

   protected void gG() {
      if (this.gy() && this.o_() && !this.gw()) {
         bmk $$0 = this.dM().a(bzw.class, cd, this, this.dr(), this.dt(), this.dx(), this.cH().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bN.a($$0, 0);
         }
      }
   }

   public boolean gH() {
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
      if (this.gw()) {
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
      if (this.gx()) {
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
      if (this.t(64)) {
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
   public bka b(cfh $$0, bjz $$1) {
      if (this.bP() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gt() && $$0.fI()) {
         this.b($$0);
         return bka.a(this.dM().B);
      } else {
         cmx $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bka $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gN() && this.l($$2) && !this.gO()) {
               this.b($$0, $$2);
               return bka.a(this.dM().B);
            }
         }

         this.f($$0);
         return bka.a(this.dM().B);
      }
   }

   private void ge() {
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
   public arq gI() {
      return this.y();
   }

   public void gJ() {
      if (this.gk() && this.cY()) {
         this.cF = 1;
         this.B(true);
      }
   }

   public void gK() {
      if (!this.gx()) {
         this.gJ();
         arq $$0 = this.gD();
         if ($$0 != null) {
            this.a($$0, this.eW(), this.eX());
         }
      }
   }

   public boolean h(cfh $$0) {
      this.b($$0.cw());
      this.x(true);
      if ($$0 instanceof ane) {
         am.y.a((ane)$$0, this);
      }

      this.dM().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cfh $$0, els $$1) {
      super.a($$0, $$1);
      elr $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dC();
      if (this.cX()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aC()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gv()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected elr j(bmk $$0) {
      return new elr($$0.dE() * 0.5F, $$0.dC());
   }

   @Override
   protected els b(cfh $$0, els $$1) {
      if (this.aC() && this.cr == 0.0F && this.gx() && !this.cs) {
         return els.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new els((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cfh $$0) {
      return (float)this.b(bnq.m);
   }

   protected void b(float $$0, els $$1) {
      double $$2 = this.gC() * (double)$$0 * (double)this.aK();
      double $$3 = $$2 + (double)this.fa();
      els $$4 = this.dp();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = aun.a(this.dC() * (float) (Math.PI / 180.0));
         float $$6 = aun.b(this.dC() * (float) (Math.PI / 180.0));
         this.g(this.dp().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gL() {
      this.a(arr.ma, 0.4F, 1.0F);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gw());
      $$0.a("Bred", this.gy());
      $$0.a("Temper", this.gz());
      $$0.a("Tame", this.gt());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new sn()));
      }
   }

   @Override
   public void a(sn $$0) {
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
         $$1 = aqt.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cmx $$4 = cmx.a($$0.p("SaddleItem"));
         if ($$4.a(cna.nK)) {
            this.cp.a(0, $$4);
         }
      }

      this.gB();
   }

   @Override
   public boolean a(bxx $$0) {
      return false;
   }

   protected boolean gM() {
      return !this.bP() && !this.bO() && this.gt() && !this.o_() && this.ev() >= this.eM() && this.gi();
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      return null;
   }

   protected void a(blp $$0, bzw $$1) {
      this.a($$0, $$1, bnq.l, (double)bY, (double)bZ);
      this.a($$0, $$1, bnq.h, (double)bW, (double)bX);
      this.a($$0, $$1, bnq.m, (double)bT, (double)bU);
   }

   private void a(blp $$0, bzw $$1, bnl $$2, double $$3, double $$4) {
      double $$5 = a(this.c($$2), $$0.c($$2), $$3, $$4, this.ag);
      $$1.a($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, auu $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = aun.a($$0, $$2, $$3);
         $$1 = aun.a($$1, $$2, $$3);
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
      return aun.i($$0, this.cH, this.cG);
   }

   public float F(float $$0) {
      return aun.i($$0, this.cJ, this.cI);
   }

   public float G(float $$0) {
      return aun.i($$0, this.cL, this.cK);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cs = true;
            this.gJ();
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
      this.gJ();
      this.gL();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      jv $$1 = $$0 ? jx.O : jx.ab;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
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
   protected void a(blu $$0, blu.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bmk) {
         ((bmk)$$0).aU = this.aU;
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
   protected float b(bmw $$0, blv $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gN() {
      return false;
   }

   public boolean gO() {
      return !this.c(blz.e).b();
   }

   public boolean l(cmx $$0) {
      return false;
   }

   private bnc a(final int $$0, final Predicate<cmx> $$1) {
      return new bnc() {
         @Override
         public cmx a() {
            return bzw.this.cp.a($$0);
         }

         @Override
         public boolean a(cmx $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               bzw.this.cp.a($$0, $$0);
               bzw.this.gB();
               return true;
            }
         }
      };
   }

   @Override
   public bnc a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(cna.nK));
         }

         if ($$1 == 1) {
            if (!this.gN()) {
               return bnc.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? bnc.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public bmk cN() {
      if (this.i()) {
         blu var2 = this.cQ();
         if (var2 instanceof cfh) {
            return (cfh)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private els a(els $$0, bmk $$1) {
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.cH().b;
      double $$4 = this.dx() + $$0.e;
      hx.a $$5 = new hx.a();
      UnmodifiableIterator var10 = $$1.fA().iterator();

      while (var10.hasNext()) {
         bmw $$6 = (bmw)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cH().e + 0.75;

         do {
            double $$8 = this.dM().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (che.a($$8)) {
               eln $$9 = $$1.e($$6);
               els $$10 = new els($$2, (double)$$5.v() + $$8, $$4);
               if (che.a(this.dM(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ic.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public els b(bmk $$0) {
      els $$1 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fm() == bme.b ? 90.0F : -90.0F));
      els $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         els $$3 = a((double)this.dg(), (double)$$0.dg(), this.dC() + ($$0.fm() == bme.a ? 90.0F : -90.0F));
         els $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dk();
      }
   }

   protected void a(auu $$0) {
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      if ($$3 == null) {
         $$3 = new blp.a(0.2F);
      }

      this.a($$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bjt $$0) {
      return this.cp != $$0;
   }

   public int gP() {
      return this.Q();
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, this.a($$1, $$2) + 0.15F * this.cJ * $$2, -0.7F * this.cJ * $$2);
   }

   protected float a(blv $$0, float $$1) {
      return $$0.b + (this.o_() ? 0.125F : -0.15625F) * $$1;
   }
}
