import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbr extends bmo {
   public static final int b = 5;
   private static final boolean bL = true;
   private static final iy bM = new iy(0.0F, 0.0F, 0.0F);
   private static final iy bN = new iy(0.0F, 0.0F, 0.0F);
   private static final iy bO = new iy(-10.0F, 0.0F, -10.0F);
   private static final iy bP = new iy(-15.0F, 0.0F, 10.0F);
   private static final iy bQ = new iy(-1.0F, 0.0F, -1.0F);
   private static final iy bR = new iy(1.0F, 0.0F, 1.0F);
   private static final blz bS = blz.c(0.0F, 0.0F);
   private static final blz bT = bmc.e.n().a(0.5F).b(0.9875F);
   private static final double bU = 0.1;
   private static final double bV = 0.9;
   private static final double bW = 0.4;
   private static final double bX = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int bB = 8;
   public static final int bC = 16;
   public static final agn<Byte> bD = agq.a(cbr.class, agp.a);
   public static final agn<iy> bE = agq.a(cbr.class, agp.m);
   public static final agn<iy> bF = agq.a(cbr.class, agp.m);
   public static final agn<iy> bG = agq.a(cbr.class, agp.m);
   public static final agn<iy> bH = agq.a(cbr.class, agp.m);
   public static final agn<iy> bI = agq.a(cbr.class, agp.m);
   public static final agn<iy> bJ = agq.a(cbr.class, agp.m);
   private static final Predicate<blw> bY = $$0 -> $$0 instanceof chi && ((chi)$$0).w() == chi.a.a;
   private final iq<cng> bZ = iq.a(2, cng.f);
   private final iq<cng> ca = iq.a(4, cng.f);
   private boolean cb;
   public long bK;
   private int cc;
   private iy cd = bM;
   private iy ce = bN;
   private iy cf = bO;
   private iy cg = bP;
   private iy ch = bQ;
   private iy ci = bR;

   public cbr(bmc<? extends cbr> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cbr(ctx $$0, double $$1, double $$2, double $$3) {
      this(bmc.e, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bnt.a u() {
      return dP().a(bnu.r, 0.0);
   }

   @Override
   public void k_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   private boolean K() {
      return !this.B() && !this.aV();
   }

   @Override
   public boolean cY() {
      return super.cY() && this.K();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bD, (byte)0);
      this.an.a(bE, bM);
      this.an.a(bF, bN);
      this.an.a(bG, bO);
      this.an.a(bH, bP);
      this.an.a(bI, bQ);
      this.an.a(bJ, bR);
   }

   @Override
   public Iterable<cng> bK() {
      return this.bZ;
   }

   @Override
   public Iterable<cng> bL() {
      return this.ca;
   }

   @Override
   public cng c(bmd $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cng.f;
      }
   }

   @Override
   public void a(bmd $$0, cng $$1) {
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
   public boolean f(cng $$0) {
      bmd $$1 = bmq.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      su $$1 = new su();

      for (cng $$2 : this.ca) {
         so $$3 = new so();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      su $$4 = new su();

      for (cng $$5 : this.bZ) {
         so $$6 = new so();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.ce());
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
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         su $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            this.ca.set($$2, cng.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         su $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bZ.size(); $$4++) {
            this.bZ.set($$4, cng.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.K();
      so $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(so $$0) {
      su $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bM : new iy($$1));
      su $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bN : new iy($$2));
      su $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bO : new iy($$3));
      su $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bP : new iy($$4));
      su $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bQ : new iy($$5));
      su $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bR : new iy($$6));
   }

   private so M() {
      so $$0 = new so();
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
   protected void C(blw $$0) {
   }

   @Override
   protected void M_() {
      for (blw $$1 : this.dL().a(this, this.cH(), bY)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bkc a(cfq $$0, emc $$1, bkb $$2) {
      cng $$3 = $$0.b($$2);
      if (this.B() || $$3.a(cnj.uH)) {
         return bkc.d;
      } else if ($$0.P_()) {
         return bkc.a;
      } else if ($$0.dL().B) {
         return bkc.b;
      } else {
         bmd $$4 = bmq.h($$3);
         if ($$3.b()) {
            bmd $$5 = this.j($$1);
            bmd $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bkc.a;
            }
         } else {
            if (this.e($$4)) {
               return bkc.e;
            }

            if ($$4.a() == bmd.a.a && !this.y()) {
               return bkc.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bkc.a;
            }
         }

         return bkc.d;
      }
   }

   private bmd j(emc $$0) {
      bmd $$1 = bmd.a;
      boolean $$2 = this.w();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bmd $$4 = bmd.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bmd.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bmd.e)) {
         $$1 = bmd.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bmd.d)) {
         $$1 = bmd.d;
      } else if ($$3 >= 1.6 && this.b(bmd.f)) {
         $$1 = bmd.f;
      } else if (!this.b(bmd.a) && this.b(bmd.b)) {
         $$1 = bmd.b;
      }

      return $$1;
   }

   private boolean e(bmd $$0) {
      return (this.cc & 1 << $$0.d()) != 0 || $$0.a() == bmd.a.a && !this.y();
   }

   private boolean a(cfq $$0, bmd $$1, cng $$2, bkb $$3) {
      cng $$4 = this.c($$1);
      if (!$$4.b() && (this.cc & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cc & 1 << $$1.d() + 16) != 0) {
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
   public boolean a(bkv $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return false;
      } else if ($$0.a(ask.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.cb || this.B()) {
         return false;
      } else if ($$0.a(ask.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(ask.v)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(ask.w) && this.ev() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(ask.C);
         boolean $$3 = $$0.a(ask.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cfq $$4 && !$$4.fT().e) {
               return false;
            }

            if ($$0.g()) {
               this.O();
               this.N();
               this.al();
               return true;
            } else {
               long $$5 = this.dL().X();
               if ($$5 - this.bK > 5L && !$$3) {
                  this.dL().a(this, (byte)32);
                  this.a(dnz.o, $$0.d());
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
         if (this.dL().B) {
            this.dL().a(this.dq(), this.ds(), this.dw(), art.az, this.db(), 0.3F, 1.0F, false);
            this.bK = this.dL().X();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void N() {
      if (this.dL() instanceof ane) {
         ((ane)this.dL())
            .a(
               new jp(jx.c, cxa.n.o()),
               this.dq(),
               this.e(0.6666666666666666),
               this.dw(),
               10,
               (double)(this.dg() / 4.0F),
               (double)(this.dh() / 4.0F),
               (double)(this.dg() / 4.0F),
               0.05
            );
      }
   }

   private void g(bkv $$0, float $$1) {
      float $$2 = this.ev();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.c($$2);
         this.a(dnz.o, $$0.d());
      }
   }

   private void h(bkv $$0) {
      cng $$1 = new cng(cnj.uB);
      if (this.ae()) {
         $$1.a(this.af());
      }

      cwy.a(this.dL(), this.dl(), $$1);
      this.i($$0);
   }

   private void i(bkv $$0) {
      this.O();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bZ.size(); $$1++) {
         cng $$2 = this.bZ.get($$1);
         if (!$$2.b()) {
            cwy.a(this.dL(), this.dl().c(), $$2);
            this.bZ.set($$1, cng.f);
         }
      }

      for (int $$3 = 0; $$3 < this.ca.size(); $$3++) {
         cng $$4 = this.ca.get($$3);
         if (!$$4.b()) {
            cwy.a(this.dL(), this.dl().c(), $$4);
            this.ca.set($$3, cng.f);
         }
      }
   }

   private void O() {
      this.dL().a(null, this.dq(), this.ds(), this.dw(), art.ax, this.db(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dB();
      return 0.0F;
   }

   @Override
   public void a(emc $$0) {
      if (this.K()) {
         super.a($$0);
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
      iy $$0 = this.an.b(bE);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      iy $$1 = this.an.b(bF);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      iy $$2 = this.an.b(bG);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      iy $$3 = this.an.b(bH);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      iy $$4 = this.an.b(bI);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      iy $$5 = this.an.b(bJ);
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
      this.a(blw.c.a);
      this.b(dnz.p);
   }

   @Override
   public boolean a(ctp $$0) {
      return this.ce();
   }

   @Override
   public efe s_() {
      return this.B() ? efe.d : super.s_();
   }

   @Override
   public boolean r_() {
      return this.B();
   }

   private void t(boolean $$0) {
      this.an.b(bD, this.a(this.an.b(bD), 1, $$0));
   }

   public boolean w() {
      return (this.an.b(bD) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.b(bD, this.a(this.an.b(bD), 4, $$0));
   }

   public boolean y() {
      return (this.an.b(bD) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.b(bD, this.a(this.an.b(bD), 8, $$0));
   }

   public boolean A() {
      return (this.an.b(bD) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.b(bD, this.a(this.an.b(bD), 16, $$0));
   }

   public boolean B() {
      return (this.an.b(bD) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(iy $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void b(iy $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void c(iy $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void d(iy $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void e(iy $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public void f(iy $$0) {
      this.ci = $$0;
      this.an.b(bJ, $$0);
   }

   public iy C() {
      return this.cd;
   }

   public iy D() {
      return this.ce;
   }

   public iy E() {
      return this.cf;
   }

   public iy G() {
      return this.cg;
   }

   public iy H() {
      return this.ch;
   }

   public iy I() {
      return this.ci;
   }

   @Override
   public boolean bt() {
      return super.bt() && !this.B();
   }

   @Override
   public boolean t(blw $$0) {
      return $$0 instanceof cfq && !this.dL().a((cfq)$$0, this.dl());
   }

   @Override
   public bmi fm() {
      return bmi.b;
   }

   @Override
   public bmo.a eG() {
      return new bmo.a(art.ay, art.ay);
   }

   @Nullable
   @Override
   protected ars d(bkv $$0) {
      return art.az;
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.ax;
   }

   @Override
   public void a(ane $$0, bmn $$1) {
   }

   @Override
   public boolean fy() {
      return false;
   }

   @Override
   public void a(agn<?> $$0) {
      if (bD.equals($$0)) {
         this.k_();
         this.I = !this.B();
      }

      super.a($$0);
   }

   @Override
   public boolean fz() {
      return false;
   }

   @Override
   public blz e(bna $$0) {
      return this.v(this.B());
   }

   private blz v(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.o_() ? bT : this.ai().n();
      }
   }

   @Override
   public emc k(float $$0) {
      if (this.B()) {
         elx $$1 = this.v(false).a(this.dj());
         hx $$2 = this.dl();
         int $$3 = Integer.MIN_VALUE;

         for (hx $$4 : hx.a(hx.a($$1.a, $$1.b, $$1.c), hx.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dL().a(cug.b, $$4), this.dL().a(cug.a, $$4));
            if ($$5 == 15) {
               return emc.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return emc.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cng dy() {
      return new cng(cnj.uB);
   }

   @Override
   public boolean ep() {
      return !this.ce() && !this.B();
   }
}
