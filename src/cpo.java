import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cpo extends cqc implements bud, bve<cpo.b> {
   private static final akg<Integer> i = akk.a(cpo.class, aki.b);
   private static final akg<Boolean> j = akk.a(cpo.class, aki.k);
   private static final akg<Boolean> k = akk.a(cpo.class, aki.k);
   private static final akg<Integer> l = akk.a(cpo.class, aki.b);
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
   private cpo.a aH;
   private cpo.a aI;
   private double aJ;
   private boolean aK;
   private boolean aL;
   private float aM;
   private float aN;
   private float aO;
   @Nullable
   private bud.a aP;

   public cpo(btq<? extends cpo> $$0, dds $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cpo(dds $$0, double $$1, double $$2, double $$3) {
      this(btq.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected btj.b bf() {
      return btj.b.c;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(i, cpo.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(btj $$0) {
      return a(this, $$0);
   }

   public static boolean a(btj $$0, btj $$1) {
      return ($$1.bK() || $$1.bF()) && !$$0.z($$1);
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
   public eye a(jj.a $$0, l.a $$1) {
      return buf.j(super.a($$0, $$1));
   }

   @Override
   protected eye a(btj $$0, btm $$1, float $$2) {
      float $$3 = this.v();
      if (this.cW().size() > 1) {
         int $$4 = this.cW().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cfv) {
            $$3 += 0.2F;
         }
      }

      return new eye(0.0, this.w() == cpo.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dI() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dS().B) {
         this.aK = true;
         this.aL = $$0;
         if (this.K() == 0) {
            this.b(60);
         }
      }

      this.dS().a(ln.am, this.dx() + (double)this.af.i(), this.dz() + 0.7, this.dD() + (double)this.af.i(), 0.0, 0.0, 0.0);
      if (this.af.a(20) == 0) {
         this.dS().a(this.dx(), this.dz(), this.dD(), this.aU(), this.di(), 1.0F, 0.8F + 0.4F * this.af.i(), false);
         this.a(dyx.O, this.cU());
      }
   }

   @Override
   public void h(btj $$0) {
      if ($$0 instanceof cpo) {
         if ($$0.cO().b < this.cO().e) {
            super.h($$0);
         }
      } else if ($$0.cO().b <= this.cO().b) {
         super.h($$0);
      }
   }

   @Override
   public cvg aj_() {
      return switch (this.w()) {
         case b -> cvo.nX;
         case c -> cvo.nZ;
         case d -> cvo.ob;
         case e -> cvo.od;
         case f -> cvo.of;
         case g -> cvo.oh;
         case h -> cvo.oj;
         case i -> cvo.ol;
         default -> cvo.nV;
      };
   }

   @Override
   public void p(float $$0) {
      this.m(-this.S());
      this.d(10);
      this.b(this.Q() * 11.0F);
   }

   @Override
   public boolean bE() {
      return !this.dN();
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
   public double c_() {
      return this.s > 0 ? this.t : this.dx();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dz();
   }

   @Override
   public double N_() {
      return this.s > 0 ? this.v : this.dD();
   }

   @Override
   public float O_() {
      return this.s > 0 ? (float)this.aA : this.dK();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.az : this.dI();
   }

   @Override
   public jj cM() {
      return this.cL().h();
   }

   @Override
   public void l() {
      this.aI = this.aH;
      this.aH = this.E();
      if (this.aH != cpo.a.b && this.aH != cpo.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dS().B && this.q >= 60.0F) {
         this.bM();
      }

      if (this.R() > 0) {
         this.d(this.R() - 1);
      }

      if (this.Q() > 0.0F) {
         this.b(this.Q() - 1.0F);
      }

      super.l();
      this.D();
      if (this.de()) {
         if (!(this.cX() instanceof cnp)) {
            this.b(false, false);
         }

         this.I();
         if (this.dS().B) {
            this.J();
            this.dS().a(new ahr(this.c(0), this.c(1)));
         }

         this.a(buj.a, this.dv());
      } else {
         this.h(eye.c);
      }

      this.aI();
      this.y();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.ba()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awc $$1 = this.o();
               if ($$1 != null) {
                  eye $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dS().a(null, this.dx() + $$3, this.dz(), this.dD() + $$4, $$1, this.di(), 1.0F, 0.8F + 0.4F * this.af.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      List<btj> $$5 = this.dS().a(this, this.cO().c(0.2F, -0.01F, 0.2F), bto.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dS().B && !(this.cU() instanceof cnp);

         for (btj $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6 && this.cW().size() < this.x() && !$$7.bW() && this.c($$7) && $$7 instanceof buf && !($$7 instanceof cgx) && !($$7 instanceof cnp)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void y() {
      if (this.dS().B) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aM += 0.05F;
         } else {
            this.aM -= 0.1F;
         }

         this.aM = azc.a(this.aM, 0.0F, 1.0F);
         this.aO = this.aN;
         this.aN = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dS().aa())) * this.aM;
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
               eye $$3 = this.dv();
               if (this.aL) {
                  this.h($$3.b(0.0, -0.7, 0.0));
                  this.bM();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cnp) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aK = false;
         }
      }
   }

   @Nullable
   protected awc o() {
      switch (this.E()) {
         case a:
         case b:
         case c:
            return awd.cm;
         case d:
            return awd.cl;
         case e:
         default:
            return null;
      }
   }

   private void D() {
      if (this.de()) {
         this.s = 0;
         this.f(this.dx(), this.dz(), this.dD());
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
      return this.c($$0) ? azc.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public bud.a W_() {
      return this.aP;
   }

   @Override
   public void a(@Nullable bud.a $$0) {
      this.aP = $$0;
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.88F * this.cP()), (double)(this.dn() * 0.64F));
   }

   @Override
   public void b(btj $$0, float $$1) {
      eye $$2 = $$0.dq().d(this.dq()).d().c((double)$$1 - 6.0);
      eye $$3 = this.dv();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.h($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cpo.a E() {
      cpo.a $$0 = this.G();
      if ($$0 != null) {
         this.aF = this.cO().e;
         return $$0;
      } else if (this.F()) {
         return cpo.a.a;
      } else {
         float $$1 = this.t();
         if ($$1 > 0.0F) {
            this.aG = $$1;
            return cpo.a.d;
         } else {
            return cpo.a.e;
         }
      }
   }

   public float q() {
      exz $$0 = this.cO();
      int $$1 = azc.a($$0.a);
      int $$2 = azc.c($$0.d);
      int $$3 = azc.a($$0.e);
      int $$4 = azc.c($$0.e - this.aJ);
      int $$5 = azc.a($$0.c);
      int $$6 = azc.c($$0.f);
      je.a $$7 = new je.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eqb $$12 = this.dS().b_($$7);
               if ($$12.a(awy.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dS(), $$7));
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
      exz $$0 = this.cO();
      exz $$1 = new exz($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azc.a($$1.a) - 1;
      int $$3 = azc.c($$1.d) + 1;
      int $$4 = azc.a($$1.b) - 1;
      int $$5 = azc.c($$1.e) + 1;
      int $$6 = azc.a($$1.c) - 1;
      int $$7 = azc.c($$1.f) + 1;
      eyx $$8 = eyu.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      je.a $$11 = new je.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dua $$16 = this.dS().a_($$11);
                     if (!($$16.b() instanceof dpz) && eyu.c($$16.g(this.dS(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, eyi.i)) {
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

   private boolean F() {
      exz $$0 = this.cO();
      int $$1 = azc.a($$0.a);
      int $$2 = azc.c($$0.d);
      int $$3 = azc.a($$0.b);
      int $$4 = azc.c($$0.b + 0.001);
      int $$5 = azc.a($$0.c);
      int $$6 = azc.c($$0.f);
      boolean $$7 = false;
      this.aF = -Double.MAX_VALUE;
      je.a $$8 = new je.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eqb $$12 = this.dS().b_($$8);
               if ($$12.a(awy.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dS(), $$8);
                  this.aF = Math.max((double)$$13, this.aF);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cpo.a G() {
      exz $$0 = this.cO();
      double $$1 = $$0.e + 0.001;
      int $$2 = azc.a($$0.a);
      int $$3 = azc.c($$0.d);
      int $$4 = azc.a($$0.e);
      int $$5 = azc.c($$1);
      int $$6 = azc.a($$0.c);
      int $$7 = azc.c($$0.f);
      boolean $$8 = false;
      je.a $$9 = new je.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eqb $$13 = this.dS().b_($$9);
               if ($$13.a(awy.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dS(), $$9))) {
                  if (!$$13.b()) {
                     return cpo.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cpo.a.b : null;
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   private void I() {
      double $$0 = -this.bd();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aI == cpo.a.e && this.aH != cpo.a.e && this.aH != cpo.a.d) {
         this.aF = this.e(1.0);
         double $$2 = (double)(this.q() - this.do()) + 0.101;
         if (this.dS().a(this, this.cO().d(0.0, $$2 - this.dz(), 0.0))) {
            this.a_(this.dx(), $$2, this.dD());
            this.h(this.dv().d(1.0, 0.0, 1.0));
            this.aJ = 0.0;
         }

         this.aH = cpo.a.a;
      } else {
         if (this.aH == cpo.a.a) {
            $$1 = (this.aF - this.dz()) / (double)this.do();
            this.p = 0.9F;
         } else if (this.aH == cpo.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aH == cpo.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aH == cpo.a.e) {
            this.p = 0.9F;
         } else if (this.aH == cpo.a.d) {
            this.p = this.aG;
            if (this.cU() instanceof cnp) {
               this.aG /= 2.0F;
            }
         }

         eye $$3 = this.dv();
         this.n($$3.d * (double)this.p, $$3.e + $$0, $$3.f * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            eye $$4 = this.dv();
            this.n($$4.d, ($$4.e + $$1 * (this.bc() / 0.65)) * 0.75, $$4.f);
         }
      }
   }

   private void J() {
      if (this.bX()) {
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

         this.v(this.dI() + this.r);
         if (this.aD) {
            $$0 += 0.04F;
         }

         if (this.aE) {
            $$0 -= 0.005F;
         }

         this.h(this.dv().b((double)(azc.a(-this.dI() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azc.b(this.dI() * (float) (Math.PI / 180.0)) * $$0)));
         this.b(this.aC && !this.aB || this.aD, this.aB && !this.aC || this.aD);
      }
   }

   protected float v() {
      return 0.0F;
   }

   public boolean c(btj $$0) {
      return $$0.dn() < this.dn();
   }

   @Override
   protected void a(btj $$0, btj.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ao().a(aww.s)) {
         $$0.v($$0.dI() + this.r);
         $$0.q($$0.cx() + this.r);
         this.d($$0);
         if ($$0 instanceof cfv && this.cW().size() == this.x()) {
            int $$2 = $$0.ap() % 2 == 0 ? 90 : 270;
            $$0.r(((cfv)$$0).aU + (float)$$2);
            $$0.q($$0.cx() + (float)$$2);
         }
      }
   }

   @Override
   public eye b(buf $$0) {
      eye $$1 = a((double)(this.dn() * azc.g), (double)$$0.dn(), $$0.dI());
      double $$2 = this.dx() + $$1.d;
      double $$3 = this.dD() + $$1.f;
      je $$4 = je.a($$2, this.cO().e, $$3);
      je $$5 = $$4.e();
      if (!this.dS().z($$5)) {
         List<eye> $$6 = Lists.newArrayList();
         double $$7 = this.dS().j($$4);
         if (cpr.a($$7)) {
            $$6.add(new eye($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dS().j($$5);
         if (cpr.a($$8)) {
            $$6.add(new eye($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fI().iterator();

         while (var14.hasNext()) {
            bur $$9 = (bur)var14.next();

            for (eye $$10 : $$6) {
               if (cpr.a(this.dS(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void d(btj $$0) {
      $$0.r(this.dI());
      float $$1 = azc.g($$0.dI() - this.dI());
      float $$2 = azc.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.v($$0.dI() + $$2 - $$1);
      $$0.q($$0.dI());
   }

   @Override
   public void k(btj $$0) {
      this.d($$0);
   }

   @Override
   protected void b(uf $$0) {
      this.a($$0, this.aP);
      $$0.a("Type", this.w().c());
   }

   @Override
   protected void a(uf $$0) {
      this.aP = this.c($$0);
      if ($$0.b("Type", 8)) {
         this.a(cpo.b.a($$0.l("Type")));
      }
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      brk $$2 = super.a($$0, $$1);
      if ($$2 != brk.e) {
         return $$2;
      } else {
         return (brk)($$0.fR() || !(this.q < 60.0F) || !this.dS().B && !$$0.n(this) ? brk.e : brk.a);
      }
   }

   @Override
   public void a(btj.c $$0) {
      if (!this.dS().B && $$0.a() && this.K_()) {
         this.a(true, true);
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dua $$2, je $$3) {
      this.aJ = this.dv().e;
      if (!this.bW()) {
         if ($$1) {
            if (this.aa > 3.0F) {
               if (this.aH != cpo.a.d) {
                  this.n();
                  return;
               }

               this.a(this.aa, 1.0F, this.dT().l());
               if (!this.dS().B && !this.dN()) {
                  this.ar();
                  if (this.dS().ac().b(ddo.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.w().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cvo.pr);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dS().b_(this.ds().e()).a(awy.a) && $$0 < 0.0) {
            this.aa -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.am.a($$0 == 0 ? j : k) && this.cU() != null;
   }

   private void b(int $$0) {
      this.am.a(l, $$0);
   }

   private int K() {
      return this.am.a(l);
   }

   public float a(float $$0) {
      return azc.h($$0, this.aO, this.aN);
   }

   public void a(cpo.b $$0) {
      this.am.a(i, $$0.ordinal());
   }

   public cpo.b w() {
      return cpo.b.a(this.am.a(i));
   }

   @Override
   protected boolean r(btj $$0) {
      return this.cW().size() < this.x() && !this.a(awy.a);
   }

   protected int x() {
      return 2;
   }

   @Nullable
   @Override
   public buf cU() {
      return this.cX() instanceof buf $$0 ? $$0 : super.cU();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aB = $$0;
      this.aC = $$1;
      this.aD = $$2;
      this.aE = $$3;
   }

   @Override
   protected xd cw() {
      return xd.c(this.aj_().a());
   }

   @Override
   public boolean bn() {
      return this.aH == cpo.a.b || this.aH == cpo.a.c;
   }

   @Override
   public cvl dF() {
      return new cvl(this.aj_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements azy {
      a(dgx.n, "oak"),
      b(dgx.o, "spruce"),
      c(dgx.p, "birch"),
      d(dgx.q, "jungle"),
      e(dgx.r, "acacia"),
      f(dgx.s, "cherry"),
      g(dgx.t, "dark_oak"),
      h(dgx.u, "mangrove"),
      i(dgx.v, "bamboo");

      private final String k;
      private final dgv l;
      public static final azy.a<cpo.b> j = azy.a(cpo.b::values);
      private static final IntFunction<cpo.b> m = axt.a(Enum::ordinal, values(), axt.a.a);

      private b(final dgv $$0, final String $$1) {
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

      public dgv b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cpo.b a(int $$0) {
         return m.apply($$0);
      }

      public static cpo.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
