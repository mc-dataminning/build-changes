import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjt extends buk {
   public static final int b = 5;
   private static final boolean bR = true;
   public static final kf c = new kf(0.0F, 0.0F, 0.0F);
   public static final kf d = new kf(0.0F, 0.0F, 0.0F);
   public static final kf e = new kf(-10.0F, 0.0F, -10.0F);
   public static final kf f = new kf(-15.0F, 0.0F, 10.0F);
   public static final kf g = new kf(-1.0F, 0.0F, -1.0F);
   public static final kf h = new kf(1.0F, 0.0F, 1.0F);
   private static final btr bS = btr.c(0.0F, 0.0F);
   private static final btr bT = btv.d.n().a(0.5F).b(0.9875F);
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
   public static final akg<Byte> bJ = akk.a(cjt.class, aki.a);
   public static final akg<kf> bK = akk.a(cjt.class, aki.n);
   public static final akg<kf> bL = akk.a(cjt.class, aki.n);
   public static final akg<kf> bM = akk.a(cjt.class, aki.n);
   public static final akg<kf> bN = akk.a(cjt.class, aki.n);
   public static final akg<kf> bO = akk.a(cjt.class, aki.n);
   public static final akg<kf> bP = akk.a(cjt.class, aki.n);
   private static final Predicate<bto> bY = $$0 -> $$0 instanceof cps && ((cps)$$0).y() == cps.a.a;
   private final jw<cvp> bZ = jw.a(2, cvp.k);
   private final jw<cvp> ca = jw.a(4, cvp.k);
   private boolean cb;
   public long bQ;
   private int cc;
   private kf cd = c;
   private kf ce = d;
   private kf cf = e;
   private kf cg = f;
   private kf ch = g;
   private kf ci = h;

   public cjt(btv<? extends cjt> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cjt(deg $$0, double $$1, double $$2, double $$3) {
      this(btv.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bvq.a q() {
      return dZ().a(bvr.B, 0.0);
   }

   @Override
   public void i_() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.i_();
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
   protected void a(akk.a $$0) {
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
   public Iterable<cvp> eZ() {
      return this.bZ;
   }

   @Override
   public Iterable<cvp> eY() {
      return this.ca;
   }

   @Override
   public cvp a(btw $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cvp.k;
      }
   }

   @Override
   public boolean e(btw $$0) {
      return $$0 != btw.g;
   }

   @Override
   public void a(btw $$0, cvp $$1) {
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
   public boolean e(cvp $$0) {
      btw $$1 = this.g($$0);
      return this.a($$1).f() && !this.f($$1);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      ul $$1 = new ul();

      for (cvp $$2 : this.ca) {
         $$1.add($$2.b(this.dU()));
      }

      $$0.a("ArmorItems", $$1);
      ul $$3 = new ul();

      for (cvp $$4 : this.bZ) {
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
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         ul $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            this.ca.set($$2, cvp.a(this.dU(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ul $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bZ.size(); $$5++) {
            uf $$6 = $$4.a($$5);
            this.bZ.set($$5, cvp.a(this.dU(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.v($$0.q("Marker"));
      this.ae = !this.I();
      uf $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(uf $$0) {
      ul $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? c : new kf($$1));
      ul $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? d : new kf($$2));
      ul $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? e : new kf($$3));
      ul $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? f : new kf($$4));
      ul $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? g : new kf($$5));
      ul $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? h : new kf($$6));
   }

   private uf J() {
      uf $$0 = new uf();
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
   protected void F(bto $$0) {
   }

   @Override
   protected void r() {
      for (bto $$1 : this.dS().a(this, this.cO(), bY)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public brp a(cnu $$0, eys $$1, bro $$2) {
      cvp $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cvt.uN)) {
         return brp.e;
      } else if ($$0.P_()) {
         return brp.a;
      } else if ($$0.dS().B) {
         return brp.b;
      } else {
         btw $$4 = this.g($$3);
         if ($$3.f()) {
            btw $$5 = this.k($$1);
            btw $$6 = this.f($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return brp.b;
            }
         } else {
            if (this.f($$4)) {
               return brp.d;
            }

            if ($$4.a() == btw.a.a && !this.w()) {
               return brp.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return brp.b;
            }
         }

         return brp.e;
      }
   }

   private btw k(eys $$0) {
      btw $$1 = btw.a;
      boolean $$2 = this.t();
      double $$3 = $$0.e / (double)(this.ef() * this.ee());
      btw $$4 = btw.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = btw.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(btw.e)) {
         $$1 = btw.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(btw.d)) {
         $$1 = btw.d;
      } else if ($$3 >= 1.6 && this.d(btw.f)) {
         $$1 = btw.f;
      } else if (!this.d(btw.a) && this.d(btw.b)) {
         $$1 = btw.b;
      }

      return $$1;
   }

   private boolean f(btw $$0) {
      return (this.cc & 1 << $$0.d()) != 0 || $$0.a() == btw.a.a && !this.w();
   }

   private boolean a(cnu $$0, btw $$1, cvp $$2, bro $$3) {
      cvp $$4 = this.a($$1);
      if (!$$4.f() && (this.cc & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.f() && (this.cc & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fQ() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.J() <= 1) {
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
   public boolean a(bsg $$0, float $$1) {
      if (this.dN()) {
         return false;
      } else if (!(this.dS() instanceof arh $$2)) {
         return false;
      } else if (!this.dS().ac().b(dec.c) && $$0.d() instanceof bum) {
         return false;
      } else if ($$0.a(awv.d)) {
         this.ar();
         return false;
      } else if (this.b($$0) || this.cb || this.A()) {
         return false;
      } else if ($$0.a(awv.l)) {
         this.c($$2, $$0);
         this.ar();
         return false;
      } else if ($$0.a(awv.u)) {
         if (this.bV()) {
            this.a($$2, $$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(awv.v) && this.eA() > 0.5F) {
         this.a($$2, $$0, 4.0F);
         return false;
      } else {
         boolean $$4 = $$0.a(awv.B);
         boolean $$5 = $$0.a(awv.A);
         if (!$$4 && !$$5) {
            return false;
         } else {
            if ($$0.d() instanceof cnu $$6 && !$$6.gd().e) {
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
                  this.a(dzl.o, $$0.d());
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
            this.dS().a(this.dx(), this.dz(), this.dD(), awe.aC, this.di(), 0.3F, 1.0F, false);
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
      if (this.dS() instanceof arh) {
         ((arh)this.dS())
            .a(
               new lf(ln.b, dhl.n.o()),
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

   private void a(arh $$0, bsg $$1, float $$2) {
      float $$3 = this.eA();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.ar();
      } else {
         this.x($$3);
         this.a(dzl.o, $$1.d());
      }
   }

   private void b(arh $$0, bsg $$1) {
      cvp $$2 = new cvp(cvt.uH);
      $$2.b(kr.g, this.al());
      dhj.a(this.dS(), this.ds(), $$2);
      this.c($$0, $$1);
   }

   private void c(arh $$0, bsg $$1) {
      this.M();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
         cvp $$3 = this.bZ.get($$2);
         if (!$$3.f()) {
            dhj.a(this.dS(), this.ds().d(), $$3);
            this.bZ.set($$2, cvp.k);
         }
      }

      for (int $$4 = 0; $$4 < this.ca.size(); $$4++) {
         cvp $$5 = this.ca.get($$4);
         if (!$$5.f()) {
            dhj.a(this.dS(), this.ds().d(), $$5);
            this.ca.set($$4, cvp.k);
         }
      }
   }

   private void M() {
      this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.aA, this.di(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.aU = this.O;
      this.aT = this.dI();
      return 0.0F;
   }

   @Override
   public void a_(eys $$0) {
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
      kf $$0 = this.am.a(bK);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      kf $$1 = this.am.a(bL);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      kf $$2 = this.am.a(bM);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      kf $$3 = this.am.a(bN);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      kf $$4 = this.am.a(bO);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      kf $$5 = this.am.a(bP);
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
   public boolean o_() {
      return this.t();
   }

   @Override
   public void ar() {
      this.a(bto.c.a);
      this.a(dzl.p);
   }

   @Override
   public boolean a(ddy $$0) {
      return $$0.g() ? this.cm() : true;
   }

   @Override
   public equ j_() {
      return this.A() ? equ.d : super.j_();
   }

   @Override
   public boolean q_() {
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

   public void a(kf $$0) {
      this.cd = $$0;
      this.am.a(bK, $$0);
   }

   public void b(kf $$0) {
      this.ce = $$0;
      this.am.a(bL, $$0);
   }

   public void c(kf $$0) {
      this.cf = $$0;
      this.am.a(bM, $$0);
   }

   public void d(kf $$0) {
      this.cg = $$0;
      this.am.a(bN, $$0);
   }

   public void e(kf $$0) {
      this.ch = $$0;
      this.am.a(bO, $$0);
   }

   public void f(kf $$0) {
      this.ci = $$0;
      this.am.a(bP, $$0);
   }

   public kf B() {
      return this.cd;
   }

   public kf C() {
      return this.ce;
   }

   public kf D() {
      return this.cf;
   }

   public kf E() {
      return this.cg;
   }

   public kf F() {
      return this.ch;
   }

   public kf G() {
      return this.ci;
   }

   @Override
   public boolean bE() {
      return super.bE() && !this.A();
   }

   @Override
   public boolean v(bto $$0) {
      return $$0 instanceof cnu && !this.dS().a((cnu)$$0, this.ds());
   }

   @Override
   public bue fu() {
      return bue.b;
   }

   @Override
   public buk.a eK() {
      return new buk.a(awe.aB, awe.aB);
   }

   @Nullable
   @Override
   protected awd d(bsg $$0) {
      return awe.aC;
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.aA;
   }

   @Override
   public void a(arh $$0, buj $$1) {
   }

   @Override
   public boolean fH() {
      return false;
   }

   @Override
   public void a(akg<?> $$0) {
      if (bJ.equals($$0)) {
         this.i_();
         this.J = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fI() {
      return false;
   }

   @Override
   public btr e(buw $$0) {
      return this.w(this.A());
   }

   private btr w(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.o_() ? bT : this.ao().n();
      }
   }

   @Override
   public eys n(float $$0) {
      if (this.A()) {
         eyn $$1 = this.w(false).a(this.dq());
         je $$2 = this.ds();
         int $$3 = Integer.MIN_VALUE;

         for (je $$4 : je.c(je.a($$1.a, $$1.b, $$1.c), je.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dS().a(dep.b, $$4), this.dS().a(dep.a, $$4));
            if ($$5 == 15) {
               return eys.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return eys.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cvp dF() {
      return new cvp(cvt.uH);
   }

   @Override
   public boolean eu() {
      return !this.cm() && !this.A();
   }
}
