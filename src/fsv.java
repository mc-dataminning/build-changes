import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsv extends fss {
   public static final Logger cq = LogUtils.getLogger();
   private static final int cC = 20;
   private static final int cD = 600;
   private static final int cE = 100;
   private static final float cF = 0.6F;
   private static final double cG = 0.35;
   private static final double cH = 0.13962634F;
   private static final float cI = 0.3F;
   public final fof cr;
   private final ase cJ;
   private final eve cK;
   private final List<ghy> cL = Lists.newArrayList();
   private int cM = 0;
   private double cN;
   private double cO;
   private double cP;
   private float cQ;
   private float cR;
   private boolean cS;
   private boolean cT;
   private boolean cU;
   private boolean cV;
   private int cW;
   private boolean cX;
   public fst cs;
   protected final evr ct;
   protected int cu;
   public float cv;
   public float cx;
   public float cy;
   public float cz;
   private int cY;
   private float cZ;
   public float cA;
   public float cB;
   private boolean da;
   @Nullable
   private bkb db;
   private boolean dc;
   private boolean dd = true;
   private int de;
   private boolean df;
   private int dg;
   private boolean dh = true;
   private boolean di = false;

   public fsv(evr $$0, foe $$1, fof $$2, ase $$3, eve $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.q());
      this.ct = $$0;
      this.cr = $$2;
      this.cJ = $$3;
      this.cK = $$4;
      this.cU = $$5;
      this.cV = $$6;
      this.cL.add(new giq(this, $$0.ai()));
      this.cL.add(new gid(this));
      this.cL.add(new gic(this, $$0.ai(), $$1.G_()));
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      return false;
   }

   @Override
   public void b(float $$0) {
   }

   @Override
   public boolean a(blw $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof chi) {
            this.ct.ai().a((gio)(new gii(this, (chi)$$0, true)));
            this.ct.ai().a((gio)(new gii(this, (chi)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.dc = false;
   }

   @Override
   public float g(float $$0) {
      return this.dD();
   }

   @Override
   public float h(float $$0) {
      return this.bO() ? super.h($$0) : this.dB();
   }

   @Override
   public void l() {
      if (this.dL().f(this.dp(), this.dv())) {
         super.l();
         if (this.bO()) {
            this.cr.b(new aeh.c(this.dB(), this.dD(), this.aC()));
            this.cr.b(new aep(this.bk, this.bm, this.cs.g, this.cs.h));
            blw $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cr.b(new aei($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (ghy $$1 : this.cL) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (ghy $$0 : this.cL) {
         if ($$0 instanceof gic) {
            return ((gic)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cU) {
         aeo.a $$1 = $$0 ? aeo.a.a : aeo.a.b;
         this.cr.b(new aeo(this, $$1));
         this.cU = $$0;
      }

      if (this.w()) {
         double $$2 = this.dq() - this.cN;
         double $$3 = this.ds() - this.cO;
         double $$4 = this.dw() - this.cP;
         double $$5 = (double)(this.dB() - this.cQ);
         double $$6 = (double)(this.dD() - this.cR);
         this.cW++;
         boolean $$7 = aup.f($$2, $$3, $$4) > aup.k(2.0E-4) || this.cW >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            emc $$9 = this.do();
            this.cr.b(new aeh.b($$9.c, -999.0, $$9.e, this.dB(), this.dD(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cr.b(new aeh.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD(), this.aC()));
         } else if ($$7) {
            this.cr.b(new aeh.a(this.dq(), this.ds(), this.dw(), this.aC()));
         } else if ($$8) {
            this.cr.b(new aeh.c(this.dB(), this.dD(), this.aC()));
         } else if (this.cS != this.aC()) {
            this.cr.b(new aeh.d(this.aC()));
         }

         if ($$7) {
            this.cN = this.dq();
            this.cO = this.ds();
            this.cP = this.dw();
            this.cW = 0;
         }

         if ($$8) {
            this.cQ = this.dB();
            this.cR = this.dD();
         }

         this.cS = this.aC();
         this.dd = this.ct.m.F().c();
      }
   }

   private void E() {
      boolean $$0 = this.bY();
      if ($$0 != this.cV) {
         aeo.a $$1 = $$0 ? aeo.a.d : aeo.a.e;
         this.cr.b(new aeo(this, $$1));
         this.cV = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aen.a $$1 = $$0 ? aen.a.d : aen.a.e;
      cng $$2 = this.fS().a($$0);
      this.cr.b(new aen($$1, hx.b, ic.a));
      return !$$2.b();
   }

   @Override
   public void a(bkb $$0) {
      super.a($$0);
      this.cr.b(new afd($$0));
   }

   @Override
   public void fQ() {
      this.cr.b(new adv(adv.a.a));
      evp.c();
   }

   @Override
   protected void f(bkv $$0, float $$1) {
      if (!this.b($$0)) {
         this.c(this.ev() - $$1);
      }
   }

   @Override
   public void r() {
      this.cr.b(new aea(this.bW.j));
      this.e();
   }

   public void e() {
      super.r();
      this.ct.a(null);
   }

   public void C(float $$0) {
      if (this.cX) {
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
         this.cX = true;
      }
   }

   @Override
   public void y() {
      this.cr.b(new aem(this.fT()));
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
   public boolean dR() {
      return !this.fT().b && super.dR();
   }

   protected void h() {
      this.cr.b(new aeo(this, aeo.a.f, aup.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cr.b(new aeo(this, aeo.a.h));
   }

   public ase j() {
      return this.cJ;
   }

   public eve m() {
      return this.cK;
   }

   public void a(cqm<?> $$0) {
      if (this.cK.d($$0)) {
         this.cK.e($$0);
         this.cr.b(new aer($$0));
      }
   }

   @Override
   protected int F() {
      return this.cM;
   }

   public void a(int $$0) {
      this.cM = $$0;
   }

   @Override
   public void a(vg $$0, boolean $$1) {
      this.ct.aX().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      hx $$2 = hx.a($$0, this.ds(), $$1);
      if (this.d($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ic $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ic[] $$7 = new ic[]{ic.e, ic.f, ic.c, ic.d};

         for (ic $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ic.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.d($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            emc $$11 = this.do();
            if ($$5.o() == ic.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean d(hx $$0) {
      elx $$1 = this.cH();
      elx $$2 = new elx((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dL().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cl = $$0;
      this.ck = $$1;
      this.cj = $$2;
   }

   @Override
   public void a(vg $$0) {
      this.ct.l.d().a($$0);
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
      this.dh = $$0;
   }

   public boolean o() {
      return this.dh;
   }

   public void v(boolean $$0) {
      this.di = $$0;
   }

   public boolean p() {
      return this.di;
   }

   @Override
   public void a(ars $$0, float $$1, float $$2) {
      this.dL().a(this.dq(), this.ds(), this.dw(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(ars $$0, aru $$1, float $$2, float $$3) {
      this.dL().a(this.dq(), this.ds(), this.dw(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(bkb $$0) {
      cng $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         super.c($$0);
         this.da = true;
         this.db = $$0;
      }
   }

   @Override
   public boolean fn() {
      return this.da;
   }

   @Override
   public void ft() {
      super.ft();
      this.da = false;
   }

   @Override
   public bkb fo() {
      return Objects.requireNonNullElse(this.db, bkb.a);
   }

   @Override
   public void a(agn<?> $$0) {
      super.a($$0);
      if (t.equals($$0)) {
         boolean $$1 = (this.an.b(t) & 1) > 0;
         bkb $$2 = (this.an.b(t) & 2) > 0 ? bkb.b : bkb.a;
         if ($$1 && !this.da) {
            this.c($$2);
         } else if (!$$1 && this.da) {
            this.ft();
         }
      }

      if (ao.equals($$0) && this.fw() && !this.df) {
         this.ct.ai().a((gio)(new gie(this)));
      }
   }

   @Nullable
   public bmz q() {
      if (this.da() instanceof bmz $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float u() {
      return this.cZ;
   }

   @Override
   public boolean Y() {
      return this.ct.aQ();
   }

   @Override
   public void a(dim $$0, boolean $$1) {
      if ($$0 instanceof dia $$2) {
         this.ct.a(new ffi($$2, $$1, this.ct.aQ()));
      } else {
         this.ct.a(new ffv($$0, $$1, this.ct.aQ()));
      }
   }

   @Override
   public void a(csy $$0) {
      this.ct.a(new ffs($$0));
   }

   @Override
   public void a(dhn $$0) {
      this.ct.a(new fev($$0));
   }

   @Override
   public void a(dir $$0) {
      this.ct.a(new ffz($$0));
   }

   @Override
   public void a(did $$0) {
      this.ct.a(new ffn($$0));
   }

   @Override
   public void a(cng $$0, bkb $$1) {
      if ($$0.a(cnj.tW)) {
         this.ct.a(new fer(this, $$0, $$1));
      }
   }

   @Override
   public void a(blw $$0) {
      this.ct.g.a($$0, jx.g);
   }

   @Override
   public void b(blw $$0) {
      this.ct.g.a($$0, jx.s);
   }

   @Override
   public boolean bS() {
      return this.cs != null && this.cs.h;
   }

   @Override
   public boolean bX() {
      return this.cT;
   }

   public boolean v() {
      return this.bX() || this.cb();
   }

   @Override
   public void fi() {
      super.fi();
      if (this.w()) {
         this.bk = this.cs.a;
         this.bm = this.cs.b;
         this.bj = this.cs.g;
         this.cy = this.cv;
         this.cz = this.cx;
         this.cx = this.cx + (this.dD() - this.cx) * 0.5F;
         this.cv = this.cv + (this.dB() - this.cv) * 0.5F;
      }
   }

   protected boolean w() {
      return this.ct.am() == this;
   }

   @Override
   public void z() {
      this.b(bna.a);
      if (this.dL() != null) {
         for (double $$0 = this.ds(); $$0 > (double)this.dL().J_() && $$0 < (double)this.dL().al(); $$0++) {
            this.a_(this.dq(), $$0, this.dw());
            if (this.dL().g(this)) {
               break;
            }
         }

         this.g(emc.b);
         this.s(0.0F);
      }

      this.c(this.eM());
      this.aM = 0;
   }

   @Override
   public void d_() {
      if (this.cu > 0) {
         this.cu--;
      }

      if (!(this.ct.y instanceof fdk)) {
         this.G();
      }

      boolean $$0 = this.cs.g;
      boolean $$1 = this.cs.h;
      boolean $$2 = this.M();
      this.cT = !this.fT().b && !this.bZ() && !this.bO() && this.h(bna.f) && (this.bS() || !this.fD() && !this.h(bna.a));
      float $$3 = aup.a(0.3F + crt.b(this), 0.0F, 1.0F);
      this.cs.a(this.v(), $$3);
      this.ct.az().a(this.cs);
      if (this.fn() && !this.bO()) {
         this.cs.a *= 0.2F;
         this.cs.b *= 0.2F;
         this.cu = 0;
      }

      boolean $$4 = false;
      if (this.de > 0) {
         this.de--;
         $$4 = true;
         this.cs.g = true;
      }

      if (!this.af) {
         this.c(this.dq() - (double)this.dg() * 0.35, this.dw() + (double)this.dg() * 0.35);
         this.c(this.dq() - (double)this.dg() * 0.35, this.dw() - (double)this.dg() * 0.35);
         this.c(this.dq() + (double)this.dg() * 0.35, this.dw() - (double)this.dg() * 0.35);
         this.c(this.dq() + (double)this.dg() * 0.35, this.dw() + (double)this.dg() * 0.35);
      }

      if ($$1) {
         this.cu = 0;
      }

      boolean $$5 = this.K();
      boolean $$6 = this.bO() ? this.cZ().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.be()) && $$7 && $$5) {
         if (this.cu <= 0 && !this.ct.m.D.e()) {
            this.cu = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aZ() || this.be()) && $$5 && this.ct.m.D.e()) {
         this.g(true);
      }

      if (this.bY()) {
         boolean $$8 = !this.cs.b() || !this.N();
         boolean $$9 = $$8 || this.P && !this.S || this.aZ() && !this.be();
         if (this.bZ()) {
            if (!this.aC() && !this.cs.h && $$8 || !this.aZ()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fT().c) {
         if (this.ct.q.h()) {
            if (!this.fT().b) {
               this.fT().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cs.g && !$$4) {
            if (this.bY == 0) {
               this.bY = 7;
            } else if (!this.bZ()) {
               this.fT().b = !this.fT().b;
               $$10 = true;
               this.y();
               this.bY = 0;
            }
         }
      }

      if (this.cs.g && !$$10 && !$$0 && !this.fT().b && !this.bO() && !this.e_()) {
         cng $$11 = this.c(bmd.e);
         if ($$11.a(cnj.nS) && cmb.d($$11) && this.fX()) {
            this.cr.b(new aeo(this, aeo.a.i));
         }
      }

      this.df = this.fw();
      if (this.aZ() && this.cs.h && this.ea()) {
         this.fc();
      }

      if (this.a(asn.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.dg = aup.a(this.dg + $$12, 0, 600);
      } else if (this.dg > 0) {
         this.a(asn.a);
         this.dg = aup.a(this.dg - 10, 0, 600);
      }

      if (this.fT().b && this.w()) {
         int $$13 = 0;
         if (this.cs.h) {
            $$13--;
         }

         if (this.cs.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.do().b(0.0, (double)((float)$$13 * this.fT().a() * 3.0F), 0.0));
         }
      }

      bmz $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cY < 0) {
            this.cY++;
            if (this.cY == 0) {
               this.cZ = 0.0F;
            }
         }

         if ($$0 && !this.cs.g) {
            this.cY = -10;
            $$14.b(aup.d(this.u() * 100.0F));
            this.h();
         } else if (!$$0 && this.cs.g) {
            this.cY = 0;
            this.cZ = 0.0F;
         } else if ($$0) {
            this.cY++;
            if (this.cY < 10) {
               this.cZ = (float)this.cY * 0.1F;
            } else {
               this.cZ = 0.8F + 2.0F / (float)(this.cY - 9) * 0.1F;
            }
         }
      } else {
         this.cZ = 0.0F;
      }

      super.d_();
      if (this.aC() && this.fT().b && !this.ct.q.h()) {
         this.fT().b = false;
         this.y();
      }
   }

   @Override
   protected void eb() {
      this.aM++;
      if (this.aM == 20) {
         this.a(blw.c.a);
      }
   }

   private void G() {
      this.cB = this.cA;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.ct.y != null && !this.ct.y.m() && !(this.ct.y instanceof fcl)) {
            if (this.ct.y instanceof fel) {
               this.r();
            }

            this.ct.a(null);
         }

         if (this.cA == 0.0F) {
            this.ct.ai().a(gij.b(art.ub, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(bll.i) && !this.c(bll.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cA > 0.0F) {
         $$0 = -0.05F;
      }

      this.cA = aup.a(this.cA + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dc = false;
      if (this.da() instanceof chk $$0) {
         $$0.a(this.cs.e, this.cs.f, this.cs.c, this.cs.d);
         this.dc = this.dc | (this.cs.e || this.cs.f || this.cs.c || this.cs.d);
      }
   }

   @Override
   public boolean A() {
      return this.dc;
   }

   @Nullable
   @Override
   public blj d(ih<blh> $$0) {
      if ($$0.a(bll.i)) {
         this.cB = 0.0F;
         this.cA = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bmu $$0, emc $$1) {
      double $$2 = this.dq();
      double $$3 = this.dw();
      super.a($$0, $$1);
      this.f((float)(this.dq() - $$2), (float)(this.dw() - $$3));
   }

   public boolean B() {
      return this.dd;
   }

   protected void f(float $$0, float $$1) {
      if (this.H()) {
         emc $$2 = this.dj();
         emc $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         emc $$4 = new emc((double)$$0, 0.0, (double)$$1);
         float $$5 = this.ff();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            emb $$7 = this.cs.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = aup.a(this.dB() * (float) (Math.PI / 180.0));
            float $$11 = aup.b(this.dB() * (float) (Math.PI / 180.0));
            $$4 = new emc((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = aup.i($$6);
         emc $$13 = $$4.a((double)$$12);
         emc $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            emh $$16 = emh.a(this);
            hx $$17 = hx.a(this.dq(), this.cH().e, this.dw());
            djp $$18 = this.dL().a_($$17);
            if ($$18.b(this.dL(), $$17, $$16).c()) {
               $$17 = $$17.c();
               djp $$19 = this.dL().a_($$17);
               if ($$19.b(this.dL(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bll.h)) {
                     $$21 += (float)(this.c(bll.h).d() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  emc $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  elx $$27 = new elx($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  emc $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  emc $$28 = $$13.c(new emc(0.0, 1.0, 0.0));
                  emc $$29 = $$28.a((double)($$25 * 0.5F));
                  emc $$30 = $$23.d($$29);
                  emc $$31 = $$24.d($$29);
                  emc $$32 = $$23.e($$29);
                  emc $$33 = $$24.e($$29);
                  Iterable<emv> $$34 = this.dL().d(this, $$27);
                  Iterator<elx> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     elx $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        emc $$38 = $$37.f();
                        hx $$39 = hx.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           hx $$41 = $$39.b($$40);
                           djp $$42 = this.dL().a_($$41);
                           emv $$43;
                           if (!($$43 = $$42.b(this.dL(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ic.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.ds() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              djp $$44 = this.dL().a_($$17);
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
                        this.de = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(emc $$0) {
      float $$1 = this.dB() * (float) (Math.PI / 180.0);
      double $$2 = (double)aup.a($$1);
      double $$3 = (double)aup.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = aup.k($$4) + aup.k($$5);
      double $$7 = aup.k($$0.c) + aup.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.B() && this.de <= 0 && this.aC() && !this.fK() && !this.bO() && this.I() && (double)this.aK() >= 1.0;
   }

   private boolean I() {
      emb $$0 = this.cs.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fn() && !this.a(bll.o) && (!this.bO() || this.c(this.cZ())) && !this.fw();
   }

   private boolean c(blw $$0) {
      return $$0.dE() && $$0.cX();
   }

   private boolean M() {
      double $$0 = 0.8;
      return this.be() ? this.cs.b() : (double)this.cs.b >= 0.8;
   }

   private boolean N() {
      return this.bO() || (float)this.gc().a() > 6.0F || this.fT().c;
   }

   public float C() {
      if (!this.a(asn.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dg >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = aup.a((float)this.dg / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dg < 100.0F ? 0.0F : aup.a(((float)this.dg - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(ctu $$0) {
      if ($$0 == ctu.d) {
         this.g(this.do().a(ic.a.b, 0.0));
      }
   }

   @Override
   public boolean be() {
      return this.ci;
   }

   @Override
   protected boolean fL() {
      boolean $$0 = this.ci;
      boolean $$1 = super.fL();
      if (this.P_()) {
         return this.ci;
      } else {
         if (!$$0 && $$1) {
            this.dL().a(this.dq(), this.ds(), this.dw(), art.x, aru.i, 1.0F, 1.0F, false);
            this.ct.ai().a((gio)(new gir.b(this)));
         }

         if ($$0 && !$$1) {
            this.dL().a(this.dq(), this.ds(), this.dw(), art.y, aru.i, 1.0F, 1.0F, false);
         }

         return this.ci;
      }
   }

   @Override
   public emc q(float $$0) {
      if (this.ct.m.ax().a()) {
         float $$1 = aup.i($$0 * 0.5F, this.dB(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = aup.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fm() == bmi.b ? -1.0 : 1.0;
         emc $$4 = new emc(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cng $$0, cng $$1, cir $$2) {
      this.ct.az().a($$0, $$1, $$2);
   }

   @Override
   public float dC() {
      return this.dB();
   }
}
