import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjc extends cjn implements bpd<cjc.b> {
   private static final aie<Integer> i = aih.a(cjc.class, aig.b);
   private static final aie<Boolean> j = aih.a(cjc.class, aig.k);
   private static final aie<Boolean> k = aih.a(cjc.class, aig.k);
   private static final aie<Integer> l = aih.a(cjc.class, aig.b);
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
   private double aD;
   private double aE;
   private boolean aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private double aJ;
   private float aK;
   private cjc.a aL;
   private cjc.a aM;
   private double aN;
   private boolean aO;
   private boolean aP;
   private float aQ;
   private float aR;
   private float aS;

   public cjc(bnu<? extends cjc> $$0, cvn $$1) {
      super($$0, $$1);
      this.H = true;
   }

   public cjc(cvn $$0, double $$1, double $$2, double $$3) {
      this(bnu.l, $$0);
      this.a_($$1, $$2, $$3);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
   }

   @Override
   protected bno.b aW() {
      return bno.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(i, cjc.b.a.ordinal());
      this.am.a(j, false);
      this.am.a(k, false);
      this.am.a(l, 0);
   }

   @Override
   public boolean h(bno $$0) {
      return a(this, $$0);
   }

   public static boolean a(bno $$0, bno $$1) {
      return ($$1.bz() || $$1.bu()) && !$$0.x($$1);
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected ens a(ie.a $$0, l.a $$1) {
      return bog.i(super.a($$0, $$1));
   }

   @Override
   protected ens a(bno $$0, bnr $$1, float $$2) {
      float $$3 = this.x();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bzt) {
            $$3 += 0.2F;
         }
      }

      return new ens(0.0, this.y() == cjc.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dC() * (float) (Math.PI / 180.0));
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dM().B) {
         this.aO = true;
         this.aP = $$0;
         if (this.I() == 0) {
            this.b(60);
         }
      }

      this.dM().a(jz.aj, this.dr() + (double)this.af.i(), this.dt() + 0.7, this.dx() + (double)this.af.i(), 0.0, 0.0, 0.0);
      if (this.af.a(20) == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), this.aO(), this.db(), 1.0F, 0.8F + 0.4F * this.af.i(), false);
         this.a(dpp.O, this.cN());
      }
   }

   @Override
   public void g(bno $$0) {
      if ($$0 instanceof cjc) {
         if ($$0.cH().b < this.cH().e) {
            super.g($$0);
         }
      } else if ($$0.cH().b <= this.cH().b) {
         super.g($$0);
      }
   }

   @Override
   public cou ai_() {
      return switch (this.y()) {
         case b -> cpc.nV;
         case c -> cpc.nX;
         case d -> cpc.nZ;
         case e -> cpc.ob;
         case f -> cpc.od;
         case g -> cpc.of;
         case h -> cpc.oh;
         case i -> cpc.oj;
         default -> cpc.nT;
      };
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bt() {
      return !this.dH();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.aD = (double)$$3;
      this.aE = (double)$$4;
      this.s = 10;
   }

   @Override
   public double p_() {
      return this.s > 0 ? this.t : this.dr();
   }

   @Override
   public double N_() {
      return this.s > 0 ? this.u : this.dt();
   }

   @Override
   public double O_() {
      return this.s > 0 ? this.v : this.dx();
   }

   @Override
   public float f_() {
      return this.s > 0 ? (float)this.aE : this.dE();
   }

   @Override
   public float q_() {
      return this.s > 0 ? (float)this.aD : this.dC();
   }

   @Override
   public ie cF() {
      return this.cE().h();
   }

   @Override
   public void l() {
      this.aM = this.aL;
      this.aL = this.C();
      if (this.aL != cjc.a.b && this.aL != cjc.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dM().B && this.q >= 60.0F) {
         this.bB();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.B();
      if (this.cX()) {
         if (!(this.cQ() instanceof chh)) {
            this.a(false, false);
         }

         this.G();
         if (this.dM().B) {
            this.H();
            this.dM().a(new afq(this.c(0), this.c(1)));
         }

         this.a(bol.a, this.dp());
      } else {
         this.g(ens.b);
      }

      this.A();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               atj $$1 = this.s();
               if ($$1 != null) {
                  ens $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dM().a(null, this.dr() + $$3, this.dt(), this.dx() + $$4, $$1, this.db(), 1.0F, 0.8F + 0.4F * this.af.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aQ();
      List<bno> $$5 = this.dM().a(this, this.cH().c(0.2F, -0.01F, 0.2F), bnt.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dM().B && !(this.cN() instanceof chh);

         for (bno $$7 : $$5) {
            if (!$$7.w(this)) {
               if ($$6 && this.cP().size() < this.z() && !$$7.bO() && this.a($$7) && $$7 instanceof bog && !($$7 instanceof cav) && !($$7 instanceof chh)) {
                  $$7.m(this);
               } else {
                  this.g($$7);
               }
            }
         }
      }
   }

   private void A() {
      if (this.dM().B) {
         int $$0 = this.I();
         if ($$0 > 0) {
            this.aQ += 0.05F;
         } else {
            this.aQ -= 0.1F;
         }

         this.aQ = awh.a(this.aQ, 0.0F, 1.0F);
         this.aS = this.aR;
         this.aR = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dM().X())) * this.aQ;
      } else {
         if (!this.aO) {
            this.b(0);
         }

         int $$1 = this.I();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               ens $$3 = this.dp();
               if (this.aP) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bB();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof chh) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aO = false;
         }
      }
   }

   @Nullable
   protected atj s() {
      switch (this.C()) {
         case a:
         case b:
         case c:
            return atk.cj;
         case d:
            return atk.ci;
         case e:
         default:
            return null;
      }
   }

   private void B() {
      if (this.cX()) {
         this.s = 0;
         this.f(this.dr(), this.dt(), this.dx());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aD, this.aE);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.am.b(j, $$0);
      this.am.b(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? awh.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cjc.a C() {
      cjc.a $$0 = this.E();
      if ($$0 != null) {
         this.aJ = this.cH().e;
         return $$0;
      } else if (this.D()) {
         return cjc.a.a;
      } else {
         float $$1 = this.w();
         if ($$1 > 0.0F) {
            this.aK = $$1;
            return cjc.a.d;
         } else {
            return cjc.a.e;
         }
      }
   }

   public float u() {
      enn $$0 = this.cH();
      int $$1 = awh.a($$0.a);
      int $$2 = awh.c($$0.d);
      int $$3 = awh.a($$0.e);
      int $$4 = awh.c($$0.e - this.aN);
      int $$5 = awh.a($$0.c);
      int $$6 = awh.c($$0.f);
      hz.a $$7 = new hz.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               egp $$12 = this.dM().b_($$7);
               if ($$12.a(aue.a)) {
                  $$9 = Math.max($$9, $$12.a((cut)this.dM(), $$7));
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

   public float w() {
      enn $$0 = this.cH();
      enn $$1 = new enn($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = awh.a($$1.a) - 1;
      int $$3 = awh.c($$1.d) + 1;
      int $$4 = awh.a($$1.b) - 1;
      int $$5 = awh.c($$1.e) + 1;
      int $$6 = awh.a($$1.c) - 1;
      int $$7 = awh.c($$1.f) + 1;
      eol $$8 = eoi.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      hz.a $$11 = new hz.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dlf $$16 = this.dM().a_($$11);
                     if (!($$16.b() instanceof dhp) && eoi.c($$16.k(this.dM(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, enw.i)) {
                        $$9 += $$16.b().i();
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
      enn $$0 = this.cH();
      int $$1 = awh.a($$0.a);
      int $$2 = awh.c($$0.d);
      int $$3 = awh.a($$0.b);
      int $$4 = awh.c($$0.b + 0.001);
      int $$5 = awh.a($$0.c);
      int $$6 = awh.c($$0.f);
      boolean $$7 = false;
      this.aJ = -Double.MAX_VALUE;
      hz.a $$8 = new hz.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               egp $$12 = this.dM().b_($$8);
               if ($$12.a(aue.a)) {
                  float $$13 = (float)$$10 + $$12.a((cut)this.dM(), $$8);
                  this.aJ = Math.max((double)$$13, this.aJ);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cjc.a E() {
      enn $$0 = this.cH();
      double $$1 = $$0.e + 0.001;
      int $$2 = awh.a($$0.a);
      int $$3 = awh.c($$0.d);
      int $$4 = awh.a($$0.e);
      int $$5 = awh.c($$1);
      int $$6 = awh.a($$0.c);
      int $$7 = awh.c($$0.f);
      boolean $$8 = false;
      hz.a $$9 = new hz.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               egp $$13 = this.dM().b_($$9);
               if ($$13.a(aue.a) && $$1 < (double)((float)$$9.v() + $$13.a((cut)this.dM(), $$9))) {
                  if (!$$13.b()) {
                     return cjc.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cjc.a.b : null;
   }

   private void G() {
      double $$0 = -0.04F;
      double $$1 = this.aV() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aM == cjc.a.e && this.aL != cjc.a.e && this.aL != cjc.a.d) {
         this.aJ = this.e(1.0);
         this.a_(this.dr(), (double)(this.u() - this.dh()) + 0.101, this.dx());
         this.g(this.dp().d(1.0, 0.0, 1.0));
         this.aN = 0.0;
         this.aL = cjc.a.a;
      } else {
         if (this.aL == cjc.a.a) {
            $$2 = (this.aJ - this.dt()) / (double)this.dh();
            this.p = 0.9F;
         } else if (this.aL == cjc.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aL == cjc.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aL == cjc.a.e) {
            this.p = 0.9F;
         } else if (this.aL == cjc.a.d) {
            this.p = this.aK;
            if (this.cN() instanceof chh) {
               this.aK /= 2.0F;
            }
         }

         ens $$3 = this.dp();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            ens $$4 = this.dp();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void H() {
      if (this.bP()) {
         float $$0 = 0.0F;
         if (this.aF) {
            this.r--;
         }

         if (this.aG) {
            this.r++;
         }

         if (this.aG != this.aF && !this.aH && !this.aI) {
            $$0 += 0.005F;
         }

         this.r(this.dC() + this.r);
         if (this.aH) {
            $$0 += 0.04F;
         }

         if (this.aI) {
            $$0 -= 0.005F;
         }

         this.g(this.dp().b((double)(awh.a(-this.dC() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(awh.b(this.dC() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aG && !this.aF || this.aH, this.aF && !this.aG || this.aH);
      }
   }

   protected float x() {
      return 0.0F;
   }

   public boolean a(bno $$0) {
      return $$0.dg() < this.dg();
   }

   @Override
   protected void a(bno $$0, bno.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ai().a(auc.s)) {
         $$0.r($$0.dC() + this.r);
         $$0.n($$0.cp() + this.r);
         this.b($$0);
         if ($$0 instanceof bzt && this.cP().size() == this.z()) {
            int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
            $$0.o(((bzt)$$0).aU + (float)$$2);
            $$0.n($$0.cp() + (float)$$2);
         }
      }
   }

   @Override
   public ens b(bog $$0) {
      ens $$1 = a((double)(this.dg() * awh.g), (double)$$0.dg(), $$0.dC());
      double $$2 = this.dr() + $$1.c;
      double $$3 = this.dx() + $$1.e;
      hz $$4 = hz.a($$2, this.cH().e, $$3);
      hz $$5 = $$4.d();
      if (!this.dM().z($$5)) {
         List<ens> $$6 = Lists.newArrayList();
         double $$7 = this.dM().j($$4);
         if (cjf.a($$7)) {
            $$6.add(new ens($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dM().j($$5);
         if (cjf.a($$8)) {
            $$6.add(new ens($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fA().iterator();

         while (var14.hasNext()) {
            bor $$9 = (bor)var14.next();

            for (ens $$10 : $$6) {
               if (cjf.a(this.dM(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(bno $$0) {
      $$0.o(this.dC());
      float $$1 = awh.g($$0.dC() - this.dC());
      float $$2 = awh.a($$1, -105.0F, 105.0F);
      $$0.M += $$2 - $$1;
      $$0.r($$0.dC() + $$2 - $$1);
      $$0.n($$0.dC());
   }

   @Override
   public void j(bno $$0) {
      this.b($$0);
   }

   @Override
   protected void b(sw $$0) {
      $$0.a("Type", this.y().c());
   }

   @Override
   protected void a(sw $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cjc.b.a($$0.l("Type")));
      }
   }

   @Override
   public blu a(chh $$0, blt $$1) {
      if ($$0.fI()) {
         return blu.d;
      } else if (this.q < 60.0F) {
         if (!this.dM().B) {
            return $$0.m(this) ? blu.b : blu.d;
         } else {
            return blu.a;
         }
      } else {
         return blu.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dlf $$2, hz $$3) {
      this.aN = this.dp().d;
      if (!this.bO()) {
         if ($$1) {
            if (this.aa > 3.0F) {
               if (this.aL != cjc.a.d) {
                  this.n();
                  return;
               }

               this.a(this.aa, 1.0F, this.dN().k());
               if (!this.dM().B && !this.dH()) {
                  this.al();
                  if (this.dM().Z().b(cvj.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.y().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cpc.po);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dM().b_(this.dm().d()).a(aue.a) && $$0 < 0.0) {
            this.aa -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.am.b($$0 == 0 ? j : k) && this.cN() != null;
   }

   private void b(int $$0) {
      this.am.b(l, $$0);
   }

   private int I() {
      return this.am.b(l);
   }

   public float a(float $$0) {
      return awh.i($$0, this.aS, this.aR);
   }

   public void a(cjc.b $$0) {
      this.am.b(i, $$0.ordinal());
   }

   public cjc.b y() {
      return cjc.b.a(this.am.b(i));
   }

   @Override
   protected boolean q(bno $$0) {
      return this.cP().size() < this.z() && !this.a(aue.a);
   }

   protected int z() {
      return 2;
   }

   @Nullable
   @Override
   public bog cN() {
      return this.cQ() instanceof bog $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aF = $$0;
      this.aG = $$1;
      this.aH = $$2;
      this.aI = $$3;
   }

   @Override
   protected vq co() {
      return vq.c(this.ai_().a());
   }

   @Override
   public boolean be() {
      return this.aL == cjc.a.b || this.aL == cjc.a.c;
   }

   @Override
   public coz dz() {
      return new coz(this.ai_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements axc {
      a(cyq.n, "oak"),
      b(cyq.o, "spruce"),
      c(cyq.p, "birch"),
      d(cyq.q, "jungle"),
      e(cyq.r, "acacia"),
      f(cyq.s, "cherry"),
      g(cyq.t, "dark_oak"),
      h(cyq.u, "mangrove"),
      i(cyq.v, "bamboo");

      private final String k;
      private final cyo l;
      public static final axc.a<cjc.b> j = axc.a(cjc.b::values);
      private static final IntFunction<cjc.b> m = auz.a(Enum::ordinal, values(), auz.a.a);

      private b(cyo $$0, String $$1) {
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

      public cyo b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cjc.b a(int $$0) {
         return m.apply($$0);
      }

      public static cjc.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
