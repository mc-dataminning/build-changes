import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fiy extends fiv {
   public static final Logger g = LogUtils.getLogger();
   private static final int cv = 20;
   private static final int cw = 600;
   private static final int cx = 100;
   private static final float cy = 0.6F;
   private static final double cz = 0.35;
   private static final double cA = 0.13962634F;
   private static final float cB = 0.3F;
   public final fex cl;
   private final ams cC;
   private final enb cD;
   private final List<fxi> cE = Lists.newArrayList();
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
   @Nullable
   private String cR;
   public fiw cm;
   protected final enn cn;
   protected int co;
   public float cp;
   public float cq;
   public float cr;
   public float cs;
   private int cS;
   private float cT;
   public float ct;
   public float cu;
   private boolean cU;
   @Nullable
   private bdw cV;
   private boolean cW;
   private boolean cX = true;
   private int cY;
   private boolean cZ;
   private int da;
   private boolean db = true;

   public fiy(enn $$0, few $$1, fex $$2, ams $$3, enb $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.k());
      this.cn = $$0;
      this.cl = $$2;
      this.cC = $$3;
      this.cD = $$4;
      this.cN = $$5;
      this.cO = $$6;
      this.cE.add(new fya(this, $$0.ah()));
      this.cE.add(new fxn(this));
      this.cE.add(new fxm(this, $$0.ah(), $$1.z_()));
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      return false;
   }

   @Override
   public void s(float $$0) {
   }

   @Override
   public boolean a(bfj $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof caf) {
            this.cn.ah().a((fxy)(new fxs(this, (caf)$$0, true)));
            this.cn.ah().a((fxy)(new fxs(this, (caf)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bA() {
      super.bA();
      this.cW = false;
   }

   @Override
   public float g(float $$0) {
      return this.dA();
   }

   @Override
   public float h(float $$0) {
      return this.bM() ? super.h($$0) : this.dy();
   }

   @Override
   public void l() {
      if (this.dI().f(this.dm(), this.ds())) {
         super.l();
         if (this.bM()) {
            this.cl.a(new zx.c(this.dy(), this.dA(), this.ay()));
            this.cl.a(new aaf(this.bl, this.bn, this.cm.g, this.cm.h));
            bfj $$0 = this.cT();
            if ($$0 != this && $$0.cU()) {
               this.cl.a(new zy($$0));
               this.L();
            }
         } else {
            this.K();
         }

         for (fxi $$1 : this.cE) {
            $$1.a();
         }
      }
   }

   public float o() {
      for (fxi $$0 : this.cE) {
         if ($$0 instanceof fxm) {
            return ((fxm)$$0).b();
         }
      }

      return 0.0F;
   }

   private void K() {
      this.L();
      boolean $$0 = this.bP();
      if ($$0 != this.cN) {
         aae.a $$1 = $$0 ? aae.a.a : aae.a.b;
         this.cl.a(new aae(this, $$1));
         this.cN = $$0;
      }

      if (this.D()) {
         double $$2 = this.dn() - this.cG;
         double $$3 = this.dp() - this.cH;
         double $$4 = this.dt() - this.cI;
         double $$5 = (double)(this.dy() - this.cJ);
         double $$6 = (double)(this.dA() - this.cK);
         this.cP++;
         boolean $$7 = apa.e($$2, $$3, $$4) > apa.k(2.0E-4) || this.cP >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bM()) {
            eei $$9 = this.dl();
            this.cl.a(new zx.b($$9.c, -999.0, $$9.e, this.dy(), this.dA(), this.ay()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cl.a(new zx.b(this.dn(), this.dp(), this.dt(), this.dy(), this.dA(), this.ay()));
         } else if ($$7) {
            this.cl.a(new zx.a(this.dn(), this.dp(), this.dt(), this.ay()));
         } else if ($$8) {
            this.cl.a(new zx.c(this.dy(), this.dA(), this.ay()));
         } else if (this.cL != this.ay()) {
            this.cl.a(new zx.d(this.ay()));
         }

         if ($$7) {
            this.cG = this.dn();
            this.cH = this.dp();
            this.cI = this.dt();
            this.cP = 0;
         }

         if ($$8) {
            this.cJ = this.dy();
            this.cK = this.dA();
         }

         this.cL = this.ay();
         this.cX = this.cn.m.D().c();
      }
   }

   private void L() {
      boolean $$0 = this.bV();
      if ($$0 != this.cO) {
         aae.a $$1 = $$0 ? aae.a.d : aae.a.e;
         this.cl.a(new aae(this, $$1));
         this.cO = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aad.a $$1 = $$0 ? aad.a.d : aad.a.e;
      cfz $$2 = this.fN().a($$0);
      this.cl.a(new aad($$1, gu.b, ha.a));
      return !$$2.b();
   }

   @Override
   public void a(bdw $$0) {
      super.a($$0);
      this.cl.a(new aav($$0));
   }

   @Override
   public void fL() {
      this.cl.a(new zk(zk.a.a));
      enl.c();
   }

   @Override
   protected void f(ben $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.er() - $$1);
      }
   }

   @Override
   public void q() {
      this.cl.a(new zp(this.bR.j));
      this.p();
   }

   public void p() {
      super.q();
      this.cn.a(null);
   }

   public void c(float $$0) {
      if (this.cQ) {
         float $$1 = this.er() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.ak = 10;
            }
         } else {
            this.bj = $$1;
            this.ak = 20;
            this.t($$0);
            this.aM = 10;
            this.aL = this.aM;
         }
      } else {
         this.t($$0);
         this.cQ = true;
      }
   }

   @Override
   public void w() {
      this.cl.a(new aac(this.fO()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fq() {
      return !this.fO().b && super.fq();
   }

   @Override
   public boolean bg() {
      return !this.fO().b && super.bg();
   }

   @Override
   public boolean dO() {
      return !this.fO().b && super.dO();
   }

   @Override
   protected void s() {
      this.cl.a(new aae(this, aae.a.f, apa.d(this.A() * 100.0F)));
   }

   public void t() {
      this.cl.a(new aae(this, aae.a.h));
   }

   public void d(@Nullable String $$0) {
      this.cR = $$0;
   }

   @Nullable
   public String u() {
      return this.cR;
   }

   public ams v() {
      return this.cC;
   }

   public enb x() {
      return this.cD;
   }

   public void a(cjc<?> $$0) {
      if (this.cD.d($$0)) {
         this.cD.e($$0);
         this.cl.a(new aai($$0));
      }
   }

   @Override
   protected int B() {
      return this.cF;
   }

   public void a(int $$0) {
      this.cF = $$0;
   }

   @Override
   public void a(sw $$0, boolean $$1) {
      this.cn.aV().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      gu $$2 = gu.a($$0, this.dp(), $$1);
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
            eei $$11 = this.dl();
            if ($$5.o() == ha.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(gu $$0) {
      eed $$1 = this.cE();
      eed $$2 = new eed((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dI().e(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cg = $$0;
      this.cf = $$1;
      this.ce = $$2;
   }

   @Override
   public void a(sw $$0) {
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
      this.db = $$0;
   }

   @Override
   public boolean y() {
      return this.db;
   }

   @Override
   public void a(amg $$0, float $$1, float $$2) {
      this.dI().a(this.dn(), this.dp(), this.dt(), $$0, this.cY(), $$1, $$2, false);
   }

   @Override
   public void a(amg $$0, ami $$1, float $$2, float $$3) {
      this.dI().a(this.dn(), this.dp(), this.dt(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cV() {
      return true;
   }

   @Override
   public void c(bdw $$0) {
      cfz $$1 = this.b($$0);
      if (!$$1.b() && !this.fi()) {
         super.c($$0);
         this.cU = true;
         this.cV = $$0;
      }
   }

   @Override
   public boolean fi() {
      return this.cU;
   }

   @Override
   public void fo() {
      super.fo();
      this.cU = false;
   }

   @Override
   public bdw fj() {
      return Objects.requireNonNullElse(this.cV, bdw.a);
   }

   @Override
   public void a(aby<?> $$0) {
      super.a($$0);
      if (u.equals($$0)) {
         boolean $$1 = (this.am.b(u) & 1) > 0;
         bdw $$2 = (this.am.b(u) & 2) > 0 ? bdw.b : bdw.a;
         if ($$1 && !this.cU) {
            this.c($$2);
         } else if (!$$1 && this.cU) {
            this.fo();
         }
      }

      if (an.equals($$0) && this.fr() && !this.cZ) {
         this.cn.ah().a((fxy)(new fxo(this)));
      }
   }

   @Nullable
   public bgk z() {
      if (this.cX() instanceof bgk $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float A() {
      return this.cT;
   }

   @Override
   public boolean U() {
      return this.cn.aP();
   }

   @Override
   public void a(dav $$0, boolean $$1) {
      if ($$0 instanceof daj $$2) {
         this.cn.a(new ewl($$2, $$1, this.cn.aP()));
      } else {
         this.cn.a(new ewy($$0, $$1, this.cn.aP()));
      }
   }

   @Override
   public void a(cln $$0) {
      this.cn.a(new ewv($$0));
   }

   @Override
   public void a(czx $$0) {
      this.cn.a(new evz($$0));
   }

   @Override
   public void a(dba $$0) {
      this.cn.a(new exc($$0));
   }

   @Override
   public void a(dam $$0) {
      this.cn.a(new ewq($$0));
   }

   @Override
   public void a(cfz $$0, bdw $$1) {
      if ($$0.a(cgc.tg)) {
         this.cn.a(new evv(this, $$0, $$1));
      }
   }

   @Override
   public void a(bfj $$0) {
      this.cn.g.a($$0, iv.g);
   }

   @Override
   public void b(bfj $$0) {
      this.cn.g.a($$0, iv.s);
   }

   @Override
   public boolean bP() {
      return this.cm != null && this.cm.h;
   }

   @Override
   public boolean bU() {
      return this.cM;
   }

   public boolean C() {
      return this.bU() || this.bY();
   }

   @Override
   public void fc() {
      super.fc();
      if (this.D()) {
         this.bl = this.cm.a;
         this.bn = this.cm.b;
         this.bk = this.cm.g;
         this.cr = this.cp;
         this.cs = this.cq;
         this.cq = this.cq + (this.dA() - this.cq) * 0.5F;
         this.cp = this.cp + (this.dy() - this.cp) * 0.5F;
      }
   }

   protected boolean D() {
      return this.cn.al() == this;
   }

   public void E() {
      this.b(bgl.a);
      if (this.dI() != null) {
         for (double $$0 = this.dp(); $$0 > (double)this.dI().C_() && $$0 < (double)this.dI().aj(); $$0++) {
            this.e(this.dn(), $$0, this.dt());
            if (this.dI().g(this)) {
               break;
            }
         }

         this.f(eei.b);
         this.b_(0.0F);
      }

      this.t(this.eI());
      this.aN = 0;
   }

   @Override
   public void b_() {
      if (this.co > 0) {
         this.co--;
      }

      if (!(this.cn.z instanceof eup)) {
         this.M();
      }

      boolean $$0 = this.cm.g;
      boolean $$1 = this.cm.h;
      boolean $$2 = this.Q();
      this.cM = !this.fO().b && !this.bW() && this.d(bgl.f) && (this.bP() || !this.fy() && !this.d(bgl.a));
      float $$3 = apa.a(0.3F + cki.b(this), 0.0F, 1.0F);
      this.cm.a(this.C(), $$3);
      this.cn.aA().a(this.cm);
      if (this.fi() && !this.bM()) {
         this.cm.a *= 0.2F;
         this.cm.b *= 0.2F;
         this.co = 0;
      }

      boolean $$4 = false;
      if (this.cY > 0) {
         this.cY--;
         $$4 = true;
         this.cm.g = true;
      }

      if (!this.ae) {
         this.c(this.dn() - (double)this.dd() * 0.35, this.dt() + (double)this.dd() * 0.35);
         this.c(this.dn() - (double)this.dd() * 0.35, this.dt() - (double)this.dd() * 0.35);
         this.c(this.dn() + (double)this.dd() * 0.35, this.dt() - (double)this.dd() * 0.35);
         this.c(this.dn() + (double)this.dd() * 0.35, this.dt() + (double)this.dd() * 0.35);
      }

      if ($$1) {
         this.co = 0;
      }

      boolean $$5 = this.P();
      boolean $$6 = this.bM() ? this.cW().ay() : this.ay();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.aZ()) && $$7 && $$5) {
         if (this.co <= 0 && !this.cn.m.D.e()) {
            this.co = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aV() || this.aZ()) && $$5 && this.cn.m.D.e()) {
         this.g(true);
      }

      if (this.bV()) {
         boolean $$8 = !this.cm.b() || !this.R();
         boolean $$9 = $$8 || this.O && !this.R || this.aV() && !this.aZ();
         if (this.bW()) {
            if (!this.ay() && !this.cm.h && $$8 || !this.aV()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fO().c) {
         if (this.cn.r.j()) {
            if (!this.fO().b) {
               this.fO().b = true;
               $$10 = true;
               this.w();
            }
         } else if (!$$0 && this.cm.g && !$$4) {
            if (this.bT == 0) {
               this.bT = 7;
            } else if (!this.bW()) {
               this.fO().b = !this.fO().b;
               $$10 = true;
               this.w();
               this.bT = 0;
            }
         }
      }

      if (this.cm.g && !$$10 && !$$0 && !this.fO().b && !this.bM() && !this.i_()) {
         cfz $$11 = this.c(bfo.e);
         if ($$11.a(cgc.nh) && cet.d($$11) && this.fS()) {
            this.cl.a(new aae(this, aae.a.i));
         }
      }

      this.cZ = this.fr();
      if (this.aV() && this.cm.h && this.dW()) {
         this.eX();
      }

      if (this.a(anb.a)) {
         int $$12 = this.G_() ? 10 : 1;
         this.da = apa.a(this.da + $$12, 0, 600);
      } else if (this.da > 0) {
         this.a(anb.a);
         this.da = apa.a(this.da - 10, 0, 600);
      }

      if (this.fO().b && this.D()) {
         int $$13 = 0;
         if (this.cm.h) {
            $$13--;
         }

         if (this.cm.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.f(this.dl().b(0.0, (double)((float)$$13 * this.fO().a() * 3.0F), 0.0));
         }
      }

      bgk $$14 = this.z();
      if ($$14 != null && $$14.W_() == 0) {
         if (this.cS < 0) {
            this.cS++;
            if (this.cS == 0) {
               this.cT = 0.0F;
            }
         }

         if ($$0 && !this.cm.g) {
            this.cS = -10;
            $$14.b(apa.d(this.A() * 100.0F));
            this.s();
         } else if (!$$0 && this.cm.g) {
            this.cS = 0;
            this.cT = 0.0F;
         } else if ($$0) {
            this.cS++;
            if (this.cS < 10) {
               this.cT = (float)this.cS * 0.1F;
            } else {
               this.cT = 0.8F + 2.0F / (float)(this.cS - 9) * 0.1F;
            }
         }
      } else {
         this.cT = 0.0F;
      }

      super.b_();
      if (this.ay() && this.fO().b && !this.cn.r.j()) {
         this.fO().b = false;
         this.w();
      }
   }

   @Override
   protected void dX() {
      this.aN++;
      if (this.aN == 20) {
         this.a(bfj.c.a);
      }
   }

   private void M() {
      this.cu = this.ct;
      float $$0 = 0.0F;
      if (this.au) {
         if (this.cn.z != null && !this.cn.z.az_() && !(this.cn.z instanceof etq)) {
            if (this.cn.z instanceof evp) {
               this.q();
            }

            this.cn.a(null);
         }

         if (this.ct == 0.0F) {
            this.cn.ah().a(fxt.b(amh.sW, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.au = false;
      } else if (this.a(bfc.i) && !this.b(bfc.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.ct > 0.0F) {
         $$0 = -0.05F;
      }

      this.ct = apa.a(this.ct + $$0, 0.0F, 1.0F);
      this.H();
   }

   @Override
   public void bv() {
      super.bv();
      this.cW = false;
      if (this.cX() instanceof cah $$0) {
         $$0.a(this.cm.e, this.cm.f, this.cm.c, this.cm.d);
         this.cW = this.cW | (this.cm.e || this.cm.f || this.cm.c || this.cm.d);
      }
   }

   public boolean G() {
      return this.cW;
   }

   @Nullable
   @Override
   public bfa c(@Nullable bey $$0) {
      if ($$0 == bfc.i) {
         this.cu = 0.0F;
         this.ct = 0.0F;
      }

      return super.c($$0);
   }

   @Override
   public void a(bgf $$0, eei $$1) {
      double $$2 = this.dn();
      double $$3 = this.dt();
      super.a($$0, $$1);
      this.f((float)(this.dn() - $$2), (float)(this.dt() - $$3));
   }

   @Override
   public boolean I() {
      return this.cX;
   }

   protected void f(float $$0, float $$1) {
      if (this.N()) {
         eei $$2 = this.dg();
         eei $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eei $$4 = new eei((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fa();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            eeh $$7 = this.cm.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = apa.a(this.dy() * (float) (Math.PI / 180.0));
            float $$11 = apa.b(this.dy() * (float) (Math.PI / 180.0));
            $$4 = new eei((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = apa.i($$6);
         eei $$13 = $$4.a((double)$$12);
         eei $$14 = this.bF();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            een $$16 = een.a(this);
            gu $$17 = gu.a(this.dn(), this.cE().e, this.dt());
            dcb $$18 = this.dI().a_($$17);
            if ($$18.b(this.dI(), $$17, $$16).b()) {
               $$17 = $$17.c();
               dcb $$19 = this.dI().a_($$17);
               if ($$19.b(this.dI(), $$17, $$16).b()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bfc.h)) {
                     $$21 += (float)(this.b(bfc.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eei $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dd();
                  float $$26 = this.de();
                  eed $$27 = new eed($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eei $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eei $$28 = $$13.c(new eei(0.0, 1.0, 0.0));
                  eei $$29 = $$28.a((double)($$25 * 0.5F));
                  eei $$30 = $$23.d($$29);
                  eei $$31 = $$24.d($$29);
                  eei $$32 = $$23.e($$29);
                  eei $$33 = $$24.e($$29);
                  Iterable<efb> $$34 = this.dI().c(this, $$27);
                  Iterator<eed> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.d().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     eed $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eei $$38 = $$37.f();
                        gu $$39 = gu.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           gu $$41 = $$39.b($$40);
                           dcb $$42 = this.dI().a_($$41);
                           efb $$43;
                           if (!($$43 = $$42.b(this.dI(), $$41, $$16)).b()) {
                              $$36 = (float)$$43.c(ha.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dp() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dcb $$44 = this.dI().a_($$17);
                              if (!$$44.b(this.dI(), $$17, $$16).b()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dp());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.cY = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean b(eei $$0) {
      float $$1 = this.dy() * (float) (Math.PI / 180.0);
      double $$2 = (double)apa.a($$1);
      double $$3 = (double)apa.b($$1);
      double $$4 = (double)this.bl * $$3 - (double)this.bn * $$2;
      double $$5 = (double)this.bn * $$3 + (double)this.bl * $$2;
      double $$6 = apa.k($$4) + apa.k($$5);
      double $$7 = apa.k($$0.c) + apa.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean N() {
      return this.I() && this.cY <= 0 && this.ay() && !this.fF() && !this.bM() && this.O() && (double)this.aG() >= 1.0;
   }

   private boolean O() {
      eeh $$0 = this.cm.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean P() {
      return !this.bV() && this.Q() && this.R() && !this.fi() && !this.a(bfc.o) && (!this.bM() || this.c(this.cW())) && !this.fr();
   }

   private boolean c(bfj $$0) {
      return $$0.dB() && $$0.cU();
   }

   private boolean Q() {
      double $$0 = 0.8;
      return this.aZ() ? this.cm.b() : (double)this.cm.b >= 0.8;
   }

   private boolean R() {
      return this.bM() || (float)this.fX().a() > 6.0F || this.fO().c;
   }

   public float J() {
      if (!this.a(anb.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.da >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = apa.a((float)this.da / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.da < 100.0F ? 0.0F : apa.a(((float)this.da - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cmj $$0) {
      if ($$0 == cmj.d) {
         this.f(this.dl().a(ha.a.b, 0.0));
      }
   }

   @Override
   public boolean aZ() {
      return this.cd;
   }

   @Override
   protected boolean fG() {
      boolean $$0 = this.cd;
      boolean $$1 = super.fG();
      if (this.G_()) {
         return this.cd;
      } else {
         if (!$$0 && $$1) {
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.x, ami.i, 1.0F, 1.0F, false);
            this.cn.ah().a((fxy)(new fyb.b(this)));
         }

         if ($$0 && !$$1) {
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.y, ami.i, 1.0F, 1.0F, false);
         }

         return this.cd;
      }
   }

   @Override
   public eei q(float $$0) {
      if (this.cn.m.au().a()) {
         float $$1 = apa.i($$0 * 0.5F, this.dy(), this.M) * (float) (Math.PI / 180.0);
         float $$2 = apa.i($$0 * 0.5F, this.dA(), this.N) * (float) (Math.PI / 180.0);
         double $$3 = this.fh() == bft.b ? -1.0 : 1.0;
         eei $$4 = new eei(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cfz $$0, cfz $$1, cbn $$2) {
      this.cn.aA().a($$0, $$1, $$2);
   }

   @Override
   public float dz() {
      return this.dy();
   }
}
