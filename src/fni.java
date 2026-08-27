import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fni extends fnf {
   public static final Logger cm = LogUtils.getLogger();
   private static final int cx = 20;
   private static final int cy = 600;
   private static final int cz = 100;
   private static final float cA = 0.6F;
   private static final double cB = 0.35;
   private static final double cC = 0.13962634F;
   private static final float cD = 0.3F;
   public final fja cn;
   private final apq cE;
   private final eqk cF;
   private final List<gby> cG = Lists.newArrayList();
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
   public fng co;
   protected final eqx cp;
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
   private bgz cW;
   private boolean cX;
   private boolean cY = true;
   private int cZ;
   private boolean da;
   private int db;
   private boolean dc = true;
   private boolean dd = false;

   public fni(eqx $$0, fiz $$1, fja $$2, apq $$3, eqk $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cp = $$0;
      this.cn = $$2;
      this.cE = $$3;
      this.cF = $$4;
      this.cP = $$5;
      this.cQ = $$6;
      this.cG.add(new gcq(this, $$0.ai()));
      this.cG.add(new gcd(this));
      this.cG.add(new gcc(this, $$0.ai(), $$1.E_()));
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(bis $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cdn) {
            this.cp.ai().a((gco)(new gci(this, (cdn)$$0, true)));
            this.cp.ai().a((gco)(new gci(this, (cdn)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bB() {
      super.bB();
      this.cX = false;
   }

   @Override
   public float g(float $$0) {
      return this.dD();
   }

   @Override
   public float h(float $$0) {
      return this.bN() ? super.h($$0) : this.dB();
   }

   @Override
   public void l() {
      if (this.dL().f(this.dp(), this.dv())) {
         super.l();
         if (this.bN()) {
            this.cn.b(new aca.c(this.dB(), this.dD(), this.aA()));
            this.cn.b(new aci(this.bk, this.bm, this.co.g, this.co.h));
            bis $$0 = this.cV();
            if ($$0 != this && $$0.cW()) {
               this.cn.b(new acb($$0));
               this.C();
            }
         } else {
            this.B();
         }

         for (gby $$1 : this.cG) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gby $$0 : this.cG) {
         if ($$0 instanceof gcc) {
            return ((gcc)$$0).b();
         }
      }

      return 0.0F;
   }

   private void B() {
      this.C();
      boolean $$0 = this.bR();
      if ($$0 != this.cP) {
         ach.a $$1 = $$0 ? ach.a.a : ach.a.b;
         this.cn.b(new ach(this, $$1));
         this.cP = $$0;
      }

      if (this.v()) {
         double $$2 = this.dq() - this.cI;
         double $$3 = this.ds() - this.cJ;
         double $$4 = this.dw() - this.cK;
         double $$5 = (double)(this.dB() - this.cL);
         double $$6 = (double)(this.dD() - this.cM);
         this.cR++;
         boolean $$7 = ary.f($$2, $$3, $$4) > ary.k(2.0E-4) || this.cR >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bN()) {
            ehp $$9 = this.do();
            this.cn.b(new aca.b($$9.c, -999.0, $$9.e, this.dB(), this.dD(), this.aA()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cn.b(new aca.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD(), this.aA()));
         } else if ($$7) {
            this.cn.b(new aca.a(this.dq(), this.ds(), this.dw(), this.aA()));
         } else if ($$8) {
            this.cn.b(new aca.c(this.dB(), this.dD(), this.aA()));
         } else if (this.cN != this.aA()) {
            this.cn.b(new aca.d(this.aA()));
         }

         if ($$7) {
            this.cI = this.dq();
            this.cJ = this.ds();
            this.cK = this.dw();
            this.cR = 0;
         }

         if ($$8) {
            this.cL = this.dB();
            this.cM = this.dD();
         }

         this.cN = this.aA();
         this.cY = this.cp.m.E().c();
      }
   }

   private void C() {
      boolean $$0 = this.bX();
      if ($$0 != this.cQ) {
         ach.a $$1 = $$0 ? ach.a.d : ach.a.e;
         this.cn.b(new ach(this, $$1));
         this.cQ = $$0;
      }
   }

   public boolean a(boolean $$0) {
      acg.a $$1 = $$0 ? acg.a.d : acg.a.e;
      cjh $$2 = this.fR().a($$0);
      this.cn.b(new acg($$1, gw.b, hc.a));
      return !$$2.b();
   }

   @Override
   public void a(bgz $$0) {
      super.a($$0);
      this.cn.b(new acw($$0));
   }

   @Override
   public void fP() {
      this.cn.b(new abp(abp.a.a));
      eqv.c();
   }

   @Override
   protected void f(bhq $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.eu() - $$1);
      }
   }

   @Override
   public void q() {
      this.cn.b(new abu(this.bS.j));
      this.e();
   }

   public void e() {
      super.q();
      this.cp.a(null);
   }

   public void D(float $$0) {
      if (this.cS) {
         float $$1 = this.eu() - $$0;
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
   public void w() {
      this.cn.b(new acf(this.fS()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fu() {
      return !this.fS().b && super.fu();
   }

   @Override
   public boolean bj() {
      return !this.fS().b && super.bj();
   }

   @Override
   public boolean dR() {
      return !this.fS().b && super.dR();
   }

   protected void h() {
      this.cn.b(new ach(this, ach.a.f, ary.d(this.t() * 100.0F)));
   }

   public void i() {
      this.cn.b(new ach(this, ach.a.h));
   }

   public apq j() {
      return this.cE;
   }

   public eqk m() {
      return this.cF;
   }

   public void a(cmm<?> $$0) {
      if (this.cF.d($$0)) {
         this.cF.e($$0);
         this.cn.b(new ack($$0));
      }
   }

   @Override
   protected int D() {
      return this.cH;
   }

   public void a(int $$0) {
      this.cH = $$0;
   }

   @Override
   public void a(tn $$0, boolean $$1) {
      this.cp.aW().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      gw $$2 = gw.a($$0, this.ds(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         hc $$5 = null;
         double $$6 = Double.MAX_VALUE;
         hc[] $$7 = new hc[]{hc.e, hc.f, hc.c, hc.d};

         for (hc $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == hc.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ehp $$11 = this.do();
            if ($$5.o() == hc.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(gw $$0) {
      ehk $$1 = this.cG();
      ehk $$2 = new ehk((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dL().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
   }

   @Override
   public void a(tn $$0) {
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

   public void v(boolean $$0) {
      this.dd = $$0;
   }

   public boolean p() {
      return this.dd;
   }

   @Override
   public void a(ape $$0, float $$1, float $$2) {
      this.dL().a(this.dq(), this.ds(), this.dw(), $$0, this.da(), $$1, $$2, false);
   }

   @Override
   public void a(ape $$0, apg $$1, float $$2, float $$3) {
      this.dL().a(this.dq(), this.ds(), this.dw(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cX() {
      return true;
   }

   @Override
   public void c(bgz $$0) {
      cjh $$1 = this.b($$0);
      if (!$$1.b() && !this.fm()) {
         super.c($$0);
         this.cV = true;
         this.cW = $$0;
      }
   }

   @Override
   public boolean fm() {
      return this.cV;
   }

   @Override
   public void fs() {
      super.fs();
      this.cV = false;
   }

   @Override
   public bgz fn() {
      return Objects.requireNonNullElse(this.cW, bgz.a);
   }

   @Override
   public void a(aeg<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         bgz $$2 = (this.an.b(t) & 2) > 0 ? bgz.b : bgz.a;
         if ($$1 && !this.cV) {
            this.c($$2);
         } else if (!$$1 && this.cV) {
            this.fs();
         }
      }

      if (ao.equals($$0) && this.fv() && !this.da) {
         this.cp.ai().a((gco)(new gce(this)));
      }
   }

   @Nullable
   public bjt s() {
      if (this.cZ() instanceof bjt $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float t() {
      return this.cU;
   }

   @Override
   public boolean W() {
      return this.cp.aQ();
   }

   @Override
   public void a(def $$0, boolean $$1) {
      if ($$0 instanceof ddt $$2) {
         this.cp.a(new fag($$2, $$1, this.cp.aQ()));
      } else {
         this.cp.a(new fat($$0, $$1, this.cp.aQ()));
      }
   }

   @Override
   public void a(coy $$0) {
      this.cp.a(new faq($$0));
   }

   @Override
   public void a(ddh $$0) {
      this.cp.a(new ezu($$0));
   }

   @Override
   public void a(dek $$0) {
      this.cp.a(new fax($$0));
   }

   @Override
   public void a(ddw $$0) {
      this.cp.a(new fal($$0));
   }

   @Override
   public void a(cjh $$0, bgz $$1) {
      if ($$0.a(cjk.tg)) {
         this.cp.a(new ezq(this, $$0, $$1));
      }
   }

   @Override
   public void a(bis $$0) {
      this.cp.g.a($$0, ix.g);
   }

   @Override
   public void b(bis $$0) {
      this.cp.g.a($$0, ix.s);
   }

   @Override
   public boolean bR() {
      return this.co != null && this.co.h;
   }

   @Override
   public boolean bW() {
      return this.cO;
   }

   public boolean u() {
      return this.bW() || this.ca();
   }

   @Override
   public void fg() {
      super.fg();
      if (this.v()) {
         this.bk = this.co.a;
         this.bm = this.co.b;
         this.bj = this.co.g;
         this.ct = this.cr;
         this.cu = this.cs;
         this.cs = this.cs + (this.dD() - this.cs) * 0.5F;
         this.cr = this.cr + (this.dB() - this.cr) * 0.5F;
      }
   }

   protected boolean v() {
      return this.cp.am() == this;
   }

   public void x() {
      this.b(bju.a);
      if (this.dL() != null) {
         for (double $$0 = this.ds(); $$0 > (double)this.dL().H_() && $$0 < (double)this.dL().aj(); $$0++) {
            this.e(this.dq(), $$0, this.dw());
            if (this.dL().g(this)) {
               break;
            }
         }

         this.f(ehp.b);
         this.s(0.0F);
      }

      this.c(this.eL());
      this.aM = 0;
   }

   @Override
   public void b_() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (!(this.cp.y instanceof eyl)) {
         this.E();
      }

      boolean $$0 = this.co.g;
      boolean $$1 = this.co.h;
      boolean $$2 = this.K();
      this.cO = !this.fS().b && !this.bY() && !this.bN() && this.g(bju.f) && (this.bR() || !this.fC() && !this.g(bju.a));
      float $$3 = ary.a(0.3F + cns.b(this), 0.0F, 1.0F);
      this.co.a(this.u(), $$3);
      this.cp.az().a(this.co);
      if (this.fm() && !this.bN()) {
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
         this.c(this.dq() - (double)this.df() * 0.35, this.dw() + (double)this.df() * 0.35);
         this.c(this.dq() - (double)this.df() * 0.35, this.dw() - (double)this.df() * 0.35);
         this.c(this.dq() + (double)this.df() * 0.35, this.dw() - (double)this.df() * 0.35);
         this.c(this.dq() + (double)this.df() * 0.35, this.dw() + (double)this.df() * 0.35);
      }

      if ($$1) {
         this.cq = 0;
      }

      boolean $$5 = this.I();
      boolean $$6 = this.bN() ? this.cY().aA() : this.aA();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bc()) && $$7 && $$5) {
         if (this.cq <= 0 && !this.cp.m.D.e()) {
            this.cq = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aX() || this.bc()) && $$5 && this.cp.m.D.e()) {
         this.g(true);
      }

      if (this.bX()) {
         boolean $$8 = !this.co.b() || !this.L();
         boolean $$9 = $$8 || this.P && !this.S || this.aX() && !this.bc();
         if (this.bY()) {
            if (!this.aA() && !this.co.h && $$8 || !this.aX()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fS().c) {
         if (this.cp.q.j()) {
            if (!this.fS().b) {
               this.fS().b = true;
               $$10 = true;
               this.w();
            }
         } else if (!$$0 && this.co.g && !$$4) {
            if (this.bU == 0) {
               this.bU = 7;
            } else if (!this.bY()) {
               this.fS().b = !this.fS().b;
               $$10 = true;
               this.w();
               this.bU = 0;
            }
         }
      }

      if (this.co.g && !$$10 && !$$0 && !this.fS().b && !this.bN() && !this.c_()) {
         cjh $$11 = this.c(bix.e);
         if ($$11.a(cjk.nh) && cib.d($$11) && this.fW()) {
            this.cn.b(new ach(this, ach.a.i));
         }
      }

      this.da = this.fv();
      if (this.aX() && this.co.h && this.dZ()) {
         this.fb();
      }

      if (this.a(apz.a)) {
         int $$12 = this.M_() ? 10 : 1;
         this.db = ary.a(this.db + $$12, 0, 600);
      } else if (this.db > 0) {
         this.a(apz.a);
         this.db = ary.a(this.db - 10, 0, 600);
      }

      if (this.fS().b && this.v()) {
         int $$13 = 0;
         if (this.co.h) {
            $$13--;
         }

         if (this.co.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.f(this.do().b(0.0, (double)((float)$$13 * this.fS().a() * 3.0F), 0.0));
         }
      }

      bjt $$14 = this.s();
      if ($$14 != null && $$14.aa_() == 0) {
         if (this.cT < 0) {
            this.cT++;
            if (this.cT == 0) {
               this.cU = 0.0F;
            }
         }

         if ($$0 && !this.co.g) {
            this.cT = -10;
            $$14.b(ary.d(this.t() * 100.0F));
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

      super.b_();
      if (this.aA() && this.fS().b && !this.cp.q.j()) {
         this.fS().b = false;
         this.w();
      }
   }

   @Override
   protected void ea() {
      this.aM++;
      if (this.aM == 20) {
         this.a(bis.c.a);
      }
   }

   private void E() {
      this.cw = this.cv;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cp.y != null && !this.cp.y.j() && !(this.cp.y instanceof exl)) {
            if (this.cp.y instanceof ezk) {
               this.q();
            }

            this.cp.a(null);
         }

         if (this.cv == 0.0F) {
            this.cp.ai().a(gcj.b(apf.sW, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(bih.i) && !this.b(bih.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cv > 0.0F) {
         $$0 = -0.05F;
      }

      this.cv = ary.a(this.cv + $$0, 0.0F, 1.0F);
      this.J();
   }

   @Override
   public void by() {
      super.by();
      this.cX = false;
      if (this.cZ() instanceof cdp $$0) {
         $$0.a(this.co.e, this.co.f, this.co.c, this.co.d);
         this.cX = this.cX | (this.co.e || this.co.f || this.co.c || this.co.d);
      }
   }

   @Override
   public boolean y() {
      return this.cX;
   }

   @Nullable
   @Override
   public bif c(@Nullable bid $$0) {
      if ($$0 == bih.i) {
         this.cw = 0.0F;
         this.cv = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(bjo $$0, ehp $$1) {
      double $$2 = this.dq();
      double $$3 = this.dw();
      super.a($$0, $$1);
      this.f((float)(this.dq() - $$2), (float)(this.dw() - $$3));
   }

   public boolean z() {
      return this.cY;
   }

   protected void f(float $$0, float $$1) {
      if (this.F()) {
         ehp $$2 = this.dj();
         ehp $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ehp $$4 = new ehp((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fe();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            eho $$7 = this.co.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ary.a(this.dB() * (float) (Math.PI / 180.0));
            float $$11 = ary.b(this.dB() * (float) (Math.PI / 180.0));
            $$4 = new ehp((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ary.i($$6);
         ehp $$13 = $$4.a((double)$$12);
         ehp $$14 = this.bG();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ehu $$16 = ehu.a(this);
            gw $$17 = gw.a(this.dq(), this.cG().e, this.dw());
            dfl $$18 = this.dL().a_($$17);
            if ($$18.b(this.dL(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dfl $$19 = this.dL().a_($$17);
               if ($$19.b(this.dL(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bih.h)) {
                     $$21 += (float)(this.b(bih.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ehp $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.df();
                  float $$26 = this.dg();
                  ehk $$27 = new ehk($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ehp $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ehp $$28 = $$13.c(new ehp(0.0, 1.0, 0.0));
                  ehp $$29 = $$28.a((double)($$25 * 0.5F));
                  ehp $$30 = $$23.d($$29);
                  ehp $$31 = $$24.d($$29);
                  ehp $$32 = $$23.e($$29);
                  ehp $$33 = $$24.e($$29);
                  Iterable<eii> $$34 = this.dL().d(this, $$27);
                  Iterator<ehk> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ehk $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ehp $$38 = $$37.f();
                        gw $$39 = gw.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           gw $$41 = $$39.b($$40);
                           dfl $$42 = this.dL().a_($$41);
                           eii $$43;
                           if (!($$43 = $$42.b(this.dL(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(hc.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.ds() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dfl $$44 = this.dL().a_($$17);
                              if (!$$44.b(this.dL(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.ds());
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
   protected boolean b(ehp $$0) {
      float $$1 = this.dB() * (float) (Math.PI / 180.0);
      double $$2 = (double)ary.a($$1);
      double $$3 = (double)ary.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = ary.k($$4) + ary.k($$5);
      double $$7 = ary.k($$0.c) + ary.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean F() {
      return this.z() && this.cZ <= 0 && this.aA() && !this.fJ() && !this.bN() && this.G() && (double)this.aI() >= 1.0;
   }

   private boolean G() {
      eho $$0 = this.co.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean I() {
      return !this.bX() && this.K() && this.L() && !this.fm() && !this.a(bih.o) && (!this.bN() || this.c(this.cY())) && !this.fv();
   }

   private boolean c(bis $$0) {
      return $$0.dE() && $$0.cW();
   }

   private boolean K() {
      double $$0 = 0.8;
      return this.bc() ? this.co.b() : (double)this.co.b >= 0.8;
   }

   private boolean L() {
      return this.bN() || (float)this.gb().a() > 6.0F || this.fS().c;
   }

   public float A() {
      if (!this.a(apz.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.db >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ary.a((float)this.db / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.db < 100.0F ? 0.0F : ary.a(((float)this.db - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cpu $$0) {
      if ($$0 == cpu.d) {
         this.f(this.do().a(hc.a.b, 0.0));
      }
   }

   @Override
   public boolean bc() {
      return this.ce;
   }

   @Override
   protected boolean fK() {
      boolean $$0 = this.ce;
      boolean $$1 = super.fK();
      if (this.M_()) {
         return this.ce;
      } else {
         if (!$$0 && $$1) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apf.x, apg.i, 1.0F, 1.0F, false);
            this.cp.ai().a((gco)(new gcr.b(this)));
         }

         if ($$0 && !$$1) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apf.y, apg.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public ehp q(float $$0) {
      if (this.cp.m.aw().a()) {
         float $$1 = ary.i($$0 * 0.5F, this.dB(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = ary.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fl() == bjc.b ? -1.0 : 1.0;
         ehp $$4 = new ehp(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cjh $$0, cjh $$1, cev $$2) {
      this.cp.az().a($$0, $$1, $$2);
   }

   @Override
   public float dC() {
      return this.dB();
   }
}
