import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cnv extends cog implements btq<cnv.b> {
   private static final ajs<Integer> i = ajw.a(cnv.class, aju.b);
   private static final ajs<Boolean> j = ajw.a(cnv.class, aju.k);
   private static final ajs<Boolean> k = ajw.a(cnv.class, aju.k);
   private static final ajs<Integer> l = ajw.a(cnv.class, aju.b);
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
   private cnv.a aN;
   private cnv.a aO;
   private double aP;
   private boolean aQ;
   private boolean aR;
   private float aS;
   private float aT;
   private float aU;

   public cnv(bsc<? extends cnv> $$0, daz $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cnv(daz $$0, double $$1, double $$2, double $$3) {
      this(bsc.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected brw.b bb() {
      return brw.b.c;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(i, cnv.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(brw $$0) {
      return a(this, $$0);
   }

   public static boolean a(brw $$0, brw $$1) {
      return ($$1.bF() || $$1.bA()) && !$$0.y($$1);
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected eum a(it.a $$0, l.a $$1) {
      return bsq.i(super.a($$0, $$1));
   }

   @Override
   protected eum a(brw $$0, brz $$1, float $$2) {
      float $$3 = this.w();
      if (this.cS().size() > 1) {
         int $$4 = this.cS().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof ceg) {
            $$3 += 0.2F;
         }
      }

      return new eum(0.0, this.x() == cnv.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public void l(boolean $$0) {
      if (!this.dP().B) {
         this.aQ = true;
         this.aR = $$0;
         if (this.H() == 0) {
            this.b(60);
         }
      }

      this.dP().a(ky.am, this.du() + (double)this.ah.i(), this.dw() + 0.7, this.dA() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), this.aQ(), this.de(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dvw.O, this.cQ());
      }
   }

   @Override
   public void h(brw $$0) {
      if ($$0 instanceof cnv) {
         if ($$0.cK().b < this.cK().e) {
            super.h($$0);
         }
      } else if ($$0.cK().b <= this.cK().b) {
         super.h($$0);
      }
   }

   @Override
   public ctl ah_() {
      return switch (this.x()) {
         case b -> ctt.nW;
         case c -> ctt.nY;
         case d -> ctt.oa;
         case e -> ctt.oc;
         case f -> ctt.oe;
         case g -> ctt.og;
         case h -> ctt.oi;
         case i -> ctt.ok;
         default -> ctt.nU;
      };
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bz() {
      return !this.dK();
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
      return this.s > 0 ? this.t : this.du();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dw();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.v : this.dA();
   }

   @Override
   public float M_() {
      return this.s > 0 ? (float)this.aG : this.dH();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aF : this.dF();
   }

   @Override
   public it cI() {
      return this.cH().h();
   }

   @Override
   public void l() {
      this.aO = this.aN;
      this.aN = this.B();
      if (this.aN != cnv.a.b && this.aN != cnv.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dP().B && this.q >= 60.0F) {
         this.bH();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.A();
      if (this.da()) {
         if (!(this.cT() instanceof cly)) {
            this.a(false, false);
         }

         this.E();
         if (this.dP().B) {
            this.G();
            this.dP().a(new ahe(this.c(0), this.c(1)));
         }

         this.a(bsv.a, this.ds());
      } else {
         this.g(eum.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aW()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avh $$1 = this.s();
               if ($$1 != null) {
                  eum $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dP().a(null, this.du() + $$3, this.dw(), this.dA() + $$4, $$1, this.de(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aS();
      List<brw> $$5 = this.dP().a(this, this.cK().c(0.2F, -0.01F, 0.2F), bsb.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dP().B && !(this.cQ() instanceof cly);

         for (brw $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cS().size() < this.y() && !$$7.bR() && this.b($$7) && $$7 instanceof bsq && !($$7 instanceof cfi) && !($$7 instanceof cly)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dP().B) {
         int $$0 = this.H();
         if ($$0 > 0) {
            this.aS += 0.05F;
         } else {
            this.aS -= 0.1F;
         }

         this.aS = ayf.a(this.aS, 0.0F, 1.0F);
         this.aU = this.aT;
         this.aT = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dP().Y())) * this.aS;
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
               eum $$3 = this.ds();
               if (this.aR) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bH();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cly) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aQ = false;
         }
      }
   }

   @Nullable
   protected avh s() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return avi.cm;
         case d:
            return avi.cl;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.da()) {
         this.s = 0;
         this.f(this.du(), this.dw(), this.dA());
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
      return this.c($$0) ? ayf.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cnv.a B() {
      cnv.a $$0 = this.D();
      if ($$0 != null) {
         this.aL = this.cK().e;
         return $$0;
      } else if (this.C()) {
         return cnv.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aM = $$1;
            return cnv.a.d;
         } else {
            return cnv.a.e;
         }
      }
   }

   public float u() {
      euh $$0 = this.cK();
      int $$1 = ayf.a($$0.a);
      int $$2 = ayf.c($$0.d);
      int $$3 = ayf.a($$0.e);
      int $$4 = ayf.c($$0.e - this.aP);
      int $$5 = ayf.a($$0.c);
      int $$6 = ayf.c($$0.f);
      io.a $$7 = new io.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               emw $$12 = this.dP().b_($$7);
               if ($$12.a(awc.a)) {
                  $$9 = Math.max($$9, $$12.a((daf)this.dP(), $$7));
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
      euh $$0 = this.cK();
      euh $$1 = new euh($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayf.a($$1.a) - 1;
      int $$3 = ayf.c($$1.d) + 1;
      int $$4 = ayf.a($$1.b) - 1;
      int $$5 = ayf.c($$1.e) + 1;
      int $$6 = ayf.a($$1.c) - 1;
      int $$7 = ayf.c($$1.f) + 1;
      evf $$8 = evc.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      io.a $$11 = new io.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     drd $$16 = this.dP().a_($$11);
                     if (!($$16.b() instanceof dnd) && evc.c($$16.k(this.dP(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, euq.i)) {
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
      euh $$0 = this.cK();
      int $$1 = ayf.a($$0.a);
      int $$2 = ayf.c($$0.d);
      int $$3 = ayf.a($$0.b);
      int $$4 = ayf.c($$0.b + 0.001);
      int $$5 = ayf.a($$0.c);
      int $$6 = ayf.c($$0.f);
      boolean $$7 = false;
      this.aL = -Double.MAX_VALUE;
      io.a $$8 = new io.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               emw $$12 = this.dP().b_($$8);
               if ($$12.a(awc.a)) {
                  float $$13 = (float)$$10 + $$12.a((daf)this.dP(), $$8);
                  this.aL = Math.max((double)$$13, this.aL);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cnv.a D() {
      euh $$0 = this.cK();
      double $$1 = $$0.e + 0.001;
      int $$2 = ayf.a($$0.a);
      int $$3 = ayf.c($$0.d);
      int $$4 = ayf.a($$0.e);
      int $$5 = ayf.c($$1);
      int $$6 = ayf.a($$0.c);
      int $$7 = ayf.c($$0.f);
      boolean $$8 = false;
      io.a $$9 = new io.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               emw $$13 = this.dP().b_($$9);
               if ($$13.a(awc.a) && $$1 < (double)((float)$$9.v() + $$13.a((daf)this.dP(), $$9))) {
                  if (!$$13.b()) {
                     return cnv.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cnv.a.b : null;
   }

   @Override
   protected double aY() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.aZ();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aO == cnv.a.e && this.aN != cnv.a.e && this.aN != cnv.a.d) {
         this.aL = this.e(1.0);
         this.a_(this.du(), (double)(this.u() - this.dk()) + 0.101, this.dA());
         this.g(this.ds().d(1.0, 0.0, 1.0));
         this.aP = 0.0;
         this.aN = cnv.a.a;
      } else {
         if (this.aN == cnv.a.a) {
            $$1 = (this.aL - this.dw()) / (double)this.dk();
            this.p = 0.9F;
         } else if (this.aN == cnv.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aN == cnv.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aN == cnv.a.e) {
            this.p = 0.9F;
         } else if (this.aN == cnv.a.d) {
            this.p = this.aM;
            if (this.cQ() instanceof cly) {
               this.aM /= 2.0F;
            }
         }

         eum $$2 = this.ds();
         this.o($$2.c * (double)this.p, $$2.d + $$0, $$2.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            eum $$3 = this.ds();
            this.o($$3.c, ($$3.d + $$1 * (this.aY() / 0.65)) * 0.75, $$3.e);
         }
      }
   }

   private void G() {
      if (this.bS()) {
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

         this.r(this.dF() + this.r);
         if (this.aJ) {
            $$0 += 0.04F;
         }

         if (this.aK) {
            $$0 -= 0.005F;
         }

         this.g(this.ds().b((double)(ayf.a(-this.dF() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayf.b(this.dF() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aI && !this.aH || this.aJ, this.aH && !this.aI || this.aJ);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(brw $$0) {
      return $$0.dj() < this.dj();
   }

   @Override
   protected void a(brw $$0, brw.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ak().a(awa.s)) {
         $$0.r($$0.dF() + this.r);
         $$0.n($$0.cs() + this.r);
         this.c($$0);
         if ($$0 instanceof ceg && this.cS().size() == this.y()) {
            int $$2 = $$0.al() % 2 == 0 ? 90 : 270;
            $$0.o(((ceg)$$0).aY + (float)$$2);
            $$0.n($$0.cs() + (float)$$2);
         }
      }
   }

   @Override
   public eum b(bsq $$0) {
      eum $$1 = a((double)(this.dj() * ayf.g), (double)$$0.dj(), $$0.dF());
      double $$2 = this.du() + $$1.c;
      double $$3 = this.dA() + $$1.e;
      io $$4 = io.a($$2, this.cK().e, $$3);
      io $$5 = $$4.d();
      if (!this.dP().z($$5)) {
         List<eum> $$6 = Lists.newArrayList();
         double $$7 = this.dP().j($$4);
         if (cny.a($$7)) {
            $$6.add(new eum($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dP().j($$5);
         if (cny.a($$8)) {
            $$6.add(new eum($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fI().iterator();

         while (var14.hasNext()) {
            btc $$9 = (btc)var14.next();

            for (eum $$10 : $$6) {
               if (cny.a(this.dP(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(brw $$0) {
      $$0.o(this.dF());
      float $$1 = ayf.g($$0.dF() - this.dF());
      float $$2 = ayf.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.r($$0.dF() + $$2 - $$1);
      $$0.n($$0.dF());
   }

   @Override
   public void k(brw $$0) {
      this.c($$0);
   }

   @Override
   protected void b(ud $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(ud $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cnv.b.a($$0.l("Type")));
      }
   }

   @Override
   public bpw a(cly $$0, bpv $$1) {
      if ($$0.fR()) {
         return bpw.d;
      } else if (this.q < 60.0F) {
         if (!this.dP().B) {
            return $$0.n(this) ? bpw.b : bpw.d;
         } else {
            return bpw.a;
         }
      } else {
         return bpw.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, drd $$2, io $$3) {
      this.aP = this.ds().d;
      if (!this.bR()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aN != cnv.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dQ().k());
               if (!this.dP().B && !this.dK()) {
                  this.an();
                  if (this.dP().aa().b(dav.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(ctt.pp);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dP().b_(this.dp().d()).a(awc.a) && $$0 < 0.0) {
            this.ac -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.ao.a($$0 == 0 ? j : k) && this.cQ() != null;
   }

   private void b(int $$0) {
      this.ao.a(l, $$0);
   }

   private int H() {
      return this.ao.a(l);
   }

   public float a(float $$0) {
      return ayf.i($$0, this.aU, this.aT);
   }

   public void a(cnv.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public cnv.b x() {
      return cnv.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(brw $$0) {
      return this.cS().size() < this.y() && !this.a(awc.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public bsq cQ() {
      return this.cT() instanceof bsq $$0 ? $$0 : super.cQ();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aH = $$0;
      this.aI = $$1;
      this.aJ = $$2;
      this.aK = $$3;
   }

   @Override
   protected wx cr() {
      return wx.c(this.ah_().a());
   }

   @Override
   public boolean bj() {
      return this.aN == cnv.a.b || this.aN == cnv.a.c;
   }

   @Override
   public ctq dC() {
      return new ctq(this.ah_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements ayz {
      a(dec.n, "oak"),
      b(dec.o, "spruce"),
      c(dec.p, "birch"),
      d(dec.q, "jungle"),
      e(dec.r, "acacia"),
      f(dec.s, "cherry"),
      g(dec.t, "dark_oak"),
      h(dec.u, "mangrove"),
      i(dec.v, "bamboo");

      private final String k;
      private final dea l;
      public static final ayz.a<cnv.b> j = ayz.a(cnv.b::values);
      private static final IntFunction<cnv.b> m = aww.a(Enum::ordinal, values(), aww.a.a);

      private b(dea $$0, String $$1) {
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

      public dea b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cnv.b a(int $$0) {
         return m.apply($$0);
      }

      public static cnv.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
