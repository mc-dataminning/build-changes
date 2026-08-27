import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxv extends biy {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final hw bL = new hw(0.0F, 0.0F, 0.0F);
   private static final hw bM = new hw(0.0F, 0.0F, 0.0F);
   private static final hw bN = new hw(-10.0F, 0.0F, -10.0F);
   private static final hw bO = new hw(-15.0F, 0.0F, 10.0F);
   private static final hw bP = new hw(-1.0F, 0.0F, -1.0F);
   private static final hw bQ = new hw(1.0F, 0.0F, 1.0F);
   private static final bij bR = new bij(0.0F, 0.0F, true);
   private static final bij bS = bim.d.n().a(0.5F);
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
   public static final adz<Byte> bC = aec.a(bxv.class, aeb.a);
   public static final adz<hw> bD = aec.a(bxv.class, aeb.m);
   public static final adz<hw> bE = aec.a(bxv.class, aeb.m);
   public static final adz<hw> bF = aec.a(bxv.class, aeb.m);
   public static final adz<hw> bG = aec.a(bxv.class, aeb.m);
   public static final adz<hw> bH = aec.a(bxv.class, aeb.m);
   public static final adz<hw> bI = aec.a(bxv.class, aeb.m);
   private static final Predicate<bii> bX = $$0 -> $$0 instanceof cdd && ((cdd)$$0).t() == cdd.a.a;
   private final hn<cix> bY = hn.a(2, cix.b);
   private final hn<cix> bZ = hn.a(4, cix.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private hw cc = bL;
   private hw cd = bM;
   private hw ce = bN;
   private hw cf = bO;
   private hw cg = bP;
   private hw ch = bQ;

   public bxv(bim<? extends bxv> $$0, cpl $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public bxv(cpl $$0, double $$1, double $$2, double $$3) {
      this(bim.d, $$0);
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
   public Iterable<cix> bJ() {
      return this.bY;
   }

   @Override
   public Iterable<cix> bK() {
      return this.bZ;
   }

   @Override
   public cix c(bin $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cix.b;
      }
   }

   @Override
   public void a(bin $$0, cix $$1) {
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
   public boolean f(cix $$0) {
      bin $$1 = bja.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      qx $$1 = new qx();

      for (cix $$2 : this.bZ) {
         qr $$3 = new qr();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      qx $$4 = new qx();

      for (cix $$5 : this.bY) {
         qr $$6 = new qr();
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
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         qx $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cix.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         qx $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cix.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.D();
      qr $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(qr $$0) {
      qx $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new hw($$1));
      qx $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new hw($$2));
      qx $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new hw($$3));
      qx $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new hw($$4));
      qx $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new hw($$5));
      qx $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new hw($$6));
   }

   private qr E() {
      qr $$0 = new qr();
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
   protected void D(bii $$0) {
   }

   @Override
   protected void fg() {
      for (bii $$1 : this.dK().a(this, this.cG(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bgq a(cbm $$0, ehd $$1, bgp $$2) {
      cix $$3 = $$0.b($$2);
      if (this.t() || $$3.a(cja.tR)) {
         return bgq.d;
      } else if ($$0.G_()) {
         return bgq.a;
      } else if ($$0.dK().B) {
         return bgq.b;
      } else {
         bin $$4 = bja.h($$3);
         if ($$3.b()) {
            bin $$5 = this.j($$1);
            bin $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bgq.a;
            }
         } else {
            if (this.e($$4)) {
               return bgq.e;
            }

            if ($$4.a() == bin.a.a && !this.q()) {
               return bgq.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bgq.a;
            }
         }

         return bgq.d;
      }
   }

   private bin j(ehd $$0) {
      bin $$1 = bin.a;
      boolean $$2 = this.p();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bin $$4 = bin.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bin.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bin.e)) {
         $$1 = bin.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bin.d)) {
         $$1 = bin.d;
      } else if ($$3 >= 1.6 && this.b(bin.f)) {
         $$1 = bin.f;
      } else if (!this.b(bin.a) && this.b(bin.b)) {
         $$1 = bin.b;
      }

      return $$1;
   }

   private boolean e(bin $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == bin.a.a && !this.q();
   }

   private boolean a(cbm $$0, bin $$1, cix $$2, bgp $$3) {
      cix $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
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
   public boolean a(bhg $$0, float $$1) {
      if (this.dK().B || this.dF()) {
         return false;
      } else if ($$0.a(apn.d)) {
         this.aj();
         return false;
      } else if (this.b($$0) || this.ca || this.t()) {
         return false;
      } else if ($$0.a(apn.l)) {
         this.i($$0);
         this.aj();
         return false;
      } else if ($$0.a(apn.u)) {
         if (this.bM()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(apn.v) && this.et() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cbs;
         boolean $$3 = $$2 && ((cbs)$$0.c()).w() > 0;
         boolean $$4 = "player".equals($$0.e());
         if (!$$4 && !$$2) {
            return false;
         } else {
            if ($$0.d() instanceof cbm $$5 && !$$5.fR().e) {
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
                  this.a(djj.o, $$0.d());
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
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.an, this.da(), 0.3F, 1.0F, false);
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
      if (this.dK() instanceof akk) {
         ((akk)this.dK())
            .a(
               new in(iv.c, csm.n.n()),
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

   private void g(bhg $$0, float $$1) {
      float $$2 = this.et();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.aj();
      } else {
         this.c($$2);
         this.a(djj.o, $$0.d());
      }
   }

   private void h(bhg $$0) {
      cix $$1 = new cix(cja.tL);
      if (this.ac()) {
         $$1.a(this.ad());
      }

      csl.a(this.dK(), this.dk(), $$1);
      this.i($$0);
   }

   private void i(bhg $$0) {
      this.H();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         cix $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            csl.a(this.dK(), this.dk().c(), $$2);
            this.bY.set($$1, cix.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         cix $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            csl.a(this.dK(), this.dk().c(), $$4);
            this.bZ.set($$3, cix.b);
         }
      }
   }

   private void H() {
      this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.al, this.da(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dA();
      return 0.0F;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * (this.i_() ? 0.5F : 0.9F);
   }

   @Override
   public void h(ehd $$0) {
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
      hw $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      hw $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      hw $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      hw $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      hw $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      hw $$5 = this.an.b(bI);
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
      this.a(bii.c.a);
      this.a(djj.p);
   }

   @Override
   public boolean cL() {
      return this.cd();
   }

   @Override
   public eah l_() {
      return this.t() ? eah.d : super.l_();
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

   public void a(hw $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(hw $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(hw $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(hw $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(hw $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(hw $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public hw w() {
      return this.cc;
   }

   public hw x() {
      return this.cd;
   }

   public hw y() {
      return this.ce;
   }

   public hw z() {
      return this.cf;
   }

   public hw A() {
      return this.cg;
   }

   public hw B() {
      return this.ch;
   }

   @Override
   public boolean br() {
      return super.br() && !this.t();
   }

   @Override
   public boolean u(bii $$0) {
      return $$0 instanceof cbm && !this.dK().a((cbm)$$0, this.dk());
   }

   @Override
   public bis fk() {
      return bis.b;
   }

   @Override
   public biy.a eE() {
      return new biy.a(aow.am, aow.am);
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.an;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.al;
   }

   @Override
   public void a(akk $$0, bix $$1) {
   }

   @Override
   public boolean fw() {
      return false;
   }

   @Override
   public void a(adz<?> $$0) {
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
   public bij a(bjk $$0) {
      return this.v(this.t());
   }

   private bij v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.i_() ? bS : this.ag().n();
      }
   }

   @Override
   public ehd k(float $$0) {
      if (this.t()) {
         egy $$1 = this.v(false).a(this.di());
         gu $$2 = this.dk();
         int $$3 = Integer.MIN_VALUE;

         for (gu $$4 : gu.a(gu.a($$1.a, $$1.b, $$1.c), gu.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dK().a(cpu.b, $$4), this.dK().a(cpu.a, $$4));
            if ($$5 == 15) {
               return ehd.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ehd.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cix dx() {
      return new cix(cja.tL);
   }

   @Override
   public boolean en() {
      return !this.cd() && !this.t();
   }
}
