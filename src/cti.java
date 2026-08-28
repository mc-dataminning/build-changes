import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cti extends cuc implements bxa {
   private static final akj<Boolean> h = akn.a(cti.class, akl.k);
   private static final akj<Boolean> i = akn.a(cti.class, akl.k);
   private static final akj<Integer> j = akn.a(cti.class, akl.b);
   public static final int a = 0;
   public static final int b = 1;
   private static final int k = 60;
   private static final float l = (float) (Math.PI / 8);
   public static final double c = (float) (Math.PI / 4);
   public static final int d = 60;
   private final float[] m = new float[2];
   private float n;
   private float o;
   private final bwx p = new bwx(this, 3);
   private boolean q;
   private boolean r;
   private boolean s;
   private boolean t;
   private double u;
   private float ay;
   private cti.a az;
   private cti.a aA;
   private double aB;
   private boolean aC;
   private boolean aD;
   private float aE;
   private float aF;
   private float aG;
   @Nullable
   private bxa.a aH;
   private final Supplier<cyu> aI;

   public cti(bwm<? extends cti> $$0, div $$1, Supplier<cyu> $$2) {
      super($$0, $$1);
      this.aI = $$2;
      this.I = true;
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.c;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(h, false);
      $$0.a(i, false);
      $$0.a(j, 0);
   }

   @Override
   public boolean i(bwd $$0) {
      return a(this, $$0);
   }

   public static boolean a(bwd $$0, bwd $$1) {
      return ($$1.bM() || $$1.bH()) && !$$0.z($$1);
   }

   @Override
   public boolean bM() {
      return true;
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public fei a(ja.a $$0, l.a $$1) {
      return bxc.k(super.a($$0, $$1));
   }

   protected abstract double b(bwg var1);

   @Override
   protected fei a(bwd $$0, bwg $$1, float $$2) {
      float $$3 = this.m();
      if (this.cY().size() > 1) {
         int $$4 = this.cY().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cis) {
            $$3 += 0.2F;
         }
      }

      return new fei(0.0, this.b($$1), (double)$$3).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public void a(boolean $$0, iu $$1) {
      if (this.dV() instanceof arq) {
         this.aC = true;
         this.aD = $$0;
         if (this.K() == 0) {
            this.m(60);
         }
      }

      if (!this.bn() && this.ae.a(100) == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), this.aW(), this.dm(), 1.0F, 0.8F + 0.4F * this.ae.i(), false);
         this.dV().a(lx.ap, this.dA() + (double)this.ae.i(), this.dC() + 0.7, this.dG() + (double)this.ae.i(), 0.0, 0.0, 0.0);
         this.a(eez.O, this.cW());
      }
   }

   @Override
   public void h(bwd $$0) {
      if ($$0 instanceof cti) {
         if ($$0.cR().b < this.cR().e) {
            super.h($$0);
         }
      } else if ($$0.cR().b <= this.cR().b) {
         super.h($$0);
      }
   }

   @Override
   public void q(float $$0) {
      this.l(-this.J());
      this.d(10);
      this.b(this.H() * 11.0F);
   }

   @Override
   public boolean bG() {
      return !this.dQ();
   }

   @Override
   public bwx N_() {
      return this.p;
   }

   @Override
   public ja cP() {
      return this.cO().h();
   }

   @Override
   public void h() {
      this.aA = this.az;
      this.az = this.x();
      if (this.az != cti.a.b && this.az != cti.a.c) {
         this.n = 0.0F;
      } else {
         this.n++;
      }

      if (!this.dV().C && this.n >= 60.0F) {
         this.bO();
      }

      if (this.I() > 0) {
         this.d(this.I() - 1);
      }

      if (this.H() > 0.0F) {
         this.b(this.H() - 1.0F);
      }

      super.h();
      this.p.e();
      if (this.dg()) {
         if (!(this.cZ() instanceof cqy)) {
            this.a(false, false);
         }

         this.F();
         if (this.dV().C) {
            this.G();
            this.dV().a(new ahq(this.c(0), this.c(1)));
         }

         this.a(bxg.a, this.dy());
      } else {
         this.i(fei.c);
      }

      this.aK();
      this.aK();
      this.v();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bb()
               && (double)(this.m[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.m[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awm $$1 = this.f();
               if ($$1 != null) {
                  fei $$2 = this.h(1.0F);
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

      List<bwd> $$5 = this.dV().a(this, this.cR().c(0.2F, -0.01F, 0.2F), bwk.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dV().C && !(this.cW() instanceof cqy);

         for (bwd $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6
                  && this.cY().size() < this.n()
                  && !$$7.bZ()
                  && this.b($$7)
                  && $$7 instanceof bxc
                  && !($$7 instanceof cjz)
                  && !($$7 instanceof cqy)
                  && !($$7 instanceof cpe)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void v() {
      if (this.dV().C) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aE += 0.05F;
         } else {
            this.aE -= 0.1F;
         }

         this.aE = azm.a(this.aE, 0.0F, 1.0F);
         this.aG = this.aF;
         this.aF = 10.0F * (float)Math.sin(0.5 * (double)this.af) * this.aE;
      } else {
         if (!this.aC) {
            this.m(0);
         }

         int $$1 = this.K();
         if ($$1 > 0) {
            this.m(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.m(0);
               fei $$3 = this.dy();
               if (this.aD) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bO();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cqy) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aC = false;
         }
      }
   }

   @Nullable
   protected awm f() {
      return switch (this.x()) {
         case a, b, c -> awn.cm;
         case d -> awn.cl;
         default -> null;
      };
   }

   public void a(boolean $$0, boolean $$1) {
      this.al.a(h, $$0);
      this.al.a(i, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? azm.b(this.m[$$0] - (float) (Math.PI / 8), this.m[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public bxa.a T_() {
      return this.aH;
   }

   @Override
   public void a(@Nullable bxa.a $$0) {
      this.aH = $$0;
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.88F * this.cS()), (double)(this.dq() * 0.64F));
   }

   @Override
   public void b(bwd $$0, float $$1) {
      fei $$2 = $$0.dt().d(this.dt()).d().c((double)$$1 - 6.0);
      fei $$3 = this.dy();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.i($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cti.a x() {
      cti.a $$0 = this.E();
      if ($$0 != null) {
         this.u = this.cR().e;
         return $$0;
      } else if (this.D()) {
         return cti.a.a;
      } else {
         float $$1 = this.j();
         if ($$1 > 0.0F) {
            this.ay = $$1;
            return cti.a.d;
         } else {
            return cti.a.e;
         }
      }
   }

   public float g() {
      fed $$0 = this.cR();
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.e);
      int $$4 = azm.c($$0.e - this.aB);
      int $$5 = azm.a($$0.c);
      int $$6 = azm.c($$0.f);
      iu.a $$7 = new iu.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ewg $$12 = this.dV().b_($$7);
               if ($$12.a(axh.a)) {
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

   public float j() {
      fed $$0 = this.cR();
      fed $$1 = new fed($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azm.a($$1.a) - 1;
      int $$3 = azm.c($$1.d) + 1;
      int $$4 = azm.a($$1.b) - 1;
      int $$5 = azm.c($$1.e) + 1;
      int $$6 = azm.a($$1.c) - 1;
      int $$7 = azm.c($$1.f) + 1;
      ffc $$8 = fez.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      iu.a $$11 = new iu.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dzz $$16 = this.dV().a_($$11);
                     if (!($$16.b() instanceof dvr) && fez.c($$16.g(this.dV(), $$11).a($$11), $$8, fem.i)) {
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

   private boolean D() {
      fed $$0 = this.cR();
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.b);
      int $$4 = azm.c($$0.b + 0.001);
      int $$5 = azm.a($$0.c);
      int $$6 = azm.c($$0.f);
      boolean $$7 = false;
      this.u = -Double.MAX_VALUE;
      iu.a $$8 = new iu.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ewg $$12 = this.dV().b_($$8);
               if ($$12.a(axh.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dV(), $$8);
                  this.u = Math.max((double)$$13, this.u);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cti.a E() {
      fed $$0 = this.cR();
      double $$1 = $$0.e + 0.001;
      int $$2 = azm.a($$0.a);
      int $$3 = azm.c($$0.d);
      int $$4 = azm.a($$0.e);
      int $$5 = azm.c($$1);
      int $$6 = azm.a($$0.c);
      int $$7 = azm.c($$0.f);
      boolean $$8 = false;
      iu.a $$9 = new iu.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ewg $$13 = this.dV().b_($$9);
               if ($$13.a(axh.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dV(), $$9))) {
                  if (!$$13.b()) {
                     return cti.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cti.a.b : null;
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   private void F() {
      double $$0 = -this.be();
      double $$1 = 0.0;
      float $$2 = 0.05F;
      if (this.aA == cti.a.e && this.az != cti.a.e && this.az != cti.a.d) {
         this.u = this.e(1.0);
         double $$3 = (double)(this.g() - this.dr()) + 0.101;
         if (this.dV().a(this, this.cR().d(0.0, $$3 - this.dC(), 0.0))) {
            this.a_(this.dA(), $$3, this.dG());
            this.i(this.dy().d(1.0, 0.0, 1.0));
            this.aB = 0.0;
         }

         this.az = cti.a.a;
      } else {
         if (this.az == cti.a.a) {
            $$1 = (this.u - this.dC()) / (double)this.dr();
            $$2 = 0.9F;
         } else if (this.az == cti.a.c) {
            $$0 = -7.0E-4;
            $$2 = 0.9F;
         } else if (this.az == cti.a.b) {
            $$1 = 0.01F;
            $$2 = 0.45F;
         } else if (this.az == cti.a.e) {
            $$2 = 0.9F;
         } else if (this.az == cti.a.d) {
            $$2 = this.ay;
            if (this.cW() instanceof cqy) {
               this.ay /= 2.0F;
            }
         }

         fei $$4 = this.dy();
         this.n($$4.d * (double)$$2, $$4.e + $$0, $$4.f * (double)$$2);
         this.o *= $$2;
         if ($$1 > 0.0) {
            fei $$5 = this.dy();
            this.n($$5.d, ($$5.e + $$1 * (this.bd() / 0.65)) * 0.75, $$5.f);
         }
      }
   }

   private void G() {
      if (this.ca()) {
         float $$0 = 0.0F;
         if (this.q) {
            this.o--;
         }

         if (this.r) {
            this.o++;
         }

         if (this.r != this.q && !this.s && !this.t) {
            $$0 += 0.005F;
         }

         this.w(this.dL() + this.o);
         if (this.s) {
            $$0 += 0.04F;
         }

         if (this.t) {
            $$0 -= 0.005F;
         }

         this.i(this.dy().b((double)(azm.a(-this.dL() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azm.b(this.dL() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.r && !this.q || this.s, this.q && !this.r || this.s);
      }
   }

   protected float m() {
      return 0.0F;
   }

   public boolean b(bwd $$0) {
      return $$0.dq() < this.dq();
   }

   @Override
   protected void a(bwd $$0, bwd.b $$1) {
      super.a($$0, $$1);
      if (!$$0.aq().a(axf.s)) {
         $$0.w($$0.dL() + this.o);
         $$0.r($$0.cA() + this.o);
         this.c($$0);
         if ($$0 instanceof cis && this.cY().size() == this.n()) {
            int $$2 = $$0.ar() % 2 == 0 ? 90 : 270;
            $$0.s(((cis)$$0).aV + (float)$$2);
            $$0.r($$0.cA() + (float)$$2);
         }
      }
   }

   @Override
   public fei b(bxc $$0) {
      fei $$1 = a((double)(this.dq() * azm.g), (double)$$0.dq(), $$0.dL());
      double $$2 = this.dA() + $$1.d;
      double $$3 = this.dG() + $$1.f;
      iu $$4 = iu.a($$2, this.cR().e, $$3);
      iu $$5 = $$4.e();
      if (!this.dV().A($$5)) {
         List<fei> $$6 = Lists.newArrayList();
         double $$7 = this.dV().j($$4);
         if (ctq.a($$7)) {
            $$6.add(new fei($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dV().j($$5);
         if (ctq.a($$8)) {
            $$6.add(new fei($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fN().iterator();

         while (var14.hasNext()) {
            bxo $$9 = (bxo)var14.next();

            for (fei $$10 : $$6) {
               if (ctq.a(this.dV(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bwd $$0) {
      $$0.s(this.dL());
      float $$1 = azm.h($$0.dL() - this.dL());
      float $$2 = azm.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.w($$0.dL() + $$2 - $$1);
      $$0.r($$0.dL());
   }

   @Override
   public void k(bwd $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tz $$0) {
      this.a($$0, this.aH);
   }

   @Override
   protected void a(tz $$0) {
      this.c($$0);
   }

   @Override
   public bub a(cqy $$0, bua $$1) {
      bub $$2 = super.a($$0, $$1);
      if ($$2 != bub.e) {
         return $$2;
      } else {
         return (bub)($$0.fX() || !(this.n < 60.0F) || !this.dV().C && !$$0.n(this) ? bub.e : bub.a);
      }
   }

   @Override
   public void a(bwd.e $$0) {
      if (!this.dV().C && $$0.a() && this.O_()) {
         this.y();
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
      this.aB = this.dy().e;
      if (!this.bZ()) {
         if ($$1) {
            this.k();
         } else if (!this.dV().b_(this.dv().e()).a(axh.a) && $$0 < 0.0) {
            this.Z -= (double)((float)$$0);
         }
      }
   }

   public boolean c(int $$0) {
      return this.al.a($$0 == 0 ? h : i) && this.cW() != null;
   }

   private void m(int $$0) {
      this.al.a(j, $$0);
   }

   private int K() {
      return this.al.a(j);
   }

   public float a(float $$0) {
      return azm.h($$0, this.aG, this.aF);
   }

   @Override
   protected boolean r(bwd $$0) {
      return this.cY().size() < this.n() && !this.a(axh.a);
   }

   protected int n() {
      return 2;
   }

   @Nullable
   @Override
   public bxc cW() {
      return this.cZ() instanceof bxc $$0 ? $$0 : super.cW();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;
   }

   @Override
   public boolean bn() {
      return this.az == cti.a.b || this.az == cti.a.c;
   }

   @Override
   protected final cyu o() {
      return this.aI.get();
   }

   @Override
   public final cyy dI() {
      return new cyy(this.aI.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
