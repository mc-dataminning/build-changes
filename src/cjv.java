import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjv extends ckg implements bpw<cjv.b> {
   private static final aii<Integer> i = ail.a(cjv.class, aik.b);
   private static final aii<Boolean> j = ail.a(cjv.class, aik.k);
   private static final aii<Boolean> k = ail.a(cjv.class, aik.k);
   private static final aii<Integer> l = ail.a(cjv.class, aik.b);
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
   private cjv.a aL;
   private cjv.a aM;
   private double aN;
   private boolean aO;
   private boolean aP;
   private float aQ;
   private float aR;
   private float aS;

   public cjv(bol<? extends cjv> $$0, cwe $$1) {
      super($$0, $$1);
      this.H = true;
   }

   public cjv(cwe $$0, double $$1, double $$2, double $$3) {
      this(bol.l, $$0);
      this.a_($$1, $$2, $$3);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(i, cjv.b.a.ordinal());
      this.am.a(j, false);
      this.am.a(k, false);
      this.am.a(l, 0);
   }

   @Override
   public boolean h(bof $$0) {
      return a(this, $$0);
   }

   public static boolean a(bof $$0, bof $$1) {
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
   protected eov a(ih.a $$0, l.a $$1) {
      return box.i(super.a($$0, $$1));
   }

   @Override
   protected eov a(bof $$0, boi $$1, float $$2) {
      float $$3 = this.x();
      if (this.cM().size() > 1) {
         int $$4 = this.cM().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cam) {
            $$3 += 0.2F;
         }
      }

      return new eov(0.0, this.y() == cjv.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dz() * (float) (Math.PI / 180.0));
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dJ().B) {
         this.aO = true;
         this.aP = $$0;
         if (this.I() == 0) {
            this.b(60);
         }
      }

      this.dJ().a(kb.aj, this.do() + (double)this.af.i(), this.dq() + 0.7, this.du() + (double)this.af.i(), 0.0, 0.0, 0.0);
      if (this.af.a(20) == 0) {
         this.dJ().a(this.do(), this.dq(), this.du(), this.aO(), this.cY(), 1.0F, 0.8F + 0.4F * this.af.i(), false);
         this.a(dqr.O, this.cK());
      }
   }

   @Override
   public void g(bof $$0) {
      if ($$0 instanceof cjv) {
         if ($$0.cE().b < this.cE().e) {
            super.g($$0);
         }
      } else if ($$0.cE().b <= this.cE().b) {
         super.g($$0);
      }
   }

   @Override
   public cpl ai_() {
      return switch (this.y()) {
         case b -> cpt.nV;
         case c -> cpt.nX;
         case d -> cpt.nZ;
         case e -> cpt.ob;
         case f -> cpt.od;
         case g -> cpt.of;
         case h -> cpt.oh;
         case i -> cpt.oj;
         default -> cpt.nT;
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
      return !this.dE();
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
      return this.s > 0 ? this.t : this.do();
   }

   @Override
   public double N_() {
      return this.s > 0 ? this.u : this.dq();
   }

   @Override
   public double O_() {
      return this.s > 0 ? this.v : this.du();
   }

   @Override
   public float f_() {
      return this.s > 0 ? (float)this.aE : this.dB();
   }

   @Override
   public float q_() {
      return this.s > 0 ? (float)this.aD : this.dz();
   }

   @Override
   public ih cC() {
      return this.cB().h();
   }

   @Override
   public void l() {
      this.aM = this.aL;
      this.aL = this.C();
      if (this.aL != cjv.a.b && this.aL != cjv.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dJ().B && this.q >= 60.0F) {
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
      if (this.cU()) {
         if (!(this.cN() instanceof cia)) {
            this.a(false, false);
         }

         this.G();
         if (this.dJ().B) {
            this.H();
            this.dJ().a(new afu(this.c(0), this.c(1)));
         }

         this.a(bpc.a, this.dm());
      } else {
         this.g(eov.b);
      }

      this.A();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               ato $$1 = this.s();
               if ($$1 != null) {
                  eov $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dJ().a(null, this.do() + $$3, this.dq(), this.du() + $$4, $$1, this.cY(), 1.0F, 0.8F + 0.4F * this.af.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aQ();
      List<bof> $$5 = this.dJ().a(this, this.cE().c(0.2F, -0.01F, 0.2F), bok.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dJ().B && !(this.cK() instanceof cia);

         for (bof $$7 : $$5) {
            if (!$$7.w(this)) {
               if ($$6 && this.cM().size() < this.z() && !$$7.bL() && this.a($$7) && $$7 instanceof box && !($$7 instanceof cbo) && !($$7 instanceof cia)) {
                  $$7.m(this);
               } else {
                  this.g($$7);
               }
            }
         }
      }
   }

   private void A() {
      if (this.dJ().B) {
         int $$0 = this.I();
         if ($$0 > 0) {
            this.aQ += 0.05F;
         } else {
            this.aQ -= 0.1F;
         }

         this.aQ = awm.a(this.aQ, 0.0F, 1.0F);
         this.aS = this.aR;
         this.aR = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dJ().X())) * this.aQ;
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
               eov $$3 = this.dm();
               if (this.aP) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bB();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cia) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aO = false;
         }
      }
   }

   @Nullable
   protected ato s() {
      switch (this.C()) {
         case a:
         case b:
         case c:
            return atp.ck;
         case d:
            return atp.cj;
         case e:
         default:
            return null;
      }
   }

   private void B() {
      if (this.cU()) {
         this.s = 0;
         this.f(this.do(), this.dq(), this.du());
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
      return this.c($$0) ? awm.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cjv.a C() {
      cjv.a $$0 = this.E();
      if ($$0 != null) {
         this.aJ = this.cE().e;
         return $$0;
      } else if (this.D()) {
         return cjv.a.a;
      } else {
         float $$1 = this.w();
         if ($$1 > 0.0F) {
            this.aK = $$1;
            return cjv.a.d;
         } else {
            return cjv.a.e;
         }
      }
   }

   public float u() {
      eoq $$0 = this.cE();
      int $$1 = awm.a($$0.a);
      int $$2 = awm.c($$0.d);
      int $$3 = awm.a($$0.e);
      int $$4 = awm.c($$0.e - this.aN);
      int $$5 = awm.a($$0.c);
      int $$6 = awm.c($$0.f);
      ib.a $$7 = new ib.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ehr $$12 = this.dJ().b_($$7);
               if ($$12.a(auj.a)) {
                  $$9 = Math.max($$9, $$12.a((cvk)this.dJ(), $$7));
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
      eoq $$0 = this.cE();
      eoq $$1 = new eoq($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = awm.a($$1.a) - 1;
      int $$3 = awm.c($$1.d) + 1;
      int $$4 = awm.a($$1.b) - 1;
      int $$5 = awm.c($$1.e) + 1;
      int $$6 = awm.a($$1.c) - 1;
      int $$7 = awm.c($$1.f) + 1;
      epo $$8 = epl.a($$1);
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
                     dme $$16 = this.dJ().a_($$11);
                     if (!($$16.b() instanceof dih) && epl.c($$16.k(this.dJ(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, eoz.i)) {
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

   private boolean D() {
      eoq $$0 = this.cE();
      int $$1 = awm.a($$0.a);
      int $$2 = awm.c($$0.d);
      int $$3 = awm.a($$0.b);
      int $$4 = awm.c($$0.b + 0.001);
      int $$5 = awm.a($$0.c);
      int $$6 = awm.c($$0.f);
      boolean $$7 = false;
      this.aJ = -Double.MAX_VALUE;
      ib.a $$8 = new ib.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ehr $$12 = this.dJ().b_($$8);
               if ($$12.a(auj.a)) {
                  float $$13 = (float)$$10 + $$12.a((cvk)this.dJ(), $$8);
                  this.aJ = Math.max((double)$$13, this.aJ);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cjv.a E() {
      eoq $$0 = this.cE();
      double $$1 = $$0.e + 0.001;
      int $$2 = awm.a($$0.a);
      int $$3 = awm.c($$0.d);
      int $$4 = awm.a($$0.e);
      int $$5 = awm.c($$1);
      int $$6 = awm.a($$0.c);
      int $$7 = awm.c($$0.f);
      boolean $$8 = false;
      ib.a $$9 = new ib.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ehr $$13 = this.dJ().b_($$9);
               if ($$13.a(auj.a) && $$1 < (double)((float)$$9.v() + $$13.a((cvk)this.dJ(), $$9))) {
                  if (!$$13.b()) {
                     return cjv.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cjv.a.b : null;
   }

   private void G() {
      double $$0 = -0.04F;
      double $$1 = this.aV() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aM == cjv.a.e && this.aL != cjv.a.e && this.aL != cjv.a.d) {
         this.aJ = this.e(1.0);
         this.a_(this.do(), (double)(this.u() - this.de()) + 0.101, this.du());
         this.g(this.dm().d(1.0, 0.0, 1.0));
         this.aN = 0.0;
         this.aL = cjv.a.a;
      } else {
         if (this.aL == cjv.a.a) {
            $$2 = (this.aJ - this.dq()) / (double)this.de();
            this.p = 0.9F;
         } else if (this.aL == cjv.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aL == cjv.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aL == cjv.a.e) {
            this.p = 0.9F;
         } else if (this.aL == cjv.a.d) {
            this.p = this.aK;
            if (this.cK() instanceof cia) {
               this.aK /= 2.0F;
            }
         }

         eov $$3 = this.dm();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            eov $$4 = this.dm();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void H() {
      if (this.bM()) {
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

         this.r(this.dz() + this.r);
         if (this.aH) {
            $$0 += 0.04F;
         }

         if (this.aI) {
            $$0 -= 0.005F;
         }

         this.g(this.dm().b((double)(awm.a(-this.dz() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(awm.b(this.dz() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aG && !this.aF || this.aH, this.aF && !this.aG || this.aH);
      }
   }

   protected float x() {
      return 0.0F;
   }

   public boolean a(bof $$0) {
      return $$0.dd() < this.dd();
   }

   @Override
   protected void a(bof $$0, bof.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ai().a(auh.s)) {
         $$0.r($$0.dz() + this.r);
         $$0.n($$0.cm() + this.r);
         this.b($$0);
         if ($$0 instanceof cam && this.cM().size() == this.z()) {
            int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
            $$0.o(((cam)$$0).aV + (float)$$2);
            $$0.n($$0.cm() + (float)$$2);
         }
      }
   }

   @Override
   public eov b(box $$0) {
      eov $$1 = a((double)(this.dd() * awm.g), (double)$$0.dd(), $$0.dz());
      double $$2 = this.do() + $$1.c;
      double $$3 = this.du() + $$1.e;
      ib $$4 = ib.a($$2, this.cE().e, $$3);
      ib $$5 = $$4.d();
      if (!this.dJ().z($$5)) {
         List<eov> $$6 = Lists.newArrayList();
         double $$7 = this.dJ().j($$4);
         if (cjy.a($$7)) {
            $$6.add(new eov($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dJ().j($$5);
         if (cjy.a($$8)) {
            $$6.add(new eov($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fC().iterator();

         while (var14.hasNext()) {
            bpi $$9 = (bpi)var14.next();

            for (eov $$10 : $$6) {
               if (cjy.a(this.dJ(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(bof $$0) {
      $$0.o(this.dz());
      float $$1 = awm.g($$0.dz() - this.dz());
      float $$2 = awm.a($$1, -105.0F, 105.0F);
      $$0.M += $$2 - $$1;
      $$0.r($$0.dz() + $$2 - $$1);
      $$0.n($$0.dz());
   }

   @Override
   public void j(bof $$0) {
      this.b($$0);
   }

   @Override
   protected void b(sy $$0) {
      $$0.a("Type", this.y().c());
   }

   @Override
   protected void a(sy $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cjv.b.a($$0.l("Type")));
      }
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      if ($$0.fK()) {
         return bml.d;
      } else if (this.q < 60.0F) {
         if (!this.dJ().B) {
            return $$0.m(this) ? bml.b : bml.d;
         } else {
            return bml.a;
         }
      } else {
         return bml.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
      this.aN = this.dm().d;
      if (!this.bL()) {
         if ($$1) {
            if (this.aa > 3.0F) {
               if (this.aL != cjv.a.d) {
                  this.n();
                  return;
               }

               this.a(this.aa, 1.0F, this.dK().k());
               if (!this.dJ().B && !this.dE()) {
                  this.al();
                  if (this.dJ().Z().b(cwa.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.y().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cpt.po);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dJ().b_(this.dj().d()).a(auj.a) && $$0 < 0.0) {
            this.aa -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.am.b($$0 == 0 ? j : k) && this.cK() != null;
   }

   private void b(int $$0) {
      this.am.b(l, $$0);
   }

   private int I() {
      return this.am.b(l);
   }

   public float a(float $$0) {
      return awm.i($$0, this.aS, this.aR);
   }

   public void a(cjv.b $$0) {
      this.am.b(i, $$0.ordinal());
   }

   public cjv.b y() {
      return cjv.b.a(this.am.b(i));
   }

   @Override
   protected boolean q(bof $$0) {
      return this.cM().size() < this.z() && !this.a(auj.a);
   }

   protected int z() {
      return 2;
   }

   @Nullable
   @Override
   public box cK() {
      return this.cN() instanceof box $$0 ? $$0 : super.cK();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aF = $$0;
      this.aG = $$1;
      this.aH = $$2;
      this.aI = $$3;
   }

   @Override
   protected vs cl() {
      return vs.c(this.ai_().a());
   }

   @Override
   public boolean be() {
      return this.aL == cjv.a.b || this.aL == cjv.a.c;
   }

   @Override
   public cpq dw() {
      return new cpq(this.ai_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements axg {
      a(czh.n, "oak"),
      b(czh.o, "spruce"),
      c(czh.p, "birch"),
      d(czh.q, "jungle"),
      e(czh.r, "acacia"),
      f(czh.s, "cherry"),
      g(czh.t, "dark_oak"),
      h(czh.u, "mangrove"),
      i(czh.v, "bamboo");

      private final String k;
      private final czf l;
      public static final axg.a<cjv.b> j = axg.a(cjv.b::values);
      private static final IntFunction<cjv.b> m = ave.a(Enum::ordinal, values(), ave.a.a);

      private b(czf $$0, String $$1) {
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

      public czf b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cjv.b a(int $$0) {
         return m.apply($$0);
      }

      public static cjv.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
