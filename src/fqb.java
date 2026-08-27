import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqb extends fpy {
   public static final Logger cm = LogUtils.getLogger();
   private static final int cx = 20;
   private static final int cy = 600;
   private static final int cz = 100;
   private static final float cA = 0.6F;
   private static final double cB = 0.35;
   private static final double cC = 0.13962634F;
   private static final float cD = 0.3F;
   public final flp cn;
   private final arg cE;
   private final esv cF;
   private final List<ger> cG = Lists.newArrayList();
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
   public fpz co;
   protected final eti cp;
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
   private bja cW;
   private boolean cX;
   private boolean cY = true;
   private int cZ;
   private boolean da;
   private int db;
   private boolean dc = true;
   private boolean dd = false;

   public fqb(eti $$0, flo $$1, flp $$2, arg $$3, esv $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.q());
      this.cp = $$0;
      this.cn = $$2;
      this.cE = $$3;
      this.cF = $$4;
      this.cP = $$5;
      this.cQ = $$6;
      this.cG.add(new gfj(this, $$0.ah()));
      this.cG.add(new gew(this));
      this.cG.add(new gev(this, $$0.ah(), $$1.G_()));
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(bkv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cfq) {
            this.cp.ah().a((gfh)(new gfb(this, (cfq)$$0, true)));
            this.cp.ah().a((gfh)(new gfb(this, (cfq)$$0, false)));
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
            this.cn.b(new adm.c(this.dD(), this.dF(), this.aC()));
            this.cn.b(new adu(this.bk, this.bm, this.co.g, this.co.h));
            bkv $$0 = this.cX();
            if ($$0 != this && $$0.cY()) {
               this.cn.b(new adn($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (ger $$1 : this.cG) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (ger $$0 : this.cG) {
         if ($$0 instanceof gev) {
            return ((gev)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cP) {
         adt.a $$1 = $$0 ? adt.a.a : adt.a.b;
         this.cn.b(new adt(this, $$1));
         this.cP = $$0;
      }

      if (this.w()) {
         double $$2 = this.ds() - this.cI;
         double $$3 = this.du() - this.cJ;
         double $$4 = this.dy() - this.cK;
         double $$5 = (double)(this.dD() - this.cL);
         double $$6 = (double)(this.dF() - this.cM);
         this.cR++;
         boolean $$7 = atq.f($$2, $$3, $$4) > atq.k(2.0E-4) || this.cR >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            ejz $$9 = this.dq();
            this.cn.b(new adm.b($$9.c, -999.0, $$9.e, this.dD(), this.dF(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cn.b(new adm.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF(), this.aC()));
         } else if ($$7) {
            this.cn.b(new adm.a(this.ds(), this.du(), this.dy(), this.aC()));
         } else if ($$8) {
            this.cn.b(new adm.c(this.dD(), this.dF(), this.aC()));
         } else if (this.cN != this.aC()) {
            this.cn.b(new adm.d(this.aC()));
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
         adt.a $$1 = $$0 ? adt.a.d : adt.a.e;
         this.cn.b(new adt(this, $$1));
         this.cQ = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ads.a $$1 = $$0 ? ads.a.d : ads.a.e;
      clo $$2 = this.fT().a($$0);
      this.cn.b(new ads($$1, hx.b, ib.a));
      return !$$2.b();
   }

   @Override
   public void a(bja $$0) {
      super.a($$0);
      this.cn.b(new aei($$0));
   }

   @Override
   public void fR() {
      this.cn.b(new ada(ada.a.a));
      etg.c();
   }

   @Override
   protected void f(bjt $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.ew() - $$1);
      }
   }

   @Override
   public void r() {
      this.cn.b(new adf(this.bS.j));
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
      this.cn.b(new adr(this.fU()));
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
      this.cn.b(new adt(this, adt.a.f, atq.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cn.b(new adt(this, adt.a.h));
   }

   public arg j() {
      return this.cE;
   }

   public esv m() {
      return this.cF;
   }

   public void a(cov<?> $$0) {
      if (this.cF.d($$0)) {
         this.cF.e($$0);
         this.cn.b(new adw($$0));
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
   public void a(uv $$0, boolean $$1) {
      this.cp.aV().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      hx $$2 = hx.a($$0, this.du(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ib $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ib[] $$7 = new ib[]{ib.e, ib.f, ib.c, ib.d};

         for (ib $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ib.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ejz $$11 = this.dq();
            if ($$5.o() == ib.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(hx $$0) {
      eju $$1 = this.cH();
      eju $$2 = new eju((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dN().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
   }

   @Override
   public void a(uv $$0) {
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
   public void a(aqu $$0, float $$1, float $$2) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2, false);
   }

   @Override
   public void a(aqu $$0, aqw $$1, float $$2, float $$3) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cZ() {
      return true;
   }

   @Override
   public void c(bja $$0) {
      clo $$1 = this.b($$0);
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
   public bja fp() {
      return Objects.requireNonNullElse(this.cW, bja.a);
   }

   @Override
   public void a(afs<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         bja $$2 = (this.an.b(t) & 2) > 0 ? bja.b : bja.a;
         if ($$1 && !this.cV) {
            this.c($$2);
         } else if (!$$1 && this.cV) {
            this.fu();
         }
      }

      if (ao.equals($$0) && this.fx() && !this.da) {
         this.cp.ah().a((gfh)(new gex(this)));
      }
   }

   @Nullable
   public blw q() {
      if (this.db() instanceof blw $$0 && $$0.a()) {
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
   public void a(dgr $$0, boolean $$1) {
      if ($$0 instanceof dgf $$2) {
         this.cp.a(new fcv($$2, $$1, this.cp.aP()));
      } else {
         this.cp.a(new fdi($$0, $$1, this.cp.aP()));
      }
   }

   @Override
   public void a(crg $$0) {
      this.cp.a(new fdf($$0));
   }

   @Override
   public void a(dfs $$0) {
      this.cp.a(new fci($$0));
   }

   @Override
   public void a(dgw $$0) {
      this.cp.a(new fdm($$0));
   }

   @Override
   public void a(dgi $$0) {
      this.cp.a(new fda($$0));
   }

   @Override
   public void a(clo $$0, bja $$1) {
      if ($$0.a(clr.tS)) {
         this.cp.a(new fce(this, $$0, $$1));
      }
   }

   @Override
   public void a(bkv $$0) {
      this.cp.g.a($$0, jw.g);
   }

   @Override
   public void b(bkv $$0) {
      this.cp.g.a($$0, jw.s);
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
      this.b(blx.a);
      if (this.dN() != null) {
         for (double $$0 = this.du(); $$0 > (double)this.dN().J_() && $$0 < (double)this.dN().ak(); $$0++) {
            this.a_(this.ds(), $$0, this.dy());
            if (this.dN().g(this)) {
               break;
            }
         }

         this.g(ejz.b);
         this.s(0.0F);
      }

      this.c(this.eN());
      this.aM = 0;
   }

   @Override
   public void d_() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (!(this.cp.y instanceof fax)) {
         this.G();
      }

      boolean $$0 = this.co.g;
      boolean $$1 = this.co.h;
      boolean $$2 = this.M();
      this.cO = !this.fU().b && !this.bZ() && !this.bO() && this.g(blx.f) && (this.bS() || !this.fE() && !this.g(blx.a));
      float $$3 = atq.a(0.3F + cqb.b(this), 0.0F, 1.0F);
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

      if (this.co.g && !$$10 && !$$0 && !this.fU().b && !this.bO() && !this.e_()) {
         clo $$11 = this.c(bla.e);
         if ($$11.a(clr.nS) && cki.d($$11) && this.fY()) {
            this.cn.b(new adt(this, adt.a.i));
         }
      }

      this.da = this.fx();
      if (this.aZ() && this.co.h && this.eb()) {
         this.fd();
      }

      if (this.a(arp.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.db = atq.a(this.db + $$12, 0, 600);
      } else if (this.db > 0) {
         this.a(arp.a);
         this.db = atq.a(this.db - 10, 0, 600);
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

      blw $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cT < 0) {
            this.cT++;
            if (this.cT == 0) {
               this.cU = 0.0F;
            }
         }

         if ($$0 && !this.co.g) {
            this.cT = -10;
            $$14.b(atq.d(this.u() * 100.0F));
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

      super.d_();
      if (this.aC() && this.fU().b && !this.cp.q.j()) {
         this.fU().b = false;
         this.y();
      }
   }

   @Override
   protected void ec() {
      this.aM++;
      if (this.aM == 20) {
         this.a(bkv.c.a);
      }
   }

   private void G() {
      this.cw = this.cv;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cp.y != null && !this.cp.y.j() && !(this.cp.y instanceof ezy)) {
            if (this.cp.y instanceof fby) {
               this.r();
            }

            this.cp.a(null);
         }

         if (this.cv == 0.0F) {
            this.cp.ah().a(gfc.b(aqv.tr, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(bkk.i) && !this.b(bkk.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cv > 0.0F) {
         $$0 = -0.05F;
      }

      this.cv = atq.a(this.cv + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.cX = false;
      if (this.db() instanceof cfs $$0) {
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
   public bki c(@Nullable bkg $$0) {
      if ($$0 == bkk.i) {
         this.cw = 0.0F;
         this.cv = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(blr $$0, ejz $$1) {
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
         ejz $$2 = this.dl();
         ejz $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ejz $$4 = new ejz((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fg();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ejy $$7 = this.co.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = atq.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = atq.b(this.dD() * (float) (Math.PI / 180.0));
            $$4 = new ejz((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = atq.i($$6);
         ejz $$13 = $$4.a((double)$$12);
         ejz $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            eke $$16 = eke.a(this);
            hx $$17 = hx.a(this.ds(), this.cH().e, this.dy());
            dhn $$18 = this.dN().a_($$17);
            if ($$18.b(this.dN(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dhn $$19 = this.dN().a_($$17);
               if ($$19.b(this.dN(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bkk.h)) {
                     $$21 += (float)(this.b(bkk.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ejz $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dh();
                  float $$26 = this.di();
                  eju $$27 = new eju($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ejz $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ejz $$28 = $$13.c(new ejz(0.0, 1.0, 0.0));
                  ejz $$29 = $$28.a((double)($$25 * 0.5F));
                  ejz $$30 = $$23.d($$29);
                  ejz $$31 = $$24.d($$29);
                  ejz $$32 = $$23.e($$29);
                  ejz $$33 = $$24.e($$29);
                  Iterable<eks> $$34 = this.dN().d(this, $$27);
                  Iterator<eju> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     eju $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ejz $$38 = $$37.f();
                        hx $$39 = hx.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           hx $$41 = $$39.b($$40);
                           dhn $$42 = this.dN().a_($$41);
                           eks $$43;
                           if (!($$43 = $$42.b(this.dN(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ib.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.du() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dhn $$44 = this.dN().a_($$17);
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
   protected boolean c(ejz $$0) {
      float $$1 = this.dD() * (float) (Math.PI / 180.0);
      double $$2 = (double)atq.a($$1);
      double $$3 = (double)atq.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = atq.k($$4) + atq.k($$5);
      double $$7 = atq.k($$0.c) + atq.k($$0.e);
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
      ejy $$0 = this.co.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fo() && !this.a(bkk.o) && (!this.bO() || this.c(this.da())) && !this.fx();
   }

   private boolean c(bkv $$0) {
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
      if (!this.a(arp.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.db >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = atq.a((float)this.db / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.db < 100.0F ? 0.0F : atq.a(((float)this.db - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(csc $$0) {
      if ($$0 == csc.d) {
         this.g(this.dq().a(ib.a.b, 0.0));
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
      if (this.P_()) {
         return this.ce;
      } else {
         if (!$$0 && $$1) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.x, aqw.i, 1.0F, 1.0F, false);
            this.cp.ah().a((gfh)(new gfk.b(this)));
         }

         if ($$0 && !$$1) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.y, aqw.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public ejz q(float $$0) {
      if (this.cp.m.ax().a()) {
         float $$1 = atq.i($$0 * 0.5F, this.dD(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = atq.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fn() == blf.b ? -1.0 : 1.0;
         ejz $$4 = new ejz(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(clo $$0, clo $$1, cgz $$2) {
      this.cp.ay().a($$0, $$1, $$2);
   }

   @Override
   public float dE() {
      return this.dD();
   }
}
