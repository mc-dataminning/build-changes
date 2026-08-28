import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cqu extends cro implements bvf {
   private static final ajy<Boolean> h = akc.a(cqu.class, aka.k);
   private static final ajy<Boolean> i = akc.a(cqu.class, aka.k);
   private static final ajy<Integer> j = akc.a(cqu.class, aka.b);
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
   private cqu.a aF;
   private cqu.a aG;
   private double aH;
   private boolean aI;
   private boolean aJ;
   private float aK;
   private float aL;
   private float aM;
   @Nullable
   private bvf.a aN;
   private final Supplier<cwl> aO;

   public cqu(bus<? extends cqu> $$0, dgi $$1, Supplier<cwl> $$2) {
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
   protected bul.c bg() {
      return bul.c.c;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(h, false);
      $$0.a(i, false);
      $$0.a(j, 0);
   }

   @Override
   public boolean i(bul $$0) {
      return a(this, $$0);
   }

   public static boolean a(bul $$0, bul $$1) {
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
   public fba a(jn.a $$0, l.a $$1) {
      return bvh.k(super.a($$0, $$1));
   }

   protected abstract double b(buo var1);

   @Override
   protected fba a(bul $$0, buo $$1, float $$2) {
      float $$3 = this.s();
      if (this.cY().size() > 1) {
         int $$4 = this.cY().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cgy) {
            $$3 += 0.2F;
         }
      }

      return new fba(0.0, this.b($$1), (double)$$3).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dV().C) {
         this.aI = true;
         this.aJ = $$0;
         if (this.R() == 0) {
            this.m(60);
         }
      }

      this.dV().a(lt.ao, this.dA() + (double)this.ae.i(), this.dC() + 0.7, this.dG() + (double)this.ae.i(), 0.0, 0.0, 0.0);
      if (this.ae.a(20) == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), this.aW(), this.dm(), 1.0F, 0.8F + 0.4F * this.ae.i(), false);
         this.a(ebt.O, this.cW());
      }
   }

   @Override
   public void h(bul $$0) {
      if ($$0 instanceof cqu) {
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
      return !this.dQ();
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
      return this.q > 0 ? this.r : this.dA();
   }

   @Override
   public double S_() {
      return this.q > 0 ? this.s : this.dC();
   }

   @Override
   public double g_() {
      return this.q > 0 ? this.t : this.dG();
   }

   @Override
   public float r_() {
      return this.q > 0 ? (float)this.ay : this.dN();
   }

   @Override
   public float h_() {
      return this.q > 0 ? (float)this.u : this.dL();
   }

   @Override
   public jn cP() {
      return this.cO().h();
   }

   @Override
   public void h() {
      this.aG = this.aF;
      this.aF = this.I();
      if (this.aF != cqu.a.b && this.aF != cqu.a.c) {
         this.o = 0.0F;
      } else {
         this.o++;
      }

      if (!this.dV().C && this.o >= 60.0F) {
         this.bP();
      }

      if (this.N() > 0) {
         this.d(this.N() - 1);
      }

      if (this.L() > 0.0F) {
         this.b(this.L() - 1.0F);
      }

      super.h();
      this.H();
      if (this.dh()) {
         if (!(this.cZ() instanceof cox)) {
            this.a(false, false);
         }

         this.P();
         if (this.dV().C) {
            this.Q();
            this.dV().a(new ahh(this.c(0), this.c(1)));
         }

         this.a(bvl.a, this.dy());
      } else {
         this.i(fba.c);
      }

      this.aK();
      this.aK();
      this.G();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bb()
               && (double)(this.m[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.m[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avz $$1 = this.l();
               if ($$1 != null) {
                  fba $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dV().a(null, this.dA() + $$3, this.dC(), this.dG() + $$4, $$1, this.dm(), 1.0F, 0.8F + 0.4F * this.ae.i());
               }
            }

            this.m[$$0] = this.m[$$0] + (float) (Math.PI / 8);
         } else {
            this.m[$$0] = 0.0F;
         }
      }

      List<bul> $$5 = this.dV().a(this, this.cR().c(0.2F, -0.01F, 0.2F), buq.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dV().C && !(this.cW() instanceof cox);

         for (bul $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6
                  && this.cY().size() < this.t()
                  && !$$7.bZ()
                  && this.b($$7)
                  && $$7 instanceof bvh
                  && !($$7 instanceof cia)
                  && !($$7 instanceof cox)
                  && !($$7 instanceof cnc)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void G() {
      if (this.dV().C) {
         int $$0 = this.R();
         if ($$0 > 0) {
            this.aK += 0.05F;
         } else {
            this.aK -= 0.1F;
         }

         this.aK = ayz.a(this.aK, 0.0F, 1.0F);
         this.aM = this.aL;
         this.aL = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dV().ad())) * this.aK;
      } else {
         if (!this.aI) {
            this.m(0);
         }

         int $$1 = this.R();
         if ($$1 > 0) {
            this.m(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.m(0);
               fba $$3 = this.dy();
               if (this.aJ) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bP();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cox) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aI = false;
         }
      }
   }

   @Nullable
   protected avz l() {
      switch (this.I()) {
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

   private void H() {
      if (this.q > 0) {
         this.a(this.q, this.r, this.s, this.t, this.u, this.ay);
         this.q--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.al.a(h, $$0);
      this.al.a(i, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? ayz.b(this.m[$$0] - (float) (Math.PI / 8), this.m[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public bvf.a T_() {
      return this.aN;
   }

   @Override
   public void a(@Nullable bvf.a $$0) {
      this.aN = $$0;
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.88F * this.cS()), (double)(this.dq() * 0.64F));
   }

   @Override
   public void b(bul $$0, float $$1) {
      fba $$2 = $$0.dt().d(this.dt()).d().c((double)$$1 - 6.0);
      fba $$3 = this.dy();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.i($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cqu.a I() {
      cqu.a $$0 = this.K();
      if ($$0 != null) {
         this.aD = this.cR().e;
         return $$0;
      } else if (this.J()) {
         return cqu.a.a;
      } else {
         float $$1 = this.p();
         if ($$1 > 0.0F) {
            this.aE = $$1;
            return cqu.a.d;
         } else {
            return cqu.a.e;
         }
      }
   }

   public float m() {
      fav $$0 = this.cR();
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.e);
      int $$4 = ayz.c($$0.e - this.aH);
      int $$5 = ayz.a($$0.c);
      int $$6 = ayz.c($$0.f);
      ji.a $$7 = new ji.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               esz $$12 = this.dV().b_($$7);
               if ($$12.a(awv.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dV(), $$7));
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
      fav $$0 = this.cR();
      fav $$1 = new fav($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayz.a($$1.a) - 1;
      int $$3 = ayz.c($$1.d) + 1;
      int $$4 = ayz.a($$1.b) - 1;
      int $$5 = ayz.c($$1.e) + 1;
      int $$6 = ayz.a($$1.c) - 1;
      int $$7 = ayz.c($$1.f) + 1;
      fbu $$8 = fbr.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      ji.a $$11 = new ji.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dwx $$16 = this.dV().a_($$11);
                     if (!($$16.b() instanceof dsu) && fbr.c($$16.g(this.dV(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, fbe.i)) {
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

   private boolean J() {
      fav $$0 = this.cR();
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.b);
      int $$4 = ayz.c($$0.b + 0.001);
      int $$5 = ayz.a($$0.c);
      int $$6 = ayz.c($$0.f);
      boolean $$7 = false;
      this.aD = -Double.MAX_VALUE;
      ji.a $$8 = new ji.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               esz $$12 = this.dV().b_($$8);
               if ($$12.a(awv.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dV(), $$8);
                  this.aD = Math.max((double)$$13, this.aD);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cqu.a K() {
      fav $$0 = this.cR();
      double $$1 = $$0.e + 0.001;
      int $$2 = ayz.a($$0.a);
      int $$3 = ayz.c($$0.d);
      int $$4 = ayz.a($$0.e);
      int $$5 = ayz.c($$1);
      int $$6 = ayz.a($$0.c);
      int $$7 = ayz.c($$0.f);
      boolean $$8 = false;
      ji.a $$9 = new ji.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               esz $$13 = this.dV().b_($$9);
               if ($$13.a(awv.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dV(), $$9))) {
                  if (!$$13.b()) {
                     return cqu.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cqu.a.b : null;
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   private void P() {
      double $$0 = -this.be();
      double $$1 = 0.0;
      this.n = 0.05F;
      if (this.aG == cqu.a.e && this.aF != cqu.a.e && this.aF != cqu.a.d) {
         this.aD = this.e(1.0);
         double $$2 = (double)(this.m() - this.dr()) + 0.101;
         if (this.dV().a(this, this.cR().d(0.0, $$2 - this.dC(), 0.0))) {
            this.a_(this.dA(), $$2, this.dG());
            this.i(this.dy().d(1.0, 0.0, 1.0));
            this.aH = 0.0;
         }

         this.aF = cqu.a.a;
      } else {
         if (this.aF == cqu.a.a) {
            $$1 = (this.aD - this.dC()) / (double)this.dr();
            this.n = 0.9F;
         } else if (this.aF == cqu.a.c) {
            $$0 = -7.0E-4;
            this.n = 0.9F;
         } else if (this.aF == cqu.a.b) {
            $$1 = 0.01F;
            this.n = 0.45F;
         } else if (this.aF == cqu.a.e) {
            this.n = 0.9F;
         } else if (this.aF == cqu.a.d) {
            this.n = this.aE;
            if (this.cW() instanceof cox) {
               this.aE /= 2.0F;
            }
         }

         fba $$3 = this.dy();
         this.n($$3.d * (double)this.n, $$3.e + $$0, $$3.f * (double)this.n);
         this.p = this.p * this.n;
         if ($$1 > 0.0) {
            fba $$4 = this.dy();
            this.n($$4.d, ($$4.e + $$1 * (this.bd() / 0.65)) * 0.75, $$4.f);
         }
      }
   }

   private void Q() {
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

         this.v(this.dL() + this.p);
         if (this.aB) {
            $$0 += 0.04F;
         }

         if (this.aC) {
            $$0 -= 0.005F;
         }

         this.i(this.dy().b((double)(ayz.a(-this.dL() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayz.b(this.dL() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aA && !this.az || this.aB, this.az && !this.aA || this.aB);
      }
   }

   protected float s() {
      return 0.0F;
   }

   public boolean b(bul $$0) {
      return $$0.dq() < this.dq();
   }

   @Override
   protected void a(bul $$0, bul.a $$1) {
      super.a($$0, $$1);
      if (!$$0.aq().a(awt.s)) {
         $$0.v($$0.dL() + this.p);
         $$0.q($$0.cA() + this.p);
         this.c($$0);
         if ($$0 instanceof cgy && this.cY().size() == this.t()) {
            int $$2 = $$0.ar() % 2 == 0 ? 90 : 270;
            $$0.r(((cgy)$$0).aX + (float)$$2);
            $$0.q($$0.cA() + (float)$$2);
         }
      }
   }

   @Override
   public fba b(bvh $$0) {
      fba $$1 = a((double)(this.dq() * ayz.g), (double)$$0.dq(), $$0.dL());
      double $$2 = this.dA() + $$1.d;
      double $$3 = this.dG() + $$1.f;
      ji $$4 = ji.a($$2, this.cR().e, $$3);
      ji $$5 = $$4.e();
      if (!this.dV().z($$5)) {
         List<fba> $$6 = Lists.newArrayList();
         double $$7 = this.dV().j($$4);
         if (crc.a($$7)) {
            $$6.add(new fba($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dV().j($$5);
         if (crc.a($$8)) {
            $$6.add(new fba($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fO().iterator();

         while (var14.hasNext()) {
            bvt $$9 = (bvt)var14.next();

            for (fba $$10 : $$6) {
               if (crc.a(this.dV(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bul $$0) {
      $$0.r(this.dL());
      float $$1 = ayz.h($$0.dL() - this.dL());
      float $$2 = ayz.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.v($$0.dL() + $$2 - $$1);
      $$0.q($$0.dL());
   }

   @Override
   public void k(bul $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tq $$0) {
      this.a($$0, this.aN);
   }

   @Override
   protected void a(tq $$0) {
      this.c($$0);
   }

   @Override
   public bsk a(cox $$0, bsj $$1) {
      bsk $$2 = super.a($$0, $$1);
      if ($$2 != bsk.e) {
         return $$2;
      } else {
         return (bsk)($$0.fY() || !(this.o < 60.0F) || !this.dV().C && !$$0.n(this) ? bsk.e : bsk.a);
      }
   }

   @Override
   public void a(bul.d $$0) {
      if (!this.dV().C && $$0.a() && this.P_()) {
         this.z();
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
      this.aH = this.dy().e;
      if (!this.bZ()) {
         if ($$1) {
            this.k();
         } else if (!this.dV().b_(this.dv().e()).a(awv.a) && $$0 < 0.0) {
            this.Z -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.al.a($$0 == 0 ? h : i) && this.cW() != null;
   }

   private void m(int $$0) {
      this.al.a(j, $$0);
   }

   private int R() {
      return this.al.a(j);
   }

   public float a(float $$0) {
      return ayz.h($$0, this.aM, this.aL);
   }

   @Override
   protected boolean r(bul $$0) {
      return this.cY().size() < this.t() && !this.a(awv.a);
   }

   protected int t() {
      return 2;
   }

   @Nullable
   @Override
   public bvh cW() {
      return this.cZ() instanceof bvh $$0 ? $$0 : super.cW();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.az = $$0;
      this.aA = $$1;
      this.aB = $$2;
      this.aC = $$3;
   }

   @Override
   public boolean bo() {
      return this.aF == cqu.a.b || this.aF == cqu.a.c;
   }

   @Override
   protected final cwl u() {
      return this.aO.get();
   }

   @Override
   public final cwp dI() {
      return new cwp(this.aO.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
