import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cah extends bfj implements bgy<cah.b> {
   private static final aby<Integer> f = acb.a(cah.class, aca.b);
   private static final aby<Integer> g = acb.a(cah.class, aca.b);
   private static final aby<Float> h = acb.a(cah.class, aca.d);
   private static final aby<Integer> i = acb.a(cah.class, aca.b);
   private static final aby<Boolean> j = acb.a(cah.class, aca.k);
   private static final aby<Boolean> k = acb.a(cah.class, aca.k);
   private static final aby<Integer> l = acb.a(cah.class, aca.b);
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
   private double aD;
   private double aE;
   private double aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private double aK;
   private float aL;
   private cah.a aM;
   private cah.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public cah(bfn<? extends cah> $$0, cmm $$1) {
      super($$0, $$1);
      this.H = true;
   }

   public cah(cmm $$0, double $$1, double $$2, double $$3) {
      this(bfn.k, $$0);
      this.e($$1, $$2, $$3);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
   }

   @Override
   protected float a(bgl $$0, bfk $$1) {
      return $$1.b;
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.c;
   }

   @Override
   protected void a_() {
      this.am.a(f, 0);
      this.am.a(g, 1);
      this.am.a(h, 0.0F);
      this.am.a(i, cah.b.a.ordinal());
      this.am.a(j, false);
      this.am.a(k, false);
      this.am.a(l, 0);
   }

   @Override
   public boolean h(bfj $$0) {
      return a(this, $$0);
   }

   public static boolean a(bfj $$0, bfj $$1) {
      return ($$1.bu() || $$1.bp()) && !$$0.v($$1);
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   public boolean bp() {
      return true;
   }

   @Override
   protected eei a(ha.a $$0, l.a $$1) {
      return bfz.i(super.a($$0, $$1));
   }

   @Override
   public double bx() {
      return this.v() == cah.b.i ? 0.25 : -0.1;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dI().B && !this.dD()) {
         this.m(-this.t());
         this.d(10);
         this.a(this.r() + $$1 * 10.0F);
         this.bl();
         this.a(dgl.o, $$0.d());
         boolean $$2 = $$0.d() instanceof byo && ((byo)$$0.d()).fO().d;
         if ($$2 || this.r() > 40.0F) {
            if (!$$2 && this.dI().X().b(cmi.h)) {
               this.a($$0);
            }

            this.ai();
         }

         return true;
      } else {
         return true;
      }
   }

   protected void a(ben $$0) {
      this.a(this.j());
   }

   @Override
   public void k(boolean $$0) {
      if (!this.dI().B) {
         this.aP = true;
         this.aQ = $$0;
         if (this.F() == 0) {
            this.b(60);
         }
      }

      this.dI().a(iv.ag, this.dn() + (double)this.af.i(), this.dp() + 0.7, this.dt() + (double)this.af.i(), 0.0, 0.0, 0.0);
      if (this.af.a(20) == 0) {
         this.dI().a(this.dn(), this.dp(), this.dt(), this.aK(), this.cY(), 1.0F, 0.8F + 0.4F * this.af.i(), false);
         this.a(dgl.P, this.cL());
      }
   }

   @Override
   public void g(bfj $$0) {
      if ($$0 instanceof cah) {
         if ($$0.cE().b < this.cE().e) {
            super.g($$0);
         }
      } else if ($$0.cE().b <= this.cE().b) {
         super.g($$0);
      }
   }

   public cfu j() {
      return switch (this.v()) {
         case b -> cgc.nk;
         case c -> cgc.nm;
         case d -> cgc.no;
         case e -> cgc.nq;
         case f -> cgc.ns;
         case g -> cgc.nu;
         case h -> cgc.nw;
         case i -> cgc.ny;
         default -> cgc.ni;
      };
   }

   @Override
   public void m(float $$0) {
      this.m(-this.t());
      this.d(10);
      this.a(this.r() * 11.0F);
   }

   @Override
   public boolean bo() {
      return !this.dD();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.t = $$0;
      this.u = $$1;
      this.aD = $$2;
      this.aE = (double)$$3;
      this.aF = (double)$$4;
      this.s = 10;
   }

   @Override
   public ha cC() {
      return this.cB().h();
   }

   @Override
   public void l() {
      this.aN = this.aM;
      this.aM = this.z();
      if (this.aM != cah.a.b && this.aM != cah.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dI().B && this.q >= 60.0F) {
         this.bz();
      }

      if (this.s() > 0) {
         this.d(this.s() - 1);
      }

      if (this.r() > 0.0F) {
         this.a(this.r() - 1.0F);
      }

      super.l();
      this.y();
      if (this.cU()) {
         if (!(this.cO() instanceof byo)) {
            this.a(false, false);
         }

         this.D();
         if (this.dI().B) {
            this.E();
            this.dI().a(new zz(this.c(0), this.c(1)));
         }

         this.a(bgf.a, this.dl());
      } else {
         this.f(eei.b);
      }

      this.x();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aQ()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               amg $$1 = this.k();
               if ($$1 != null) {
                  eei $$2 = this.f(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dI().a(null, this.dn() + $$3, this.dp(), this.dt() + $$4, $$1, this.cY(), 1.0F, 0.8F + 0.4F * this.af.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aM();
      List<bfj> $$5 = this.dI().a(this, this.cE().c(0.2F, -0.01F, 0.2F), bfm.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dI().B && !(this.cL() instanceof byo);

         for (int $$7 = 0; $$7 < $$5.size(); $$7++) {
            bfj $$8 = $$5.get($$7);
            if (!$$8.u(this)) {
               if ($$6 && this.cN().size() < this.w() && !$$8.bM() && this.a($$8) && $$8 instanceof bfz && !($$8 instanceof bsn) && !($$8 instanceof byo)) {
                  $$8.k(this);
               } else {
                  this.g($$8);
               }
            }
         }
      }
   }

   private void x() {
      if (this.dI().B) {
         int $$0 = this.F();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = apa.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dI().V())) * this.aR;
      } else {
         if (!this.aP) {
            this.b(0);
         }

         int $$1 = this.F();
         if ($$1 > 0) {
            this.b(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.b(0);
               eei $$3 = this.dl();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bz();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof byo) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }
   }

   @Nullable
   protected amg k() {
      switch (this.z()) {
         case a:
         case b:
         case c:
            return amh.bX;
         case d:
            return amh.bW;
         case e:
         default:
            return null;
      }
   }

   private void y() {
      if (this.cU()) {
         this.s = 0;
         this.f(this.dn(), this.dp(), this.dt());
      }

      if (this.s > 0) {
         double $$0 = this.dn() + (this.t - this.dn()) / (double)this.s;
         double $$1 = this.dp() + (this.u - this.dp()) / (double)this.s;
         double $$2 = this.dt() + (this.aD - this.dt()) / (double)this.s;
         double $$3 = apa.d(this.aE - (double)this.dy());
         this.a_(this.dy() + (float)$$3 / (float)this.s);
         this.b_(this.dA() + (float)(this.aF - (double)this.dA()) / (float)this.s);
         this.s--;
         this.e($$0, $$1, $$2);
         this.a(this.dy(), this.dA());
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.am.b(j, $$0);
      this.am.b(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? apa.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   private cah.a z() {
      cah.a $$0 = this.C();
      if ($$0 != null) {
         this.aK = this.cE().e;
         return $$0;
      } else if (this.A()) {
         return cah.a.a;
      } else {
         float $$1 = this.p();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return cah.a.d;
         } else {
            return cah.a.e;
         }
      }
   }

   public float o() {
      eed $$0 = this.cE();
      int $$1 = apa.a($$0.a);
      int $$2 = apa.c($$0.d);
      int $$3 = apa.a($$0.e);
      int $$4 = apa.c($$0.e - this.aO);
      int $$5 = apa.a($$0.c);
      int $$6 = apa.c($$0.f);
      gu.a $$7 = new gu.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               dxe $$12 = this.dI().b_($$7);
               if ($$12.a(anb.a)) {
                  $$9 = Math.max($$9, $$12.a((cls)this.dI(), $$7));
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

   public float p() {
      eed $$0 = this.cE();
      eed $$1 = new eed($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = apa.a($$1.a) - 1;
      int $$3 = apa.c($$1.d) + 1;
      int $$4 = apa.a($$1.b) - 1;
      int $$5 = apa.c($$1.e) + 1;
      int $$6 = apa.a($$1.c) - 1;
      int $$7 = apa.c($$1.f) + 1;
      efb $$8 = eey.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      gu.a $$11 = new gu.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     dcb $$16 = this.dI().a_($$11);
                     if (!($$16.b() instanceof cyo) && eey.c($$16.k(this.dI(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, eem.i)) {
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

   private boolean A() {
      eed $$0 = this.cE();
      int $$1 = apa.a($$0.a);
      int $$2 = apa.c($$0.d);
      int $$3 = apa.a($$0.b);
      int $$4 = apa.c($$0.b + 0.001);
      int $$5 = apa.a($$0.c);
      int $$6 = apa.c($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      gu.a $$8 = new gu.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               dxe $$12 = this.dI().b_($$8);
               if ($$12.a(anb.a)) {
                  float $$13 = (float)$$10 + $$12.a((cls)this.dI(), $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cah.a C() {
      eed $$0 = this.cE();
      double $$1 = $$0.e + 0.001;
      int $$2 = apa.a($$0.a);
      int $$3 = apa.c($$0.d);
      int $$4 = apa.a($$0.e);
      int $$5 = apa.c($$1);
      int $$6 = apa.a($$0.c);
      int $$7 = apa.c($$0.f);
      boolean $$8 = false;
      gu.a $$9 = new gu.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               dxe $$13 = this.dI().b_($$9);
               if ($$13.a(anb.a) && $$1 < (double)((float)$$9.v() + $$13.a((cls)this.dI(), $$9))) {
                  if (!$$13.b()) {
                     return cah.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cah.a.b : null;
   }

   private void D() {
      double $$0 = -0.04F;
      double $$1 = this.aR() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.p = 0.05F;
      if (this.aN == cah.a.e && this.aM != cah.a.e && this.aM != cah.a.d) {
         this.aK = this.e(1.0);
         this.e(this.dn(), (double)(this.o() - this.de()) + 0.101, this.dt());
         this.f(this.dl().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = cah.a.a;
      } else {
         if (this.aM == cah.a.a) {
            $$2 = (this.aK - this.dp()) / (double)this.de();
            this.p = 0.9F;
         } else if (this.aM == cah.a.c) {
            $$1 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aM == cah.a.b) {
            $$2 = 0.01F;
            this.p = 0.45F;
         } else if (this.aM == cah.a.e) {
            this.p = 0.9F;
         } else if (this.aM == cah.a.d) {
            this.p = this.aL;
            if (this.cL() instanceof byo) {
               this.aL /= 2.0F;
            }
         }

         eei $$3 = this.dl();
         this.o($$3.c * (double)this.p, $$3.d + $$1, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$2 > 0.0) {
            eei $$4 = this.dl();
            this.o($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }
   }

   private void E() {
      if (this.bN()) {
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

         this.a_(this.dy() + this.r);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.f(this.dl().b((double)(apa.a(-this.dy() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(apa.b(this.dy() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float q() {
      return 0.0F;
   }

   public boolean a(bfj $$0) {
      return $$0.dd() < this.dd();
   }

   @Override
   protected void a(bfj $$0, bfj.a $$1) {
      if (this.u($$0)) {
         float $$2 = this.q();
         float $$3 = (float)((this.dD() ? 0.01F : this.bx()) + $$0.bw());
         if (this.cN().size() > 1) {
            int $$4 = this.cN().indexOf($$0);
            if ($$4 == 0) {
               $$2 = 0.2F;
            } else {
               $$2 = -0.6F;
            }

            if ($$0 instanceof brl) {
               $$2 += 0.2F;
            }
         }

         eei $$5 = new eei((double)$$2, 0.0, 0.0).b(-this.dy() * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
         $$1.accept($$0, this.dn() + $$5.c, this.dp() + (double)$$3, this.dt() + $$5.e);
         $$0.a_($$0.dy() + this.r);
         $$0.n($$0.cm() + this.r);
         this.b($$0);
         if ($$0 instanceof brl && this.cN().size() == this.w()) {
            int $$6 = $$0.af() % 2 == 0 ? 90 : 270;
            $$0.o(((brl)$$0).aV + (float)$$6);
            $$0.n($$0.cm() + (float)$$6);
         }
      }
   }

   @Override
   public eei b(bfz $$0) {
      eei $$1 = a((double)(this.dd() * apa.g), (double)$$0.dd(), $$0.dy());
      double $$2 = this.dn() + $$1.c;
      double $$3 = this.dt() + $$1.e;
      gu $$4 = gu.a($$2, this.cE().e, $$3);
      gu $$5 = $$4.d();
      if (!this.dI().y($$5)) {
         List<eei> $$6 = Lists.newArrayList();
         double $$7 = this.dI().i($$4);
         if (cak.a($$7)) {
            $$6.add(new eei($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dI().i($$5);
         if (cak.a($$8)) {
            $$6.add(new eei($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fv().iterator();

         while (var14.hasNext()) {
            bgl $$9 = (bgl)var14.next();

            for (eei $$10 : $$6) {
               if (cak.a(this.dI(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void b(bfj $$0) {
      $$0.o(this.dy());
      float $$1 = apa.g($$0.dy() - this.dy());
      float $$2 = apa.a($$1, -105.0F, 105.0F);
      $$0.M += $$2 - $$1;
      $$0.a_($$0.dy() + $$2 - $$1);
      $$0.n($$0.dy());
   }

   @Override
   public void j(bfj $$0) {
      this.b($$0);
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("Type", this.v().c());
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.b("Type", 8)) {
         this.a(cah.b.a($$0.l("Type")));
      }
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      if ($$0.fD()) {
         return bdx.d;
      } else if (this.q < 60.0F) {
         if (!this.dI().B) {
            return $$0.k(this) ? bdx.b : bdx.d;
         } else {
            return bdx.a;
         }
      } else {
         return bdx.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
      this.aO = this.dl().d;
      if (!this.bM()) {
         if ($$1) {
            if (this.aa > 3.0F) {
               if (this.aM != cah.a.d) {
                  this.n();
                  return;
               }

               this.a(this.aa, 1.0F, this.dJ().k());
               if (!this.dI().B && !this.dD()) {
                  this.ah();
                  if (this.dI().X().b(cmi.h)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.v().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cgc.oB);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dI().b_(this.di().d()).a(anb.a) && $$0 < 0.0) {
            this.aa -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.am.b($$0 == 0 ? j : k) && this.cL() != null;
   }

   public void a(float $$0) {
      this.am.b(h, $$0);
   }

   public float r() {
      return this.am.b(h);
   }

   public void d(int $$0) {
      this.am.b(f, $$0);
   }

   public int s() {
      return this.am.b(f);
   }

   private void b(int $$0) {
      this.am.b(l, $$0);
   }

   private int F() {
      return this.am.b(l);
   }

   public float s(float $$0) {
      return apa.i($$0, this.aT, this.aS);
   }

   public void m(int $$0) {
      this.am.b(g, $$0);
   }

   public int t() {
      return this.am.b(g);
   }

   public void a(cah.b $$0) {
      this.am.b(i, $$0.ordinal());
   }

   public cah.b v() {
      return cah.b.a(this.am.b(i));
   }

   @Override
   protected boolean o(bfj $$0) {
      return this.cN().size() < this.w() && !this.a(anb.a);
   }

   protected int w() {
      return 2;
   }

   @Nullable
   @Override
   public bfz cL() {
      return this.cO() instanceof bfz $$0 ? $$0 : null;
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   public boolean aZ() {
      return this.aM == cah.a.b || this.aM == cah.a.c;
   }

   @Override
   public cfz dv() {
      return new cfz(this.j());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements apr {
      a(cpo.n, "oak"),
      b(cpo.o, "spruce"),
      c(cpo.p, "birch"),
      d(cpo.q, "jungle"),
      e(cpo.r, "acacia"),
      f(cpo.s, "cherry"),
      g(cpo.t, "dark_oak"),
      h(cpo.u, "mangrove"),
      i(cpo.v, "bamboo");

      private final String k;
      private final cpn l;
      public static final apr.a<cah.b> j = apr.a(cah.b::values);
      private static final IntFunction<cah.b> m = anu.a(Enum::ordinal, values(), anu.a.a);

      private b(cpn $$0, String $$1) {
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

      public cpn b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static cah.b a(int $$0) {
         return m.apply($$0);
      }

      public static cah.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
