import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdi extends bog {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final ja bL = new ja(0.0F, 0.0F, 0.0F);
   private static final ja bM = new ja(0.0F, 0.0F, 0.0F);
   private static final ja bN = new ja(-10.0F, 0.0F, -10.0F);
   private static final ja bO = new ja(-15.0F, 0.0F, 10.0F);
   private static final ja bP = new ja(-1.0F, 0.0F, -1.0F);
   private static final ja bQ = new ja(1.0F, 0.0F, 1.0F);
   private static final bnr bR = bnr.c(0.0F, 0.0F);
   private static final bnr bS = bnu.e.n().a(0.5F).b(0.9875F);
   private static final double bT = 0.1;
   private static final double bU = 0.9;
   private static final double bV = 0.4;
   private static final double bW = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int bB = 16;
   public static final aie<Byte> bC = aih.a(cdi.class, aig.a);
   public static final aie<ja> bD = aih.a(cdi.class, aig.m);
   public static final aie<ja> bE = aih.a(cdi.class, aig.m);
   public static final aie<ja> bF = aih.a(cdi.class, aig.m);
   public static final aie<ja> bG = aih.a(cdi.class, aig.m);
   public static final aie<ja> bH = aih.a(cdi.class, aig.m);
   public static final aie<ja> bI = aih.a(cdi.class, aig.m);
   private static final Predicate<bno> bX = $$0 -> $$0 instanceof cja && ((cja)$$0).w() == cja.a.a;
   private final is<coz> bY = is.a(2, coz.h);
   private final is<coz> bZ = is.a(4, coz.h);
   private boolean ca;
   public long bJ;
   private int cb;
   private ja cc = bL;
   private ja cd = bM;
   private ja ce = bN;
   private ja cf = bO;
   private ja cg = bP;
   private ja ch = bQ;

   public cdi(bnu<? extends cdi> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cdi(cvn $$0, double $$1, double $$2, double $$3) {
      this(bnu.e, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bpk.a u() {
      return dQ().a(bpl.r, 0.0);
   }

   @Override
   public void k_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
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
      this.am.a(bC, (byte)0);
      this.am.a(bD, bL);
      this.am.a(bE, bM);
      this.am.a(bF, bN);
      this.am.a(bG, bO);
      this.am.a(bH, bP);
      this.am.a(bI, bQ);
   }

   @Override
   public Iterable<coz> bK() {
      return this.bY;
   }

   @Override
   public Iterable<coz> bL() {
      return this.bZ;
   }

   @Override
   public coz c(bnv $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return coz.h;
      }
   }

   @Override
   public void a(bnv $$0, coz $$1) {
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
   public boolean f(coz $$0) {
      bnv $$1 = boi.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      tc $$1 = new tc();

      for (coz $$2 : this.bZ) {
         sw $$3 = new sw();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      tc $$4 = new tc();

      for (coz $$5 : this.bY) {
         sw $$6 = new sw();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.ce());
      $$0.a("Small", this.w());
      $$0.a("ShowArms", this.y());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.A());
      if (this.B()) {
         $$0.a("Marker", this.B());
      }

      $$0.a("Pose", this.M());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         tc $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, coz.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tc $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, coz.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ae = !this.K();
      sw $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(sw $$0) {
      tc $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new ja($$1));
      tc $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new ja($$2));
      tc $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new ja($$3));
      tc $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new ja($$4));
      tc $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new ja($$5));
      tc $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new ja($$6));
   }

   private sw M() {
      sw $$0 = new sw();
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
   public boolean bu() {
      return false;
   }

   @Override
   protected void C(bno $$0) {
   }

   @Override
   protected void M_() {
      for (bno $$1 : this.dM().a(this, this.cH(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public blu a(chh $$0, ens $$1, blt $$2) {
      coz $$3 = $$0.b($$2);
      if (this.B() || $$3.a(cpc.uH)) {
         return blu.d;
      } else if ($$0.P_()) {
         return blu.a;
      } else if ($$0.dM().B) {
         return blu.b;
      } else {
         bnv $$4 = boi.h($$3);
         if ($$3.b()) {
            bnv $$5 = this.j($$1);
            bnv $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return blu.a;
            }
         } else {
            if (this.e($$4)) {
               return blu.e;
            }

            if ($$4.a() == bnv.a.a && !this.y()) {
               return blu.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return blu.a;
            }
         }

         return blu.d;
      }
   }

   private bnv j(ens $$0) {
      bnv $$1 = bnv.a;
      boolean $$2 = this.w();
      double $$3 = $$0.d / (double)(this.ea() * this.dZ());
      bnv $$4 = bnv.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bnv.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bnv.e)) {
         $$1 = bnv.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bnv.d)) {
         $$1 = bnv.d;
      } else if ($$3 >= 1.6 && this.b(bnv.f)) {
         $$1 = bnv.f;
      } else if (!this.b(bnv.a) && this.b(bnv.b)) {
         $$1 = bnv.b;
      }

      return $$1;
   }

   private boolean e(bnv $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == bnv.a.a && !this.y();
   }

   private boolean a(chh $$0, bnv $$1, coz $$2, blt $$3) {
      coz $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fU().d && $$4.b() && !$$2.b()) {
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
   public boolean a(bmn $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return false;
      } else if ($$0.a(aub.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.ca || this.B()) {
         return false;
      } else if ($$0.a(aub.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(aub.v)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(aub.w) && this.ew() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(aub.C);
         boolean $$3 = $$0.a(aub.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof chh $$4 && !$$4.fU().e) {
               return false;
            }

            if ($$0.g()) {
               this.O();
               this.N();
               this.al();
               return true;
            } else {
               long $$5 = this.dM().X();
               if ($$5 - this.bJ > 5L && !$$3) {
                  this.dM().a(this, (byte)32);
                  this.a(dpp.o, $$0.d());
                  this.bJ = $$5;
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
         if (this.dM().B) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atk.az, this.db(), 0.3F, 1.0F, false);
            this.bJ = this.dM().X();
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
      if (this.dM() instanceof aov) {
         ((aov)this.dM())
            .a(
               new jr(jz.c, cyq.n.o()),
               this.dr(),
               this.e(0.6666666666666666),
               this.dx(),
               10,
               (double)(this.dg() / 4.0F),
               (double)(this.dh() / 4.0F),
               (double)(this.dg() / 4.0F),
               0.05
            );
      }
   }

   private void g(bmn $$0, float $$1) {
      float $$2 = this.ew();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.t($$2);
         this.a(dpp.o, $$0.d());
      }
   }

   private void h(bmn $$0) {
      coz $$1 = new coz(cpc.uB);
      if (this.ae()) {
         $$1.a(this.af());
      }

      cyo.a(this.dM(), this.dm(), $$1);
      this.i($$0);
   }

   private void i(bmn $$0) {
      this.O();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         coz $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            cyo.a(this.dM(), this.dm().c(), $$2);
            this.bY.set($$1, coz.h);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         coz $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            cyo.a(this.dM(), this.dm().c(), $$4);
            this.bZ.set($$3, coz.h);
         }
      }
   }

   private void O() {
      this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.ax, this.db(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.M;
      this.aU = this.dC();
      return 0.0F;
   }

   @Override
   public void a(ens $$0) {
      if (this.K()) {
         super.a($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.aV = this.M = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void n(float $$0) {
      this.aV = this.M = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void l() {
      super.l();
      ja $$0 = this.am.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      ja $$1 = this.am.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      ja $$2 = this.am.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      ja $$3 = this.am.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      ja $$4 = this.am.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      ja $$5 = this.am.b(bI);
      if (!this.ch.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void J() {
      this.j(this.ca);
   }

   @Override
   public void j(boolean $$0) {
      this.ca = $$0;
      super.j($$0);
   }

   @Override
   public boolean o_() {
      return this.w();
   }

   @Override
   public void al() {
      this.a(bno.c.a);
      this.b(dpp.p);
   }

   @Override
   public boolean a(cvf $$0) {
      return this.ce();
   }

   @Override
   public egu s_() {
      return this.B() ? egu.d : super.s_();
   }

   @Override
   public boolean r_() {
      return this.B();
   }

   private void t(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 1, $$0));
   }

   public boolean w() {
      return (this.am.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 4, $$0));
   }

   public boolean y() {
      return (this.am.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 8, $$0));
   }

   public boolean A() {
      return (this.am.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 16, $$0));
   }

   public boolean B() {
      return (this.am.b(bC) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(ja $$0) {
      this.cc = $$0;
      this.am.b(bD, $$0);
   }

   public void b(ja $$0) {
      this.cd = $$0;
      this.am.b(bE, $$0);
   }

   public void c(ja $$0) {
      this.ce = $$0;
      this.am.b(bF, $$0);
   }

   public void d(ja $$0) {
      this.cf = $$0;
      this.am.b(bG, $$0);
   }

   public void e(ja $$0) {
      this.cg = $$0;
      this.am.b(bH, $$0);
   }

   public void f(ja $$0) {
      this.ch = $$0;
      this.am.b(bI, $$0);
   }

   public ja C() {
      return this.cc;
   }

   public ja D() {
      return this.cd;
   }

   public ja E() {
      return this.ce;
   }

   public ja G() {
      return this.cf;
   }

   public ja H() {
      return this.cg;
   }

   public ja I() {
      return this.ch;
   }

   @Override
   public boolean bt() {
      return super.bt() && !this.B();
   }

   @Override
   public boolean t(bno $$0) {
      return $$0 instanceof chh && !this.dM().a((chh)$$0, this.dm());
   }

   @Override
   public boa fm() {
      return boa.b;
   }

   @Override
   public bog.a eH() {
      return new bog.a(atk.ay, atk.ay);
   }

   @Nullable
   @Override
   protected atj d(bmn $$0) {
      return atk.az;
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.ax;
   }

   @Override
   public void a(aov $$0, bof $$1) {
   }

   @Override
   public boolean fy() {
      return false;
   }

   @Override
   public void a(aie<?> $$0) {
      if (bC.equals($$0)) {
         this.k_();
         this.H = !this.B();
      }

      super.a($$0);
   }

   @Override
   public boolean fz() {
      return false;
   }

   @Override
   public bnr e(bor $$0) {
      return this.v(this.B());
   }

   private bnr v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.o_() ? bS : this.ai().n();
      }
   }

   @Override
   public ens k(float $$0) {
      if (this.B()) {
         enn $$1 = this.v(false).a(this.dk());
         hz $$2 = this.dm();
         int $$3 = Integer.MIN_VALUE;

         for (hz $$4 : hz.a(hz.a($$1.a, $$1.b, $$1.c), hz.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dM().a(cvw.b, $$4), this.dM().a(cvw.a, $$4));
            if ($$5 == 15) {
               return ens.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ens.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public coz dz() {
      return new coz(cpc.uB);
   }

   @Override
   public boolean eq() {
      return !this.ce() && !this.B();
   }
}
