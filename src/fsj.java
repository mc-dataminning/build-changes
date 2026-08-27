import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsj extends fsg {
   public static final Logger cm = LogUtils.getLogger();
   private static final int cy = 20;
   private static final int cz = 600;
   private static final int cA = 100;
   private static final float cB = 0.6F;
   private static final double cC = 0.35;
   private static final double cD = 0.13962634F;
   private static final float cE = 0.3F;
   public final fnt cn;
   private final asd cF;
   private final euv cG;
   private final List<ghk> cH = Lists.newArrayList();
   private int cI = 0;
   private double cJ;
   private double cK;
   private double cL;
   private float cM;
   private float cN;
   private boolean cO;
   private boolean cP;
   private boolean cQ;
   private boolean cR;
   private int cS;
   private boolean cT;
   public fsh co;
   protected final evi cp;
   protected int cq;
   public float cr;
   public float cs;
   public float ct;
   public float cu;
   private int cU;
   private float cV;
   public float cw;
   public float cx;
   private boolean cW;
   @Nullable
   private bka cX;
   private boolean cY;
   private boolean cZ = true;
   private int da;
   private boolean db;
   private int dc;
   private boolean dd = true;
   private boolean de = false;

   public fsj(evi $$0, fns $$1, fnt $$2, asd $$3, euv $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.q());
      this.cp = $$0;
      this.cn = $$2;
      this.cF = $$3;
      this.cG = $$4;
      this.cQ = $$5;
      this.cR = $$6;
      this.cH.add(new gic(this, $$0.ai()));
      this.cH.add(new ghp(this));
      this.cH.add(new gho(this, $$0.ai(), $$1.G_()));
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(blv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cha) {
            this.cp.ai().a((gia)(new ghu(this, (cha)$$0, true)));
            this.cp.ai().a((gia)(new ghu(this, (cha)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.cY = false;
   }

   @Override
   public float g(float $$0) {
      return this.dE();
   }

   @Override
   public float h(float $$0) {
      return this.bO() ? super.h($$0) : this.dC();
   }

   @Override
   public void l() {
      if (this.dM().f(this.dq(), this.dw())) {
         super.l();
         if (this.bO()) {
            this.cn.b(new aeg.c(this.dC(), this.dE(), this.aC()));
            this.cn.b(new aeo(this.bk, this.bm, this.co.g, this.co.h));
            blv $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cn.b(new aeh($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (ghk $$1 : this.cH) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (ghk $$0 : this.cH) {
         if ($$0 instanceof gho) {
            return ((gho)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cQ) {
         aen.a $$1 = $$0 ? aen.a.a : aen.a.b;
         this.cn.b(new aen(this, $$1));
         this.cQ = $$0;
      }

      if (this.w()) {
         double $$2 = this.dr() - this.cJ;
         double $$3 = this.dt() - this.cK;
         double $$4 = this.dx() - this.cL;
         double $$5 = (double)(this.dC() - this.cM);
         double $$6 = (double)(this.dE() - this.cN);
         this.cS++;
         boolean $$7 = auo.f($$2, $$3, $$4) > auo.k(2.0E-4) || this.cS >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            elt $$9 = this.dp();
            this.cn.b(new aeg.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cn.b(new aeg.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.cn.b(new aeg.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.cn.b(new aeg.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cO != this.aC()) {
            this.cn.b(new aeg.d(this.aC()));
         }

         if ($$7) {
            this.cJ = this.dr();
            this.cK = this.dt();
            this.cL = this.dx();
            this.cS = 0;
         }

         if ($$8) {
            this.cM = this.dC();
            this.cN = this.dE();
         }

         this.cO = this.aC();
         this.cZ = this.cp.m.F().c();
      }
   }

   private void E() {
      boolean $$0 = this.bY();
      if ($$0 != this.cR) {
         aen.a $$1 = $$0 ? aen.a.d : aen.a.e;
         this.cn.b(new aen(this, $$1));
         this.cR = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aem.a $$1 = $$0 ? aem.a.d : aem.a.e;
      cmy $$2 = this.fS().a($$0);
      this.cn.b(new aem($$1, hx.b, ic.a));
      return !$$2.b();
   }

   @Override
   public void a(bka $$0) {
      super.a($$0);
      this.cn.b(new afc($$0));
   }

   @Override
   public void fQ() {
      this.cn.b(new adu(adu.a.a));
      evg.c();
   }

   @Override
   protected void f(bkt $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.ev() - $$1);
      }
   }

   @Override
   public void r() {
      this.cn.b(new adz(this.bS.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cp.a(null);
   }

   public void D(float $$0) {
      if (this.cT) {
         float $$1 = this.ev() - $$0;
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
         this.cT = true;
      }
   }

   @Override
   public void y() {
      this.cn.b(new ael(this.fT()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fv() {
      return !this.fT().b && super.fv();
   }

   @Override
   public boolean bl() {
      return !this.fT().b && super.bl();
   }

   @Override
   public boolean dS() {
      return !this.fT().b && super.dS();
   }

   protected void h() {
      this.cn.b(new aen(this, aen.a.f, auo.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cn.b(new aen(this, aen.a.h));
   }

   public asd j() {
      return this.cF;
   }

   public euv m() {
      return this.cG;
   }

   public void a(cqe<?> $$0) {
      if (this.cG.d($$0)) {
         this.cG.e($$0);
         this.cn.b(new aeq($$0));
      }
   }

   @Override
   protected int F() {
      return this.cI;
   }

   public void a(int $$0) {
      this.cI = $$0;
   }

   @Override
   public void a(vf $$0, boolean $$1) {
      this.cp.aX().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      hx $$2 = hx.a($$0, this.dt(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ic $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ic[] $$7 = new ic[]{ic.e, ic.f, ic.c, ic.d};

         for (ic $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ic.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            elt $$11 = this.dp();
            if ($$5.o() == ic.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(hx $$0) {
      elo $$1 = this.cH();
      elo $$2 = new elo((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
   }

   @Override
   public void a(vf $$0) {
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
      this.dd = $$0;
   }

   public boolean o() {
      return this.dd;
   }

   public void w(boolean $$0) {
      this.de = $$0;
   }

   public boolean p() {
      return this.de;
   }

   @Override
   public void a(arr $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(arr $$0, art $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(bka $$0) {
      cmy $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         super.c($$0);
         this.cW = true;
         this.cX = $$0;
      }
   }

   @Override
   public boolean fn() {
      return this.cW;
   }

   @Override
   public void ft() {
      super.ft();
      this.cW = false;
   }

   @Override
   public bka fo() {
      return Objects.requireNonNullElse(this.cX, bka.a);
   }

   @Override
   public void a(agm<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         bka $$2 = (this.an.b(t) & 2) > 0 ? bka.b : bka.a;
         if ($$1 && !this.cW) {
            this.c($$2);
         } else if (!$$1 && this.cW) {
            this.ft();
         }
      }

      if (ao.equals($$0) && this.fw() && !this.db) {
         this.cp.ai().a((gia)(new ghq(this)));
      }
   }

   @Nullable
   public bmw q() {
      if (this.da() instanceof bmw $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float u() {
      return this.cV;
   }

   @Override
   public boolean Y() {
      return this.cp.aQ();
   }

   @Override
   public void a(die $$0, boolean $$1) {
      if ($$0 instanceof dhs $$2) {
         this.cp.a(new fex($$2, $$1, this.cp.aQ()));
      } else {
         this.cp.a(new ffk($$0, $$1, this.cp.aQ()));
      }
   }

   @Override
   public void a(csq $$0) {
      this.cp.a(new ffh($$0));
   }

   @Override
   public void a(dhf $$0) {
      this.cp.a(new fek($$0));
   }

   @Override
   public void a(dij $$0) {
      this.cp.a(new ffo($$0));
   }

   @Override
   public void a(dhv $$0) {
      this.cp.a(new ffc($$0));
   }

   @Override
   public void a(cmy $$0, bka $$1) {
      if ($$0.a(cnb.tT)) {
         this.cp.a(new feg(this, $$0, $$1));
      }
   }

   @Override
   public void a(blv $$0) {
      this.cp.g.a($$0, jx.g);
   }

   @Override
   public void b(blv $$0) {
      this.cp.g.a($$0, jx.s);
   }

   @Override
   public boolean bS() {
      return this.co != null && this.co.h;
   }

   @Override
   public boolean bX() {
      return this.cP;
   }

   public boolean v() {
      return this.bX() || this.cb();
   }

   @Override
   public void fi() {
      super.fi();
      if (this.w()) {
         this.bk = this.co.a;
         this.bm = this.co.b;
         this.bj = this.co.g;
         this.ct = this.cr;
         this.cu = this.cs;
         this.cs = this.cs + (this.dE() - this.cs) * 0.5F;
         this.cr = this.cr + (this.dC() - this.cr) * 0.5F;
      }
   }

   protected boolean w() {
      return this.cp.am() == this;
   }

   @Override
   public void z() {
      this.b(bmx.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().J_() && $$0 < (double)this.dM().al(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(elt.b);
         this.s(0.0F);
      }

      this.c(this.eM());
      this.aM = 0;
   }

   @Override
   public void d_() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (!(this.cp.y instanceof fcz)) {
         this.G();
      }

      boolean $$0 = this.co.g;
      boolean $$1 = this.co.h;
      boolean $$2 = this.M();
      this.cP = !this.fT().b && !this.bZ() && !this.bO() && this.g(bmx.f) && (this.bS() || !this.fD() && !this.g(bmx.a));
      float $$3 = auo.a(0.3F + crl.b(this), 0.0F, 1.0F);
      this.co.a(this.v(), $$3);
      this.cp.az().a(this.co);
      if (this.fn() && !this.bO()) {
         this.co.a *= 0.2F;
         this.co.b *= 0.2F;
         this.cq = 0;
      }

      boolean $$4 = false;
      if (this.da > 0) {
         this.da--;
         $$4 = true;
         this.co.g = true;
      }

      if (!this.af) {
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
      }

      if ($$1) {
         this.cq = 0;
      }

      boolean $$5 = this.K();
      boolean $$6 = this.bO() ? this.cZ().aC() : this.aC();
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
      if (this.fT().c) {
         if (this.cp.q.j()) {
            if (!this.fT().b) {
               this.fT().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.co.g && !$$4) {
            if (this.bU == 0) {
               this.bU = 7;
            } else if (!this.bZ()) {
               this.fT().b = !this.fT().b;
               $$10 = true;
               this.y();
               this.bU = 0;
            }
         }
      }

      if (this.co.g && !$$10 && !$$0 && !this.fT().b && !this.bO() && !this.e_()) {
         cmy $$11 = this.c(bma.e);
         if ($$11.a(cnb.nS) && cls.d($$11) && this.fX()) {
            this.cn.b(new aen(this, aen.a.i));
         }
      }

      this.db = this.fw();
      if (this.aZ() && this.co.h && this.ea()) {
         this.fc();
      }

      if (this.a(asm.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.dc = auo.a(this.dc + $$12, 0, 600);
      } else if (this.dc > 0) {
         this.a(asm.a);
         this.dc = auo.a(this.dc - 10, 0, 600);
      }

      if (this.fT().b && this.w()) {
         int $$13 = 0;
         if (this.co.h) {
            $$13--;
         }

         if (this.co.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dp().b(0.0, (double)((float)$$13 * this.fT().a() * 3.0F), 0.0));
         }
      }

      bmw $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cU < 0) {
            this.cU++;
            if (this.cU == 0) {
               this.cV = 0.0F;
            }
         }

         if ($$0 && !this.co.g) {
            this.cU = -10;
            $$14.b(auo.d(this.u() * 100.0F));
            this.h();
         } else if (!$$0 && this.co.g) {
            this.cU = 0;
            this.cV = 0.0F;
         } else if ($$0) {
            this.cU++;
            if (this.cU < 10) {
               this.cV = (float)this.cU * 0.1F;
            } else {
               this.cV = 0.8F + 2.0F / (float)(this.cU - 9) * 0.1F;
            }
         }
      } else {
         this.cV = 0.0F;
      }

      super.d_();
      if (this.aC() && this.fT().b && !this.cp.q.j()) {
         this.fT().b = false;
         this.y();
      }
   }

   @Override
   protected void eb() {
      this.aM++;
      if (this.aM == 20) {
         this.a(blv.c.a);
      }
   }

   private void G() {
      this.cx = this.cw;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cp.y != null && !this.cp.y.k() && !(this.cp.y instanceof fca)) {
            if (this.cp.y instanceof fea) {
               this.r();
            }

            this.cp.a(null);
         }

         if (this.cw == 0.0F) {
            this.cp.ai().a(ghv.b(ars.tM, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(blk.i) && !this.b(blk.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cw > 0.0F) {
         $$0 = -0.05F;
      }

      this.cw = auo.a(this.cw + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.cY = false;
      if (this.da() instanceof chc $$0) {
         $$0.a(this.co.e, this.co.f, this.co.c, this.co.d);
         this.cY = this.cY | (this.co.e || this.co.f || this.co.c || this.co.d);
      }
   }

   @Override
   public boolean A() {
      return this.cY;
   }

   @Nullable
   @Override
   public bli c(@Nullable blg $$0) {
      if ($$0 == blk.i) {
         this.cx = 0.0F;
         this.cw = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(bmr $$0, elt $$1) {
      double $$2 = this.dr();
      double $$3 = this.dx();
      super.a($$0, $$1);
      this.f((float)(this.dr() - $$2), (float)(this.dx() - $$3));
   }

   public boolean B() {
      return this.cZ;
   }

   protected void f(float $$0, float $$1) {
      if (this.H()) {
         elt $$2 = this.dk();
         elt $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         elt $$4 = new elt((double)$$0, 0.0, (double)$$1);
         float $$5 = this.ff();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            els $$7 = this.co.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = auo.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = auo.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new elt((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = auo.i($$6);
         elt $$13 = $$4.a((double)$$12);
         elt $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ely $$16 = ely.a(this);
            hx $$17 = hx.a(this.dr(), this.cH().e, this.dx());
            djh $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               djh $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(blk.h)) {
                     $$21 += (float)(this.b(blk.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  elt $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  elo $$27 = new elo($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  elt $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  elt $$28 = $$13.c(new elt(0.0, 1.0, 0.0));
                  elt $$29 = $$28.a((double)($$25 * 0.5F));
                  elt $$30 = $$23.d($$29);
                  elt $$31 = $$24.d($$29);
                  elt $$32 = $$23.e($$29);
                  elt $$33 = $$24.e($$29);
                  Iterable<emm> $$34 = this.dM().d(this, $$27);
                  Iterator<elo> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     elo $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        elt $$38 = $$37.f();
                        hx $$39 = hx.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           hx $$41 = $$39.b($$40);
                           djh $$42 = this.dM().a_($$41);
                           emm $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ic.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              djh $$44 = this.dM().a_($$17);
                              if (!$$44.b(this.dM(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dt());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.da = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(elt $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)auo.a($$1);
      double $$3 = (double)auo.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = auo.k($$4) + auo.k($$5);
      double $$7 = auo.k($$0.c) + auo.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.B() && this.da <= 0 && this.aC() && !this.fK() && !this.bO() && this.I() && (double)this.aK() >= 1.0;
   }

   private boolean I() {
      els $$0 = this.co.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fn() && !this.a(blk.o) && (!this.bO() || this.c(this.cZ())) && !this.fw();
   }

   private boolean c(blv $$0) {
      return $$0.dF() && $$0.cX();
   }

   private boolean M() {
      double $$0 = 0.8;
      return this.be() ? this.co.b() : (double)this.co.b >= 0.8;
   }

   private boolean N() {
      return this.bO() || (float)this.gc().a() > 6.0F || this.fT().c;
   }

   public float C() {
      if (!this.a(asm.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dc >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = auo.a((float)this.dc / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dc < 100.0F ? 0.0F : auo.a(((float)this.dc - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(ctm $$0) {
      if ($$0 == ctm.d) {
         this.g(this.dp().a(ic.a.b, 0.0));
      }
   }

   @Override
   public boolean be() {
      return this.ce;
   }

   @Override
   protected boolean fL() {
      boolean $$0 = this.ce;
      boolean $$1 = super.fL();
      if (this.P_()) {
         return this.ce;
      } else {
         if (!$$0 && $$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), ars.x, art.i, 1.0F, 1.0F, false);
            this.cp.ai().a((gia)(new gid.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), ars.y, art.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public elt q(float $$0) {
      if (this.cp.m.ax().a()) {
         float $$1 = auo.i($$0 * 0.5F, this.dC(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = auo.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fm() == bmf.b ? -1.0 : 1.0;
         elt $$4 = new elt(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cmy $$0, cmy $$1, cij $$2) {
      this.cp.az().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
