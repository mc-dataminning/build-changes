import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cks extends bvi {
   public static final int a = 5;
   private static final boolean bQ = true;
   public static final kj b = new kj(0.0F, 0.0F, 0.0F);
   public static final kj c = new kj(0.0F, 0.0F, 0.0F);
   public static final kj d = new kj(-10.0F, 0.0F, -10.0F);
   public static final kj e = new kj(-15.0F, 0.0F, 10.0F);
   public static final kj f = new kj(-1.0F, 0.0F, -1.0F);
   public static final kj g = new kj(1.0F, 0.0F, 1.0F);
   private static final bup bR = bup.c(0.0F, 0.0F);
   private static final bup bS = but.f.n().a(0.5F).b(0.9875F);
   private static final double bT = 0.1;
   private static final double bU = 0.9;
   private static final double bV = 0.4;
   private static final double bW = 1.6;
   public static final int h = 8;
   public static final int i = 16;
   public static final int j = 1;
   public static final int k = 4;
   public static final int bG = 8;
   public static final int bH = 16;
   public static final ajy<Byte> bI = akc.a(cks.class, aka.a);
   public static final ajy<kj> bJ = akc.a(cks.class, aka.n);
   public static final ajy<kj> bK = akc.a(cks.class, aka.n);
   public static final ajy<kj> bL = akc.a(cks.class, aka.n);
   public static final ajy<kj> bM = akc.a(cks.class, aka.n);
   public static final ajy<kj> bN = akc.a(cks.class, aka.n);
   public static final ajy<kj> bO = akc.a(cks.class, aka.n);
   private static final Predicate<bum> bX = $$0 -> {
      if ($$0 instanceof cqx $$1 && $$1.B()) {
         return true;
      }

      return false;
   };
   private final ka<cwq> bY = ka.a(2, cwq.j);
   private final ka<cwq> bZ = ka.a(4, cwq.j);
   private boolean ca;
   public long bP;
   private int cb;
   private kj cc = b;
   private kj cd = c;
   private kj ce = d;
   private kj cf = e;
   private kj cg = f;
   private kj ch = g;

   public cks(but<? extends cks> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cks(dgj $$0, double $$1, double $$2, double $$3) {
      this(but.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bwp.a m() {
      return ed().a(bwq.B, 0.0);
   }

   @Override
   public void m_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.m_();
      this.a_($$0, $$1, $$2);
   }

   private boolean E() {
      return !this.x() && !this.bc();
   }

   @Override
   public boolean dj() {
      return super.dj() && this.E();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bI, (byte)0);
      $$0.a(bJ, b);
      $$0.a(bK, c);
      $$0.a(bL, d);
      $$0.a(bM, e);
      $$0.a(bN, f);
      $$0.a(bO, g);
   }

   @Override
   public Iterable<cwq> fc() {
      return this.bY;
   }

   @Override
   public Iterable<cwq> fb() {
      return this.bZ;
   }

   @Override
   public cwq a(buu $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cwq.j;
      }
   }

   @Override
   public boolean e(buu $$0) {
      return $$0 != buu.g && !this.g($$0);
   }

   @Override
   public void a(buu $$0, cwq $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bY.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      tw $$1 = new tw();

      for (cwq $$2 : this.bZ) {
         $$1.add($$2.b(this.dX()));
      }

      $$0.a("ArmorItems", $$1);
      tw $$3 = new tw();

      for (cwq $$4 : this.bY) {
         $$3.add($$4.b(this.dX()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cp());
      $$0.a("Small", this.p());
      $$0.a("ShowArms", this.t());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", !this.u());
      if (this.x()) {
         $$0.a("Marker", this.x());
      }

      $$0.a("Pose", this.F());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         tw $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            this.bZ.set($$2, cwq.a(this.dX(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tw $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bY.size(); $$5++) {
            tq $$6 = $$4.a($$5);
            this.bY.set($$5, cwq.a(this.dX(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.v($$0.q("Marker"));
      this.ad = !this.E();
      tq $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(tq $$0) {
      tw $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? b : new kj($$1));
      tw $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? c : new kj($$2));
      tw $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? d : new kj($$3));
      tw $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? e : new kj($$4));
      tw $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? f : new kj($$5));
      tw $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? g : new kj($$6));
   }

   private tq F() {
      tq $$0 = new tq();
      if (!b.equals(this.cc)) {
         $$0.a("Head", this.cc.a());
      }

      if (!c.equals(this.cd)) {
         $$0.a("Body", this.cd.a());
      }

      if (!d.equals(this.ce)) {
         $$0.a("LeftArm", this.ce.a());
      }

      if (!e.equals(this.cf)) {
         $$0.a("RightArm", this.cf.a());
      }

      if (!f.equals(this.cg)) {
         $$0.a("LeftLeg", this.cg.a());
      }

      if (!g.equals(this.ch)) {
         $$0.a("RightLeg", this.ch.a());
      }

      return $$0;
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   protected void D(bum $$0) {
   }

   @Override
   protected void o() {
      for (bum $$1 : this.dV().a(this, this.cR(), bX)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bsl a(coy $$0, fbb $$1, bsk $$2) {
      cwq $$3 = $$0.b($$2);
      if (this.x() || $$3.a(cwu.vL)) {
         return bsl.e;
      } else if ($$0.Z_()) {
         return bsl.a;
      } else if ($$0.dV().C) {
         return bsl.b;
      } else {
         buu $$4 = this.f($$3);
         if ($$3.f()) {
            buu $$5 = this.l($$1);
            buu $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bsl.b;
            }
         } else {
            if (this.g($$4)) {
               return bsl.d;
            }

            if ($$4.a() == buu.a.a && !this.t()) {
               return bsl.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bsl.b;
            }
         }

         return bsl.e;
      }
   }

   private buu l(fbb $$0) {
      buu $$1 = buu.a;
      boolean $$2 = this.p();
      double $$3 = $$0.e / (double)(this.ej() * this.ei());
      buu $$4 = buu.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = buu.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(buu.e)) {
         $$1 = buu.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(buu.d)) {
         $$1 = buu.d;
      } else if ($$3 >= 1.6 && this.d(buu.f)) {
         $$1 = buu.f;
      } else if (!this.d(buu.a) && this.d(buu.b)) {
         $$1 = buu.b;
      }

      return $$1;
   }

   private boolean g(buu $$0) {
      return (this.cb & 1 << $$0.b(0)) != 0 || $$0.a() == buu.a.a && !this.t();
   }

   private boolean a(coy $$0, buu $$1, cwq $$2, bsk $$3) {
      cwq $$4 = this.a($$1);
      if (!$$4.f() && (this.cb & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.cb & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.fV() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.M() <= 1) {
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
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.dQ()) {
         return false;
      } else if (!$$0.O().b(dgf.c) && $$1.d() instanceof bvk) {
         return false;
      } else if ($$1.a(awr.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.ca || this.x()) {
         return false;
      } else if ($$1.a(awr.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(awr.u)) {
         if (this.bY()) {
            this.c($$0, $$1, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$1.a(awr.v) && this.eD() > 0.5F) {
         this.c($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(awr.B);
         boolean $$4 = $$1.a(awr.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof coy $$5 && !$$5.gj().e) {
               return false;
            }

            if ($$1.h()) {
               this.H();
               this.G();
               this.c($$0);
               return true;
            } else {
               long $$6 = $$0.ad();
               if ($$6 - this.bP > 5L && !$$4) {
                  $$0.a(this, (byte)32);
                  this.a(ebu.o, $$1.d());
                  this.bP = $$6;
               } else {
                  this.c($$0, $$1);
                  this.G();
                  this.c($$0);
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dV().C) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awa.aC, this.dm(), 0.3F, 1.0F, false);
            this.bP = this.dV().ad();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cR().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void G() {
      if (this.dV() instanceof ard) {
         ((ard)this.dV())
            .a(
               new ll(lt.b, djp.n.m()),
               this.dA(),
               this.e(0.6666666666666666),
               this.dG(),
               10,
               (double)(this.dq() / 4.0F),
               (double)(this.dr() / 4.0F),
               (double)(this.dq() / 4.0F),
               0.05
            );
      }
   }

   private void c(ard $$0, btc $$1, float $$2) {
      float $$3 = this.eD();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.x($$3);
         this.a(ebu.o, $$1.d());
      }
   }

   private void c(ard $$0, btc $$1) {
      cwq $$2 = new cwq(cwu.vF);
      $$2.b(kv.g, this.an());
      djn.a(this.dV(), this.dv(), $$2);
      this.d($$0, $$1);
   }

   private void d(ard $$0, btc $$1) {
      this.H();
      this.b($$0, $$1);

      for (int $$2 = 0; $$2 < this.bY.size(); $$2++) {
         cwq $$3 = this.bY.get($$2);
         if (!$$3.f()) {
            djn.a(this.dV(), this.dv().d(), $$3);
            this.bY.set($$2, cwq.j);
         }
      }

      for (int $$4 = 0; $$4 < this.bZ.size(); $$4++) {
         cwq $$5 = this.bZ.get($$4);
         if (!$$5.f()) {
            djn.a(this.dV(), this.dv().d(), $$5);
            this.bZ.set($$4, cwq.j);
         }
      }
   }

   private void H() {
      this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.aA, this.dm(), 1.0F, 1.0F);
   }

   @Override
   protected float g(float $$0, float $$1) {
      this.aY = this.N;
      this.aX = this.dL();
      return 0.0F;
   }

   @Override
   public void a_(fbb $$0) {
      if (this.E()) {
         super.a_($$0);
      }
   }

   @Override
   public void r(float $$0) {
      this.aY = this.N = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void q(float $$0) {
      this.aY = this.N = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void h() {
      super.h();
      kj $$0 = this.al.a(bJ);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      kj $$1 = this.al.a(bK);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      kj $$2 = this.al.a(bL);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      kj $$3 = this.al.a(bM);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      kj $$4 = this.al.a(bN);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      kj $$5 = this.al.a(bO);
      if (!this.ch.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void K() {
      this.k(this.ca);
   }

   @Override
   public void k(boolean $$0) {
      this.ca = $$0;
      super.k($$0);
   }

   @Override
   public boolean e_() {
      return this.p();
   }

   @Override
   public void c(ard $$0) {
      this.a(bum.d.a);
      this.a(ebu.p);
   }

   @Override
   public boolean a(dgb $$0) {
      return $$0.h() ? this.cp() : true;
   }

   @Override
   public etf n_() {
      return this.x() ? etf.d : super.n_();
   }

   @Override
   public boolean s_() {
      return this.x();
   }

   private void u(boolean $$0) {
      this.al.a(bI, this.a(this.al.a(bI), 1, $$0));
   }

   public boolean p() {
      return (this.al.a(bI) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.al.a(bI, this.a(this.al.a(bI), 4, $$0));
   }

   public boolean t() {
      return (this.al.a(bI) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.al.a(bI, this.a(this.al.a(bI), 8, $$0));
   }

   @Override
   public boolean u() {
      return (this.al.a(bI) & 8) == 0;
   }

   private void v(boolean $$0) {
      this.al.a(bI, this.a(this.al.a(bI), 16, $$0));
   }

   public boolean x() {
      return (this.al.a(bI) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(kj $$0) {
      this.cc = $$0;
      this.al.a(bJ, $$0);
   }

   public void b(kj $$0) {
      this.cd = $$0;
      this.al.a(bK, $$0);
   }

   public void c(kj $$0) {
      this.ce = $$0;
      this.al.a(bL, $$0);
   }

   public void d(kj $$0) {
      this.cf = $$0;
      this.al.a(bM, $$0);
   }

   public void e(kj $$0) {
      this.cg = $$0;
      this.al.a(bN, $$0);
   }

   public void f(kj $$0) {
      this.ch = $$0;
      this.al.a(bO, $$0);
   }

   public kj y() {
      return this.cc;
   }

   public kj z() {
      return this.cd;
   }

   public kj A() {
      return this.ce;
   }

   public kj B() {
      return this.cf;
   }

   public kj C() {
      return this.cg;
   }

   public kj D() {
      return this.ch;
   }

   @Override
   public boolean bH() {
      return super.bH() && !this.x();
   }

   @Override
   public boolean v(bum $$0) {
      return $$0 instanceof coy && !this.dV().a((coy)$$0, this.dv());
   }

   @Override
   public bvc fy() {
      return bvc.b;
   }

   @Override
   public bvi.a eM() {
      return new bvi.a(awa.aB, awa.aB);
   }

   @Nullable
   @Override
   protected avz e(btc $$0) {
      return awa.aC;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.aA;
   }

   @Override
   public void a(ard $$0, bvh $$1) {
   }

   @Override
   public boolean fL() {
      return false;
   }

   @Override
   public void a(ajy<?> $$0) {
      if (bI.equals($$0)) {
         this.m_();
         this.I = !this.x();
      }

      super.a($$0);
   }

   @Override
   public boolean fM() {
      return false;
   }

   @Override
   public bup e(bvu $$0) {
      return this.w(this.x());
   }

   private bup w(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.e_() ? bS : this.aq().n();
      }
   }

   @Override
   public fbb n(float $$0) {
      if (this.x()) {
         faw $$1 = this.w(false).a(this.dt());
         ji $$2 = this.dv();
         int $$3 = Integer.MIN_VALUE;

         for (ji $$4 : ji.c(ji.a($$1.a, $$1.b, $$1.c), ji.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dV().a(dgs.b, $$4), this.dV().a(dgs.a, $$4));
            if ($$5 == 15) {
               return fbb.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fbb.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.vF);
   }

   @Override
   public boolean ex() {
      return !this.cp() && !this.x();
   }
}
