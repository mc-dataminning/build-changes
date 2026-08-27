import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cne extends cnp implements bsz<cne.b> {
   private static final ajm<Integer> i = ajq.a(cne.class, ajo.b);
   private static final ajm<Boolean> j = ajq.a(cne.class, ajo.k);
   private static final ajm<Boolean> k = ajq.a(cne.class, ajo.k);
   private static final ajm<Integer> l = ajq.a(cne.class, ajo.b);
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
   private double aF;
   private double aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private boolean aK;
   private double aL;
   private float aM;
   private cne.a aN;
   private cne.a aO;
   private double aP;
   private boolean aQ;
   private boolean aR;
   private float aS;
   private float aT;
   private float aU;

   public cne(brn<? extends cne> $$0, dad $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cne(dad $$0, double $$1, double $$2, double $$3) {
      this(brn.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected brh.b aZ() {
      return brh.b.c;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(i, cne.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(brh $$0) {
      return a(this, $$0);
   }

   public static boolean a(brh $$0, brh $$1) {
      return ($$1.bD() || $$1.by()) && !$$0.y($$1);
   }

   @Override
   public boolean bD() {
      return true;
   }

   @Override
   public boolean by() {
      return true;
   }

   @Override
   protected etp a(is.a $$0, l.a $$1) {
      return bsa.i(super.a($$0, $$1));
   }

   @Override
   protected etp a(brh $$0, brk $$1, float $$2) {
      float $$3 = this.w();
      if (this.cQ().size() > 1) {
         int $$4 = this.cQ().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cdp) {
            $$3 += 0.2F;
         }
      }

      return new etp(0.0, this.x() == cne.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dD() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dN().B) {
         this.aQ = true;
         this.aR = $$0;
         if (this.H() == 0) {
            this.b(60);
         }
      }

      this.dN().a(kx.aj, this.ds() + (double)this.ah.i(), this.du() + 0.7, this.dy() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dN().a(this.ds(), this.du(), this.dy(), this.aO(), this.dc(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dva.O, this.cO());
      }
   }

   @Override
   public void h(brh $$0) {
      if ($$0 instanceof cne) {
         if ($$0.cI().b < this.cI().e) {
            super.h($$0);
         }
      } else if ($$0.cI().b <= this.cI().b) {
         super.h($$0);
      }
   }

   @Override
   public csu ag_() {
      return switch (this.x()) {
         case b -> ctc.nW;
         case c -> ctc.nY;
         case d -> ctc.oa;
         case e -> ctc.oc;
         case f -> ctc.oe;
         case g -> ctc.og;
         case h -> ctc.oi;
         case i -> ctc.ok;
         default -> ctc.nU;
      };
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bx() {
      return !this.dI();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.aF = (double)$$3;
      this.aG = (double)$$4;
      this.s = 10;
   }

   @Override
   public double c_() {
      return this.s > 0 ? this.t : this.ds();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.du();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.v : this.dy();
   }

   @Override
   public float M_() {
      return this.s > 0 ? (float)this.aG : this.dF();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aF : this.dD();
   }

   @Override
   public is cG() {
      return this.cF().h();
   }

   @Override
   public void l() {
      this.aO = this.aN;
      this.aN = this.B();
      if (this.aN != cne.a.b && this.aN != cne.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dN().B && this.q >= 60.0F) {
         this.bF();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.A();
      if (this.cY()) {
         if (!(this.cR() instanceof clh)) {
            this.a(false, false);
         }

         this.E();
         if (this.dN().B) {
            this.G();
            this.dN().a(new agy(this.c(0), this.c(1)));
         }

         this.a(bsf.a, this.dq());
      } else {
         this.g(etp.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avb $$1 = this.r();
               if ($$1 != null) {
                  etp $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dN().a(null, this.ds() + $$3, this.du(), this.dy() + $$4, $$1, this.dc(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aQ();
      List<brh> $$5 = this.dN().a(this, this.cI().c(0.2F, -0.01F, 0.2F), brm.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dN().B && !(this.cO() instanceof clh);

         for (brh $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cQ().size() < this.y() && !$$7.bP() && this.b($$7) && $$7 instanceof bsa && !($$7 instanceof cer) && !($$7 instanceof clh)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dN().B) {
         int $$0 = this.H();
         if ($$0 > 0) {
            this.aS += 0.05F;
         } else {
            this.aS -= 0.1F;
         }

         this.aS = axz.a(this.aS, 0.0F, 1.0F);
         this.aU = this.aT;
         this.aT = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dN().Y())) * this.aS;
      } else {
         if (!this.aQ) {
            this.b(0);
         }

         int $$1 = this.H();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               etp $$3 = this.dq();
               if (this.aR) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bF();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof clh) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aQ = false;
         }
      }
   }

   @Nullable
   protected avb r() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return avc.cm;
         case d:
            return avc.cl;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.cY()) {
         this.s = 0;
         this.f(this.ds(), this.du(), this.dy());
      }

      if (this.s > 0) {
         this.a(this.s, this.t, this.u, this.v, this.aF, this.aG);
         this.s--;
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.ao.a(j, $$0);
      this.ao.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? axz.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cne.a B() {
      cne.a $$0 = this.D();
      if ($$0 != null) {
         this.aL = this.cI().e;
         return $$0;
      } else if (this.C()) {
         return cne.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aM = $$1;
            return cne.a.d;
         } else {
            return cne.a.e;
         }
      }
   }

   public float u() {
      etk $$0 = this.cI();
      int $$1 = axz.a($$0.a);
      int $$2 = axz.c($$0.d);
      int $$3 = axz.a($$0.e);
      int $$4 = axz.c($$0.e - this.aP);
      int $$5 = axz.a($$0.c);
      int $$6 = axz.c($$0.f);
      in.a $$7 = new in.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ema $$12 = this.dN().b_($$7);
               if ($$12.a(avw.a)) {
                  $$9 = Math.max($$9, $$12.a((czj)this.dN(), $$7));
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
      etk $$0 = this.cI();
      etk $$1 = new etk($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = axz.a($$1.a) - 1;
      int $$3 = axz.c($$1.d) + 1;
      int $$4 = axz.a($$1.b) - 1;
      int $$5 = axz.c($$1.e) + 1;
      int $$6 = axz.a($$1.c) - 1;
      int $$7 = axz.c($$1.f) + 1;
      eui $$8 = euf.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      in.a $$11 = new in.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dqh $$16 = this.dN().a_($$11);
                     if (!($$16.b() instanceof dmh) && euf.c($$16.k(this.dN(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ett.i)) {
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
      etk $$0 = this.cI();
      int $$1 = axz.a($$0.a);
      int $$2 = axz.c($$0.d);
      int $$3 = axz.a($$0.b);
      int $$4 = axz.c($$0.b + 0.001);
      int $$5 = axz.a($$0.c);
      int $$6 = axz.c($$0.f);
      boolean $$7 = false;
      this.aL = -Double.MAX_VALUE;
      in.a $$8 = new in.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ema $$12 = this.dN().b_($$8);
               if ($$12.a(avw.a)) {
                  float $$13 = (float)$$10 + $$12.a((czj)this.dN(), $$8);
                  this.aL = Math.max((double)$$13, this.aL);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cne.a D() {
      etk $$0 = this.cI();
      double $$1 = $$0.e + 0.001;
      int $$2 = axz.a($$0.a);
      int $$3 = axz.c($$0.d);
      int $$4 = axz.a($$0.e);
      int $$5 = axz.c($$1);
      int $$6 = axz.a($$0.c);
      int $$7 = axz.c($$0.f);
      boolean $$8 = false;
      in.a $$9 = new in.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ema $$13 = this.dN().b_($$9);
               if ($$13.a(avw.a) && $$1 < (double)((float)$$9.v() + $$13.a((czj)this.dN(), $$9))) {
                  if (!$$13.b()) {
                     return cne.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cne.a.b : null;
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.aX();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aO == cne.a.e && this.aN != cne.a.e && this.aN != cne.a.d) {
         this.aL = this.e(1.0);
         this.a_(this.ds(), (double)(this.u() - this.di()) + 0.101, this.dy());
         this.g(this.dq().d(1.0, 0.0, 1.0));
         this.aP = 0.0;
         this.aN = cne.a.a;
      } else {
         if (this.aN == cne.a.a) {
            $$1 = (this.aL - this.du()) / (double)this.di();
            this.p = 0.9F;
         } else if (this.aN == cne.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aN == cne.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aN == cne.a.e) {
            this.p = 0.9F;
         } else if (this.aN == cne.a.d) {
            this.p = this.aM;
            if (this.cO() instanceof clh) {
               this.aM /= 2.0F;
            }
         }

         etp $$2 = this.dq();
         this.o($$2.c * (double)this.p, $$2.d + $$0, $$2.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            etp $$3 = this.dq();
            this.o($$3.c, ($$3.d + $$1 * (this.aW() / 0.65)) * 0.75, $$3.e);
         }
      }
   }

   private void G() {
      if (this.bQ()) {
         float $$0 = 0.0F;
         if (this.aH) {
            this.r--;
         }

         if (this.aI) {
            this.r++;
         }

         if (this.aI != this.aH && !this.aJ && !this.aK) {
            $$0 += 0.005F;
         }

         this.r(this.dD() + this.r);
         if (this.aJ) {
            $$0 += 0.04F;
         }

         if (this.aK) {
            $$0 -= 0.005F;
         }

         this.g(this.dq().b((double)(axz.a(-this.dD() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(axz.b(this.dD() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aI && !this.aH || this.aJ, this.aH && !this.aI || this.aJ);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(brh $$0) {
      return $$0.dh() < this.dh();
   }

   @Override
   protected void a(brh $$0, brh.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ai().a(avu.s)) {
         $$0.r($$0.dD() + this.r);
         $$0.n($$0.cq() + this.r);
         this.c($$0);
         if ($$0 instanceof cdp && this.cQ().size() == this.y()) {
            int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
            $$0.o(((cdp)$$0).aZ + (float)$$2);
            $$0.n($$0.cq() + (float)$$2);
         }
      }
   }

   @Override
   public etp b(bsa $$0) {
      etp $$1 = a((double)(this.dh() * axz.g), (double)$$0.dh(), $$0.dD());
      double $$2 = this.ds() + $$1.c;
      double $$3 = this.dy() + $$1.e;
      in $$4 = in.a($$2, this.cI().e, $$3);
      in $$5 = $$4.d();
      if (!this.dN().z($$5)) {
         List<etp> $$6 = Lists.newArrayList();
         double $$7 = this.dN().j($$4);
         if (cnh.a($$7)) {
            $$6.add(new etp($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dN().j($$5);
         if (cnh.a($$8)) {
            $$6.add(new etp($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fG().iterator();

         while (var14.hasNext()) {
            bsl $$9 = (bsl)var14.next();

            for (etp $$10 : $$6) {
               if (cnh.a(this.dN(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(brh $$0) {
      $$0.o(this.dD());
      float $$1 = axz.g($$0.dD() - this.dD());
      float $$2 = axz.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.r($$0.dD() + $$2 - $$1);
      $$0.n($$0.dD());
   }

   @Override
   public void k(brh $$0) {
      this.c($$0);
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(ua $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cne.b.a($$0.l("Type")));
      }
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      if ($$0.fP()) {
         return bpm.d;
      } else if (this.q < 60.0F) {
         if (!this.dN().B) {
            return $$0.n(this) ? bpm.b : bpm.d;
         } else {
            return bpm.a;
         }
      } else {
         return bpm.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dqh $$2, in $$3) {
      this.aP = this.dq().d;
      if (!this.bP()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aN != cne.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dO().k());
               if (!this.dN().B && !this.dI()) {
                  this.al();
                  if (this.dN().aa().b(czz.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(ctc.pp);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dN().b_(this.dn().d()).a(avw.a) && $$0 < 0.0) {
            this.ac -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.ao.a($$0 == 0 ? j : k) && this.cO() != null;
   }

   private void b(int $$0) {
      this.ao.a(l, $$0);
   }

   private int H() {
      return this.ao.a(l);
   }

   public float a(float $$0) {
      return axz.i($$0, this.aU, this.aT);
   }

   public void a(cne.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public cne.b x() {
      return cne.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(brh $$0) {
      return this.cQ().size() < this.y() && !this.a(avw.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public bsa cO() {
      return this.cR() instanceof bsa $$0 ? $$0 : super.cO();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aH = $$0;
      this.aI = $$1;
      this.aJ = $$2;
      this.aK = $$3;
   }

   @Override
   protected wu cp() {
      return wu.c(this.ag_().a());
   }

   @Override
   public boolean bh() {
      return this.aN == cne.a.b || this.aN == cne.a.c;
   }

   @Override
   public csz dA() {
      return new csz(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements ayt {
      a(ddg.n, "oak"),
      b(ddg.o, "spruce"),
      c(ddg.p, "birch"),
      d(ddg.q, "jungle"),
      e(ddg.r, "acacia"),
      f(ddg.s, "cherry"),
      g(ddg.t, "dark_oak"),
      h(ddg.u, "mangrove"),
      i(ddg.v, "bamboo");

      private final String k;
      private final dde l;
      public static final ayt.a<cne.b> j = ayt.a(cne.b::values);
      private static final IntFunction<cne.b> m = awq.a(Enum::ordinal, values(), awq.a.a);

      private b(dde $$0, String $$1) {
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

      public dde b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cne.b a(int $$0) {
         return m.apply($$0);
      }

      public static cne.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
