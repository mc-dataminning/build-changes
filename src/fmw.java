import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmw extends fmt {
   public static final Logger ck = LogUtils.getLogger();
   private static final int cv = 20;
   private static final int cw = 600;
   private static final int cx = 100;
   private static final float cy = 0.6F;
   private static final double cz = 0.35;
   private static final double cA = 0.13962634F;
   private static final float cB = 0.3F;
   public final fio cl;
   private final aph cC;
   private final epy cD;
   private final List<gbm> cE = Lists.newArrayList();
   private int cF = 0;
   private double cG;
   private double cH;
   private double cI;
   private float cJ;
   private float cK;
   private boolean cL;
   private boolean cM;
   private boolean cN;
   private boolean cO;
   private int cP;
   private boolean cQ;
   public fmu cm;
   protected final eql cn;
   protected int co;
   public float cp;
   public float cq;
   public float cr;
   public float cs;
   private int cR;
   private float cS;
   public float ct;
   public float cu;
   private boolean cT;
   @Nullable
   private bgp cU;
   private boolean cV;
   private boolean cW = true;
   private int cX;
   private boolean cY;
   private int cZ;
   private boolean da = true;

   public fmw(eql $$0, fin $$1, fio $$2, aph $$3, epy $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cn = $$0;
      this.cl = $$2;
      this.cC = $$3;
      this.cD = $$4;
      this.cN = $$5;
      this.cO = $$6;
      this.cE.add(new gce(this, $$0.ai()));
      this.cE.add(new gbr(this));
      this.cE.add(new gbq(this, $$0.ai(), $$1.z_()));
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(bii $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cdd) {
            this.cn.ai().a((gcc)(new gbw(this, (cdd)$$0, true)));
            this.cn.ai().a((gcc)(new gbw(this, (cdd)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bB() {
      super.bB();
      this.cV = false;
   }

   @Override
   public float g(float $$0) {
      return this.dC();
   }

   @Override
   public float h(float $$0) {
      return this.bN() ? super.h($$0) : this.dA();
   }

   @Override
   public void l() {
      if (this.dK().f(this.do(), this.du())) {
         super.l();
         if (this.bN()) {
            this.cl.b(new abt.c(this.dA(), this.dC(), this.aA()));
            this.cl.b(new acb(this.bk, this.bm, this.cm.g, this.cm.h));
            bii $$0 = this.cV();
            if ($$0 != this && $$0.cW()) {
               this.cl.b(new abu($$0));
               this.B();
            }
         } else {
            this.A();
         }

         for (gbm $$1 : this.cE) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gbm $$0 : this.cE) {
         if ($$0 instanceof gbq) {
            return ((gbq)$$0).b();
         }
      }

      return 0.0F;
   }

   private void A() {
      this.B();
      boolean $$0 = this.bR();
      if ($$0 != this.cN) {
         aca.a $$1 = $$0 ? aca.a.a : aca.a.b;
         this.cl.b(new aca(this, $$1));
         this.cN = $$0;
      }

      if (this.u()) {
         double $$2 = this.dp() - this.cG;
         double $$3 = this.dr() - this.cH;
         double $$4 = this.dv() - this.cI;
         double $$5 = (double)(this.dA() - this.cJ);
         double $$6 = (double)(this.dC() - this.cK);
         this.cP++;
         boolean $$7 = arp.f($$2, $$3, $$4) > arp.k(2.0E-4) || this.cP >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bN()) {
            ehd $$9 = this.dn();
            this.cl.b(new abt.b($$9.c, -999.0, $$9.e, this.dA(), this.dC(), this.aA()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cl.b(new abt.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC(), this.aA()));
         } else if ($$7) {
            this.cl.b(new abt.a(this.dp(), this.dr(), this.dv(), this.aA()));
         } else if ($$8) {
            this.cl.b(new abt.c(this.dA(), this.dC(), this.aA()));
         } else if (this.cL != this.aA()) {
            this.cl.b(new abt.d(this.aA()));
         }

         if ($$7) {
            this.cG = this.dp();
            this.cH = this.dr();
            this.cI = this.dv();
            this.cP = 0;
         }

         if ($$8) {
            this.cJ = this.dA();
            this.cK = this.dC();
         }

         this.cL = this.aA();
         this.cW = this.cn.m.E().c();
      }
   }

   private void B() {
      boolean $$0 = this.bX();
      if ($$0 != this.cO) {
         aca.a $$1 = $$0 ? aca.a.d : aca.a.e;
         this.cl.b(new aca(this, $$1));
         this.cO = $$0;
      }
   }

   public boolean a(boolean $$0) {
      abz.a $$1 = $$0 ? abz.a.d : abz.a.e;
      cix $$2 = this.fQ().a($$0);
      this.cl.b(new abz($$1, gu.b, ha.a));
      return !$$2.b();
   }

   @Override
   public void a(bgp $$0) {
      super.a($$0);
      this.cl.b(new acp($$0));
   }

   @Override
   public void fO() {
      this.cl.b(new abh(abh.a.a));
      eqj.c();
   }

   @Override
   protected void f(bhg $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.et() - $$1);
      }
   }

   @Override
   public void q() {
      this.cl.b(new abn(this.bQ.j));
      this.e();
   }

   public void e() {
      super.q();
      this.cn.a(null);
   }

   public void D(float $$0) {
      if (this.cQ) {
         float $$1 = this.et() - $$0;
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
         this.cQ = true;
      }
   }

   @Override
   public void w() {
      this.cl.b(new aby(this.fR()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean ft() {
      return !this.fR().b && super.ft();
   }

   @Override
   public boolean bj() {
      return !this.fR().b && super.bj();
   }

   @Override
   public boolean dQ() {
      return !this.fR().b && super.dQ();
   }

   protected void h() {
      this.cl.b(new aca(this, aca.a.f, arp.d(this.s() * 100.0F)));
   }

   public void i() {
      this.cl.b(new aca(this, aca.a.h));
   }

   public aph j() {
      return this.cC;
   }

   public epy m() {
      return this.cD;
   }

   public void a(cma<?> $$0) {
      if (this.cD.d($$0)) {
         this.cD.e($$0);
         this.cl.b(new acd($$0));
      }
   }

   @Override
   protected int C() {
      return this.cF;
   }

   public void a(int $$0) {
      this.cF = $$0;
   }

   @Override
   public void a(tf $$0, boolean $$1) {
      this.cn.aW().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      gu $$2 = gu.a($$0, this.dr(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ha $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ha[] $$7 = new ha[]{ha.e, ha.f, ha.c, ha.d};

         for (ha $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ha.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ehd $$11 = this.dn();
            if ($$5.o() == ha.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(gu $$0) {
      egy $$1 = this.cG();
      egy $$2 = new egy((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dK().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cf = $$0;
      this.ce = $$1;
      this.cd = $$2;
   }

   @Override
   public void a(tf $$0) {
      this.cn.l.d().a($$0);
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
      this.da = $$0;
   }

   @Override
   public boolean o() {
      return this.da;
   }

   @Override
   public void a(aov $$0, float $$1, float $$2) {
      this.dK().a(this.dp(), this.dr(), this.dv(), $$0, this.da(), $$1, $$2, false);
   }

   @Override
   public void a(aov $$0, aox $$1, float $$2, float $$3) {
      this.dK().a(this.dp(), this.dr(), this.dv(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cX() {
      return true;
   }

   @Override
   public void c(bgp $$0) {
      cix $$1 = this.b($$0);
      if (!$$1.b() && !this.fl()) {
         super.c($$0);
         this.cT = true;
         this.cU = $$0;
      }
   }

   @Override
   public boolean fl() {
      return this.cT;
   }

   @Override
   public void fr() {
      super.fr();
      this.cT = false;
   }

   @Override
   public bgp fm() {
      return Objects.requireNonNullElse(this.cU, bgp.a);
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         bgp $$2 = (this.an.b(t) & 2) > 0 ? bgp.b : bgp.a;
         if ($$1 && !this.cT) {
            this.c($$2);
         } else if (!$$1 && this.cT) {
            this.fr();
         }
      }

      if (ao.equals($$0) && this.fu() && !this.cY) {
         this.cn.ai().a((gcc)(new gbs(this)));
      }
   }

   @Nullable
   public bjj p() {
      if (this.cZ() instanceof bjj $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float s() {
      return this.cS;
   }

   @Override
   public boolean W() {
      return this.cn.aQ();
   }

   @Override
   public void a(ddt $$0, boolean $$1) {
      if ($$0 instanceof ddh $$2) {
         this.cn.a(new ezu($$2, $$1, this.cn.aQ()));
      } else {
         this.cn.a(new fah($$0, $$1, this.cn.aQ()));
      }
   }

   @Override
   public void a(col $$0) {
      this.cn.a(new fae($$0));
   }

   @Override
   public void a(dcv $$0) {
      this.cn.a(new ezi($$0));
   }

   @Override
   public void a(ddy $$0) {
      this.cn.a(new fal($$0));
   }

   @Override
   public void a(ddk $$0) {
      this.cn.a(new ezz($$0));
   }

   @Override
   public void a(cix $$0, bgp $$1) {
      if ($$0.a(cja.tg)) {
         this.cn.a(new eze(this, $$0, $$1));
      }
   }

   @Override
   public void a(bii $$0) {
      this.cn.g.a($$0, iv.g);
   }

   @Override
   public void b(bii $$0) {
      this.cn.g.a($$0, iv.s);
   }

   @Override
   public boolean bR() {
      return this.cm != null && this.cm.h;
   }

   @Override
   public boolean bW() {
      return this.cM;
   }

   public boolean t() {
      return this.bW() || this.ca();
   }

   @Override
   public void ff() {
      super.ff();
      if (this.u()) {
         this.bk = this.cm.a;
         this.bm = this.cm.b;
         this.bj = this.cm.g;
         this.cr = this.cp;
         this.cs = this.cq;
         this.cq = this.cq + (this.dC() - this.cq) * 0.5F;
         this.cp = this.cp + (this.dA() - this.cp) * 0.5F;
      }
   }

   protected boolean u() {
      return this.cn.am() == this;
   }

   public void v() {
      this.b(bjk.a);
      if (this.dK() != null) {
         for (double $$0 = this.dr(); $$0 > (double)this.dK().C_() && $$0 < (double)this.dK().aj(); $$0++) {
            this.e(this.dp(), $$0, this.dv());
            if (this.dK().g(this)) {
               break;
            }
         }

         this.f(ehd.b);
         this.s(0.0F);
      }

      this.c(this.eK());
      this.aM = 0;
   }

   @Override
   public void b_() {
      if (this.co > 0) {
         this.co--;
      }

      if (!(this.cn.y instanceof exz)) {
         this.D();
      }

      boolean $$0 = this.cm.g;
      boolean $$1 = this.cm.h;
      boolean $$2 = this.J();
      this.cM = !this.fR().b && !this.bY() && !this.bN() && this.g(bjk.f) && (this.bR() || !this.fB() && !this.g(bjk.a));
      float $$3 = arp.a(0.3F + cng.b(this), 0.0F, 1.0F);
      this.cm.a(this.t(), $$3);
      this.cn.az().a(this.cm);
      if (this.fl() && !this.bN()) {
         this.cm.a *= 0.2F;
         this.cm.b *= 0.2F;
         this.co = 0;
      }

      boolean $$4 = false;
      if (this.cX > 0) {
         this.cX--;
         $$4 = true;
         this.cm.g = true;
      }

      if (!this.af) {
         this.c(this.dp() - (double)this.df() * 0.35, this.dv() + (double)this.df() * 0.35);
         this.c(this.dp() - (double)this.df() * 0.35, this.dv() - (double)this.df() * 0.35);
         this.c(this.dp() + (double)this.df() * 0.35, this.dv() - (double)this.df() * 0.35);
         this.c(this.dp() + (double)this.df() * 0.35, this.dv() + (double)this.df() * 0.35);
      }

      if ($$1) {
         this.co = 0;
      }

      boolean $$5 = this.H();
      boolean $$6 = this.bN() ? this.cY().aA() : this.aA();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bc()) && $$7 && $$5) {
         if (this.co <= 0 && !this.cn.m.D.e()) {
            this.co = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aX() || this.bc()) && $$5 && this.cn.m.D.e()) {
         this.g(true);
      }

      if (this.bX()) {
         boolean $$8 = !this.cm.b() || !this.K();
         boolean $$9 = $$8 || this.P && !this.S || this.aX() && !this.bc();
         if (this.bY()) {
            if (!this.aA() && !this.cm.h && $$8 || !this.aX()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fR().c) {
         if (this.cn.q.j()) {
            if (!this.fR().b) {
               this.fR().b = true;
               $$10 = true;
               this.w();
            }
         } else if (!$$0 && this.cm.g && !$$4) {
            if (this.bS == 0) {
               this.bS = 7;
            } else if (!this.bY()) {
               this.fR().b = !this.fR().b;
               $$10 = true;
               this.w();
               this.bS = 0;
            }
         }
      }

      if (this.cm.g && !$$10 && !$$0 && !this.fR().b && !this.bN() && !this.j_()) {
         cix $$11 = this.c(bin.e);
         if ($$11.a(cja.nh) && chr.d($$11) && this.fV()) {
            this.cl.b(new aca(this, aca.a.i));
         }
      }

      this.cY = this.fu();
      if (this.aX() && this.cm.h && this.dY()) {
         this.fa();
      }

      if (this.a(apq.a)) {
         int $$12 = this.G_() ? 10 : 1;
         this.cZ = arp.a(this.cZ + $$12, 0, 600);
      } else if (this.cZ > 0) {
         this.a(apq.a);
         this.cZ = arp.a(this.cZ - 10, 0, 600);
      }

      if (this.fR().b && this.u()) {
         int $$13 = 0;
         if (this.cm.h) {
            $$13--;
         }

         if (this.cm.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.f(this.dn().b(0.0, (double)((float)$$13 * this.fR().a() * 3.0F), 0.0));
         }
      }

      bjj $$14 = this.p();
      if ($$14 != null && $$14.V_() == 0) {
         if (this.cR < 0) {
            this.cR++;
            if (this.cR == 0) {
               this.cS = 0.0F;
            }
         }

         if ($$0 && !this.cm.g) {
            this.cR = -10;
            $$14.b(arp.d(this.s() * 100.0F));
            this.h();
         } else if (!$$0 && this.cm.g) {
            this.cR = 0;
            this.cS = 0.0F;
         } else if ($$0) {
            this.cR++;
            if (this.cR < 10) {
               this.cS = (float)this.cR * 0.1F;
            } else {
               this.cS = 0.8F + 2.0F / (float)(this.cR - 9) * 0.1F;
            }
         }
      } else {
         this.cS = 0.0F;
      }

      super.b_();
      if (this.aA() && this.fR().b && !this.cn.q.j()) {
         this.fR().b = false;
         this.w();
      }
   }

   @Override
   protected void dZ() {
      this.aM++;
      if (this.aM == 20) {
         this.a(bii.c.a);
      }
   }

   private void D() {
      this.cu = this.ct;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cn.y != null && !this.cn.y.j() && !(this.cn.y instanceof ewz)) {
            if (this.cn.y instanceof eyy) {
               this.q();
            }

            this.cn.a(null);
         }

         if (this.ct == 0.0F) {
            this.cn.ai().a(gbx.b(aow.sW, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(bhx.i) && !this.b(bhx.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.ct > 0.0F) {
         $$0 = -0.05F;
      }

      this.ct = arp.a(this.ct + $$0, 0.0F, 1.0F);
      this.I();
   }

   @Override
   public void by() {
      super.by();
      this.cV = false;
      if (this.cZ() instanceof cdf $$0) {
         $$0.a(this.cm.e, this.cm.f, this.cm.c, this.cm.d);
         this.cV = this.cV | (this.cm.e || this.cm.f || this.cm.c || this.cm.d);
      }
   }

   @Override
   public boolean x() {
      return this.cV;
   }

   @Nullable
   @Override
   public bhv c(@Nullable bht $$0) {
      if ($$0 == bhx.i) {
         this.cu = 0.0F;
         this.ct = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(bje $$0, ehd $$1) {
      double $$2 = this.dp();
      double $$3 = this.dv();
      super.a($$0, $$1);
      this.f((float)(this.dp() - $$2), (float)(this.dv() - $$3));
   }

   public boolean y() {
      return this.cW;
   }

   protected void f(float $$0, float $$1) {
      if (this.E()) {
         ehd $$2 = this.di();
         ehd $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ehd $$4 = new ehd((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fd();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ehc $$7 = this.cm.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = arp.a(this.dA() * (float) (Math.PI / 180.0));
            float $$11 = arp.b(this.dA() * (float) (Math.PI / 180.0));
            $$4 = new ehd((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = arp.i($$6);
         ehd $$13 = $$4.a((double)$$12);
         ehd $$14 = this.bG();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ehi $$16 = ehi.a(this);
            gu $$17 = gu.a(this.dp(), this.cG().e, this.dv());
            dez $$18 = this.dK().a_($$17);
            if ($$18.b(this.dK(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dez $$19 = this.dK().a_($$17);
               if ($$19.b(this.dK(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bhx.h)) {
                     $$21 += (float)(this.b(bhx.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ehd $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.df();
                  float $$26 = this.dg();
                  egy $$27 = new egy($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ehd $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ehd $$28 = $$13.c(new ehd(0.0, 1.0, 0.0));
                  ehd $$29 = $$28.a((double)($$25 * 0.5F));
                  ehd $$30 = $$23.d($$29);
                  ehd $$31 = $$24.d($$29);
                  ehd $$32 = $$23.e($$29);
                  ehd $$33 = $$24.e($$29);
                  Iterable<ehw> $$34 = this.dK().d(this, $$27);
                  Iterator<egy> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     egy $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ehd $$38 = $$37.f();
                        gu $$39 = gu.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           gu $$41 = $$39.b($$40);
                           dez $$42 = this.dK().a_($$41);
                           ehw $$43;
                           if (!($$43 = $$42.b(this.dK(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ha.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dr() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dez $$44 = this.dK().a_($$17);
                              if (!$$44.b(this.dK(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dr());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.cX = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean b(ehd $$0) {
      float $$1 = this.dA() * (float) (Math.PI / 180.0);
      double $$2 = (double)arp.a($$1);
      double $$3 = (double)arp.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = arp.k($$4) + arp.k($$5);
      double $$7 = arp.k($$0.c) + arp.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean E() {
      return this.y() && this.cX <= 0 && this.aA() && !this.fI() && !this.bN() && this.F() && (double)this.aI() >= 1.0;
   }

   private boolean F() {
      ehc $$0 = this.cm.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean H() {
      return !this.bX() && this.J() && this.K() && !this.fl() && !this.a(bhx.o) && (!this.bN() || this.c(this.cY())) && !this.fu();
   }

   private boolean c(bii $$0) {
      return $$0.dD() && $$0.cW();
   }

   private boolean J() {
      double $$0 = 0.8;
      return this.bc() ? this.cm.b() : (double)this.cm.b >= 0.8;
   }

   private boolean K() {
      return this.bN() || (float)this.ga().a() > 6.0F || this.fR().c;
   }

   public float z() {
      if (!this.a(apq.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.cZ >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = arp.a((float)this.cZ / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.cZ < 100.0F ? 0.0F : arp.a(((float)this.cZ - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cpi $$0) {
      if ($$0 == cpi.d) {
         this.f(this.dn().a(ha.a.b, 0.0));
      }
   }

   @Override
   public boolean bc() {
      return this.cc;
   }

   @Override
   protected boolean fJ() {
      boolean $$0 = this.cc;
      boolean $$1 = super.fJ();
      if (this.G_()) {
         return this.cc;
      } else {
         if (!$$0 && $$1) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.x, aox.i, 1.0F, 1.0F, false);
            this.cn.ai().a((gcc)(new gcf.b(this)));
         }

         if ($$0 && !$$1) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.y, aox.i, 1.0F, 1.0F, false);
         }

         return this.cc;
      }
   }

   @Override
   public ehd q(float $$0) {
      if (this.cn.m.av().a()) {
         float $$1 = arp.i($$0 * 0.5F, this.dA(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = arp.i($$0 * 0.5F, this.dC(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fk() == bis.b ? -1.0 : 1.0;
         ehd $$4 = new ehd(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cix $$0, cix $$1, cel $$2) {
      this.cn.az().a($$0, $$1, $$2);
   }

   @Override
   public float dB() {
      return this.dA();
   }
}
