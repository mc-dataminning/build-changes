import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cqh extends cqv implements but, bvv<cqh.b> {
   private static final akk<Integer> i = ako.a(cqh.class, akm.b);
   private static final akk<Boolean> j = ako.a(cqh.class, akm.k);
   private static final akk<Boolean> k = ako.a(cqh.class, akm.k);
   private static final akk<Integer> l = ako.a(cqh.class, akm.b);
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
   private cqh.a aH;
   private cqh.a aI;
   private double aJ;
   private boolean aK;
   private boolean aL;
   private float aM;
   private float aN;
   private float aO;
   @Nullable
   private but.a aP;

   public cqh(bug<? extends cqh> $$0, dev $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cqh(dev $$0, double $$1, double $$2, double $$3) {
      this(bug.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected btz.b bh() {
      return btz.b.c;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(i, cqh.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(btz $$0) {
      return a(this, $$0);
   }

   public static boolean a(btz $$0, btz $$1) {
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
   public ezh a(jl.a $$0, l.a $$1) {
      return buv.j(super.a($$0, $$1));
   }

   @Override
   protected ezh a(btz $$0, buc $$1, float $$2) {
      float $$3 = this.v();
      if (this.da().size() > 1) {
         int $$4 = this.da().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cgm) {
            $$3 += 0.2F;
         }
      }

      return new ezh(0.0, this.w() == cqh.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
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

      this.dX().a(lq.am, this.dC() + (double)this.af.i(), this.dE() + 0.7, this.dI() + (double)this.af.i(), 0.0, 0.0, 0.0);
      if (this.af.a(20) == 0) {
         this.dX().a(this.dC(), this.dE(), this.dI(), this.aW(), this.dn(), 1.0F, 0.8F + 0.4F * this.af.i(), false);
         this.a(eaa.O, this.cY());
      }
   }

   @Override
   public void h(btz $$0) {
      if ($$0 instanceof cqh) {
         if ($$0.cS().b < this.cS().e) {
            super.h($$0);
         }
      } else if ($$0.cS().b <= this.cS().b) {
         super.h($$0);
      }
   }

   @Override
   public cvt al_() {
      return this.w().d();
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
   public jl cQ() {
      return this.cP().h();
   }

   @Override
   public void l() {
      this.aI = this.aH;
      this.aH = this.E();
      if (this.aH != cqh.a.b && this.aH != cqh.a.c) {
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
         if (!(this.db() instanceof coh)) {
            this.b(false, false);
         }

         this.I();
         if (this.dX().C) {
            this.J();
            this.dX().a(new ahv(this.c(0), this.c(1)));
         }

         this.a(buz.a, this.dA());
      } else {
         this.h(ezh.c);
      }

      this.aK();
      this.y();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bc()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awj $$1 = this.o();
               if ($$1 != null) {
                  ezh $$2 = this.g(1.0F);
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

      List<btz> $$5 = this.dX().a(this, this.cS().c(0.2F, -0.01F, 0.2F), bue.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dX().C && !(this.cY() instanceof coh);

         for (btz $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6 && this.da().size() < this.x() && !$$7.ca() && this.c($$7) && $$7 instanceof buv && !($$7 instanceof cho) && !($$7 instanceof coh)) {
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

         this.aM = azj.a(this.aM, 0.0F, 1.0F);
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
               ezh $$3 = this.dA();
               if (this.aL) {
                  this.h($$3.b(0.0, -0.7, 0.0));
                  this.bQ();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof coh) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aK = false;
         }
      }
   }

   @Nullable
   protected awj o() {
      switch (this.E()) {
         case a:
         case b:
         case c:
            return awk.cm;
         case d:
            return awk.cl;
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
      return this.c($$0) ? azj.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public but.a Y_() {
      return this.aP;
   }

   @Override
   public void a(@Nullable but.a $$0) {
      this.aP = $$0;
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.88F * this.cT()), (double)(this.ds() * 0.64F));
   }

   @Override
   public void b(btz $$0, float $$1) {
      ezh $$2 = $$0.dv().d(this.dv()).d().c((double)$$1 - 6.0);
      ezh $$3 = this.dA();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.h($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cqh.a E() {
      cqh.a $$0 = this.G();
      if ($$0 != null) {
         this.aF = this.cS().e;
         return $$0;
      } else if (this.F()) {
         return cqh.a.a;
      } else {
         float $$1 = this.t();
         if ($$1 > 0.0F) {
            this.aG = $$1;
            return cqh.a.d;
         } else {
            return cqh.a.e;
         }
      }
   }

   public float q() {
      ezc $$0 = this.cS();
      int $$1 = azj.a($$0.a);
      int $$2 = azj.c($$0.d);
      int $$3 = azj.a($$0.e);
      int $$4 = azj.c($$0.e - this.aJ);
      int $$5 = azj.a($$0.c);
      int $$6 = azj.c($$0.f);
      jg.a $$7 = new jg.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ere $$12 = this.dX().b_($$7);
               if ($$12.a(axf.a)) {
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
      ezc $$0 = this.cS();
      ezc $$1 = new ezc($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azj.a($$1.a) - 1;
      int $$3 = azj.c($$1.d) + 1;
      int $$4 = azj.a($$1.b) - 1;
      int $$5 = azj.c($$1.e) + 1;
      int $$6 = azj.a($$1.c) - 1;
      int $$7 = azj.c($$1.f) + 1;
      fab $$8 = ezy.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      jg.a $$11 = new jg.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dvd $$16 = this.dX().a_($$11);
                     if (!($$16.b() instanceof drb) && ezy.c($$16.g(this.dX(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ezl.i)) {
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
      ezc $$0 = this.cS();
      int $$1 = azj.a($$0.a);
      int $$2 = azj.c($$0.d);
      int $$3 = azj.a($$0.b);
      int $$4 = azj.c($$0.b + 0.001);
      int $$5 = azj.a($$0.c);
      int $$6 = azj.c($$0.f);
      boolean $$7 = false;
      this.aF = -Double.MAX_VALUE;
      jg.a $$8 = new jg.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ere $$12 = this.dX().b_($$8);
               if ($$12.a(axf.a)) {
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
   private cqh.a G() {
      ezc $$0 = this.cS();
      double $$1 = $$0.e + 0.001;
      int $$2 = azj.a($$0.a);
      int $$3 = azj.c($$0.d);
      int $$4 = azj.a($$0.e);
      int $$5 = azj.c($$1);
      int $$6 = azj.a($$0.c);
      int $$7 = azj.c($$0.f);
      boolean $$8 = false;
      jg.a $$9 = new jg.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ere $$13 = this.dX().b_($$9);
               if ($$13.a(axf.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dX(), $$9))) {
                  if (!$$13.b()) {
                     return cqh.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cqh.a.b : null;
   }

   @Override
   protected double be() {
      return 0.04;
   }

   private void I() {
      double $$0 = -this.bf();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aI == cqh.a.e && this.aH != cqh.a.e && this.aH != cqh.a.d) {
         this.aF = this.e(1.0);
         double $$2 = (double)(this.q() - this.dt()) + 0.101;
         if (this.dX().a(this, this.cS().d(0.0, $$2 - this.dE(), 0.0))) {
            this.a_(this.dC(), $$2, this.dI());
            this.h(this.dA().d(1.0, 0.0, 1.0));
            this.aJ = 0.0;
         }

         this.aH = cqh.a.a;
      } else {
         if (this.aH == cqh.a.a) {
            $$1 = (this.aF - this.dE()) / (double)this.dt();
            this.p = 0.9F;
         } else if (this.aH == cqh.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aH == cqh.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aH == cqh.a.e) {
            this.p = 0.9F;
         } else if (this.aH == cqh.a.d) {
            this.p = this.aG;
            if (this.cY() instanceof coh) {
               this.aG /= 2.0F;
            }
         }

         ezh $$3 = this.dA();
         this.n($$3.d * (double)this.p, $$3.e + $$0, $$3.f * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            ezh $$4 = this.dA();
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

         this.h(this.dA().b((double)(azj.a(-this.dN() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azj.b(this.dN() * (float) (Math.PI / 180.0)) * $$0)));
         this.b(this.aC && !this.aB || this.aD, this.aB && !this.aC || this.aD);
      }
   }

   protected float v() {
      return 0.0F;
   }

   public boolean c(btz $$0) {
      return $$0.ds() < this.ds();
   }

   @Override
   protected void a(btz $$0, btz.a $$1) {
      super.a($$0, $$1);
      if (!$$0.aq().a(axd.s)) {
         $$0.v($$0.dN() + this.r);
         $$0.q($$0.cB() + this.r);
         this.d($$0);
         if ($$0 instanceof cgm && this.da().size() == this.x()) {
            int $$2 = $$0.ar() % 2 == 0 ? 90 : 270;
            $$0.r(((cgm)$$0).aU + (float)$$2);
            $$0.q($$0.cB() + (float)$$2);
         }
      }
   }

   @Override
   public ezh b(buv $$0) {
      ezh $$1 = a((double)(this.ds() * azj.g), (double)$$0.ds(), $$0.dN());
      double $$2 = this.dC() + $$1.d;
      double $$3 = this.dI() + $$1.f;
      jg $$4 = jg.a($$2, this.cS().e, $$3);
      jg $$5 = $$4.e();
      if (!this.dX().z($$5)) {
         List<ezh> $$6 = Lists.newArrayList();
         double $$7 = this.dX().j($$4);
         if (cqk.a($$7)) {
            $$6.add(new ezh($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dX().j($$5);
         if (cqk.a($$8)) {
            $$6.add(new ezh($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fQ().iterator();

         while (var14.hasNext()) {
            bvh $$9 = (bvh)var14.next();

            for (ezh $$10 : $$6) {
               if (cqk.a(this.dX(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void d(btz $$0) {
      $$0.r(this.dN());
      float $$1 = azj.h($$0.dN() - this.dN());
      float $$2 = azj.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.v($$0.dN() + $$2 - $$1);
      $$0.q($$0.dN());
   }

   @Override
   public void k(btz $$0) {
      this.d($$0);
   }

   @Override
   protected void b(uj $$0) {
      this.a($$0, this.aP);
      $$0.a("Type", this.w().c());
   }

   @Override
   protected void a(uj $$0) {
      this.aP = this.c($$0);
      if ($$0.b("Type", 8)) {
         this.a(cqh.b.a($$0.l("Type")));
      }
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      bry $$2 = super.a($$0, $$1);
      if ($$2 != bry.e) {
         return $$2;
      } else {
         return (bry)($$0.ga() || !(this.q < 60.0F) || !this.dX().C && !$$0.n(this) ? bry.e : bry.a);
      }
   }

   @Override
   public void a(btz.c $$0) {
      if (!this.dX().C && $$0.a() && this.M_()) {
         this.a(true, true);
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
      this.aJ = this.dA().e;
      if (!this.ca()) {
         if ($$1) {
            if (this.aa > 3.0F) {
               if (this.aH != cqh.a.d) {
                  this.n();
                  return;
               }

               this.a(this.aa, 1.0F, this.dY().l());
               if (!this.dX().C && !this.dS()) {
                  this.at();
                  if (this.dX().ac().b(der.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.w().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cwb.pr);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dX().b_(this.dx().e()).a(axf.a) && $$0 < 0.0) {
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
      return azj.h($$0, this.aO, this.aN);
   }

   public void a(cqh.b $$0) {
      this.am.a(i, $$0.ordinal());
   }

   public cqh.b w() {
      return cqh.b.a(this.am.a(i));
   }

   @Override
   protected boolean r(btz $$0) {
      return this.da().size() < this.x() && !this.a(axf.a);
   }

   protected int x() {
      return 2;
   }

   @Nullable
   @Override
   public buv cY() {
      return this.db() instanceof buv $$0 ? $$0 : super.cY();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aB = $$0;
      this.aC = $$1;
      this.aD = $$2;
      this.aE = $$3;
   }

   @Override
   protected xh cA() {
      return this.w().n;
   }

   @Override
   public boolean bp() {
      return this.aH == cqh.a.b || this.aH == cqh.a.c;
   }

   @Override
   public cvx dK() {
      return new cvx(this.al_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements baf {
      a(cwb.K, cwb.nV, "oak", "item.minecraft.oak_boat"),
      b(cwb.L, cwb.nX, "spruce", "item.minecaft.spruce_boat"),
      c(cwb.M, cwb.nZ, "birch", "item.minecraft.birch_boat"),
      d(cwb.N, cwb.ob, "jungle", "item.minecraft.jungle_boat"),
      e(cwb.O, cwb.od, "acacia", "item.minecraft.acacia_boat"),
      f(cwb.P, cwb.of, "cherry", "item.minecraft.cherry_boat"),
      g(cwb.Q, cwb.oh, "dark_oak", "item.minecraft.dark_oak_boat"),
      h(cwb.R, cwb.oj, "mangrove", "item.minecraft.mangrove_boat"),
      i(cwb.S, cwb.ol, "bamboo", "item.minecraft.bamboo_raft");

      private final String k;
      private final cvt l;
      private final cvt m;
      final xh n;
      public static final baf.a<cqh.b> j = baf.a(cqh.b::values);
      private static final IntFunction<cqh.b> o = aya.a(Enum::ordinal, values(), aya.a.a);

      private b(final cvt $$0, final cvt $$1, final String $$2, final String $$3) {
         this.k = $$2;
         this.l = $$0;
         this.m = $$1;
         this.n = xh.c($$3);
      }

      @Override
      public String c() {
         return this.k;
      }

      public String a() {
         return this.k;
      }

      public cvt b() {
         return this.l;
      }

      public cvt d() {
         return this.m;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cqh.b a(int $$0) {
         return o.apply($$0);
      }

      public static cqh.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
