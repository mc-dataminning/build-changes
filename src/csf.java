import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class csf extends csz implements bwp {
   private static final akg<Boolean> h = akk.a(csf.class, aki.k);
   private static final akg<Boolean> i = akk.a(csf.class, aki.k);
   private static final akg<Integer> j = akk.a(csf.class, aki.b);
   public static final int a = 0;
   public static final int b = 1;
   private static final int k = 60;
   private static final float l = (float) (Math.PI / 8);
   public static final double c = (float) (Math.PI / 4);
   public static final int d = 60;
   private final float[] m = new float[2];
   private float n;
   private float o;
   private final bwm p = new bwm(this, 3);
   private boolean q;
   private boolean r;
   private boolean s;
   private boolean t;
   private double u;
   private float ay;
   private csf.a az;
   private csf.a aA;
   private double aB;
   private boolean aC;
   private boolean aD;
   private float aE;
   private float aF;
   private float aG;
   @Nullable
   private bwp.a aH;
   private final Supplier<cxu> aI;

   public csf(bwb<? extends csf> $$0, dhp $$1, Supplier<cxu> $$2) {
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
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(h, false);
      $$0.a(i, false);
      $$0.a(j, 0);
   }

   @Override
   public boolean i(bvs $$0) {
      return a(this, $$0);
   }

   public static boolean a(bvs $$0, bvs $$1) {
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
   public fcu a(jo.a $$0, l.a $$1) {
      return bwr.k(super.a($$0, $$1));
   }

   protected abstract double b(bvv var1);

   @Override
   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      float $$3 = this.m();
      if (this.cY().size() > 1) {
         int $$4 = this.cY().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cig) {
            $$3 += 0.2F;
         }
      }

      return new fcu(0.0, this.b($$1), (double)$$3).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public void a(boolean $$0, jj $$1) {
      if (this.dV() instanceof arn) {
         this.aC = true;
         this.aD = $$0;
         if (this.K() == 0) {
            this.m(60);
         }
      }

      if (!this.bn() && this.ae.a(100) == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), this.aW(), this.dm(), 1.0F, 0.8F + 0.4F * this.ae.i(), false);
         this.dV().a(lv.ap, this.dA() + (double)this.ae.i(), this.dC() + 0.7, this.dG() + (double)this.ae.i(), 0.0, 0.0, 0.0);
         this.a(edm.O, this.cW());
      }
   }

   @Override
   public void h(bvs $$0) {
      if ($$0 instanceof csf) {
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
   public bwm N_() {
      return this.p;
   }

   @Override
   public jo cP() {
      return this.cO().h();
   }

   @Override
   public void h() {
      this.aA = this.az;
      this.az = this.x();
      if (this.az != csf.a.b && this.az != csf.a.c) {
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
         if (!(this.cZ() instanceof cqi)) {
            this.a(false, false);
         }

         this.F();
         if (this.dV().C) {
            this.G();
            this.dV().a(new ahn(this.c(0), this.c(1)));
         }

         this.a(bwv.a, this.dy());
      } else {
         this.i(fcu.c);
      }

      this.aK();
      this.aK();
      this.v();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bb()
               && (double)(this.m[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.m[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awj $$1 = this.f();
               if ($$1 != null) {
                  fcu $$2 = this.h(1.0F);
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

      List<bvs> $$5 = this.dV().a(this, this.cR().c(0.2F, -0.01F, 0.2F), bvz.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dV().C && !(this.cW() instanceof cqi);

         for (bvs $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6
                  && this.cY().size() < this.n()
                  && !$$7.bZ()
                  && this.b($$7)
                  && $$7 instanceof bwr
                  && !($$7 instanceof cjl)
                  && !($$7 instanceof cqi)
                  && !($$7 instanceof coo)) {
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

         this.aE = azk.a(this.aE, 0.0F, 1.0F);
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
               fcu $$3 = this.dy();
               if (this.aD) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bO();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cqi) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aC = false;
         }
      }
   }

   @Nullable
   protected awj f() {
      return switch (this.x()) {
         case a, b, c -> awk.cm;
         case d -> awk.cl;
         default -> null;
      };
   }

   public void a(boolean $$0, boolean $$1) {
      this.al.a(h, $$0);
      this.al.a(i, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? azk.b(this.m[$$0] - (float) (Math.PI / 8), this.m[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public bwp.a T_() {
      return this.aH;
   }

   @Override
   public void a(@Nullable bwp.a $$0) {
      this.aH = $$0;
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.88F * this.cS()), (double)(this.dq() * 0.64F));
   }

   @Override
   public void b(bvs $$0, float $$1) {
      fcu $$2 = $$0.dt().d(this.dt()).d().c((double)$$1 - 6.0);
      fcu $$3 = this.dy();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.i($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private csf.a x() {
      csf.a $$0 = this.E();
      if ($$0 != null) {
         this.u = this.cR().e;
         return $$0;
      } else if (this.D()) {
         return csf.a.a;
      } else {
         float $$1 = this.j();
         if ($$1 > 0.0F) {
            this.ay = $$1;
            return csf.a.d;
         } else {
            return csf.a.e;
         }
      }
   }

   public float g() {
      fcp $$0 = this.cR();
      int $$1 = azk.a($$0.a);
      int $$2 = azk.c($$0.d);
      int $$3 = azk.a($$0.e);
      int $$4 = azk.c($$0.e - this.aB);
      int $$5 = azk.a($$0.c);
      int $$6 = azk.c($$0.f);
      jj.a $$7 = new jj.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eut $$12 = this.dV().b_($$7);
               if ($$12.a(axf.a)) {
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
      fcp $$0 = this.cR();
      fcp $$1 = new fcp($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azk.a($$1.a) - 1;
      int $$3 = azk.c($$1.d) + 1;
      int $$4 = azk.a($$1.b) - 1;
      int $$5 = azk.c($$1.e) + 1;
      int $$6 = azk.a($$1.c) - 1;
      int $$7 = azk.c($$1.f) + 1;
      fdo $$8 = fdl.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      jj.a $$11 = new jj.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dym $$16 = this.dV().a_($$11);
                     if (!($$16.b() instanceof duf) && fdl.c($$16.g(this.dV(), $$11).a($$11), $$8, fcy.i)) {
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
      fcp $$0 = this.cR();
      int $$1 = azk.a($$0.a);
      int $$2 = azk.c($$0.d);
      int $$3 = azk.a($$0.b);
      int $$4 = azk.c($$0.b + 0.001);
      int $$5 = azk.a($$0.c);
      int $$6 = azk.c($$0.f);
      boolean $$7 = false;
      this.u = -Double.MAX_VALUE;
      jj.a $$8 = new jj.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eut $$12 = this.dV().b_($$8);
               if ($$12.a(axf.a)) {
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
   private csf.a E() {
      fcp $$0 = this.cR();
      double $$1 = $$0.e + 0.001;
      int $$2 = azk.a($$0.a);
      int $$3 = azk.c($$0.d);
      int $$4 = azk.a($$0.e);
      int $$5 = azk.c($$1);
      int $$6 = azk.a($$0.c);
      int $$7 = azk.c($$0.f);
      boolean $$8 = false;
      jj.a $$9 = new jj.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eut $$13 = this.dV().b_($$9);
               if ($$13.a(axf.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dV(), $$9))) {
                  if (!$$13.b()) {
                     return csf.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? csf.a.b : null;
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   private void F() {
      double $$0 = -this.be();
      double $$1 = 0.0;
      float $$2 = 0.05F;
      if (this.aA == csf.a.e && this.az != csf.a.e && this.az != csf.a.d) {
         this.u = this.e(1.0);
         double $$3 = (double)(this.g() - this.dr()) + 0.101;
         if (this.dV().a(this, this.cR().d(0.0, $$3 - this.dC(), 0.0))) {
            this.a_(this.dA(), $$3, this.dG());
            this.i(this.dy().d(1.0, 0.0, 1.0));
            this.aB = 0.0;
         }

         this.az = csf.a.a;
      } else {
         if (this.az == csf.a.a) {
            $$1 = (this.u - this.dC()) / (double)this.dr();
            $$2 = 0.9F;
         } else if (this.az == csf.a.c) {
            $$0 = -7.0E-4;
            $$2 = 0.9F;
         } else if (this.az == csf.a.b) {
            $$1 = 0.01F;
            $$2 = 0.45F;
         } else if (this.az == csf.a.e) {
            $$2 = 0.9F;
         } else if (this.az == csf.a.d) {
            $$2 = this.ay;
            if (this.cW() instanceof cqi) {
               this.ay /= 2.0F;
            }
         }

         fcu $$4 = this.dy();
         this.n($$4.d * (double)$$2, $$4.e + $$0, $$4.f * (double)$$2);
         this.o *= $$2;
         if ($$1 > 0.0) {
            fcu $$5 = this.dy();
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

         this.i(this.dy().b((double)(azk.a(-this.dL() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azk.b(this.dL() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.r && !this.q || this.s, this.q && !this.r || this.s);
      }
   }

   protected float m() {
      return 0.0F;
   }

   public boolean b(bvs $$0) {
      return $$0.dq() < this.dq();
   }

   @Override
   protected void a(bvs $$0, bvs.b $$1) {
      super.a($$0, $$1);
      if (!$$0.aq().a(axd.s)) {
         $$0.w($$0.dL() + this.o);
         $$0.r($$0.cA() + this.o);
         this.c($$0);
         if ($$0 instanceof cig && this.cY().size() == this.n()) {
            int $$2 = $$0.ar() % 2 == 0 ? 90 : 270;
            $$0.s(((cig)$$0).aU + (float)$$2);
            $$0.r($$0.cA() + (float)$$2);
         }
      }
   }

   @Override
   public fcu b(bwr $$0) {
      fcu $$1 = a((double)(this.dq() * azk.g), (double)$$0.dq(), $$0.dL());
      double $$2 = this.dA() + $$1.d;
      double $$3 = this.dG() + $$1.f;
      jj $$4 = jj.a($$2, this.cR().e, $$3);
      jj $$5 = $$4.e();
      if (!this.dV().z($$5)) {
         List<fcu> $$6 = Lists.newArrayList();
         double $$7 = this.dV().j($$4);
         if (csn.a($$7)) {
            $$6.add(new fcu($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dV().j($$5);
         if (csn.a($$8)) {
            $$6.add(new fcu($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fN().iterator();

         while (var14.hasNext()) {
            bxd $$9 = (bxd)var14.next();

            for (fcu $$10 : $$6) {
               if (csn.a(this.dV(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bvs $$0) {
      $$0.s(this.dL());
      float $$1 = azk.h($$0.dL() - this.dL());
      float $$2 = azk.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.w($$0.dL() + $$2 - $$1);
      $$0.r($$0.dL());
   }

   @Override
   public void k(bvs $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tw $$0) {
      this.a($$0, this.aH);
   }

   @Override
   protected void a(tw $$0) {
      this.c($$0);
   }

   @Override
   public btq a(cqi $$0, btp $$1) {
      btq $$2 = super.a($$0, $$1);
      if ($$2 != btq.e) {
         return $$2;
      } else {
         return (btq)($$0.fX() || !(this.n < 60.0F) || !this.dV().C && !$$0.n(this) ? btq.e : btq.a);
      }
   }

   @Override
   public void a(bvs.e $$0) {
      if (!this.dV().C && $$0.a() && this.O_()) {
         this.y();
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
      this.aB = this.dy().e;
      if (!this.bZ()) {
         if ($$1) {
            this.k();
         } else if (!this.dV().b_(this.dv().e()).a(axf.a) && $$0 < 0.0) {
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
      return azk.h($$0, this.aG, this.aF);
   }

   @Override
   protected boolean r(bvs $$0) {
      return this.cY().size() < this.n() && !this.a(axf.a);
   }

   protected int n() {
      return 2;
   }

   @Nullable
   @Override
   public bwr cW() {
      return this.cZ() instanceof bwr $$0 ? $$0 : super.cW();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;
   }

   @Override
   public boolean bn() {
      return this.az == csf.a.b || this.az == csf.a.c;
   }

   @Override
   protected final cxu o() {
      return this.aI.get();
   }

   @Override
   public final cxy dI() {
      return new cxy(this.aI.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
