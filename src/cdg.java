import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdg extends bii implements bjx<cdg.b> {
   private static final adz<Integer> f = aec.a(cdg.class, aeb.b);
   private static final adz<Integer> g = aec.a(cdg.class, aeb.b);
   private static final adz<Float> h = aec.a(cdg.class, aeb.d);
   private static final adz<Integer> i = aec.a(cdg.class, aeb.b);
   private static final adz<Boolean> j = aec.a(cdg.class, aeb.k);
   private static final adz<Boolean> k = aec.a(cdg.class, aeb.k);
   private static final adz<Integer> l = aec.a(cdg.class, aeb.b);
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
   private cdg.a aM;
   private cdg.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cdg(bim<? extends cdg> $$0, cpm $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cdg(cpm $$0, double $$1, double $$2, double $$3) {
      this(bim.k, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(bjk $$0, bij $$1) {
      return $$1.b;
   }

   @Override
   protected bii.b aU() {
      return bii.b.c;
   }

   @Override
   protected void a_() {
      this.an.a(f, 0);
      this.an.a(g, 1);
      this.an.a(h, 0.0F);
      this.an.a(i, cdg.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(bii $$0) {
      return a(this, $$0);
   }

   public static boolean a(bii $$0, bii $$1) {
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
   protected ehe a(ha.a $$0, l.a $$1) {
      return biy.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      float $$3 = this.q();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof buk) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.v() == cdg.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dK().B && !this.dF()) {
         this.m(-this.t());
         this.d(10);
         this.a(this.r() + $$1 * 10.0F);
         this.bo();
         this.a(djk.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cbn && ((cbn)$$0.d()).fR().d;
         if ($$2 || this.r() > 40.0F) {
            if (!$$2 && this.dK().X().b(cpi.h)) {
               this.a($$0);
            }

            this.ak();
         }

         return true;
      } else {
         return true;
      }
   }

   protected void a(bhg $$0) {
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

      this.dK().a(iv.ag, this.dp() + (double)this.ag.i(), this.dr() + 0.7, this.dv() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dK().a(this.dp(), this.dr(), this.dv(), this.aM(), this.da(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(djk.O, this.cN());
      }
   }

   @Override
   public void g(bii $$0) {
      if ($$0 instanceof cdg) {
         if ($$0.cG().b < this.cG().e) {
            super.g($$0);
         }
      } else if ($$0.cG().b <= this.cG().b) {
         super.g($$0);
      }
   }

   public cit j() {
      return switch (this.v()) {
         case b -> cjb.nk;
         case c -> cjb.nm;
         case d -> cjb.no;
         case e -> cjb.nq;
         case f -> cjb.ns;
         case g -> cjb.nu;
         case h -> cjb.nw;
         case i -> cjb.ny;
         default -> cjb.ni;
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
   public ha cE() {
      return this.cD().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.z();
      if (this.aM != cdg.a.b && this.aM != cdg.a.c) {
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
         if (!(this.cQ() instanceof cbn)) {
            this.a(false, false);
         }

         this.D();
         if (this.dK().B) {
            this.E();
            this.dK().a(new abv(this.c(0), this.c(1)));
         }

         this.a(bje.a, this.dn());
      } else {
         this.f(ehe.b);
      }

      this.x();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aS()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               aov $$1 = this.m();
               if ($$1 != null) {
                  ehe $$2 = this.f(1.0F);
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
      List<bii> $$5 = this.dK().a(this, this.cG().c(0.2F, -0.01F, 0.2F), bil.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dK().B && !(this.cN() instanceof cbn);

         for (bii $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.w() && !$$7.bN() && this.a($$7) && $$7 instanceof biy && !($$7 instanceof bvm) && !($$7 instanceof cbn)) {
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

         this.aR = arp.a(this.aR, 0.0F, 1.0F);
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
               ehe $$3 = this.dn();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bA();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cbn) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected aov m() {
      switch (this.z()) {
         case a:
         case b:
         case c:
            return aow.bX;
         case d:
            return aow.bW;
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
      return this.c($$0) ? arp.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cdg.a z() {
      cdg.a $$0 = this.B();
      if ($$0 != null) {
         this.aK = this.cG().e;
         return $$0;
      } else if (this.A()) {
         return cdg.a.a;
      } else {
         float $$1 = this.p();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cdg.a.d;
         } else {
            return cdg.a.e;
         }
      }
   }

   public float o() {
      egz $$0 = this.cG();
      int $$1 = arp.a($$0.a);
      int $$2 = arp.c($$0.d);
      int $$3 = arp.a($$0.e);
      int $$4 = arp.c($$0.e - this.aO);
      int $$5 = arp.a($$0.c);
      int $$6 = arp.c($$0.f);
      gu.a $$7 = new gu.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ead $$12 = this.dK().b_($$7);
               if ($$12.a(apq.a)) {
                  $$9 = Math.max($$9, $$12.a((cos)this.dK(), $$7));
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
      egz $$0 = this.cG();
      egz $$1 = new egz($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = arp.a($$1.a) - 1;
      int $$3 = arp.c($$1.d) + 1;
      int $$4 = arp.a($$1.b) - 1;
      int $$5 = arp.c($$1.e) + 1;
      int $$6 = arp.a($$1.c) - 1;
      int $$7 = arp.c($$1.f) + 1;
      ehx $$8 = ehu.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      gu.a $$11 = new gu.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dfa $$16 = this.dK().a_($$11);
                     if (!($$16.b() instanceof dbn) && ehu.c($$16.k(this.dK(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ehi.i)) {
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
      egz $$0 = this.cG();
      int $$1 = arp.a($$0.a);
      int $$2 = arp.c($$0.d);
      int $$3 = arp.a($$0.b);
      int $$4 = arp.c($$0.b + 0.001);
      int $$5 = arp.a($$0.c);
      int $$6 = arp.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      gu.a $$8 = new gu.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ead $$12 = this.dK().b_($$8);
               if ($$12.a(apq.a)) {
                  float $$13 = (float)$$10 + $$12.a((cos)this.dK(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cdg.a B() {
      egz $$0 = this.cG();
      double $$1 = $$0.e + 0.001;
      int $$2 = arp.a($$0.a);
      int $$3 = arp.c($$0.d);
      int $$4 = arp.a($$0.e);
      int $$5 = arp.c($$1);
      int $$6 = arp.a($$0.c);
      int $$7 = arp.c($$0.f);
      boolean $$8 = false;
      gu.a $$9 = new gu.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ead $$13 = this.dK().b_($$9);
               if ($$13.a(apq.a) && $$1 < (double)((float)$$9.v() + $$13.a((cos)this.dK(), $$9))) {
                  if (!$$13.b()) {
                     return cdg.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cdg.a.b : null;
   }

   private void D() {
      double $$0 = -0.04F;
      double $$1 = this.aT() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cdg.a.e && this.aM != cdg.a.e && this.aM != cdg.a.d) {
         this.aK = this.e(1.0);
         this.e(this.dp(), (double)(this.o() - this.dg()) + 0.101, this.dv());
         this.f(this.dn().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cdg.a.a;
      } else {
         if (this.aM == cdg.a.a) {
            $$2 = (this.aK - this.dr()) / (double)this.dg();
            this.p = 0.9F;
         } else if (this.aM == cdg.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cdg.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cdg.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cdg.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cbn) {
               this.aL /= 2.0F;
            }
         }

         ehe $$3 = this.dn();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            ehe $$4 = this.dn();
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

         this.f(this.dn().b((double)(arp.a(-this.dA() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(arp.b(this.dA() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float q() {
      return 0.0F;
   }

   public boolean a(bii $$0) {
      return $$0.df() < this.df();
   }

   @Override
   protected void a(bii $$0, bii.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dA() + this.r);
      $$0.n($$0.co() + this.r);
      this.b($$0);
      if ($$0 instanceof buk && this.cP().size() == this.w()) {
         int $$2 = $$0.ah() % 2 == 0 ? 90 : 270;
         $$0.o(((buk)$$0).aU + (float)$$2);
         $$0.n($$0.co() + (float)$$2);
      }
   }

   @Override
   public ehe b(biy $$0) {
      ehe $$1 = a((double)(this.df() * arp.g), (double)$$0.df(), $$0.dA());
      double $$2 = this.dp() + $$1.c;
      double $$3 = this.dv() + $$1.e;
      gu $$4 = gu.a($$2, this.cG().e, $$3);
      gu $$5 = $$4.d();
      if (!this.dK().y($$5)) {
         List<ehe> $$6 = Lists.newArrayList();
         double $$7 = this.dK().i($$4);
         if (cdj.a($$7)) {
            $$6.add(new ehe($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dK().i($$5);
         if (cdj.a($$8)) {
            $$6.add(new ehe($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fy().iterator();

         while (var14.hasNext()) {
            bjk $$9 = (bjk)var14.next();

            for (ehe $$10 : $$6) {
               if (cdj.a(this.dK(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(bii $$0) {
      $$0.o(this.dA());
      float $$1 = arp.g($$0.dA() - this.dA());
      float $$2 = arp.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dA() + $$2 - $$1);
      $$0.n($$0.dA());
   }

   @Override
   public void j(bii $$0) {
      this.b($$0);
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("Type", this.v().c());
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cdg.b.a($$0.l("Type")));
      }
   }

   @Override
   public bgq a(cbn $$0, bgp $$1) {
      if ($$0.fG()) {
         return bgq.d;
      } else if (this.q < 60.0F) {
         if (!this.dK().B) {
            return $$0.n(this) ? bgq.b : bgq.d;
         } else {
            return bgq.a;
         }
      } else {
         return bgq.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dfa $$2, gu $$3) {
      this.aO = this.dn().d;
      if (!this.bN()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != cdg.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dL().k());
               if (!this.dK().B && !this.dF()) {
                  this.aj();
                  if (this.dK().X().b(cpi.h)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.v().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cjb.oB);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dK().b_(this.dk().d()).a(apq.a) && $$0 < 0.0) {
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
      return arp.i($$0, this.aT, this.aS);
   }

   public void m(int $$0) {
      this.an.b(g, $$0);
   }

   public int t() {
      return this.an.b(g);
   }

   public void a(cdg.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public cdg.b v() {
      return cdg.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(bii $$0) {
      return this.cP().size() < this.w() && !this.a(apq.a);
   }

   protected int w() {
      return 2;
   }

   @Nullable
   @Override
   public biy cN() {
      return this.cQ() instanceof biy $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected tf cn() {
      return tf.c(this.j().a());
   }

   @Override
   public boolean bc() {
      return this.aM == cdg.a.b || this.aM == cdg.a.c;
   }

   @Override
   public ciy dx() {
      return new ciy(this.j());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements ash {
      a(csn.n, "oak"),
      b(csn.o, "spruce"),
      c(csn.p, "birch"),
      d(csn.q, "jungle"),
      e(csn.r, "acacia"),
      f(csn.s, "cherry"),
      g(csn.t, "dark_oak"),
      h(csn.u, "mangrove"),
      i(csn.v, "bamboo");

      private final String k;
      private final csm l;
      public static final ash.a<cdg.b> j = ash.a(cdg.b::values);
      private static final IntFunction<cdg.b> m = aqk.a(Enum::ordinal, values(), aqk.a.a);

      private b(csm $$0, String $$1) {
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

      public csm b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cdg.b a(int $$0) {
         return m.apply($$0);
      }

      public static cdg.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
