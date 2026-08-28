import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cro extends csi implements bvw {
   private static final ajx<Boolean> h = akb.a(cro.class, ajz.k);
   private static final ajx<Boolean> i = akb.a(cro.class, ajz.k);
   private static final ajx<Integer> j = akb.a(cro.class, ajz.b);
   public static final int a = 0;
   public static final int b = 1;
   private static final int k = 60;
   private static final float l = (float) (Math.PI / 8);
   public static final double c = (float) (Math.PI / 4);
   public static final int d = 60;
   private final float[] m = new float[2];
   private float n;
   private float o;
   private final bvt p = new bvt(this, 3);
   private boolean q;
   private boolean r;
   private boolean s;
   private boolean t;
   private double u;
   private float ay;
   private cro.a az;
   private cro.a aA;
   private double aB;
   private boolean aC;
   private boolean aD;
   private float aE;
   private float aF;
   private float aG;
   @Nullable
   private bvw.a aH;
   private final Supplier<cxd> aI;

   public cro(bvi<? extends cro> $$0, dgz $$1, Supplier<cxd> $$2) {
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
   protected bva.c bg() {
      return bva.c.c;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(h, false);
      $$0.a(i, false);
      $$0.a(j, 0);
   }

   @Override
   public boolean i(bva $$0) {
      return a(this, $$0);
   }

   public static boolean a(bva $$0, bva $$1) {
      return ($$1.bL() || $$1.bG()) && !$$0.z($$1);
   }

   @Override
   public boolean bL() {
      return true;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public fbx a(jn.a $$0, l.a $$1) {
      return bvy.k(super.a($$0, $$1));
   }

   protected abstract double b(bvd var1);

   @Override
   protected fbx a(bva $$0, bvd $$1, float $$2) {
      float $$3 = this.m();
      if (this.cX().size() > 1) {
         int $$4 = this.cX().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof chp) {
            $$3 += 0.2F;
         }
      }

      return new fbx(0.0, this.b($$1), (double)$$3).b(-this.dK() * (float) (Math.PI / 180.0));
   }

   @Override
   public void a(boolean $$0, ji $$1) {
      if (this.dU() instanceof ard) {
         this.aC = true;
         this.aD = $$0;
         if (this.K() == 0) {
            this.m(60);
         }
      }

      if (!this.bm() && this.ae.a(100) == 0) {
         this.dU().a(this.dz(), this.dB(), this.dF(), this.aW(), this.dl(), 1.0F, 0.8F + 0.4F * this.ae.i(), false);
         this.dU().a(lt.ap, this.dz() + (double)this.ae.i(), this.dB() + 0.7, this.dF() + (double)this.ae.i(), 0.0, 0.0, 0.0);
         this.a(ecp.O, this.cV());
      }
   }

   @Override
   public void h(bva $$0) {
      if ($$0 instanceof cro) {
         if ($$0.cQ().b < this.cQ().e) {
            super.h($$0);
         }
      } else if ($$0.cQ().b <= this.cQ().b) {
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
   public boolean bF() {
      return !this.dP();
   }

   @Override
   public bvt N_() {
      return this.p;
   }

   @Override
   public jn cO() {
      return this.cN().h();
   }

   @Override
   public void h() {
      this.aA = this.az;
      this.az = this.x();
      if (this.az != cro.a.b && this.az != cro.a.c) {
         this.n = 0.0F;
      } else {
         this.n++;
      }

      if (!this.dU().C && this.n >= 60.0F) {
         this.bN();
      }

      if (this.I() > 0) {
         this.d(this.I() - 1);
      }

      if (this.H() > 0.0F) {
         this.b(this.H() - 1.0F);
      }

      super.h();
      this.p.e();
      if (this.df()) {
         if (!(this.cY() instanceof cpr)) {
            this.a(false, false);
         }

         this.F();
         if (this.dU().C) {
            this.G();
            this.dU().a(new ahg(this.c(0), this.c(1)));
         }

         this.a(bwc.a, this.dx());
      } else {
         this.i(fbx.c);
      }

      this.aK();
      this.aK();
      this.v();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.bb()
               && (double)(this.m[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.m[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avz $$1 = this.f();
               if ($$1 != null) {
                  fbx $$2 = this.h(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dU().a(null, this.dz() + $$3, this.dB(), this.dF() + $$4, $$1, this.dl(), 1.0F, 0.8F + 0.4F * this.ae.i());
               }
            }

            this.m[$$0] = this.m[$$0] + (float) (Math.PI / 8);
         } else {
            this.m[$$0] = 0.0F;
         }
      }

      List<bva> $$5 = this.dU().a(this, this.cQ().c(0.2F, -0.01F, 0.2F), bvg.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dU().C && !(this.cV() instanceof cpr);

         for (bva $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6
                  && this.cX().size() < this.n()
                  && !$$7.bY()
                  && this.b($$7)
                  && $$7 instanceof bvy
                  && !($$7 instanceof ciu)
                  && !($$7 instanceof cpr)
                  && !($$7 instanceof cnw)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void v() {
      if (this.dU().C) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aE += 0.05F;
         } else {
            this.aE -= 0.1F;
         }

         this.aE = ayz.a(this.aE, 0.0F, 1.0F);
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
               fbx $$3 = this.dx();
               if (this.aD) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bN();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cpr) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aC = false;
         }
      }
   }

   @Nullable
   protected avz f() {
      return switch (this.x()) {
         case a, b, c -> awa.cm;
         case d -> awa.cl;
         default -> null;
      };
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
   public bvw.a T_() {
      return this.aH;
   }

   @Override
   public void a(@Nullable bvw.a $$0) {
      this.aH = $$0;
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.88F * this.cR()), (double)(this.dp() * 0.64F));
   }

   @Override
   public void b(bva $$0, float $$1) {
      fbx $$2 = $$0.ds().d(this.ds()).d().c((double)$$1 - 6.0);
      fbx $$3 = this.dx();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.i($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cro.a x() {
      cro.a $$0 = this.E();
      if ($$0 != null) {
         this.u = this.cQ().e;
         return $$0;
      } else if (this.D()) {
         return cro.a.a;
      } else {
         float $$1 = this.j();
         if ($$1 > 0.0F) {
            this.ay = $$1;
            return cro.a.d;
         } else {
            return cro.a.e;
         }
      }
   }

   public float g() {
      fbs $$0 = this.cQ();
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.e);
      int $$4 = ayz.c($$0.e - this.aB);
      int $$5 = ayz.a($$0.c);
      int $$6 = ayz.c($$0.f);
      ji.a $$7 = new ji.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               etw $$12 = this.dU().b_($$7);
               if ($$12.a(awv.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dU(), $$7));
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
      fbs $$0 = this.cQ();
      fbs $$1 = new fbs($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayz.a($$1.a) - 1;
      int $$3 = ayz.c($$1.d) + 1;
      int $$4 = ayz.a($$1.b) - 1;
      int $$5 = ayz.c($$1.e) + 1;
      int $$6 = ayz.a($$1.c) - 1;
      int $$7 = ayz.c($$1.f) + 1;
      fcr $$8 = fco.a($$1);
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
                     dxq $$16 = this.dU().a_($$11);
                     if (!($$16.b() instanceof dtn) && fco.c($$16.g(this.dU(), $$11).a($$11), $$8, fcb.i)) {
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
      fbs $$0 = this.cQ();
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.b);
      int $$4 = ayz.c($$0.b + 0.001);
      int $$5 = ayz.a($$0.c);
      int $$6 = ayz.c($$0.f);
      boolean $$7 = false;
      this.u = -Double.MAX_VALUE;
      ji.a $$8 = new ji.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               etw $$12 = this.dU().b_($$8);
               if ($$12.a(awv.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dU(), $$8);
                  this.u = Math.max((double)$$13, this.u);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cro.a E() {
      fbs $$0 = this.cQ();
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
               etw $$13 = this.dU().b_($$9);
               if ($$13.a(awv.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dU(), $$9))) {
                  if (!$$13.b()) {
                     return cro.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cro.a.b : null;
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   private void F() {
      double $$0 = -this.be();
      double $$1 = 0.0;
      float $$2 = 0.05F;
      if (this.aA == cro.a.e && this.az != cro.a.e && this.az != cro.a.d) {
         this.u = this.e(1.0);
         double $$3 = (double)(this.g() - this.dq()) + 0.101;
         if (this.dU().a(this, this.cQ().d(0.0, $$3 - this.dB(), 0.0))) {
            this.a_(this.dz(), $$3, this.dF());
            this.i(this.dx().d(1.0, 0.0, 1.0));
            this.aB = 0.0;
         }

         this.az = cro.a.a;
      } else {
         if (this.az == cro.a.a) {
            $$1 = (this.u - this.dB()) / (double)this.dq();
            $$2 = 0.9F;
         } else if (this.az == cro.a.c) {
            $$0 = -7.0E-4;
            $$2 = 0.9F;
         } else if (this.az == cro.a.b) {
            $$1 = 0.01F;
            $$2 = 0.45F;
         } else if (this.az == cro.a.e) {
            $$2 = 0.9F;
         } else if (this.az == cro.a.d) {
            $$2 = this.ay;
            if (this.cV() instanceof cpr) {
               this.ay /= 2.0F;
            }
         }

         fbx $$4 = this.dx();
         this.n($$4.d * (double)$$2, $$4.e + $$0, $$4.f * (double)$$2);
         this.o *= $$2;
         if ($$1 > 0.0) {
            fbx $$5 = this.dx();
            this.n($$5.d, ($$5.e + $$1 * (this.bd() / 0.65)) * 0.75, $$5.f);
         }
      }
   }

   private void G() {
      if (this.bZ()) {
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

         this.w(this.dK() + this.o);
         if (this.s) {
            $$0 += 0.04F;
         }

         if (this.t) {
            $$0 -= 0.005F;
         }

         this.i(this.dx().b((double)(ayz.a(-this.dK() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayz.b(this.dK() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.r && !this.q || this.s, this.q && !this.r || this.s);
      }
   }

   protected float m() {
      return 0.0F;
   }

   public boolean b(bva $$0) {
      return $$0.dp() < this.dp();
   }

   @Override
   protected void a(bva $$0, bva.a $$1) {
      super.a($$0, $$1);
      if (!$$0.aq().a(awt.s)) {
         $$0.w($$0.dK() + this.o);
         $$0.r($$0.cz() + this.o);
         this.c($$0);
         if ($$0 instanceof chp && this.cX().size() == this.n()) {
            int $$2 = $$0.ar() % 2 == 0 ? 90 : 270;
            $$0.s(((chp)$$0).aV + (float)$$2);
            $$0.r($$0.cz() + (float)$$2);
         }
      }
   }

   @Override
   public fbx b(bvy $$0) {
      fbx $$1 = a((double)(this.dp() * ayz.g), (double)$$0.dp(), $$0.dK());
      double $$2 = this.dz() + $$1.d;
      double $$3 = this.dF() + $$1.f;
      ji $$4 = ji.a($$2, this.cQ().e, $$3);
      ji $$5 = $$4.e();
      if (!this.dU().z($$5)) {
         List<fbx> $$6 = Lists.newArrayList();
         double $$7 = this.dU().j($$4);
         if (crw.a($$7)) {
            $$6.add(new fbx($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dU().j($$5);
         if (crw.a($$8)) {
            $$6.add(new fbx($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fQ().iterator();

         while (var14.hasNext()) {
            bwk $$9 = (bwk)var14.next();

            for (fbx $$10 : $$6) {
               if (crw.a(this.dU(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bva $$0) {
      $$0.s(this.dK());
      float $$1 = ayz.h($$0.dK() - this.dK());
      float $$2 = ayz.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.w($$0.dK() + $$2 - $$1);
      $$0.r($$0.dK());
   }

   @Override
   public void k(bva $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tq $$0) {
      this.a($$0, this.aH);
   }

   @Override
   protected void a(tq $$0) {
      this.c($$0);
   }

   @Override
   public bsy a(cpr $$0, bsx $$1) {
      bsy $$2 = super.a($$0, $$1);
      if ($$2 != bsy.e) {
         return $$2;
      } else {
         return (bsy)($$0.ga() || !(this.n < 60.0F) || !this.dU().C && !$$0.n(this) ? bsy.e : bsy.a);
      }
   }

   @Override
   public void a(bva.d $$0) {
      if (!this.dU().C && $$0.a() && this.O_()) {
         this.y();
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
      this.aB = this.dx().e;
      if (!this.bY()) {
         if ($$1) {
            this.k();
         } else if (!this.dU().b_(this.du().e()).a(awv.a) && $$0 < 0.0) {
            this.Z -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.al.a($$0 == 0 ? h : i) && this.cV() != null;
   }

   private void m(int $$0) {
      this.al.a(j, $$0);
   }

   private int K() {
      return this.al.a(j);
   }

   public float a(float $$0) {
      return ayz.h($$0, this.aG, this.aF);
   }

   @Override
   protected boolean r(bva $$0) {
      return this.cX().size() < this.n() && !this.a(awv.a);
   }

   protected int n() {
      return 2;
   }

   @Nullable
   @Override
   public bvy cV() {
      return this.cY() instanceof bvy $$0 ? $$0 : super.cV();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;
   }

   @Override
   public boolean bm() {
      return this.az == cro.a.b || this.az == cro.a.c;
   }

   @Override
   protected final cxd o() {
      return this.aI.get();
   }

   @Override
   public final cxh dH() {
      return new cxh(this.aI.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
