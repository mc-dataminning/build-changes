import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqm extends cra implements buy, bwa<cqm.b> {
   private static final akl<Integer> i = akp.a(cqm.class, akn.b);
   private static final akl<Boolean> j = akp.a(cqm.class, akn.k);
   private static final akl<Boolean> k = akp.a(cqm.class, akn.k);
   private static final akl<Integer> l = akp.a(cqm.class, akn.b);
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
   private double az;
   private double aA;
   private boolean aB;
   private boolean aC;
   private boolean aD;
   private boolean aE;
   private double aF;
   private float aG;
   private cqm.a aH;
   private cqm.a aI;
   private double aJ;
   private boolean aK;
   private boolean aL;
   private float aM;
   private float aN;
   private float aO;
   @Nullable
   private buy.a aP;

   public cqm(bul<? extends cqm> $$0, dfb $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cqm(dfb $$0, double $$1, double $$2, double $$3) {
      this(bul.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bue.b bh() {
      return bue.b.c;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(i, cqm.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bue $$0) {
      return a(this, $$0);
   }

   public static boolean a(bue $$0, bue $$1) {
      return ($$1.bO() || $$1.bJ()) && !$$0.z($$1);
   }

   @Override
   public boolean bO() {
      return true;
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   public ezn a(jm.a $$0, l.a $$1) {
      return bva.j(super.a($$0, $$1));
   }

   @Override
   protected ezn a(bue $$0, buh $$1, float $$2) {
      float $$3 = this.v();
      if (this.da().size() > 1) {
         int $$4 = this.da().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cgr) {
            $$3 += 0.2F;
         }
      }

      return new ezn(0.0, this.w() == cqm.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dN() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dX().C) {
         this.aK = true;
         this.aL = $$0;
         if (this.K() == 0) {
            this.b(60);
         }
      }

      this.dX().a(lr.am, this.dC() + (double)this.af.i(), this.dE() + 0.7, this.dI() + (double)this.af.i(), 0.0, 0.0, 0.0);
      if (this.af.a(20) == 0) {
         this.dX().a(this.dC(), this.dE(), this.dI(), this.aX(), this.dn(), 1.0F, 0.8F + 0.4F * this.af.i(), false);
         this.a(eag.O, this.cY());
      }
   }

   @Override
   public void h(bue $$0) {
      if ($$0 instanceof cqm) {
         if ($$0.cS().b < this.cS().e) {
            super.h($$0);
         }
      } else if ($$0.cS().b <= this.cS().b) {
         super.h($$0);
      }
   }

   @Override
   public cvx al_() {
      return this.w().b();
   }

   @Override
   public void p(float $$0) {
      this.m(-this.S());
      this.d(10);
      this.b(this.Q() * 11.0F);
   }

   @Override
   public boolean bI() {
      return !this.dS();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.az = (double)$$3;
      this.aA = (double)$$4;
      this.s = 10;
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.t : this.dC();
   }

   @Override
   public double e_() {
      return this.s > 0 ? this.u : this.dE();
   }

   @Override
   public double P_() {
      return this.s > 0 ? this.v : this.dI();
   }

   @Override
   public float Q_() {
      return this.s > 0 ? (float)this.aA : this.dP();
   }

   @Override
   public float f_() {
      return this.s > 0 ? (float)this.az : this.dN();
   }

   @Override
   public jm cQ() {
      return this.cP().h();
   }

   @Override
   public void l() {
      this.aI = this.aH;
      this.aH = this.E();
      if (this.aH != cqm.a.b && this.aH != cqm.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dX().C && this.q >= 60.0F) {
         this.bQ();
      }

      if (this.R() > 0) {
         this.d(this.R() - 1);
      }

      if (this.Q() > 0.0F) {
         this.b(this.Q() - 1.0F);
      }

      super.l();
      this.D();
      if (this.dj()) {
         if (!(this.db() instanceof com)) {
            this.b(false, false);
         }

         this.I();
         if (this.dX().C) {
            this.J();
            this.dX().a(new ahw(this.c(0), this.c(1)));
         }

         this.a(bve.a, this.dA());
      } else {
         this.h(ezn.c);
      }

      this.aL();
      this.y();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bc()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awk $$1 = this.o();
               if ($$1 != null) {
                  ezn $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dX().a(null, this.dC() + $$3, this.dE(), this.dI() + $$4, $$1, this.dn(), 1.0F, 0.8F + 0.4F * this.af.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      List<bue> $$5 = this.dX().a(this, this.cS().c(0.2F, -0.01F, 0.2F), buj.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dX().C && !(this.cY() instanceof com);

         for (bue $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6 && this.da().size() < this.x() && !$$7.ca() && this.c($$7) && $$7 instanceof bva && !($$7 instanceof cht) && !($$7 instanceof com)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void y() {
      if (this.dX().C) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aM += 0.05F;
         } else {
            this.aM -= 0.1F;
         }

         this.aM = azk.a(this.aM, 0.0F, 1.0F);
         this.aO = this.aN;
         this.aN = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dX().aa())) * this.aM;
      } else {
         if (!this.aK) {
            this.b(0);
         }

         int $$1 = this.K();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               ezn $$3 = this.dA();
               if (this.aL) {
                  this.h($$3.b(0.0, -0.7, 0.0));
                  this.bQ();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof com) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aK = false;
         }
      }
   }

   @Nullable
   protected awk o() {
      switch (this.E()) {
         case a:
         case b:
         case c:
            return awl.cm;
         case d:
            return awl.cl;
         case e:
         default:
            return null;
      }
   }

   private void D() {
      if (this.dj()) {
         this.s = 0;
         this.f(this.dC(), this.dE(), this.dI());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.az, this.aA);
         this.s--;
      }
   }

   public void b(boolean $$0, boolean $$1) {
      this.am.a(j, $$0);
      this.am.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? azk.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public buy.a Y_() {
      return this.aP;
   }

   @Override
   public void a(@Nullable buy.a $$0) {
      this.aP = $$0;
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.88F * this.cT()), (double)(this.ds() * 0.64F));
   }

   @Override
   public void b(bue $$0, float $$1) {
      ezn $$2 = $$0.dv().d(this.dv()).d().c((double)$$1 - 6.0);
      ezn $$3 = this.dA();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.h($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cqm.a E() {
      cqm.a $$0 = this.G();
      if ($$0 != null) {
         this.aF = this.cS().e;
         return $$0;
      } else if (this.F()) {
         return cqm.a.a;
      } else {
         float $$1 = this.t();
         if ($$1 > 0.0F) {
            this.aG = $$1;
            return cqm.a.d;
         } else {
            return cqm.a.e;
         }
      }
   }

   public float q() {
      ezi $$0 = this.cS();
      int $$1 = azk.a($$0.a);
      int $$2 = azk.c($$0.d);
      int $$3 = azk.a($$0.e);
      int $$4 = azk.c($$0.e - this.aJ);
      int $$5 = azk.a($$0.c);
      int $$6 = azk.c($$0.f);
      jh.a $$7 = new jh.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               erk $$12 = this.dX().b_($$7);
               if ($$12.a(axg.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dX(), $$7));
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

   public float t() {
      ezi $$0 = this.cS();
      ezi $$1 = new ezi($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azk.a($$1.a) - 1;
      int $$3 = azk.c($$1.d) + 1;
      int $$4 = azk.a($$1.b) - 1;
      int $$5 = azk.c($$1.e) + 1;
      int $$6 = azk.a($$1.c) - 1;
      int $$7 = azk.c($$1.f) + 1;
      fah $$8 = fae.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      jh.a $$11 = new jh.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dvj $$16 = this.dX().a_($$11);
                     if (!($$16.b() instanceof drh) && fae.c($$16.g(this.dX(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ezr.i)) {
                        $$9 += $$16.b().g();
                        $$10++;
                     }
                  }
               }
            }
         }
      }

      return $$9 / (float)$$10;
   }

   private boolean F() {
      ezi $$0 = this.cS();
      int $$1 = azk.a($$0.a);
      int $$2 = azk.c($$0.d);
      int $$3 = azk.a($$0.b);
      int $$4 = azk.c($$0.b + 0.001);
      int $$5 = azk.a($$0.c);
      int $$6 = azk.c($$0.f);
      boolean $$7 = false;
      this.aF = -Double.MAX_VALUE;
      jh.a $$8 = new jh.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               erk $$12 = this.dX().b_($$8);
               if ($$12.a(axg.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dX(), $$8);
                  this.aF = Math.max((double)$$13, this.aF);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cqm.a G() {
      ezi $$0 = this.cS();
      double $$1 = $$0.e + 0.001;
      int $$2 = azk.a($$0.a);
      int $$3 = azk.c($$0.d);
      int $$4 = azk.a($$0.e);
      int $$5 = azk.c($$1);
      int $$6 = azk.a($$0.c);
      int $$7 = azk.c($$0.f);
      boolean $$8 = false;
      jh.a $$9 = new jh.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               erk $$13 = this.dX().b_($$9);
               if ($$13.a(axg.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dX(), $$9))) {
                  if (!$$13.b()) {
                     return cqm.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cqm.a.b : null;
   }

   @Override
   protected double be() {
      return 0.04;
   }

   private void I() {
      double $$0 = -this.bf();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aI == cqm.a.e && this.aH != cqm.a.e && this.aH != cqm.a.d) {
         this.aF = this.e(1.0);
         double $$2 = (double)(this.q() - this.dt()) + 0.101;
         if (this.dX().a(this, this.cS().d(0.0, $$2 - this.dE(), 0.0))) {
            this.a_(this.dC(), $$2, this.dI());
            this.h(this.dA().d(1.0, 0.0, 1.0));
            this.aJ = 0.0;
         }

         this.aH = cqm.a.a;
      } else {
         if (this.aH == cqm.a.a) {
            $$1 = (this.aF - this.dE()) / (double)this.dt();
            this.p = 0.9F;
         } else if (this.aH == cqm.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aH == cqm.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aH == cqm.a.e) {
            this.p = 0.9F;
         } else if (this.aH == cqm.a.d) {
            this.p = this.aG;
            if (this.cY() instanceof com) {
               this.aG /= 2.0F;
            }
         }

         ezn $$3 = this.dA();
         this.n($$3.d * (double)this.p, $$3.e + $$0, $$3.f * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            ezn $$4 = this.dA();
            this.n($$4.d, ($$4.e + $$1 * (this.be() / 0.65)) * 0.75, $$4.f);
         }
      }
   }

   private void J() {
      if (this.cb()) {
         float $$0 = 0.0F;
         if (this.aB) {
            this.r--;
         }

         if (this.aC) {
            this.r++;
         }

         if (this.aC != this.aB && !this.aD && !this.aE) {
            $$0 += 0.005F;
         }

         this.v(this.dN() + this.r);
         if (this.aD) {
            $$0 += 0.04F;
         }

         if (this.aE) {
            $$0 -= 0.005F;
         }

         this.h(this.dA().b((double)(azk.a(-this.dN() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azk.b(this.dN() * (float) (Math.PI / 180.0)) * $$0)));
         this.b(this.aC && !this.aB || this.aD, this.aB && !this.aC || this.aD);
      }
   }

   protected float v() {
      return 0.0F;
   }

   public boolean c(bue $$0) {
      return $$0.ds() < this.ds();
   }

   @Override
   protected void a(bue $$0, bue.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ar().a(axe.s)) {
         $$0.v($$0.dN() + this.r);
         $$0.q($$0.cB() + this.r);
         this.d($$0);
         if ($$0 instanceof cgr && this.da().size() == this.x()) {
            int $$2 = $$0.as() % 2 == 0 ? 90 : 270;
            $$0.r(((cgr)$$0).aX + (float)$$2);
            $$0.q($$0.cB() + (float)$$2);
         }
      }
   }

   @Override
   public ezn b(bva $$0) {
      ezn $$1 = a((double)(this.ds() * azk.g), (double)$$0.ds(), $$0.dN());
      double $$2 = this.dC() + $$1.d;
      double $$3 = this.dI() + $$1.f;
      jh $$4 = jh.a($$2, this.cS().e, $$3);
      jh $$5 = $$4.e();
      if (!this.dX().z($$5)) {
         List<ezn> $$6 = Lists.newArrayList();
         double $$7 = this.dX().j($$4);
         if (cqp.a($$7)) {
            $$6.add(new ezn($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dX().j($$5);
         if (cqp.a($$8)) {
            $$6.add(new ezn($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fQ().iterator();

         while (var14.hasNext()) {
            bvm $$9 = (bvm)var14.next();

            for (ezn $$10 : $$6) {
               if (cqp.a(this.dX(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void d(bue $$0) {
      $$0.r(this.dN());
      float $$1 = azk.h($$0.dN() - this.dN());
      float $$2 = azk.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.v($$0.dN() + $$2 - $$1);
      $$0.q($$0.dN());
   }

   @Override
   public void k(bue $$0) {
      this.d($$0);
   }

   @Override
   protected void b(uk $$0) {
      this.a($$0, this.aP);
      $$0.a("Type", this.w().c());
   }

   @Override
   protected void a(uk $$0) {
      this.aP = this.c($$0);
      if ($$0.b("Type", 8)) {
         this.a(cqm.b.a($$0.l("Type")));
      }
   }

   @Override
   public bsd a(com $$0, bsc $$1) {
      bsd $$2 = super.a($$0, $$1);
      if ($$2 != bsd.e) {
         return $$2;
      } else {
         return (bsd)($$0.ga() || !(this.q < 60.0F) || !this.dX().C && !$$0.n(this) ? bsd.e : bsd.a);
      }
   }

   @Override
   public void a(bue.c $$0) {
      if (!this.dX().C && $$0.a() && this.M_()) {
         this.a(true, true);
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
      this.aJ = this.dA().e;
      if (!this.ca()) {
         if ($$1) {
            this.n();
         } else if (!this.dX().b_(this.dx().e()).a(axg.a) && $$0 < 0.0) {
            this.aa -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.am.a($$0 == 0 ? j : k) && this.cY() != null;
   }

   private void b(int $$0) {
      this.am.a(l, $$0);
   }

   private int K() {
      return this.am.a(l);
   }

   public float a(float $$0) {
      return azk.h($$0, this.aO, this.aN);
   }

   public void a(cqm.b $$0) {
      this.am.a(i, $$0.ordinal());
   }

   public cqm.b w() {
      return cqm.b.a(this.am.a(i));
   }

   @Override
   protected boolean r(bue $$0) {
      return this.da().size() < this.x() && !this.a(axg.a);
   }

   protected int x() {
      return 2;
   }

   @Nullable
   @Override
   public bva cY() {
      return this.db() instanceof bva $$0 ? $$0 : super.cY();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aB = $$0;
      this.aC = $$1;
      this.aD = $$2;
      this.aE = $$3;
   }

   @Override
   protected xi cA() {
      return this.w().m;
   }

   @Override
   public boolean bp() {
      return this.aH == cqm.a.b || this.aH == cqm.a.c;
   }

   @Override
   public cwb dK() {
      return new cwb(this.al_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements bag {
      a(() -> cwf.nV, "oak", "item.minecraft.oak_boat"),
      b(() -> cwf.nX, "spruce", "item.minecaft.spruce_boat"),
      c(() -> cwf.nZ, "birch", "item.minecraft.birch_boat"),
      d(() -> cwf.ob, "jungle", "item.minecraft.jungle_boat"),
      e(() -> cwf.od, "acacia", "item.minecraft.acacia_boat"),
      f(() -> cwf.of, "cherry", "item.minecraft.cherry_boat"),
      g(() -> cwf.oh, "dark_oak", "item.minecraft.dark_oak_boat"),
      h(() -> cwf.oj, "mangrove", "item.minecraft.mangrove_boat"),
      i(() -> cwf.ol, "bamboo", "item.minecraft.bamboo_raft");

      private final String k;
      private final Supplier<cvx> l;
      final xi m;
      public static final bag.a<cqm.b> j = bag.a(cqm.b::values);
      private static final IntFunction<cqm.b> n = ayb.a(Enum::ordinal, values(), ayb.a.a);

      private b(final Supplier<cvx> $$0, final String $$1, final String $$2) {
         this.k = $$1;
         this.l = $$0;
         this.m = xi.c($$2);
      }

      @Override
      public String c() {
         return this.k;
      }

      public String a() {
         return this.k;
      }

      public cvx b() {
         return this.l.get();
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cqm.b a(int $$0) {
         return n.apply($$0);
      }

      public static cqm.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
