import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpw extends fpt {
   public static final Logger cm = LogUtils.getLogger();
   private static final int cx = 20;
   private static final int cy = 600;
   private static final int cz = 100;
   private static final float cA = 0.6F;
   private static final double cB = 0.35;
   private static final double cC = 0.13962634F;
   private static final float cD = 0.3F;
   public final flk cn;
   private final arc cE;
   private final esq cF;
   private final List<gem> cG = Lists.newArrayList();
   private int cH = 0;
   private double cI;
   private double cJ;
   private double cK;
   private float cL;
   private float cM;
   private boolean cN;
   private boolean cO;
   private boolean cP;
   private boolean cQ;
   private int cR;
   private boolean cS;
   public fpu co;
   protected final etd cp;
   protected int cq;
   public float cr;
   public float cs;
   public float ct;
   public float cu;
   private int cT;
   private float cU;
   public float cv;
   public float cw;
   private boolean cV;
   @Nullable
   private biw cW;
   private boolean cX;
   private boolean cY = true;
   private int cZ;
   private boolean da;
   private int db;
   private boolean dc = true;
   private boolean dd = false;

   public fpw(etd $$0, flj $$1, flk $$2, arc $$3, esq $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.q());
      this.cp = $$0;
      this.cn = $$2;
      this.cE = $$3;
      this.cF = $$4;
      this.cP = $$5;
      this.cQ = $$6;
      this.cG.add(new gfe(this, $$0.ah()));
      this.cG.add(new ger(this));
      this.cG.add(new geq(this, $$0.ah(), $$1.F_()));
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(bkq $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cfl) {
            this.cp.ah().a((gfc)(new gew(this, (cfl)$$0, true)));
            this.cp.ah().a((gfc)(new gew(this, (cfl)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.cX = false;
   }

   @Override
   public float g(float $$0) {
      return this.dF();
   }

   @Override
   public float h(float $$0) {
      return this.bO() ? super.h($$0) : this.dD();
   }

   @Override
   public void l() {
      if (this.dN().f(this.dr(), this.dx())) {
         super.l();
         if (this.bO()) {
            this.cn.b(new adi.c(this.dD(), this.dF(), this.aC()));
            this.cn.b(new adq(this.bk, this.bm, this.co.g, this.co.h));
            bkq $$0 = this.cX();
            if ($$0 != this && $$0.cY()) {
               this.cn.b(new adj($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (gem $$1 : this.cG) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gem $$0 : this.cG) {
         if ($$0 instanceof geq) {
            return ((geq)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cP) {
         adp.a $$1 = $$0 ? adp.a.a : adp.a.b;
         this.cn.b(new adp(this, $$1));
         this.cP = $$0;
      }

      if (this.w()) {
         double $$2 = this.ds() - this.cI;
         double $$3 = this.du() - this.cJ;
         double $$4 = this.dy() - this.cK;
         double $$5 = (double)(this.dD() - this.cL);
         double $$6 = (double)(this.dF() - this.cM);
         this.cR++;
         boolean $$7 = atm.f($$2, $$3, $$4) > atm.k(2.0E-4) || this.cR >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            eju $$9 = this.dq();
            this.cn.b(new adi.b($$9.c, -999.0, $$9.e, this.dD(), this.dF(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cn.b(new adi.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF(), this.aC()));
         } else if ($$7) {
            this.cn.b(new adi.a(this.ds(), this.du(), this.dy(), this.aC()));
         } else if ($$8) {
            this.cn.b(new adi.c(this.dD(), this.dF(), this.aC()));
         } else if (this.cN != this.aC()) {
            this.cn.b(new adi.d(this.aC()));
         }

         if ($$7) {
            this.cI = this.ds();
            this.cJ = this.du();
            this.cK = this.dy();
            this.cR = 0;
         }

         if ($$8) {
            this.cL = this.dD();
            this.cM = this.dF();
         }

         this.cN = this.aC();
         this.cY = this.cp.m.F().c();
      }
   }

   private void E() {
      boolean $$0 = this.bY();
      if ($$0 != this.cQ) {
         adp.a $$1 = $$0 ? adp.a.d : adp.a.e;
         this.cn.b(new adp(this, $$1));
         this.cQ = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ado.a $$1 = $$0 ? ado.a.d : ado.a.e;
      clj $$2 = this.fT().a($$0);
      this.cn.b(new ado($$1, ht.b, hx.a));
      return !$$2.b();
   }

   @Override
   public void a(biw $$0) {
      super.a($$0);
      this.cn.b(new aee($$0));
   }

   @Override
   public void fR() {
      this.cn.b(new acw(acw.a.a));
      etb.c();
   }

   @Override
   protected void f(bjo $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.ew() - $$1);
      }
   }

   @Override
   public void r() {
      this.cn.b(new adb(this.bS.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cp.a(null);
   }

   public void D(float $$0) {
      if (this.cS) {
         float $$1 = this.ew() - $$0;
         if ($$1 <= 0.0F) {
            this.c($$0);
            if ($$1 < 0.0F) {
               this.al = 10;
            }
         } else {
            this.bi = $$1;
            this.al = 20;
            this.c($$0);
            this.aL = 10;
            this.aK = this.aL;
         }
      } else {
         this.c($$0);
         this.cS = true;
      }
   }

   @Override
   public void y() {
      this.cn.b(new adn(this.fU()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fw() {
      return !this.fU().b && super.fw();
   }

   @Override
   public boolean bl() {
      return !this.fU().b && super.bl();
   }

   @Override
   public boolean dT() {
      return !this.fU().b && super.dT();
   }

   protected void h() {
      this.cn.b(new adp(this, adp.a.f, atm.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cn.b(new adp(this, adp.a.h));
   }

   public arc j() {
      return this.cE;
   }

   public esq m() {
      return this.cF;
   }

   public void a(coq<?> $$0) {
      if (this.cF.d($$0)) {
         this.cF.e($$0);
         this.cn.b(new ads($$0));
      }
   }

   @Override
   protected int F() {
      return this.cH;
   }

   public void a(int $$0) {
      this.cH = $$0;
   }

   @Override
   public void a(ur $$0, boolean $$1) {
      this.cp.aV().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ht $$2 = ht.a($$0, this.du(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         hx $$5 = null;
         double $$6 = Double.MAX_VALUE;
         hx[] $$7 = new hx[]{hx.e, hx.f, hx.c, hx.d};

         for (hx $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == hx.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            eju $$11 = this.dq();
            if ($$5.o() == hx.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(ht $$0) {
      ejp $$1 = this.cH();
      ejp $$2 = new ejp((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dN().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
   }

   @Override
   public void a(ur $$0) {
      this.cp.l.d().a($$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 >= 24 && $$0 <= 28) {
         this.a($$0 - 24);
      } else {
         super.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.dc = $$0;
   }

   public boolean o() {
      return this.dc;
   }

   public void w(boolean $$0) {
      this.dd = $$0;
   }

   public boolean p() {
      return this.dd;
   }

   @Override
   public void a(aqq $$0, float $$1, float $$2) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2, false);
   }

   @Override
   public void a(aqq $$0, aqs $$1, float $$2, float $$3) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cZ() {
      return true;
   }

   @Override
   public void c(biw $$0) {
      clj $$1 = this.b($$0);
      if (!$$1.b() && !this.fo()) {
         super.c($$0);
         this.cV = true;
         this.cW = $$0;
      }
   }

   @Override
   public boolean fo() {
      return this.cV;
   }

   @Override
   public void fu() {
      super.fu();
      this.cV = false;
   }

   @Override
   public biw fp() {
      return Objects.requireNonNullElse(this.cW, biw.a);
   }

   @Override
   public void a(afo<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         biw $$2 = (this.an.b(t) & 2) > 0 ? biw.b : biw.a;
         if ($$1 && !this.cV) {
            this.c($$2);
         } else if (!$$1 && this.cV) {
            this.fu();
         }
      }

      if (ao.equals($$0) && this.fx() && !this.da) {
         this.cp.ah().a((gfc)(new ges(this)));
      }
   }

   @Nullable
   public blr q() {
      if (this.db() instanceof blr $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float u() {
      return this.cU;
   }

   @Override
   public boolean Y() {
      return this.cp.aP();
   }

   @Override
   public void a(dgm $$0, boolean $$1) {
      if ($$0 instanceof dga $$2) {
         this.cp.a(new fcq($$2, $$1, this.cp.aP()));
      } else {
         this.cp.a(new fdd($$0, $$1, this.cp.aP()));
      }
   }

   @Override
   public void a(crb $$0) {
      this.cp.a(new fda($$0));
   }

   @Override
   public void a(dfn $$0) {
      this.cp.a(new fcd($$0));
   }

   @Override
   public void a(dgr $$0) {
      this.cp.a(new fdh($$0));
   }

   @Override
   public void a(dgd $$0) {
      this.cp.a(new fcv($$0));
   }

   @Override
   public void a(clj $$0, biw $$1) {
      if ($$0.a(clm.tS)) {
         this.cp.a(new fbz(this, $$0, $$1));
      }
   }

   @Override
   public void a(bkq $$0) {
      this.cp.g.a($$0, js.g);
   }

   @Override
   public void b(bkq $$0) {
      this.cp.g.a($$0, js.s);
   }

   @Override
   public boolean bS() {
      return this.co != null && this.co.h;
   }

   @Override
   public boolean bX() {
      return this.cO;
   }

   public boolean v() {
      return this.bX() || this.cb();
   }

   @Override
   public void fj() {
      super.fj();
      if (this.w()) {
         this.bk = this.co.a;
         this.bm = this.co.b;
         this.bj = this.co.g;
         this.ct = this.cr;
         this.cu = this.cs;
         this.cs = this.cs + (this.dF() - this.cs) * 0.5F;
         this.cr = this.cr + (this.dD() - this.cr) * 0.5F;
      }
   }

   protected boolean w() {
      return this.cp.al() == this;
   }

   @Override
   public void z() {
      this.b(bls.a);
      if (this.dN() != null) {
         for (double $$0 = this.du(); $$0 > (double)this.dN().I_() && $$0 < (double)this.dN().ak(); $$0++) {
            this.a_(this.ds(), $$0, this.dy());
            if (this.dN().g(this)) {
               break;
            }
         }

         this.g(eju.b);
         this.s(0.0F);
      }

      this.c(this.eN());
      this.aM = 0;
   }

   @Override
   public void c_() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (!(this.cp.y instanceof fas)) {
         this.G();
      }

      boolean $$0 = this.co.g;
      boolean $$1 = this.co.h;
      boolean $$2 = this.M();
      this.cO = !this.fU().b && !this.bZ() && !this.bO() && this.g(bls.f) && (this.bS() || !this.fE() && !this.g(bls.a));
      float $$3 = atm.a(0.3F + cpw.b(this), 0.0F, 1.0F);
      this.co.a(this.v(), $$3);
      this.cp.ay().a(this.co);
      if (this.fo() && !this.bO()) {
         this.co.a *= 0.2F;
         this.co.b *= 0.2F;
         this.cq = 0;
      }

      boolean $$4 = false;
      if (this.cZ > 0) {
         this.cZ--;
         $$4 = true;
         this.co.g = true;
      }

      if (!this.af) {
         this.c(this.ds() - (double)this.dh() * 0.35, this.dy() + (double)this.dh() * 0.35);
         this.c(this.ds() - (double)this.dh() * 0.35, this.dy() - (double)this.dh() * 0.35);
         this.c(this.ds() + (double)this.dh() * 0.35, this.dy() - (double)this.dh() * 0.35);
         this.c(this.ds() + (double)this.dh() * 0.35, this.dy() + (double)this.dh() * 0.35);
      }

      if ($$1) {
         this.cq = 0;
      }

      boolean $$5 = this.K();
      boolean $$6 = this.bO() ? this.da().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.be()) && $$7 && $$5) {
         if (this.cq <= 0 && !this.cp.m.D.e()) {
            this.cq = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aZ() || this.be()) && $$5 && this.cp.m.D.e()) {
         this.g(true);
      }

      if (this.bY()) {
         boolean $$8 = !this.co.b() || !this.N();
         boolean $$9 = $$8 || this.P && !this.S || this.aZ() && !this.be();
         if (this.bZ()) {
            if (!this.aC() && !this.co.h && $$8 || !this.aZ()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fU().c) {
         if (this.cp.q.j()) {
            if (!this.fU().b) {
               this.fU().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.co.g && !$$4) {
            if (this.bU == 0) {
               this.bU = 7;
            } else if (!this.bZ()) {
               this.fU().b = !this.fU().b;
               $$10 = true;
               this.y();
               this.bU = 0;
            }
         }
      }

      if (this.co.g && !$$10 && !$$0 && !this.fU().b && !this.bO() && !this.d_()) {
         clj $$11 = this.c(bkv.e);
         if ($$11.a(clm.nS) && ckd.d($$11) && this.fY()) {
            this.cn.b(new adp(this, adp.a.i));
         }
      }

      this.da = this.fx();
      if (this.aZ() && this.co.h && this.eb()) {
         this.fd();
      }

      if (this.a(arl.a)) {
         int $$12 = this.O_() ? 10 : 1;
         this.db = atm.a(this.db + $$12, 0, 600);
      } else if (this.db > 0) {
         this.a(arl.a);
         this.db = atm.a(this.db - 10, 0, 600);
      }

      if (this.fU().b && this.w()) {
         int $$13 = 0;
         if (this.co.h) {
            $$13--;
         }

         if (this.co.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dq().b(0.0, (double)((float)$$13 * this.fU().a() * 3.0F), 0.0));
         }
      }

      blr $$14 = this.q();
      if ($$14 != null && $$14.ac_() == 0) {
         if (this.cT < 0) {
            this.cT++;
            if (this.cT == 0) {
               this.cU = 0.0F;
            }
         }

         if ($$0 && !this.co.g) {
            this.cT = -10;
            $$14.b(atm.d(this.u() * 100.0F));
            this.h();
         } else if (!$$0 && this.co.g) {
            this.cT = 0;
            this.cU = 0.0F;
         } else if ($$0) {
            this.cT++;
            if (this.cT < 10) {
               this.cU = (float)this.cT * 0.1F;
            } else {
               this.cU = 0.8F + 2.0F / (float)(this.cT - 9) * 0.1F;
            }
         }
      } else {
         this.cU = 0.0F;
      }

      super.c_();
      if (this.aC() && this.fU().b && !this.cp.q.j()) {
         this.fU().b = false;
         this.y();
      }
   }

   @Override
   protected void ec() {
      this.aM++;
      if (this.aM == 20) {
         this.a(bkq.c.a);
      }
   }

   private void G() {
      this.cw = this.cv;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cp.y != null && !this.cp.y.j() && !(this.cp.y instanceof ezt)) {
            if (this.cp.y instanceof fbt) {
               this.r();
            }

            this.cp.a(null);
         }

         if (this.cv == 0.0F) {
            this.cp.ah().a(gex.b(aqr.tr, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(bkf.i) && !this.b(bkf.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cv > 0.0F) {
         $$0 = -0.05F;
      }

      this.cv = atm.a(this.cv + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.cX = false;
      if (this.db() instanceof cfn $$0) {
         $$0.a(this.co.e, this.co.f, this.co.c, this.co.d);
         this.cX = this.cX | (this.co.e || this.co.f || this.co.c || this.co.d);
      }
   }

   @Override
   public boolean A() {
      return this.cX;
   }

   @Nullable
   @Override
   public bkd c(@Nullable bkb $$0) {
      if ($$0 == bkf.i) {
         this.cw = 0.0F;
         this.cv = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(blm $$0, eju $$1) {
      double $$2 = this.ds();
      double $$3 = this.dy();
      super.a($$0, $$1);
      this.f((float)(this.ds() - $$2), (float)(this.dy() - $$3));
   }

   public boolean B() {
      return this.cY;
   }

   protected void f(float $$0, float $$1) {
      if (this.H()) {
         eju $$2 = this.dl();
         eju $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eju $$4 = new eju((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fg();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ejt $$7 = this.co.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = atm.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = atm.b(this.dD() * (float) (Math.PI / 180.0));
            $$4 = new eju((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = atm.i($$6);
         eju $$13 = $$4.a((double)$$12);
         eju $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ejz $$16 = ejz.a(this);
            ht $$17 = ht.a(this.ds(), this.cH().e, this.dy());
            dhi $$18 = this.dN().a_($$17);
            if ($$18.b(this.dN(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dhi $$19 = this.dN().a_($$17);
               if ($$19.b(this.dN(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bkf.h)) {
                     $$21 += (float)(this.b(bkf.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eju $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dh();
                  float $$26 = this.di();
                  ejp $$27 = new ejp($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eju $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eju $$28 = $$13.c(new eju(0.0, 1.0, 0.0));
                  eju $$29 = $$28.a((double)($$25 * 0.5F));
                  eju $$30 = $$23.d($$29);
                  eju $$31 = $$24.d($$29);
                  eju $$32 = $$23.e($$29);
                  eju $$33 = $$24.e($$29);
                  Iterable<ekn> $$34 = this.dN().d(this, $$27);
                  Iterator<ejp> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ejp $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eju $$38 = $$37.f();
                        ht $$39 = ht.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ht $$41 = $$39.b($$40);
                           dhi $$42 = this.dN().a_($$41);
                           ekn $$43;
                           if (!($$43 = $$42.b(this.dN(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(hx.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.du() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dhi $$44 = this.dN().a_($$17);
                              if (!$$44.b(this.dN(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.du());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.cZ = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(eju $$0) {
      float $$1 = this.dD() * (float) (Math.PI / 180.0);
      double $$2 = (double)atm.a($$1);
      double $$3 = (double)atm.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = atm.k($$4) + atm.k($$5);
      double $$7 = atm.k($$0.c) + atm.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.B() && this.cZ <= 0 && this.aC() && !this.fL() && !this.bO() && this.I() && (double)this.aK() >= 1.0;
   }

   private boolean I() {
      ejt $$0 = this.co.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fo() && !this.a(bkf.o) && (!this.bO() || this.c(this.da())) && !this.fx();
   }

   private boolean c(bkq $$0) {
      return $$0.dG() && $$0.cY();
   }

   private boolean M() {
      double $$0 = 0.8;
      return this.be() ? this.co.b() : (double)this.co.b >= 0.8;
   }

   private boolean N() {
      return this.bO() || (float)this.gd().a() > 6.0F || this.fU().c;
   }

   public float C() {
      if (!this.a(arl.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.db >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = atm.a((float)this.db / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.db < 100.0F ? 0.0F : atm.a(((float)this.db - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(crx $$0) {
      if ($$0 == crx.d) {
         this.g(this.dq().a(hx.a.b, 0.0));
      }
   }

   @Override
   public boolean be() {
      return this.ce;
   }

   @Override
   protected boolean fM() {
      boolean $$0 = this.ce;
      boolean $$1 = super.fM();
      if (this.O_()) {
         return this.ce;
      } else {
         if (!$$0 && $$1) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.x, aqs.i, 1.0F, 1.0F, false);
            this.cp.ah().a((gfc)(new gff.b(this)));
         }

         if ($$0 && !$$1) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.y, aqs.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public eju q(float $$0) {
      if (this.cp.m.ax().a()) {
         float $$1 = atm.i($$0 * 0.5F, this.dD(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = atm.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fn() == bla.b ? -1.0 : 1.0;
         eju $$4 = new eju(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(clj $$0, clj $$1, cgu $$2) {
      this.cp.ay().a($$0, $$1, $$2);
   }

   @Override
   public float dE() {
      return this.dD();
   }
}
