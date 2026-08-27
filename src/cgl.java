import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cgl extends cgw implements bmt<cgl.b> {
   private static final afz<Integer> i = agc.a(cgl.class, agb.b);
   private static final afz<Boolean> j = agc.a(cgl.class, agb.k);
   private static final afz<Boolean> k = agc.a(cgl.class, agb.k);
   private static final afz<Integer> l = agc.a(cgl.class, agb.b);
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
   private cgl.a aM;
   private cgl.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cgl(blj<? extends cgl> $$0, csy $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cgl(csy $$0, double $$1, double $$2, double $$3) {
      this(blj.k, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(bmh $$0, blg $$1) {
      return $$1.b;
   }

   @Override
   protected blf.b aW() {
      return blf.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(i, cgl.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(blf $$0) {
      return a(this, $$0);
   }

   public static boolean a(blf $$0, blf $$1) {
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
   protected elb a(ia.a $$0, l.a $$1) {
      return blv.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      float $$3 = this.x();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bxi) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.y() == cgl.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dM().B) {
         this.aP = true;
         this.aQ = $$0;
         if (this.I() == 0) {
            this.b(60);
         }
      }

      this.dM().a(jv.aj, this.dr() + (double)this.ag.i(), this.dt() + 0.7, this.dx() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), this.aO(), this.db(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(dmz.O, this.cN());
      }
   }

   @Override
   public void g(blf $$0) {
      if ($$0 instanceof cgl) {
         if ($$0.cH().b < this.cH().e) {
            super.g($$0);
         }
      } else if ($$0.cH().b <= this.cH().b) {
         super.g($$0);
      }
   }

   @Override
   public cmc ah_() {
      return switch (this.y()) {
         case b -> cmk.nV;
         case c -> cmk.nX;
         case d -> cmk.nZ;
         case e -> cmk.ob;
         case f -> cmk.od;
         case g -> cmk.of;
         case h -> cmk.oh;
         case i -> cmk.oj;
         default -> cmk.nT;
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
      return this.s > 0 ? (float)this.aF : this.dE();
   }

   @Override
   public float q_() {
      return this.s > 0 ? (float)this.aE : this.dC();
   }

   @Override
   public ia cF() {
      return this.cE().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.C();
      if (this.aM != cgl.a.b && this.aM != cgl.a.c) {
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
         if (!(this.cQ() instanceof cer)) {
            this.a(false, false);
         }

         this.G();
         if (this.dM().B) {
            this.H();
            this.dM().a(new adv(this.c(0), this.c(1)));
         }

         this.a(bmb.a, this.dp());
      } else {
         this.g(elb.b);
      }

      this.A();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               arb $$1 = this.s();
               if ($$1 != null) {
                  elb $$2 = this.f(1.0F);
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
      List<blf> $$5 = this.dM().a(this, this.cH().c(0.2F, -0.01F, 0.2F), bli.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dM().B && !(this.cN() instanceof cer);

         for (blf $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.z() && !$$7.bO() && this.a($$7) && $$7 instanceof blv && !($$7 instanceof byk) && !($$7 instanceof cer)) {
                  $$7.n(this);
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
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = aty.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dM().W())) * this.aR;
      } else {
         if (!this.aP) {
            this.b(0);
         }

         int $$1 = this.I();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               elb $$3 = this.dp();
               if (this.aQ) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bB();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cer) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected arb s() {
      switch (this.C()) {
         case a:
         case b:
         case c:
            return arc.bX;
         case d:
            return arc.bW;
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
         this.a(this.s, this.t, this.u, this.v, this.aE, this.aF);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.an.b(j, $$0);
      this.an.b(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? aty.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cgl.a C() {
      cgl.a $$0 = this.E();
      if ($$0 != null) {
         this.aK = this.cH().e;
         return $$0;
      } else if (this.D()) {
         return cgl.a.a;
      } else {
         float $$1 = this.w();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cgl.a.d;
         } else {
            return cgl.a.e;
         }
      }
   }

   public float u() {
      ekw $$0 = this.cH();
      int $$1 = aty.a($$0.a);
      int $$2 = aty.c($$0.d);
      int $$3 = aty.a($$0.e);
      int $$4 = aty.c($$0.e - this.aO);
      int $$5 = aty.a($$0.c);
      int $$6 = aty.c($$0.f);
      hv.a $$7 = new hv.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               edz $$12 = this.dM().b_($$7);
               if ($$12.a(arw.a)) {
                  $$9 = Math.max($$9, $$12.a((cse)this.dM(), $$7));
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
      ekw $$0 = this.cH();
      ekw $$1 = new ekw($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = aty.a($$1.a) - 1;
      int $$3 = aty.c($$1.d) + 1;
      int $$4 = aty.a($$1.b) - 1;
      int $$5 = aty.c($$1.e) + 1;
      int $$6 = aty.a($$1.c) - 1;
      int $$7 = aty.c($$1.f) + 1;
      elu $$8 = elr.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      hv.a $$11 = new hv.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dip $$16 = this.dM().a_($$11);
                     if (!($$16.b() instanceof dfa) && elr.c($$16.k(this.dM(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, elf.i)) {
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
      ekw $$0 = this.cH();
      int $$1 = aty.a($$0.a);
      int $$2 = aty.c($$0.d);
      int $$3 = aty.a($$0.b);
      int $$4 = aty.c($$0.b + 0.001);
      int $$5 = aty.a($$0.c);
      int $$6 = aty.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      hv.a $$8 = new hv.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               edz $$12 = this.dM().b_($$8);
               if ($$12.a(arw.a)) {
                  float $$13 = (float)$$10 + $$12.a((cse)this.dM(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cgl.a E() {
      ekw $$0 = this.cH();
      double $$1 = $$0.e + 0.001;
      int $$2 = aty.a($$0.a);
      int $$3 = aty.c($$0.d);
      int $$4 = aty.a($$0.e);
      int $$5 = aty.c($$1);
      int $$6 = aty.a($$0.c);
      int $$7 = aty.c($$0.f);
      boolean $$8 = false;
      hv.a $$9 = new hv.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               edz $$13 = this.dM().b_($$9);
               if ($$13.a(arw.a) && $$1 < (double)((float)$$9.v() + $$13.a((cse)this.dM(), $$9))) {
                  if (!$$13.b()) {
                     return cgl.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cgl.a.b : null;
   }

   private void G() {
      double $$0 = -0.04F;
      double $$1 = this.aV() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cgl.a.e && this.aM != cgl.a.e && this.aM != cgl.a.d) {
         this.aK = this.e(1.0);
         this.a_(this.dr(), (double)(this.u() - this.dh()) + 0.101, this.dx());
         this.g(this.dp().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cgl.a.a;
      } else {
         if (this.aM == cgl.a.a) {
            $$2 = (this.aK - this.dt()) / (double)this.dh();
            this.p = 0.9F;
         } else if (this.aM == cgl.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cgl.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cgl.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cgl.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cer) {
               this.aL /= 2.0F;
            }
         }

         elb $$3 = this.dp();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            elb $$4 = this.dp();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void H() {
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

         this.g(this.dp().b((double)(aty.a(-this.dC() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(aty.b(this.dC() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float x() {
      return 0.0F;
   }

   public boolean a(blf $$0) {
      return $$0.dg() < this.dg();
   }

   @Override
   protected void a(blf $$0, blf.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dC() + this.r);
      $$0.n($$0.cp() + this.r);
      this.b($$0);
      if ($$0 instanceof bxi && this.cP().size() == this.z()) {
         int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
         $$0.o(((bxi)$$0).aU + (float)$$2);
         $$0.n($$0.cp() + (float)$$2);
      }
   }

   @Override
   public elb b(blv $$0) {
      elb $$1 = a((double)(this.dg() * aty.g), (double)$$0.dg(), $$0.dC());
      double $$2 = this.dr() + $$1.c;
      double $$3 = this.dx() + $$1.e;
      hv $$4 = hv.a($$2, this.cH().e, $$3);
      hv $$5 = $$4.d();
      if (!this.dM().y($$5)) {
         List<elb> $$6 = Lists.newArrayList();
         double $$7 = this.dM().i($$4);
         if (cgo.a($$7)) {
            $$6.add(new elb($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dM().i($$5);
         if (cgo.a($$8)) {
            $$6.add(new elb($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fA().iterator();

         while (var14.hasNext()) {
            bmh $$9 = (bmh)var14.next();

            for (elb $$10 : $$6) {
               if (cgo.a(this.dM(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(blf $$0) {
      $$0.o(this.dC());
      float $$1 = aty.g($$0.dC() - this.dC());
      float $$2 = aty.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dC() + $$2 - $$1);
      $$0.n($$0.dC());
   }

   @Override
   public void j(blf $$0) {
      this.b($$0);
   }

   @Override
   protected void b(sj $$0) {
      $$0.a("Type", this.y().c());
   }

   @Override
   protected void a(sj $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cgl.b.a($$0.l("Type")));
      }
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      if ($$0.fI()) {
         return bjl.d;
      } else if (this.q < 60.0F) {
         if (!this.dM().B) {
            return $$0.n(this) ? bjl.b : bjl.d;
         } else {
            return bjl.a;
         }
      } else {
         return bjl.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dip $$2, hv $$3) {
      this.aO = this.dp().d;
      if (!this.bO()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != cgl.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dN().k());
               if (!this.dM().B && !this.dH()) {
                  this.al();
                  if (this.dM().Y().b(csu.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.y().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cmk.pm);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dM().b_(this.dm().d()).a(arw.a) && $$0 < 0.0) {
            this.ab -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.an.b($$0 == 0 ? j : k) && this.cN() != null;
   }

   private void b(int $$0) {
      this.an.b(l, $$0);
   }

   private int I() {
      return this.an.b(l);
   }

   public float a(float $$0) {
      return aty.i($$0, this.aT, this.aS);
   }

   public void a(cgl.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public cgl.b y() {
      return cgl.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(blf $$0) {
      return this.cP().size() < this.z() && !this.a(arw.a);
   }

   protected int z() {
      return 2;
   }

   @Nullable
   @Override
   public blv cN() {
      return this.cQ() instanceof blv $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected vb co() {
      return vb.c(this.ah_().a());
   }

   @Override
   public boolean be() {
      return this.aM == cgl.a.b || this.aM == cgl.a.c;
   }

   @Override
   public cmh dz() {
      return new cmh(this.ah_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements aut {
      a(cwb.n, "oak"),
      b(cwb.o, "spruce"),
      c(cwb.p, "birch"),
      d(cwb.q, "jungle"),
      e(cwb.r, "acacia"),
      f(cwb.s, "cherry"),
      g(cwb.t, "dark_oak"),
      h(cwb.u, "mangrove"),
      i(cwb.v, "bamboo");

      private final String k;
      private final cvz l;
      public static final aut.a<cgl.b> j = aut.a(cgl.b::values);
      private static final IntFunction<cgl.b> m = asq.a(Enum::ordinal, values(), asq.a.a);

      private b(cvz $$0, String $$1) {
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

      public cvz b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cgl.b a(int $$0) {
         return m.apply($$0);
      }

      public static cgl.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
