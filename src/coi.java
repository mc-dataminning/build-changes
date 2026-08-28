import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class coi extends cou implements buc<coi.b> {
   private static final ajp<Integer> i = ajt.a(coi.class, ajr.b);
   private static final ajp<Boolean> j = ajt.a(coi.class, ajr.k);
   private static final ajp<Boolean> k = ajt.a(coi.class, ajr.k);
   private static final ajp<Integer> l = ajt.a(coi.class, ajr.b);
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
   private coi.a aN;
   private coi.a aO;
   private double aP;
   private boolean aQ;
   private boolean aR;
   private float aS;
   private float aT;
   private float aU;

   public coi(bsn<? extends coi> $$0, dcg $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public coi(dcg $$0, double $$1, double $$2, double $$3) {
      this(bsn.k, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(i, coi.b.a.ordinal());
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bsh $$0) {
      return a(this, $$0);
   }

   public static boolean a(bsh $$0, bsh $$1) {
      return ($$1.bH() || $$1.bC()) && !$$0.y($$1);
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public boolean bC() {
      return true;
   }

   @Override
   protected ewh a(jf.a $$0, l.a $$1) {
      return btc.l(super.a($$0, $$1));
   }

   @Override
   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      float $$3 = this.w();
      if (this.cU().size() > 1) {
         int $$4 = this.cU().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof ces) {
            $$3 += 0.2F;
         }
      }

      return new ewh(0.0, this.x() == coi.b.i ? (double)($$1.b() * 0.8888889F) : (double)($$1.b() / 3.0F), (double)$$3)
         .b(-this.dH() * (float) (Math.PI / 180.0));
   }

   @Override
   public void m(boolean $$0) {
      if (!this.dR().B) {
         this.aQ = true;
         this.aR = $$0;
         if (this.H() == 0) {
            this.b(60);
         }
      }

      this.dR().a(lj.am, this.dw() + (double)this.ah.i(), this.dy() + 0.7, this.dC() + (double)this.ah.i(), 0.0, 0.0, 0.0);
      if (this.ah.a(20) == 0) {
         this.dR().a(this.dw(), this.dy(), this.dC(), this.aS(), this.dg(), 1.0F, 0.8F + 0.4F * this.ah.i(), false);
         this.a(dxh.O, this.cS());
      }
   }

   @Override
   public void h(bsh $$0) {
      if ($$0 instanceof coi) {
         if ($$0.cM().b < this.cM().e) {
            super.h($$0);
         }
      } else if ($$0.cM().b <= this.cM().b) {
         super.h($$0);
      }
   }

   @Override
   public cty ag_() {
      return switch (this.x()) {
         case b -> cug.nW;
         case c -> cug.nY;
         case d -> cug.oa;
         case e -> cug.oc;
         case f -> cug.oe;
         case g -> cug.og;
         case h -> cug.oi;
         case i -> cug.ok;
         default -> cug.nU;
      };
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() * 11.0F);
   }

   @Override
   public boolean bB() {
      return !this.dM();
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
      return this.s > 0 ? this.t : this.dw();
   }

   @Override
   public double d_() {
      return this.s > 0 ? this.u : this.dy();
   }

   @Override
   public double L_() {
      return this.s > 0 ? this.v : this.dC();
   }

   @Override
   public float M_() {
      return this.s > 0 ? (float)this.aG : this.dJ();
   }

   @Override
   public float e_() {
      return this.s > 0 ? (float)this.aF : this.dH();
   }

   @Override
   public jf cK() {
      return this.cJ().h();
   }

   @Override
   public void l() {
      this.aO = this.aN;
      this.aN = this.B();
      if (this.aN != coi.a.b && this.aN != coi.a.c) {
         this.q = 0.0F;
      } else {
         this.q++;
      }

      if (!this.dR().B && this.q >= 60.0F) {
         this.bJ();
      }

      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      super.l();
      this.A();
      if (this.dc()) {
         if (!(this.cV() instanceof cml)) {
            this.a(false, false);
         }

         this.E();
         if (this.dR().B) {
            this.F();
            this.dR().a(new ahb(this.c(0), this.c(1)));
         }

         this.a(bth.a, this.du());
      } else {
         this.j(ewh.b);
      }

      this.z();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aY()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               avg $$1 = this.s();
               if ($$1 != null) {
                  ewh $$2 = this.g(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.dR().a(null, this.dw() + $$3, this.dy(), this.dC() + $$4, $$1, this.dg(), 1.0F, 0.8F + 0.4F * this.ah.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      this.aU();
      List<bsh> $$5 = this.dR().a(this, this.cM().c(0.2F, -0.01F, 0.2F), bsm.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dR().B && !(this.cS() instanceof cml);

         for (bsh $$7 : $$5) {
            if (!$$7.x(this)) {
               if ($$6 && this.cU().size() < this.y() && !$$7.bT() && this.b($$7) && $$7 instanceof btc && !($$7 instanceof cfu) && !($$7 instanceof cml)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void z() {
      if (this.dR().B) {
         int $$0 = this.H();
         if ($$0 > 0) {
            this.aS += 0.05F;
         } else {
            this.aS -= 0.1F;
         }

         this.aS = ayg.a(this.aS, 0.0F, 1.0F);
         this.aU = this.aT;
         this.aT = 10.0F * (float)Math.sin((double)(0.5F * (float)this.dR().Z())) * this.aS;
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
               ewh $$3 = this.du();
               if (this.aR) {
                  this.j($$3.b(0.0, -0.7, 0.0));
                  this.bJ();
               } else {
                  this.o($$3.c, this.a($$0 -> $$0 instanceof cml) ? 2.7 : 0.6, $$3.e);
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
      if (this.dc()) {
         this.s = 0;
         this.f(this.dw(), this.dy(), this.dC());
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

   private coi.a B() {
      coi.a $$0 = this.D();
      if ($$0 != null) {
         this.aL = this.cM().e;
         return $$0;
      } else if (this.C()) {
         return coi.a.a;
      } else {
         float $$1 = this.v();
         if ($$1 > 0.0F) {
            this.aM = $$1;
            return coi.a.d;
         } else {
            return coi.a.e;
         }
      }
   }

   public float t() {
      ewc $$0 = this.cM();
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
               eoj $$12 = this.dR().b_($$7);
               if ($$12.a(awc.a)) {
                  $$9 = Math.max($$9, $$12.a((dbm)this.dR(), $$7));
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
      ewc $$0 = this.cM();
      ewc $$1 = new ewc($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ayg.a($$1.a) - 1;
      int $$3 = ayg.c($$1.d) + 1;
      int $$4 = ayg.a($$1.b) - 1;
      int $$5 = ayg.c($$1.e) + 1;
      int $$6 = ayg.a($$1.c) - 1;
      int $$7 = ayg.c($$1.f) + 1;
      exa $$8 = ewx.a($$1);
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
                     dsl $$16 = this.dR().a_($$11);
                     if (!($$16.b() instanceof dol) && ewx.c($$16.k(this.dR(), $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, ewl.i)) {
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
      ewc $$0 = this.cM();
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
               eoj $$12 = this.dR().b_($$8);
               if ($$12.a(awc.a)) {
                  float $$13 = (float)$$10 + $$12.a((dbm)this.dR(), $$8);
                  this.aL = Math.max((double)$$13, this.aL);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private coi.a D() {
      ewc $$0 = this.cM();
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
               eoj $$13 = this.dR().b_($$9);
               if ($$13.a(awc.a) && $$1 < (double)((float)$$9.v() + $$13.a((dbm)this.dR(), $$9))) {
                  if (!$$13.b()) {
                     return coi.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? coi.a.b : null;
   }

   @Override
   protected double ba() {
      return 0.04;
   }

   private void E() {
      double $$0 = -this.bb();
      double $$1 = 0.0;
      this.p = 0.05F;
      if (this.aO == coi.a.e && this.aN != coi.a.e && this.aN != coi.a.d) {
         this.aL = this.e(1.0);
         double $$2 = (double)(this.t() - this.dm()) + 0.101;
         if (this.dR().a(this, this.cM().d(0.0, $$2 - this.dy(), 0.0))) {
            this.a_(this.dw(), $$2, this.dC());
            this.j(this.du().d(1.0, 0.0, 1.0));
            this.aP = 0.0;
         }

         this.aN = coi.a.a;
      } else {
         if (this.aN == coi.a.a) {
            $$1 = (this.aL - this.dy()) / (double)this.dm();
            this.p = 0.9F;
         } else if (this.aN == coi.a.c) {
            $$0 = -7.0E-4;
            this.p = 0.9F;
         } else if (this.aN == coi.a.b) {
            $$1 = 0.01F;
            this.p = 0.45F;
         } else if (this.aN == coi.a.e) {
            this.p = 0.9F;
         } else if (this.aN == coi.a.d) {
            this.p = this.aM;
            if (this.cS() instanceof cml) {
               this.aM /= 2.0F;
            }
         }

         ewh $$3 = this.du();
         this.o($$3.c * (double)this.p, $$3.d + $$0, $$3.e * (double)this.p);
         this.r = this.r * this.p;
         if ($$1 > 0.0) {
            ewh $$4 = this.du();
            this.o($$4.c, ($$4.d + $$1 * (this.ba() / 0.65)) * 0.75, $$4.e);
         }
      }
   }

   private void F() {
      if (this.bU()) {
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

         this.s(this.dH() + this.r);
         if (this.aJ) {
            $$0 += 0.04F;
         }

         if (this.aK) {
            $$0 -= 0.005F;
         }

         this.j(this.du().b((double)(ayg.a(-this.dH() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ayg.b(this.dH() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aI && !this.aH || this.aJ, this.aH && !this.aI || this.aJ);
      }
   }

   protected float w() {
      return 0.0F;
   }

   public boolean b(bsh $$0) {
      return $$0.dl() < this.dl();
   }

   @Override
   protected void a(bsh $$0, bsh.b $$1) {
      super.a($$0, $$1);
      if (!$$0.am().a(awa.s)) {
         $$0.s($$0.dH() + this.r);
         $$0.o($$0.cu() + this.r);
         this.c($$0);
         if ($$0 instanceof ces && this.cU().size() == this.y()) {
            int $$2 = $$0.an() % 2 == 0 ? 90 : 270;
            $$0.p(((ces)$$0).aZ + (float)$$2);
            $$0.o($$0.cu() + (float)$$2);
         }
      }
   }

   @Override
   public ewh b(btc $$0) {
      ewh $$1 = a((double)(this.dl() * ayg.g), (double)$$0.dl(), $$0.dH());
      double $$2 = this.dw() + $$1.c;
      double $$3 = this.dC() + $$1.e;
      ja $$4 = ja.a($$2, this.cM().e, $$3);
      ja $$5 = $$4.d();
      if (!this.dR().z($$5)) {
         List<ewh> $$6 = Lists.newArrayList();
         double $$7 = this.dR().j($$4);
         if (col.a($$7)) {
            $$6.add(new ewh($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dR().j($$5);
         if (col.a($$8)) {
            $$6.add(new ewh($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fG().iterator();

         while (var14.hasNext()) {
            bto $$9 = (bto)var14.next();

            for (ewh $$10 : $$6) {
               if (col.a(this.dR(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bsh $$0) {
      $$0.p(this.dH());
      float $$1 = ayg.g($$0.dH() - this.dH());
      float $$2 = ayg.a($$1, -105.0F, 105.0F);
      $$0.O += $$2 - $$1;
      $$0.s($$0.dH() + $$2 - $$1);
      $$0.o($$0.dH());
   }

   @Override
   public void k(bsh $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("Type", this.x().c());
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.b("Type", 8)) {
         this.a(coi.b.a($$0.l("Type")));
      }
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      if ($$0.fP()) {
         return bqh.e;
      } else if (this.q < 60.0F) {
         if (!this.dR().B) {
            return $$0.n(this) ? bqh.c : bqh.e;
         } else {
            return bqh.a;
         }
      } else {
         return bqh.e;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
      this.aP = this.du().d;
      if (!this.bT()) {
         if ($$1) {
            if (this.ac > 3.0F) {
               if (this.aN != coi.a.d) {
                  this.n();
                  return;
               }

               this.a(this.ac, 1.0F, this.dS().l());
               if (!this.dR().B && !this.dM()) {
                  this.ap();
                  if (this.dR().ab().b(dcc.i)) {
                     for (int $$4 = 0; $$4 < 3; $$4++) {
                        this.a(this.x().b());
                     }

                     for (int $$5 = 0; $$5 < 2; $$5++) {
                        this.a(cug.pq);
                     }
                  }
               }
            }

            this.n();
         } else if (!this.dR().b_(this.dr().d()).a(awc.a) && $$0 < 0.0) {
            this.ac -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.ao.a($$0 == 0 ? j : k) && this.cS() != null;
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

   public void a(coi.b $$0) {
      this.ao.a(i, $$0.ordinal());
   }

   public coi.b x() {
      return coi.b.a(this.ao.a(i));
   }

   @Override
   protected boolean r(bsh $$0) {
      return this.cU().size() < this.y() && !this.a(awc.a);
   }

   protected int y() {
      return 2;
   }

   @Nullable
   @Override
   public btc cS() {
      return this.cV() instanceof btc $$0 ? $$0 : super.cS();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aH = $$0;
      this.aI = $$1;
      this.aJ = $$2;
      this.aK = $$3;
   }

   @Override
   protected wu ct() {
      return wu.c(this.ag_().a());
   }

   @Override
   public boolean bl() {
      return this.aN == coi.a.b || this.aN == coi.a.c;
   }

   @Override
   public cud dE() {
      return new cud(this.ag_());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b implements azc {
      a(dfk.n, "oak"),
      b(dfk.o, "spruce"),
      c(dfk.p, "birch"),
      d(dfk.q, "jungle"),
      e(dfk.r, "acacia"),
      f(dfk.s, "cherry"),
      g(dfk.t, "dark_oak"),
      h(dfk.u, "mangrove"),
      i(dfk.v, "bamboo");

      private final String k;
      private final dfi l;
      public static final azc.a<coi.b> j = azc.a(coi.b::values);
      private static final IntFunction<coi.b> m = aww.a(Enum::ordinal, values(), aww.a.a);

      private b(final dfi $$0, final String $$1) {
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

      public dfi b() {
         return this.l;
      }

      @Override
      public String toString() {
         return this.k;
      }

      public static coi.b a(int $$0) {
         return m.apply($$0);
      }

      public static coi.b a(String $$0) {
         return j.a($$0, a);
      }
   }
}
