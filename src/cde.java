import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cde extends big implements bjv<cde.b> {
   private static final adx<Integer> f = aea.a(cde.class, adz.b);
   private static final adx<Integer> g = aea.a(cde.class, adz.b);
   private static final adx<Float> h = aea.a(cde.class, adz.d);
   private static final adx<Integer> i = aea.a(cde.class, adz.b);
   private static final adx<Boolean> j = aea.a(cde.class, adz.k);
   private static final adx<Boolean> k = aea.a(cde.class, adz.k);
   private static final adx<Integer> l = aea.a(cde.class, adz.b);
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
   private double aE;
   private double aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private double aK;
   private float aL;
   private cde.a aM;
   private cde.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cde(bik<? extends cde> $$0, cpk $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cde(cpk $$0, double $$1, double $$2, double $$3) {
      this(bik.k, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(bji $$0, bih $$1) {
      return $$1.b;
   }

   @Override
   protected big.b aU() {
      return big.b.c;
   }

   @Override
   protected void a_() {
      this.an.a(f, 0);
      this.an.a(g, 1);
      this.an.a(h, 0.0F);
      this.an.a(i, cde.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(big $$0) {
      return a(this, $$0);
   }

   public static boolean a(big $$0, big $$1) {
      return ($$1.bx() || $$1.bs()) && !$$0.y($$1);
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected ehf a(hb.a $$0, l.a $$1) {
      return biw.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      float $$3 = this.q();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bui) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.v() == cde.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dK().B && !this.dF()) {
         this.m(-this.t());
         this.d(10);
         this.a(this.r() + $$1 * 10.0F);
         this.bo();
         this.a(dji.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cbl && ((cbl)$$0.d()).fR().d;
         if ($$2 || this.r() > 40.0F) {
            if (!$$2 && this.dK().X().b(cpg.h)) {
               this.a($$0);
            }

            this.ak();
         }

         return true;
      } else {
         return true;
      }
   }

   protected void a(bhe $$0) {
      this.a(this.j());
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dK().B) {
         this.aP = true;
         this.aQ = $$0;
         if (this.F() == 0) {
            this.b(60);
         }
      }

      this.dK().a(iw.ag, this.dp() + (double)this.ag.i(), this.dr() + 0.7, this.dv() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dK().a(this.dp(), this.dr(), this.dv(), this.aM(), this.da(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(dji.O, this.cN());
      }
   }

   @Override
   public void g(big $$0) {
      if ($$0 instanceof cde) {
         if ($$0.cG().b < this.cG().e) {
            super.g($$0);
         }
      } else if ($$0.cG().b <= this.cG().b) {
         super.g($$0);
      }
   }

   public cir j() {
      return switch (this.v()) {
         case b -> ciz.nk;
         case c -> ciz.nm;
         case d -> ciz.no;
         case e -> ciz.nq;
         case f -> ciz.ns;
         case g -> ciz.nu;
         case h -> ciz.nw;
         case i -> ciz.ny;
         default -> ciz.ni;
      };
   }

   @Override
   public void m(float $$0) {
      this.m(-this.t());
      this.d(10);
      this.a(this.r() * 11.0F);
   }

   @Override
   public boolean br() {
      return !this.dF();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.aE = (double)$$3;
      this.aF = (double)$$4;
      this.s = 10;
   }

   @Override
   public hb cE() {
      return this.cD().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.z();
      if (this.aM != cde.a.b && this.aM != cde.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dK().B && this.q >= 60.0F) {
         this.bA();
      }

      if (this.s() > 0) {
         this.d(this.s() - 1);
      }

      if (this.r() > 0.0F) {
         this.a(this.r() - 1.0F);
      }

      super.l();
      this.y();
      if (this.cW()) {
         if (!(this.cQ() instanceof cbl)) {
            this.a(false, false);
         }

         this.D();
         if (this.dK().B) {
            this.E();
            this.dK().a(new abt(this.c(0), this.c(1)));
         }

         this.a(bjc.a, this.dn());
      } else {
         this.f(ehf.b);
      }

      this.x();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aS()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               aot $$1 = this.m();
               if ($$1 != null) {
                  ehf $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dK().a(null, this.dp() + $$3, this.dr(), this.dv() + $$4, $$1, this.da(), 1.0F, 0.8F + 0.4F * this.ag.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aO();
      List<big> $$5 = this.dK().a(this, this.cG().c(0.2F, -0.01F, 0.2F), bij.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dK().B && !(this.cN() instanceof cbl);

         for (big $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.w() && !$$7.bN() && this.a($$7) && $$7 instanceof biw && !($$7 instanceof bvk) && !($$7 instanceof cbl)) {
                  $$7.n(this);
               } else {
                  this.g($$7);
               }
            }
         }
      }
   }

   private void x() {
      if (this.dK().B) {
         int $$0 = this.F();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = aro.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dK().V())) * this.aR;
      } else {
         if (!this.aP) {
            this.b(0);
         }

         int $$1 = this.F();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               ehf $$3 = this.dn();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bA();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cbl) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected aot m() {
      switch (this.z()) {
         case a:
         case b:
         case c:
            return aou.bX;
         case d:
            return aou.bW;
         case e:
         default:
            return null;
      }
   }

   private void y() {
      if (this.cW()) {
         this.s = 0;
         this.f(this.dp(), this.dr(), this.dv());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aE, this.aF);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.an.b(j, $$0);
      this.an.b(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? aro.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cde.a z() {
      cde.a $$0 = this.B();
      if ($$0 != null) {
         this.aK = this.cG().e;
         return $$0;
      } else if (this.A()) {
         return cde.a.a;
      } else {
         float $$1 = this.p();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cde.a.d;
         } else {
            return cde.a.e;
         }
      }
   }

   public float o() {
      eha $$0 = this.cG();
      int $$1 = aro.a($$0.a);
      int $$2 = aro.c($$0.d);
      int $$3 = aro.a($$0.e);
      int $$4 = aro.c($$0.e - this.aO);
      int $$5 = aro.a($$0.c);
      int $$6 = aro.c($$0.f);
      gv.a $$7 = new gv.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eab $$12 = this.dK().b_($$7);
               if ($$12.a(apo.a)) {
                  $$9 = Math.max($$9, $$12.a((coq)this.dK(), $$7));
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

   public float p() {
      eha $$0 = this.cG();
      eha $$1 = new eha($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = aro.a($$1.a) - 1;
      int $$3 = aro.c($$1.d) + 1;
      int $$4 = aro.a($$1.b) - 1;
      int $$5 = aro.c($$1.e) + 1;
      int $$6 = aro.a($$1.c) - 1;
      int $$7 = aro.c($$1.f) + 1;
      ehy $$8 = ehv.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      gv.a $$11 = new gv.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dey $$16 = this.dK().a_($$11);
                     if (!($$16.b() instanceof dbl) && ehv.c($$16.k(this.dK(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ehj.i)) {
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

   private boolean A() {
      eha $$0 = this.cG();
      int $$1 = aro.a($$0.a);
      int $$2 = aro.c($$0.d);
      int $$3 = aro.a($$0.b);
      int $$4 = aro.c($$0.b + 0.001);
      int $$5 = aro.a($$0.c);
      int $$6 = aro.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      gv.a $$8 = new gv.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eab $$12 = this.dK().b_($$8);
               if ($$12.a(apo.a)) {
                  float $$13 = (float)$$10 + $$12.a((coq)this.dK(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cde.a B() {
      eha $$0 = this.cG();
      double $$1 = $$0.e + 0.001;
      int $$2 = aro.a($$0.a);
      int $$3 = aro.c($$0.d);
      int $$4 = aro.a($$0.e);
      int $$5 = aro.c($$1);
      int $$6 = aro.a($$0.c);
      int $$7 = aro.c($$0.f);
      boolean $$8 = false;
      gv.a $$9 = new gv.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eab $$13 = this.dK().b_($$9);
               if ($$13.a(apo.a) && $$1 < (double)((float)$$9.v() + $$13.a((coq)this.dK(), $$9))) {
                  if (!$$13.b()) {
                     return cde.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cde.a.b : null;
   }

   private void D() {
      double $$0 = -0.04F;
      double $$1 = this.aT() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cde.a.e && this.aM != cde.a.e && this.aM != cde.a.d) {
         this.aK = this.e(1.0);
         this.e(this.dp(), (double)(this.o() - this.dg()) + 0.101, this.dv());
         this.f(this.dn().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cde.a.a;
      } else {
         if (this.aM == cde.a.a) {
            $$2 = (this.aK - this.dr()) / (double)this.dg();
            this.p = 0.9F;
         } else if (this.aM == cde.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cde.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cde.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cde.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cbl) {
               this.aL /= 2.0F;
            }
         }

         ehf $$3 = this.dn();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            ehf $$4 = this.dn();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void E() {
      if (this.bO()) {
         float $$0 = 0.0F;
         if (this.aG) {
            this.r--;
         }

         if (this.aH) {
            this.r++;
         }

         if (this.aH != this.aG && !this.aI && !this.aJ) {
            $$0 += 0.005F;
         }

         this.r(this.dA() + this.r);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.f(this.dn().b((double)(aro.a(-this.dA() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(aro.b(this.dA() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float q() {
      return 0.0F;
   }

   public boolean a(big $$0) {
      return $$0.df() < this.df();
   }

   @Override
   protected void a(big $$0, big.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dA() + this.r);
      $$0.n($$0.co() + this.r);
      this.b($$0);
      if ($$0 instanceof bui && this.cP().size() == this.w()) {
         int $$2 = $$0.ah() % 2 == 0 ? 90 : 270;
         $$0.o(((bui)$$0).aU + (float)$$2);
         $$0.n($$0.co() + (float)$$2);
      }
   }

   @Override
   public ehf b(biw $$0) {
      ehf $$1 = a((double)(this.df() * aro.g), (double)$$0.df(), $$0.dA());
      double $$2 = this.dp() + $$1.c;
      double $$3 = this.dv() + $$1.e;
      gv $$4 = gv.a($$2, this.cG().e, $$3);
      gv $$5 = $$4.d();
      if (!this.dK().y($$5)) {
         List<ehf> $$6 = Lists.newArrayList();
         double $$7 = this.dK().i($$4);
         if (cdh.a($$7)) {
            $$6.add(new ehf($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dK().i($$5);
         if (cdh.a($$8)) {
            $$6.add(new ehf($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fy().iterator();

         while (var14.hasNext()) {
            bji $$9 = (bji)var14.next();

            for (ehf $$10 : $$6) {
               if (cdh.a(this.dK(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(big $$0) {
      $$0.o(this.dA());
      float $$1 = aro.g($$0.dA() - this.dA());
      float $$2 = aro.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dA() + $$2 - $$1);
      $$0.n($$0.dA());
   }

   @Override
   public void j(big $$0) {
      this.b($$0);
   }

   @Override
   protected void b(qs $$0) {
      $$0.a("Type", this.v().c());
   }

   @Override
   protected void a(qs $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cde.b.a($$0.l("Type")));
      }
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      if ($$0.fG()) {
         return bgo.d;
      } else if (this.q < 60.0F) {
         if (!this.dK().B) {
            return $$0.n(this) ? bgo.b : bgo.d;
         } else {
            return bgo.a;
         }
      } else {
         return bgo.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
      this.aO = this.dn().d;
      if (!this.bN()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != cde.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dL().k());
               if (!this.dK().B && !this.dF()) {
                  this.aj();
                  if (this.dK().X().b(cpg.h)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.v().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(ciz.oB);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dK().b_(this.dk().d()).a(apo.a) && $$0 < 0.0) {
            this.ab -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.an.b($$0 == 0 ? j : k) && this.cN() != null;
   }

   public void a(float $$0) {
      this.an.b(h, $$0);
   }

   public float r() {
      return this.an.b(h);
   }

   public void d(int $$0) {
      this.an.b(f, $$0);
   }

   public int s() {
      return this.an.b(f);
   }

   private void b(int $$0) {
      this.an.b(l, $$0);
   }

   private int F() {
      return this.an.b(l);
   }

   public float b(float $$0) {
      return aro.i($$0, this.aT, this.aS);
   }

   public void m(int $$0) {
      this.an.b(g, $$0);
   }

   public int t() {
      return this.an.b(g);
   }

   public void a(cde.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public cde.b v() {
      return cde.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(big $$0) {
      return this.cP().size() < this.w() && !this.a(apo.a);
   }

   protected int w() {
      return 2;
   }

   @Nullable
   @Override
   public biw cN() {
      return this.cQ() instanceof biw $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected te cn() {
      return te.c(this.j().a());
   }

   @Override
   public boolean bc() {
      return this.aM == cde.a.b || this.aM == cde.a.c;
   }

   @Override
   public ciw dx() {
      return new ciw(this.j());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements asf {
      a(csl.n, "oak"),
      b(csl.o, "spruce"),
      c(csl.p, "birch"),
      d(csl.q, "jungle"),
      e(csl.r, "acacia"),
      f(csl.s, "cherry"),
      g(csl.t, "dark_oak"),
      h(csl.u, "mangrove"),
      i(csl.v, "bamboo");

      private final String k;
      private final csk l;
      public static final asf.a<cde.b> j = asf.a(cde.b::values);
      private static final IntFunction<cde.b> m = aqi.a(Enum::ordinal, values(), aqi.a.a);

      private b(csk $$0, String $$1) {
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

      public csk b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cde.b a(int $$0) {
         return m.apply($$0);
      }

      public static cde.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
