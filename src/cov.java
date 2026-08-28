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
   public exc a(ji.a $$0, l.a $$1) {
      return btn.k(super.a($$0, $$1));
   }

   @Override
   protected exc a(bsr $$0, bsu $$1, float $$2) {
      float $$3 = this.w();
      if (this.cS().size() > 1) {
         int $$4 = this.cS().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cfe) {
            $$3 += 0.2F;
         }
      }

      return new exc(0.0, this.x() == cov.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dE() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dO().B) {
         this.aO = true;
         this.aP = $$0;
         if (this.K() == 0) {
            this.b(60);
         }
      }

      this.dO().a(lm.am, this.dt() + (double)this.ah.i(), this.dv() + 0.7, this.dz() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dO().a(this.dt(), this.dv(), this.dz(), this.aR(), this.de(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dxz.O, this.cQ());
      }
   }

   @Override
   public void h(bsr $$0) {
      if ($$0 instanceof cov) {
         if ($$0.cK().b < this.cK().e) {
            super.h($$0);
         }
      } else if ($$0.cK().b <= this.cK().b) {
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
      return !this.dJ();
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
      return this.s > 0 ? this.t : this.dt();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dv();
   }

   @Override
   public double P_() {
      return this.s > 0 ? this.v : this.dz();
   }

   @Override
   public float Q_() {
      return this.s > 0 ? (float)this.aE : this.dG();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aD : this.dE();
   }

   @Override
   public ji cI() {
      return this.cH().h();
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

      if (!this.dO().B && this.q >= 60.0F) {
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
      if (this.da()) {
         if (!(this.cT() instanceof cmx)) {
            this.b(false, false);
         }

         this.I();
         if (this.dO().B) {
            this.J();
            this.dO().a(new ahi(this.c(0), this.c(1)));
         }

         this.a(bts.a, this.dr());
      } else {
         this.i(exc.b);
      }

      this.B();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aX()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avo $$1 = this.s();
               if ($$1 != null) {
                  exc $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dO().a(null, this.dt() + $$3, this.dv(), this.dz() + $$4, $$1, this.de(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aT();
      List<bsr> $$5 = this.dO().a(this, this.cK().c(0.2F, -0.01F, 0.2F), bsw.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dO().B && !(this.cQ() instanceof cmx);

         for (bsr $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cS().size() < this.F() && !$$7.bS() && this.c($$7) && $$7 instanceof btn && !($$7 instanceof cgg) && !($$7 instanceof cmx)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void B() {
      if (this.dO().B) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aQ += 0.05F;
         } else {
            this.aQ -= 0.1F;
         }

         this.aQ = ayo.a(this.aQ, 0.0F, 1.0F);
         this.aS = this.aR;
         this.aR = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dO().Z())) * this.aQ;
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
               exc $$3 = this.dr();
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
      if (this.da()) {
         this.s = 0;
         this.f(this.dt(), this.dv(), this.dz());
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
   public exc cM() {
      return new exc(0.0, (double)(0.88F * this.cL()), (double)(this.dj() * 0.64F));
   }

   @Override
   public void b(bsr $$0, float $$1) {
      exc $$2 = $$0.dm().d(this.dm()).d().a((double)$$1 - 6.0);
      exc $$3 = this.dr();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.i($$3.e($$2.a($$4 ? 0.15F : 0.2F)));
   }

   private cov.a D() {
      cov.a $$0 = this.H();
      if ($$0 != null) {
         this.aJ = this.cK().e;
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
      ewx $$0 = this.cK();
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
               epe $$12 = this.dO().b_($$7);
               if ($$12.a(awk.a)) {
                  $$9 = Math.max($$9, $$12.a((dcc)this.dO(), $$7));
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
      ewx $$0 = this.cK();
      ewx $$1 = new ewx($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayo.a($$1.a) - 1;
      int $$3 = ayo.c($$1.d) + 1;
      int $$4 = ayo.a($$1.b) - 1;
      int $$5 = ayo.c($$1.e) + 1;
      int $$6 = ayo.a($$1.c) - 1;
      int $$7 = ayo.c($$1.f) + 1;
      exv $$8 = exs.a($$1);
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
                     dtc $$16 = this.dO().a_($$11);
                     if (!($$16.b() instanceof dpc) && exs.c($$16.k(this.dO(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, exg.i)) {
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
      ewx $$0 = this.cK();
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
               epe $$12 = this.dO().b_($$8);
               if ($$12.a(awk.a)) {
                  float $$13 = (float)$$10 + $$12.a((dcc)this.dO(), $$8);
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
      ewx $$0 = this.cK();
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
               epe $$13 = this.dO().b_($$9);
               if ($$13.a(awk.a) && $$1 < (double)((float)$$9.v() + $$13.a((dcc)this.dO(), $$9))) {
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
         double $$2 = (double)(this.t() - this.dk()) + 0.101;
         if (this.dO().a(this, this.cK().d(0.0, $$2 - this.dv(), 0.0))) {
            this.a_(this.dt(), $$2, this.dz());
            this.i(this.dr().d(1.0, 0.0, 1.0));
            this.aN = 0.0;
         }

         this.aL = cov.a.a;
      } else {
         if (this.aL == cov.a.a) {
            $$1 = (this.aJ - this.dv()) / (double)this.dk();
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
            if (this.cQ() instanceof cmx) {
               this.aK /= 2.0F;
            }
         }

         exc $$3 = this.dr();
         this.n($$3.c * (double)this.p, $$3.d + $$0, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            exc $$4 = this.dr();
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

         this.t(this.dE() + this.r);
         if (this.aH) {
            $$0 += 0.04F;
         }

         if (this.aI) {
            $$0 -= 0.005F;
         }

         this.i(this.dr().b((double)(ayo.a(-this.dE() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayo.b(this.dE() * (float) (Math.PI / 180.0)) * $$0)));
         this.b(this.aG && !this.aF || this.aH, this.aF && !this.aG || this.aH);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean c(bsr $$0) {
      return $$0.dj() < this.dj();
   }

   @Override
   protected void a(bsr $$0, bsr.a $$1) {
      super.a($$0, $$1);
      if (!$$0.am().a(awi.s)) {
         $$0.t($$0.dE() + this.r);
         $$0.o($$0.ct() + this.r);
         this.d($$0);
         if ($$0 instanceof cfe && this.cS().size() == this.F()) {
            int $$2 = $$0.an() % 2 == 0 ? 90 : 270;
            $$0.p(((cfe)$$0).aY + (float)$$2);
            $$0.o($$0.ct() + (float)$$2);
         }
      }
   }

   @Override
   public exc b(btn $$0) {
      exc $$1 = a((double)(this.dj() * ayo.g), (double)$$0.dj(), $$0.dE());
      double $$2 = this.dt() + $$1.c;
      double $$3 = this.dz() + $$1.e;
      jd $$4 = jd.a($$2, this.cK().e, $$3);
      jd $$5 = $$4.e();
      if (!this.dO().z($$5)) {
         List<exc> $$6 = Lists.newArrayList();
         double $$7 = this.dO().j($$4);
         if (coy.a($$7)) {
            $$6.add(new exc($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dO().j($$5);
         if (coy.a($$8)) {
            $$6.add(new exc($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fE().iterator();

         while (var14.hasNext()) {
            bua $$9 = (bua)var14.next();

            for (exc $$10 : $$6) {
               if (coy.a(this.dO(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void d(bsr $$0) {
      $$0.p(this.dE());
      float $$1 = ayo.g($$0.dE() - this.dE());
      float $$2 = ayo.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.t($$0.dE() + $$2 - $$1);
      $$0.o($$0.dE());
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
      } else if ($$0.fN()) {
         return bqr.e;
      } else if (this.q < 60.0F) {
         if (!this.dO().B) {
            return $$0.n(this) ? bqr.c : bqr.e;
         } else {
            return bqr.a;
         }
      } else {
         return bqr.e;
      }
   }

   @Override
   public void a(bsr.c $$0) {
      if (!this.dO().B && $$0.a() && this.N_()) {
         this.a(true, true);
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
      this.aN = this.dr().d;
      if (!this.bS()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aL != cov.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dP().l());
               if (!this.dO().B && !this.dJ()) {
                  this.ap();
                  if (this.dO().ab().b(dcs.i)) {
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
         } else if (!this.dO().b_(this.do().e()).a(awk.a) && $$0 < 0.0) {
            this.ac -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.ao.a($$0 == 0 ? j : k) && this.cQ() != null;
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
      return this.cS().size() < this.F() && !this.a(awk.a);
   }

   protected int F() {
      return 2;
   }

   @Nullable
   @Override
   public btn cQ() {
      return this.cT() instanceof btn $$0 ? $$0 : super.cQ();
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
   public cuq dB() {
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
