import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class coh extends cot implements bub<coh.b> {
   private static final ajp<Integer> i = ajt.a(coh.class, ajr.b);
   private static final ajp<Boolean> j = ajt.a(coh.class, ajr.k);
   private static final ajp<Boolean> k = ajt.a(coh.class, ajr.k);
   private static final ajp<Integer> l = ajt.a(coh.class, ajr.b);
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
   private coh.a aN;
   private coh.a aO;
   private double aP;
   private boolean aQ;
   private boolean aR;
   private float aS;
   private float aT;
   private float aU;

   public coh(bsm<? extends coh> $$0, dcf $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public coh(dcf $$0, double $$1, double $$2, double $$3) {
      this(bsm.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(i, coh.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bsg $$0) {
      return a(this, $$0);
   }

   public static boolean a(bsg $$0, bsg $$1) {
      return ($$1.bG() || $$1.bB()) && !$$0.y($$1);
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   protected ewf a(jf.a $$0, l.a $$1) {
      return btb.k(super.a($$0, $$1));
   }

   @Override
   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      float $$3 = this.w();
      if (this.cT().size() > 1) {
         int $$4 = this.cT().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cer) {
            $$3 += 0.2F;
         }
      }

      return new ewf(0.0, this.x() == coh.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dG() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dQ().B) {
         this.aQ = true;
         this.aR = $$0;
         if (this.H() == 0) {
            this.b(60);
         }
      }

      this.dQ().a(lj.am, this.dv() + (double)this.ah.i(), this.dx() + 0.7, this.dB() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dQ().a(this.dv(), this.dx(), this.dB(), this.aR(), this.df(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dxg.O, this.cR());
      }
   }

   @Override
   public void h(bsg $$0) {
      if ($$0 instanceof coh) {
         if ($$0.cL().b < this.cL().e) {
            super.h($$0);
         }
      } else if ($$0.cL().b <= this.cL().b) {
         super.h($$0);
      }
   }

   @Override
   public ctx ag_() {
      return switch (this.x()) {
         case b -> cuf.nW;
         case c -> cuf.nY;
         case d -> cuf.oa;
         case e -> cuf.oc;
         case f -> cuf.oe;
         case g -> cuf.og;
         case h -> cuf.oi;
         case i -> cuf.ok;
         default -> cuf.nU;
      };
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bA() {
      return !this.dL();
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
      return this.s > 0 ? this.t : this.dv();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dx();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.v : this.dB();
   }

   @Override
   public float M_() {
      return this.s > 0 ? (float)this.aG : this.dI();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aF : this.dG();
   }

   @Override
   public jf cJ() {
      return this.cI().h();
   }

   @Override
   public void l() {
      this.aO = this.aN;
      this.aN = this.B();
      if (this.aN != coh.a.b && this.aN != coh.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dQ().B && this.q >= 60.0F) {
         this.bI();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.A();
      if (this.db()) {
         if (!(this.cU() instanceof cmk)) {
            this.a(false, false);
         }

         this.E();
         if (this.dQ().B) {
            this.G();
            this.dQ().a(new ahb(this.c(0), this.c(1)));
         }

         this.a(btg.a, this.dt());
      } else {
         this.i(ewf.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aX()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avg $$1 = this.s();
               if ($$1 != null) {
                  ewf $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dQ().a(null, this.dv() + $$3, this.dx(), this.dB() + $$4, $$1, this.df(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aT();
      List<bsg> $$5 = this.dQ().a(this, this.cL().c(0.2F, -0.01F, 0.2F), bsl.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dQ().B && !(this.cR() instanceof cmk);

         for (bsg $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cT().size() < this.y() && !$$7.bS() && this.b($$7) && $$7 instanceof btb && !($$7 instanceof cft) && !($$7 instanceof cmk)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dQ().B) {
         int $$0 = this.H();
         if ($$0 > 0) {
            this.aS += 0.05F;
         } else {
            this.aS -= 0.1F;
         }

         this.aS = ayg.a(this.aS, 0.0F, 1.0F);
         this.aU = this.aT;
         this.aT = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dQ().Z())) * this.aS;
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
               ewf $$3 = this.dt();
               if (this.aR) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bI();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cmk) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aQ = false;
         }
      }
   }

   @Nullable
   protected avg s() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return avh.cm;
         case d:
            return avh.cl;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.db()) {
         this.s = 0;
         this.f(this.dv(), this.dx(), this.dB());
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
      return this.c($$0) ? ayg.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private coh.a B() {
      coh.a $$0 = this.D();
      if ($$0 != null) {
         this.aL = this.cL().e;
         return $$0;
      } else if (this.C()) {
         return coh.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aM = $$1;
            return coh.a.d;
         } else {
            return coh.a.e;
         }
      }
   }

   public float u() {
      ewa $$0 = this.cL();
      int $$1 = ayg.a($$0.a);
      int $$2 = ayg.c($$0.d);
      int $$3 = ayg.a($$0.e);
      int $$4 = ayg.c($$0.e - this.aP);
      int $$5 = ayg.a($$0.c);
      int $$6 = ayg.c($$0.f);
      ja.a $$7 = new ja.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eoh $$12 = this.dQ().b_($$7);
               if ($$12.a(awc.a)) {
                  $$9 = Math.max($$9, $$12.a((dbl)this.dQ(), $$7));
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
      ewa $$0 = this.cL();
      ewa $$1 = new ewa($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayg.a($$1.a) - 1;
      int $$3 = ayg.c($$1.d) + 1;
      int $$4 = ayg.a($$1.b) - 1;
      int $$5 = ayg.c($$1.e) + 1;
      int $$6 = ayg.a($$1.c) - 1;
      int $$7 = ayg.c($$1.f) + 1;
      ewy $$8 = ewv.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      ja.a $$11 = new ja.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dsk $$16 = this.dQ().a_($$11);
                     if (!($$16.b() instanceof dok) && ewv.c($$16.k(this.dQ(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ewj.i)) {
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
      ewa $$0 = this.cL();
      int $$1 = ayg.a($$0.a);
      int $$2 = ayg.c($$0.d);
      int $$3 = ayg.a($$0.b);
      int $$4 = ayg.c($$0.b + 0.001);
      int $$5 = ayg.a($$0.c);
      int $$6 = ayg.c($$0.f);
      boolean $$7 = false;
      this.aL = -Double.MAX_VALUE;
      ja.a $$8 = new ja.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eoh $$12 = this.dQ().b_($$8);
               if ($$12.a(awc.a)) {
                  float $$13 = (float)$$10 + $$12.a((dbl)this.dQ(), $$8);
                  this.aL = Math.max((double)$$13, this.aL);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private coh.a D() {
      ewa $$0 = this.cL();
      double $$1 = $$0.e + 0.001;
      int $$2 = ayg.a($$0.a);
      int $$3 = ayg.c($$0.d);
      int $$4 = ayg.a($$0.e);
      int $$5 = ayg.c($$1);
      int $$6 = ayg.a($$0.c);
      int $$7 = ayg.c($$0.f);
      boolean $$8 = false;
      ja.a $$9 = new ja.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eoh $$13 = this.dQ().b_($$9);
               if ($$13.a(awc.a) && $$1 < (double)((float)$$9.v() + $$13.a((dbl)this.dQ(), $$9))) {
                  if (!$$13.b()) {
                     return coh.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? coh.a.b : null;
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.ba();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aO == coh.a.e && this.aN != coh.a.e && this.aN != coh.a.d) {
         this.aL = this.e(1.0);
         double $$2 = (double)(this.u() - this.dl()) + 0.101;
         if (this.dQ().a(this, this.cL().d(0.0, $$2 - this.dx(), 0.0))) {
            this.a_(this.dv(), $$2, this.dB());
            this.i(this.dt().d(1.0, 0.0, 1.0));
            this.aP = 0.0;
         }

         this.aN = coh.a.a;
      } else {
         if (this.aN == coh.a.a) {
            $$1 = (this.aL - this.dx()) / (double)this.dl();
            this.p = 0.9F;
         } else if (this.aN == coh.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aN == coh.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aN == coh.a.e) {
            this.p = 0.9F;
         } else if (this.aN == coh.a.d) {
            this.p = this.aM;
            if (this.cR() instanceof cmk) {
               this.aM /= 2.0F;
            }
         }

         ewf $$3 = this.dt();
         this.o($$3.c * (double)this.p, $$3.d + $$0, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            ewf $$4 = this.dt();
            this.o($$4.c, ($$4.d + $$1 * (this.aZ() / 0.65)) * 0.75, $$4.e);
         }
      }
   }

   private void G() {
      if (this.bT()) {
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

         this.s(this.dG() + this.r);
         if (this.aJ) {
            $$0 += 0.04F;
         }

         if (this.aK) {
            $$0 -= 0.005F;
         }

         this.i(this.dt().b((double)(ayg.a(-this.dG() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayg.b(this.dG() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aI && !this.aH || this.aJ, this.aH && !this.aI || this.aJ);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(bsg $$0) {
      return $$0.dk() < this.dk();
   }

   @Override
   protected void a(bsg $$0, bsg.a $$1) {
      super.a($$0, $$1);
      if (!$$0.al().a(awa.s)) {
         $$0.s($$0.dG() + this.r);
         $$0.o($$0.ct() + this.r);
         this.c($$0);
         if ($$0 instanceof cer && this.cT().size() == this.y()) {
            int $$2 = $$0.am() % 2 == 0 ? 90 : 270;
            $$0.p(((cer)$$0).aY + (float)$$2);
            $$0.o($$0.ct() + (float)$$2);
         }
      }
   }

   @Override
   public ewf b(btb $$0) {
      ewf $$1 = a((double)(this.dk() * ayg.g), (double)$$0.dk(), $$0.dG());
      double $$2 = this.dv() + $$1.c;
      double $$3 = this.dB() + $$1.e;
      ja $$4 = ja.a($$2, this.cL().e, $$3);
      ja $$5 = $$4.d();
      if (!this.dQ().z($$5)) {
         List<ewf> $$6 = Lists.newArrayList();
         double $$7 = this.dQ().j($$4);
         if (cok.a($$7)) {
            $$6.add(new ewf($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dQ().j($$5);
         if (cok.a($$8)) {
            $$6.add(new ewf($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fF().iterator();

         while (var14.hasNext()) {
            btn $$9 = (btn)var14.next();

            for (ewf $$10 : $$6) {
               if (cok.a(this.dQ(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bsg $$0) {
      $$0.p(this.dG());
      float $$1 = ayg.g($$0.dG() - this.dG());
      float $$2 = ayg.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.s($$0.dG() + $$2 - $$1);
      $$0.o($$0.dG());
   }

   @Override
   public void k(bsg $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.b("Type", 8)) {
         this.a(coh.b.a($$0.l("Type")));
      }
   }

   @Override
   public bqg a(cmk $$0, bqf $$1) {
      if ($$0.fO()) {
         return bqg.e;
      } else if (this.q < 60.0F) {
         if (!this.dQ().B) {
            return $$0.n(this) ? bqg.c : bqg.e;
         } else {
            return bqg.a;
         }
      } else {
         return bqg.e;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
      this.aP = this.dt().d;
      if (!this.bS()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aN != coh.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dR().l());
               if (!this.dQ().B && !this.dL()) {
                  this.ao();
                  if (this.dQ().ab().b(dcb.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cuf.pq);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dQ().b_(this.dq().d()).a(awc.a) && $$0 < 0.0) {
            this.ac -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.ao.a($$0 == 0 ? j : k) && this.cR() != null;
   }

   private void b(int $$0) {
      this.ao.a(l, $$0);
   }

   private int H() {
      return this.ao.a(l);
   }

   public float a(float $$0) {
      return ayg.i($$0, this.aU, this.aT);
   }

   public void a(coh.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public coh.b x() {
      return coh.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(bsg $$0) {
      return this.cT().size() < this.y() && !this.a(awc.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public btb cR() {
      return this.cU() instanceof btb $$0 ? $$0 : super.cR();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aH = $$0;
      this.aI = $$1;
      this.aJ = $$2;
      this.aK = $$3;
   }

   @Override
   protected wu cs() {
      return wu.c(this.ag_().a());
   }

   @Override
   public boolean bk() {
      return this.aN == coh.a.b || this.aN == coh.a.c;
   }

   @Override
   public cuc dD() {
      return new cuc(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements azc {
      a(dfj.n, "oak"),
      b(dfj.o, "spruce"),
      c(dfj.p, "birch"),
      d(dfj.q, "jungle"),
      e(dfj.r, "acacia"),
      f(dfj.s, "cherry"),
      g(dfj.t, "dark_oak"),
      h(dfj.u, "mangrove"),
      i(dfj.v, "bamboo");

      private final String k;
      private final dfh l;
      public static final azc.a<coh.b> j = azc.a(coh.b::values);
      private static final IntFunction<coh.b> m = aww.a(Enum::ordinal, values(), aww.a.a);

      private b(final dfh $$0, final String $$1) {
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

      public dfh b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static coh.b a(int $$0) {
         return m.apply($$0);
      }

      public static coh.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
