import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cot extends cpe implements bum<cot.b> {
   private static final ajv<Integer> i = ajz.a(cot.class, ajx.b);
   private static final ajv<Boolean> j = ajz.a(cot.class, ajx.k);
   private static final ajv<Boolean> k = ajz.a(cot.class, ajx.k);
   private static final ajv<Integer> l = ajz.a(cot.class, ajx.b);
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
   private cot.a aL;
   private cot.a aM;
   private double aN;
   private boolean aO;
   private boolean aP;
   private float aQ;
   private float aR;
   private float aS;

   public cot(bsw<? extends cot> $$0, dcu $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cot(dcu $$0, double $$1, double $$2, double $$3) {
      this(bsw.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(i, cot.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bsq $$0) {
      return a(this, $$0);
   }

   public static boolean a(bsq $$0, bsq $$1) {
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
   public eww a(ji.a $$0, l.a $$1) {
      return btl.k(super.a($$0, $$1));
   }

   @Override
   protected eww a(bsq $$0, bst $$1, float $$2) {
      float $$3 = this.w();
      if (this.cT().size() > 1) {
         int $$4 = this.cT().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cfc) {
            $$3 += 0.2F;
         }
      }

      return new eww(0.0, this.x() == cot.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dG() * (float) (Math.PI / 180.0));
   }

   @Override
   public void m(boolean $$0) {
      if (!this.dQ().B) {
         this.aO = true;
         this.aP = $$0;
         if (this.H() == 0) {
            this.b(60);
         }
      }

      this.dQ().a(lm.am, this.dv() + (double)this.ah.i(), this.dx() + 0.7, this.dB() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dQ().a(this.dv(), this.dx(), this.dB(), this.aR(), this.df(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dxw.O, this.cR());
      }
   }

   @Override
   public void h(bsq $$0) {
      if ($$0 instanceof cot) {
         if ($$0.cL().b < this.cL().e) {
            super.h($$0);
         }
      } else if ($$0.cL().b <= this.cL().b) {
         super.h($$0);
      }
   }

   @Override
   public cuj ag_() {
      return switch (this.x()) {
         case b -> cur.nW;
         case c -> cur.nY;
         case d -> cur.oa;
         case e -> cur.oc;
         case f -> cur.oe;
         case g -> cur.og;
         case h -> cur.oi;
         case i -> cur.ok;
         default -> cur.nU;
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
      return !this.dL();
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
      return this.s > 0 ? this.t : this.dv();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dx();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.v : this.dB();
   }

   @Override
   public float M_() {
      return this.s > 0 ? (float)this.aE : this.dI();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aD : this.dG();
   }

   @Override
   public ji cJ() {
      return this.cI().h();
   }

   @Override
   public void l() {
      this.aM = this.aL;
      this.aL = this.B();
      if (this.aL != cot.a.b && this.aL != cot.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dQ().B && this.q >= 60.0F) {
         this.bI();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.A();
      if (this.db()) {
         if (!(this.cU() instanceof cmv)) {
            this.a(false, false);
         }

         this.E();
         if (this.dQ().B) {
            this.F();
            this.dQ().a(new ahh(this.c(0), this.c(1)));
         }

         this.a(btq.a, this.dt());
      } else {
         this.i(eww.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aX()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avn $$1 = this.s();
               if ($$1 != null) {
                  eww $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dQ().a(null, this.dv() + $$3, this.dx(), this.dB() + $$4, $$1, this.df(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aT();
      List<bsq> $$5 = this.dQ().a(this, this.cL().c(0.2F, -0.01F, 0.2F), bsv.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dQ().B && !(this.cR() instanceof cmv);

         for (bsq $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cT().size() < this.y() && !$$7.bS() && this.b($$7) && $$7 instanceof btl && !($$7 instanceof cge) && !($$7 instanceof cmv)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dQ().B) {
         int $$0 = this.H();
         if ($$0 > 0) {
            this.aQ += 0.05F;
         } else {
            this.aQ -= 0.1F;
         }

         this.aQ = ayn.a(this.aQ, 0.0F, 1.0F);
         this.aS = this.aR;
         this.aR = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dQ().Z())) * this.aQ;
      } else {
         if (!this.aO) {
            this.b(0);
         }

         int $$1 = this.H();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               eww $$3 = this.dt();
               if (this.aP) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bI();
               } else {
                  this.n($$3.c, this.a($$0 -> $$0 instanceof cmv) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aO = false;
         }
      }
   }

   @Nullable
   protected avn s() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return avo.cm;
         case d:
            return avo.cl;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.db()) {
         this.s = 0;
         this.f(this.dv(), this.dx(), this.dB());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aD, this.aE);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.ao.a(j, $$0);
      this.ao.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? ayn.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cot.a B() {
      cot.a $$0 = this.D();
      if ($$0 != null) {
         this.aJ = this.cL().e;
         return $$0;
      } else if (this.C()) {
         return cot.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aK = $$1;
            return cot.a.d;
         } else {
            return cot.a.e;
         }
      }
   }

   public float t() {
      ewr $$0 = this.cL();
      int $$1 = ayn.a($$0.a);
      int $$2 = ayn.c($$0.d);
      int $$3 = ayn.a($$0.e);
      int $$4 = ayn.c($$0.e - this.aN);
      int $$5 = ayn.a($$0.c);
      int $$6 = ayn.c($$0.f);
      jd.a $$7 = new jd.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eoy $$12 = this.dQ().b_($$7);
               if ($$12.a(awj.a)) {
                  $$9 = Math.max($$9, $$12.a((dca)this.dQ(), $$7));
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
      ewr $$0 = this.cL();
      ewr $$1 = new ewr($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayn.a($$1.a) - 1;
      int $$3 = ayn.c($$1.d) + 1;
      int $$4 = ayn.a($$1.b) - 1;
      int $$5 = ayn.c($$1.e) + 1;
      int $$6 = ayn.a($$1.c) - 1;
      int $$7 = ayn.c($$1.f) + 1;
      exp $$8 = exm.a($$1);
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
                     dta $$16 = this.dQ().a_($$11);
                     if (!($$16.b() instanceof dpa) && exm.c($$16.k(this.dQ(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, exa.i)) {
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

   private boolean C() {
      ewr $$0 = this.cL();
      int $$1 = ayn.a($$0.a);
      int $$2 = ayn.c($$0.d);
      int $$3 = ayn.a($$0.b);
      int $$4 = ayn.c($$0.b + 0.001);
      int $$5 = ayn.a($$0.c);
      int $$6 = ayn.c($$0.f);
      boolean $$7 = false;
      this.aJ = -Double.MAX_VALUE;
      jd.a $$8 = new jd.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eoy $$12 = this.dQ().b_($$8);
               if ($$12.a(awj.a)) {
                  float $$13 = (float)$$10 + $$12.a((dca)this.dQ(), $$8);
                  this.aJ = Math.max((double)$$13, this.aJ);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cot.a D() {
      ewr $$0 = this.cL();
      double $$1 = $$0.e + 0.001;
      int $$2 = ayn.a($$0.a);
      int $$3 = ayn.c($$0.d);
      int $$4 = ayn.a($$0.e);
      int $$5 = ayn.c($$1);
      int $$6 = ayn.a($$0.c);
      int $$7 = ayn.c($$0.f);
      boolean $$8 = false;
      jd.a $$9 = new jd.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eoy $$13 = this.dQ().b_($$9);
               if ($$13.a(awj.a) && $$1 < (double)((float)$$9.v() + $$13.a((dca)this.dQ(), $$9))) {
                  if (!$$13.b()) {
                     return cot.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cot.a.b : null;
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.ba();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aM == cot.a.e && this.aL != cot.a.e && this.aL != cot.a.d) {
         this.aJ = this.e(1.0);
         double $$2 = (double)(this.t() - this.dl()) + 0.101;
         if (this.dQ().a(this, this.cL().d(0.0, $$2 - this.dx(), 0.0))) {
            this.a_(this.dv(), $$2, this.dB());
            this.i(this.dt().d(1.0, 0.0, 1.0));
            this.aN = 0.0;
         }

         this.aL = cot.a.a;
      } else {
         if (this.aL == cot.a.a) {
            $$1 = (this.aJ - this.dx()) / (double)this.dl();
            this.p = 0.9F;
         } else if (this.aL == cot.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aL == cot.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aL == cot.a.e) {
            this.p = 0.9F;
         } else if (this.aL == cot.a.d) {
            this.p = this.aK;
            if (this.cR() instanceof cmv) {
               this.aK /= 2.0F;
            }
         }

         eww $$3 = this.dt();
         this.n($$3.c * (double)this.p, $$3.d + $$0, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            eww $$4 = this.dt();
            this.n($$4.c, ($$4.d + $$1 * (this.aZ() / 0.65)) * 0.75, $$4.e);
         }
      }
   }

   private void F() {
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

         this.s(this.dG() + this.r);
         if (this.aH) {
            $$0 += 0.04F;
         }

         if (this.aI) {
            $$0 -= 0.005F;
         }

         this.i(this.dt().b((double)(ayn.a(-this.dG() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayn.b(this.dG() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aG && !this.aF || this.aH, this.aF && !this.aG || this.aH);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(bsq $$0) {
      return $$0.dk() < this.dk();
   }

   @Override
   protected void a(bsq $$0, bsq.a $$1) {
      super.a($$0, $$1);
      if (!$$0.am().a(awh.s)) {
         $$0.s($$0.dG() + this.r);
         $$0.o($$0.ct() + this.r);
         this.c($$0);
         if ($$0 instanceof cfc && this.cT().size() == this.y()) {
            int $$2 = $$0.an() % 2 == 0 ? 90 : 270;
            $$0.p(((cfc)$$0).aY + (float)$$2);
            $$0.o($$0.ct() + (float)$$2);
         }
      }
   }

   @Override
   public eww b(btl $$0) {
      eww $$1 = a((double)(this.dk() * ayn.g), (double)$$0.dk(), $$0.dG());
      double $$2 = this.dv() + $$1.c;
      double $$3 = this.dB() + $$1.e;
      jd $$4 = jd.a($$2, this.cL().e, $$3);
      jd $$5 = $$4.d();
      if (!this.dQ().z($$5)) {
         List<eww> $$6 = Lists.newArrayList();
         double $$7 = this.dQ().j($$4);
         if (cow.a($$7)) {
            $$6.add(new eww($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dQ().j($$5);
         if (cow.a($$8)) {
            $$6.add(new eww($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fF().iterator();

         while (var14.hasNext()) {
            bty $$9 = (bty)var14.next();

            for (eww $$10 : $$6) {
               if (cow.a(this.dQ(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bsq $$0) {
      $$0.p(this.dG());
      float $$1 = ayn.g($$0.dG() - this.dG());
      float $$2 = ayn.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.s($$0.dG() + $$2 - $$1);
      $$0.o($$0.dG());
   }

   @Override
   public void k(bsq $$0) {
      this.c($$0);
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(ua $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cot.b.a($$0.l("Type")));
      }
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      if ($$0.fO()) {
         return bqq.e;
      } else if (this.q < 60.0F) {
         if (!this.dQ().B) {
            return $$0.n(this) ? bqq.c : bqq.e;
         } else {
            return bqq.a;
         }
      } else {
         return bqq.e;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
      this.aN = this.dt().d;
      if (!this.bS()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aL != cot.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dR().l());
               if (!this.dQ().B && !this.dL()) {
                  this.ap();
                  if (this.dQ().ab().b(dcq.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cur.pq);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dQ().b_(this.dq().d()).a(awj.a) && $$0 < 0.0) {
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

   private int H() {
      return this.ao.a(l);
   }

   public float a(float $$0) {
      return ayn.i($$0, this.aS, this.aR);
   }

   public void a(cot.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public cot.b x() {
      return cot.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(bsq $$0) {
      return this.cT().size() < this.y() && !this.a(awj.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public btl cR() {
      return this.cU() instanceof btl $$0 ? $$0 : super.cR();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aF = $$0;
      this.aG = $$1;
      this.aH = $$2;
      this.aI = $$3;
   }

   @Override
   protected wy cs() {
      return wy.c(this.ag_().a());
   }

   @Override
   public boolean bk() {
      return this.aL == cot.a.b || this.aL == cot.a.c;
   }

   @Override
   public cuo dD() {
      return new cuo(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements azj {
      a(dfy.n, "oak"),
      b(dfy.o, "spruce"),
      c(dfy.p, "birch"),
      d(dfy.q, "jungle"),
      e(dfy.r, "acacia"),
      f(dfy.s, "cherry"),
      g(dfy.t, "dark_oak"),
      h(dfy.u, "mangrove"),
      i(dfy.v, "bamboo");

      private final String k;
      private final dfw l;
      public static final azj.a<cot.b> j = azj.a(cot.b::values);
      private static final IntFunction<cot.b> m = axd.a(Enum::ordinal, values(), axd.a.a);

      private b(final dfw $$0, final String $$1) {
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

      public dfw b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cot.b a(int $$0) {
         return m.apply($$0);
      }

      public static cot.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
