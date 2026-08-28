import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjo extends buf {
   public static final int b = 5;
   private static final boolean bS = true;
   public static final kf c = new kf(0.0F, 0.0F, 0.0F);
   public static final kf d = new kf(0.0F, 0.0F, 0.0F);
   public static final kf e = new kf(-10.0F, 0.0F, -10.0F);
   public static final kf f = new kf(-15.0F, 0.0F, 10.0F);
   public static final kf g = new kf(-1.0F, 0.0F, -1.0F);
   public static final kf h = new kf(1.0F, 0.0F, 1.0F);
   private static final btm bT = btm.c(0.0F, 0.0F);
   private static final btm bU = btq.d.n().a(0.5F).b(0.9875F);
   private static final double bV = 0.1;
   private static final double bW = 0.9;
   private static final double bX = 0.4;
   private static final double bY = 1.6;
   public static final int bE = 8;
   public static final int bF = 16;
   public static final int bG = 1;
   public static final int bH = 4;
   public static final int bI = 8;
   public static final int bJ = 16;
   public static final akg<Byte> bK = akk.a(cjo.class, aki.a);
   public static final akg<kf> bL = akk.a(cjo.class, aki.n);
   public static final akg<kf> bM = akk.a(cjo.class, aki.n);
   public static final akg<kf> bN = akk.a(cjo.class, aki.n);
   public static final akg<kf> bO = akk.a(cjo.class, aki.n);
   public static final akg<kf> bP = akk.a(cjo.class, aki.n);
   public static final akg<kf> bQ = akk.a(cjo.class, aki.n);
   private static final Predicate<btj> bZ = $$0 -> $$0 instanceof cpm && ((cpm)$$0).x() == cpm.a.a;
   private final jw<cvl> ca = jw.a(2, cvl.k);
   private final jw<cvl> cb = jw.a(4, cvl.k);
   private boolean cc;
   public long bR;
   private int cd;
   private kf ce = c;
   private kf cf = d;
   private kf cg = e;
   private kf ch = f;
   private kf ci = g;
   private kf cj = h;

   public cjo(btq<? extends cjo> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cjo(dds $$0, double $$1, double $$2, double $$3) {
      this(btq.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bvl.a q() {
      return dZ().a(bvm.B, 0.0);
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
      $$0.a(bK, (byte)0);
      $$0.a(bL, c);
      $$0.a(bM, d);
      $$0.a(bN, e);
      $$0.a(bO, f);
      $$0.a(bP, g);
      $$0.a(bQ, h);
   }

   @Override
   public Iterable<cvl> eZ() {
      return this.ca;
   }

   @Override
   public Iterable<cvl> eY() {
      return this.cb;
   }

   @Override
   public cvl a(btr $$0) {
      switch ($$0.a()) {
         case a:
            return this.ca.get($$0.b());
         case b:
            return this.cb.get($$0.b());
         default:
            return cvl.k;
      }
   }

   @Override
   public boolean e(btr $$0) {
      return $$0 != btr.g;
   }

   @Override
   public void a(btr $$0, cvl $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ca.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cb.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean g(cvl $$0) {
      btr $$1 = this.i($$0);
      return this.a($$1).f() && !this.f($$1);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      ul $$1 = new ul();

      for (cvl $$2 : this.cb) {
         $$1.add($$2.b(this.dU()));
      }

      $$0.a("ArmorItems", $$1);
      ul $$3 = new ul();

      for (cvl $$4 : this.ca) {
         $$3.add($$4.b(this.dU()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cm());
      $$0.a("Small", this.t());
      $$0.a("ShowArms", this.w());
      $$0.a("DisabledSlots", this.cd);
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

         for (int $$2 = 0; $$2 < this.cb.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            this.cb.set($$2, cvl.a(this.dU(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ul $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.ca.size(); $$5++) {
            uf $$6 = $$4.a($$5);
            this.ca.set($$5, cvl.a(this.dU(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cd = $$0.h("DisabledSlots");
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
      if (!c.equals(this.ce)) {
         $$0.a("Head", this.ce.a());
      }

      if (!d.equals(this.cf)) {
         $$0.a("Body", this.cf.a());
      }

      if (!e.equals(this.cg)) {
         $$0.a("LeftArm", this.cg.a());
      }

      if (!f.equals(this.ch)) {
         $$0.a("RightArm", this.ch.a());
      }

      if (!g.equals(this.ci)) {
         $$0.a("LeftLeg", this.ci.a());
      }

      if (!h.equals(this.cj)) {
         $$0.a("RightLeg", this.cj.a());
      }

      return $$0;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   protected void F(btj $$0) {
   }

   @Override
   protected void r() {
      for (btj $$1 : this.dS().a(this, this.cO(), bZ)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public brk a(cnp $$0, eye $$1, brj $$2) {
      cvl $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cvo.uN)) {
         return brk.e;
      } else if ($$0.P_()) {
         return brk.a;
      } else if ($$0.dS().B) {
         return brk.b;
      } else {
         btr $$4 = this.i($$3);
         if ($$3.f()) {
            btr $$5 = this.k($$1);
            btr $$6 = this.f($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return brk.b;
            }
         } else {
            if (this.f($$4)) {
               return brk.d;
            }

            if ($$4.a() == btr.a.a && !this.w()) {
               return brk.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return brk.b;
            }
         }

         return brk.e;
      }
   }

   private btr k(eye $$0) {
      btr $$1 = btr.a;
      boolean $$2 = this.t();
      double $$3 = $$0.e / (double)(this.ef() * this.ee());
      btr $$4 = btr.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = btr.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(btr.e)) {
         $$1 = btr.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(btr.d)) {
         $$1 = btr.d;
      } else if ($$3 >= 1.6 && this.d(btr.f)) {
         $$1 = btr.f;
      } else if (!this.d(btr.a) && this.d(btr.b)) {
         $$1 = btr.b;
      }

      return $$1;
   }

   private boolean f(btr $$0) {
      return (this.cd & 1 << $$0.d()) != 0 || $$0.a() == btr.a.a && !this.w();
   }

   private boolean a(cnp $$0, btr $$1, cvl $$2, brj $$3) {
      cvl $$4 = this.a($$1);
      if (!$$4.f() && (this.cd & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.f() && (this.cd & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fP() && $$4.f() && !$$2.f()) {
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
   public boolean a(bsb $$0, float $$1) {
      if (this.dN()) {
         return false;
      } else if (!(this.dS() instanceof arg $$2)) {
         return false;
      } else if (!this.dS().ac().b(ddo.c) && $$0.d() instanceof buh) {
         return false;
      } else if ($$0.a(awu.d)) {
         this.ar();
         return false;
      } else if (this.b($$0) || this.cc || this.A()) {
         return false;
      } else if ($$0.a(awu.l)) {
         this.c($$2, $$0);
         this.ar();
         return false;
      } else if ($$0.a(awu.u)) {
         if (this.bV()) {
            this.a($$2, $$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(awu.v) && this.eA() > 0.5F) {
         this.a($$2, $$0, 4.0F);
         return false;
      } else {
         boolean $$4 = $$0.a(awu.B);
         boolean $$5 = $$0.a(awu.A);
         if (!$$4 && !$$5) {
            return false;
         } else {
            if ($$0.d() instanceof cnp $$6 && !$$6.gd().e) {
               return false;
            }

            if ($$0.h()) {
               this.M();
               this.K();
               this.ar();
               return true;
            } else {
               long $$7 = $$2.aa();
               if ($$7 - this.bR > 5L && !$$5) {
                  $$2.a(this, (byte)32);
                  this.a(dyx.o, $$0.d());
                  this.bR = $$7;
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
            this.dS().a(this.dx(), this.dz(), this.dD(), awd.aC, this.di(), 0.3F, 1.0F, false);
            this.bR = this.dS().aa();
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
      if (this.dS() instanceof arg) {
         ((arg)this.dS())
            .a(
               new lf(ln.b, dgx.n.o()),
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

   private void a(arg $$0, bsb $$1, float $$2) {
      float $$3 = this.eA();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.ar();
      } else {
         this.x($$3);
         this.a(dyx.o, $$1.d());
      }
   }

   private void b(arg $$0, bsb $$1) {
      cvl $$2 = new cvl(cvo.uH);
      $$2.b(kr.g, this.al());
      dgv.a(this.dS(), this.ds(), $$2);
      this.c($$0, $$1);
   }

   private void c(arg $$0, bsb $$1) {
      this.M();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
         cvl $$3 = this.ca.get($$2);
         if (!$$3.f()) {
            dgv.a(this.dS(), this.ds().d(), $$3);
            this.ca.set($$2, cvl.k);
         }
      }

      for (int $$4 = 0; $$4 < this.cb.size(); $$4++) {
         cvl $$5 = this.cb.get($$4);
         if (!$$5.f()) {
            dgv.a(this.dS(), this.ds().d(), $$5);
            this.cb.set($$4, cvl.k);
         }
      }
   }

   private void M() {
      this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.aA, this.di(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.aV = this.O;
      this.aU = this.dI();
      return 0.0F;
   }

   @Override
   public void a_(eye $$0) {
      if (this.I()) {
         super.a_($$0);
      }
   }

   @Override
   public void r(float $$0) {
      this.aV = this.O = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void q(float $$0) {
      this.aV = this.O = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void l() {
      super.l();
      kf $$0 = this.am.a(bL);
      if (!this.ce.equals($$0)) {
         this.a($$0);
      }

      kf $$1 = this.am.a(bM);
      if (!this.cf.equals($$1)) {
         this.b($$1);
      }

      kf $$2 = this.am.a(bN);
      if (!this.cg.equals($$2)) {
         this.c($$2);
      }

      kf $$3 = this.am.a(bO);
      if (!this.ch.equals($$3)) {
         this.d($$3);
      }

      kf $$4 = this.am.a(bP);
      if (!this.ci.equals($$4)) {
         this.e($$4);
      }

      kf $$5 = this.am.a(bQ);
      if (!this.cj.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void L() {
      this.k(this.cc);
   }

   @Override
   public void k(boolean $$0) {
      this.cc = $$0;
      super.k($$0);
   }

   @Override
   public boolean o_() {
      return this.t();
   }

   @Override
   public void ar() {
      this.a(btj.c.a);
      this.a(dyx.p);
   }

   @Override
   public boolean a(ddk $$0) {
      return $$0.g() ? this.cm() : true;
   }

   @Override
   public eqg j_() {
      return this.A() ? eqg.d : super.j_();
   }

   @Override
   public boolean q_() {
      return this.A();
   }

   private void u(boolean $$0) {
      this.am.a(bK, this.a(this.am.a(bK), 1, $$0));
   }

   public boolean t() {
      return (this.am.a(bK) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.am.a(bK, this.a(this.am.a(bK), 4, $$0));
   }

   public boolean w() {
      return (this.am.a(bK) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.am.a(bK, this.a(this.am.a(bK), 8, $$0));
   }

   public boolean y() {
      return (this.am.a(bK) & 8) == 0;
   }

   private void v(boolean $$0) {
      this.am.a(bK, this.a(this.am.a(bK), 16, $$0));
   }

   public boolean A() {
      return (this.am.a(bK) & 16) != 0;
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
      this.ce = $$0;
      this.am.a(bL, $$0);
   }

   public void b(kf $$0) {
      this.cf = $$0;
      this.am.a(bM, $$0);
   }

   public void c(kf $$0) {
      this.cg = $$0;
      this.am.a(bN, $$0);
   }

   public void d(kf $$0) {
      this.ch = $$0;
      this.am.a(bO, $$0);
   }

   public void e(kf $$0) {
      this.ci = $$0;
      this.am.a(bP, $$0);
   }

   public void f(kf $$0) {
      this.cj = $$0;
      this.am.a(bQ, $$0);
   }

   public kf B() {
      return this.ce;
   }

   public kf C() {
      return this.cf;
   }

   public kf D() {
      return this.cg;
   }

   public kf E() {
      return this.ch;
   }

   public kf F() {
      return this.ci;
   }

   public kf G() {
      return this.cj;
   }

   @Override
   public boolean bE() {
      return super.bE() && !this.A();
   }

   @Override
   public boolean v(btj $$0) {
      return $$0 instanceof cnp && !this.dS().a((cnp)$$0, this.ds());
   }

   @Override
   public btz fu() {
      return btz.b;
   }

   @Override
   public buf.a eK() {
      return new buf.a(awd.aB, awd.aB);
   }

   @Nullable
   @Override
   protected awc d(bsb $$0) {
      return awd.aC;
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.aA;
   }

   @Override
   public void a(arg $$0, bue $$1) {
   }

   @Override
   public boolean fG() {
      return false;
   }

   @Override
   public void a(akg<?> $$0) {
      if (bK.equals($$0)) {
         this.i_();
         this.J = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fH() {
      return false;
   }

   @Override
   public btm e(bur $$0) {
      return this.w(this.A());
   }

   private btm w(boolean $$0) {
      if ($$0) {
         return bT;
      } else {
         return this.o_() ? bU : this.ao().n();
      }
   }

   @Override
   public eye n(float $$0) {
      if (this.A()) {
         exz $$1 = this.w(false).a(this.dq());
         je $$2 = this.ds();
         int $$3 = Integer.MIN_VALUE;

         for (je $$4 : je.c(je.a($$1.a, $$1.b, $$1.c), je.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dS().a(deb.b, $$4), this.dS().a(deb.a, $$4));
            if ($$5 == 15) {
               return eye.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return eye.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cvl dF() {
      return new cvl(cvo.uH);
   }

   @Override
   public boolean eu() {
      return !this.cm() && !this.A();
   }
}
