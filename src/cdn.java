import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdn extends biq implements bke<cdn.b> {
   private static final aee<Integer> f = aeh.a(cdn.class, aeg.b);
   private static final aee<Integer> g = aeh.a(cdn.class, aeg.b);
   private static final aee<Float> h = aeh.a(cdn.class, aeg.d);
   private static final aee<Integer> i = aeh.a(cdn.class, aeg.b);
   private static final aee<Boolean> j = aeh.a(cdn.class, aeg.k);
   private static final aee<Boolean> k = aeh.a(cdn.class, aeg.k);
   private static final aee<Integer> l = aeh.a(cdn.class, aeg.b);
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
   private cdn.a aM;
   private cdn.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cdn(biu<? extends cdn> $$0, cpv $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cdn(cpv $$0, double $$1, double $$2, double $$3) {
      this(biu.k, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(bjs $$0, bir $$1) {
      return $$1.b;
   }

   @Override
   protected biq.b aU() {
      return biq.b.c;
   }

   @Override
   protected void a_() {
      this.an.a(f, 0);
      this.an.a(g, 1);
      this.an.a(h, 0.0F);
      this.an.a(i, cdn.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(biq $$0) {
      return a(this, $$0);
   }

   public static boolean a(biq $$0, biq $$1) {
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
   protected ehn a(ha.a $$0, l.a $$1) {
      return bjg.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      float $$3 = this.w();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bur) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.A() == cdn.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dL().B && !this.dG()) {
         this.m(-this.z());
         this.d(10);
         this.a(this.x() + $$1 * 10.0F);
         this.bo();
         this.a(djt.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cbu && ((cbu)$$0.d()).fS().d;
         if ($$2 || this.x() > 40.0F) {
            if (!$$2 && this.dL().X().b(cpr.h)) {
               this.a($$0);
            }

            this.ak();
         }

         return true;
      } else {
         return true;
      }
   }

   protected void a(bho $$0) {
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
         this.a(djt.O, this.cN());
      }
   }

   @Override
   public void g(biq $$0) {
      if ($$0 instanceof cdn) {
         if ($$0.cG().b < this.cG().e) {
            super.g($$0);
         }
      } else if ($$0.cG().b <= this.cG().b) {
         super.g($$0);
      }
   }

   public cja q() {
      return switch (this.A()) {
         case b -> cji.nk;
         case c -> cji.nm;
         case d -> cji.no;
         case e -> cji.nq;
         case f -> cji.ns;
         case g -> cji.nu;
         case h -> cji.nw;
         case i -> cji.ny;
         default -> cji.ni;
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
      if (this.aM != cdn.a.b && this.aM != cdn.a.c) {
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
         if (!(this.cQ() instanceof cbu)) {
            this.a(false, false);
         }

         this.I();
         if (this.dL().B) {
            this.K();
            this.dL().a(new aca(this.c(0), this.c(1)));
         }

         this.a(bjm.a, this.do());
      } else {
         this.f(ehn.b);
      }

      this.C();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aS()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               apc $$1 = this.s();
               if ($$1 != null) {
                  ehn $$2 = this.f(1.0F);
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
      List<biq> $$5 = this.dL().a(this, this.cG().c(0.2F, -0.01F, 0.2F), bit.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dL().B && !(this.cN() instanceof cbu);

         for (biq $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.B() && !$$7.bN() && this.a($$7) && $$7 instanceof bjg && !($$7 instanceof bvt) && !($$7 instanceof cbu)) {
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

         this.aR = arw.a(this.aR, 0.0F, 1.0F);
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
               ehn $$3 = this.do();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bA();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cbu) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected apc s() {
      switch (this.F()) {
         case a:
         case b:
         case c:
            return apd.bX;
         case d:
            return apd.bW;
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
      return this.c($$0) ? arw.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cdn.a F() {
      cdn.a $$0 = this.H();
      if ($$0 != null) {
         this.aK = this.cG().e;
         return $$0;
      } else if (this.G()) {
         return cdn.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cdn.a.d;
         } else {
            return cdn.a.e;
         }
      }
   }

   public float t() {
      ehi $$0 = this.cG();
      int $$1 = arw.a($$0.a);
      int $$2 = arw.c($$0.d);
      int $$3 = arw.a($$0.e);
      int $$4 = arw.c($$0.e - this.aO);
      int $$5 = arw.a($$0.c);
      int $$6 = arw.c($$0.f);
      gw.a $$7 = new gw.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eam $$12 = this.dL().b_($$7);
               if ($$12.a(apx.a)) {
                  $$9 = Math.max($$9, $$12.a((cpb)this.dL(), $$7));
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
      ehi $$0 = this.cG();
      ehi $$1 = new ehi($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = arw.a($$1.a) - 1;
      int $$3 = arw.c($$1.d) + 1;
      int $$4 = arw.a($$1.b) - 1;
      int $$5 = arw.c($$1.e) + 1;
      int $$6 = arw.a($$1.c) - 1;
      int $$7 = arw.c($$1.f) + 1;
      eig $$8 = eid.a($$1);
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
                     dfj $$16 = this.dL().a_($$11);
                     if (!($$16.b() instanceof dbw) && eid.c($$16.k(this.dL(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ehr.i)) {
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

   private boolean G() {
      ehi $$0 = this.cG();
      int $$1 = arw.a($$0.a);
      int $$2 = arw.c($$0.d);
      int $$3 = arw.a($$0.b);
      int $$4 = arw.c($$0.b + 0.001);
      int $$5 = arw.a($$0.c);
      int $$6 = arw.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      gw.a $$8 = new gw.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eam $$12 = this.dL().b_($$8);
               if ($$12.a(apx.a)) {
                  float $$13 = (float)$$10 + $$12.a((cpb)this.dL(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cdn.a H() {
      ehi $$0 = this.cG();
      double $$1 = $$0.e + 0.001;
      int $$2 = arw.a($$0.a);
      int $$3 = arw.c($$0.d);
      int $$4 = arw.a($$0.e);
      int $$5 = arw.c($$1);
      int $$6 = arw.a($$0.c);
      int $$7 = arw.c($$0.f);
      boolean $$8 = false;
      gw.a $$9 = new gw.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eam $$13 = this.dL().b_($$9);
               if ($$13.a(apx.a) && $$1 < (double)((float)$$9.v() + $$13.a((cpb)this.dL(), $$9))) {
                  if (!$$13.b()) {
                     return cdn.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cdn.a.b : null;
   }

   private void I() {
      double $$0 = -0.04F;
      double $$1 = this.aT() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cdn.a.e && this.aM != cdn.a.e && this.aM != cdn.a.d) {
         this.aK = this.e(1.0);
         this.e(this.dq(), (double)(this.t() - this.dg()) + 0.101, this.dw());
         this.f(this.do().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cdn.a.a;
      } else {
         if (this.aM == cdn.a.a) {
            $$2 = (this.aK - this.ds()) / (double)this.dg();
            this.p = 0.9F;
         } else if (this.aM == cdn.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cdn.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cdn.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cdn.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cbu) {
               this.aL /= 2.0F;
            }
         }

         ehn $$3 = this.do();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            ehn $$4 = this.do();
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

         this.f(this.do().b((double)(arw.a(-this.dB() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(arw.b(this.dB() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean a(biq $$0) {
      return $$0.df() < this.df();
   }

   @Override
   protected void a(biq $$0, biq.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dB() + this.r);
      $$0.n($$0.co() + this.r);
      this.b($$0);
      if ($$0 instanceof bur && this.cP().size() == this.B()) {
         int $$2 = $$0.ah() % 2 == 0 ? 90 : 270;
         $$0.o(((bur)$$0).aU + (float)$$2);
         $$0.n($$0.co() + (float)$$2);
      }
   }

   @Override
   public ehn b(bjg $$0) {
      ehn $$1 = a((double)(this.df() * arw.g), (double)$$0.df(), $$0.dB());
      double $$2 = this.dq() + $$1.c;
      double $$3 = this.dw() + $$1.e;
      gw $$4 = gw.a($$2, this.cG().e, $$3);
      gw $$5 = $$4.d();
      if (!this.dL().y($$5)) {
         List<ehn> $$6 = Lists.newArrayList();
         double $$7 = this.dL().i($$4);
         if (cdq.a($$7)) {
            $$6.add(new ehn($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dL().i($$5);
         if (cdq.a($$8)) {
            $$6.add(new ehn($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fz().iterator();

         while (var14.hasNext()) {
            bjs $$9 = (bjs)var14.next();

            for (ehn $$10 : $$6) {
               if (cdq.a(this.dL(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(biq $$0) {
      $$0.o(this.dB());
      float $$1 = arw.g($$0.dB() - this.dB());
      float $$2 = arw.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dB() + $$2 - $$1);
      $$0.n($$0.dB());
   }

   @Override
   public void j(biq $$0) {
      this.b($$0);
   }

   @Override
   protected void b(qw $$0) {
      $$0.a("Type", this.A().c());
   }

   @Override
   protected void a(qw $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cdn.b.a($$0.l("Type")));
      }
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      if ($$0.fH()) {
         return bgy.d;
      } else if (this.q < 60.0F) {
         if (!this.dL().B) {
            return $$0.n(this) ? bgy.b : bgy.d;
         } else {
            return bgy.a;
         }
      } else {
         return bgy.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
      this.aO = this.do().d;
      if (!this.bN()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != cdn.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dM().k());
               if (!this.dL().B && !this.dG()) {
                  this.aj();
                  if (this.dL().X().b(cpr.h)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.A().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cji.oB);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dL().b_(this.dl().d()).a(apx.a) && $$0 < 0.0) {
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
      return arw.i($$0, this.aT, this.aS);
   }

   public void m(int $$0) {
      this.an.b(g, $$0);
   }

   public int z() {
      return this.an.b(g);
   }

   public void a(cdn.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public cdn.b A() {
      return cdn.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(biq $$0) {
      return this.cP().size() < this.B() && !this.a(apx.a);
   }

   protected int B() {
      return 2;
   }

   @Nullable
   @Override
   public bjg cN() {
      return this.cQ() instanceof bjg $$0 ? $$0 : super.cN();
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
      return this.aM == cdn.a.b || this.aM == cdn.a.c;
   }

   @Override
   public cjf dy() {
      return new cjf(this.q());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements asp {
      a(csw.n, "oak"),
      b(csw.o, "spruce"),
      c(csw.p, "birch"),
      d(csw.q, "jungle"),
      e(csw.r, "acacia"),
      f(csw.s, "cherry"),
      g(csw.t, "dark_oak"),
      h(csw.u, "mangrove"),
      i(csw.v, "bamboo");

      private final String k;
      private final csv l;
      public static final asp.a<cdn.b> j = asp.a(cdn.b::values);
      private static final IntFunction<cdn.b> m = aqr.a(Enum::ordinal, values(), aqr.a.a);

      private b(csv $$0, String $$1) {
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

      public csv b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cdn.b a(int $$0) {
         return m.apply($$0);
      }

      public static cdn.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
