import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clq extends cmb implements brn<clq.b> {
   private static final aiy<Integer> i = ajc.a(clq.class, aja.b);
   private static final aiy<Boolean> j = ajc.a(clq.class, aja.k);
   private static final aiy<Boolean> k = ajc.a(clq.class, aja.k);
   private static final aiy<Integer> l = ajc.a(clq.class, aja.b);
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
   private double aE;
   private double aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private double aK;
   private float aL;
   private clq.a aM;
   private clq.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public clq(bqb<? extends clq> $$0, cyx $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public clq(cyx $$0, double $$1, double $$2, double $$3) {
      this(bqb.k, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.c;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(i, clq.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bpv $$0) {
      return a(this, $$0);
   }

   public static boolean a(bpv $$0, bpv $$1) {
      return ($$1.bC() || $$1.bx()) && !$$0.y($$1);
   }

   @Override
   public boolean bC() {
      return true;
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   protected esa a(ih.a $$0, l.a $$1) {
      return bqo.i(super.a($$0, $$1));
   }

   @Override
   protected esa a(bpv $$0, bpy $$1, float $$2) {
      float $$3 = this.w();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof ccd) {
            $$3 += 0.2F;
         }
      }

      return new esa(0.0, this.x() == clq.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dC() * (float) (Math.PI / 180.0));
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dM().B) {
         this.aP = true;
         this.aQ = $$0;
         if (this.H() == 0) {
            this.b(60);
         }
      }

      this.dM().a(kl.ak, this.dr() + (double)this.ag.i(), this.dt() + 0.7, this.dx() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), this.aO(), this.db(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(dts.O, this.cN());
      }
   }

   @Override
   public void h(bpv $$0) {
      if ($$0 instanceof clq) {
         if ($$0.cH().b < this.cH().e) {
            super.h($$0);
         }
      } else if ($$0.cH().b <= this.cH().b) {
         super.h($$0);
      }
   }

   @Override
   public cre ag_() {
      return switch (this.x()) {
         case b -> crm.nV;
         case c -> crm.nX;
         case d -> crm.nZ;
         case e -> crm.ob;
         case f -> crm.od;
         case g -> crm.of;
         case h -> crm.oh;
         case i -> crm.oj;
         default -> crm.nT;
      };
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bw() {
      return !this.dH();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.aE = (double)$$3;
      this.aF = (double)$$4;
      this.s = 10;
   }

   @Override
   public double c_() {
      return this.s > 0 ? this.t : this.dr();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dt();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.v : this.dx();
   }

   @Override
   public float M_() {
      return this.s > 0 ? (float)this.aF : this.dE();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aE : this.dC();
   }

   @Override
   public ih cF() {
      return this.cE().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.B();
      if (this.aM != clq.a.b && this.aM != clq.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dM().B && this.q >= 60.0F) {
         this.bE();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.A();
      if (this.cX()) {
         if (!(this.cQ() instanceof cjt)) {
            this.a(false, false);
         }

         this.E();
         if (this.dM().B) {
            this.G();
            this.dM().a(new agk(this.c(0), this.c(1)));
         }

         this.a(bqt.a, this.dp());
      } else {
         this.g(esa.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               aul $$1 = this.r();
               if ($$1 != null) {
                  esa $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dM().a(null, this.dr() + $$3, this.dt(), this.dx() + $$4, $$1, this.db(), 1.0F, 0.8F + 0.4F * this.ag.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aQ();
      List<bpv> $$5 = this.dM().a(this, this.cH().c(0.2F, -0.01F, 0.2F), bqa.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dM().B && !(this.cN() instanceof cjt);

         for (bpv $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.y() && !$$7.bO() && this.b($$7) && $$7 instanceof bqo && !($$7 instanceof cdf) && !($$7 instanceof cjt)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dM().B) {
         int $$0 = this.H();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = axk.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dM().Y())) * this.aR;
      } else {
         if (!this.aP) {
            this.b(0);
         }

         int $$1 = this.H();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               esa $$3 = this.dp();
               if (this.aQ) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bE();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cjt) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected aul r() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return aum.cm;
         case d:
            return aum.cl;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.cX()) {
         this.s = 0;
         this.f(this.dr(), this.dt(), this.dx());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aE, this.aF);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.an.a(j, $$0);
      this.an.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? axk.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private clq.a B() {
      clq.a $$0 = this.D();
      if ($$0 != null) {
         this.aK = this.cH().e;
         return $$0;
      } else if (this.C()) {
         return clq.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return clq.a.d;
         } else {
            return clq.a.e;
         }
      }
   }

   public float u() {
      erv $$0 = this.cH();
      int $$1 = axk.a($$0.a);
      int $$2 = axk.c($$0.d);
      int $$3 = axk.a($$0.e);
      int $$4 = axk.c($$0.e - this.aO);
      int $$5 = axk.a($$0.c);
      int $$6 = axk.c($$0.f);
      ib.a $$7 = new ib.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eks $$12 = this.dM().b_($$7);
               if ($$12.a(avh.a)) {
                  $$9 = Math.max($$9, $$12.a((cyd)this.dM(), $$7));
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

   public float v() {
      erv $$0 = this.cH();
      erv $$1 = new erv($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = axk.a($$1.a) - 1;
      int $$3 = axk.c($$1.d) + 1;
      int $$4 = axk.a($$1.b) - 1;
      int $$5 = axk.c($$1.e) + 1;
      int $$6 = axk.a($$1.c) - 1;
      int $$7 = axk.c($$1.f) + 1;
      est $$8 = esq.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      ib.a $$11 = new ib.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     doz $$16 = this.dM().a_($$11);
                     if (!($$16.b() instanceof dla) && esq.c($$16.k(this.dM(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ese.i)) {
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
      erv $$0 = this.cH();
      int $$1 = axk.a($$0.a);
      int $$2 = axk.c($$0.d);
      int $$3 = axk.a($$0.b);
      int $$4 = axk.c($$0.b + 0.001);
      int $$5 = axk.a($$0.c);
      int $$6 = axk.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      ib.a $$8 = new ib.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eks $$12 = this.dM().b_($$8);
               if ($$12.a(avh.a)) {
                  float $$13 = (float)$$10 + $$12.a((cyd)this.dM(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private clq.a D() {
      erv $$0 = this.cH();
      double $$1 = $$0.e + 0.001;
      int $$2 = axk.a($$0.a);
      int $$3 = axk.c($$0.d);
      int $$4 = axk.a($$0.e);
      int $$5 = axk.c($$1);
      int $$6 = axk.a($$0.c);
      int $$7 = axk.c($$0.f);
      boolean $$8 = false;
      ib.a $$9 = new ib.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eks $$13 = this.dM().b_($$9);
               if ($$13.a(avh.a) && $$1 < (double)((float)$$9.v() + $$13.a((cyd)this.dM(), $$9))) {
                  if (!$$13.b()) {
                     return clq.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? clq.a.b : null;
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.aX();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aN == clq.a.e && this.aM != clq.a.e && this.aM != clq.a.d) {
         this.aK = this.e(1.0);
         this.a_(this.dr(), (double)(this.u() - this.dh()) + 0.101, this.dx());
         this.g(this.dp().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = clq.a.a;
      } else {
         if (this.aM == clq.a.a) {
            $$1 = (this.aK - this.dt()) / (double)this.dh();
            this.p = 0.9F;
         } else if (this.aM == clq.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == clq.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == clq.a.e) {
            this.p = 0.9F;
         } else if (this.aM == clq.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cjt) {
               this.aL /= 2.0F;
            }
         }

         esa $$2 = this.dp();
         this.o($$2.c * (double)this.p, $$2.d + $$0, $$2.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            esa $$3 = this.dp();
            this.o($$3.c, ($$3.d + $$1 * (this.aW() / 0.65)) * 0.75, $$3.e);
         }
      }
   }

   private void G() {
      if (this.bP()) {
         float $$0 = 0.0F;
         if (this.aG) {
            this.r--;
         }

         if (this.aH) {
            this.r++;
         }

         if (this.aH != this.aG && !this.aI && !this.aJ) {
            $$0 += 0.005F;
         }

         this.r(this.dC() + this.r);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.g(this.dp().b((double)(axk.a(-this.dC() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(axk.b(this.dC() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(bpv $$0) {
      return $$0.dg() < this.dg();
   }

   @Override
   protected void a(bpv $$0, bpv.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ai().a(avf.s)) {
         $$0.r($$0.dC() + this.r);
         $$0.n($$0.cp() + this.r);
         this.c($$0);
         if ($$0 instanceof ccd && this.cP().size() == this.y()) {
            int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
            $$0.o(((ccd)$$0).aX + (float)$$2);
            $$0.n($$0.cp() + (float)$$2);
         }
      }
   }

   @Override
   public esa b(bqo $$0) {
      esa $$1 = a((double)(this.dg() * axk.g), (double)$$0.dg(), $$0.dC());
      double $$2 = this.dr() + $$1.c;
      double $$3 = this.dx() + $$1.e;
      ib $$4 = ib.a($$2, this.cH().e, $$3);
      ib $$5 = $$4.d();
      if (!this.dM().z($$5)) {
         List<esa> $$6 = Lists.newArrayList();
         double $$7 = this.dM().j($$4);
         if (clt.a($$7)) {
            $$6.add(new esa($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dM().j($$5);
         if (clt.a($$8)) {
            $$6.add(new esa($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fF().iterator();

         while (var14.hasNext()) {
            bqz $$9 = (bqz)var14.next();

            for (esa $$10 : $$6) {
               if (clt.a(this.dM(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bpv $$0) {
      $$0.o(this.dC());
      float $$1 = axk.g($$0.dC() - this.dC());
      float $$2 = axk.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dC() + $$2 - $$1);
      $$0.n($$0.dC());
   }

   @Override
   public void k(bpv $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tm $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(tm $$0) {
      if ($$0.b("Type", 8)) {
         this.a(clq.b.a($$0.l("Type")));
      }
   }

   @Override
   public boa a(cjt $$0, bnz $$1) {
      if ($$0.fO()) {
         return boa.d;
      } else if (this.q < 60.0F) {
         if (!this.dM().B) {
            return $$0.n(this) ? boa.b : boa.d;
         } else {
            return boa.a;
         }
      } else {
         return boa.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
      this.aO = this.dp().d;
      if (!this.bO()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != clq.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dN().k());
               if (!this.dM().B && !this.dH()) {
                  this.al();
                  if (this.dM().aa().b(cyt.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(crm.po);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dM().b_(this.dm().d()).a(avh.a) && $$0 < 0.0) {
            this.ab -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.an.a($$0 == 0 ? j : k) && this.cN() != null;
   }

   private void b(int $$0) {
      this.an.a(l, $$0);
   }

   private int H() {
      return this.an.a(l);
   }

   public float a(float $$0) {
      return axk.i($$0, this.aT, this.aS);
   }

   public void a(clq.b $$0) {
      this.an.a(i, $$0.ordinal());
   }

   public clq.b x() {
      return clq.b.a(this.an.a(i));
   }

   @Override
   protected boolean r(bpv $$0) {
      return this.cP().size() < this.y() && !this.a(avh.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public bqo cN() {
      return this.cQ() instanceof bqo $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected wg co() {
      return wg.c(this.ag_().a());
   }

   @Override
   public boolean bh() {
      return this.aM == clq.a.b || this.aM == clq.a.c;
   }

   @Override
   public crj dz() {
      return new crj(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements aye {
      a(dca.n, "oak"),
      b(dca.o, "spruce"),
      c(dca.p, "birch"),
      d(dca.q, "jungle"),
      e(dca.r, "acacia"),
      f(dca.s, "cherry"),
      g(dca.t, "dark_oak"),
      h(dca.u, "mangrove"),
      i(dca.v, "bamboo");

      private final String k;
      private final dby l;
      public static final aye.a<clq.b> j = aye.a(clq.b::values);
      private static final IntFunction<clq.b> m = awb.a(Enum::ordinal, values(), awb.a.a);

      private b(dby $$0, String $$1) {
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

      public dby b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static clq.b a(int $$0) {
         return m.apply($$0);
      }

      public static clq.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
