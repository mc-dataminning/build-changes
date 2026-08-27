import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdt extends biw implements bkk<cdt.b> {
   private static final aef<Integer> f = aei.a(cdt.class, aeh.b);
   private static final aef<Integer> g = aei.a(cdt.class, aeh.b);
   private static final aef<Float> h = aei.a(cdt.class, aeh.d);
   private static final aef<Integer> i = aei.a(cdt.class, aeh.b);
   private static final aef<Boolean> j = aei.a(cdt.class, aeh.k);
   private static final aef<Boolean> k = aei.a(cdt.class, aeh.k);
   private static final aef<Integer> l = aei.a(cdt.class, aeh.b);
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
   private cdt.a aM;
   private cdt.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cdt(bja<? extends cdt> $$0, cqb $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cdt(cqb $$0, double $$1, double $$2, double $$3) {
      this(bja.k, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(bjy $$0, bix $$1) {
      return $$1.b;
   }

   @Override
   protected biw.b aU() {
      return biw.b.c;
   }

   @Override
   protected void a_() {
      this.an.a(f, 0);
      this.an.a(g, 1);
      this.an.a(h, 0.0F);
      this.an.a(i, cdt.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(biw $$0) {
      return a(this, $$0);
   }

   public static boolean a(biw $$0, biw $$1) {
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
   protected ehh a(ha.a $$0, l.a $$1) {
      return bjm.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      float $$3 = this.w();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bux) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.A() == cdt.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dL().B && !this.dG()) {
         this.m(-this.z());
         this.d(10);
         this.a(this.x() + $$1 * 10.0F);
         this.bo();
         this.a(djn.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cca && ((cca)$$0.d()).fT().d;
         if ($$2 || this.x() > 40.0F) {
            if (!$$2 && this.dL().X().b(cpx.h)) {
               this.a($$0);
            }

            this.ak();
         }

         return true;
      } else {
         return true;
      }
   }

   protected void a(bhu $$0) {
      this.a(this.q());
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dL().B) {
         this.aP = true;
         this.aQ = $$0;
         if (this.L() == 0) {
            this.b(60);
         }
      }

      this.dL().a(iv.ag, this.dq() + (double)this.ag.i(), this.ds() + 0.7, this.dw() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), this.aM(), this.da(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(djn.O, this.cN());
      }
   }

   @Override
   public void g(biw $$0) {
      if ($$0 instanceof cdt) {
         if ($$0.cG().b < this.cG().e) {
            super.g($$0);
         }
      } else if ($$0.cG().b <= this.cG().b) {
         super.g($$0);
      }
   }

   public cjg q() {
      return switch (this.A()) {
         case b -> cjo.nk;
         case c -> cjo.nm;
         case d -> cjo.no;
         case e -> cjo.nq;
         case f -> cjo.ns;
         case g -> cjo.nu;
         case h -> cjo.nw;
         case i -> cjo.ny;
         default -> cjo.ni;
      };
   }

   @Override
   public void m(float $$0) {
      this.m(-this.z());
      this.d(10);
      this.a(this.x() * 11.0F);
   }

   @Override
   public boolean br() {
      return !this.dG();
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
   public double n_() {
      return this.s > 0 ? this.t : this.dq();
   }

   @Override
   public double K_() {
      return this.s > 0 ? this.u : this.ds();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.v : this.dw();
   }

   @Override
   public float d_() {
      return this.s > 0 ? (float)this.aF : this.dD();
   }

   @Override
   public float o_() {
      return this.s > 0 ? (float)this.aE : this.dB();
   }

   @Override
   public ha cE() {
      return this.cD().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.F();
      if (this.aM != cdt.a.b && this.aM != cdt.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dL().B && this.q >= 60.0F) {
         this.bA();
      }

      if (this.y() > 0) {
         this.d(this.y() - 1);
      }

      if (this.x() > 0.0F) {
         this.a(this.x() - 1.0F);
      }

      super.l();
      this.E();
      if (this.cW()) {
         if (!(this.cQ() instanceof cca)) {
            this.a(false, false);
         }

         this.I();
         if (this.dL().B) {
            this.K();
            this.dL().a(new acb(this.c(0), this.c(1)));
         }

         this.a(bjs.a, this.do());
      } else {
         this.f(ehh.b);
      }

      this.C();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aS()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               apf $$1 = this.s();
               if ($$1 != null) {
                  ehh $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dL().a(null, this.dq() + $$3, this.ds(), this.dw() + $$4, $$1, this.da(), 1.0F, 0.8F + 0.4F * this.ag.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aO();
      List<biw> $$5 = this.dL().a(this, this.cG().c(0.2F, -0.01F, 0.2F), biz.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dL().B && !(this.cN() instanceof cca);

         for (biw $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.B() && !$$7.bN() && this.a($$7) && $$7 instanceof bjm && !($$7 instanceof bvz) && !($$7 instanceof cca)) {
                  $$7.n(this);
               } else {
                  this.g($$7);
               }
            }
         }
      }
   }

   private void C() {
      if (this.dL().B) {
         int $$0 = this.L();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = asb.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dL().V())) * this.aR;
      } else {
         if (!this.aP) {
            this.b(0);
         }

         int $$1 = this.L();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               ehh $$3 = this.do();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bA();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cca) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected apf s() {
      switch (this.F()) {
         case a:
         case b:
         case c:
            return apg.bX;
         case d:
            return apg.bW;
         case e:
         default:
            return null;
      }
   }

   private void E() {
      if (this.cW()) {
         this.s = 0;
         this.f(this.dq(), this.ds(), this.dw());
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
      return this.c($$0) ? asb.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cdt.a F() {
      cdt.a $$0 = this.H();
      if ($$0 != null) {
         this.aK = this.cG().e;
         return $$0;
      } else if (this.G()) {
         return cdt.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cdt.a.d;
         } else {
            return cdt.a.e;
         }
      }
   }

   public float t() {
      ehc $$0 = this.cG();
      int $$1 = asb.a($$0.a);
      int $$2 = asb.c($$0.d);
      int $$3 = asb.a($$0.e);
      int $$4 = asb.c($$0.e - this.aO);
      int $$5 = asb.a($$0.c);
      int $$6 = asb.c($$0.f);
      gw.a $$7 = new gw.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eag $$12 = this.dL().b_($$7);
               if ($$12.a(aqa.a)) {
                  $$9 = Math.max($$9, $$12.a((cph)this.dL(), $$7));
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
      ehc $$0 = this.cG();
      ehc $$1 = new ehc($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = asb.a($$1.a) - 1;
      int $$3 = asb.c($$1.d) + 1;
      int $$4 = asb.a($$1.b) - 1;
      int $$5 = asb.c($$1.e) + 1;
      int $$6 = asb.a($$1.c) - 1;
      int $$7 = asb.c($$1.f) + 1;
      eia $$8 = ehx.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      gw.a $$11 = new gw.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dfd $$16 = this.dL().a_($$11);
                     if (!($$16.b() instanceof dca) && ehx.c($$16.k(this.dL(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ehl.i)) {
                        $$9 += $$16.b().i();
                        $$10++;
                     }
                  }
               }
            }
         }
      }

      return $$9 / (float)$$10;
   }

   private boolean G() {
      ehc $$0 = this.cG();
      int $$1 = asb.a($$0.a);
      int $$2 = asb.c($$0.d);
      int $$3 = asb.a($$0.b);
      int $$4 = asb.c($$0.b + 0.001);
      int $$5 = asb.a($$0.c);
      int $$6 = asb.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      gw.a $$8 = new gw.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eag $$12 = this.dL().b_($$8);
               if ($$12.a(aqa.a)) {
                  float $$13 = (float)$$10 + $$12.a((cph)this.dL(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cdt.a H() {
      ehc $$0 = this.cG();
      double $$1 = $$0.e + 0.001;
      int $$2 = asb.a($$0.a);
      int $$3 = asb.c($$0.d);
      int $$4 = asb.a($$0.e);
      int $$5 = asb.c($$1);
      int $$6 = asb.a($$0.c);
      int $$7 = asb.c($$0.f);
      boolean $$8 = false;
      gw.a $$9 = new gw.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eag $$13 = this.dL().b_($$9);
               if ($$13.a(aqa.a) && $$1 < (double)((float)$$9.v() + $$13.a((cph)this.dL(), $$9))) {
                  if (!$$13.b()) {
                     return cdt.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cdt.a.b : null;
   }

   private void I() {
      double $$0 = -0.04F;
      double $$1 = this.aT() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cdt.a.e && this.aM != cdt.a.e && this.aM != cdt.a.d) {
         this.aK = this.e(1.0);
         this.e(this.dq(), (double)(this.t() - this.dg()) + 0.101, this.dw());
         this.f(this.do().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cdt.a.a;
      } else {
         if (this.aM == cdt.a.a) {
            $$2 = (this.aK - this.ds()) / (double)this.dg();
            this.p = 0.9F;
         } else if (this.aM == cdt.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cdt.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cdt.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cdt.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cca) {
               this.aL /= 2.0F;
            }
         }

         ehh $$3 = this.do();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            ehh $$4 = this.do();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void K() {
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

         this.r(this.dB() + this.r);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.f(this.do().b((double)(asb.a(-this.dB() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(asb.b(this.dB() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean a(biw $$0) {
      return $$0.df() < this.df();
   }

   @Override
   protected void a(biw $$0, biw.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dB() + this.r);
      $$0.n($$0.co() + this.r);
      this.b($$0);
      if ($$0 instanceof bux && this.cP().size() == this.B()) {
         int $$2 = $$0.ah() % 2 == 0 ? 90 : 270;
         $$0.o(((bux)$$0).aU + (float)$$2);
         $$0.n($$0.co() + (float)$$2);
      }
   }

   @Override
   public ehh b(bjm $$0) {
      ehh $$1 = a((double)(this.df() * asb.g), (double)$$0.df(), $$0.dB());
      double $$2 = this.dq() + $$1.c;
      double $$3 = this.dw() + $$1.e;
      gw $$4 = gw.a($$2, this.cG().e, $$3);
      gw $$5 = $$4.d();
      if (!this.dL().y($$5)) {
         List<ehh> $$6 = Lists.newArrayList();
         double $$7 = this.dL().i($$4);
         if (cdw.a($$7)) {
            $$6.add(new ehh($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dL().i($$5);
         if (cdw.a($$8)) {
            $$6.add(new ehh($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fA().iterator();

         while (var14.hasNext()) {
            bjy $$9 = (bjy)var14.next();

            for (ehh $$10 : $$6) {
               if (cdw.a(this.dL(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(biw $$0) {
      $$0.o(this.dB());
      float $$1 = asb.g($$0.dB() - this.dB());
      float $$2 = asb.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dB() + $$2 - $$1);
      $$0.n($$0.dB());
   }

   @Override
   public void j(biw $$0) {
      this.b($$0);
   }

   @Override
   protected void b(qw $$0) {
      $$0.a("Type", this.A().c());
   }

   @Override
   protected void a(qw $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cdt.b.a($$0.l("Type")));
      }
   }

   @Override
   public bhe a(cca $$0, bhd $$1) {
      if ($$0.fI()) {
         return bhe.d;
      } else if (this.q < 60.0F) {
         if (!this.dL().B) {
            return $$0.n(this) ? bhe.b : bhe.d;
         } else {
            return bhe.a;
         }
      } else {
         return bhe.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dfd $$2, gw $$3) {
      this.aO = this.do().d;
      if (!this.bN()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != cdt.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dM().k());
               if (!this.dL().B && !this.dG()) {
                  this.aj();
                  if (this.dL().X().b(cpx.h)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.A().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cjo.oB);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dL().b_(this.dl().d()).a(aqa.a) && $$0 < 0.0) {
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

   public float x() {
      return this.an.b(h);
   }

   public void d(int $$0) {
      this.an.b(f, $$0);
   }

   public int y() {
      return this.an.b(f);
   }

   private void b(int $$0) {
      this.an.b(l, $$0);
   }

   private int L() {
      return this.an.b(l);
   }

   public float b(float $$0) {
      return asb.i($$0, this.aT, this.aS);
   }

   public void m(int $$0) {
      this.an.b(g, $$0);
   }

   public int z() {
      return this.an.b(g);
   }

   public void a(cdt.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public cdt.b A() {
      return cdt.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(biw $$0) {
      return this.cP().size() < this.B() && !this.a(aqa.a);
   }

   protected int B() {
      return 2;
   }

   @Nullable
   @Override
   public bjm cN() {
      return this.cQ() instanceof bjm $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected tl cn() {
      return tl.c(this.q().a());
   }

   @Override
   public boolean bc() {
      return this.aM == cdt.a.b || this.aM == cdt.a.c;
   }

   @Override
   public cjl dy() {
      return new cjl(this.q());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements asu {
      a(cte.n, "oak"),
      b(cte.o, "spruce"),
      c(cte.p, "birch"),
      d(cte.q, "jungle"),
      e(cte.r, "acacia"),
      f(cte.s, "cherry"),
      g(cte.t, "dark_oak"),
      h(cte.u, "mangrove"),
      i(cte.v, "bamboo");

      private final String k;
      private final ctc l;
      public static final asu.a<cdt.b> j = asu.a(cdt.b::values);
      private static final IntFunction<cdt.b> m = aqu.a(Enum::ordinal, values(), aqu.a.a);

      private b(ctc $$0, String $$1) {
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

      public ctc b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cdt.b a(int $$0) {
         return m.apply($$0);
      }

      public static cdt.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
