import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ceq extends cfb implements blh<ceq.b> {
   private static final afc<Integer> i = aff.a(ceq.class, afe.b);
   private static final afc<Boolean> j = aff.a(ceq.class, afe.k);
   private static final afc<Boolean> k = aff.a(ceq.class, afe.k);
   private static final afc<Integer> l = aff.a(ceq.class, afe.b);
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
   private ceq.a aM;
   private ceq.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public ceq(bjx<? extends ceq> $$0, cqz $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public ceq(cqz $$0, double $$1, double $$2, double $$3) {
      this(bjx.k, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float a(bkv $$0, bju $$1) {
      return $$1.b;
   }

   @Override
   protected bjt.b aU() {
      return bjt.b.c;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(i, ceq.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(bjt $$0) {
      return a(this, $$0);
   }

   public static boolean a(bjt $$0, bjt $$1) {
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
   protected eif a(hx.a $$0, l.a $$1) {
      return bkj.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      float $$3 = this.w();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof bvu) {
            $$3 += 0.2F;
         }
      }

      return new Vector3f(0.0F, this.x() == ceq.b.i ? $$1.b * 0.8888889F : $$1.b / 3.0F, $$3);
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

      this.dL().a(js.ag, this.dq() + (double)this.ag.i(), this.ds() + 0.7, this.dw() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), this.aM(), this.da(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(dkl.O, this.cN());
      }
   }

   @Override
   public void g(bjt $$0) {
      if ($$0 instanceof ceq) {
         if ($$0.cG().b < this.cG().e) {
            super.g($$0);
         }
      } else if ($$0.cG().b <= this.cG().b) {
         super.g($$0);
      }
   }

   @Override
   public cke ag_() {
      return switch (this.x()) {
         case b -> ckm.nk;
         case c -> ckm.nm;
         case d -> ckm.no;
         case e -> ckm.nq;
         case f -> ckm.ns;
         case g -> ckm.nu;
         case h -> ckm.nw;
         case i -> ckm.ny;
         default -> ckm.ni;
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
      if (this.aM != ceq.a.b && this.aM != ceq.a.c) {
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
         if (!(this.cQ() instanceof ccx)) {
            this.a(false, false);
         }

         this.G();
         if (this.dL().B) {
            this.H();
            this.dL().a(new acy(this.c(0), this.c(1)));
         }

         this.a(bkp.a, this.do());
      } else {
         this.f(eif.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aS()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               aqc $$1 = this.s();
               if ($$1 != null) {
                  eif $$2 = this.f(1.0F);
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
      List<bjt> $$5 = this.dL().a(this, this.cG().c(0.2F, -0.01F, 0.2F), bjw.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dL().B && !(this.cN() instanceof ccx);

         for (bjt $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cP().size() < this.y() && !$$7.bN() && this.a($$7) && $$7 instanceof bkj && !($$7 instanceof bww) && !($$7 instanceof ccx)) {
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

         this.aR = asy.a(this.aR, 0.0F, 1.0F);
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
               eif $$3 = this.do();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bA();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof ccx) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected aqc s() {
      switch (this.B()) {
         case a:
         case b:
         case c:
            return aqd.bX;
         case d:
            return aqd.bW;
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
      return this.c($$0) ? asy.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private ceq.a B() {
      ceq.a $$0 = this.E();
      if ($$0 != null) {
         this.aK = this.cG().e;
         return $$0;
      } else if (this.C()) {
         return ceq.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return ceq.a.d;
         } else {
            return ceq.a.e;
         }
      }
   }

   public float t() {
      eia $$0 = this.cG();
      int $$1 = asy.a($$0.a);
      int $$2 = asy.c($$0.d);
      int $$3 = asy.a($$0.e);
      int $$4 = asy.c($$0.e - this.aO);
      int $$5 = asy.a($$0.c);
      int $$6 = asy.c($$0.f);
      ht.a $$7 = new ht.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ebe $$12 = this.dL().b_($$7);
               if ($$12.a(aqx.a)) {
                  $$9 = Math.max($$9, $$12.a((cqf)this.dL(), $$7));
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
      eia $$0 = this.cG();
      eia $$1 = new eia($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = asy.a($$1.a) - 1;
      int $$3 = asy.c($$1.d) + 1;
      int $$4 = asy.a($$1.b) - 1;
      int $$5 = asy.c($$1.e) + 1;
      int $$6 = asy.a($$1.c) - 1;
      int $$7 = asy.c($$1.f) + 1;
      eiy $$8 = eiv.a($$1);
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
                     dgb $$16 = this.dL().a_($$11);
                     if (!($$16.b() instanceof dcy) && eiv.c($$16.k(this.dL(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, eij.i)) {
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
      eia $$0 = this.cG();
      int $$1 = asy.a($$0.a);
      int $$2 = asy.c($$0.d);
      int $$3 = asy.a($$0.b);
      int $$4 = asy.c($$0.b + 0.001);
      int $$5 = asy.a($$0.c);
      int $$6 = asy.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      ht.a $$8 = new ht.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ebe $$12 = this.dL().b_($$8);
               if ($$12.a(aqx.a)) {
                  float $$13 = (float)$$10 + $$12.a((cqf)this.dL(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private ceq.a E() {
      eia $$0 = this.cG();
      double $$1 = $$0.e + 0.001;
      int $$2 = asy.a($$0.a);
      int $$3 = asy.c($$0.d);
      int $$4 = asy.a($$0.e);
      int $$5 = asy.c($$1);
      int $$6 = asy.a($$0.c);
      int $$7 = asy.c($$0.f);
      boolean $$8 = false;
      ht.a $$9 = new ht.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ebe $$13 = this.dL().b_($$9);
               if ($$13.a(aqx.a) && $$1 < (double)((float)$$9.v() + $$13.a((cqf)this.dL(), $$9))) {
                  if (!$$13.b()) {
                     return ceq.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? ceq.a.b : null;
   }

   private void G() {
      double $$0 = -0.04F;
      double $$1 = this.aT() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == ceq.a.e && this.aM != ceq.a.e && this.aM != ceq.a.d) {
         this.aK = this.e(1.0);
         this.e(this.dq(), (double)(this.t() - this.dg()) + 0.101, this.dw());
         this.f(this.do().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = ceq.a.a;
      } else {
         if (this.aM == ceq.a.a) {
            $$2 = (this.aK - this.ds()) / (double)this.dg();
            this.p = 0.9F;
         } else if (this.aM == ceq.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == ceq.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == ceq.a.e) {
            this.p = 0.9F;
         } else if (this.aM == ceq.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof ccx) {
               this.aL /= 2.0F;
            }
         }

         eif $$3 = this.do();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            eif $$4 = this.do();
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

         this.f(this.do().b((double)(asy.a(-this.dB() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(asy.b(this.dB() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean a(bjt $$0) {
      return $$0.df() < this.df();
   }

   @Override
   protected void a(bjt $$0, bjt.a $$1) {
      super.a($$0, $$1);
      $$0.r($$0.dB() + this.r);
      $$0.n($$0.co() + this.r);
      this.b($$0);
      if ($$0 instanceof bvu && this.cP().size() == this.y()) {
         int $$2 = $$0.ah() % 2 == 0 ? 90 : 270;
         $$0.o(((bvu)$$0).aU + (float)$$2);
         $$0.n($$0.co() + (float)$$2);
      }
   }

   @Override
   public eif b(bkj $$0) {
      eif $$1 = a((double)(this.df() * asy.g), (double)$$0.df(), $$0.dB());
      double $$2 = this.dq() + $$1.c;
      double $$3 = this.dw() + $$1.e;
      ht $$4 = ht.a($$2, this.cG().e, $$3);
      ht $$5 = $$4.d();
      if (!this.dL().y($$5)) {
         List<eif> $$6 = Lists.newArrayList();
         double $$7 = this.dL().i($$4);
         if (cet.a($$7)) {
            $$6.add(new eif($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dL().i($$5);
         if (cet.a($$8)) {
            $$6.add(new eif($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fA().iterator();

         while (var14.hasNext()) {
            bkv $$9 = (bkv)var14.next();

            for (eif $$10 : $$6) {
               if (cet.a(this.dL(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(bjt $$0) {
      $$0.o(this.dB());
      float $$1 = asy.g($$0.dB() - this.dB());
      float $$2 = asy.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dB() + $$2 - $$1);
      $$0.n($$0.dB());
   }

   @Override
   public void j(bjt $$0) {
      this.b($$0);
   }

   @Override
   protected void b(rt $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(rt $$0) {
      if ($$0.b("Type", 8)) {
         this.a(ceq.b.a($$0.l("Type")));
      }
   }

   @Override
   public bib a(ccx $$0, bia $$1) {
      if ($$0.fI()) {
         return bib.d;
      } else if (this.q < 60.0F) {
         if (!this.dL().B) {
            return $$0.n(this) ? bib.b : bib.d;
         } else {
            return bib.a;
         }
      } else {
         return bib.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dgb $$2, ht $$3) {
      this.aO = this.do().d;
      if (!this.bN()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != ceq.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dM().k());
               if (!this.dL().B && !this.dG()) {
                  this.aj();
                  if (this.dL().X().b(cqv.h)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(ckm.oB);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dL().b_(this.dl().d()).a(aqx.a) && $$0 < 0.0) {
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
      return asy.i($$0, this.aT, this.aS);
   }

   public void a(ceq.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public ceq.b x() {
      return ceq.b.a(this.an.b(i));
   }

   @Override
   protected boolean r(bjt $$0) {
      return this.cP().size() < this.y() && !this.a(aqx.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public bkj cN() {
      return this.cQ() instanceof bkj $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected ui cn() {
      return ui.c(this.ag_().a());
   }

   @Override
   public boolean bc() {
      return this.aM == ceq.a.b || this.aM == ceq.a.c;
   }

   @Override
   public ckj dy() {
      return new ckj(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements atr {
      a(cuc.n, "oak"),
      b(cuc.o, "spruce"),
      c(cuc.p, "birch"),
      d(cuc.q, "jungle"),
      e(cuc.r, "acacia"),
      f(cuc.s, "cherry"),
      g(cuc.t, "dark_oak"),
      h(cuc.u, "mangrove"),
      i(cuc.v, "bamboo");

      private final String k;
      private final cua l;
      public static final atr.a<ceq.b> j = atr.a(ceq.b::values);
      private static final IntFunction<ceq.b> m = arr.a(Enum::ordinal, values(), arr.a.a);

      private b(cua $$0, String $$1) {
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

      public cua b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static ceq.b a(int $$0) {
         return m.apply($$0);
      }

      public static ceq.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
