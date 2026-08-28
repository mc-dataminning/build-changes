import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckf extends buv {
   public static final int b = 5;
   private static final boolean bR = true;
   public static final kh c = new kh(0.0F, 0.0F, 0.0F);
   public static final kh d = new kh(0.0F, 0.0F, 0.0F);
   public static final kh e = new kh(-10.0F, 0.0F, -10.0F);
   public static final kh f = new kh(-15.0F, 0.0F, 10.0F);
   public static final kh g = new kh(-1.0F, 0.0F, -1.0F);
   public static final kh h = new kh(1.0F, 0.0F, 1.0F);
   private static final buc bS = buc.c(0.0F, 0.0F);
   private static final buc bT = bug.d.n().a(0.5F).b(0.9875F);
   private static final double bU = 0.1;
   private static final double bV = 0.9;
   private static final double bW = 0.4;
   private static final double bX = 1.6;
   public static final int i = 8;
   public static final int bE = 16;
   public static final int bF = 1;
   public static final int bG = 4;
   public static final int bH = 8;
   public static final int bI = 16;
   public static final akk<Byte> bJ = ako.a(ckf.class, akm.a);
   public static final akk<kh> bK = ako.a(ckf.class, akm.n);
   public static final akk<kh> bL = ako.a(ckf.class, akm.n);
   public static final akk<kh> bM = ako.a(ckf.class, akm.n);
   public static final akk<kh> bN = ako.a(ckf.class, akm.n);
   public static final akk<kh> bO = ako.a(ckf.class, akm.n);
   public static final akk<kh> bP = ako.a(ckf.class, akm.n);
   private static final Predicate<btz> bY = $$0 -> $$0 instanceof cqf && ((cqf)$$0).y() == cqf.a.a;
   private final jy<cvx> bZ = jy.a(2, cvx.k);
   private final jy<cvx> ca = jy.a(4, cvx.k);
   private boolean cb;
   public long bQ;
   private int cc;
   private kh cd = c;
   private kh ce = d;
   private kh cf = e;
   private kh cg = f;
   private kh ch = g;
   private kh ci = h;

   public ckf(bug<? extends ckf> $$0, dev $$1) {
      super($$0, $$1);
   }

   public ckf(dev $$0, double $$1, double $$2, double $$3) {
      this(bug.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bwc.a q() {
      return ef().a(bwd.B, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean I() {
      return !this.A() && !this.bd();
   }

   @Override
   public boolean dk() {
      return super.dk() && this.I();
   }

   @Override
   protected void a(ako.a $$0) {
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
   public Iterable<cvx> fe() {
      return this.bZ;
   }

   @Override
   public Iterable<cvx> fd() {
      return this.ca;
   }

   @Override
   public cvx a(buh $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cvx.k;
      }
   }

   @Override
   public boolean e(buh $$0) {
      return $$0 != buh.g && !this.g($$0);
   }

   @Override
   public void a(buh $$0, cvx $$1) {
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
   public void b(uj $$0) {
      super.b($$0);
      up $$1 = new up();

      for (cvx $$2 : this.ca) {
         $$1.add($$2.b(this.dZ()));
      }

      $$0.a("ArmorItems", $$1);
      up $$3 = new up();

      for (cvx $$4 : this.bZ) {
         $$3.add($$4.b(this.dZ()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cq());
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
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         up $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            uj $$3 = $$1.a($$2);
            this.ca.set($$2, cvx.a(this.dZ(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         up $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bZ.size(); $$5++) {
            uj $$6 = $$4.a($$5);
            this.bZ.set($$5, cvx.a(this.dZ(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.v($$0.q("Marker"));
      this.ae = !this.I();
      uj $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(uj $$0) {
      up $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? c : new kh($$1));
      up $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? d : new kh($$2));
      up $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? e : new kh($$3));
      up $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? f : new kh($$4));
      up $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? g : new kh($$5));
      up $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? h : new kh($$6));
   }

   private uj J() {
      uj $$0 = new uj();
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
   public boolean bJ() {
      return false;
   }

   @Override
   protected void F(btz $$0) {
   }

   @Override
   protected void r() {
      for (btz $$1 : this.dX().a(this, this.cS(), bY)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bry a(coh $$0, ezh $$1, brx $$2) {
      cvx $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cwb.uN)) {
         return bry.e;
      } else if ($$0.R_()) {
         return bry.a;
      } else if ($$0.dX().C) {
         return bry.b;
      } else {
         buh $$4 = this.f($$3);
         if ($$3.f()) {
            buh $$5 = this.k($$1);
            buh $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bry.b;
            }
         } else {
            if (this.g($$4)) {
               return bry.d;
            }

            if ($$4.a() == buh.a.a && !this.w()) {
               return bry.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bry.b;
            }
         }

         return bry.e;
      }
   }

   private buh k(ezh $$0) {
      buh $$1 = buh.a;
      boolean $$2 = this.t();
      double $$3 = $$0.e / (double)(this.el() * this.ek());
      buh $$4 = buh.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = buh.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(buh.e)) {
         $$1 = buh.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(buh.d)) {
         $$1 = buh.d;
      } else if ($$3 >= 1.6 && this.d(buh.f)) {
         $$1 = buh.f;
      } else if (!this.d(buh.a) && this.d(buh.b)) {
         $$1 = buh.b;
      }

      return $$1;
   }

   private boolean g(buh $$0) {
      return (this.cc & 1 << $$0.b(0)) != 0 || $$0.a() == buh.a.a && !this.w();
   }

   private boolean a(coh $$0, buh $$1, cvx $$2, brx $$3) {
      cvx $$4 = this.a($$1);
      if (!$$4.f() && (this.cc & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.cc & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.fX() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.L() <= 1) {
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
   public boolean a(bsp $$0, float $$1) {
      if (this.dS()) {
         return false;
      } else if (!(this.dX() instanceof arm $$2)) {
         return false;
      } else if (!this.dX().ac().b(der.c) && $$0.d() instanceof bux) {
         return false;
      } else if ($$0.a(axb.d)) {
         this.at();
         return false;
      } else if (this.b($$0) || this.cb || this.A()) {
         return false;
      } else if ($$0.a(axb.l)) {
         this.c($$2, $$0);
         this.at();
         return false;
      } else if ($$0.a(axb.u)) {
         if (this.bZ()) {
            this.a($$2, $$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(axb.v) && this.eG() > 0.5F) {
         this.a($$2, $$0, 4.0F);
         return false;
      } else {
         boolean $$4 = $$0.a(axb.B);
         boolean $$5 = $$0.a(axb.A);
         if (!$$4 && !$$5) {
            return false;
         } else {
            if ($$0.d() instanceof coh $$6 && !$$6.gl().e) {
               return false;
            }

            if ($$0.h()) {
               this.M();
               this.K();
               this.at();
               return true;
            } else {
               long $$7 = $$2.aa();
               if ($$7 - this.bQ > 5L && !$$5) {
                  $$2.a(this, (byte)32);
                  this.a(eaa.o, $$0.d());
                  this.bQ = $$7;
               } else {
                  this.b($$2, $$0);
                  this.K();
                  this.at();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dX().C) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awk.aC, this.dn(), 0.3F, 1.0F, false);
            this.bQ = this.dX().aa();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cS().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void K() {
      if (this.dX() instanceof arm) {
         ((arm)this.dX())
            .a(
               new li(lq.b, dia.n.m()),
               this.dC(),
               this.e(0.6666666666666666),
               this.dI(),
               10,
               (double)(this.ds() / 4.0F),
               (double)(this.dt() / 4.0F),
               (double)(this.ds() / 4.0F),
               0.05
            );
      }
   }

   private void a(arm $$0, bsp $$1, float $$2) {
      float $$3 = this.eG();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.at();
      } else {
         this.x($$3);
         this.a(eaa.o, $$1.d());
      }
   }

   private void b(arm $$0, bsp $$1) {
      cvx $$2 = new cvx(cwb.uH);
      $$2.b(kt.g, this.an());
      dhy.a(this.dX(), this.dx(), $$2);
      this.c($$0, $$1);
   }

   private void c(arm $$0, bsp $$1) {
      this.M();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
         cvx $$3 = this.bZ.get($$2);
         if (!$$3.f()) {
            dhy.a(this.dX(), this.dx().d(), $$3);
            this.bZ.set($$2, cvx.k);
         }
      }

      for (int $$4 = 0; $$4 < this.ca.size(); $$4++) {
         cvx $$5 = this.ca.get($$4);
         if (!$$5.f()) {
            dhy.a(this.dX(), this.dx().d(), $$5);
            this.ca.set($$4, cvx.k);
         }
      }
   }

   private void M() {
      this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.aA, this.dn(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.aV = this.O;
      this.aU = this.dN();
      return 0.0F;
   }

   @Override
   public void a_(ezh $$0) {
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
      kh $$0 = this.am.a(bK);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      kh $$1 = this.am.a(bL);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      kh $$2 = this.am.a(bM);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      kh $$3 = this.am.a(bN);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      kh $$4 = this.am.a(bO);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      kh $$5 = this.am.a(bP);
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
   public void at() {
      this.a(btz.c.a);
      this.a(eaa.p);
   }

   @Override
   public boolean a(den $$0) {
      return $$0.g() ? this.cq() : true;
   }

   @Override
   public erj k_() {
      return this.A() ? erj.d : super.k_();
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

   public void a(kh $$0) {
      this.cd = $$0;
      this.am.a(bK, $$0);
   }

   public void b(kh $$0) {
      this.ce = $$0;
      this.am.a(bL, $$0);
   }

   public void c(kh $$0) {
      this.cf = $$0;
      this.am.a(bM, $$0);
   }

   public void d(kh $$0) {
      this.cg = $$0;
      this.am.a(bN, $$0);
   }

   public void e(kh $$0) {
      this.ch = $$0;
      this.am.a(bO, $$0);
   }

   public void f(kh $$0) {
      this.ci = $$0;
      this.am.a(bP, $$0);
   }

   public kh B() {
      return this.cd;
   }

   public kh C() {
      return this.ce;
   }

   public kh D() {
      return this.cf;
   }

   public kh E() {
      return this.cg;
   }

   public kh F() {
      return this.ch;
   }

   public kh G() {
      return this.ci;
   }

   @Override
   public boolean bI() {
      return super.bI() && !this.A();
   }

   @Override
   public boolean v(btz $$0) {
      return $$0 instanceof coh && !this.dX().a((coh)$$0, this.dx());
   }

   @Override
   public bup fA() {
      return bup.b;
   }

   @Override
   public buv.a eP() {
      return new buv.a(awk.aB, awk.aB);
   }

   @Nullable
   @Override
   protected awj d(bsp $$0) {
      return awk.aC;
   }

   @Nullable
   @Override
   protected awj o_() {
      return awk.aA;
   }

   @Override
   public void a(arm $$0, buu $$1) {
   }

   @Override
   public boolean fN() {
      return false;
   }

   @Override
   public void a(akk<?> $$0) {
      if (bJ.equals($$0)) {
         this.j_();
         this.J = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fO() {
      return false;
   }

   @Override
   public buc e(bvh $$0) {
      return this.w(this.A());
   }

   private buc w(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.p_() ? bT : this.aq().n();
      }
   }

   @Override
   public ezh n(float $$0) {
      if (this.A()) {
         ezc $$1 = this.w(false).a(this.dv());
         jg $$2 = this.dx();
         int $$3 = Integer.MIN_VALUE;

         for (jg $$4 : jg.c(jg.a($$1.a, $$1.b, $$1.c), jg.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dX().a(dfe.b, $$4), this.dX().a(dfe.a, $$4));
            if ($$5 == 15) {
               return ezh.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return ezh.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cvx dK() {
      return new cvx(cwb.uH);
   }

   @Override
   public boolean eA() {
      return !this.cq() && !this.A();
   }
}
