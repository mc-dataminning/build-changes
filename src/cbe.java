import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbe extends bmf {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final iy bL = new iy(0.0F, 0.0F, 0.0F);
   private static final iy bM = new iy(0.0F, 0.0F, 0.0F);
   private static final iy bN = new iy(-10.0F, 0.0F, -10.0F);
   private static final iy bO = new iy(-15.0F, 0.0F, 10.0F);
   private static final iy bP = new iy(-1.0F, 0.0F, -1.0F);
   private static final iy bQ = new iy(1.0F, 0.0F, 1.0F);
   private static final blq bR = new blq(0.0F, 0.0F, true);
   private static final blq bS = blt.d.n().a(0.5F);
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
   public static final agj<Byte> bC = agm.a(cbe.class, agl.a);
   public static final agj<iy> bD = agm.a(cbe.class, agl.m);
   public static final agj<iy> bE = agm.a(cbe.class, agl.m);
   public static final agj<iy> bF = agm.a(cbe.class, agl.m);
   public static final agj<iy> bG = agm.a(cbe.class, agl.m);
   public static final agj<iy> bH = agm.a(cbe.class, agl.m);
   public static final agj<iy> bI = agm.a(cbe.class, agl.m);
   private static final Predicate<blp> bX = $$0 -> $$0 instanceof cgt && ((cgt)$$0).w() == cgt.a.a;
   private final iq<cmr> bY = iq.a(2, cmr.f);
   private final iq<cmr> bZ = iq.a(4, cmr.f);
   private boolean ca;
   public long bJ;
   private int cb;
   private iy cc = bL;
   private iy cd = bM;
   private iy ce = bN;
   private iy cf = bO;
   private iy cg = bP;
   private iy ch = bQ;

   public cbe(blt<? extends cbe> $$0, cti $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public cbe(cti $$0, double $$1, double $$2, double $$3) {
      this(blt.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public void k_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   private boolean I() {
      return !this.A() && !this.aV();
   }

   @Override
   public boolean cY() {
      return super.cY() && this.I();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bC, (byte)0);
      this.an.a(bD, bL);
      this.an.a(bE, bM);
      this.an.a(bF, bN);
      this.an.a(bG, bO);
      this.an.a(bH, bP);
      this.an.a(bI, bQ);
   }

   @Override
   public Iterable<cmr> bK() {
      return this.bY;
   }

   @Override
   public Iterable<cmr> bL() {
      return this.bZ;
   }

   @Override
   public cmr c(blu $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cmr.f;
      }
   }

   @Override
   public void a(blu $$0, cmr $$1) {
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
   public boolean f(cmr $$0) {
      blu $$1 = bmh.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      sr $$1 = new sr();

      for (cmr $$2 : this.bZ) {
         sl $$3 = new sl();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      sr $$4 = new sr();

      for (cmr $$5 : this.bY) {
         sl $$6 = new sl();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.ce());
      $$0.a("Small", this.u());
      $$0.a("ShowArms", this.w());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.y());
      if (this.A()) {
         $$0.a("Marker", this.A());
      }

      $$0.a("Pose", this.K());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         sr $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cmr.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         sr $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cmr.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.I();
      sl $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(sl $$0) {
      sr $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new iy($$1));
      sr $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new iy($$2));
      sr $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new iy($$3));
      sr $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new iy($$4));
      sr $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new iy($$5));
      sr $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new iy($$6));
   }

   private sl K() {
      sl $$0 = new sl();
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
   protected void D(blp $$0) {
   }

   @Override
   protected void M_() {
      for (blp $$1 : this.dM().a(this, this.cH(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bjv a(cfb $$0, elm $$1, bju $$2) {
      cmr $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cmu.uE)) {
         return bjv.d;
      } else if ($$0.P_()) {
         return bjv.a;
      } else if ($$0.dM().B) {
         return bjv.b;
      } else {
         blu $$4 = bmh.h($$3);
         if ($$3.b()) {
            blu $$5 = this.j($$1);
            blu $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bjv.a;
            }
         } else {
            if (this.e($$4)) {
               return bjv.e;
            }

            if ($$4.a() == blu.a.a && !this.w()) {
               return bjv.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bjv.a;
            }
         }

         return bjv.d;
      }
   }

   private blu j(elm $$0) {
      blu $$1 = blu.a;
      boolean $$2 = this.u();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      blu $$4 = blu.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = blu.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(blu.e)) {
         $$1 = blu.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(blu.d)) {
         $$1 = blu.d;
      } else if ($$3 >= 1.6 && this.b(blu.f)) {
         $$1 = blu.f;
      } else if (!this.b(blu.a) && this.b(blu.b)) {
         $$1 = blu.b;
      }

      return $$1;
   }

   private boolean e(blu $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == blu.a.a && !this.w();
   }

   private boolean a(cfb $$0, blu $$1, cmr $$2, bju $$3) {
      cmr $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
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
   public boolean a(bkn $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return false;
      } else if ($$0.a(asd.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.ca || this.A()) {
         return false;
      } else if ($$0.a(asd.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(asd.v)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(asd.w) && this.ev() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(asd.C);
         boolean $$3 = $$0.a(asd.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cfb $$4 && !$$4.fT().e) {
               return false;
            }

            if ($$0.g()) {
               this.N();
               this.M();
               this.al();
               return true;
            } else {
               long $$5 = this.dM().X();
               if ($$5 - this.bJ > 5L && !$$3) {
                  this.dM().a(this, (byte)32);
                  this.a(dnk.o, $$0.d());
                  this.bJ = $$5;
               } else {
                  this.h($$0);
                  this.M();
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
            this.dM().a(this.dr(), this.dt(), this.dx(), arm.an, this.db(), 0.3F, 1.0F, false);
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

   private void M() {
      if (this.dM() instanceof amz) {
         ((amz)this.dM())
            .a(
               new jp(jx.c, cwl.n.o()),
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

   private void g(bkn $$0, float $$1) {
      float $$2 = this.ev();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.c($$2);
         this.a(dnk.o, $$0.d());
      }
   }

   private void h(bkn $$0) {
      cmr $$1 = new cmr(cmu.uy);
      if (this.ae()) {
         $$1.a(this.af());
      }

      cwj.a(this.dM(), this.dm(), $$1);
      this.i($$0);
   }

   private void i(bkn $$0) {
      this.N();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         cmr $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            cwj.a(this.dM(), this.dm().c(), $$2);
            this.bY.set($$1, cmr.f);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         cmr $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            cwj.a(this.dM(), this.dm().c(), $$4);
            this.bZ.set($$3, cmr.f);
         }
      }
   }

   private void N() {
      this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.al, this.db(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dC();
      return 0.0F;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return $$1.b * (this.o_() ? 0.5F : 0.9F);
   }

   @Override
   public void a(elm $$0) {
      if (this.I()) {
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
      iy $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      iy $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      iy $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      iy $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      iy $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      iy $$5 = this.an.b(bI);
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
      return this.u();
   }

   @Override
   public void al() {
      this.a(blp.c.a);
      this.a(dnk.p);
   }

   @Override
   public boolean a(cta $$0) {
      return this.ce();
   }

   @Override
   public eep s_() {
      return this.A() ? eep.d : super.s_();
   }

   @Override
   public boolean r_() {
      return this.A();
   }

   private void t(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 1, $$0));
   }

   @Override
   public boolean u() {
      return (this.an.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 4, $$0));
   }

   public boolean w() {
      return (this.an.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 8, $$0));
   }

   public boolean y() {
      return (this.an.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 16, $$0));
   }

   public boolean A() {
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

   public void a(iy $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(iy $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(iy $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(iy $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(iy $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(iy $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public iy B() {
      return this.cc;
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

   @Override
   public boolean bt() {
      return super.bt() && !this.A();
   }

   @Override
   public boolean u(blp $$0) {
      return $$0 instanceof cfb && !this.dM().a((cfb)$$0, this.dm());
   }

   @Override
   public blz fm() {
      return blz.b;
   }

   @Override
   public bmf.a eG() {
      return new bmf.a(arm.am, arm.am);
   }

   @Nullable
   @Override
   protected arl d(bkn $$0) {
      return arm.an;
   }

   @Nullable
   @Override
   protected arl n_() {
      return arm.al;
   }

   @Override
   public void a(amz $$0, bme $$1) {
   }

   @Override
   public boolean fy() {
      return false;
   }

   @Override
   public void a(agj<?> $$0) {
      if (bC.equals($$0)) {
         this.k_();
         this.I = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fz() {
      return false;
   }

   @Override
   public blq a(bmr $$0) {
      return this.v(this.A());
   }

   private blq v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.o_() ? bS : this.ai().n();
      }
   }

   @Override
   public elm k(float $$0) {
      if (this.A()) {
         elh $$1 = this.v(false).a(this.dk());
         hx $$2 = this.dm();
         int $$3 = Integer.MIN_VALUE;

         for (hx $$4 : hx.a(hx.a($$1.a, $$1.b, $$1.c), hx.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dM().a(ctr.b, $$4), this.dM().a(ctr.a, $$4));
            if ($$5 == 15) {
               return elm.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return elm.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cmr dz() {
      return new cmr(cmu.uy);
   }

   @Override
   public boolean ep() {
      return !this.ce() && !this.A();
   }
}
