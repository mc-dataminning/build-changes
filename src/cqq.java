import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqq extends cre implements bvc, bwe<cqq.b> {
   private static final ako<Integer> i = aks.a(cqq.class, akq.b);
   private static final ako<Boolean> j = aks.a(cqq.class, akq.k);
   private static final ako<Boolean> k = aks.a(cqq.class, akq.k);
   private static final ako<Integer> l = aks.a(cqq.class, akq.b);
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
   private cqq.a aH;
   private cqq.a aI;
   private double aJ;
   private boolean aK;
   private boolean aL;
   private float aM;
   private float aN;
   private float aO;
   @Nullable
   private bvc.a aP;

   public cqq(bup<? extends cqq> $$0, dff $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cqq(dff $$0, double $$1, double $$2, double $$3) {
      this(bup.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(i, cqq.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bui $$0) {
      return a(this, $$0);
   }

   public static boolean a(bui $$0, bui $$1) {
      return ($$1.bP() || $$1.bK()) && !$$0.z($$1);
   }

   @Override
   public boolean bP() {
      return true;
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public ezr a(jm.a $$0, l.a $$1) {
      return bve.j(super.a($$0, $$1));
   }

   @Override
   protected ezr a(bui $$0, bul $$1, float $$2) {
      float $$3 = this.v();
      if (this.db().size() > 1) {
         int $$4 = this.db().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cgv) {
            $$3 += 0.2F;
         }
      }

      return new ezr(0.0, this.w() == cqq.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dO() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dY().C) {
         this.aK = true;
         this.aL = $$0;
         if (this.K() == 0) {
            this.b(60);
         }
      }

      this.dY().a(ls.am, this.dD() + (double)this.af.i(), this.dF() + 0.7, this.dJ() + (double)this.af.i(), 0.0, 0.0, 0.0);
      if (this.af.a(20) == 0) {
         this.dY().a(this.dD(), this.dF(), this.dJ(), this.aY(), this.do(), 1.0F, 0.8F + 0.4F * this.af.i(), false);
         this.a(eak.O, this.cZ());
      }
   }

   @Override
   public void h(bui $$0) {
      if ($$0 instanceof cqq) {
         if ($$0.cT().b < this.cT().e) {
            super.h($$0);
         }
      } else if ($$0.cT().b <= this.cT().b) {
         super.h($$0);
      }
   }

   @Override
   public cwb al_() {
      return this.w().b();
   }

   @Override
   public void p(float $$0) {
      this.m(-this.T());
      this.d(10);
      this.b(this.R() * 11.0F);
   }

   @Override
   public boolean bJ() {
      return !this.dT();
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
      return this.s > 0 ? this.t : this.dD();
   }

   @Override
   public double e_() {
      return this.s > 0 ? this.u : this.dF();
   }

   @Override
   public double P_() {
      return this.s > 0 ? this.v : this.dJ();
   }

   @Override
   public float Q_() {
      return this.s > 0 ? (float)this.aA : this.dQ();
   }

   @Override
   public float f_() {
      return this.s > 0 ? (float)this.az : this.dO();
   }

   @Override
   public jm cR() {
      return this.cQ().h();
   }

   @Override
   public void l() {
      this.aI = this.aH;
      this.aH = this.E();
      if (this.aH != cqq.a.b && this.aH != cqq.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dY().C && this.q >= 60.0F) {
         this.bR();
      }

      if (this.S() > 0) {
         this.d(this.S() - 1);
      }

      if (this.R() > 0.0F) {
         this.b(this.R() - 1.0F);
      }

      super.l();
      this.D();
      if (this.dk()) {
         if (!(this.dc() instanceof cor)) {
            this.b(false, false);
         }

         this.I();
         if (this.dY().C) {
            this.J();
            this.dY().a(new ahz(this.c(0), this.c(1)));
         }

         this.a(bvi.a, this.dB());
      } else {
         this.h(ezr.c);
      }

      this.aM();
      this.y();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bd()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awn $$1 = this.o();
               if ($$1 != null) {
                  ezr $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dY().a(null, this.dD() + $$3, this.dF(), this.dJ() + $$4, $$1, this.do(), 1.0F, 0.8F + 0.4F * this.af.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      List<bui> $$5 = this.dY().a(this, this.cT().c(0.2F, -0.01F, 0.2F), bun.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dY().C && !(this.cZ() instanceof cor);

         for (bui $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6 && this.db().size() < this.x() && !$$7.cb() && this.c($$7) && $$7 instanceof bve && !($$7 instanceof chx) && !($$7 instanceof cor)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void y() {
      if (this.dY().C) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aM += 0.05F;
         } else {
            this.aM -= 0.1F;
         }

         this.aM = azn.a(this.aM, 0.0F, 1.0F);
         this.aO = this.aN;
         this.aN = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dY().aa())) * this.aM;
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
               ezr $$3 = this.dB();
               if (this.aL) {
                  this.h($$3.b(0.0, -0.7, 0.0));
                  this.bR();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cor) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aK = false;
         }
      }
   }

   @Nullable
   protected awn o() {
      switch (this.E()) {
         case a:
         case b:
         case c:
            return awo.cm;
         case d:
            return awo.cl;
         case e:
         default:
            return null;
      }
   }

   private void D() {
      if (this.dk()) {
         this.s = 0;
         this.f(this.dD(), this.dF(), this.dJ());
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
      return this.c($$0) ? azn.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public bvc.a Y_() {
      return this.aP;
   }

   @Override
   public void a(@Nullable bvc.a $$0) {
      this.aP = $$0;
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.88F * this.cU()), (double)(this.dt() * 0.64F));
   }

   @Override
   public void b(bui $$0, float $$1) {
      ezr $$2 = $$0.dw().d(this.dw()).d().c((double)$$1 - 6.0);
      ezr $$3 = this.dB();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.h($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cqq.a E() {
      cqq.a $$0 = this.G();
      if ($$0 != null) {
         this.aF = this.cT().e;
         return $$0;
      } else if (this.F()) {
         return cqq.a.a;
      } else {
         float $$1 = this.t();
         if ($$1 > 0.0F) {
            this.aG = $$1;
            return cqq.a.d;
         } else {
            return cqq.a.e;
         }
      }
   }

   public float q() {
      ezm $$0 = this.cT();
      int $$1 = azn.a($$0.a);
      int $$2 = azn.c($$0.d);
      int $$3 = azn.a($$0.e);
      int $$4 = azn.c($$0.e - this.aJ);
      int $$5 = azn.a($$0.c);
      int $$6 = azn.c($$0.f);
      jh.a $$7 = new jh.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ero $$12 = this.dY().b_($$7);
               if ($$12.a(axj.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dY(), $$7));
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
      ezm $$0 = this.cT();
      ezm $$1 = new ezm($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azn.a($$1.a) - 1;
      int $$3 = azn.c($$1.d) + 1;
      int $$4 = azn.a($$1.b) - 1;
      int $$5 = azn.c($$1.e) + 1;
      int $$6 = azn.a($$1.c) - 1;
      int $$7 = azn.c($$1.f) + 1;
      fal $$8 = fai.a($$1);
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
                     dvo $$16 = this.dY().a_($$11);
                     if (!($$16.b() instanceof drm) && fai.c($$16.g(this.dY(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ezv.i)) {
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
      ezm $$0 = this.cT();
      int $$1 = azn.a($$0.a);
      int $$2 = azn.c($$0.d);
      int $$3 = azn.a($$0.b);
      int $$4 = azn.c($$0.b + 0.001);
      int $$5 = azn.a($$0.c);
      int $$6 = azn.c($$0.f);
      boolean $$7 = false;
      this.aF = -Double.MAX_VALUE;
      jh.a $$8 = new jh.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ero $$12 = this.dY().b_($$8);
               if ($$12.a(axj.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dY(), $$8);
                  this.aF = Math.max((double)$$13, this.aF);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cqq.a G() {
      ezm $$0 = this.cT();
      double $$1 = $$0.e + 0.001;
      int $$2 = azn.a($$0.a);
      int $$3 = azn.c($$0.d);
      int $$4 = azn.a($$0.e);
      int $$5 = azn.c($$1);
      int $$6 = azn.a($$0.c);
      int $$7 = azn.c($$0.f);
      boolean $$8 = false;
      jh.a $$9 = new jh.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ero $$13 = this.dY().b_($$9);
               if ($$13.a(axj.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dY(), $$9))) {
                  if (!$$13.b()) {
                     return cqq.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cqq.a.b : null;
   }

   @Override
   protected double bf() {
      return 0.04;
   }

   private void I() {
      double $$0 = -this.bg();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aI == cqq.a.e && this.aH != cqq.a.e && this.aH != cqq.a.d) {
         this.aF = this.e(1.0);
         double $$2 = (double)(this.q() - this.du()) + 0.101;
         if (this.dY().a(this, this.cT().d(0.0, $$2 - this.dF(), 0.0))) {
            this.a_(this.dD(), $$2, this.dJ());
            this.h(this.dB().d(1.0, 0.0, 1.0));
            this.aJ = 0.0;
         }

         this.aH = cqq.a.a;
      } else {
         if (this.aH == cqq.a.a) {
            $$1 = (this.aF - this.dF()) / (double)this.du();
            this.p = 0.9F;
         } else if (this.aH == cqq.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aH == cqq.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aH == cqq.a.e) {
            this.p = 0.9F;
         } else if (this.aH == cqq.a.d) {
            this.p = this.aG;
            if (this.cZ() instanceof cor) {
               this.aG /= 2.0F;
            }
         }

         ezr $$3 = this.dB();
         this.n($$3.d * (double)this.p, $$3.e + $$0, $$3.f * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            ezr $$4 = this.dB();
            this.n($$4.d, ($$4.e + $$1 * (this.bf() / 0.65)) * 0.75, $$4.f);
         }
      }
   }

   private void J() {
      if (this.cc()) {
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

         this.v(this.dO() + this.r);
         if (this.aD) {
            $$0 += 0.04F;
         }

         if (this.aE) {
            $$0 -= 0.005F;
         }

         this.h(this.dB().b((double)(azn.a(-this.dO() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azn.b(this.dO() * (float) (Math.PI / 180.0)) * $$0)));
         this.b(this.aC && !this.aB || this.aD, this.aB && !this.aC || this.aD);
      }
   }

   protected float v() {
      return 0.0F;
   }

   public boolean c(bui $$0) {
      return $$0.dt() < this.dt();
   }

   @Override
   protected void a(bui $$0, bui.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ar().a(axh.s)) {
         $$0.v($$0.dO() + this.r);
         $$0.q($$0.cC() + this.r);
         this.d($$0);
         if ($$0 instanceof cgv && this.db().size() == this.x()) {
            int $$2 = $$0.as() % 2 == 0 ? 90 : 270;
            $$0.r(((cgv)$$0).aX + (float)$$2);
            $$0.q($$0.cC() + (float)$$2);
         }
      }
   }

   @Override
   public ezr b(bve $$0) {
      ezr $$1 = a((double)(this.dt() * azn.g), (double)$$0.dt(), $$0.dO());
      double $$2 = this.dD() + $$1.d;
      double $$3 = this.dJ() + $$1.f;
      jh $$4 = jh.a($$2, this.cT().e, $$3);
      jh $$5 = $$4.e();
      if (!this.dY().z($$5)) {
         List<ezr> $$6 = Lists.newArrayList();
         double $$7 = this.dY().j($$4);
         if (cqt.a($$7)) {
            $$6.add(new ezr($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dY().j($$5);
         if (cqt.a($$8)) {
            $$6.add(new ezr($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fR().iterator();

         while (var14.hasNext()) {
            bvq $$9 = (bvq)var14.next();

            for (ezr $$10 : $$6) {
               if (cqt.a(this.dY(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void d(bui $$0) {
      $$0.r(this.dO());
      float $$1 = azn.h($$0.dO() - this.dO());
      float $$2 = azn.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.v($$0.dO() + $$2 - $$1);
      $$0.q($$0.dO());
   }

   @Override
   public void k(bui $$0) {
      this.d($$0);
   }

   @Override
   protected void b(un $$0) {
      this.a($$0, this.aP);
      $$0.a("Type", this.w().c());
   }

   @Override
   protected void a(un $$0) {
      this.aP = this.c($$0);
      if ($$0.b("Type", 8)) {
         this.a(cqq.b.a($$0.l("Type")));
      }
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      bsh $$2 = super.a($$0, $$1);
      if ($$2 != bsh.e) {
         return $$2;
      } else {
         return (bsh)($$0.gb() || !(this.q < 60.0F) || !this.dY().C && !$$0.n(this) ? bsh.e : bsh.a);
      }
   }

   @Override
   public void a(bui.c $$0) {
      if (!this.dY().C && $$0.a() && this.M_()) {
         this.a(true, true);
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
      this.aJ = this.dB().e;
      if (!this.cb()) {
         if ($$1) {
            this.n();
         } else if (!this.dY().b_(this.dy().e()).a(axj.a) && $$0 < 0.0) {
            this.aa -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.am.a($$0 == 0 ? j : k) && this.cZ() != null;
   }

   private void b(int $$0) {
      this.am.a(l, $$0);
   }

   private int K() {
      return this.am.a(l);
   }

   public float a(float $$0) {
      return azn.h($$0, this.aO, this.aN);
   }

   public void a(cqq.b $$0) {
      this.am.a(i, $$0.ordinal());
   }

   public cqq.b w() {
      return cqq.b.a(this.am.a(i));
   }

   @Override
   protected boolean r(bui $$0) {
      return this.db().size() < this.x() && !this.a(axj.a);
   }

   protected int x() {
      return 2;
   }

   @Nullable
   @Override
   public bve cZ() {
      return this.dc() instanceof bve $$0 ? $$0 : super.cZ();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aB = $$0;
      this.aC = $$1;
      this.aD = $$2;
      this.aE = $$3;
   }

   @Override
   protected xl cB() {
      return this.w().m;
   }

   @Override
   public boolean bq() {
      return this.aH == cqq.a.b || this.aH == cqq.a.c;
   }

   @Override
   public cwf dL() {
      return new cwf(this.al_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements baj {
      a(() -> cwj.nV, "oak", "item.minecraft.oak_boat"),
      b(() -> cwj.nX, "spruce", "item.minecraft.spruce_boat"),
      c(() -> cwj.nZ, "birch", "item.minecraft.birch_boat"),
      d(() -> cwj.ob, "jungle", "item.minecraft.jungle_boat"),
      e(() -> cwj.od, "acacia", "item.minecraft.acacia_boat"),
      f(() -> cwj.of, "cherry", "item.minecraft.cherry_boat"),
      g(() -> cwj.oh, "dark_oak", "item.minecraft.dark_oak_boat"),
      h(() -> cwj.oj, "mangrove", "item.minecraft.mangrove_boat"),
      i(() -> cwj.ol, "bamboo", "item.minecraft.bamboo_raft");

      private final String k;
      private final Supplier<cwb> l;
      final xl m;
      public static final baj.a<cqq.b> j = baj.a(cqq.b::values);
      private static final IntFunction<cqq.b> n = aye.a(Enum::ordinal, values(), aye.a.a);

      private b(final Supplier<cwb> $$0, final String $$1, final String $$2) {
         this.k = $$1;
         this.l = $$0;
         this.m = xl.c($$2);
      }

      @Override
      public String c() {
         return this.k;
      }

      public String a() {
         return this.k;
      }

      public cwb b() {
         return this.l.get();
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cqq.b a(int $$0) {
         return n.apply($$0);
      }

      public static cqq.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
