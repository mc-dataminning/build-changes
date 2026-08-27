import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cmi extends cmt implements bsd<cmi.b> {
   private static final ajk<Integer> i = ajo.a(cmi.class, ajm.b);
   private static final ajk<Boolean> j = ajo.a(cmi.class, ajm.k);
   private static final ajk<Boolean> k = ajo.a(cmi.class, ajm.k);
   private static final ajk<Integer> l = ajo.a(cmi.class, ajm.b);
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
   private cmi.a aN;
   private cmi.a aO;
   private double aP;
   private boolean aQ;
   private boolean aR;
   private float aS;
   private float aT;
   private float aU;

   public cmi(bqr<? extends cmi> $$0, czu $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cmi(czu $$0, double $$1, double $$2, double $$3) {
      this(bqr.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(i, cmi.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bql $$0) {
      return a(this, $$0);
   }

   public static boolean a(bql $$0, bql $$1) {
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
   protected etf a(ir.a $$0, l.a $$1) {
      return bre.i(super.a($$0, $$1));
   }

   @Override
   protected etf a(bql $$0, bqo $$1, float $$2) {
      float $$3 = this.w();
      if (this.cQ().size() > 1) {
         int $$4 = this.cQ().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cct) {
            $$3 += 0.2F;
         }
      }

      return new etf(0.0, this.x() == cmi.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
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

      this.dN().a(kw.aj, this.ds() + (double)this.ah.i(), this.du() + 0.7, this.dy() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dN().a(this.ds(), this.du(), this.dy(), this.aO(), this.dc(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dur.O, this.cO());
      }
   }

   @Override
   public void h(bql $$0) {
      if ($$0 instanceof cmi) {
         if ($$0.cI().b < this.cI().e) {
            super.h($$0);
         }
      } else if ($$0.cI().b <= this.cI().b) {
         super.h($$0);
      }
   }

   @Override
   public cry ag_() {
      return switch (this.x()) {
         case b -> csg.nW;
         case c -> csg.nY;
         case d -> csg.oa;
         case e -> csg.oc;
         case f -> csg.oe;
         case g -> csg.og;
         case h -> csg.oi;
         case i -> csg.ok;
         default -> csg.nU;
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
   public ir cG() {
      return this.cF().h();
   }

   @Override
   public void l() {
      this.aO = this.aN;
      this.aN = this.B();
      if (this.aN != cmi.a.b && this.aN != cmi.a.c) {
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
         if (!(this.cR() instanceof ckl)) {
            this.a(false, false);
         }

         this.E();
         if (this.dN().B) {
            this.G();
            this.dN().a(new agw(this.c(0), this.c(1)));
         }

         this.a(brj.a, this.dq());
      } else {
         this.g(etf.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               auy $$1 = this.r();
               if ($$1 != null) {
                  etf $$2 = this.f(1.0F);
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
      List<bql> $$5 = this.dN().a(this, this.cI().c(0.2F, -0.01F, 0.2F), bqq.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dN().B && !(this.cO() instanceof ckl);

         for (bql $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cQ().size() < this.y() && !$$7.bP() && this.b($$7) && $$7 instanceof bre && !($$7 instanceof cdv) && !($$7 instanceof ckl)) {
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

         this.aS = axw.a(this.aS, 0.0F, 1.0F);
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
               etf $$3 = this.dq();
               if (this.aR) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bF();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof ckl) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aQ = false;
         }
      }
   }

   @Nullable
   protected auy r() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return auz.cm;
         case d:
            return auz.cl;
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
      return this.c($$0) ? axw.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cmi.a B() {
      cmi.a $$0 = this.D();
      if ($$0 != null) {
         this.aL = this.cI().e;
         return $$0;
      } else if (this.C()) {
         return cmi.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aM = $$1;
            return cmi.a.d;
         } else {
            return cmi.a.e;
         }
      }
   }

   public float u() {
      eta $$0 = this.cI();
      int $$1 = axw.a($$0.a);
      int $$2 = axw.c($$0.d);
      int $$3 = axw.a($$0.e);
      int $$4 = axw.c($$0.e - this.aP);
      int $$5 = axw.a($$0.c);
      int $$6 = axw.c($$0.f);
      im.a $$7 = new im.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               elr $$12 = this.dN().b_($$7);
               if ($$12.a(avt.a)) {
                  $$9 = Math.max($$9, $$12.a((cza)this.dN(), $$7));
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
      eta $$0 = this.cI();
      eta $$1 = new eta($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = axw.a($$1.a) - 1;
      int $$3 = axw.c($$1.d) + 1;
      int $$4 = axw.a($$1.b) - 1;
      int $$5 = axw.c($$1.e) + 1;
      int $$6 = axw.a($$1.c) - 1;
      int $$7 = axw.c($$1.f) + 1;
      ety $$8 = etv.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      im.a $$11 = new im.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dpy $$16 = this.dN().a_($$11);
                     if (!($$16.b() instanceof dly) && etv.c($$16.k(this.dN(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, etj.i)) {
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
      eta $$0 = this.cI();
      int $$1 = axw.a($$0.a);
      int $$2 = axw.c($$0.d);
      int $$3 = axw.a($$0.b);
      int $$4 = axw.c($$0.b + 0.001);
      int $$5 = axw.a($$0.c);
      int $$6 = axw.c($$0.f);
      boolean $$7 = false;
      this.aL = -Double.MAX_VALUE;
      im.a $$8 = new im.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               elr $$12 = this.dN().b_($$8);
               if ($$12.a(avt.a)) {
                  float $$13 = (float)$$10 + $$12.a((cza)this.dN(), $$8);
                  this.aL = Math.max((double)$$13, this.aL);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cmi.a D() {
      eta $$0 = this.cI();
      double $$1 = $$0.e + 0.001;
      int $$2 = axw.a($$0.a);
      int $$3 = axw.c($$0.d);
      int $$4 = axw.a($$0.e);
      int $$5 = axw.c($$1);
      int $$6 = axw.a($$0.c);
      int $$7 = axw.c($$0.f);
      boolean $$8 = false;
      im.a $$9 = new im.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               elr $$13 = this.dN().b_($$9);
               if ($$13.a(avt.a) && $$1 < (double)((float)$$9.v() + $$13.a((cza)this.dN(), $$9))) {
                  if (!$$13.b()) {
                     return cmi.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cmi.a.b : null;
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.aX();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aO == cmi.a.e && this.aN != cmi.a.e && this.aN != cmi.a.d) {
         this.aL = this.e(1.0);
         this.a_(this.ds(), (double)(this.u() - this.di()) + 0.101, this.dy());
         this.g(this.dq().d(1.0, 0.0, 1.0));
         this.aP = 0.0;
         this.aN = cmi.a.a;
      } else {
         if (this.aN == cmi.a.a) {
            $$1 = (this.aL - this.du()) / (double)this.di();
            this.p = 0.9F;
         } else if (this.aN == cmi.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aN == cmi.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aN == cmi.a.e) {
            this.p = 0.9F;
         } else if (this.aN == cmi.a.d) {
            this.p = this.aM;
            if (this.cO() instanceof ckl) {
               this.aM /= 2.0F;
            }
         }

         etf $$2 = this.dq();
         this.o($$2.c * (double)this.p, $$2.d + $$0, $$2.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            etf $$3 = this.dq();
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

         this.g(this.dq().b((double)(axw.a(-this.dD() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(axw.b(this.dD() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aI && !this.aH || this.aJ, this.aH && !this.aI || this.aJ);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(bql $$0) {
      return $$0.dh() < this.dh();
   }

   @Override
   protected void a(bql $$0, bql.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ai().a(avr.s)) {
         $$0.r($$0.dD() + this.r);
         $$0.n($$0.cq() + this.r);
         this.c($$0);
         if ($$0 instanceof cct && this.cQ().size() == this.y()) {
            int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
            $$0.o(((cct)$$0).aZ + (float)$$2);
            $$0.n($$0.cq() + (float)$$2);
         }
      }
   }

   @Override
   public etf b(bre $$0) {
      etf $$1 = a((double)(this.dh() * axw.g), (double)$$0.dh(), $$0.dD());
      double $$2 = this.ds() + $$1.c;
      double $$3 = this.dy() + $$1.e;
      im $$4 = im.a($$2, this.cI().e, $$3);
      im $$5 = $$4.d();
      if (!this.dN().z($$5)) {
         List<etf> $$6 = Lists.newArrayList();
         double $$7 = this.dN().j($$4);
         if (cml.a($$7)) {
            $$6.add(new etf($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dN().j($$5);
         if (cml.a($$8)) {
            $$6.add(new etf($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fG().iterator();

         while (var14.hasNext()) {
            brp $$9 = (brp)var14.next();

            for (etf $$10 : $$6) {
               if (cml.a(this.dN(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bql $$0) {
      $$0.o(this.dD());
      float $$1 = axw.g($$0.dD() - this.dD());
      float $$2 = axw.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.r($$0.dD() + $$2 - $$1);
      $$0.n($$0.dD());
   }

   @Override
   public void k(bql $$0) {
      this.c($$0);
   }

   @Override
   protected void b(ty $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(ty $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cmi.b.a($$0.l("Type")));
      }
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      if ($$0.fP()) {
         return boq.d;
      } else if (this.q < 60.0F) {
         if (!this.dN().B) {
            return $$0.n(this) ? boq.b : boq.d;
         } else {
            return boq.a;
         }
      } else {
         return boq.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
      this.aP = this.dq().d;
      if (!this.bP()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aN != cmi.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dO().k());
               if (!this.dN().B && !this.dI()) {
                  this.al();
                  if (this.dN().aa().b(czq.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(csg.pp);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dN().b_(this.dn().d()).a(avt.a) && $$0 < 0.0) {
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
      return axw.i($$0, this.aU, this.aT);
   }

   public void a(cmi.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public cmi.b x() {
      return cmi.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(bql $$0) {
      return this.cQ().size() < this.y() && !this.a(avt.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public bre cO() {
      return this.cR() instanceof bre $$0 ? $$0 : super.cO();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aH = $$0;
      this.aI = $$1;
      this.aJ = $$2;
      this.aK = $$3;
   }

   @Override
   protected ws cp() {
      return ws.c(this.ag_().a());
   }

   @Override
   public boolean bh() {
      return this.aN == cmi.a.b || this.aN == cmi.a.c;
   }

   @Override
   public csd dA() {
      return new csd(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements ayq {
      a(dcx.n, "oak"),
      b(dcx.o, "spruce"),
      c(dcx.p, "birch"),
      d(dcx.q, "jungle"),
      e(dcx.r, "acacia"),
      f(dcx.s, "cherry"),
      g(dcx.t, "dark_oak"),
      h(dcx.u, "mangrove"),
      i(dcx.v, "bamboo");

      private final String k;
      private final dcv l;
      public static final ayq.a<cmi.b> j = ayq.a(cmi.b::values);
      private static final IntFunction<cmi.b> m = awn.a(Enum::ordinal, values(), awn.a.a);

      private b(dcv $$0, String $$1) {
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

      public dcv b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cmi.b a(int $$0) {
         return m.apply($$0);
      }

      public static cmi.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
