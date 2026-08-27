import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxu extends biw {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final hx bL = new hx(0.0F, 0.0F, 0.0F);
   private static final hx bM = new hx(0.0F, 0.0F, 0.0F);
   private static final hx bN = new hx(-10.0F, 0.0F, -10.0F);
   private static final hx bO = new hx(-15.0F, 0.0F, 10.0F);
   private static final hx bP = new hx(-1.0F, 0.0F, -1.0F);
   private static final hx bQ = new hx(1.0F, 0.0F, 1.0F);
   private static final bih bR = new bih(0.0F, 0.0F, true);
   private static final bih bS = bik.d.n().a(0.5F);
   private static final double bT = 0.1;
   private static final double bU = 0.9;
   private static final double bV = 0.4;
   private static final double bW = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int bA = 8;
   public static final int bB = 16;
   public static final adx<Byte> bC = aea.a(bxu.class, adz.a);
   public static final adx<hx> bD = aea.a(bxu.class, adz.m);
   public static final adx<hx> bE = aea.a(bxu.class, adz.m);
   public static final adx<hx> bF = aea.a(bxu.class, adz.m);
   public static final adx<hx> bG = aea.a(bxu.class, adz.m);
   public static final adx<hx> bH = aea.a(bxu.class, adz.m);
   public static final adx<hx> bI = aea.a(bxu.class, adz.m);
   private static final Predicate<big> bX = $$0 -> $$0 instanceof cdc && ((cdc)$$0).t() == cdc.a.a;
   private final ho<ciw> bY = ho.a(2, ciw.b);
   private final ho<ciw> bZ = ho.a(4, ciw.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private hx cc = bL;
   private hx cd = bM;
   private hx ce = bN;
   private hx cf = bO;
   private hx cg = bP;
   private hx ch = bQ;

   public bxu(bik<? extends bxu> $$0, cpk $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public bxu(cpk $$0, double $$1, double $$2, double $$3) {
      this(bik.d, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   public void e_() {
      double $$0 = this.dp();
      double $$1 = this.dr();
      double $$2 = this.dv();
      super.e_();
      this.e($$0, $$1, $$2);
   }

   private boolean D() {
      return !this.t() && !this.aT();
   }

   @Override
   public boolean cX() {
      return super.cX() && this.D();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bC, (byte)0);
      this.an.a(bD, bL);
      this.an.a(bE, bM);
      this.an.a(bF, bN);
      this.an.a(bG, bO);
      this.an.a(bH, bP);
      this.an.a(bI, bQ);
   }

   @Override
   public Iterable<ciw> bJ() {
      return this.bY;
   }

   @Override
   public Iterable<ciw> bK() {
      return this.bZ;
   }

   @Override
   public ciw c(bil $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return ciw.b;
      }
   }

   @Override
   public void a(bil $$0, ciw $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bY.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(ciw $$0) {
      bil $$1 = biy.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      qy $$1 = new qy();

      for (ciw $$2 : this.bZ) {
         qs $$3 = new qs();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      qy $$4 = new qy();

      for (ciw $$5 : this.bY) {
         qs $$6 = new qs();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.cd());
      $$0.a("Small", this.p());
      $$0.a("ShowArms", this.q());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.r());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", this.E());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         qy $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, ciw.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         qy $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, ciw.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.D();
      qs $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(qs $$0) {
      qy $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new hx($$1));
      qy $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new hx($$2));
      qy $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new hx($$3));
      qy $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new hx($$4));
      qy $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new hx($$5));
      qy $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new hx($$6));
   }

   private qs E() {
      qs $$0 = new qs();
      if (!bL.equals(this.cc)) {
         $$0.a("Head", this.cc.a());
      }

      if (!bM.equals(this.cd)) {
         $$0.a("Body", this.cd.a());
      }

      if (!bN.equals(this.ce)) {
         $$0.a("LeftArm", this.ce.a());
      }

      if (!bO.equals(this.cf)) {
         $$0.a("RightArm", this.cf.a());
      }

      if (!bP.equals(this.cg)) {
         $$0.a("LeftLeg", this.cg.a());
      }

      if (!bQ.equals(this.ch)) {
         $$0.a("RightLeg", this.ch.a());
      }

      return $$0;
   }

   @Override
   public boolean bs() {
      return false;
   }

   @Override
   protected void D(big $$0) {
   }

   @Override
   protected void fg() {
      List<big> $$0 = this.dK().a(this, this.cG(), bX);

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         big $$2 = $$0.get($$1);
         if (this.f($$2) <= 0.2) {
            $$2.g(this);
         }
      }
   }

   @Override
   public bgo a(cbl $$0, ehf $$1, bgn $$2) {
      ciw $$3 = $$0.b($$2);
      if (this.t() || $$3.a(ciz.tR)) {
         return bgo.d;
      } else if ($$0.G_()) {
         return bgo.a;
      } else if ($$0.dK().B) {
         return bgo.b;
      } else {
         bil $$4 = biy.h($$3);
         if ($$3.b()) {
            bil $$5 = this.j($$1);
            bil $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bgo.a;
            }
         } else {
            if (this.e($$4)) {
               return bgo.e;
            }

            if ($$4.a() == bil.a.a && !this.q()) {
               return bgo.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bgo.a;
            }
         }

         return bgo.d;
      }
   }

   private bil j(ehf $$0) {
      bil $$1 = bil.a;
      boolean $$2 = this.p();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bil $$4 = bil.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bil.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bil.e)) {
         $$1 = bil.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bil.d)) {
         $$1 = bil.d;
      } else if ($$3 >= 1.6 && this.b(bil.f)) {
         $$1 = bil.f;
      } else if (!this.b(bil.a) && this.b(bil.b)) {
         $$1 = bil.b;
      }

      return $$1;
   }

   private boolean e(bil $$0) {
      return (this.cb & 1 << $$0.c()) != 0 || $$0.a() == bil.a.a && !this.q();
   }

   private boolean a(cbl $$0, bil $$1, ciw $$2, bgn $$3) {
      ciw $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.c() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.c() + 16) != 0) {
         return false;
      } else if ($$0.fR().d && $$4.b() && !$$2.b()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.b() || $$2.L() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.b()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.dK().B || this.dF()) {
         return false;
      } else if ($$0.a(apl.d)) {
         this.aj();
         return false;
      } else if (this.b($$0) || this.ca || this.t()) {
         return false;
      } else if ($$0.a(apl.l)) {
         this.i($$0);
         this.aj();
         return false;
      } else if ($$0.a(apl.u)) {
         if (this.bM()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(apl.v) && this.et() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cbr;
         boolean $$3 = $$2 && ((cbr)$$0.c()).w() > 0;
         boolean $$4 = "player".equals($$0.e());
         if (!$$4 && !$$2) {
            return false;
         } else {
            if ($$0.d() instanceof cbl $$5 && !$$5.fR().e) {
               return false;
            }

            if ($$0.g()) {
               this.H();
               this.F();
               this.aj();
               return $$3;
            } else {
               long $$6 = this.dK().V();
               if ($$6 - this.bJ > 5L && !$$2) {
                  this.dK().a(this, (byte)32);
                  this.a(dji.o, $$0.d());
                  this.bJ = $$6;
               } else {
                  this.h($$0);
                  this.F();
                  this.aj();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dK().B) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aou.an, this.da(), 0.3F, 1.0F, false);
            this.bJ = this.dK().V();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void F() {
      if (this.dK() instanceof aki) {
         ((aki)this.dK())
            .a(
               new io(iw.c, csl.n.n()),
               this.dp(),
               this.e(0.6666666666666666),
               this.dv(),
               10,
               (double)(this.df() / 4.0F),
               (double)(this.dg() / 4.0F),
               (double)(this.df() / 4.0F),
               0.05
            );
      }
   }

   private void g(bhe $$0, float $$1) {
      float $$2 = this.et();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.aj();
      } else {
         this.c($$2);
         this.a(dji.o, $$0.d());
      }
   }

   private void h(bhe $$0) {
      ciw $$1 = new ciw(ciz.tL);
      if (this.ac()) {
         $$1.a(this.ad());
      }

      csk.a(this.dK(), this.dk(), $$1);
      this.i($$0);
   }

   private void i(bhe $$0) {
      this.H();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         ciw $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            csk.a(this.dK(), this.dk().c(), $$2);
            this.bY.set($$1, ciw.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         ciw $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            csk.a(this.dK(), this.dk().c(), $$4);
            this.bZ.set($$3, ciw.b);
         }
      }
   }

   private void H() {
      this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.al, this.da(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dA();
      return 0.0F;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * (this.i_() ? 0.5F : 0.9F);
   }

   @Override
   public void h(ehf $$0) {
      if (this.D()) {
         super.h($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.aV = this.N = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void n(float $$0) {
      this.aV = this.N = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void l() {
      super.l();
      hx $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      hx $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      hx $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      hx $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      hx $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      hx $$5 = this.an.b(bI);
      if (!this.ch.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void G() {
      this.j(this.ca);
   }

   @Override
   public void j(boolean $$0) {
      this.ca = $$0;
      super.j($$0);
   }

   @Override
   public boolean i_() {
      return this.p();
   }

   @Override
   public void aj() {
      this.a(big.c.a);
      this.a(dji.p);
   }

   @Override
   public boolean cL() {
      return this.cd();
   }

   @Override
   public eag l_() {
      return this.t() ? eag.d : super.l_();
   }

   @Override
   public boolean d_() {
      return this.t();
   }

   private void t(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 1, $$0));
   }

   @Override
   public boolean p() {
      return (this.an.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 4, $$0));
   }

   public boolean q() {
      return (this.an.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 8, $$0));
   }

   public boolean r() {
      return (this.an.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 16, $$0));
   }

   public boolean t() {
      return (this.an.b(bC) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(hx $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(hx $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(hx $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(hx $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(hx $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(hx $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public hx w() {
      return this.cc;
   }

   public hx x() {
      return this.cd;
   }

   public hx y() {
      return this.ce;
   }

   public hx z() {
      return this.cf;
   }

   public hx A() {
      return this.cg;
   }

   public hx B() {
      return this.ch;
   }

   @Override
   public boolean br() {
      return super.br() && !this.t();
   }

   @Override
   public boolean u(big $$0) {
      return $$0 instanceof cbl && !this.dK().a((cbl)$$0, this.dk());
   }

   @Override
   public biq fk() {
      return biq.b;
   }

   @Override
   public biw.a eE() {
      return new biw.a(aou.am, aou.am);
   }

   @Nullable
   @Override
   protected aot d(bhe $$0) {
      return aou.an;
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.al;
   }

   @Override
   public void a(aki $$0, biv $$1) {
   }

   @Override
   public boolean fw() {
      return false;
   }

   @Override
   public void a(adx<?> $$0) {
      if (bC.equals($$0)) {
         this.e_();
         this.I = !this.t();
      }

      super.a($$0);
   }

   @Override
   public boolean fx() {
      return false;
   }

   @Override
   public bih a(bji $$0) {
      return this.v(this.t());
   }

   private bih v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.i_() ? bS : this.ag().n();
      }
   }

   @Override
   public ehf k(float $$0) {
      if (this.t()) {
         eha $$1 = this.v(false).a(this.di());
         gv $$2 = this.dk();
         int $$3 = Integer.MIN_VALUE;

         for (gv $$4 : gv.a(gv.a($$1.a, $$1.b, $$1.c), gv.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dK().a(cpt.b, $$4), this.dK().a(cpt.a, $$4));
            if ($$5 == 15) {
               return ehf.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ehf.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public ciw dx() {
      return new ciw(ciz.tL);
   }

   @Override
   public boolean en() {
      return !this.cd() && !this.t();
   }
}
