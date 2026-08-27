import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frk extends frh {
   public static final Logger cm = LogUtils.getLogger();
   private static final int cx = 20;
   private static final int cy = 600;
   private static final int cz = 100;
   private static final float cA = 0.6F;
   private static final double cB = 0.35;
   private static final double cC = 0.13962634F;
   private static final float cD = 0.3F;
   public final fmu cn;
   private final arn cE;
   private final etx cF;
   private final List<ggg> cG = Lists.newArrayList();
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
   public fri co;
   protected final euk cp;
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
   private bjk cW;
   private boolean cX;
   private boolean cY = true;
   private int cZ;
   private boolean da;
   private int db;
   private boolean dc = true;
   private boolean dd = false;

   public frk(euk $$0, fmt $$1, fmu $$2, arn $$3, etx $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.q());
      this.cp = $$0;
      this.cn = $$2;
      this.cE = $$3;
      this.cF = $$4;
      this.cP = $$5;
      this.cQ = $$6;
      this.cG.add(new ggy(this, $$0.ah()));
      this.cG.add(new ggl(this));
      this.cG.add(new ggk(this, $$0.ah(), $$1.G_()));
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(blf $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cgj) {
            this.cp.ah().a((ggw)(new ggq(this, (cgj)$$0, true)));
            this.cp.ah().a((ggw)(new ggq(this, (cgj)$$0, false)));
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
            this.cn.b(new adt.c(this.dC(), this.dE(), this.aC()));
            this.cn.b(new aeb(this.bk, this.bm, this.co.g, this.co.h));
            blf $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cn.b(new adu($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (ggg $$1 : this.cG) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (ggg $$0 : this.cG) {
         if ($$0 instanceof ggk) {
            return ((ggk)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cP) {
         aea.a $$1 = $$0 ? aea.a.a : aea.a.b;
         this.cn.b(new aea(this, $$1));
         this.cP = $$0;
      }

      if (this.w()) {
         double $$2 = this.dr() - this.cI;
         double $$3 = this.dt() - this.cJ;
         double $$4 = this.dx() - this.cK;
         double $$5 = (double)(this.dC() - this.cL);
         double $$6 = (double)(this.dE() - this.cM);
         this.cR++;
         boolean $$7 = aty.f($$2, $$3, $$4) > aty.k(2.0E-4) || this.cR >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            elb $$9 = this.dp();
            this.cn.b(new adt.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cn.b(new adt.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.cn.b(new adt.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.cn.b(new adt.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cN != this.aC()) {
            this.cn.b(new adt.d(this.aC()));
         }

         if ($$7) {
            this.cI = this.dr();
            this.cJ = this.dt();
            this.cK = this.dx();
            this.cR = 0;
         }

         if ($$8) {
            this.cL = this.dC();
            this.cM = this.dE();
         }

         this.cN = this.aC();
         this.cY = this.cp.m.F().c();
      }
   }

   private void E() {
      boolean $$0 = this.bY();
      if ($$0 != this.cQ) {
         aea.a $$1 = $$0 ? aea.a.d : aea.a.e;
         this.cn.b(new aea(this, $$1));
         this.cQ = $$0;
      }
   }

   public boolean a(boolean $$0) {
      adz.a $$1 = $$0 ? adz.a.d : adz.a.e;
      cmh $$2 = this.fS().a($$0);
      this.cn.b(new adz($$1, hv.b, ia.a));
      return !$$2.b();
   }

   @Override
   public void a(bjk $$0) {
      super.a($$0);
      this.cn.b(new aep($$0));
   }

   @Override
   public void fQ() {
      this.cn.b(new adh(adh.a.a));
      eui.c();
   }

   @Override
   protected void f(bkd $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.ev() - $$1);
      }
   }

   @Override
   public void r() {
      this.cn.b(new adm(this.bS.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cp.a(null);
   }

   public void D(float $$0) {
      if (this.cS) {
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
         this.cS = true;
      }
   }

   @Override
   public void y() {
      this.cn.b(new ady(this.fT()));
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
      this.cn.b(new aea(this, aea.a.f, aty.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cn.b(new aea(this, aea.a.h));
   }

   public arn j() {
      return this.cE;
   }

   public etx m() {
      return this.cF;
   }

   public void a(cpn<?> $$0) {
      if (this.cF.d($$0)) {
         this.cF.e($$0);
         this.cn.b(new aed($$0));
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
   public void a(vb $$0, boolean $$1) {
      this.cp.aV().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      hv $$2 = hv.a($$0, this.dt(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ia $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ia[] $$7 = new ia[]{ia.e, ia.f, ia.c, ia.d};

         for (ia $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ia.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            elb $$11 = this.dp();
            if ($$5.o() == ia.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(hv $$0) {
      ekw $$1 = this.cH();
      ekw $$2 = new ekw((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
   }

   @Override
   public void a(vb $$0) {
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
   public void a(arb $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(arb $$0, ard $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(bjk $$0) {
      cmh $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         super.c($$0);
         this.cV = true;
         this.cW = $$0;
      }
   }

   @Override
   public boolean fn() {
      return this.cV;
   }

   @Override
   public void ft() {
      super.ft();
      this.cV = false;
   }

   @Override
   public bjk fo() {
      return Objects.requireNonNullElse(this.cW, bjk.a);
   }

   @Override
   public void a(afz<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         bjk $$2 = (this.an.b(t) & 2) > 0 ? bjk.b : bjk.a;
         if ($$1 && !this.cV) {
            this.c($$2);
         } else if (!$$1 && this.cV) {
            this.ft();
         }
      }

      if (ao.equals($$0) && this.fw() && !this.da) {
         this.cp.ah().a((ggw)(new ggm(this)));
      }
   }

   @Nullable
   public bmg q() {
      if (this.da() instanceof bmg $$0 && $$0.a()) {
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
   public void a(dhm $$0, boolean $$1) {
      if ($$0 instanceof dha $$2) {
         this.cp.a(new fdy($$2, $$1, this.cp.aP()));
      } else {
         this.cp.a(new fel($$0, $$1, this.cp.aP()));
      }
   }

   @Override
   public void a(crz $$0) {
      this.cp.a(new fei($$0));
   }

   @Override
   public void a(dgn $$0) {
      this.cp.a(new fdl($$0));
   }

   @Override
   public void a(dhr $$0) {
      this.cp.a(new fep($$0));
   }

   @Override
   public void a(dhd $$0) {
      this.cp.a(new fed($$0));
   }

   @Override
   public void a(cmh $$0, bjk $$1) {
      if ($$0.a(cmk.tT)) {
         this.cp.a(new fdh(this, $$0, $$1));
      }
   }

   @Override
   public void a(blf $$0) {
      this.cp.g.a($$0, jv.g);
   }

   @Override
   public void b(blf $$0) {
      this.cp.g.a($$0, jv.s);
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
      this.b(bmh.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().J_() && $$0 < (double)this.dM().ak(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(elb.b);
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

      if (!(this.cp.y instanceof fca)) {
         this.G();
      }

      boolean $$0 = this.co.g;
      boolean $$1 = this.co.h;
      boolean $$2 = this.M();
      this.cO = !this.fT().b && !this.bZ() && !this.bO() && this.g(bmh.f) && (this.bS() || !this.fD() && !this.g(bmh.a));
      float $$3 = aty.a(0.3F + cqu.b(this), 0.0F, 1.0F);
      this.co.a(this.v(), $$3);
      this.cp.ay().a(this.co);
      if (this.fn() && !this.bO()) {
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
         cmh $$11 = this.c(blk.e);
         if ($$11.a(cmk.nS) && clb.d($$11) && this.fX()) {
            this.cn.b(new aea(this, aea.a.i));
         }
      }

      this.da = this.fw();
      if (this.aZ() && this.co.h && this.ea()) {
         this.fc();
      }

      if (this.a(arw.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.db = aty.a(this.db + $$12, 0, 600);
      } else if (this.db > 0) {
         this.a(arw.a);
         this.db = aty.a(this.db - 10, 0, 600);
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

      bmg $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cT < 0) {
            this.cT++;
            if (this.cT == 0) {
               this.cU = 0.0F;
            }
         }

         if ($$0 && !this.co.g) {
            this.cT = -10;
            $$14.b(aty.d(this.u() * 100.0F));
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
      if (this.aC() && this.fT().b && !this.cp.q.j()) {
         this.fT().b = false;
         this.y();
      }
   }

   @Override
   protected void eb() {
      this.aM++;
      if (this.aM == 20) {
         this.a(blf.c.a);
      }
   }

   private void G() {
      this.cw = this.cv;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cp.y != null && !this.cp.y.j() && !(this.cp.y instanceof fbb)) {
            if (this.cp.y instanceof fdb) {
               this.r();
            }

            this.cp.a(null);
         }

         if (this.cv == 0.0F) {
            this.cp.ah().a(ggr.b(arc.tM, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(bku.i) && !this.b(bku.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cv > 0.0F) {
         $$0 = -0.05F;
      }

      this.cv = aty.a(this.cv + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.cX = false;
      if (this.da() instanceof cgl $$0) {
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
   public bks c(@Nullable bkq $$0) {
      if ($$0 == bku.i) {
         this.cw = 0.0F;
         this.cv = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(bmb $$0, elb $$1) {
      double $$2 = this.dr();
      double $$3 = this.dx();
      super.a($$0, $$1);
      this.f((float)(this.dr() - $$2), (float)(this.dx() - $$3));
   }

   public boolean B() {
      return this.cY;
   }

   protected void f(float $$0, float $$1) {
      if (this.H()) {
         elb $$2 = this.dk();
         elb $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         elb $$4 = new elb((double)$$0, 0.0, (double)$$1);
         float $$5 = this.ff();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ela $$7 = this.co.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = aty.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = aty.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new elb((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = aty.i($$6);
         elb $$13 = $$4.a((double)$$12);
         elb $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            elg $$16 = elg.a(this);
            hv $$17 = hv.a(this.dr(), this.cH().e, this.dx());
            dip $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dip $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bku.h)) {
                     $$21 += (float)(this.b(bku.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  elb $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  ekw $$27 = new ekw($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  elb $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  elb $$28 = $$13.c(new elb(0.0, 1.0, 0.0));
                  elb $$29 = $$28.a((double)($$25 * 0.5F));
                  elb $$30 = $$23.d($$29);
                  elb $$31 = $$24.d($$29);
                  elb $$32 = $$23.e($$29);
                  elb $$33 = $$24.e($$29);
                  Iterable<elu> $$34 = this.dM().d(this, $$27);
                  Iterator<ekw> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ekw $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        elb $$38 = $$37.f();
                        hv $$39 = hv.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           hv $$41 = $$39.b($$40);
                           dip $$42 = this.dM().a_($$41);
                           elu $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ia.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dip $$44 = this.dM().a_($$17);
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
                        this.cZ = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(elb $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)aty.a($$1);
      double $$3 = (double)aty.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = aty.k($$4) + aty.k($$5);
      double $$7 = aty.k($$0.c) + aty.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.B() && this.cZ <= 0 && this.aC() && !this.fK() && !this.bO() && this.I() && (double)this.aK() >= 1.0;
   }

   private boolean I() {
      ela $$0 = this.co.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fn() && !this.a(bku.o) && (!this.bO() || this.c(this.cZ())) && !this.fw();
   }

   private boolean c(blf $$0) {
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
      if (!this.a(arw.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.db >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = aty.a((float)this.db / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.db < 100.0F ? 0.0F : aty.a(((float)this.db - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(csv $$0) {
      if ($$0 == csv.d) {
         this.g(this.dp().a(ia.a.b, 0.0));
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
            this.dM().a(this.dr(), this.dt(), this.dx(), arc.x, ard.i, 1.0F, 1.0F, false);
            this.cp.ah().a((ggw)(new ggz.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arc.y, ard.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public elb q(float $$0) {
      if (this.cp.m.ax().a()) {
         float $$1 = aty.i($$0 * 0.5F, this.dC(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = aty.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fm() == blp.b ? -1.0 : 1.0;
         elb $$4 = new elb(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cmh $$0, cmh $$1, chs $$2) {
      this.cp.ay().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
