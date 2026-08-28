import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjw extends bun {
   public static final int b = 5;
   private static final boolean bR = true;
   public static final kg c = new kg(0.0F, 0.0F, 0.0F);
   public static final kg d = new kg(0.0F, 0.0F, 0.0F);
   public static final kg e = new kg(-10.0F, 0.0F, -10.0F);
   public static final kg f = new kg(-15.0F, 0.0F, 10.0F);
   public static final kg g = new kg(-1.0F, 0.0F, -1.0F);
   public static final kg h = new kg(1.0F, 0.0F, 1.0F);
   private static final btu bS = btu.c(0.0F, 0.0F);
   private static final btu bT = bty.d.n().a(0.5F).b(0.9875F);
   private static final double bU = 0.1;
   private static final double bV = 0.9;
   private static final double bW = 0.4;
   private static final double bX = 1.6;
   public static final int bD = 8;
   public static final int bE = 16;
   public static final int bF = 1;
   public static final int bG = 4;
   public static final int bH = 8;
   public static final int bI = 16;
   public static final akh<Byte> bJ = akl.a(cjw.class, akj.a);
   public static final akh<kg> bK = akl.a(cjw.class, akj.n);
   public static final akh<kg> bL = akl.a(cjw.class, akj.n);
   public static final akh<kg> bM = akl.a(cjw.class, akj.n);
   public static final akh<kg> bN = akl.a(cjw.class, akj.n);
   public static final akh<kg> bO = akl.a(cjw.class, akj.n);
   public static final akh<kg> bP = akl.a(cjw.class, akj.n);
   private static final Predicate<btr> bY = $$0 -> $$0 instanceof cpv && ((cpv)$$0).y() == cpv.a.a;
   private final jx<cvs> bZ = jx.a(2, cvs.k);
   private final jx<cvs> ca = jx.a(4, cvs.k);
   private boolean cb;
   public long bQ;
   private int cc;
   private kg cd = c;
   private kg ce = d;
   private kg cf = e;
   private kg cg = f;
   private kg ch = g;
   private kg ci = h;

   public cjw(bty<? extends cjw> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cjw(dej $$0, double $$1, double $$2, double $$3) {
      this(bty.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bvt.a q() {
      return ea().a(bvu.B, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean I() {
      return !this.A() && !this.bb();
   }

   @Override
   public boolean df() {
      return super.df() && this.I();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bJ, (byte)0);
      $$0.a(bK, c);
      $$0.a(bL, d);
      $$0.a(bM, e);
      $$0.a(bN, f);
      $$0.a(bO, g);
      $$0.a(bP, h);
   }

   @Override
   public Iterable<cvs> eZ() {
      return this.bZ;
   }

   @Override
   public Iterable<cvs> eY() {
      return this.ca;
   }

   @Override
   public cvs a(btz $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cvs.k;
      }
   }

   @Override
   public boolean e(btz $$0) {
      return $$0 != btz.g;
   }

   @Override
   public void a(btz $$0, cvs $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ca.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean e(cvs $$0) {
      btz $$1 = this.g($$0);
      return this.a($$1).f() && !this.f($$1);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      um $$1 = new um();

      for (cvs $$2 : this.ca) {
         $$1.add($$2.b(this.dU()));
      }

      $$0.a("ArmorItems", $$1);
      um $$3 = new um();

      for (cvs $$4 : this.bZ) {
         $$3.add($$4.b(this.dU()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cm());
      $$0.a("Small", this.t());
      $$0.a("ShowArms", this.w());
      $$0.a("DisabledSlots", this.cc);
      $$0.a("NoBasePlate", !this.y());
      if (this.A()) {
         $$0.a("Marker", this.A());
      }

      $$0.a("Pose", this.J());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         um $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            ug $$3 = $$1.a($$2);
            this.ca.set($$2, cvs.a(this.dU(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         um $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bZ.size(); $$5++) {
            ug $$6 = $$4.a($$5);
            this.bZ.set($$5, cvs.a(this.dU(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.v($$0.q("Marker"));
      this.ae = !this.I();
      ug $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(ug $$0) {
      um $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? c : new kg($$1));
      um $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? d : new kg($$2));
      um $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? e : new kg($$3));
      um $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? f : new kg($$4));
      um $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? g : new kg($$5));
      um $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? h : new kg($$6));
   }

   private ug J() {
      ug $$0 = new ug();
      if (!c.equals(this.cd)) {
         $$0.a("Head", this.cd.a());
      }

      if (!d.equals(this.ce)) {
         $$0.a("Body", this.ce.a());
      }

      if (!e.equals(this.cf)) {
         $$0.a("LeftArm", this.cf.a());
      }

      if (!f.equals(this.cg)) {
         $$0.a("RightArm", this.cg.a());
      }

      if (!g.equals(this.ch)) {
         $$0.a("LeftLeg", this.ch.a());
      }

      if (!h.equals(this.ci)) {
         $$0.a("RightLeg", this.ci.a());
      }

      return $$0;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   protected void F(btr $$0) {
   }

   @Override
   protected void r() {
      for (btr $$1 : this.dS().a(this, this.cO(), bY)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public brs a(cnx $$0, eyw $$1, brr $$2) {
      cvs $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cvw.uN)) {
         return brs.e;
      } else if ($$0.Q_()) {
         return brs.a;
      } else if ($$0.dS().B) {
         return brs.b;
      } else {
         btz $$4 = this.g($$3);
         if ($$3.f()) {
            btz $$5 = this.k($$1);
            btz $$6 = this.f($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return brs.b;
            }
         } else {
            if (this.f($$4)) {
               return brs.d;
            }

            if ($$4.a() == btz.a.a && !this.w()) {
               return brs.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return brs.b;
            }
         }

         return brs.e;
      }
   }

   private btz k(eyw $$0) {
      btz $$1 = btz.a;
      boolean $$2 = this.t();
      double $$3 = $$0.e / (double)(this.eg() * this.ef());
      btz $$4 = btz.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = btz.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(btz.e)) {
         $$1 = btz.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(btz.d)) {
         $$1 = btz.d;
      } else if ($$3 >= 1.6 && this.d(btz.f)) {
         $$1 = btz.f;
      } else if (!this.d(btz.a) && this.d(btz.b)) {
         $$1 = btz.b;
      }

      return $$1;
   }

   private boolean f(btz $$0) {
      return (this.cc & 1 << $$0.d()) != 0 || $$0.a() == btz.a.a && !this.w();
   }

   private boolean a(cnx $$0, btz $$1, cvs $$2, brr $$3) {
      cvs $$4 = this.a($$1);
      if (!$$4.f() && (this.cc & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.f() && (this.cc & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fR() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.K() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.f()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.dN()) {
         return false;
      } else if (!(this.dS() instanceof arj $$2)) {
         return false;
      } else if (!this.dS().ac().b(def.c) && $$0.d() instanceof bup) {
         return false;
      } else if ($$0.a(awx.d)) {
         this.ar();
         return false;
      } else if (this.b($$0) || this.cb || this.A()) {
         return false;
      } else if ($$0.a(awx.l)) {
         this.c($$2, $$0);
         this.ar();
         return false;
      } else if ($$0.a(awx.u)) {
         if (this.bV()) {
            this.a($$2, $$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(awx.v) && this.eB() > 0.5F) {
         this.a($$2, $$0, 4.0F);
         return false;
      } else {
         boolean $$4 = $$0.a(awx.B);
         boolean $$5 = $$0.a(awx.A);
         if (!$$4 && !$$5) {
            return false;
         } else {
            if ($$0.d() instanceof cnx $$6 && !$$6.ge().e) {
               return false;
            }

            if ($$0.h()) {
               this.M();
               this.K();
               this.ar();
               return true;
            } else {
               long $$7 = $$2.aa();
               if ($$7 - this.bQ > 5L && !$$5) {
                  $$2.a(this, (byte)32);
                  this.a(dzp.o, $$0.d());
                  this.bQ = $$7;
               } else {
                  this.b($$2, $$0);
                  this.K();
                  this.ar();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dS().B) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awg.aC, this.di(), 0.3F, 1.0F, false);
            this.bQ = this.dS().aa();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cO().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void K() {
      if (this.dS() instanceof arj) {
         ((arj)this.dS())
            .a(
               new lg(lo.b, dho.n.n()),
               this.dx(),
               this.e(0.6666666666666666),
               this.dD(),
               10,
               (double)(this.dn() / 4.0F),
               (double)(this.do() / 4.0F),
               (double)(this.dn() / 4.0F),
               0.05
            );
      }
   }

   private void a(arj $$0, bsj $$1, float $$2) {
      float $$3 = this.eB();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.ar();
      } else {
         this.x($$3);
         this.a(dzp.o, $$1.d());
      }
   }

   private void b(arj $$0, bsj $$1) {
      cvs $$2 = new cvs(cvw.uH);
      $$2.b(ks.g, this.al());
      dhm.a(this.dS(), this.ds(), $$2);
      this.c($$0, $$1);
   }

   private void c(arj $$0, bsj $$1) {
      this.M();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
         cvs $$3 = this.bZ.get($$2);
         if (!$$3.f()) {
            dhm.a(this.dS(), this.ds().d(), $$3);
            this.bZ.set($$2, cvs.k);
         }
      }

      for (int $$4 = 0; $$4 < this.ca.size(); $$4++) {
         cvs $$5 = this.ca.get($$4);
         if (!$$5.f()) {
            dhm.a(this.dS(), this.ds().d(), $$5);
            this.ca.set($$4, cvs.k);
         }
      }
   }

   private void M() {
      this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.aA, this.di(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.aU = this.O;
      this.aT = this.dI();
      return 0.0F;
   }

   @Override
   public void a_(eyw $$0) {
      if (this.I()) {
         super.a_($$0);
      }
   }

   @Override
   public void r(float $$0) {
      this.aU = this.O = $$0;
      this.aW = this.aV = $$0;
   }

   @Override
   public void q(float $$0) {
      this.aU = this.O = $$0;
      this.aW = this.aV = $$0;
   }

   @Override
   public void l() {
      super.l();
      kg $$0 = this.am.a(bK);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      kg $$1 = this.am.a(bL);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      kg $$2 = this.am.a(bM);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      kg $$3 = this.am.a(bN);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      kg $$4 = this.am.a(bO);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      kg $$5 = this.am.a(bP);
      if (!this.ci.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void L() {
      this.k(this.cb);
   }

   @Override
   public void k(boolean $$0) {
      this.cb = $$0;
      super.k($$0);
   }

   @Override
   public boolean p_() {
      return this.t();
   }

   @Override
   public void ar() {
      this.a(btr.c.a);
      this.a(dzp.p);
   }

   @Override
   public boolean a(deb $$0) {
      return $$0.g() ? this.cm() : true;
   }

   @Override
   public eqy k_() {
      return this.A() ? eqy.d : super.k_();
   }

   @Override
   public boolean r_() {
      return this.A();
   }

   private void u(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 1, $$0));
   }

   public boolean t() {
      return (this.am.a(bJ) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 4, $$0));
   }

   public boolean w() {
      return (this.am.a(bJ) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 8, $$0));
   }

   public boolean y() {
      return (this.am.a(bJ) & 8) == 0;
   }

   private void v(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 16, $$0));
   }

   public boolean A() {
      return (this.am.a(bJ) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(kg $$0) {
      this.cd = $$0;
      this.am.a(bK, $$0);
   }

   public void b(kg $$0) {
      this.ce = $$0;
      this.am.a(bL, $$0);
   }

   public void c(kg $$0) {
      this.cf = $$0;
      this.am.a(bM, $$0);
   }

   public void d(kg $$0) {
      this.cg = $$0;
      this.am.a(bN, $$0);
   }

   public void e(kg $$0) {
      this.ch = $$0;
      this.am.a(bO, $$0);
   }

   public void f(kg $$0) {
      this.ci = $$0;
      this.am.a(bP, $$0);
   }

   public kg B() {
      return this.cd;
   }

   public kg C() {
      return this.ce;
   }

   public kg D() {
      return this.cf;
   }

   public kg E() {
      return this.cg;
   }

   public kg F() {
      return this.ch;
   }

   public kg G() {
      return this.ci;
   }

   @Override
   public boolean bE() {
      return super.bE() && !this.A();
   }

   @Override
   public boolean v(btr $$0) {
      return $$0 instanceof cnx && !this.dS().a((cnx)$$0, this.ds());
   }

   @Override
   public buh fu() {
      return buh.b;
   }

   @Override
   public bun.a eK() {
      return new bun.a(awg.aB, awg.aB);
   }

   @Nullable
   @Override
   protected awf d(bsj $$0) {
      return awg.aC;
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.aA;
   }

   @Override
   public void a(arj $$0, bum $$1) {
   }

   @Override
   public boolean fH() {
      return false;
   }

   @Override
   public void a(akh<?> $$0) {
      if (bJ.equals($$0)) {
         this.j_();
         this.J = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fI() {
      return false;
   }

   @Override
   public btu e(buz $$0) {
      return this.w(this.A());
   }

   private btu w(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.p_() ? bT : this.ao().n();
      }
   }

   @Override
   public eyw n(float $$0) {
      if (this.A()) {
         eyr $$1 = this.w(false).a(this.dq());
         jf $$2 = this.ds();
         int $$3 = Integer.MIN_VALUE;

         for (jf $$4 : jf.c(jf.a($$1.a, $$1.b, $$1.c), jf.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dS().a(des.b, $$4), this.dS().a(des.a, $$4));
            if ($$5 == 15) {
               return eyw.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return eyw.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cvs dF() {
      return new cvs(cvw.uH);
   }

   @Override
   public boolean ev() {
      return !this.cm() && !this.A();
   }
}
