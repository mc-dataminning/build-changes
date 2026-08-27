import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceb extends box {
   public static final int b = 5;
   private static final boolean bL = true;
   private static final jc bM = new jc(0.0F, 0.0F, 0.0F);
   private static final jc bN = new jc(0.0F, 0.0F, 0.0F);
   private static final jc bO = new jc(-10.0F, 0.0F, -10.0F);
   private static final jc bP = new jc(-15.0F, 0.0F, 10.0F);
   private static final jc bQ = new jc(-1.0F, 0.0F, -1.0F);
   private static final jc bR = new jc(1.0F, 0.0F, 1.0F);
   private static final boi bS = boi.c(0.0F, 0.0F);
   private static final boi bT = bol.e.n().a(0.5F).b(0.9875F);
   private static final double bU = 0.1;
   private static final double bV = 0.9;
   private static final double bW = 0.4;
   private static final double bX = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int bC = 16;
   public static final aii<Byte> bD = ail.a(ceb.class, aik.a);
   public static final aii<jc> bE = ail.a(ceb.class, aik.m);
   public static final aii<jc> bF = ail.a(ceb.class, aik.m);
   public static final aii<jc> bG = ail.a(ceb.class, aik.m);
   public static final aii<jc> bH = ail.a(ceb.class, aik.m);
   public static final aii<jc> bI = ail.a(ceb.class, aik.m);
   public static final aii<jc> bJ = ail.a(ceb.class, aik.m);
   private static final Predicate<bof> bY = $$0 -> $$0 instanceof cjt && ((cjt)$$0).w() == cjt.a.a;
   private final iu<cpq> bZ = iu.a(2, cpq.h);
   private final iu<cpq> ca = iu.a(4, cpq.h);
   private boolean cb;
   public long bK;
   private int cc;
   private jc cd = bM;
   private jc ce = bN;
   private jc cf = bO;
   private jc cg = bP;
   private jc ch = bQ;
   private jc ci = bR;

   public ceb(bol<? extends ceb> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ceb(cwe $$0, double $$1, double $$2, double $$3) {
      this(bol.e, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bqd.a u() {
      return dO().a(bqe.r, 0.0);
   }

   @Override
   public void k_() {
      double $$0 = this.do();
      double $$1 = this.dq();
      double $$2 = this.du();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   private boolean K() {
      return !this.B() && !this.aV();
   }

   @Override
   public boolean cV() {
      return super.cV() && this.K();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bD, (byte)0);
      this.am.a(bE, bM);
      this.am.a(bF, bN);
      this.am.a(bG, bO);
      this.am.a(bH, bP);
      this.am.a(bI, bQ);
      this.am.a(bJ, bR);
   }

   @Override
   public Iterable<cpq> eU() {
      return this.bZ;
   }

   @Override
   public Iterable<cpq> eT() {
      return this.ca;
   }

   @Override
   public cpq c(bom $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cpq.h;
      }
   }

   @Override
   public void a(bom $$0, cpq $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ca.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(cpq $$0) {
      bom $$1 = boz.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      te $$1 = new te();

      for (cpq $$2 : this.ca) {
         sy $$3 = new sy();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      te $$4 = new te();

      for (cpq $$5 : this.bZ) {
         sy $$6 = new sy();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.cb());
      $$0.a("Small", this.w());
      $$0.a("ShowArms", this.y());
      $$0.a("DisabledSlots", this.cc);
      $$0.a("NoBasePlate", this.A());
      if (this.B()) {
         $$0.a("Marker", this.B());
      }

      $$0.a("Pose", this.M());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         te $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            this.ca.set($$2, cpq.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         te $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bZ.size(); $$4++) {
            this.bZ.set($$4, cpq.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ae = !this.K();
      sy $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(sy $$0) {
      te $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bM : new jc($$1));
      te $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bN : new jc($$2));
      te $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bO : new jc($$3));
      te $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bP : new jc($$4));
      te $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bQ : new jc($$5));
      te $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bR : new jc($$6));
   }

   private sy M() {
      sy $$0 = new sy();
      if (!bM.equals(this.cd)) {
         $$0.a("Head", this.cd.a());
      }

      if (!bN.equals(this.ce)) {
         $$0.a("Body", this.ce.a());
      }

      if (!bO.equals(this.cf)) {
         $$0.a("LeftArm", this.cf.a());
      }

      if (!bP.equals(this.cg)) {
         $$0.a("RightArm", this.cg.a());
      }

      if (!bQ.equals(this.ch)) {
         $$0.a("LeftLeg", this.ch.a());
      }

      if (!bR.equals(this.ci)) {
         $$0.a("RightLeg", this.ci.a());
      }

      return $$0;
   }

   @Override
   public boolean bu() {
      return false;
   }

   @Override
   protected void C(bof $$0) {
   }

   @Override
   protected void M_() {
      for (bof $$1 : this.dJ().a(this, this.cE(), bY)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bml a(cia $$0, eov $$1, bmk $$2) {
      cpq $$3 = $$0.b($$2);
      if (this.B() || $$3.a(cpt.uH)) {
         return bml.d;
      } else if ($$0.P_()) {
         return bml.a;
      } else if ($$0.dJ().B) {
         return bml.b;
      } else {
         bom $$4 = boz.h($$3);
         if ($$3.b()) {
            bom $$5 = this.j($$1);
            bom $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bml.a;
            }
         } else {
            if (this.e($$4)) {
               return bml.e;
            }

            if ($$4.a() == bom.a.a && !this.y()) {
               return bml.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bml.a;
            }
         }

         return bml.d;
      }
   }

   private bom j(eov $$0) {
      bom $$1 = bom.a;
      boolean $$2 = this.w();
      double $$3 = $$0.d / (double)(this.dY() * this.dX());
      bom $$4 = bom.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bom.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bom.e)) {
         $$1 = bom.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bom.d)) {
         $$1 = bom.d;
      } else if ($$3 >= 1.6 && this.b(bom.f)) {
         $$1 = bom.f;
      } else if (!this.b(bom.a) && this.b(bom.b)) {
         $$1 = bom.b;
      }

      return $$1;
   }

   private boolean e(bom $$0) {
      return (this.cc & 1 << $$0.d()) != 0 || $$0.a() == bom.a.a && !this.y();
   }

   private boolean a(cia $$0, bom $$1, cpq $$2, bmk $$3) {
      cpq $$4 = this.c($$1);
      if (!$$4.b() && (this.cc & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cc & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fW().d && $$4.b() && !$$2.b()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.b() || $$2.M() <= 1) {
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
   public boolean a(bne $$0, float $$1) {
      if (this.dJ().B || this.dE()) {
         return false;
      } else if ($$0.a(aug.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.cb || this.B()) {
         return false;
      } else if ($$0.a(aug.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(aug.v)) {
         if (this.bK()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(aug.w) && this.eu() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(aug.C);
         boolean $$3 = $$0.a(aug.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cia $$4 && !$$4.fW().e) {
               return false;
            }

            if ($$0.g()) {
               this.O();
               this.N();
               this.al();
               return true;
            } else {
               long $$5 = this.dJ().X();
               if ($$5 - this.bK > 5L && !$$3) {
                  this.dJ().a(this, (byte)32);
                  this.a(dqr.o, $$0.d());
                  this.bK = $$5;
               } else {
                  this.h($$0);
                  this.N();
                  this.al();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dJ().B) {
            this.dJ().a(this.do(), this.dq(), this.du(), atp.aA, this.cY(), 0.3F, 1.0F, false);
            this.bK = this.dJ().X();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void N() {
      if (this.dJ() instanceof apa) {
         ((apa)this.dJ())
            .a(
               new jt(kb.c, czh.n.o()),
               this.do(),
               this.e(0.6666666666666666),
               this.du(),
               10,
               (double)(this.dd() / 4.0F),
               (double)(this.de() / 4.0F),
               (double)(this.dd() / 4.0F),
               0.05
            );
      }
   }

   private void g(bne $$0, float $$1) {
      float $$2 = this.eu();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.t($$2);
         this.a(dqr.o, $$0.d());
      }
   }

   private void h(bne $$0) {
      cpq $$1 = new cpq(cpt.uB);
      if (this.ae()) {
         $$1.a(this.af());
      }

      czf.a(this.dJ(), this.dj(), $$1);
      this.i($$0);
   }

   private void i(bne $$0) {
      this.O();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bZ.size(); $$1++) {
         cpq $$2 = this.bZ.get($$1);
         if (!$$2.b()) {
            czf.a(this.dJ(), this.dj().c(), $$2);
            this.bZ.set($$1, cpq.h);
         }
      }

      for (int $$3 = 0; $$3 < this.ca.size(); $$3++) {
         cpq $$4 = this.ca.get($$3);
         if (!$$4.b()) {
            czf.a(this.dJ(), this.dj().c(), $$4);
            this.ca.set($$3, cpq.h);
         }
      }
   }

   private void O() {
      this.dJ().a(null, this.do(), this.dq(), this.du(), atp.ay, this.cY(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aW = this.M;
      this.aV = this.dz();
      return 0.0F;
   }

   @Override
   public void a(eov $$0) {
      if (this.K()) {
         super.a($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.aW = this.M = $$0;
      this.aY = this.aX = $$0;
   }

   @Override
   public void n(float $$0) {
      this.aW = this.M = $$0;
      this.aY = this.aX = $$0;
   }

   @Override
   public void l() {
      super.l();
      jc $$0 = this.am.b(bE);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      jc $$1 = this.am.b(bF);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      jc $$2 = this.am.b(bG);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      jc $$3 = this.am.b(bH);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      jc $$4 = this.am.b(bI);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      jc $$5 = this.am.b(bJ);
      if (!this.ci.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void J() {
      this.j(this.cb);
   }

   @Override
   public void j(boolean $$0) {
      this.cb = $$0;
      super.j($$0);
   }

   @Override
   public boolean o_() {
      return this.w();
   }

   @Override
   public void al() {
      this.a(bof.c.a);
      this.b(dqr.p);
   }

   @Override
   public boolean a(cvw $$0) {
      return this.cb();
   }

   @Override
   public ehw s_() {
      return this.B() ? ehw.d : super.s_();
   }

   @Override
   public boolean r_() {
      return this.B();
   }

   private void t(boolean $$0) {
      this.am.b(bD, this.a(this.am.b(bD), 1, $$0));
   }

   public boolean w() {
      return (this.am.b(bD) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.am.b(bD, this.a(this.am.b(bD), 4, $$0));
   }

   public boolean y() {
      return (this.am.b(bD) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.am.b(bD, this.a(this.am.b(bD), 8, $$0));
   }

   public boolean A() {
      return (this.am.b(bD) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.am.b(bD, this.a(this.am.b(bD), 16, $$0));
   }

   public boolean B() {
      return (this.am.b(bD) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(jc $$0) {
      this.cd = $$0;
      this.am.b(bE, $$0);
   }

   public void b(jc $$0) {
      this.ce = $$0;
      this.am.b(bF, $$0);
   }

   public void c(jc $$0) {
      this.cf = $$0;
      this.am.b(bG, $$0);
   }

   public void d(jc $$0) {
      this.cg = $$0;
      this.am.b(bH, $$0);
   }

   public void e(jc $$0) {
      this.ch = $$0;
      this.am.b(bI, $$0);
   }

   public void f(jc $$0) {
      this.ci = $$0;
      this.am.b(bJ, $$0);
   }

   public jc C() {
      return this.cd;
   }

   public jc D() {
      return this.ce;
   }

   public jc E() {
      return this.cf;
   }

   public jc G() {
      return this.cg;
   }

   public jc H() {
      return this.ch;
   }

   public jc I() {
      return this.ci;
   }

   @Override
   public boolean bt() {
      return super.bt() && !this.B();
   }

   @Override
   public boolean t(bof $$0) {
      return $$0 instanceof cia && !this.dJ().a((cia)$$0, this.dj());
   }

   @Override
   public bor fo() {
      return bor.b;
   }

   @Override
   public box.a eF() {
      return new box.a(atp.az, atp.az);
   }

   @Nullable
   @Override
   protected ato d(bne $$0) {
      return atp.aA;
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.ay;
   }

   @Override
   public void a(apa $$0, bow $$1) {
   }

   @Override
   public boolean fA() {
      return false;
   }

   @Override
   public void a(aii<?> $$0) {
      if (bD.equals($$0)) {
         this.k_();
         this.H = !this.B();
      }

      super.a($$0);
   }

   @Override
   public boolean fB() {
      return false;
   }

   @Override
   public boi e(bpi $$0) {
      return this.v(this.B());
   }

   private boi v(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.o_() ? bT : this.ai().n();
      }
   }

   @Override
   public eov k(float $$0) {
      if (this.B()) {
         eoq $$1 = this.v(false).a(this.dh());
         ib $$2 = this.dj();
         int $$3 = Integer.MIN_VALUE;

         for (ib $$4 : ib.a(ib.a($$1.a, $$1.b, $$1.c), ib.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dJ().a(cwn.b, $$4), this.dJ().a(cwn.a, $$4));
            if ($$5 == 15) {
               return eov.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return eov.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cpq dw() {
      return new cpq(cpt.uB);
   }

   @Override
   public boolean eo() {
      return !this.cb() && !this.B();
   }
}
