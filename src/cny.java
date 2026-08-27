import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cny extends coj implements btn<cny.b> {
   private static final ajy<Integer> i = akc.a(cny.class, aka.b);
   private static final ajy<Boolean> j = akc.a(cny.class, aka.k);
   private static final ajy<Boolean> k = akc.a(cny.class, aka.k);
   private static final ajy<Integer> l = akc.a(cny.class, aka.b);
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
   private double aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private boolean aR;
   private boolean aS;
   private double aT;
   private float aU;
   private cny.a aV;
   private cny.a aW;
   private double aX;
   private boolean aY;
   private boolean aZ;
   private float ba;
   private float bb;
   private float bc;

   public cny(bsb<? extends cny> $$0, dca $$1) {
      super($$0, $$1);
      this.K = true;
   }

   public cny(dca $$0, double $$1, double $$2, double $$3) {
      this(bsb.m, $$0);
      this.a_($$1, $$2, $$3);
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(i, cny.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(brv $$0) {
      return a(this, $$0);
   }

   public static boolean a(brv $$0, brv $$1) {
      return ($$1.bK() || $$1.bF()) && !$$0.y($$1);
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   protected ewu a(iw.a $$0, l.a $$1) {
      return bso.i(super.a($$0, $$1));
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      float $$3 = this.w();
      if (this.cX().size() > 1) {
         int $$4 = this.cX().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cee) {
            $$3 += 0.2F;
         }
      }

      return new ewu(0.0, this.x() == cny.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dK() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dU().C) {
         this.aY = true;
         this.aZ = $$0;
         if (this.G() == 0) {
            this.b(60);
         }
      }

      this.dU().a(lb.ak, this.dz() + (double)this.al.i(), this.dB() + 0.7, this.dF() + (double)this.al.i(), 0.0, 0.0, 0.0);
      if (this.al.a(20) == 0) {
         this.dU().a(this.dz(), this.dB(), this.dF(), this.aU(), this.dj(), 1.0F, 0.8F + 0.4F * this.al.i(), false);
         this.a(dxv.O, this.cV());
      }
   }

   @Override
   public void h(brv $$0) {
      if ($$0 instanceof cny) {
         if ($$0.cP().b < this.cP().e) {
            super.h($$0);
         }
      } else if ($$0.cP().b <= this.cP().b) {
         super.h($$0);
      }
   }

   @Override
   public cuc ah_() {
      return switch (this.x()) {
         case b -> cuk.pm;
         case c -> cuk.po;
         case d -> cuk.pq;
         case e -> cuk.ps;
         case f -> cuk.pu;
         case g -> cuk.pw;
         case h -> cuk.py;
         case i -> cuk.pA;
         default -> cuk.pk;
      };
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.M() * 11.0F);
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.aN = (double)$$3;
      this.aO = (double)$$4;
      this.s = 10;
   }

   @Override
   public double c_() {
      return this.s > 0 ? this.t : this.dz();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dB();
   }

   @Override
   public double M_() {
      return this.s > 0 ? this.v : this.dF();
   }

   @Override
   public float N_() {
      return this.s > 0 ? (float)this.aO : this.dM();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aN : this.dK();
   }

   @Override
   public iw cN() {
      return this.cM().h();
   }

   @Override
   public void l() {
      this.aW = this.aV;
      this.aV = this.B();
      if (this.aV != cny.a.b && this.aV != cny.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dU().C && this.q >= 60.0F) {
         this.bM();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.M() > 0.0F) {
         this.b(this.M() - 1.0F);
      }

      super.l();
      this.A();
      if (this.df()) {
         if (!(this.cY() instanceof cly)) {
            this.a(false, false);
         }

         this.E();
         if (this.dU().C) {
            this.F();
            this.dU().a(new ahk(this.c(0), this.c(1)));
         }

         this.a(bst.a, this.dx());
      } else {
         this.g(ewu.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.ba()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avn $$1 = this.r();
               if ($$1 != null) {
                  ewu $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dU().a(null, this.dz() + $$3, this.dB(), this.dF() + $$4, $$1, this.dj(), 1.0F, 0.8F + 0.4F * this.al.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aW();
      List<brv> $$5 = this.dU().a(this, this.cP().c(0.2F, -0.01F, 0.2F), bsa.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dU().C && !(this.cV() instanceof cly);

         for (brv $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cX().size() < this.y() && !$$7.bW() && this.b($$7) && $$7 instanceof bso && !($$7 instanceof cfg) && !($$7 instanceof cly)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dU().C) {
         int $$0 = this.G();
         if ($$0 > 0) {
            this.ba += 0.05F;
         } else {
            this.ba -= 0.1F;
         }

         this.ba = aym.a(this.ba, 0.0F, 1.0F);
         this.bc = this.bb;
         this.bb = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dU().Z())) * this.ba;
      } else {
         if (!this.aY) {
            this.b(0);
         }

         int $$1 = this.G();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               ewu $$3 = this.dx();
               if (this.aZ) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bM();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cly) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aY = false;
         }
      }
   }

   @Nullable
   protected avn r() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return avo.cr;
         case d:
            return avo.cq;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.df()) {
         this.s = 0;
         this.f(this.dz(), this.dB(), this.dF());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aN, this.aO);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.as.a(j, $$0);
      this.as.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? aym.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cny.a B() {
      cny.a $$0 = this.D();
      if ($$0 != null) {
         this.aT = this.cP().e;
         return $$0;
      } else if (this.C()) {
         return cny.a.a;
      } else {
         float $$1 = this.u();
         if ($$1 > 0.0F) {
            this.aU = $$1;
            return cny.a.d;
         } else {
            return cny.a.e;
         }
      }
   }

   public float t() {
      ewp $$0 = this.cP();
      int $$1 = aym.a($$0.a);
      int $$2 = aym.c($$0.d);
      int $$3 = aym.a($$0.e);
      int $$4 = aym.c($$0.e - this.aX);
      int $$5 = aym.a($$0.c);
      int $$6 = aym.c($$0.f);
      ir.a $$7 = new ir.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               epe $$12 = this.dU().b_($$7);
               if ($$12.a(awj.a)) {
                  $$9 = Math.max($$9, $$12.a((dbg)this.dU(), $$7));
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

   public float u() {
      ewp $$0 = this.cP();
      ewp $$1 = new ewp($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = aym.a($$1.a) - 1;
      int $$3 = aym.c($$1.d) + 1;
      int $$4 = aym.a($$1.b) - 1;
      int $$5 = aym.c($$1.e) + 1;
      int $$6 = aym.a($$1.c) - 1;
      int $$7 = aym.c($$1.f) + 1;
      exn $$8 = exk.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      ir.a $$11 = new ir.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dtc $$16 = this.dU().a_($$11);
                     if (!($$16.b() instanceof dov) && exk.c($$16.k(this.dU(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ewy.i)) {
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

   private boolean C() {
      ewp $$0 = this.cP();
      int $$1 = aym.a($$0.a);
      int $$2 = aym.c($$0.d);
      int $$3 = aym.a($$0.b);
      int $$4 = aym.c($$0.b + 0.001);
      int $$5 = aym.a($$0.c);
      int $$6 = aym.c($$0.f);
      boolean $$7 = false;
      this.aT = -Double.MAX_VALUE;
      ir.a $$8 = new ir.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               epe $$12 = this.dU().b_($$8);
               if ($$12.a(awj.a)) {
                  float $$13 = (float)$$10 + $$12.a((dbg)this.dU(), $$8);
                  this.aT = Math.max((double)$$13, this.aT);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cny.a D() {
      ewp $$0 = this.cP();
      double $$1 = $$0.e + 0.001;
      int $$2 = aym.a($$0.a);
      int $$3 = aym.c($$0.d);
      int $$4 = aym.a($$0.e);
      int $$5 = aym.c($$1);
      int $$6 = aym.a($$0.c);
      int $$7 = aym.c($$0.f);
      boolean $$8 = false;
      ir.a $$9 = new ir.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               epe $$13 = this.dU().b_($$9);
               if ($$13.a(awj.a) && $$1 < (double)((float)$$9.v() + $$13.a((dbg)this.dU(), $$9))) {
                  if (!$$13.b()) {
                     return cny.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cny.a.b : null;
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.bd();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aW == cny.a.e && this.aV != cny.a.e && this.aV != cny.a.d) {
         this.aT = this.e(1.0);
         this.a_(this.dz(), (double)(this.t() - this.dp()) + 0.101, this.dF());
         this.g(this.dx().d(1.0, 0.0, 1.0));
         this.aX = 0.0;
         this.aV = cny.a.a;
      } else {
         if (this.aV == cny.a.a) {
            $$1 = (this.aT - this.dB()) / (double)this.dp();
            this.p = 0.9F;
         } else if (this.aV == cny.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aV == cny.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aV == cny.a.e) {
            this.p = 0.9F;
         } else if (this.aV == cny.a.d) {
            this.p = this.aU;
            if (this.cV() instanceof cly) {
               this.aU /= 2.0F;
            }
         }

         ewu $$2 = this.dx();
         this.o($$2.c * (double)this.p, $$2.d + $$0, $$2.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            ewu $$3 = this.dx();
            this.o($$3.c, ($$3.d + $$1 * (this.bc() / 0.65)) * 0.75, $$3.e);
         }
      }
   }

   private void F() {
      if (this.bX()) {
         float $$0 = 0.0F;
         if (this.aP) {
            this.r--;
         }

         if (this.aQ) {
            this.r++;
         }

         if (this.aQ != this.aP && !this.aR && !this.aS) {
            $$0 += 0.005F;
         }

         this.r(this.dK() + this.r);
         if (this.aR) {
            $$0 += 0.04F;
         }

         if (this.aS) {
            $$0 -= 0.005F;
         }

         this.g(this.dx().b((double)(aym.a(-this.dK() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(aym.b(this.dK() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aQ && !this.aP || this.aR, this.aP && !this.aQ || this.aR);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(brv $$0) {
      return $$0.do() < this.do();
   }

   @Override
   protected void a(brv $$0, brv.b $$1) {
      super.a($$0, $$1);
      if (!$$0.ak().a(awh.s)) {
         $$0.r($$0.dK() + this.r);
         $$0.n($$0.cx() + this.r);
         this.c($$0);
         if ($$0 instanceof cee && this.cX().size() == this.y()) {
            int $$2 = $$0.al() % 2 == 0 ? 90 : 270;
            $$0.o(((cee)$$0).bj + (float)$$2);
            $$0.n($$0.cx() + (float)$$2);
         }
      }
   }

   @Override
   public ewu b(bso $$0) {
      ewu $$1 = a((double)(this.do() * aym.g), (double)$$0.do(), $$0.dK());
      double $$2 = this.dz() + $$1.c;
      double $$3 = this.dF() + $$1.e;
      ir $$4 = ir.a($$2, this.cP().e, $$3);
      ir $$5 = $$4.d();
      if (!this.dU().z($$5)) {
         List<ewu> $$6 = Lists.newArrayList();
         double $$7 = this.dU().j($$4);
         if (cob.a($$7)) {
            $$6.add(new ewu($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dU().j($$5);
         if (cob.a($$8)) {
            $$6.add(new ewu($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fR().iterator();

         while (var14.hasNext()) {
            bsz $$9 = (bsz)var14.next();

            for (ewu $$10 : $$6) {
               if (cob.a(this.dU(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(brv $$0) {
      $$0.o(this.dK());
      float $$1 = aym.g($$0.dK() - this.dK());
      float $$2 = aym.a($$1, -105.0F, 105.0F);
      $$0.P += $$2 - $$1;
      $$0.r($$0.dK() + $$2 - $$1);
      $$0.n($$0.dK());
   }

   @Override
   public void k(brv $$0) {
      this.c($$0);
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(uk $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cny.b.a($$0.l("Type")));
      }
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      if ($$0.ga()) {
         return bqa.d;
      } else if (this.q < 60.0F) {
         if (!this.dU().C) {
            return $$0.n(this) ? bqa.b : bqa.d;
         } else {
            return bqa.a;
         }
      } else {
         return bqa.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
      this.aX = this.dx().d;
      if (!this.bW()) {
         if ($$1) {
            if (this.ad > 3.0F) {
               if (this.aV != cny.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ad, 1.0F, this.dX().l());
               if (!this.dU().C && !this.dP()) {
                  this.an();
                  if (this.dU().ab().b(dbw.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cuk.qI);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dU().b_(this.du().d()).a(awj.a) && $$0 < 0.0) {
            this.ad -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.as.a($$0 == 0 ? j : k) && this.cV() != null;
   }

   private void b(int $$0) {
      this.as.a(l, $$0);
   }

   private int G() {
      return this.as.a(l);
   }

   public float a(float $$0) {
      return aym.i($$0, this.bc, this.bb);
   }

   public void a(cny.b $$0) {
      this.as.a(i, $$0.ordinal());
   }

   public cny.b x() {
      return cny.b.a(this.as.a(i));
   }

   @Override
   protected boolean r(brv $$0) {
      return this.cX().size() < this.y() && !this.a(awj.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public bso cV() {
      return this.cY() instanceof bso $$0 ? $$0 : super.cV();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aP = $$0;
      this.aQ = $$1;
      this.aR = $$2;
      this.aS = $$3;
   }

   @Override
   protected xe cw() {
      return xe.c(this.ah_().a());
   }

   @Override
   public boolean bn() {
      return this.aV == cny.a.b || this.aV == cny.a.c;
   }

   @Override
   public cuh dH() {
      return new cuh(this.ah_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements azg {
      a(dfe.S, "oak"),
      b(dfe.T, "spruce"),
      c(dfe.U, "birch"),
      d(dfe.V, "jungle"),
      e(dfe.W, "acacia"),
      f(dfe.X, "cherry"),
      g(dfe.Y, "dark_oak"),
      h(dfe.Z, "mangrove"),
      i(dfe.aa, "bamboo");

      private final String k;
      private final dfc l;
      public static final azg.a<cny.b> j = azg.a(cny.b::values);
      private static final IntFunction<cny.b> m = axd.a(Enum::ordinal, values(), axd.a.a);

      private b(dfc $$0, String $$1) {
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

      public dfc b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cny.b a(int $$0) {
         return m.apply($$0);
      }

      public static cny.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
