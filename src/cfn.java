import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cfn extends cfy implements bme<cfn.b> {
   private static final afo<Integer> i = afr.a(cfn.class, afq.b);
   private static final afo<Boolean> j = afr.a(cfn.class, afq.k);
   private static final afo<Boolean> k = afr.a(cfn.class, afq.k);
   private static final afo<Integer> l = afr.a(cfn.class, afq.b);
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
   private cfn.a aM;
   private cfn.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cfn(bku<? extends cfn> $$0, csa $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cfn(csa $$0, double $$1, double $$2, double $$3) {
      this(bku.k, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(bls $$0, bkr $$1) {
      return $$1.b;
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.c;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(i, cfn.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(bkq $$0) {
      return a(this, $$0);
   }

   public static boolean a(bkq $$0, bkq $$1) {
      return ($$1.bz() || $$1.bu()) && !$$0.y($$1);
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
   protected eju a(hx.a $$0, l.a $$1) {
      return blg.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      float $$3 = this.x();
      if (this.cQ().size() > 1) {
         int $$4 = this.cQ().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bwr) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.y() == cfn.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dN().B) {
         this.aP = true;
         this.aQ = $$0;
         if (this.J() == 0) {
            this.b(60);
         }
      }

      this.dN().a(js.ah, this.ds() + (double)this.ag.i(), this.du() + 0.7, this.dy() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dN().a(this.ds(), this.du(), this.dy(), this.aO(), this.dc(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(dls.O, this.cO());
      }
   }

   @Override
   public void g(bkq $$0) {
      if ($$0 instanceof cfn) {
         if ($$0.cH().b < this.cH().e) {
            super.g($$0);
         }
      } else if ($$0.cH().b <= this.cH().b) {
         super.g($$0);
      }
   }

   @Override
   public cle ag_() {
      return switch (this.y()) {
         case b -> clm.nV;
         case c -> clm.nX;
         case d -> clm.nZ;
         case e -> clm.ob;
         case f -> clm.od;
         case g -> clm.of;
         case h -> clm.oh;
         case i -> clm.oj;
         default -> clm.nT;
      };
   }

   @Override
   public void m(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bt() {
      return !this.dI();
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
   public double o_() {
      return this.s > 0 ? this.t : this.ds();
   }

   @Override
   public double M_() {
      return this.s > 0 ? this.u : this.du();
   }

   @Override
   public double N_() {
      return this.s > 0 ? this.v : this.dy();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aF : this.dF();
   }

   @Override
   public float p_() {
      return this.s > 0 ? (float)this.aE : this.dD();
   }

   @Override
   public hx cF() {
      return this.cE().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.C();
      if (this.aM != cfn.a.b && this.aM != cfn.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dN().B && this.q >= 60.0F) {
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
      if (this.cY()) {
         if (!(this.cR() instanceof cdu)) {
            this.a(false, false);
         }

         this.H();
         if (this.dN().B) {
            this.I();
            this.dN().a(new adk(this.c(0), this.c(1)));
         }

         this.a(blm.a, this.dq());
      } else {
         this.g(eju.b);
      }

      this.A();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               aqq $$1 = this.s();
               if ($$1 != null) {
                  eju $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dN().a(null, this.ds() + $$3, this.du(), this.dy() + $$4, $$1, this.dc(), 1.0F, 0.8F + 0.4F * this.ag.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aQ();
      List<bkq> $$5 = this.dN().a(this, this.cH().c(0.2F, -0.01F, 0.2F), bkt.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dN().B && !(this.cO() instanceof cdu);

         for (bkq $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cQ().size() < this.z() && !$$7.bO() && this.a($$7) && $$7 instanceof blg && !($$7 instanceof bxt) && !($$7 instanceof cdu)) {
                  $$7.n(this);
               } else {
                  this.g($$7);
               }
            }
         }
      }
   }

   private void A() {
      if (this.dN().B) {
         int $$0 = this.J();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = atm.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dN().W())) * this.aR;
      } else {
         if (!this.aP) {
            this.b(0);
         }

         int $$1 = this.J();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               eju $$3 = this.dq();
               if (this.aQ) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bB();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cdu) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected aqq s() {
      switch (this.C()) {
         case a:
         case b:
         case c:
            return aqr.bX;
         case d:
            return aqr.bW;
         case e:
         default:
            return null;
      }
   }

   private void B() {
      if (this.cY()) {
         this.s = 0;
         this.f(this.ds(), this.du(), this.dy());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aE, this.aF);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.an.b(j, $$0);
      this.an.b(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? atm.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cfn.a C() {
      cfn.a $$0 = this.E();
      if ($$0 != null) {
         this.aK = this.cH().e;
         return $$0;
      } else if (this.D()) {
         return cfn.a.a;
      } else {
         float $$1 = this.w();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cfn.a.d;
         } else {
            return cfn.a.e;
         }
      }
   }

   public float u() {
      ejp $$0 = this.cH();
      int $$1 = atm.a($$0.a);
      int $$2 = atm.c($$0.d);
      int $$3 = atm.a($$0.e);
      int $$4 = atm.c($$0.e - this.aO);
      int $$5 = atm.a($$0.c);
      int $$6 = atm.c($$0.f);
      ht.a $$7 = new ht.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ecs $$12 = this.dN().b_($$7);
               if ($$12.a(arl.a)) {
                  $$9 = Math.max($$9, $$12.a((crg)this.dN(), $$7));
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
      ejp $$0 = this.cH();
      ejp $$1 = new ejp($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = atm.a($$1.a) - 1;
      int $$3 = atm.c($$1.d) + 1;
      int $$4 = atm.a($$1.b) - 1;
      int $$5 = atm.c($$1.e) + 1;
      int $$6 = atm.a($$1.c) - 1;
      int $$7 = atm.c($$1.f) + 1;
      ekn $$8 = ekk.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      ht.a $$11 = new ht.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dhi $$16 = this.dN().a_($$11);
                     if (!($$16.b() instanceof dea) && ekk.c($$16.k(this.dN(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ejy.i)) {
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
      ejp $$0 = this.cH();
      int $$1 = atm.a($$0.a);
      int $$2 = atm.c($$0.d);
      int $$3 = atm.a($$0.b);
      int $$4 = atm.c($$0.b + 0.001);
      int $$5 = atm.a($$0.c);
      int $$6 = atm.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      ht.a $$8 = new ht.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ecs $$12 = this.dN().b_($$8);
               if ($$12.a(arl.a)) {
                  float $$13 = (float)$$10 + $$12.a((crg)this.dN(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cfn.a E() {
      ejp $$0 = this.cH();
      double $$1 = $$0.e + 0.001;
      int $$2 = atm.a($$0.a);
      int $$3 = atm.c($$0.d);
      int $$4 = atm.a($$0.e);
      int $$5 = atm.c($$1);
      int $$6 = atm.a($$0.c);
      int $$7 = atm.c($$0.f);
      boolean $$8 = false;
      ht.a $$9 = new ht.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ecs $$13 = this.dN().b_($$9);
               if ($$13.a(arl.a) && $$1 < (double)((float)$$9.v() + $$13.a((crg)this.dN(), $$9))) {
                  if (!$$13.b()) {
                     return cfn.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cfn.a.b : null;
   }

   private void H() {
      double $$0 = -0.04F;
      double $$1 = this.aV() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cfn.a.e && this.aM != cfn.a.e && this.aM != cfn.a.d) {
         this.aK = this.e(1.0);
         this.a_(this.ds(), (double)(this.u() - this.di()) + 0.101, this.dy());
         this.g(this.dq().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cfn.a.a;
      } else {
         if (this.aM == cfn.a.a) {
            $$2 = (this.aK - this.du()) / (double)this.di();
            this.p = 0.9F;
         } else if (this.aM == cfn.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cfn.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cfn.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cfn.a.d) {
            this.p = this.aL;
            if (this.cO() instanceof cdu) {
               this.aL /= 2.0F;
            }
         }

         eju $$3 = this.dq();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            eju $$4 = this.dq();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void I() {
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

         this.r(this.dD() + this.r);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.g(this.dq().b((double)(atm.a(-this.dD() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(atm.b(this.dD() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float x() {
      return 0.0F;
   }

   public boolean a(bkq $$0) {
      return $$0.dh() < this.dh();
   }

   @Override
   protected void a(bkq $$0, bkq.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dD() + this.r);
      $$0.n($$0.cp() + this.r);
      this.b($$0);
      if ($$0 instanceof bwr && this.cQ().size() == this.z()) {
         int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
         $$0.o(((bwr)$$0).aU + (float)$$2);
         $$0.n($$0.cp() + (float)$$2);
      }
   }

   @Override
   public eju b(blg $$0) {
      eju $$1 = a((double)(this.dh() * atm.g), (double)$$0.dh(), $$0.dD());
      double $$2 = this.ds() + $$1.c;
      double $$3 = this.dy() + $$1.e;
      ht $$4 = ht.a($$2, this.cH().e, $$3);
      ht $$5 = $$4.d();
      if (!this.dN().y($$5)) {
         List<eju> $$6 = Lists.newArrayList();
         double $$7 = this.dN().i($$4);
         if (cfq.a($$7)) {
            $$6.add(new eju($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dN().i($$5);
         if (cfq.a($$8)) {
            $$6.add(new eju($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fB().iterator();

         while (var14.hasNext()) {
            bls $$9 = (bls)var14.next();

            for (eju $$10 : $$6) {
               if (cfq.a(this.dN(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(bkq $$0) {
      $$0.o(this.dD());
      float $$1 = atm.g($$0.dD() - this.dD());
      float $$2 = atm.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dD() + $$2 - $$1);
      $$0.n($$0.dD());
   }

   @Override
   public void j(bkq $$0) {
      this.b($$0);
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("Type", this.y().c());
   }

   @Override
   protected void a(rz $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cfn.b.a($$0.l("Type")));
      }
   }

   @Override
   public bix a(cdu $$0, biw $$1) {
      if ($$0.fJ()) {
         return bix.d;
      } else if (this.q < 60.0F) {
         if (!this.dN().B) {
            return $$0.n(this) ? bix.b : bix.d;
         } else {
            return bix.a;
         }
      } else {
         return bix.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
      this.aO = this.dq().d;
      if (!this.bO()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != cfn.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dO().k());
               if (!this.dN().B && !this.dI()) {
                  this.al();
                  if (this.dN().Y().b(crw.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.y().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(clm.pm);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dN().b_(this.dn().d()).a(arl.a) && $$0 < 0.0) {
            this.ab -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.an.b($$0 == 0 ? j : k) && this.cO() != null;
   }

   private void b(int $$0) {
      this.an.b(l, $$0);
   }

   private int J() {
      return this.an.b(l);
   }

   public float a(float $$0) {
      return atm.i($$0, this.aT, this.aS);
   }

   public void a(cfn.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public cfn.b y() {
      return cfn.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(bkq $$0) {
      return this.cQ().size() < this.z() && !this.a(arl.a);
   }

   protected int z() {
      return 2;
   }

   @Nullable
   @Override
   public blg cO() {
      return this.cR() instanceof blg $$0 ? $$0 : super.cO();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected ur co() {
      return ur.c(this.ag_().a());
   }

   @Override
   public boolean be() {
      return this.aM == cfn.a.b || this.aM == cfn.a.c;
   }

   @Override
   public clj dA() {
      return new clj(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements aug {
      a(cvc.n, "oak"),
      b(cvc.o, "spruce"),
      c(cvc.p, "birch"),
      d(cvc.q, "jungle"),
      e(cvc.r, "acacia"),
      f(cvc.s, "cherry"),
      g(cvc.t, "dark_oak"),
      h(cvc.u, "mangrove"),
      i(cvc.v, "bamboo");

      private final String k;
      private final cva l;
      public static final aug.a<cfn.b> j = aug.a(cfn.b::values);
      private static final IntFunction<cfn.b> m = asf.a(Enum::ordinal, values(), asf.a.a);

      private b(cva $$0, String $$1) {
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

      public cva b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cfn.b a(int $$0) {
         return m.apply($$0);
      }

      public static cfn.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
