import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class bwi extends buj implements bgl, bir, bjg, bjj, bjo {
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
   private static final Predicate<biy> cc = $$0 -> $$0 instanceof bwi && ((bwi)$$0).gu();
   private static final btk cd = btk.b().a(16.0).d().a(cc);
   private static final clx ce = clx.a(cja.oI, cja.qM, csm.ij.k(), cja.nF, cja.tq, cja.pm, cja.pn);
   private static final adz<Byte> cv = aec.a(bwi.class, aeb.a);
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
   protected bgx cp;
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

   protected bwi(bim<? extends bwi> $$0, cpl $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.gw();
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqm(this, 1.2));
      this.bO.a(1, new bqx(this, 1.2));
      this.bO.a(2, new bpf(this, 1.0, bwi.class));
      this.bO.a(4, new bps(this, 1.0));
      this.bO.a(6, new brg(this, 0.7));
      this.bO.a(7, new bqb(this, cbm.class, 6.0F));
      this.bO.a(8, new bqo(this));
      if (this.gg()) {
         this.bO.a(9, new bqp(this));
      }

      this.gq();
   }

   protected void gq() {
      this.bO.a(0, new bpn(this));
      this.bO.a(3, new brb(this, 1.25, clx.a(cja.tq, cja.pm, cja.pn), false));
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

   public boolean gp() {
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

   public boolean gr() {
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
      if ($$0 > 6.0F && this.gs()) {
         this.A(false);
      }
   }

   public boolean gs() {
      return this.t(16);
   }

   public boolean gt() {
      return this.t(32);
   }

   public boolean gu() {
      return this.t(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean g() {
      return this.bv() && !this.i_() && this.gp();
   }

   @Override
   public void a(@Nullable aox $$0) {
      this.cp.a(0, new cix(cja.mZ));
   }

   public void b(cbm $$0, cix $$1) {
      if (this.l($$1)) {
         this.cp.a(1, $$1.c(1));
         if (!$$0.fR().d) {
            $$1.h(1);
         }
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gv() {
      return this.cq;
   }

   public void u(int $$0) {
      this.cq = $$0;
   }

   public int v(int $$0) {
      int $$1 = arp.a(this.gv() + $$0, 0, this.gB());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bs() {
      return !this.bO();
   }

   private void p() {
      this.ga();
      if (!this.aS()) {
         aov $$0 = this.gh();
         if ($$0 != null) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), $$0, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhg $$2) {
      if ($$0 > 1.0F) {
         this.a(aow.ln, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bO()) {
            for (bii $$4 : this.cT()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eG();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return arp.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int U_() {
      return 2;
   }

   protected void gw() {
      bgx $$0 = this.cp;
      this.cp = new bgx(this.U_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cp.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cix $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.cp.a($$2, $$3.p());
            }
         }
      }

      this.cp.a(this);
      this.gx();
   }

   protected void gx() {
      if (!this.dK().B) {
         this.d(4, !this.cp.a(0).b());
      }
   }

   @Override
   public void a(bgj $$0) {
      boolean $$1 = this.i();
      this.gx();
      if (this.ah > 20 && !$$1 && this.i()) {
         this.a(this.R_(), 0.5F, 1.0F);
      }
   }

   public double gy() {
      return this.b(bke.n);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.ag.a(3) == 0) {
         this.gF();
      }

      return $$2;
   }

   protected boolean gg() {
      return true;
   }

   @Nullable
   protected aov gh() {
      return null;
   }

   @Nullable
   protected aov gz() {
      return null;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      if (!$$1.k()) {
         dez $$2 = this.dK().a_($$0.c());
         czy $$3 = $$1.w();
         if ($$2.a(csm.dN)) {
            $$3 = $$2.w();
         }

         if (this.bO() && this.ct) {
            this.cu++;
            if (this.cu > 5 && this.cu % 3 == 0) {
               this.a($$3);
            } else if (this.cu <= 5) {
               this.a(aow.lq, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(aow.lq, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(aow.lp, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(czy $$0) {
      return $$0 == czy.b || $$0 == czy.aP || $$0 == czy.B || $$0 == czy.aQ || $$0 == czy.aO;
   }

   protected void a(czy $$0) {
      this.a(aow.lk, $$0.a() * 0.15F, $$0.b());
   }

   public static bkd.a gA() {
      return bja.x().a(bke.n).a(bke.a, 53.0).a(bke.d, 0.225F);
   }

   @Override
   public int Z() {
      return 6;
   }

   public int gB() {
      return 100;
   }

   @Override
   protected float eU() {
      return 0.8F;
   }

   @Override
   public int L() {
      return 400;
   }

   @Override
   public void b(cbm $$0) {
      if (!this.dK().B && (!this.bO() || this.x($$0)) && this.gp()) {
         $$0.a(this, this.cp);
      }
   }

   public bgq c(cbm $$0, cix $$1) {
      boolean $$2 = this.a($$0, $$1);
      if (!$$0.fR().d) {
         $$1.h(1);
      }

      if (this.dK().B) {
         return bgq.b;
      } else {
         return $$2 ? bgq.a : bgq.d;
      }
   }

   protected boolean a(cbm $$0, cix $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cja.oI)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cja.qM)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(csm.ij.k())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cja.nF)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cja.tq)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dK().B && this.gp() && this.h() == 0 && !this.ge()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cja.pm) || $$1.a(cja.pn)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dK().B && this.gp() && this.h() == 0 && !this.ge()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.et() < this.eK() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.i_() && $$4 > 0) {
         this.dK().a(iv.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dK().B) {
            this.b_($$4);
         }

         $$2 = true;
      }

      if ($$5 > 0 && ($$2 || !this.gp()) && this.gv() < this.gB()) {
         $$2 = true;
         if (!this.dK().B) {
            this.v($$5);
         }
      }

      if ($$2) {
         this.p();
         this.a(djj.m);
      }

      return $$2;
   }

   protected void f(cbm $$0) {
      this.A(false);
      this.B(false);
      if (!this.dK().B) {
         $$0.r(this.dA());
         $$0.s(this.dC());
         $$0.n(this);
      }
   }

   @Override
   public boolean eW() {
      return super.eW() && this.bO() && this.i() || this.gs() || this.gt();
   }

   @Override
   public boolean m(cix $$0) {
      return ce.a($$0);
   }

   private void q() {
      this.cm = 1;
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.cp != null) {
         for (int $$0 = 0; $$0 < this.cp.b(); $$0++) {
            cix $$1 = this.cp.a($$0);
            if (!$$1.b() && !cng.e($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void b_() {
      if (this.ag.a(200) == 0) {
         this.q();
      }

      super.b_();
      if (!this.dK().B && this.bv()) {
         if (this.ag.a(900) == 0 && this.aM == 0) {
            this.b(1.0F);
         }

         if (this.gD()) {
            if (!this.gs() && !this.bO() && this.ag.a(300) == 0 && this.dK().a_(this.dk().d()).a(csm.i)) {
               this.A(true);
            }

            if (this.gs() && ++this.cC > 50) {
               this.cC = 0;
               this.A(false);
            }
         }

         this.gC();
      }
   }

   protected void gC() {
      if (this.gu() && this.i_() && !this.gs()) {
         biy $$0 = this.dK().a(bwi.class, cd, this, this.dp(), this.dr(), this.dv(), this.cG().g(16.0));
         if ($$0 != null && this.f($$0) > 4.0) {
            this.bN.a($$0, 0);
         }
      }
   }

   public boolean gD() {
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
      if (this.gs()) {
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
      if (this.gt()) {
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
   public bgq b(cbm $$0, bgp $$1) {
      if (this.bO() || this.i_()) {
         return super.b($$0, $$1);
      } else if (this.gp() && $$0.fG()) {
         this.b($$0);
         return bgq.a(this.dK().B);
      } else {
         cix $$2 = $$0.b($$1);
         if (!$$2.b()) {
            bgq $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.gJ() && this.l($$2) && !this.gK()) {
               this.b($$0, $$2);
               return bgq.a(this.dK().B);
            }
         }

         this.f($$0);
         return bgq.a(this.dK().B);
      }
   }

   private void ga() {
      if (!this.dK().B) {
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
   public aov gE() {
      return this.r();
   }

   public void gF() {
      if (this.gg() && this.cX()) {
         this.cE = 1;
         this.B(true);
      }
   }

   public void gG() {
      if (!this.gt()) {
         this.gF();
         aov $$0 = this.gz();
         if ($$0 != null) {
            this.a($$0, this.eU(), this.eV());
         }
      }
   }

   public boolean h(cbm $$0) {
      this.b($$0.cv());
      this.x(true);
      if ($$0 instanceof akl) {
         ai.x.a((akl)$$0, this);
      }

      this.dK().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cbm $$0, ehd $$1) {
      super.a($$0, $$1);
      ehc $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dA();
      if (this.cW()) {
         if ($$1.e <= 0.0) {
            this.cu = 0;
         }

         if (this.aA()) {
            this.y(false);
            if (this.cr > 0.0F && !this.gr()) {
               this.b(this.cr, $$1);
            }

            this.cr = 0.0F;
         }
      }
   }

   protected ehc j(biy $$0) {
      return new ehc($$0.dC() * 0.5F, $$0.dA());
   }

   @Override
   protected ehd b(cbm $$0, ehd $$1) {
      if (this.aA() && this.cr == 0.0F && this.gt() && !this.cs) {
         return ehd.b;
      } else {
         float $$2 = $$0.bk * 0.5F;
         float $$3 = $$0.bm;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ehd((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cbm $$0) {
      return (float)this.b(bke.d);
   }

   protected void b(float $$0, ehd $$1) {
      double $$2 = this.gy() * (double)$$0 * (double)this.aI();
      double $$3 = $$2 + (double)this.eY();
      ehd $$4 = this.dn();
      this.o($$4.c, $$3, $$4.e);
      this.y(true);
      this.au = true;
      if ($$1.e > 0.0) {
         float $$5 = arp.a(this.dA() * (float) (Math.PI / 180.0));
         float $$6 = arp.b(this.dA() * (float) (Math.PI / 180.0));
         this.f(this.dn().b((double)(-0.4F * $$5 * $$0), 0.0, (double)(0.4F * $$6 * $$0)));
      }
   }

   protected void gH() {
      this.a(aow.lm, 0.4F, 1.0F);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gs());
      $$0.a("Bred", this.gu());
      $$0.a("Temper", this.gv());
      $$0.a("Tame", this.gp());
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      if (!this.cp.a(0).b()) {
         $$0.a("SaddleItem", this.cp.a(0).b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
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
         $$1 = any.a(this.cK(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cix $$4 = cix.a($$0.p("SaddleItem"));
         if ($$4.a(cja.mZ)) {
            this.cp.a(0, $$4);
         }
      }

      this.gx();
   }

   @Override
   public boolean a(buj $$0) {
      return false;
   }

   protected boolean gI() {
      return !this.bO() && !this.bN() && this.gp() && !this.i_() && this.et() >= this.eK() && this.ge();
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return null;
   }

   protected void a(bid $$0, bwi $$1) {
      this.a($$0, $$1, bke.a, (double)bY, (double)bZ);
      this.a($$0, $$1, bke.n, (double)bW, (double)bX);
      this.a($$0, $$1, bke.d, (double)bT, (double)bU);
   }

   private void a(bid $$0, bwi $$1, bjz $$2, double $$3, double $$4) {
      double $$5 = a(this.c($$2), $$0.c($$2), $$3, $$4, this.ag);
      $$1.a($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, aru $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = arp.a($$0, $$2, $$3);
         $$1 = arp.a($$1, $$2, $$3);
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
      return arp.i($$0, this.cG, this.cF);
   }

   public float F(float $$0) {
      return arp.i($$0, this.cI, this.cH);
   }

   public float G(float $$0) {
      return arp.i($$0, this.cK, this.cJ);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cs = true;
            this.gF();
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
      this.gF();
      this.gH();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      it $$1 = $$0 ? iv.M : iv.Z;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dK().a($$1, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bii $$0, bii.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof biy) {
         ((biy)$$0).aU = this.aU;
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
   public boolean j_() {
      return false;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gJ() {
      return false;
   }

   public boolean gK() {
      return !this.c(bin.e).b();
   }

   public boolean l(cix $$0) {
      return false;
   }

   private bjq a(final int $$0, final Predicate<cix> $$1) {
      return new bjq() {
         @Override
         public cix a() {
            return bwi.this.cp.a($$0);
         }

         @Override
         public boolean a(cix $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               bwi.this.cp.a($$0, $$0);
               bwi.this.gx();
               return true;
            }
         }
      };
   }

   @Override
   public bjq a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.cp.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(cja.mZ));
         }

         if ($$1 == 1) {
            if (!this.gJ()) {
               return bjq.b;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.l($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.cp.b() ? bjq.a(this.cp, $$2) : super.a_($$0);
   }

   @Nullable
   @Override
   public biy cN() {
      if (this.i()) {
         bii var2 = this.cQ();
         if (var2 instanceof cbm) {
            return (cbm)var2;
         }
      }

      return super.cN();
   }

   @Nullable
   private ehd a(ehd $$0, biy $$1) {
      double $$2 = this.dp() + $$0.c;
      double $$3 = this.cG().b;
      double $$4 = this.dv() + $$0.e;
      gu.a $$5 = new gu.a();
      UnmodifiableIterator var10 = $$1.fy().iterator();

      while (var10.hasNext()) {
         bjk $$6 = (bjk)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cG().e + 0.75;

         do {
            double $$8 = this.dK().i($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cdi.a($$8)) {
               egy $$9 = $$1.e($$6);
               ehd $$10 = new ehd($$2, (double)$$5.v() + $$8, $$4);
               if (cdi.a(this.dK(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(ha.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ehd b(biy $$0) {
      ehd $$1 = a((double)this.df(), (double)$$0.df(), this.dA() + ($$0.fk() == bis.b ? 90.0F : -90.0F));
      ehd $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ehd $$3 = a((double)this.df(), (double)$$0.df(), this.dA() + ($$0.fk() == bis.a ? 90.0F : -90.0F));
         ehd $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.di();
      }
   }

   protected void a(aru $$0) {
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      if ($$3 == null) {
         $$3 = new bid.a(0.2F);
      }

      this.a($$0.y_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bgj $$0) {
      return this.cp != $$0;
   }

   public int gL() {
      return this.L();
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, this.a($$1, $$2) + 0.15F * this.cI * $$2, -0.7F * this.cI * $$2);
   }

   protected float a(bij $$0, float $$1) {
      return $$0.b + (this.i_() ? 0.125F : -0.15625F) * $$1;
   }
}
