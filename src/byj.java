import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byj extends bjm {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final hv bL = new hv(0.0F, 0.0F, 0.0F);
   private static final hv bM = new hv(0.0F, 0.0F, 0.0F);
   private static final hv bN = new hv(-10.0F, 0.0F, -10.0F);
   private static final hv bO = new hv(-15.0F, 0.0F, 10.0F);
   private static final hv bP = new hv(-1.0F, 0.0F, -1.0F);
   private static final hv bQ = new hv(1.0F, 0.0F, 1.0F);
   private static final bix bR = new bix(0.0F, 0.0F, true);
   private static final bix bS = bja.d.n().a(0.5F);
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
   public static final aef<Byte> bC = aei.a(byj.class, aeh.a);
   public static final aef<hv> bD = aei.a(byj.class, aeh.m);
   public static final aef<hv> bE = aei.a(byj.class, aeh.m);
   public static final aef<hv> bF = aei.a(byj.class, aeh.m);
   public static final aef<hv> bG = aei.a(byj.class, aeh.m);
   public static final aef<hv> bH = aei.a(byj.class, aeh.m);
   public static final aef<hv> bI = aei.a(byj.class, aeh.m);
   private static final Predicate<biw> bX = $$0 -> $$0 instanceof cdr && ((cdr)$$0).z() == cdr.a.a;
   private final hn<cjl> bY = hn.a(2, cjl.b);
   private final hn<cjl> bZ = hn.a(4, cjl.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private hv cc = bL;
   private hv cd = bM;
   private hv ce = bN;
   private hv cf = bO;
   private hv cg = bP;
   private hv ch = bQ;

   public byj(bja<? extends byj> $$0, cqb $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public byj(cqb $$0, double $$1, double $$2, double $$3) {
      this(bja.d, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   public void i_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.i_();
      this.e($$0, $$1, $$2);
   }

   private boolean G() {
      return !this.y() && !this.aT();
   }

   @Override
   public boolean cX() {
      return super.cX() && this.G();
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
   public Iterable<cjl> bJ() {
      return this.bY;
   }

   @Override
   public Iterable<cjl> bK() {
      return this.bZ;
   }

   @Override
   public cjl c(bjb $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cjl.b;
      }
   }

   @Override
   public void a(bjb $$0, cjl $$1) {
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
   public boolean f(cjl $$0) {
      bjb $$1 = bjo.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      rc $$1 = new rc();

      for (cjl $$2 : this.bZ) {
         qw $$3 = new qw();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      rc $$4 = new rc();

      for (cjl $$5 : this.bY) {
         qw $$6 = new qw();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.cd());
      $$0.a("Small", this.s());
      $$0.a("ShowArms", this.t());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.w());
      if (this.y()) {
         $$0.a("Marker", this.y());
      }

      $$0.a("Pose", this.I());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         rc $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cjl.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         rc $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cjl.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.G();
      qw $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(qw $$0) {
      rc $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new hv($$1));
      rc $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new hv($$2));
      rc $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new hv($$3));
      rc $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new hv($$4));
      rc $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new hv($$5));
      rc $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new hv($$6));
   }

   private qw I() {
      qw $$0 = new qw();
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
   protected void D(biw $$0) {
   }

   @Override
   protected void fi() {
      for (biw $$1 : this.dL().a(this, this.cG(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bhe a(cca $$0, ehh $$1, bhd $$2) {
      cjl $$3 = $$0.b($$2);
      if (this.y() || $$3.a(cjo.tR)) {
         return bhe.d;
      } else if ($$0.M_()) {
         return bhe.a;
      } else if ($$0.dL().B) {
         return bhe.b;
      } else {
         bjb $$4 = bjo.h($$3);
         if ($$3.b()) {
            bjb $$5 = this.j($$1);
            bjb $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bhe.a;
            }
         } else {
            if (this.e($$4)) {
               return bhe.e;
            }

            if ($$4.a() == bjb.a.a && !this.t()) {
               return bhe.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bhe.a;
            }
         }

         return bhe.d;
      }
   }

   private bjb j(ehh $$0) {
      bjb $$1 = bjb.a;
      boolean $$2 = this.s();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bjb $$4 = bjb.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bjb.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bjb.e)) {
         $$1 = bjb.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bjb.d)) {
         $$1 = bjb.d;
      } else if ($$3 >= 1.6 && this.b(bjb.f)) {
         $$1 = bjb.f;
      } else if (!this.b(bjb.a) && this.b(bjb.b)) {
         $$1 = bjb.b;
      }

      return $$1;
   }

   private boolean e(bjb $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == bjb.a.a && !this.t();
   }

   private boolean a(cca $$0, bjb $$1, cjl $$2, bhd $$3) {
      cjl $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fT().d && $$4.b() && !$$2.b()) {
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
   public boolean a(bhu $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return false;
      } else if ($$0.a(apx.d)) {
         this.aj();
         return false;
      } else if (this.b($$0) || this.ca || this.y()) {
         return false;
      } else if ($$0.a(apx.l)) {
         this.i($$0);
         this.aj();
         return false;
      } else if ($$0.a(apx.u)) {
         if (this.bM()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(apx.v) && this.eu() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(apx.B);
         boolean $$3 = $$0.a(apx.A);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cca $$4 && !$$4.fT().e) {
               return false;
            }

            if ($$0.g()) {
               this.L();
               this.K();
               this.aj();
               return true;
            } else {
               long $$5 = this.dL().V();
               if ($$5 - this.bJ > 5L && !$$3) {
                  this.dL().a(this, (byte)32);
                  this.a(djn.o, $$0.d());
                  this.bJ = $$5;
               } else {
                  this.h($$0);
                  this.K();
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
         if (this.dL().B) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apg.an, this.da(), 0.3F, 1.0F, false);
            this.bJ = this.dL().V();
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

   private void K() {
      if (this.dL() instanceof akt) {
         ((akt)this.dL())
            .a(
               new in(iv.c, cte.n.o()),
               this.dq(),
               this.e(0.6666666666666666),
               this.dw(),
               10,
               (double)(this.df() / 4.0F),
               (double)(this.dg() / 4.0F),
               (double)(this.df() / 4.0F),
               0.05
            );
      }
   }

   private void g(bhu $$0, float $$1) {
      float $$2 = this.eu();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.aj();
      } else {
         this.c($$2);
         this.a(djn.o, $$0.d());
      }
   }

   private void h(bhu $$0) {
      cjl $$1 = new cjl(cjo.tL);
      if (this.ac()) {
         $$1.a(this.ad());
      }

      ctc.a(this.dL(), this.dl(), $$1);
      this.i($$0);
   }

   private void i(bhu $$0) {
      this.L();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         cjl $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            ctc.a(this.dL(), this.dl().c(), $$2);
            this.bY.set($$1, cjl.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         cjl $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            ctc.a(this.dL(), this.dl().c(), $$4);
            this.bZ.set($$3, cjl.b);
         }
      }
   }

   private void L() {
      this.dL().a(null, this.dq(), this.ds(), this.dw(), apg.al, this.da(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dB();
      return 0.0F;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * (this.m_() ? 0.5F : 0.9F);
   }

   @Override
   public void h(ehh $$0) {
      if (this.G()) {
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
      hv $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      hv $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      hv $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      hv $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      hv $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      hv $$5 = this.an.b(bI);
      if (!this.ch.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void H() {
      this.j(this.ca);
   }

   @Override
   public void j(boolean $$0) {
      this.ca = $$0;
      super.j($$0);
   }

   @Override
   public boolean m_() {
      return this.s();
   }

   @Override
   public void aj() {
      this.a(biw.c.a);
      this.a(djn.p);
   }

   @Override
   public boolean cL() {
      return this.cd();
   }

   @Override
   public eal q_() {
      return this.y() ? eal.d : super.q_();
   }

   @Override
   public boolean p_() {
      return this.y();
   }

   private void t(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 1, $$0));
   }

   public boolean s() {
      return (this.an.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 4, $$0));
   }

   public boolean t() {
      return (this.an.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 8, $$0));
   }

   @Override
   public boolean w() {
      return (this.an.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 16, $$0));
   }

   public boolean y() {
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

   public void a(hv $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(hv $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(hv $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(hv $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(hv $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(hv $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public hv z() {
      return this.cc;
   }

   public hv A() {
      return this.cd;
   }

   public hv B() {
      return this.ce;
   }

   public hv C() {
      return this.cf;
   }

   public hv E() {
      return this.cg;
   }

   public hv F() {
      return this.ch;
   }

   @Override
   public boolean br() {
      return super.br() && !this.y();
   }

   @Override
   public boolean u(biw $$0) {
      return $$0 instanceof cca && !this.dL().a((cca)$$0, this.dl());
   }

   @Override
   public bjg fm() {
      return bjg.b;
   }

   @Override
   public bjm.a eF() {
      return new bjm.a(apg.am, apg.am);
   }

   @Nullable
   @Override
   protected apf d(bhu $$0) {
      return apg.an;
   }

   @Nullable
   @Override
   protected apf l_() {
      return apg.al;
   }

   @Override
   public void a(akt $$0, bjl $$1) {
   }

   @Override
   public boolean fy() {
      return false;
   }

   @Override
   public void a(aef<?> $$0) {
      if (bC.equals($$0)) {
         this.i_();
         this.I = !this.y();
      }

      super.a($$0);
   }

   @Override
   public boolean fz() {
      return false;
   }

   @Override
   public bix a(bjy $$0) {
      return this.v(this.y());
   }

   private bix v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.m_() ? bS : this.ag().n();
      }
   }

   @Override
   public ehh k(float $$0) {
      if (this.y()) {
         ehc $$1 = this.v(false).a(this.dj());
         gw $$2 = this.dl();
         int $$3 = Integer.MIN_VALUE;

         for (gw $$4 : gw.a(gw.a($$1.a, $$1.b, $$1.c), gw.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dL().a(cqk.b, $$4), this.dL().a(cqk.a, $$4));
            if ($$5 == 15) {
               return ehh.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ehh.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cjl dy() {
      return new cjl(cjo.tL);
   }

   @Override
   public boolean eo() {
      return !this.cd() && !this.y();
   }
}
