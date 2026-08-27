import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsb extends fry {
   public static final Logger cm = LogUtils.getLogger();
   private static final int cy = 20;
   private static final int cz = 600;
   private static final int cA = 100;
   private static final float cB = 0.6F;
   private static final double cC = 0.35;
   private static final double cD = 0.13962634F;
   private static final float cE = 0.3F;
   public final fnl cn;
   private final arx cF;
   private final eun cG;
   private final List<ggx> cH = Lists.newArrayList();
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
   public frz co;
   protected final eva cp;
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
   private bju cX;
   private boolean cY;
   private boolean cZ = true;
   private int da;
   private boolean db;
   private int dc;
   private boolean dd = true;
   private boolean de = false;

   public fsb(eva $$0, fnk $$1, fnl $$2, arx $$3, eun $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.q());
      this.cp = $$0;
      this.cn = $$2;
      this.cF = $$3;
      this.cG = $$4;
      this.cQ = $$5;
      this.cR = $$6;
      this.cH.add(new ghp(this, $$0.ah()));
      this.cH.add(new ghc(this));
      this.cH.add(new ghb(this, $$0.ah(), $$1.G_()));
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(blp $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cgt) {
            this.cp.ah().a((ghn)(new ghh(this, (cgt)$$0, true)));
            this.cp.ah().a((ghn)(new ghh(this, (cgt)$$0, false)));
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
            this.cn.b(new aed.c(this.dC(), this.dE(), this.aC()));
            this.cn.b(new ael(this.bk, this.bm, this.co.g, this.co.h));
            blp $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cn.b(new aee($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (ggx $$1 : this.cH) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (ggx $$0 : this.cH) {
         if ($$0 instanceof ghb) {
            return ((ghb)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cQ) {
         aek.a $$1 = $$0 ? aek.a.a : aek.a.b;
         this.cn.b(new aek(this, $$1));
         this.cQ = $$0;
      }

      if (this.w()) {
         double $$2 = this.dr() - this.cJ;
         double $$3 = this.dt() - this.cK;
         double $$4 = this.dx() - this.cL;
         double $$5 = (double)(this.dC() - this.cM);
         double $$6 = (double)(this.dE() - this.cN);
         this.cS++;
         boolean $$7 = aui.f($$2, $$3, $$4) > aui.k(2.0E-4) || this.cS >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            elm $$9 = this.dp();
            this.cn.b(new aed.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cn.b(new aed.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.cn.b(new aed.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.cn.b(new aed.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cO != this.aC()) {
            this.cn.b(new aed.d(this.aC()));
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
         aek.a $$1 = $$0 ? aek.a.d : aek.a.e;
         this.cn.b(new aek(this, $$1));
         this.cR = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aej.a $$1 = $$0 ? aej.a.d : aej.a.e;
      cmr $$2 = this.fS().a($$0);
      this.cn.b(new aej($$1, hx.b, ic.a));
      return !$$2.b();
   }

   @Override
   public void a(bju $$0) {
      super.a($$0);
      this.cn.b(new aez($$0));
   }

   @Override
   public void fQ() {
      this.cn.b(new adr(adr.a.a));
      euy.c();
   }

   @Override
   protected void f(bkn $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.ev() - $$1);
      }
   }

   @Override
   public void r() {
      this.cn.b(new adw(this.bS.j));
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
      this.cn.b(new aei(this.fT()));
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
      this.cn.b(new aek(this, aek.a.f, aui.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cn.b(new aek(this, aek.a.h));
   }

   public arx j() {
      return this.cF;
   }

   public eun m() {
      return this.cG;
   }

   public void a(cpx<?> $$0) {
      if (this.cG.d($$0)) {
         this.cG.e($$0);
         this.cn.b(new aen($$0));
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
   public void a(vd $$0, boolean $$1) {
      this.cp.aV().a($$0, $$1);
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
            elm $$11 = this.dp();
            if ($$5.o() == ic.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(hx $$0) {
      elh $$1 = this.cH();
      elh $$2 = new elh((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
   }

   @Override
   public void a(vd $$0) {
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
   public void a(arl $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(arl $$0, arn $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(bju $$0) {
      cmr $$1 = this.b($$0);
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
   public bju fo() {
      return Objects.requireNonNullElse(this.cX, bju.a);
   }

   @Override
   public void a(agj<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         bju $$2 = (this.an.b(t) & 2) > 0 ? bju.b : bju.a;
         if ($$1 && !this.cW) {
            this.c($$2);
         } else if (!$$1 && this.cW) {
            this.ft();
         }
      }

      if (ao.equals($$0) && this.fw() && !this.db) {
         this.cp.ah().a((ghn)(new ghd(this)));
      }
   }

   @Nullable
   public bmq q() {
      if (this.da() instanceof bmq $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float u() {
      return this.cV;
   }

   @Override
   public boolean Y() {
      return this.cp.aP();
   }

   @Override
   public void a(dhx $$0, boolean $$1) {
      if ($$0 instanceof dhl $$2) {
         this.cp.a(new fep($$2, $$1, this.cp.aP()));
      } else {
         this.cp.a(new ffc($$0, $$1, this.cp.aP()));
      }
   }

   @Override
   public void a(csj $$0) {
      this.cp.a(new fez($$0));
   }

   @Override
   public void a(dgy $$0) {
      this.cp.a(new fec($$0));
   }

   @Override
   public void a(dic $$0) {
      this.cp.a(new ffg($$0));
   }

   @Override
   public void a(dho $$0) {
      this.cp.a(new feu($$0));
   }

   @Override
   public void a(cmr $$0, bju $$1) {
      if ($$0.a(cmu.tT)) {
         this.cp.a(new fdy(this, $$0, $$1));
      }
   }

   @Override
   public void a(blp $$0) {
      this.cp.g.a($$0, jx.g);
   }

   @Override
   public void b(blp $$0) {
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
      return this.cp.al() == this;
   }

   @Override
   public void z() {
      this.b(bmr.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().J_() && $$0 < (double)this.dM().al(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(elm.b);
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

      if (!(this.cp.y instanceof fcr)) {
         this.G();
      }

      boolean $$0 = this.co.g;
      boolean $$1 = this.co.h;
      boolean $$2 = this.M();
      this.cP = !this.fT().b && !this.bZ() && !this.bO() && this.g(bmr.f) && (this.bS() || !this.fD() && !this.g(bmr.a));
      float $$3 = aui.a(0.3F + cre.b(this), 0.0F, 1.0F);
      this.co.a(this.v(), $$3);
      this.cp.ay().a(this.co);
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
         cmr $$11 = this.c(blu.e);
         if ($$11.a(cmu.nS) && cll.d($$11) && this.fX()) {
            this.cn.b(new aek(this, aek.a.i));
         }
      }

      this.db = this.fw();
      if (this.aZ() && this.co.h && this.ea()) {
         this.fc();
      }

      if (this.a(asg.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.dc = aui.a(this.dc + $$12, 0, 600);
      } else if (this.dc > 0) {
         this.a(asg.a);
         this.dc = aui.a(this.dc - 10, 0, 600);
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

      bmq $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cU < 0) {
            this.cU++;
            if (this.cU == 0) {
               this.cV = 0.0F;
            }
         }

         if ($$0 && !this.co.g) {
            this.cU = -10;
            $$14.b(aui.d(this.u() * 100.0F));
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
         this.a(blp.c.a);
      }
   }

   private void G() {
      this.cx = this.cw;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cp.y != null && !this.cp.y.k() && !(this.cp.y instanceof fbs)) {
            if (this.cp.y instanceof fds) {
               this.r();
            }

            this.cp.a(null);
         }

         if (this.cw == 0.0F) {
            this.cp.ah().a(ghi.b(arm.tM, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(ble.i) && !this.b(ble.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cw > 0.0F) {
         $$0 = -0.05F;
      }

      this.cw = aui.a(this.cw + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.cY = false;
      if (this.da() instanceof cgv $$0) {
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
   public blc c(@Nullable bla $$0) {
      if ($$0 == ble.i) {
         this.cx = 0.0F;
         this.cw = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(bml $$0, elm $$1) {
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
         elm $$2 = this.dk();
         elm $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         elm $$4 = new elm((double)$$0, 0.0, (double)$$1);
         float $$5 = this.ff();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ell $$7 = this.co.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = aui.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = aui.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new elm((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = aui.i($$6);
         elm $$13 = $$4.a((double)$$12);
         elm $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            elr $$16 = elr.a(this);
            hx $$17 = hx.a(this.dr(), this.cH().e, this.dx());
            dja $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dja $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(ble.h)) {
                     $$21 += (float)(this.b(ble.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  elm $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  elh $$27 = new elh($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  elm $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  elm $$28 = $$13.c(new elm(0.0, 1.0, 0.0));
                  elm $$29 = $$28.a((double)($$25 * 0.5F));
                  elm $$30 = $$23.d($$29);
                  elm $$31 = $$24.d($$29);
                  elm $$32 = $$23.e($$29);
                  elm $$33 = $$24.e($$29);
                  Iterable<emf> $$34 = this.dM().d(this, $$27);
                  Iterator<elh> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     elh $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        elm $$38 = $$37.f();
                        hx $$39 = hx.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           hx $$41 = $$39.b($$40);
                           dja $$42 = this.dM().a_($$41);
                           emf $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ic.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dja $$44 = this.dM().a_($$17);
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
   protected boolean c(elm $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)aui.a($$1);
      double $$3 = (double)aui.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = aui.k($$4) + aui.k($$5);
      double $$7 = aui.k($$0.c) + aui.k($$0.e);
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
      ell $$0 = this.co.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fn() && !this.a(ble.o) && (!this.bO() || this.c(this.cZ())) && !this.fw();
   }

   private boolean c(blp $$0) {
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
      if (!this.a(asg.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dc >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = aui.a((float)this.dc / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dc < 100.0F ? 0.0F : aui.a(((float)this.dc - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(ctf $$0) {
      if ($$0 == ctf.d) {
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
            this.dM().a(this.dr(), this.dt(), this.dx(), arm.x, arn.i, 1.0F, 1.0F, false);
            this.cp.ah().a((ghn)(new ghq.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arm.y, arn.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public elm q(float $$0) {
      if (this.cp.m.ax().a()) {
         float $$1 = aui.i($$0 * 0.5F, this.dC(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = aui.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fm() == blz.b ? -1.0 : 1.0;
         elm $$4 = new elm(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cmr $$0, cmr $$1, cic $$2) {
      this.cp.ay().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
