import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byd extends bjg {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final hy bL = new hy(0.0F, 0.0F, 0.0F);
   private static final hy bM = new hy(0.0F, 0.0F, 0.0F);
   private static final hy bN = new hy(-10.0F, 0.0F, -10.0F);
   private static final hy bO = new hy(-15.0F, 0.0F, 10.0F);
   private static final hy bP = new hy(-1.0F, 0.0F, -1.0F);
   private static final hy bQ = new hy(1.0F, 0.0F, 1.0F);
   private static final bir bR = new bir(0.0F, 0.0F, true);
   private static final bir bS = biu.d.n().a(0.5F);
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
   public static final aef<Byte> bC = aei.a(byd.class, aeh.a);
   public static final aef<hy> bD = aei.a(byd.class, aeh.m);
   public static final aef<hy> bE = aei.a(byd.class, aeh.m);
   public static final aef<hy> bF = aei.a(byd.class, aeh.m);
   public static final aef<hy> bG = aei.a(byd.class, aeh.m);
   public static final aef<hy> bH = aei.a(byd.class, aeh.m);
   public static final aef<hy> bI = aei.a(byd.class, aeh.m);
   private static final Predicate<biq> bX = $$0 -> $$0 instanceof cdl && ((cdl)$$0).z() == cdl.a.a;
   private final hp<cjf> bY = hp.a(2, cjf.b);
   private final hp<cjf> bZ = hp.a(4, cjf.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private hy cc = bL;
   private hy cd = bM;
   private hy ce = bN;
   private hy cf = bO;
   private hy cg = bP;
   private hy ch = bQ;

   public byd(biu<? extends byd> $$0, cpv $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public byd(cpv $$0, double $$1, double $$2, double $$3) {
      this(biu.d, $$0);
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
   public Iterable<cjf> bJ() {
      return this.bY;
   }

   @Override
   public Iterable<cjf> bK() {
      return this.bZ;
   }

   @Override
   public cjf c(biv $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cjf.b;
      }
   }

   @Override
   public void a(biv $$0, cjf $$1) {
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
   public boolean f(cjf $$0) {
      biv $$1 = bji.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      re $$1 = new re();

      for (cjf $$2 : this.bZ) {
         qy $$3 = new qy();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      re $$4 = new re();

      for (cjf $$5 : this.bY) {
         qy $$6 = new qy();
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
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         re $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cjf.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         re $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cjf.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.G();
      qy $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(qy $$0) {
      re $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new hy($$1));
      re $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new hy($$2));
      re $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new hy($$3));
      re $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new hy($$4));
      re $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new hy($$5));
      re $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new hy($$6));
   }

   private qy I() {
      qy $$0 = new qy();
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
   protected void D(biq $$0) {
   }

   @Override
   protected void fh() {
      for (biq $$1 : this.dL().a(this, this.cG(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bgy a(cbu $$0, ehn $$1, bgx $$2) {
      cjf $$3 = $$0.b($$2);
      if (this.y() || $$3.a(cji.tR)) {
         return bgy.d;
      } else if ($$0.M_()) {
         return bgy.a;
      } else if ($$0.dL().B) {
         return bgy.b;
      } else {
         biv $$4 = bji.h($$3);
         if ($$3.b()) {
            biv $$5 = this.j($$1);
            biv $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bgy.a;
            }
         } else {
            if (this.e($$4)) {
               return bgy.e;
            }

            if ($$4.a() == biv.a.a && !this.t()) {
               return bgy.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bgy.a;
            }
         }

         return bgy.d;
      }
   }

   private biv j(ehn $$0) {
      biv $$1 = biv.a;
      boolean $$2 = this.s();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      biv $$4 = biv.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = biv.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(biv.e)) {
         $$1 = biv.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(biv.d)) {
         $$1 = biv.d;
      } else if ($$3 >= 1.6 && this.b(biv.f)) {
         $$1 = biv.f;
      } else if (!this.b(biv.a) && this.b(biv.b)) {
         $$1 = biv.b;
      }

      return $$1;
   }

   private boolean e(biv $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == biv.a.a && !this.t();
   }

   private boolean a(cbu $$0, biv $$1, cjf $$2, bgx $$3) {
      cjf $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fS().d && $$4.b() && !$$2.b()) {
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
   public boolean a(bho $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return false;
      } else if ($$0.a(apv.d)) {
         this.aj();
         return false;
      } else if (this.b($$0) || this.ca || this.y()) {
         return false;
      } else if ($$0.a(apv.l)) {
         this.i($$0);
         this.aj();
         return false;
      } else if ($$0.a(apv.u)) {
         if (this.bM()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(apv.v) && this.eu() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cca;
         boolean $$3 = $$2 && ((cca)$$0.c()).B() > 0;
         boolean $$4 = "player".equals($$0.e());
         if (!$$4 && !$$2) {
            return false;
         } else {
            if ($$0.d() instanceof cbu $$5 && !$$5.fS().e) {
               return false;
            }

            if ($$0.g()) {
               this.L();
               this.K();
               this.aj();
               return $$3;
            } else {
               long $$6 = this.dL().V();
               if ($$6 - this.bJ > 5L && !$$2) {
                  this.dL().a(this, (byte)32);
                  this.a(djt.o, $$0.d());
                  this.bJ = $$6;
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
            this.dL().a(this.dq(), this.ds(), this.dw(), ape.an, this.da(), 0.3F, 1.0F, false);
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
      if (this.dL() instanceof akr) {
         ((akr)this.dL())
            .a(
               new ip(ix.c, csw.n.n()),
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

   private void g(bho $$0, float $$1) {
      float $$2 = this.eu();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.aj();
      } else {
         this.c($$2);
         this.a(djt.o, $$0.d());
      }
   }

   private void h(bho $$0) {
      cjf $$1 = new cjf(cji.tL);
      if (this.ac()) {
         $$1.a(this.ad());
      }

      csv.a(this.dL(), this.dl(), $$1);
      this.i($$0);
   }

   private void i(bho $$0) {
      this.L();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         cjf $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            csv.a(this.dL(), this.dl().c(), $$2);
            this.bY.set($$1, cjf.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         cjf $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            csv.a(this.dL(), this.dl().c(), $$4);
            this.bZ.set($$3, cjf.b);
         }
      }
   }

   private void L() {
      this.dL().a(null, this.dq(), this.ds(), this.dw(), ape.al, this.da(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dB();
      return 0.0F;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b * (this.m_() ? 0.5F : 0.9F);
   }

   @Override
   public void h(ehn $$0) {
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
      hy $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      hy $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      hy $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      hy $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      hy $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      hy $$5 = this.an.b(bI);
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
      this.a(biq.c.a);
      this.a(djt.p);
   }

   @Override
   public boolean cL() {
      return this.cd();
   }

   @Override
   public ear q_() {
      return this.y() ? ear.d : super.q_();
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

   public void a(hy $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(hy $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(hy $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(hy $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(hy $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(hy $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public hy z() {
      return this.cc;
   }

   public hy A() {
      return this.cd;
   }

   public hy B() {
      return this.ce;
   }

   public hy C() {
      return this.cf;
   }

   public hy E() {
      return this.cg;
   }

   public hy F() {
      return this.ch;
   }

   @Override
   public boolean br() {
      return super.br() && !this.y();
   }

   @Override
   public boolean u(biq $$0) {
      return $$0 instanceof cbu && !this.dL().a((cbu)$$0, this.dl());
   }

   @Override
   public bja fl() {
      return bja.b;
   }

   @Override
   public bjg.a eF() {
      return new bjg.a(ape.am, ape.am);
   }

   @Nullable
   @Override
   protected apd d(bho $$0) {
      return ape.an;
   }

   @Nullable
   @Override
   protected apd l_() {
      return ape.al;
   }

   @Override
   public void a(akr $$0, bjf $$1) {
   }

   @Override
   public boolean fx() {
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
   public boolean fy() {
      return false;
   }

   @Override
   public bir a(bjs $$0) {
      return this.v(this.y());
   }

   private bir v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.m_() ? bS : this.ag().n();
      }
   }

   @Override
   public ehn k(float $$0) {
      if (this.y()) {
         ehi $$1 = this.v(false).a(this.dj());
         gw $$2 = this.dl();
         int $$3 = Integer.MIN_VALUE;

         for (gw $$4 : gw.a(gw.a($$1.a, $$1.b, $$1.c), gw.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dL().a(cqe.b, $$4), this.dL().a(cqe.a, $$4));
            if ($$5 == 15) {
               return ehn.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ehn.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cjf dy() {
      return new cjf(cji.tL);
   }

   @Override
   public boolean eo() {
      return !this.cd() && !this.y();
   }
}
