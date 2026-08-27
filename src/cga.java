import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cga extends bqt {
   public static final int b = 5;
   private static final boolean bN = true;
   private static final jf bO = new jf(0.0F, 0.0F, 0.0F);
   private static final jf bP = new jf(0.0F, 0.0F, 0.0F);
   private static final jf bQ = new jf(-10.0F, 0.0F, -10.0F);
   private static final jf bR = new jf(-15.0F, 0.0F, 10.0F);
   private static final jf bS = new jf(-1.0F, 0.0F, -1.0F);
   private static final jf bT = new jf(1.0F, 0.0F, 1.0F);
   private static final bqd bU = bqd.c(0.0F, 0.0F);
   private static final bqd bV = bqg.d.n().a(0.5F).b(0.9875F);
   private static final double bW = 0.1;
   private static final double bX = 0.9;
   private static final double bY = 0.4;
   private static final double bZ = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int bE = 16;
   public static final aja<Byte> bF = aje.a(cga.class, ajc.a);
   public static final aja<jf> bG = aje.a(cga.class, ajc.m);
   public static final aja<jf> bH = aje.a(cga.class, ajc.m);
   public static final aja<jf> bI = aje.a(cga.class, ajc.m);
   public static final aja<jf> bJ = aje.a(cga.class, ajc.m);
   public static final aja<jf> bK = aje.a(cga.class, ajc.m);
   public static final aja<jf> bL = aje.a(cga.class, ajc.m);
   private static final Predicate<bqa> ca = $$0 -> $$0 instanceof clv && ((clv)$$0).v() == clv.a.a;
   private final iw<crs> cb = iw.a(2, crs.i);
   private final iw<crs> cc = iw.a(4, crs.i);
   private boolean cd;
   public long bM;
   private int ce;
   private jf cf = bO;
   private jf cg = bP;
   private jf ch = bQ;
   private jf ci = bR;
   private jf cj = bS;
   private jf ck = bT;

   public cga(bqg<? extends cga> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cga(czg $$0, double $$1, double $$2, double $$3) {
      this(bqg.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static brz.a r() {
      return dR().a(bsa.v, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean H() {
      return !this.z() && !this.aV();
   }

   @Override
   public boolean cY() {
      return super.cY() && this.H();
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bF, (byte)0);
      $$0.a(bG, bO);
      $$0.a(bH, bP);
      $$0.a(bI, bQ);
      $$0.a(bJ, bR);
      $$0.a(bK, bS);
      $$0.a(bL, bT);
   }

   @Override
   public Iterable<crs> eX() {
      return this.cb;
   }

   @Override
   public Iterable<crs> eW() {
      return this.cc;
   }

   @Override
   public crs d(bqh $$0) {
      switch ($$0.a()) {
         case a:
            return this.cb.get($$0.b());
         case b:
            return this.cc.get($$0.b());
         default:
            return crs.i;
      }
   }

   @Override
   public boolean c(bqh $$0) {
      return $$0 != bqh.g;
   }

   @Override
   public void a(bqh $$0, crs $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cb.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(crs $$0) {
      bqh $$1 = bqv.h($$0);
      return this.d($$1).d() && !this.f($$1);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      tu $$1 = new tu();

      for (crs $$2 : this.cc) {
         $$1.add($$2.b(this.dO()));
      }

      $$0.a("ArmorItems", $$1);
      tu $$3 = new tu();

      for (crs $$4 : this.cb) {
         $$3.add($$4.b(this.dO()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.ce());
      $$0.a("Small", this.u());
      $$0.a("ShowArms", this.v());
      $$0.a("DisabledSlots", this.ce);
      $$0.a("NoBasePlate", this.y());
      if (this.z()) {
         $$0.a("Marker", this.z());
      }

      $$0.a("Pose", this.I());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         tu $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            to $$3 = $$1.a($$2);
            this.cc.set($$2, crs.a(this.dO(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tu $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.cb.size(); $$5++) {
            to $$6 = $$4.a($$5);
            this.cb.set($$5, crs.a(this.dO(), $$6));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.ce = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.H();
      to $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(to $$0) {
      tu $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bO : new jf($$1));
      tu $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bP : new jf($$2));
      tu $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bQ : new jf($$3));
      tu $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bR : new jf($$4));
      tu $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bS : new jf($$5));
      tu $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bT : new jf($$6));
   }

   private to I() {
      to $$0 = new to();
      if (!bO.equals(this.cf)) {
         $$0.a("Head", this.cf.a());
      }

      if (!bP.equals(this.cg)) {
         $$0.a("Body", this.cg.a());
      }

      if (!bQ.equals(this.ch)) {
         $$0.a("LeftArm", this.ch.a());
      }

      if (!bR.equals(this.ci)) {
         $$0.a("RightArm", this.ci.a());
      }

      if (!bS.equals(this.cj)) {
         $$0.a("LeftLeg", this.cj.a());
      }

      if (!bT.equals(this.ck)) {
         $$0.a("RightLeg", this.ck.a());
      }

      return $$0;
   }

   @Override
   public boolean bx() {
      return false;
   }

   @Override
   protected void D(bqa $$0) {
   }

   @Override
   protected void q() {
      for (bqa $$1 : this.dM().a(this, this.cH(), ca)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bof a(cka $$0, esj $$1, boe $$2) {
      crs $$3 = $$0.b($$2);
      if (this.z() || $$3.a(crv.uJ)) {
         return bof.d;
      } else if ($$0.N_()) {
         return bof.a;
      } else if ($$0.dM().B) {
         return bof.b;
      } else {
         bqh $$4 = bqv.h($$3);
         if ($$3.d()) {
            bqh $$5 = this.j($$1);
            bqh $$6 = this.f($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bof.a;
            }
         } else {
            if (this.f($$4)) {
               return bof.e;
            }

            if ($$4.a() == bqh.a.a && !this.v()) {
               return bof.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bof.a;
            }
         }

         return bof.d;
      }
   }

   private bqh j(esj $$0) {
      bqh $$1 = bqh.a;
      boolean $$2 = this.u();
      double $$3 = $$0.d / (double)(this.eb() * this.ea());
      bqh $$4 = bqh.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bqh.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bqh.e)) {
         $$1 = bqh.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bqh.d)) {
         $$1 = bqh.d;
      } else if ($$3 >= 1.6 && this.b(bqh.f)) {
         $$1 = bqh.f;
      } else if (!this.b(bqh.a) && this.b(bqh.b)) {
         $$1 = bqh.b;
      }

      return $$1;
   }

   private boolean f(bqh $$0) {
      return (this.ce & 1 << $$0.d()) != 0 || $$0.a() == bqh.a.a && !this.v();
   }

   private boolean a(cka $$0, bqh $$1, crs $$2, boe $$3) {
      crs $$4 = this.d($$1);
      if (!$$4.d() && (this.ce & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.d() && (this.ce & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fM() && $$4.d() && !$$2.d()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.d() || $$2.G() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.d()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return false;
      } else if ($$0.a(avg.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.cd || this.z()) {
         return false;
      } else if ($$0.a(avg.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(avg.v)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(avg.w) && this.ex() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(avg.C);
         boolean $$3 = $$0.a(avg.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cka $$4 && !$$4.ga().e) {
               return false;
            }

            if ($$0.g()) {
               this.M();
               this.K();
               this.al();
               return true;
            } else {
               long $$5 = this.dM().Y();
               if ($$5 - this.bM > 5L && !$$3) {
                  this.dM().a(this, (byte)32);
                  this.a(dub.o, $$0.d());
                  this.bM = $$5;
               } else {
                  this.h($$0);
                  this.K();
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
            this.dM().a(this.dr(), this.dt(), this.dx(), auo.aC, this.db(), 0.3F, 1.0F, false);
            this.bM = this.dM().Y();
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

   private void K() {
      if (this.dM() instanceof apu) {
         ((apu)this.dM())
            .a(
               new kf(kn.c, dcj.n.n()),
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

   private void g(boy $$0, float $$1) {
      float $$2 = this.ex();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.t($$2);
         this.a(dub.o, $$0.d());
      }
   }

   private void h(boy $$0) {
      crs $$1 = new crs(crv.uD);
      $$1.b(jr.d, this.af());
      dch.a(this.dM(), this.dm(), $$1);
      this.i($$0);
   }

   private void i(boy $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cb.size(); $$1++) {
         crs $$2 = this.cb.get($$1);
         if (!$$2.d()) {
            dch.a(this.dM(), this.dm().c(), $$2);
            this.cb.set($$1, crs.i);
         }
      }

      for (int $$3 = 0; $$3 < this.cc.size(); $$3++) {
         crs $$4 = this.cc.get($$3);
         if (!$$4.d()) {
            dch.a(this.dM(), this.dm().c(), $$4);
            this.cc.set($$3, crs.i);
         }
      }
   }

   private void M() {
      this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.aA, this.db(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aY = this.N;
      this.aX = this.dC();
      return 0.0F;
   }

   @Override
   public void a(esj $$0) {
      if (this.H()) {
         super.a($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.aY = this.N = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void n(float $$0) {
      this.aY = this.N = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void l() {
      super.l();
      jf $$0 = this.an.a(bG);
      if (!this.cf.equals($$0)) {
         this.a($$0);
      }

      jf $$1 = this.an.a(bH);
      if (!this.cg.equals($$1)) {
         this.b($$1);
      }

      jf $$2 = this.an.a(bI);
      if (!this.ch.equals($$2)) {
         this.c($$2);
      }

      jf $$3 = this.an.a(bJ);
      if (!this.ci.equals($$3)) {
         this.d($$3);
      }

      jf $$4 = this.an.a(bK);
      if (!this.cj.equals($$4)) {
         this.e($$4);
      }

      jf $$5 = this.an.a(bL);
      if (!this.ck.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void J() {
      this.j(this.cd);
   }

   @Override
   public void j(boolean $$0) {
      this.cd = $$0;
      super.j($$0);
   }

   @Override
   public boolean p_() {
      return this.u();
   }

   @Override
   public void al() {
      this.a(bqa.c.a);
      this.a(dub.p);
   }

   @Override
   public boolean a(cyy $$0) {
      return this.ce();
   }

   @Override
   public elg k_() {
      return this.z() ? elg.d : super.k_();
   }

   @Override
   public boolean r_() {
      return this.z();
   }

   private void t(boolean $$0) {
      this.an.a(bF, this.a(this.an.a(bF), 1, $$0));
   }

   public boolean u() {
      return (this.an.a(bF) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.a(bF, this.a(this.an.a(bF), 4, $$0));
   }

   @Override
   public boolean v() {
      return (this.an.a(bF) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.a(bF, this.a(this.an.a(bF), 8, $$0));
   }

   public boolean y() {
      return (this.an.a(bF) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.a(bF, this.a(this.an.a(bF), 16, $$0));
   }

   public boolean z() {
      return (this.an.a(bF) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(jf $$0) {
      this.cf = $$0;
      this.an.a(bG, $$0);
   }

   public void b(jf $$0) {
      this.cg = $$0;
      this.an.a(bH, $$0);
   }

   public void c(jf $$0) {
      this.ch = $$0;
      this.an.a(bI, $$0);
   }

   public void d(jf $$0) {
      this.ci = $$0;
      this.an.a(bJ, $$0);
   }

   public void e(jf $$0) {
      this.cj = $$0;
      this.an.a(bK, $$0);
   }

   public void f(jf $$0) {
      this.ck = $$0;
      this.an.a(bL, $$0);
   }

   public jf A() {
      return this.cf;
   }

   public jf B() {
      return this.cg;
   }

   public jf C() {
      return this.ch;
   }

   public jf D() {
      return this.ci;
   }

   public jf E() {
      return this.cj;
   }

   public jf G() {
      return this.ck;
   }

   @Override
   public boolean bw() {
      return super.bw() && !this.z();
   }

   @Override
   public boolean u(bqa $$0) {
      return $$0 instanceof cka && !this.dM().a((cka)$$0, this.dm());
   }

   @Override
   public bqn fr() {
      return bqn.b;
   }

   @Override
   public bqt.a eI() {
      return new bqt.a(auo.aB, auo.aB);
   }

   @Nullable
   @Override
   protected aun d(boy $$0) {
      return auo.aC;
   }

   @Nullable
   @Override
   protected aun o_() {
      return auo.aA;
   }

   @Override
   public void a(apu $$0, bqs $$1) {
   }

   @Override
   public boolean fD() {
      return false;
   }

   @Override
   public void a(aja<?> $$0) {
      if (bF.equals($$0)) {
         this.j_();
         this.I = !this.z();
      }

      super.a($$0);
   }

   @Override
   public boolean fE() {
      return false;
   }

   @Override
   public bqd e(bre $$0) {
      return this.v(this.z());
   }

   private bqd v(boolean $$0) {
      if ($$0) {
         return bU;
      } else {
         return this.p_() ? bV : this.ai().n();
      }
   }

   @Override
   public esj k(float $$0) {
      if (this.z()) {
         ese $$1 = this.v(false).a(this.dk());
         id $$2 = this.dm();
         int $$3 = Integer.MIN_VALUE;

         for (id $$4 : id.a(id.a($$1.a, $$1.b, $$1.c), id.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dM().a(czp.b, $$4), this.dM().a(czp.a, $$4));
            if ($$5 == 15) {
               return esj.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return esj.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public crs dz() {
      return new crs(crv.uD);
   }

   @Override
   public boolean er() {
      return !this.ce() && !this.z();
   }
}
