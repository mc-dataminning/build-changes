import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cov extends cpg implements bup<cov.b> {
   private static final akk<Integer> i = ako.a(cov.class, akm.b);
   private static final akk<Boolean> j = ako.a(cov.class, akm.k);
   private static final akk<Boolean> k = ako.a(cov.class, akm.k);
   private static final akk<Integer> l = ako.a(cov.class, akm.b);
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
   private double aF;
   private double aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private boolean aK;
   private double aL;
   private float aM;
   private cov.a aN;
   private cov.a aO;
   private double aP;
   private boolean aQ;
   private boolean aR;
   private float aS;
   private float aT;
   private float aU;

   public cov(bta<? extends cov> $$0, dby $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cov(dby $$0, double $$1, double $$2, double $$3) {
      this(bta.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bsu.b bb() {
      return bsu.b.c;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(i, cov.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bsu $$0) {
      return a(this, $$0);
   }

   public static boolean a(bsu $$0, bsu $$1) {
      return ($$1.bF() || $$1.bA()) && !$$0.y($$1);
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected evr a(je.a $$0, l.a $$1) {
      return btp.j(super.a($$0, $$1));
   }

   @Override
   protected evr a(bsu $$0, bsx $$1, float $$2) {
      float $$3 = this.w();
      if (this.cS().size() > 1) {
         int $$4 = this.cS().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cff) {
            $$3 += 0.2F;
         }
      }

      return new evr(0.0, this.x() == cov.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dP().B) {
         this.aQ = true;
         this.aR = $$0;
         if (this.H() == 0) {
            this.b(60);
         }
      }

      this.dP().a(li.am, this.du() + (double)this.ah.i(), this.dw() + 0.7, this.dA() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), this.aQ(), this.de(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dwv.O, this.cQ());
      }
   }

   @Override
   public void h(bsu $$0) {
      if ($$0 instanceof cov) {
         if ($$0.cK().b < this.cK().e) {
            super.h($$0);
         }
      } else if ($$0.cK().b <= this.cK().b) {
         super.h($$0);
      }
   }

   @Override
   public cuk ag_() {
      return switch (this.x()) {
         case b -> cus.nW;
         case c -> cus.nY;
         case d -> cus.oa;
         case e -> cus.oc;
         case f -> cus.oe;
         case g -> cus.og;
         case h -> cus.oi;
         case i -> cus.ok;
         default -> cus.nU;
      };
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bz() {
      return !this.dK();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.aF = (double)$$3;
      this.aG = (double)$$4;
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
   public double L_() {
      return this.s > 0 ? this.v : this.dA();
   }

   @Override
   public float M_() {
      return this.s > 0 ? (float)this.aG : this.dH();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aF : this.dF();
   }

   @Override
   public je cI() {
      return this.cH().h();
   }

   @Override
   public void l() {
      this.aO = this.aN;
      this.aN = this.B();
      if (this.aN != cov.a.b && this.aN != cov.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dP().B && this.q >= 60.0F) {
         this.bH();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.A();
      if (this.da()) {
         if (!(this.cT() instanceof cmx)) {
            this.a(false, false);
         }

         this.E();
         if (this.dP().B) {
            this.G();
            this.dP().a(new ahw(this.c(0), this.c(1)));
         }

         this.a(btu.a, this.ds());
      } else {
         this.h(evr.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aW()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avz $$1 = this.s();
               if ($$1 != null) {
                  evr $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dP().a(null, this.du() + $$3, this.dw(), this.dA() + $$4, $$1, this.de(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aS();
      List<bsu> $$5 = this.dP().a(this, this.cK().c(0.2F, -0.01F, 0.2F), bsz.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dP().B && !(this.cQ() instanceof cmx);

         for (bsu $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cS().size() < this.y() && !$$7.bR() && this.b($$7) && $$7 instanceof btp && !($$7 instanceof cgh) && !($$7 instanceof cmx)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dP().B) {
         int $$0 = this.H();
         if ($$0 > 0) {
            this.aS += 0.05F;
         } else {
            this.aS -= 0.1F;
         }

         this.aS = ayz.a(this.aS, 0.0F, 1.0F);
         this.aU = this.aT;
         this.aT = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dP().Z())) * this.aS;
      } else {
         if (!this.aQ) {
            this.b(0);
         }

         int $$1 = this.H();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               evr $$3 = this.ds();
               if (this.aR) {
                  this.h($$3.b(0.0, -0.7, 0.0));
                  this.bH();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cmx) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aQ = false;
         }
      }
   }

   @Nullable
   protected avz s() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return awa.cm;
         case d:
            return awa.cl;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.da()) {
         this.s = 0;
         this.f(this.du(), this.dw(), this.dA());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aF, this.aG);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.ao.a(j, $$0);
      this.ao.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? ayz.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cov.a B() {
      cov.a $$0 = this.D();
      if ($$0 != null) {
         this.aL = this.cK().e;
         return $$0;
      } else if (this.C()) {
         return cov.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aM = $$1;
            return cov.a.d;
         } else {
            return cov.a.e;
         }
      }
   }

   public float u() {
      evm $$0 = this.cK();
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.e);
      int $$4 = ayz.c($$0.e - this.aP);
      int $$5 = ayz.a($$0.c);
      int $$6 = ayz.c($$0.f);
      iz.a $$7 = new iz.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               env $$12 = this.dP().b_($$7);
               if ($$12.a(awv.a)) {
                  $$9 = Math.max($$9, $$12.a((dbe)this.dP(), $$7));
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
      evm $$0 = this.cK();
      evm $$1 = new evm($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayz.a($$1.a) - 1;
      int $$3 = ayz.c($$1.d) + 1;
      int $$4 = ayz.a($$1.b) - 1;
      int $$5 = ayz.c($$1.e) + 1;
      int $$6 = ayz.a($$1.c) - 1;
      int $$7 = ayz.c($$1.f) + 1;
      ewk $$8 = ewh.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      iz.a $$11 = new iz.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dsc $$16 = this.dP().a_($$11);
                     if (!($$16.b() instanceof doc) && ewh.c($$16.k(this.dP(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, evv.i)) {
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
      evm $$0 = this.cK();
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.b);
      int $$4 = ayz.c($$0.b + 0.001);
      int $$5 = ayz.a($$0.c);
      int $$6 = ayz.c($$0.f);
      boolean $$7 = false;
      this.aL = -Double.MAX_VALUE;
      iz.a $$8 = new iz.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               env $$12 = this.dP().b_($$8);
               if ($$12.a(awv.a)) {
                  float $$13 = (float)$$10 + $$12.a((dbe)this.dP(), $$8);
                  this.aL = Math.max((double)$$13, this.aL);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cov.a D() {
      evm $$0 = this.cK();
      double $$1 = $$0.e + 0.001;
      int $$2 = ayz.a($$0.a);
      int $$3 = ayz.c($$0.d);
      int $$4 = ayz.a($$0.e);
      int $$5 = ayz.c($$1);
      int $$6 = ayz.a($$0.c);
      int $$7 = ayz.c($$0.f);
      boolean $$8 = false;
      iz.a $$9 = new iz.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               env $$13 = this.dP().b_($$9);
               if ($$13.a(awv.a) && $$1 < (double)((float)$$9.v() + $$13.a((dbe)this.dP(), $$9))) {
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
   protected double aY() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.aZ();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aO == cov.a.e && this.aN != cov.a.e && this.aN != cov.a.d) {
         this.aL = this.e(1.0);
         this.a_(this.du(), (double)(this.u() - this.dk()) + 0.101, this.dA());
         this.h(this.ds().d(1.0, 0.0, 1.0));
         this.aP = 0.0;
         this.aN = cov.a.a;
      } else {
         if (this.aN == cov.a.a) {
            $$1 = (this.aL - this.dw()) / (double)this.dk();
            this.p = 0.9F;
         } else if (this.aN == cov.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aN == cov.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aN == cov.a.e) {
            this.p = 0.9F;
         } else if (this.aN == cov.a.d) {
            this.p = this.aM;
            if (this.cQ() instanceof cmx) {
               this.aM /= 2.0F;
            }
         }

         evr $$2 = this.ds();
         this.o($$2.c * (double)this.p, $$2.d + $$0, $$2.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            evr $$3 = this.ds();
            this.o($$3.c, ($$3.d + $$1 * (this.aY() / 0.65)) * 0.75, $$3.e);
         }
      }
   }

   private void G() {
      if (this.bS()) {
         float $$0 = 0.0F;
         if (this.aH) {
            this.r--;
         }

         if (this.aI) {
            this.r++;
         }

         if (this.aI != this.aH && !this.aJ && !this.aK) {
            $$0 += 0.005F;
         }

         this.r(this.dF() + this.r);
         if (this.aJ) {
            $$0 += 0.04F;
         }

         if (this.aK) {
            $$0 -= 0.005F;
         }

         this.h(this.ds().b((double)(ayz.a(-this.dF() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayz.b(this.dF() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aI && !this.aH || this.aJ, this.aH && !this.aI || this.aJ);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(bsu $$0) {
      return $$0.dj() < this.dj();
   }

   @Override
   protected void a(bsu $$0, bsu.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ak().a(awt.s)) {
         $$0.r($$0.dF() + this.r);
         $$0.n($$0.cs() + this.r);
         this.c($$0);
         if ($$0 instanceof cff && this.cS().size() == this.y()) {
            int $$2 = $$0.al() % 2 == 0 ? 90 : 270;
            $$0.o(((cff)$$0).aY + (float)$$2);
            $$0.n($$0.cs() + (float)$$2);
         }
      }
   }

   @Override
   public evr b(btp $$0) {
      evr $$1 = a((double)(this.dj() * ayz.g), (double)$$0.dj(), $$0.dF());
      double $$2 = this.du() + $$1.c;
      double $$3 = this.dA() + $$1.e;
      iz $$4 = iz.a($$2, this.cK().e, $$3);
      iz $$5 = $$4.d();
      if (!this.dP().z($$5)) {
         List<evr> $$6 = Lists.newArrayList();
         double $$7 = this.dP().j($$4);
         if (coy.a($$7)) {
            $$6.add(new evr($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dP().j($$5);
         if (coy.a($$8)) {
            $$6.add(new evr($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fI().iterator();

         while (var14.hasNext()) {
            bub $$9 = (bub)var14.next();

            for (evr $$10 : $$6) {
               if (coy.a(this.dP(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bsu $$0) {
      $$0.o(this.dF());
      float $$1 = ayz.g($$0.dF() - this.dF());
      float $$2 = ayz.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.r($$0.dF() + $$2 - $$1);
      $$0.n($$0.dF());
   }

   @Override
   public void k(bsu $$0) {
      this.c($$0);
   }

   @Override
   protected void b(us $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(us $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cov.b.a($$0.l("Type")));
      }
   }

   @Override
   public bqu a(cmx $$0, bqt $$1) {
      if ($$0.fR()) {
         return bqu.e;
      } else if (this.q < 60.0F) {
         if (!this.dP().B) {
            return $$0.n(this) ? bqu.c : bqu.e;
         } else {
            return bqu.a;
         }
      } else {
         return bqu.e;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dsc $$2, iz $$3) {
      this.aP = this.ds().d;
      if (!this.bR()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aN != cov.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dQ().k());
               if (!this.dP().B && !this.dK()) {
                  this.an();
                  if (this.dP().ab().b(dbu.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cus.pp);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dP().b_(this.dp().d()).a(awv.a) && $$0 < 0.0) {
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

   private int H() {
      return this.ao.a(l);
   }

   public float a(float $$0) {
      return ayz.i($$0, this.aU, this.aT);
   }

   public void a(cov.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public cov.b x() {
      return cov.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(bsu $$0) {
      return this.cS().size() < this.y() && !this.a(awv.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public btp cQ() {
      return this.cT() instanceof btp $$0 ? $$0 : super.cQ();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aH = $$0;
      this.aI = $$1;
      this.aJ = $$2;
      this.aK = $$3;
   }

   @Override
   protected xp cr() {
      return xp.c(this.ag_().a());
   }

   @Override
   public boolean bj() {
      return this.aN == cov.a.b || this.aN == cov.a.c;
   }

   @Override
   public cup dC() {
      return new cup(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements azu {
      a(dfb.n, "oak"),
      b(dfb.o, "spruce"),
      c(dfb.p, "birch"),
      d(dfb.q, "jungle"),
      e(dfb.r, "acacia"),
      f(dfb.s, "cherry"),
      g(dfb.t, "dark_oak"),
      h(dfb.u, "mangrove"),
      i(dfb.v, "bamboo");

      private final String k;
      private final dez l;
      public static final azu.a<cov.b> j = azu.a(cov.b::values);
      private static final IntFunction<cov.b> m = axp.a(Enum::ordinal, values(), axp.a.a);

      private b(final dez $$0, final String $$1) {
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

      public dez b() {
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
