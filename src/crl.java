import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class crl extends csf implements bvv {
   private static final aks<Boolean> h = akw.a(crl.class, aku.k);
   private static final aks<Boolean> i = akw.a(crl.class, aku.k);
   private static final aks<Integer> j = akw.a(crl.class, aku.b);
   public static final int a = 0;
   public static final int b = 1;
   private static final int k = 60;
   private static final float l = (float) (Math.PI / 8);
   public static final double c = (float) (Math.PI / 4);
   public static final int d = 60;
   private final float[] m = new float[2];
   private float n;
   private float o;
   private float p;
   private int q;
   private double r;
   private double s;
   private double t;
   private double u;
   private double ay;
   private boolean az;
   private boolean aA;
   private boolean aB;
   private boolean aC;
   private double aD;
   private float aE;
   private crl.a aF;
   private crl.a aG;
   private double aH;
   private boolean aI;
   private boolean aJ;
   private float aK;
   private float aL;
   private float aM;
   @Nullable
   private bvv.a aN;
   private final Supplier<cxc> aO;

   public crl(bvi<? extends crl> $$0, dgz $$1, Supplier<cxc> $$2) {
      super($$0, $$1);
      this.aO = $$2;
      this.I = true;
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.c;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(h, false);
      $$0.a(i, false);
      $$0.a(j, 0);
   }

   @Override
   public boolean i(bvb $$0) {
      return a(this, $$0);
   }

   public static boolean a(bvb $$0, bvb $$1) {
      return ($$1.bN() || $$1.bI()) && !$$0.z($$1);
   }

   @Override
   public boolean bN() {
      return true;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public fbr a(jm.a $$0, l.a $$1) {
      return bvx.j(super.a($$0, $$1));
   }

   protected abstract double b(bve var1);

   @Override
   protected fbr a(bvb $$0, bve $$1, float $$2) {
      float $$3 = this.s();
      if (this.cZ().size() > 1) {
         int $$4 = this.cZ().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cho) {
            $$3 += 0.2F;
         }
      }

      return new fbr(0.0, this.b($$1), (double)$$3).b(-this.dM() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dW().C) {
         this.aI = true;
         this.aJ = $$0;
         if (this.K() == 0) {
            this.m(60);
         }
      }

      this.dW().a(ls.ao, this.dB() + (double)this.ae.i(), this.dD() + 0.7, this.dH() + (double)this.ae.i(), 0.0, 0.0, 0.0);
      if (this.ae.a(20) == 0) {
         this.dW().a(this.dB(), this.dD(), this.dH(), this.aW(), this.dn(), 1.0F, 0.8F + 0.4F * this.ae.i(), false);
         this.a(eck.O, this.cX());
      }
   }

   @Override
   public void h(bvb $$0) {
      if ($$0 instanceof crl) {
         if ($$0.cR().b < this.cR().e) {
            super.h($$0);
         }
      } else if ($$0.cR().b <= this.cR().b) {
         super.h($$0);
      }
   }

   @Override
   public void p(float $$0) {
      this.l(-this.O());
      this.d(10);
      this.b(this.L() * 11.0F);
   }

   @Override
   public boolean bH() {
      return !this.dR();
   }

   @Override
   public void f_() {
      this.q = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.r = $$0;
      this.s = $$1;
      this.t = $$2;
      this.u = (double)$$3;
      this.ay = (double)$$4;
      this.q = $$5;
   }

   @Override
   public double R_() {
      return this.q > 0 ? this.r : this.dB();
   }

   @Override
   public double S_() {
      return this.q > 0 ? this.s : this.dD();
   }

   @Override
   public double g_() {
      return this.q > 0 ? this.t : this.dH();
   }

   @Override
   public float r_() {
      return this.q > 0 ? (float)this.ay : this.dO();
   }

   @Override
   public float h_() {
      return this.q > 0 ? (float)this.u : this.dM();
   }

   @Override
   public jm cP() {
      return this.cO().h();
   }

   @Override
   public void h() {
      this.aG = this.aF;
      this.aF = this.F();
      if (this.aF != crl.a.b && this.aF != crl.a.c) {
         this.o = 0.0F;
      } else {
         this.o++;
      }

      if (!this.dW().C && this.o >= 60.0F) {
         this.bP();
      }

      if (this.N() > 0) {
         this.d(this.N() - 1);
      }

      if (this.L() > 0.0F) {
         this.b(this.L() - 1.0F);
      }

      super.h();
      this.E();
      if (this.di()) {
         if (!(this.da() instanceof cpo)) {
            this.b(false, false);
         }

         this.I();
         if (this.dW().C) {
            this.J();
            this.dW().a(new aic(this.c(0), this.c(1)));
         }

         this.a(bwb.a, this.dz());
      } else {
         this.h(fbr.c);
      }

      this.aK();
      this.aK();
      this.D();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bb()
               && (double)(this.m[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.m[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awu $$1 = this.l();
               if ($$1 != null) {
                  fbr $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dW().a(null, this.dB() + $$3, this.dD(), this.dH() + $$4, $$1, this.dn(), 1.0F, 0.8F + 0.4F * this.ae.i());
               }
            }

            this.m[$$0] = this.m[$$0] + (float) (Math.PI / 8);
         } else {
            this.m[$$0] = 0.0F;
         }
      }

      List<bvb> $$5 = this.dW().a(this, this.cR().c(0.2F, -0.01F, 0.2F), bvg.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dW().C && !(this.cX() instanceof cpo);

         for (bvb $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6
                  && this.cZ().size() < this.t()
                  && !$$7.bZ()
                  && this.b($$7)
                  && $$7 instanceof bvx
                  && !($$7 instanceof ciq)
                  && !($$7 instanceof cpo)
                  && !($$7 instanceof cns)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void D() {
      if (this.dW().C) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aK += 0.05F;
         } else {
            this.aK -= 0.1F;
         }

         this.aK = azu.a(this.aK, 0.0F, 1.0F);
         this.aM = this.aL;
         this.aL = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dW().ad())) * this.aK;
      } else {
         if (!this.aI) {
            this.m(0);
         }

         int $$1 = this.K();
         if ($$1 > 0) {
            this.m(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.m(0);
               fbr $$3 = this.dz();
               if (this.aJ) {
                  this.h($$3.b(0.0, -0.7, 0.0));
                  this.bP();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cpo) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aI = false;
         }
      }
   }

   @Nullable
   protected awu l() {
      switch (this.F()) {
         case a:
         case b:
         case c:
            return awv.cm;
         case d:
            return awv.cl;
         case e:
         default:
            return null;
      }
   }

   private void E() {
      if (this.q > 0) {
         this.a(this.q, this.r, this.s, this.t, this.u, this.ay);
         this.q--;
      }
   }

   public void b(boolean $$0, boolean $$1) {
      this.al.a(h, $$0);
      this.al.a(i, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? azu.b(this.m[$$0] - (float) (Math.PI / 8), this.m[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public bvv.a T_() {
      return this.aN;
   }

   @Override
   public void a(@Nullable bvv.a $$0) {
      this.aN = $$0;
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.88F * this.cS()), (double)(this.dr() * 0.64F));
   }

   @Override
   public void b(bvb $$0, float $$1) {
      fbr $$2 = $$0.du().d(this.du()).d().c((double)$$1 - 6.0);
      fbr $$3 = this.dz();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.h($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private crl.a F() {
      crl.a $$0 = this.H();
      if ($$0 != null) {
         this.aD = this.cR().e;
         return $$0;
      } else if (this.G()) {
         return crl.a.a;
      } else {
         float $$1 = this.p();
         if ($$1 > 0.0F) {
            this.aE = $$1;
            return crl.a.d;
         } else {
            return crl.a.e;
         }
      }
   }

   public float m() {
      fbm $$0 = this.cR();
      int $$1 = azu.a($$0.a);
      int $$2 = azu.c($$0.d);
      int $$3 = azu.a($$0.e);
      int $$4 = azu.c($$0.e - this.aH);
      int $$5 = azu.a($$0.c);
      int $$6 = azu.c($$0.f);
      jh.a $$7 = new jh.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               etq $$12 = this.dW().b_($$7);
               if ($$12.a(axq.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dW(), $$7));
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
      fbm $$0 = this.cR();
      fbm $$1 = new fbm($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azu.a($$1.a) - 1;
      int $$3 = azu.c($$1.d) + 1;
      int $$4 = azu.a($$1.b) - 1;
      int $$5 = azu.c($$1.e) + 1;
      int $$6 = azu.a($$1.c) - 1;
      int $$7 = azu.c($$1.f) + 1;
      fcl $$8 = fci.a($$1);
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
                     dxo $$16 = this.dW().a_($$11);
                     if (!($$16.b() instanceof dtl) && fci.c($$16.g(this.dW(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, fbv.i)) {
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

   private boolean G() {
      fbm $$0 = this.cR();
      int $$1 = azu.a($$0.a);
      int $$2 = azu.c($$0.d);
      int $$3 = azu.a($$0.b);
      int $$4 = azu.c($$0.b + 0.001);
      int $$5 = azu.a($$0.c);
      int $$6 = azu.c($$0.f);
      boolean $$7 = false;
      this.aD = -Double.MAX_VALUE;
      jh.a $$8 = new jh.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               etq $$12 = this.dW().b_($$8);
               if ($$12.a(axq.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dW(), $$8);
                  this.aD = Math.max((double)$$13, this.aD);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private crl.a H() {
      fbm $$0 = this.cR();
      double $$1 = $$0.e + 0.001;
      int $$2 = azu.a($$0.a);
      int $$3 = azu.c($$0.d);
      int $$4 = azu.a($$0.e);
      int $$5 = azu.c($$1);
      int $$6 = azu.a($$0.c);
      int $$7 = azu.c($$0.f);
      boolean $$8 = false;
      jh.a $$9 = new jh.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               etq $$13 = this.dW().b_($$9);
               if ($$13.a(axq.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dW(), $$9))) {
                  if (!$$13.b()) {
                     return crl.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? crl.a.b : null;
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   private void I() {
      double $$0 = -this.be();
      double $$1 = 0.0;
      this.n = 0.05F;
      if (this.aG == crl.a.e && this.aF != crl.a.e && this.aF != crl.a.d) {
         this.aD = this.e(1.0);
         double $$2 = (double)(this.m() - this.ds()) + 0.101;
         if (this.dW().a(this, this.cR().d(0.0, $$2 - this.dD(), 0.0))) {
            this.a_(this.dB(), $$2, this.dH());
            this.h(this.dz().d(1.0, 0.0, 1.0));
            this.aH = 0.0;
         }

         this.aF = crl.a.a;
      } else {
         if (this.aF == crl.a.a) {
            $$1 = (this.aD - this.dD()) / (double)this.ds();
            this.n = 0.9F;
         } else if (this.aF == crl.a.c) {
            $$0 = -7.0E-4;
            this.n = 0.9F;
         } else if (this.aF == crl.a.b) {
            $$1 = 0.01F;
            this.n = 0.45F;
         } else if (this.aF == crl.a.e) {
            this.n = 0.9F;
         } else if (this.aF == crl.a.d) {
            this.n = this.aE;
            if (this.cX() instanceof cpo) {
               this.aE /= 2.0F;
            }
         }

         fbr $$3 = this.dz();
         this.n($$3.d * (double)this.n, $$3.e + $$0, $$3.f * (double)this.n);
         this.p = this.p * this.n;
         if ($$1 > 0.0) {
            fbr $$4 = this.dz();
            this.n($$4.d, ($$4.e + $$1 * (this.bd() / 0.65)) * 0.75, $$4.f);
         }
      }
   }

   private void J() {
      if (this.ca()) {
         float $$0 = 0.0F;
         if (this.az) {
            this.p--;
         }

         if (this.aA) {
            this.p++;
         }

         if (this.aA != this.az && !this.aB && !this.aC) {
            $$0 += 0.005F;
         }

         this.v(this.dM() + this.p);
         if (this.aB) {
            $$0 += 0.04F;
         }

         if (this.aC) {
            $$0 -= 0.005F;
         }

         this.h(this.dz().b((double)(azu.a(-this.dM() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azu.b(this.dM() * (float) (Math.PI / 180.0)) * $$0)));
         this.b(this.aA && !this.az || this.aB, this.az && !this.aA || this.aB);
      }
   }

   protected float s() {
      return 0.0F;
   }

   public boolean b(bvb $$0) {
      return $$0.dr() < this.dr();
   }

   @Override
   protected void a(bvb $$0, bvb.a $$1) {
      super.a($$0, $$1);
      if (!$$0.aq().a(axo.s)) {
         $$0.v($$0.dM() + this.p);
         $$0.q($$0.cA() + this.p);
         this.c($$0);
         if ($$0 instanceof cho && this.cZ().size() == this.t()) {
            int $$2 = $$0.ar() % 2 == 0 ? 90 : 270;
            $$0.r(((cho)$$0).aX + (float)$$2);
            $$0.q($$0.cA() + (float)$$2);
         }
      }
   }

   @Override
   public fbr b(bvx $$0) {
      fbr $$1 = a((double)(this.dr() * azu.g), (double)$$0.dr(), $$0.dM());
      double $$2 = this.dB() + $$1.d;
      double $$3 = this.dH() + $$1.f;
      jh $$4 = jh.a($$2, this.cR().e, $$3);
      jh $$5 = $$4.e();
      if (!this.dW().z($$5)) {
         List<fbr> $$6 = Lists.newArrayList();
         double $$7 = this.dW().j($$4);
         if (crt.a($$7)) {
            $$6.add(new fbr($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dW().j($$5);
         if (crt.a($$8)) {
            $$6.add(new fbr($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fO().iterator();

         while (var14.hasNext()) {
            bwj $$9 = (bwj)var14.next();

            for (fbr $$10 : $$6) {
               if (crt.a(this.dW(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bvb $$0) {
      $$0.r(this.dM());
      float $$1 = azu.h($$0.dM() - this.dM());
      float $$2 = azu.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.v($$0.dM() + $$2 - $$1);
      $$0.q($$0.dM());
   }

   @Override
   public void k(bvb $$0) {
      this.c($$0);
   }

   @Override
   protected void b(um $$0) {
      this.a($$0, this.aN);
   }

   @Override
   protected void a(um $$0) {
      this.aN = this.c($$0);
   }

   @Override
   public bta a(cpo $$0, bsz $$1) {
      bta $$2 = super.a($$0, $$1);
      if ($$2 != bta.e) {
         return $$2;
      } else {
         return (bta)($$0.fY() || !(this.o < 60.0F) || !this.dW().C && !$$0.n(this) ? bta.e : bta.a);
      }
   }

   @Override
   public void a(bvb.d $$0) {
      if (!this.dW().C && $$0.a() && this.P_()) {
         this.a(true, true);
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxo $$2, jh $$3) {
      this.aH = this.dz().e;
      if (!this.bZ()) {
         if ($$1) {
            this.k();
         } else if (!this.dW().b_(this.dw().e()).a(axq.a) && $$0 < 0.0) {
            this.Z -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.al.a($$0 == 0 ? h : i) && this.cX() != null;
   }

   private void m(int $$0) {
      this.al.a(j, $$0);
   }

   private int K() {
      return this.al.a(j);
   }

   public float a(float $$0) {
      return azu.h($$0, this.aM, this.aL);
   }

   @Override
   protected boolean r(bvb $$0) {
      return this.cZ().size() < this.t() && !this.a(axq.a);
   }

   protected int t() {
      return 2;
   }

   @Nullable
   @Override
   public bvx cX() {
      return this.da() instanceof bvx $$0 ? $$0 : super.cX();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.az = $$0;
      this.aA = $$1;
      this.aB = $$2;
      this.aC = $$3;
   }

   @Override
   public boolean bo() {
      return this.aF == crl.a.b || this.aF == crl.a.c;
   }

   @Override
   protected final cxc u() {
      return this.aO.get();
   }

   @Override
   public final cxg dJ() {
      return new cxg(this.aO.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
