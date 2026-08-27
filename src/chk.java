import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chk extends chv implements bnm<chk.b> {
   private static final agn<Integer> i = agq.a(chk.class, agp.b);
   private static final agn<Boolean> j = agq.a(chk.class, agp.k);
   private static final agn<Boolean> k = agq.a(chk.class, agp.k);
   private static final agn<Integer> l = agq.a(chk.class, agp.b);
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
   private chk.a aM;
   private chk.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public chk(bmc<? extends chk> $$0, ctx $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public chk(ctx $$0, double $$1, double $$2, double $$3) {
      this(bmc.l, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(i, chk.b.a.ordinal());
      this.an.a(j, false);
      this.an.a(k, false);
      this.an.a(l, 0);
   }

   @Override
   public boolean h(blw $$0) {
      return a(this, $$0);
   }

   public static boolean a(blw $$0, blw $$1) {
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
   protected emc a(ic.a $$0, l.a $$1) {
      return bmo.i(super.a($$0, $$1));
   }

   @Override
   protected emc a(blw $$0, blz $$1, float $$2) {
      float $$3 = this.x();
      if (this.cP().size() > 1) {
         int $$4 = this.cP().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof byc) {
            $$3 += 0.2F;
         }
      }

      return new emc(0.0, this.y() == chk.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dB() * (float) (Math.PI / 180.0));
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

      this.dL().a(jx.aj, this.dq() + (double)this.ag.i(), this.ds() + 0.7, this.dw() + (double)this.ag.i(), 0.0, 0.0, 0.0);
      if (this.ag.a(20) == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), this.aO(), this.db(), 1.0F, 0.8F + 0.4F * this.ag.i(), false);
         this.a(dnz.O, this.cN());
      }
   }

   @Override
   public void g(blw $$0) {
      if ($$0 instanceof chk) {
         if ($$0.cH().b < this.cH().e) {
            super.g($$0);
         }
      } else if ($$0.cH().b <= this.cH().b) {
         super.g($$0);
      }
   }

   @Override
   public cnb ai_() {
      return switch (this.y()) {
         case b -> cnj.nV;
         case c -> cnj.nX;
         case d -> cnj.nZ;
         case e -> cnj.ob;
         case f -> cnj.od;
         case g -> cnj.of;
         case h -> cnj.oh;
         case i -> cnj.oj;
         default -> cnj.nT;
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
   public double p_() {
      return this.s > 0 ? this.t : this.dq();
   }

   @Override
   public double N_() {
      return this.s > 0 ? this.u : this.ds();
   }

   @Override
   public double O_() {
      return this.s > 0 ? this.v : this.dw();
   }

   @Override
   public float f_() {
      return this.s > 0 ? (float)this.aF : this.dD();
   }

   @Override
   public float q_() {
      return this.s > 0 ? (float)this.aE : this.dB();
   }

   @Override
   public ic cF() {
      return this.cE().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.C();
      if (this.aM != chk.a.b && this.aM != chk.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dL().B && this.q >= 60.0F) {
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
         if (!(this.cQ() instanceof cfq)) {
            this.a(false, false);
         }

         this.G();
         if (this.dL().B) {
            this.H();
            this.dL().a(new aej(this.c(0), this.c(1)));
         }

         this.a(bmu.a, this.do());
      } else {
         this.g(emc.b);
      }

      this.A();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aU()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               ars $$1 = this.s();
               if ($$1 != null) {
                  emc $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dL().a(null, this.dq() + $$3, this.ds(), this.dw() + $$4, $$1, this.db(), 1.0F, 0.8F + 0.4F * this.ag.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aQ();
      List<blw> $$5 = this.dL().a(this, this.cH().c(0.2F, -0.01F, 0.2F), bmb.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dL().B && !(this.cN() instanceof cfq);

         for (blw $$7 : $$5) {
            if (!$$7.w(this)) {
               if ($$6 && this.cP().size() < this.z() && !$$7.bO() && this.a($$7) && $$7 instanceof bmo && !($$7 instanceof bze) && !($$7 instanceof cfq)) {
                  $$7.m(this);
               } else {
                  this.g($$7);
               }
            }
         }
      }
   }

   private void A() {
      if (this.dL().B) {
         int $$0 = this.I();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = aup.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dL().X())) * this.aR;
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
               emc $$3 = this.do();
               if (this.aQ) {
                  this.g($$3.b(0.0, -0.7, 0.0));
                  this.bB();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cfq) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected ars s() {
      switch (this.C()) {
         case a:
         case b:
         case c:
            return art.cj;
         case d:
            return art.ci;
         case e:
         default:
            return null;
      }
   }

   private void B() {
      if (this.cX()) {
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
      return this.c($$0) ? aup.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private chk.a C() {
      chk.a $$0 = this.E();
      if ($$0 != null) {
         this.aK = this.cH().e;
         return $$0;
      } else if (this.D()) {
         return chk.a.a;
      } else {
         float $$1 = this.w();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return chk.a.d;
         } else {
            return chk.a.e;
         }
      }
   }

   public float u() {
      elx $$0 = this.cH();
      int $$1 = aup.a($$0.a);
      int $$2 = aup.c($$0.d);
      int $$3 = aup.a($$0.e);
      int $$4 = aup.c($$0.e - this.aO);
      int $$5 = aup.a($$0.c);
      int $$6 = aup.c($$0.f);
      hx.a $$7 = new hx.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eez $$12 = this.dL().b_($$7);
               if ($$12.a(asn.a)) {
                  $$9 = Math.max($$9, $$12.a((ctd)this.dL(), $$7));
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
      elx $$0 = this.cH();
      elx $$1 = new elx($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = aup.a($$1.a) - 1;
      int $$3 = aup.c($$1.d) + 1;
      int $$4 = aup.a($$1.b) - 1;
      int $$5 = aup.c($$1.e) + 1;
      int $$6 = aup.a($$1.c) - 1;
      int $$7 = aup.c($$1.f) + 1;
      emv $$8 = ems.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      hx.a $$11 = new hx.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     djp $$16 = this.dL().a_($$11);
                     if (!($$16.b() instanceof dfz) && ems.c($$16.k(this.dL(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, emg.i)) {
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
      elx $$0 = this.cH();
      int $$1 = aup.a($$0.a);
      int $$2 = aup.c($$0.d);
      int $$3 = aup.a($$0.b);
      int $$4 = aup.c($$0.b + 0.001);
      int $$5 = aup.a($$0.c);
      int $$6 = aup.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      hx.a $$8 = new hx.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eez $$12 = this.dL().b_($$8);
               if ($$12.a(asn.a)) {
                  float $$13 = (float)$$10 + $$12.a((ctd)this.dL(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private chk.a E() {
      elx $$0 = this.cH();
      double $$1 = $$0.e + 0.001;
      int $$2 = aup.a($$0.a);
      int $$3 = aup.c($$0.d);
      int $$4 = aup.a($$0.e);
      int $$5 = aup.c($$1);
      int $$6 = aup.a($$0.c);
      int $$7 = aup.c($$0.f);
      boolean $$8 = false;
      hx.a $$9 = new hx.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eez $$13 = this.dL().b_($$9);
               if ($$13.a(asn.a) && $$1 < (double)((float)$$9.v() + $$13.a((ctd)this.dL(), $$9))) {
                  if (!$$13.b()) {
                     return chk.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? chk.a.b : null;
   }

   private void G() {
      double $$0 = -0.04F;
      double $$1 = this.aV() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == chk.a.e && this.aM != chk.a.e && this.aM != chk.a.d) {
         this.aK = this.e(1.0);
         this.a_(this.dq(), (double)(this.u() - this.dh()) + 0.101, this.dw());
         this.g(this.do().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = chk.a.a;
      } else {
         if (this.aM == chk.a.a) {
            $$2 = (this.aK - this.ds()) / (double)this.dh();
            this.p = 0.9F;
         } else if (this.aM == chk.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == chk.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == chk.a.e) {
            this.p = 0.9F;
         } else if (this.aM == chk.a.d) {
            this.p = this.aL;
            if (this.cN() instanceof cfq) {
               this.aL /= 2.0F;
            }
         }

         emc $$3 = this.do();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            emc $$4 = this.do();
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

         this.r(this.dB() + this.r);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.g(this.do().b((double)(aup.a(-this.dB() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(aup.b(this.dB() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float x() {
      return 0.0F;
   }

   public boolean a(blw $$0) {
      return $$0.dg() < this.dg();
   }

   @Override
   protected void a(blw $$0, blw.a $$1) {
      super.a($$0, $$1);
      if (!$$0.ai().a(asl.t)) {
         $$0.r($$0.dB() + this.r);
         $$0.n($$0.cp() + this.r);
         this.b($$0);
         if ($$0 instanceof byc && this.cP().size() == this.z()) {
            int $$2 = $$0.aj() % 2 == 0 ? 90 : 270;
            $$0.o(((byc)$$0).aU + (float)$$2);
            $$0.n($$0.cp() + (float)$$2);
         }
      }
   }

   @Override
   public emc b(bmo $$0) {
      emc $$1 = a((double)(this.dg() * aup.g), (double)$$0.dg(), $$0.dB());
      double $$2 = this.dq() + $$1.c;
      double $$3 = this.dw() + $$1.e;
      hx $$4 = hx.a($$2, this.cH().e, $$3);
      hx $$5 = $$4.d();
      if (!this.dL().z($$5)) {
         List<emc> $$6 = Lists.newArrayList();
         double $$7 = this.dL().j($$4);
         if (chn.a($$7)) {
            $$6.add(new emc($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dL().j($$5);
         if (chn.a($$8)) {
            $$6.add(new emc($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fA().iterator();

         while (var14.hasNext()) {
            bna $$9 = (bna)var14.next();

            for (emc $$10 : $$6) {
               if (chn.a(this.dL(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(blw $$0) {
      $$0.o(this.dB());
      float $$1 = aup.g($$0.dB() - this.dB());
      float $$2 = aup.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.r($$0.dB() + $$2 - $$1);
      $$0.n($$0.dB());
   }

   @Override
   public void j(blw $$0) {
      this.b($$0);
   }

   @Override
   protected void b(so $$0) {
      $$0.a("Type", this.y().c());
   }

   @Override
   protected void a(so $$0) {
      if ($$0.b("Type", 8)) {
         this.a(chk.b.a($$0.l("Type")));
      }
   }

   @Override
   public bkc a(cfq $$0, bkb $$1) {
      if ($$0.fI()) {
         return bkc.d;
      } else if (this.q < 60.0F) {
         if (!this.dL().B) {
            return $$0.m(this) ? bkc.b : bkc.d;
         } else {
            return bkc.a;
         }
      } else {
         return bkc.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
      this.aO = this.do().d;
      if (!this.bO()) {
         if ($$1) {
            if (this.ab > 3.0F) {
               if (this.aM != chk.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ab, 1.0F, this.dM().k());
               if (!this.dL().B && !this.dG()) {
                  this.al();
                  if (this.dL().Z().b(ctt.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.y().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cnj.po);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dL().b_(this.dl().d()).a(asn.a) && $$0 < 0.0) {
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
      return aup.i($$0, this.aT, this.aS);
   }

   public void a(chk.b $$0) {
      this.an.b(i, $$0.ordinal());
   }

   public chk.b y() {
      return chk.b.a(this.an.b(i));
   }

   @Override
   protected boolean q(blw $$0) {
      return this.cP().size() < this.z() && !this.a(asn.a);
   }

   protected int z() {
      return 2;
   }

   @Nullable
   @Override
   public bmo cN() {
      return this.cQ() instanceof bmo $$0 ? $$0 : super.cN();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   protected vg co() {
      return vg.c(this.ai_().a());
   }

   @Override
   public boolean be() {
      return this.aM == chk.a.b || this.aM == chk.a.c;
   }

   @Override
   public cng dy() {
      return new cng(this.ai_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements avl {
      a(cxa.n, "oak"),
      b(cxa.o, "spruce"),
      c(cxa.p, "birch"),
      d(cxa.q, "jungle"),
      e(cxa.r, "acacia"),
      f(cxa.s, "cherry"),
      g(cxa.t, "dark_oak"),
      h(cxa.u, "mangrove"),
      i(cxa.v, "bamboo");

      private final String k;
      private final cwy l;
      public static final avl.a<chk.b> j = avl.a(chk.b::values);
      private static final IntFunction<chk.b> m = ath.a(Enum::ordinal, values(), ath.a.a);

      private b(cwy $$0, String $$1) {
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

      public cwy b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static chk.b a(int $$0) {
         return m.apply($$0);
      }

      public static chk.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
