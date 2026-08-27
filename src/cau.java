import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cau extends blv {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final iw bL = new iw(0.0F, 0.0F, 0.0F);
   private static final iw bM = new iw(0.0F, 0.0F, 0.0F);
   private static final iw bN = new iw(-10.0F, 0.0F, -10.0F);
   private static final iw bO = new iw(-15.0F, 0.0F, 10.0F);
   private static final iw bP = new iw(-1.0F, 0.0F, -1.0F);
   private static final iw bQ = new iw(1.0F, 0.0F, 1.0F);
   private static final blg bR = new blg(0.0F, 0.0F, true);
   private static final blg bS = blj.d.n().a(0.5F);
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
   public static final afz<Byte> bC = agc.a(cau.class, agb.a);
   public static final afz<iw> bD = agc.a(cau.class, agb.m);
   public static final afz<iw> bE = agc.a(cau.class, agb.m);
   public static final afz<iw> bF = agc.a(cau.class, agb.m);
   public static final afz<iw> bG = agc.a(cau.class, agb.m);
   public static final afz<iw> bH = agc.a(cau.class, agb.m);
   public static final afz<iw> bI = agc.a(cau.class, agb.m);
   private static final Predicate<blf> bX = $$0 -> $$0 instanceof cgj && ((cgj)$$0).w() == cgj.a.a;
   private final io<cmh> bY = io.a(2, cmh.f);
   private final io<cmh> bZ = io.a(4, cmh.f);
   private boolean ca;
   public long bJ;
   private int cb;
   private iw cc = bL;
   private iw cd = bM;
   private iw ce = bN;
   private iw cf = bO;
   private iw cg = bP;
   private iw ch = bQ;

   public cau(blj<? extends cau> $$0, csy $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public cau(csy $$0, double $$1, double $$2, double $$3) {
      this(blj.d, $$0);
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
   public Iterable<cmh> bK() {
      return this.bY;
   }

   @Override
   public Iterable<cmh> bL() {
      return this.bZ;
   }

   @Override
   public cmh c(blk $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cmh.f;
      }
   }

   @Override
   public void a(blk $$0, cmh $$1) {
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
   public boolean f(cmh $$0) {
      blk $$1 = blx.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      sp $$1 = new sp();

      for (cmh $$2 : this.bZ) {
         sj $$3 = new sj();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      sp $$4 = new sp();

      for (cmh $$5 : this.bY) {
         sj $$6 = new sj();
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
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         sp $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cmh.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         sp $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cmh.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.I();
      sj $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(sj $$0) {
      sp $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new iw($$1));
      sp $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new iw($$2));
      sp $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new iw($$3));
      sp $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new iw($$4));
      sp $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new iw($$5));
      sp $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new iw($$6));
   }

   private sj K() {
      sj $$0 = new sj();
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
   protected void D(blf $$0) {
   }

   @Override
   protected void M_() {
      for (blf $$1 : this.dM().a(this, this.cH(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bjl a(cer $$0, elb $$1, bjk $$2) {
      cmh $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cmk.uE)) {
         return bjl.d;
      } else if ($$0.P_()) {
         return bjl.a;
      } else if ($$0.dM().B) {
         return bjl.b;
      } else {
         blk $$4 = blx.h($$3);
         if ($$3.b()) {
            blk $$5 = this.j($$1);
            blk $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bjl.a;
            }
         } else {
            if (this.e($$4)) {
               return bjl.e;
            }

            if ($$4.a() == blk.a.a && !this.w()) {
               return bjl.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bjl.a;
            }
         }

         return bjl.d;
      }
   }

   private blk j(elb $$0) {
      blk $$1 = blk.a;
      boolean $$2 = this.u();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      blk $$4 = blk.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = blk.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(blk.e)) {
         $$1 = blk.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(blk.d)) {
         $$1 = blk.d;
      } else if ($$3 >= 1.6 && this.b(blk.f)) {
         $$1 = blk.f;
      } else if (!this.b(blk.a) && this.b(blk.b)) {
         $$1 = blk.b;
      }

      return $$1;
   }

   private boolean e(blk $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == blk.a.a && !this.w();
   }

   private boolean a(cer $$0, blk $$1, cmh $$2, bjk $$3) {
      cmh $$4 = this.c($$1);
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
   public boolean a(bkd $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return false;
      } else if ($$0.a(art.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.ca || this.A()) {
         return false;
      } else if ($$0.a(art.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(art.v)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(art.w) && this.ev() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(art.C);
         boolean $$3 = $$0.a(art.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cer $$4 && !$$4.fT().e) {
               return false;
            }

            if ($$0.g()) {
               this.N();
               this.M();
               this.al();
               return true;
            } else {
               long $$5 = this.dM().W();
               if ($$5 - this.bJ > 5L && !$$3) {
                  this.dM().a(this, (byte)32);
                  this.a(dmz.o, $$0.d());
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
            this.dM().a(this.dr(), this.dt(), this.dx(), arc.an, this.db(), 0.3F, 1.0F, false);
            this.bJ = this.dM().W();
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
      if (this.dM() instanceof amp) {
         ((amp)this.dM())
            .a(
               new jn(jv.c, cwb.n.o()),
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

   private void g(bkd $$0, float $$1) {
      float $$2 = this.ev();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.c($$2);
         this.a(dmz.o, $$0.d());
      }
   }

   private void h(bkd $$0) {
      cmh $$1 = new cmh(cmk.uy);
      if (this.ae()) {
         $$1.a(this.af());
      }

      cvz.a(this.dM(), this.dm(), $$1);
      this.i($$0);
   }

   private void i(bkd $$0) {
      this.N();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         cmh $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            cvz.a(this.dM(), this.dm().c(), $$2);
            this.bY.set($$1, cmh.f);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         cmh $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            cvz.a(this.dM(), this.dm().c(), $$4);
            this.bZ.set($$3, cmh.f);
         }
      }
   }

   private void N() {
      this.dM().a(null, this.dr(), this.dt(), this.dx(), arc.al, this.db(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dC();
      return 0.0F;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * (this.o_() ? 0.5F : 0.9F);
   }

   @Override
   public void a(elb $$0) {
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
      iw $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      iw $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      iw $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      iw $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      iw $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      iw $$5 = this.an.b(bI);
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
      this.a(blf.c.a);
      this.a(dmz.p);
   }

   @Override
   public boolean a(csq $$0) {
      return this.ce();
   }

   @Override
   public eee s_() {
      return this.A() ? eee.d : super.s_();
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

   public void a(iw $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(iw $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(iw $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(iw $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(iw $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(iw $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public iw B() {
      return this.cc;
   }

   public iw C() {
      return this.cd;
   }

   public iw D() {
      return this.ce;
   }

   public iw E() {
      return this.cf;
   }

   public iw G() {
      return this.cg;
   }

   public iw H() {
      return this.ch;
   }

   @Override
   public boolean bt() {
      return super.bt() && !this.A();
   }

   @Override
   public boolean u(blf $$0) {
      return $$0 instanceof cer && !this.dM().a((cer)$$0, this.dm());
   }

   @Override
   public blp fm() {
      return blp.b;
   }

   @Override
   public blv.a eG() {
      return new blv.a(arc.am, arc.am);
   }

   @Nullable
   @Override
   protected arb d(bkd $$0) {
      return arc.an;
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.al;
   }

   @Override
   public void a(amp $$0, blu $$1) {
   }

   @Override
   public boolean fy() {
      return false;
   }

   @Override
   public void a(afz<?> $$0) {
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
   public blg a(bmh $$0) {
      return this.v(this.A());
   }

   private blg v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.o_() ? bS : this.ai().n();
      }
   }

   @Override
   public elb k(float $$0) {
      if (this.A()) {
         ekw $$1 = this.v(false).a(this.dk());
         hv $$2 = this.dm();
         int $$3 = Integer.MIN_VALUE;

         for (hv $$4 : hv.a(hv.a($$1.a, $$1.b, $$1.c), hv.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dM().a(cth.b, $$4), this.dM().a(cth.a, $$4));
            if ($$5 == 15) {
               return elb.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return elb.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cmh dz() {
      return new cmh(cmk.uy);
   }

   @Override
   public boolean ep() {
      return !this.ce() && !this.A();
   }
}
