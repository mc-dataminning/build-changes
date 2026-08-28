import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cov extends cpg implements btk, buo<cov.b> {
   private static final ajw<Integer> i = aka.a(cov.class, ajy.b);
   private static final ajw<Boolean> j = aka.a(cov.class, ajy.k);
   private static final ajw<Boolean> k = aka.a(cov.class, ajy.k);
   private static final ajw<Integer> l = aka.a(cov.class, ajy.b);
   public static final int b = 0;
   public static final int c = 1;
   private static final int m = 60;
   private static final float n = (float) (Math.PI / 8);
   public static final double d = (float) (Math.PI / 4);
   public static final int e = 60;
   private final float[] o = new float[2];
   private float p;
   private float q;
   private float r;
   private int s;
   private double t;
   private double u;
   private double v;
   private double aD;
   private double aE;
   private boolean aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private double aJ;
   private float aK;
   private cov.a aL;
   private cov.a aM;
   private double aN;
   private boolean aO;
   private boolean aP;
   private float aQ;
   private float aR;
   private float aS;
   @Nullable
   private btk.a aT;

   public cov(bsx<? extends cov> $$0, dcw $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cov(dcw $$0, double $$1, double $$2, double $$3) {
      this(bsx.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(i, cov.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bsr $$0) {
      return a(this, $$0);
   }

   public static boolean a(bsr $$0, bsr $$1) {
      return ($$1.bG() || $$1.bB()) && !$$0.y($$1);
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   public exa a(ji.a $$0, l.a $$1) {
      return btn.k(super.a($$0, $$1));
   }

   @Override
   protected exa a(bsr $$0, bsu $$1, float $$2) {
      float $$3 = this.w();
      if (this.cT().size() > 1) {
         int $$4 = this.cT().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cfe) {
            $$3 += 0.2F;
         }
      }

      return new exa(0.0, this.x() == cov.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dP().B) {
         this.aO = true;
         this.aP = $$0;
         if (this.K() == 0) {
            this.b(60);
         }
      }

      this.dP().a(lm.am, this.du() + (double)this.ah.i(), this.dw() + 0.7, this.dA() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), this.aR(), this.df(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dxz.O, this.cR());
      }
   }

   @Override
   public void h(bsr $$0) {
      if ($$0 instanceof cov) {
         if ($$0.cL().b < this.cL().e) {
            super.h($$0);
         }
      } else if ($$0.cL().b <= this.cL().b) {
         super.h($$0);
      }
   }

   @Override
   public cul ak_() {
      return switch (this.x()) {
         case b -> cut.nW;
         case c -> cut.nY;
         case d -> cut.oa;
         case e -> cut.oc;
         case f -> cut.oe;
         case g -> cut.og;
         case h -> cut.oi;
         case i -> cut.ok;
         default -> cut.nU;
      };
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bA() {
      return !this.dK();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.aD = (double)$$3;
      this.aE = (double)$$4;
      this.s = 10;
   }

   @Override
   public double c_() {
      return this.s > 0 ? this.t : this.du();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dw();
   }

   @Override
   public double P_() {
      return this.s > 0 ? this.v : this.dA();
   }

   @Override
   public float Q_() {
      return this.s > 0 ? (float)this.aE : this.dH();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aD : this.dF();
   }

   @Override
   public ji cJ() {
      return this.cI().h();
   }

   @Override
   public void l() {
      this.aM = this.aL;
      this.aL = this.D();
      if (this.aL != cov.a.b && this.aL != cov.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dP().B && this.q >= 60.0F) {
         this.bI();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.C();
      if (this.db()) {
         if (!(this.cU() instanceof cmx)) {
            this.b(false, false);
         }

         this.I();
         if (this.dP().B) {
            this.J();
            this.dP().a(new ahi(this.c(0), this.c(1)));
         }

         this.a(bts.a, this.ds());
      } else {
         this.i(exa.b);
      }

      this.B();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aX()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avo $$1 = this.s();
               if ($$1 != null) {
                  exa $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dP().a(null, this.du() + $$3, this.dw(), this.dA() + $$4, $$1, this.df(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aT();
      List<bsr> $$5 = this.dP().a(this, this.cL().c(0.2F, -0.01F, 0.2F), bsw.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dP().B && !(this.cR() instanceof cmx);

         for (bsr $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cT().size() < this.F() && !$$7.bS() && this.c($$7) && $$7 instanceof btn && !($$7 instanceof cgg) && !($$7 instanceof cmx)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void B() {
      if (this.dP().B) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aQ += 0.05F;
         } else {
            this.aQ -= 0.1F;
         }

         this.aQ = ayo.a(this.aQ, 0.0F, 1.0F);
         this.aS = this.aR;
         this.aR = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dP().Z())) * this.aQ;
      } else {
         if (!this.aO) {
            this.b(0);
         }

         int $$1 = this.K();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               exa $$3 = this.ds();
               if (this.aP) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bI();
               } else {
                  this.n($$3.c, this.a($$0 -> $$0 instanceof cmx) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aO = false;
         }
      }
   }

   @Nullable
   protected avo s() {
      switch (this.D()) {
         case a:
         case b:
         case c:
            return avp.cm;
         case d:
            return avp.cl;
         case e:
         default:
            return null;
      }
   }

   private void C() {
      if (this.db()) {
         this.s = 0;
         this.f(this.du(), this.dw(), this.dA());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aD, this.aE);
         this.s--;
      }
   }

   public void b(boolean $$0, boolean $$1) {
      this.ao.a(j, $$0);
      this.ao.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? ayo.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public btk.a X_() {
      return this.aT;
   }

   @Override
   public void a(@Nullable btk.a $$0) {
      this.aT = $$0;
   }

   @Override
   public exa cN() {
      return new exa(0.0, (double)(0.88F * this.cM()), (double)(this.dk() * 0.64F));
   }

   private cov.a D() {
      cov.a $$0 = this.H();
      if ($$0 != null) {
         this.aJ = this.cL().e;
         return $$0;
      } else if (this.E()) {
         return cov.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aK = $$1;
            return cov.a.d;
         } else {
            return cov.a.e;
         }
      }
   }

   public float t() {
      ewv $$0 = this.cL();
      int $$1 = ayo.a($$0.a);
      int $$2 = ayo.c($$0.d);
      int $$3 = ayo.a($$0.e);
      int $$4 = ayo.c($$0.e - this.aN);
      int $$5 = ayo.a($$0.c);
      int $$6 = ayo.c($$0.f);
      jd.a $$7 = new jd.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               epc $$12 = this.dP().b_($$7);
               if ($$12.a(awk.a)) {
                  $$9 = Math.max($$9, $$12.a((dcc)this.dP(), $$7));
               }

               if ($$9 >= 1.0F) {
                  continue label39;
               }
            }
         }

         if ($$9 < 1.0F) {
            return (float)$$7.v() + $$9;
         }
      }

      return (float)($$4 + 1);
   }

   public float v() {
      ewv $$0 = this.cL();
      ewv $$1 = new ewv($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayo.a($$1.a) - 1;
      int $$3 = ayo.c($$1.d) + 1;
      int $$4 = ayo.a($$1.b) - 1;
      int $$5 = ayo.c($$1.e) + 1;
      int $$6 = ayo.a($$1.c) - 1;
      int $$7 = ayo.c($$1.f) + 1;
      ext $$8 = exq.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      jd.a $$11 = new jd.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dtc $$16 = this.dP().a_($$11);
                     if (!($$16.b() instanceof dpc) && exq.c($$16.k(this.dP(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, exe.i)) {
                        $$9 += $$16.b().h();
                        $$10++;
                     }
                  }
               }
            }
         }
      }

      return $$9 / (float)$$10;
   }

   private boolean E() {
      ewv $$0 = this.cL();
      int $$1 = ayo.a($$0.a);
      int $$2 = ayo.c($$0.d);
      int $$3 = ayo.a($$0.b);
      int $$4 = ayo.c($$0.b + 0.001);
      int $$5 = ayo.a($$0.c);
      int $$6 = ayo.c($$0.f);
      boolean $$7 = false;
      this.aJ = -Double.MAX_VALUE;
      jd.a $$8 = new jd.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               epc $$12 = this.dP().b_($$8);
               if ($$12.a(awk.a)) {
                  float $$13 = (float)$$10 + $$12.a((dcc)this.dP(), $$8);
                  this.aJ = Math.max((double)$$13, this.aJ);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cov.a H() {
      ewv $$0 = this.cL();
      double $$1 = $$0.e + 0.001;
      int $$2 = ayo.a($$0.a);
      int $$3 = ayo.c($$0.d);
      int $$4 = ayo.a($$0.e);
      int $$5 = ayo.c($$1);
      int $$6 = ayo.a($$0.c);
      int $$7 = ayo.c($$0.f);
      boolean $$8 = false;
      jd.a $$9 = new jd.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               epc $$13 = this.dP().b_($$9);
               if ($$13.a(awk.a) && $$1 < (double)((float)$$9.v() + $$13.a((dcc)this.dP(), $$9))) {
                  if (!$$13.b()) {
                     return cov.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cov.a.b : null;
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   private void I() {
      double $$0 = -this.ba();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aM == cov.a.e && this.aL != cov.a.e && this.aL != cov.a.d) {
         this.aJ = this.e(1.0);
         double $$2 = (double)(this.t() - this.dl()) + 0.101;
         if (this.dP().a(this, this.cL().d(0.0, $$2 - this.dw(), 0.0))) {
            this.a_(this.du(), $$2, this.dA());
            this.i(this.ds().d(1.0, 0.0, 1.0));
            this.aN = 0.0;
         }

         this.aL = cov.a.a;
      } else {
         if (this.aL == cov.a.a) {
            $$1 = (this.aJ - this.dw()) / (double)this.dl();
            this.p = 0.9F;
         } else if (this.aL == cov.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aL == cov.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aL == cov.a.e) {
            this.p = 0.9F;
         } else if (this.aL == cov.a.d) {
            this.p = this.aK;
            if (this.cR() instanceof cmx) {
               this.aK /= 2.0F;
            }
         }

         exa $$3 = this.ds();
         this.n($$3.c * (double)this.p, $$3.d + $$0, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            exa $$4 = this.ds();
            this.n($$4.c, ($$4.d + $$1 * (this.aZ() / 0.65)) * 0.75, $$4.e);
         }
      }
   }

   private void J() {
      if (this.bT()) {
         float $$0 = 0.0F;
         if (this.aF) {
            this.r--;
         }

         if (this.aG) {
            this.r++;
         }

         if (this.aG != this.aF && !this.aH && !this.aI) {
            $$0 += 0.005F;
         }

         this.t(this.dF() + this.r);
         if (this.aH) {
            $$0 += 0.04F;
         }

         if (this.aI) {
            $$0 -= 0.005F;
         }

         this.i(this.ds().b((double)(ayo.a(-this.dF() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayo.b(this.dF() * (float) (Math.PI / 180.0)) * $$0)));
         this.b(this.aG && !this.aF || this.aH, this.aF && !this.aG || this.aH);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean c(bsr $$0) {
      return $$0.dk() < this.dk();
   }

   @Override
   protected void a(bsr $$0, bsr.a $$1) {
      super.a($$0, $$1);
      if (!$$0.am().a(awi.s)) {
         $$0.t($$0.dF() + this.r);
         $$0.o($$0.ct() + this.r);
         this.d($$0);
         if ($$0 instanceof cfe && this.cT().size() == this.F()) {
            int $$2 = $$0.an() % 2 == 0 ? 90 : 270;
            $$0.p(((cfe)$$0).aY + (float)$$2);
            $$0.o($$0.ct() + (float)$$2);
         }
      }
   }

   @Override
   public exa b(btn $$0) {
      exa $$1 = a((double)(this.dk() * ayo.g), (double)$$0.dk(), $$0.dF());
      double $$2 = this.du() + $$1.c;
      double $$3 = this.dA() + $$1.e;
      jd $$4 = jd.a($$2, this.cL().e, $$3);
      jd $$5 = $$4.e();
      if (!this.dP().z($$5)) {
         List<exa> $$6 = Lists.newArrayList();
         double $$7 = this.dP().j($$4);
         if (coy.a($$7)) {
            $$6.add(new exa($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dP().j($$5);
         if (coy.a($$8)) {
            $$6.add(new exa($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fF().iterator();

         while (var14.hasNext()) {
            bua $$9 = (bua)var14.next();

            for (exa $$10 : $$6) {
               if (coy.a(this.dP(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void d(bsr $$0) {
      $$0.p(this.dF());
      float $$1 = ayo.g($$0.dF() - this.dF());
      float $$2 = ayo.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.t($$0.dF() + $$2 - $$1);
      $$0.o($$0.dF());
   }

   @Override
   public void k(bsr $$0) {
      this.d($$0);
   }

   @Override
   protected void b(ub $$0) {
      this.a($$0, this.aT);
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(ub $$0) {
      this.aT = this.c($$0);
      if ($$0.b("Type", 8)) {
         this.a(cov.b.a($$0.l("Type")));
      }
   }

   @Override
   public bqr a(cmx $$0, bqq $$1) {
      bqr $$2 = super.a($$0, $$1);
      if ($$2 != bqr.e) {
         return $$2;
      } else if ($$0.fO()) {
         return bqr.e;
      } else if (this.q < 60.0F) {
         if (!this.dP().B) {
            return $$0.n(this) ? bqr.c : bqr.e;
         } else {
            return bqr.a;
         }
      } else {
         return bqr.e;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
      this.aN = this.ds().d;
      if (!this.bS()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aL != cov.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dQ().l());
               if (!this.dP().B && !this.dK()) {
                  this.ap();
                  if (this.dP().ab().b(dcs.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cut.pq);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dP().b_(this.dp().e()).a(awk.a) && $$0 < 0.0) {
            this.ac -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.ao.a($$0 == 0 ? j : k) && this.cR() != null;
   }

   private void b(int $$0) {
      this.ao.a(l, $$0);
   }

   private int K() {
      return this.ao.a(l);
   }

   public float a(float $$0) {
      return ayo.i($$0, this.aS, this.aR);
   }

   public void a(cov.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public cov.b x() {
      return cov.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(bsr $$0) {
      return this.cT().size() < this.F() && !this.a(awk.a);
   }

   protected int F() {
      return 2;
   }

   @Nullable
   @Override
   public btn cR() {
      return this.cU() instanceof btn $$0 ? $$0 : super.cR();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aF = $$0;
      this.aG = $$1;
      this.aH = $$2;
      this.aI = $$3;
   }

   @Override
   protected wz cs() {
      return wz.c(this.ak_().a());
   }

   @Override
   public boolean bk() {
      return this.aL == cov.a.b || this.aL == cov.a.c;
   }

   @Override
   public cuq dC() {
      return new cuq(this.ak_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements azk {
      a(dga.n, "oak"),
      b(dga.o, "spruce"),
      c(dga.p, "birch"),
      d(dga.q, "jungle"),
      e(dga.r, "acacia"),
      f(dga.s, "cherry"),
      g(dga.t, "dark_oak"),
      h(dga.u, "mangrove"),
      i(dga.v, "bamboo");

      private final String k;
      private final dfy l;
      public static final azk.a<cov.b> j = azk.a(cov.b::values);
      private static final IntFunction<cov.b> m = axe.a(Enum::ordinal, values(), axe.a.a);

      private b(final dfy $$0, final String $$1) {
         this.k = $$1;
         this.l = $$0;
      }

      @Override
      public String c() {
         return this.k;
      }

      public String a() {
         return this.k;
      }

      public dfy b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cov.b a(int $$0) {
         return m.apply($$0);
      }

      public static cov.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
