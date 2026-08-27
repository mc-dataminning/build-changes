import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cff extends cfq implements blw<cff.b> {
   private static final afm<Integer> i = afp.a(cff.class, afo.b);
   private static final afm<Boolean> j = afp.a(cff.class, afo.k);
   private static final afm<Boolean> k = afp.a(cff.class, afo.k);
   private static final afm<Integer> l = afp.a(cff.class, afo.b);
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
   private cff.a aM;
   private cff.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cff(bkm<? extends cff> $$0, crs $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cff(crs $$0, double $$1, double $$2, double $$3) {
      this(bkm.k, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(blk $$0, bkj $$1) {
      return $$1.b;
   }

   @Override
   protected bki.b aU() {
      return bki.b.c;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(i, cff.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(bki $$0) {
      return a(this, $$0);
   }

   public static boolean a(bki $$0, bki $$1) {
      return ($$1.bx() || $$1.bs()) && !$$0.y($$1);
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected eji a(hx.a $$0, l.a $$1) {
      return bky.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      float $$3 = this.w();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bwj) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.x() == cff.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dL().B) {
         this.aP = true;
         this.aQ = $$0;
         if (this.I() == 0) {
            this.b(60);
         }
      }

      this.dL().a(js.ah, this.dq() + (double)this.ag.i(), this.ds() + 0.7, this.dw() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), this.aM(), this.da(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(dlg.O, this.cN());
      }
   }

   @Override
   public void g(bki $$0) {
      if ($$0 instanceof cff) {
         if ($$0.cG().b < this.cG().e) {
            super.g($$0);
         }
      } else if ($$0.cG().b <= this.cG().b) {
         super.g($$0);
      }
   }

   @Override
   public ckw ag_() {
      return switch (this.x()) {
         case b -> cle.nk;
         case c -> cle.nm;
         case d -> cle.no;
         case e -> cle.nq;
         case f -> cle.ns;
         case g -> cle.nu;
         case h -> cle.nw;
         case i -> cle.ny;
         default -> cle.ni;
      };
   }

   @Override
   public void m(float $$0) {
      this.m(-this.O());
      this.d(10);
      this.b(this.M() * 11.0F);
   }

   @Override
   public boolean br() {
      return !this.dG();
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
      return this.s > 0 ? this.t : this.dq();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.u : this.ds();
   }

   @Override
   public double M_() {
      return this.s > 0 ? this.v : this.dw();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aF : this.dD();
   }

   @Override
   public float p_() {
      return this.s > 0 ? (float)this.aE : this.dB();
   }

   @Override
   public hx cE() {
      return this.cD().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.B();
      if (this.aM != cff.a.b && this.aM != cff.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dL().B && this.q >= 60.0F) {
         this.bA();
      }

      if (this.N() > 0) {
         this.d(this.N() - 1);
      }

      if (this.M() > 0.0F) {
         this.b(this.M() - 1.0F);
      }

      super.l();
      this.A();
      if (this.cW()) {
         if (!(this.cQ() instanceof cdm)) {
            this.a(false, false);
         }

         this.G();
         if (this.dL().B) {
            this.H();
            this.dL().a(new adi(this.c(0), this.c(1)));
         }

         this.a(ble.a, this.do());
      } else {
         this.f(eji.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aS()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               aqm $$1 = this.s();
               if ($$1 != null) {
                  eji $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dL().a(null, this.dq() + $$3, this.ds(), this.dw() + $$4, $$1, this.da(), 1.0F, 0.8F + 0.4F * this.ag.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aO();
      List<bki> $$5 = this.dL().a(this, this.cG().c(0.2F, -0.01F, 0.2F), bkl.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dL().B && !(this.cN() instanceof cdm);

         for (bki $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.y() && !$$7.bN() && this.a($$7) && $$7 instanceof bky && !($$7 instanceof bxl) && !($$7 instanceof cdm)) {
                  $$7.n(this);
               } else {
                  this.g($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dL().B) {
         int $$0 = this.I();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = ati.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dL().V())) * this.aR;
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
               eji $$3 = this.do();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bA();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cdm) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected aqm s() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return aqn.bX;
         case d:
            return aqn.bW;
         case e:
         default:
            return null;
      }
   }

   private void A() {
      if (this.cW()) {
         this.s = 0;
         this.f(this.dq(), this.ds(), this.dw());
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
      return this.c($$0) ? ati.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cff.a B() {
      cff.a $$0 = this.E();
      if ($$0 != null) {
         this.aK = this.cG().e;
         return $$0;
      } else if (this.C()) {
         return cff.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cff.a.d;
         } else {
            return cff.a.e;
         }
      }
   }

   public float t() {
      ejd $$0 = this.cG();
      int $$1 = ati.a($$0.a);
      int $$2 = ati.c($$0.d);
      int $$3 = ati.a($$0.e);
      int $$4 = ati.c($$0.e - this.aO);
      int $$5 = ati.a($$0.c);
      int $$6 = ati.c($$0.f);
      ht.a $$7 = new ht.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ecg $$12 = this.dL().b_($$7);
               if ($$12.a(arh.a)) {
                  $$9 = Math.max($$9, $$12.a((cqy)this.dL(), $$7));
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
      ejd $$0 = this.cG();
      ejd $$1 = new ejd($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ati.a($$1.a) - 1;
      int $$3 = ati.c($$1.d) + 1;
      int $$4 = ati.a($$1.b) - 1;
      int $$5 = ati.c($$1.e) + 1;
      int $$6 = ati.a($$1.c) - 1;
      int $$7 = ati.c($$1.f) + 1;
      ekb $$8 = ejy.a($$1);
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
                     dgw $$16 = this.dL().a_($$11);
                     if (!($$16.b() instanceof dds) && ejy.c($$16.k(this.dL(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ejm.i)) {
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

   private boolean C() {
      ejd $$0 = this.cG();
      int $$1 = ati.a($$0.a);
      int $$2 = ati.c($$0.d);
      int $$3 = ati.a($$0.b);
      int $$4 = ati.c($$0.b + 0.001);
      int $$5 = ati.a($$0.c);
      int $$6 = ati.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      ht.a $$8 = new ht.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ecg $$12 = this.dL().b_($$8);
               if ($$12.a(arh.a)) {
                  float $$13 = (float)$$10 + $$12.a((cqy)this.dL(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cff.a E() {
      ejd $$0 = this.cG();
      double $$1 = $$0.e + 0.001;
      int $$2 = ati.a($$0.a);
      int $$3 = ati.c($$0.d);
      int $$4 = ati.a($$0.e);
      int $$5 = ati.c($$1);
      int $$6 = ati.a($$0.c);
      int $$7 = ati.c($$0.f);
      boolean $$8 = false;
      ht.a $$9 = new ht.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ecg $$13 = this.dL().b_($$9);
               if ($$13.a(arh.a) && $$1 < (double)((float)$$9.v() + $$13.a((cqy)this.dL(), $$9))) {
                  if (!$$13.b()) {
                     return cff.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cff.a.b : null;
   }

   private void G() {
      double $$0 = -0.04F;
      double $$1 = this.aT() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cff.a.e && this.aM != cff.a.e && this.aM != cff.a.d) {
         this.aK = this.e(1.0);
         this.e(this.dq(), (double)(this.t() - this.dg()) + 0.101, this.dw());
         this.f(this.do().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cff.a.a;
      } else {
         if (this.aM == cff.a.a) {
            $$2 = (this.aK - this.ds()) / (double)this.dg();
            this.p = 0.9F;
         } else if (this.aM == cff.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cff.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cff.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cff.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cdm) {
               this.aL /= 2.0F;
            }
         }

         eji $$3 = this.do();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            eji $$4 = this.do();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void H() {
      if (this.bO()) {
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

         this.r(this.dB() + this.r);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.f(this.do().b((double)(ati.a(-this.dB() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ati.b(this.dB() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean a(bki $$0) {
      return $$0.df() < this.df();
   }

   @Override
   protected void a(bki $$0, bki.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dB() + this.r);
      $$0.n($$0.co() + this.r);
      this.b($$0);
      if ($$0 instanceof bwj && this.cP().size() == this.y()) {
         int $$2 = $$0.ah() % 2 == 0 ? 90 : 270;
         $$0.o(((bwj)$$0).aU + (float)$$2);
         $$0.n($$0.co() + (float)$$2);
      }
   }

   @Override
   public eji b(bky $$0) {
      eji $$1 = a((double)(this.df() * ati.g), (double)$$0.df(), $$0.dB());
      double $$2 = this.dq() + $$1.c;
      double $$3 = this.dw() + $$1.e;
      ht $$4 = ht.a($$2, this.cG().e, $$3);
      ht $$5 = $$4.d();
      if (!this.dL().y($$5)) {
         List<eji> $$6 = Lists.newArrayList();
         double $$7 = this.dL().i($$4);
         if (cfi.a($$7)) {
            $$6.add(new eji($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dL().i($$5);
         if (cfi.a($$8)) {
            $$6.add(new eji($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fA().iterator();

         while (var14.hasNext()) {
            blk $$9 = (blk)var14.next();

            for (eji $$10 : $$6) {
               if (cfi.a(this.dL(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(bki $$0) {
      $$0.o(this.dB());
      float $$1 = ati.g($$0.dB() - this.dB());
      float $$2 = ati.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dB() + $$2 - $$1);
      $$0.n($$0.dB());
   }

   @Override
   public void j(bki $$0) {
      this.b($$0);
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(rz $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cff.b.a($$0.l("Type")));
      }
   }

   @Override
   public biq a(cdm $$0, bip $$1) {
      if ($$0.fI()) {
         return biq.d;
      } else if (this.q < 60.0F) {
         if (!this.dL().B) {
            return $$0.n(this) ? biq.b : biq.d;
         } else {
            return biq.a;
         }
      } else {
         return biq.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
      this.aO = this.do().d;
      if (!this.bN()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != cff.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dM().k());
               if (!this.dL().B && !this.dG()) {
                  this.aj();
                  if (this.dL().X().b(cro.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cle.oB);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dL().b_(this.dl().d()).a(arh.a) && $$0 < 0.0) {
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
      return ati.i($$0, this.aT, this.aS);
   }

   public void a(cff.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public cff.b x() {
      return cff.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(bki $$0) {
      return this.cP().size() < this.y() && !this.a(arh.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public bky cN() {
      return this.cQ() instanceof bky $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected ur cn() {
      return ur.c(this.ag_().a());
   }

   @Override
   public boolean bc() {
      return this.aM == cff.a.b || this.aM == cff.a.c;
   }

   @Override
   public clb dy() {
      return new clb(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements aub {
      a(cuv.n, "oak"),
      b(cuv.o, "spruce"),
      c(cuv.p, "birch"),
      d(cuv.q, "jungle"),
      e(cuv.r, "acacia"),
      f(cuv.s, "cherry"),
      g(cuv.t, "dark_oak"),
      h(cuv.u, "mangrove"),
      i(cuv.v, "bamboo");

      private final String k;
      private final cut l;
      public static final aub.a<cff.b> j = aub.a(cff.b::values);
      private static final IntFunction<cff.b> m = asb.a(Enum::ordinal, values(), asb.a.a);

      private b(cut $$0, String $$1) {
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

      public cut b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cff.b a(int $$0) {
         return m.apply($$0);
      }

      public static cff.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
