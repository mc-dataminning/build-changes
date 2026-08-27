import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class bws extends but implements bgv, bjb, bjq, bjt, bjy {
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
   private static final Predicate<bji> cc = $$0 -> $$0 instanceof bws && ((bws)$$0).gx();
   private static final btu cd = btu.b().a(16.0).d().a(cc);
   private static final cmi ce = cmi.a(cjk.oI, cjk.qM, csy.ij.k(), cjk.nF, cjk.tq, cjk.pm, cjk.pn);
   private static final aeg<Byte> cv = aej.a(bws.class, aei.a);
   private static final int cw = 2;
   private static final int cx = 4;
   private static final int cy = 8;
   private static final int cz = 16;
   private static final int cA = 32;
   private static final int cB = 64;
   public static final int cj = 0;
   public static final int ck = 1;
   public static final int cl = 2;
   private int cC;
   private int cD;
   private int cE;
   public int cm;
   public int cn;
   protected boolean co;
   protected bhh cp;
   protected int cq;
   protected float cr;
   protected boolean cs;
   private float cF;
   private float cG;
   private float cH;
   private float cI;
   private float cJ;
   private float cK;
   protected boolean ct = true;
   protected int cu;
   @Nullable
   private UUID cL;

   protected bws(biw<? extends bws> $$0, cpx $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.gz();
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqw(this, 1.2));
      this.bO.a(1, new brh(this, 1.2));
      this.bO.a(2, new bpp(this, 1.0, bws.class));
      this.bO.a(4, new bqc(this, 1.0));
      this.bO.a(6, new brq(this, 0.7));
      this.bO.a(7, new bql(this, cbw.class, 6.0F));
      this.bO.a(8, new bqy(this));
      if (this.gj()) {
         this.bO.a(9, new bqz(this));
      }

      this.gt();
   }

   protected void gt() {
      this.bO.a(0, new bpx(this));
      this.bO.a(3, new brl(this, 1.25, cmi.a(cjk.tq, cjk.pm, cjk.pn), false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cv, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.an.b(cv) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cv);
      if ($$1) {
         this.an.b(cv, (byte)($$2 | $$0));
      } else {
         this.an.b(cv, (byte)($$2 & ~$$0));
      }
   }

   public boolean gs() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID d() {
      return this.cL;
   }

   public void b(@Nullable UUID $$0) {
      this.cL = $$0;
   }

   public boolean gu() {
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
      if ($$0 > 6.0F && this.gv()) {
         this.A(false);
      }
   }

   public boolean gv() {
      return this.t(16);
   }

   public boolean gw() {
      return this.t(32);
   }

   public boolean gx() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bv() && !this.m_() && this.gs();
   }

   @Override
   public void a(@Nullable apg $$0) {
      this.cp.a(0, new cjh(cjk.mZ));
   }

   public void b(cbw $$0, cjh $$1) {
      if (this.l($$1)) {
         this.cp.a(1, $$1.c(1));
         if (!$$0.fS().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gy() {
      return this.cq;
   }

   public void u(int $$0) {
      this.cq = $$0;
   }

   public int v(int $$0) {
      int $$1 = ary.a(this.gy() + $$0, 0, this.gE());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bs() {
      return !this.bO();
   }

   private void s() {
      this.gd();
      if (!this.aS()) {
         ape $$0 = this.gk();
         if ($$0 != null) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), $$0, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhq $$2) {
      if ($$0 > 1.0F) {
         this.a(apf.ln, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bO()) {
            for (bis $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eH();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ary.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int Z_() {
      return 2;
   }

   protected void gz() {
      bhh $$0 = this.cp;
      this.cp = new bhh(this.Z_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cjh $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.p());
            }
         }
      }

      this.cp.a(this);
      this.gA();
   }

   protected void gA() {
      if (!this.dL().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(bgt $$0) {
      boolean $$1 = this.i();
      this.gA();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.W_(), 0.5F, 1.0F);
      }
   }

   public double gB() {
      return this.b(bko.n);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ag.a(3) == 0) {
         this.gI();
      }

      return $$2;
   }

   protected boolean gj() {
      return true;
   }

   @Nullable
   protected ape gk() {
      return null;
   }

   @Nullable
   protected ape gC() {
      return null;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      if (!$$1.k()) {
         dfl $$2 = this.dL().a_($$0.c());
         dak $$3 = $$1.w();
         if ($$2.a(csy.dN)) {
            $$3 = $$2.w();
         }

         if (this.bO() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(apf.lq, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(apf.lq, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(apf.lp, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dak $$0) {
      return $$0 == dak.b || $$0 == dak.aP || $$0 == dak.B || $$0 == dak.aQ || $$0 == dak.aO;
   }

   protected void a(dak $$0) {
      this.a(apf.lk, $$0.a() * 0.15F, $$0.b());
   }

   public static bkn.a gD() {
      return bjk.A().a(bko.n).a(bko.a, 53.0).a(bko.d, 0.225F);
   }

   @Override
   public int fH() {
      return 6;
   }

   public int gE() {
      return 100;
   }

   @Override
   protected float eV() {
      return 0.8F;
   }

   @Override
   public int O() {
      return 400;
   }

   @Override
   public void b(cbw $$0) {
      if (!this.dL().B && (!this.bO() || this.x($$0)) && this.gs()) {
         $$0.a(this, this.cp);
      }
   }

   public bha c(cbw $$0, cjh $$1) {
      boolean $$2 = this.a($$0, $$1);
      if (!$$0.fS().d) {
         $$1.h(1);
      }

      if (this.dL().B) {
         return bha.b;
      } else {
         return $$2 ? bha.a : bha.d;
      }
   }

   protected boolean a(cbw $$0, cjh $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cjk.oI)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cjk.qM)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(csy.ij.k())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cjk.nF)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cjk.tq)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dL().B && this.gs() && this.h() == 0 && !this.gh()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cjk.pm) || $$1.a(cjk.pn)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dL().B && this.gs() && this.h() == 0 && !this.gh()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.eu() < this.eL() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.m_() && $$4 > 0) {
         this.dL().a(ix.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dL().B) {
            this.b_($$4);
         }

         $$2 = true;
      }

      if ($$5 > 0 && ($$2 || !this.gs()) && this.gy() < this.gE()) {
         $$2 = true;
         if (!this.dL().B) {
            this.v($$5);
         }
      }

      if ($$2) {
         this.s();
         this.a(djv.m);
      }

      return $$2;
   }

   protected void f(cbw $$0) {
      this.A(false);
      this.B(false);
      if (!this.dL().B) {
         $$0.r(this.dB());
         $$0.s(this.dD());
         $$0.n(this);
      }
   }

   @Override
   public boolean eX() {
      return super.eX() && this.bO() && this.i() || this.gv() || this.gw();
   }

   @Override
   public boolean m(cjh $$0) {
      return ce.a($$0);
   }

   private void t() {
      this.cm = 1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            cjh $$1 = this.cp.a($$0);
            if (!$$1.b() && !cns.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void b_() {
      if (this.ag.a(200) == 0) {
         this.t();
      }

      super.b_();
      if (!this.dL().B && this.bv()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gG()) {
            if (!this.gv() && !this.bO() && this.ag.a(300) == 0 && this.dL().a_(this.dl().d()).a(csy.i)) {
               this.A(true);
            }

            if (this.gv() && ++this.cC > 50) {
               this.cC = 0;
               this.A(false);
            }
         }

         this.gF();
      }
   }

   protected void gF() {
      if (this.gx() && this.m_() && !this.gv()) {
         bji $$0 = this.dL().a(bws.class, cd, this, this.dq(), this.ds(), this.dw(), this.cG().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bN.a($$0, 0);
         }
      }
   }

   public boolean gG() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cD > 0 && ++this.cD > 30) {
         this.cD = 0;
         this.d(64, false);
      }

      if (this.cX() && this.cE > 0 && ++this.cE > 20) {
         this.cE = 0;
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

      this.cG = this.cF;
      if (this.gv()) {
         this.cF = this.cF + (1.0F - this.cF) * 0.4F + 0.05F;
         if (this.cF > 1.0F) {
            this.cF = 1.0F;
         }
      } else {
         this.cF = this.cF + ((0.0F - this.cF) * 0.4F - 0.05F);
         if (this.cF < 0.0F) {
            this.cF = 0.0F;
         }
      }

      this.cI = this.cH;
      if (this.gw()) {
         this.cF = 0.0F;
         this.cG = this.cF;
         this.cH = this.cH + (1.0F - this.cH) * 0.4F + 0.05F;
         if (this.cH > 1.0F) {
            this.cH = 1.0F;
         }
      } else {
         this.cs = false;
         this.cH = this.cH + ((0.8F * this.cH * this.cH * this.cH - this.cH) * 0.6F - 0.05F);
         if (this.cH < 0.0F) {
            this.cH = 0.0F;
         }
      }

      this.cK = this.cJ;
      if (this.t(64)) {
         this.cJ = this.cJ + (1.0F - this.cJ) * 0.7F + 0.05F;
         if (this.cJ > 1.0F) {
            this.cJ = 1.0F;
         }
      } else {
         this.cJ = this.cJ + ((0.0F - this.cJ) * 0.7F - 0.05F);
         if (this.cJ < 0.0F) {
            this.cJ = 0.0F;
         }
      }
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      if (this.bO() || this.m_()) {
         return super.b($$0, $$1);
      } else if (this.gs() && $$0.fH()) {
         this.b($$0);
         return bha.a(this.dL().B);
      } else {
         cjh $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bha $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gM() && this.l($$2) && !this.gN()) {
               this.b($$0, $$2);
               return bha.a(this.dL().B);
            }
         }

         this.f($$0);
         return bha.a(this.dL().B);
      }
   }

   private void gd() {
      if (!this.dL().B) {
         this.cD = 1;
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
   public ape gH() {
      return this.w();
   }

   public void gI() {
      if (this.gj() && this.cX()) {
         this.cE = 1;
         this.B(true);
      }
   }

   public void gJ() {
      if (!this.gw()) {
         this.gI();
         ape $$0 = this.gC();
         if ($$0 != null) {
            this.a($$0, this.eV(), this.eW());
         }
      }
   }

   public boolean h(cbw $$0) {
      this.b($$0.cv());
      this.x(true);
      if ($$0 instanceof akt) {
         al.x.a((akt)$$0, this);
      }

      this.dL().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cbw $$0, ehp $$1) {
      super.a($$0, $$1);
      eho $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dB();
      if (this.cW()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aA()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gu()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected eho j(bji $$0) {
      return new eho($$0.dD() * 0.5F, $$0.dB());
   }

   @Override
   protected ehp b(cbw $$0, ehp $$1) {
      if (this.aA() && this.cr == 0.0F && this.gw() && !this.cs) {
         return ehp.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ehp((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cbw $$0) {
      return (float)this.b(bko.d);
   }

   protected void b(float $$0, ehp $$1) {
      double $$2 = this.gB() * (double)$$0 * (double)this.aI();
      double $$3 = $$2 + (double)this.eZ();
      ehp $$4 = this.do();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = ary.a(this.dB() * (float) (Math.PI / 180.0));
         float $$6 = ary.b(this.dB() * (float) (Math.PI / 180.0));
         this.f(this.do().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gK() {
      this.a(apf.lm, 0.4F, 1.0F);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gv());
      $$0.a("Bred", this.gx());
      $$0.a("Temper", this.gy());
      $$0.a("Tame", this.gs());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new qy()));
      }
   }

   @Override
   public void a(qy $$0) {
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
         $$1 = aoh.a(this.cK(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cjh $$4 = cjh.a($$0.p("SaddleItem"));
         if ($$4.a(cjk.mZ)) {
            this.cp.a(0, $$4);
         }
      }

      this.gA();
   }

   @Override
   public boolean a(but $$0) {
      return false;
   }

   protected boolean gL() {
      return !this.bO() && !this.bN() && this.gs() && !this.m_() && this.eu() >= this.eL() && this.gh();
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      return null;
   }

   protected void a(bin $$0, bws $$1) {
      this.a($$0, $$1, bko.a, (double)bY, (double)bZ);
      this.a($$0, $$1, bko.n, (double)bW, (double)bX);
      this.a($$0, $$1, bko.d, (double)bT, (double)bU);
   }

   private void a(bin $$0, bws $$1, bkj $$2, double $$3, double $$4) {
      double $$5 = a(this.c($$2), $$0.c($$2), $$3, $$4, this.ag);
      $$1.a($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ase $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ary.a($$0, $$2, $$3);
         $$1 = ary.a($$1, $$2, $$3);
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
      return ary.i($$0, this.cG, this.cF);
   }

   public float F(float $$0) {
      return ary.i($$0, this.cI, this.cH);
   }

   public float G(float $$0) {
      return ary.i($$0, this.cK, this.cJ);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cs = true;
            this.gI();
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
      this.gI();
      this.gK();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      iv $$1 = $$0 ? ix.M : ix.Z;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bis $$0, bis.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bji) {
         ((bji)$$0).aU = this.aU;
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
   public boolean c_() {
      return false;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gM() {
      return false;
   }

   public boolean gN() {
      return !this.c(bix.e).b();
   }

   public boolean l(cjh $$0) {
      return false;
   }

   private bka a(final int $$0, final Predicate<cjh> $$1) {
      return new bka() {
         @Override
         public cjh a() {
            return bws.this.cp.a($$0);
         }

         @Override
         public boolean a(cjh $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               bws.this.cp.a($$0, $$0);
               bws.this.gA();
               return true;
            }
         }
      };
   }

   @Override
   public bka a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(cjk.mZ));
         }

         if ($$1 == 1) {
            if (!this.gM()) {
               return bka.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? bka.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public bji cN() {
      if (this.i()) {
         bis var2 = this.cQ();
         if (var2 instanceof cbw) {
            return (cbw)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private ehp a(ehp $$0, bji $$1) {
      double $$2 = this.dq() + $$0.c;
      double $$3 = this.cG().b;
      double $$4 = this.dw() + $$0.e;
      gw.a $$5 = new gw.a();
      UnmodifiableIterator var10 = $$1.fz().iterator();

      while (var10.hasNext()) {
         bju $$6 = (bju)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cG().e + 0.75;

         do {
            double $$8 = this.dL().i($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cds.a($$8)) {
               ehk $$9 = $$1.e($$6);
               ehp $$10 = new ehp($$2, (double)$$5.v() + $$8, $$4);
               if (cds.a(this.dL(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(hc.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ehp b(bji $$0) {
      ehp $$1 = a((double)this.df(), (double)$$0.df(), this.dB() + ($$0.fl() == bjc.b ? 90.0F : -90.0F));
      ehp $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ehp $$3 = a((double)this.df(), (double)$$0.df(), this.dB() + ($$0.fl() == bjc.a ? 90.0F : -90.0F));
         ehp $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dj();
      }
   }

   protected void a(ase $$0) {
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      if ($$3 == null) {
         $$3 = new bin.a(0.2F);
      }

      this.a($$0.D_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bgt $$0) {
      return this.cp != $$0;
   }

   public int gO() {
      return this.O();
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, this.a($$1, $$2) + 0.15F * this.cI * $$2, -0.7F * this.cI * $$2);
   }

   protected float a(bit $$0, float $$1) {
      return $$0.b + (this.m_() ? 0.125F : -0.15625F) * $$1;
   }
}
