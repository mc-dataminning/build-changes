import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckk extends bva {
   public static final int b = 5;
   private static final boolean bR = true;
   public static final ki c = new ki(0.0F, 0.0F, 0.0F);
   public static final ki d = new ki(0.0F, 0.0F, 0.0F);
   public static final ki e = new ki(-10.0F, 0.0F, -10.0F);
   public static final ki f = new ki(-15.0F, 0.0F, 10.0F);
   public static final ki g = new ki(-1.0F, 0.0F, -1.0F);
   public static final ki h = new ki(1.0F, 0.0F, 1.0F);
   private static final buh bS = buh.c(0.0F, 0.0F);
   private static final buh bT = bul.d.n().a(0.5F).b(0.9875F);
   private static final double bU = 0.1;
   private static final double bV = 0.9;
   private static final double bW = 0.4;
   private static final double bX = 1.6;
   public static final int i = 8;
   public static final int j = 16;
   public static final int k = 1;
   public static final int l = 4;
   public static final int bH = 8;
   public static final int bI = 16;
   public static final akl<Byte> bJ = akp.a(ckk.class, akn.a);
   public static final akl<ki> bK = akp.a(ckk.class, akn.n);
   public static final akl<ki> bL = akp.a(ckk.class, akn.n);
   public static final akl<ki> bM = akp.a(ckk.class, akn.n);
   public static final akl<ki> bN = akp.a(ckk.class, akn.n);
   public static final akl<ki> bO = akp.a(ckk.class, akn.n);
   public static final akl<ki> bP = akp.a(ckk.class, akn.n);
   private static final Predicate<bue> bY = $$0 -> $$0 instanceof cqk && ((cqk)$$0).y() == cqk.a.a;
   private final jz<cwb> bZ = jz.a(2, cwb.k);
   private final jz<cwb> ca = jz.a(4, cwb.k);
   private boolean cb;
   public long bQ;
   private int cc;
   private ki cd = c;
   private ki ce = d;
   private ki cf = e;
   private ki cg = f;
   private ki ch = g;
   private ki ci = h;

   public ckk(bul<? extends ckk> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public ckk(dfb $$0, double $$1, double $$2, double $$3) {
      this(bul.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bwh.a q() {
      return ef().a(bwi.B, 0.0);
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
   protected void a(akp.a $$0) {
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
   public Iterable<cwb> fe() {
      return this.bZ;
   }

   @Override
   public Iterable<cwb> fd() {
      return this.ca;
   }

   @Override
   public cwb a(bum $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cwb.k;
      }
   }

   @Override
   public boolean e(bum $$0) {
      return $$0 != bum.g && !this.g($$0);
   }

   @Override
   public void a(bum $$0, cwb $$1) {
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
   public void b(uk $$0) {
      super.b($$0);
      uq $$1 = new uq();

      for (cwb $$2 : this.ca) {
         $$1.add($$2.b(this.dZ()));
      }

      $$0.a("ArmorItems", $$1);
      uq $$3 = new uq();

      for (cwb $$4 : this.bZ) {
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
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         uq $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            this.ca.set($$2, cwb.a(this.dZ(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         uq $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bZ.size(); $$5++) {
            uk $$6 = $$4.a($$5);
            this.bZ.set($$5, cwb.a(this.dZ(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.v($$0.q("Marker"));
      this.ae = !this.I();
      uk $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(uk $$0) {
      uq $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? c : new ki($$1));
      uq $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? d : new ki($$2));
      uq $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? e : new ki($$3));
      uq $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? f : new ki($$4));
      uq $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? g : new ki($$5));
      uq $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? h : new ki($$6));
   }

   private uk J() {
      uk $$0 = new uk();
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
   protected void F(bue $$0) {
   }

   @Override
   protected void r() {
      for (bue $$1 : this.dX().a(this, this.cS(), bY)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bsd a(com $$0, ezn $$1, bsc $$2) {
      cwb $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cwf.uN)) {
         return bsd.e;
      } else if ($$0.R_()) {
         return bsd.a;
      } else if ($$0.dX().C) {
         return bsd.b;
      } else {
         bum $$4 = this.f($$3);
         if ($$3.f()) {
            bum $$5 = this.k($$1);
            bum $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bsd.b;
            }
         } else {
            if (this.g($$4)) {
               return bsd.d;
            }

            if ($$4.a() == bum.a.a && !this.w()) {
               return bsd.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bsd.b;
            }
         }

         return bsd.e;
      }
   }

   private bum k(ezn $$0) {
      bum $$1 = bum.a;
      boolean $$2 = this.t();
      double $$3 = $$0.e / (double)(this.el() * this.ek());
      bum $$4 = bum.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bum.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bum.e)) {
         $$1 = bum.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bum.d)) {
         $$1 = bum.d;
      } else if ($$3 >= 1.6 && this.d(bum.f)) {
         $$1 = bum.f;
      } else if (!this.d(bum.a) && this.d(bum.b)) {
         $$1 = bum.b;
      }

      return $$1;
   }

   private boolean g(bum $$0) {
      return (this.cc & 1 << $$0.b(0)) != 0 || $$0.a() == bum.a.a && !this.w();
   }

   private boolean a(com $$0, bum $$1, cwb $$2, bsc $$3) {
      cwb $$4 = this.a($$1);
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
   public boolean a(bsu $$0, float $$1) {
      if (this.dS()) {
         return false;
      } else if (!(this.dX() instanceof arn $$2)) {
         return false;
      } else if (!this.dX().ac().b(dex.c) && $$0.d() instanceof bvc) {
         return false;
      } else if ($$0.a(axc.d)) {
         this.au();
         return false;
      } else if (this.b($$0) || this.cb || this.A()) {
         return false;
      } else if ($$0.a(axc.l)) {
         this.c($$2, $$0);
         this.au();
         return false;
      } else if ($$0.a(axc.u)) {
         if (this.bZ()) {
            this.a($$2, $$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(axc.v) && this.eG() > 0.5F) {
         this.a($$2, $$0, 4.0F);
         return false;
      } else {
         boolean $$4 = $$0.a(axc.B);
         boolean $$5 = $$0.a(axc.A);
         if (!$$4 && !$$5) {
            return false;
         } else {
            if ($$0.d() instanceof com $$6 && !$$6.gl().e) {
               return false;
            }

            if ($$0.h()) {
               this.M();
               this.K();
               this.au();
               return true;
            } else {
               long $$7 = $$2.aa();
               if ($$7 - this.bQ > 5L && !$$5) {
                  $$2.a(this, (byte)32);
                  this.a(eag.o, $$0.d());
                  this.bQ = $$7;
               } else {
                  this.b($$2, $$0);
                  this.K();
                  this.au();
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
            this.dX().a(this.dC(), this.dE(), this.dI(), awl.aC, this.dn(), 0.3F, 1.0F, false);
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
      if (this.dX() instanceof arn) {
         ((arn)this.dX())
            .a(
               new lj(lr.b, dig.n.m()),
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

   private void a(arn $$0, bsu $$1, float $$2) {
      float $$3 = this.eG();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.au();
      } else {
         this.x($$3);
         this.a(eag.o, $$1.d());
      }
   }

   private void b(arn $$0, bsu $$1) {
      cwb $$2 = new cwb(cwf.uH);
      $$2.b(ku.g, this.ao());
      die.a(this.dX(), this.dx(), $$2);
      this.c($$0, $$1);
   }

   private void c(arn $$0, bsu $$1) {
      this.M();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
         cwb $$3 = this.bZ.get($$2);
         if (!$$3.f()) {
            die.a(this.dX(), this.dx().d(), $$3);
            this.bZ.set($$2, cwb.k);
         }
      }

      for (int $$4 = 0; $$4 < this.ca.size(); $$4++) {
         cwb $$5 = this.ca.get($$4);
         if (!$$5.f()) {
            die.a(this.dX(), this.dx().d(), $$5);
            this.ca.set($$4, cwb.k);
         }
      }
   }

   private void M() {
      this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.aA, this.dn(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.aY = this.O;
      this.aX = this.dN();
      return 0.0F;
   }

   @Override
   public void a_(ezn $$0) {
      if (this.I()) {
         super.a_($$0);
      }
   }

   @Override
   public void r(float $$0) {
      this.aY = this.O = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void q(float $$0) {
      this.aY = this.O = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void l() {
      super.l();
      ki $$0 = this.am.a(bK);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      ki $$1 = this.am.a(bL);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      ki $$2 = this.am.a(bM);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      ki $$3 = this.am.a(bN);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      ki $$4 = this.am.a(bO);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      ki $$5 = this.am.a(bP);
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
   public void au() {
      this.a(bue.c.a);
      this.a(eag.p);
   }

   @Override
   public boolean a(det $$0) {
      return $$0.g() ? this.cq() : true;
   }

   @Override
   public erp k_() {
      return this.A() ? erp.d : super.k_();
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

   public void a(ki $$0) {
      this.cd = $$0;
      this.am.a(bK, $$0);
   }

   public void b(ki $$0) {
      this.ce = $$0;
      this.am.a(bL, $$0);
   }

   public void c(ki $$0) {
      this.cf = $$0;
      this.am.a(bM, $$0);
   }

   public void d(ki $$0) {
      this.cg = $$0;
      this.am.a(bN, $$0);
   }

   public void e(ki $$0) {
      this.ch = $$0;
      this.am.a(bO, $$0);
   }

   public void f(ki $$0) {
      this.ci = $$0;
      this.am.a(bP, $$0);
   }

   public ki B() {
      return this.cd;
   }

   public ki C() {
      return this.ce;
   }

   public ki D() {
      return this.cf;
   }

   public ki E() {
      return this.cg;
   }

   public ki F() {
      return this.ch;
   }

   public ki G() {
      return this.ci;
   }

   @Override
   public boolean bI() {
      return super.bI() && !this.A();
   }

   @Override
   public boolean v(bue $$0) {
      return $$0 instanceof com && !this.dX().a((com)$$0, this.dx());
   }

   @Override
   public buu fA() {
      return buu.b;
   }

   @Override
   public bva.a eP() {
      return new bva.a(awl.aB, awl.aB);
   }

   @Nullable
   @Override
   protected awk d(bsu $$0) {
      return awl.aC;
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.aA;
   }

   @Override
   public void a(arn $$0, buz $$1) {
   }

   @Override
   public boolean fN() {
      return false;
   }

   @Override
   public void a(akl<?> $$0) {
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
   public buh e(bvm $$0) {
      return this.w(this.A());
   }

   private buh w(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.p_() ? bT : this.ar().n();
      }
   }

   @Override
   public ezn n(float $$0) {
      if (this.A()) {
         ezi $$1 = this.w(false).a(this.dv());
         jh $$2 = this.dx();
         int $$3 = Integer.MIN_VALUE;

         for (jh $$4 : jh.c(jh.a($$1.a, $$1.b, $$1.c), jh.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dX().a(dfk.b, $$4), this.dX().a(dfk.a, $$4));
            if ($$5 == 15) {
               return ezn.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return ezn.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cwb dK() {
      return new cwb(cwf.uH);
   }

   @Override
   public boolean eA() {
      return !this.cq() && !this.A();
   }
}
