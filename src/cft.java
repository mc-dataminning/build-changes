import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cft extends bqo {
   public static final int b = 5;
   private static final boolean bN = true;
   private static final jd bO = new jd(0.0F, 0.0F, 0.0F);
   private static final jd bP = new jd(0.0F, 0.0F, 0.0F);
   private static final jd bQ = new jd(-10.0F, 0.0F, -10.0F);
   private static final jd bR = new jd(-15.0F, 0.0F, 10.0F);
   private static final jd bS = new jd(-1.0F, 0.0F, -1.0F);
   private static final jd bT = new jd(1.0F, 0.0F, 1.0F);
   private static final bpy bU = bpy.c(0.0F, 0.0F);
   private static final bpy bV = bqb.d.n().a(0.5F).b(0.9875F);
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
   public static final aiy<Byte> bF = ajc.a(cft.class, aja.a);
   public static final aiy<jd> bG = ajc.a(cft.class, aja.m);
   public static final aiy<jd> bH = ajc.a(cft.class, aja.m);
   public static final aiy<jd> bI = ajc.a(cft.class, aja.m);
   public static final aiy<jd> bJ = ajc.a(cft.class, aja.m);
   public static final aiy<jd> bK = ajc.a(cft.class, aja.m);
   public static final aiy<jd> bL = ajc.a(cft.class, aja.m);
   private static final Predicate<bpv> ca = $$0 -> $$0 instanceof clo && ((clo)$$0).v() == clo.a.a;
   private final iu<crj> cb = iu.a(2, crj.i);
   private final iu<crj> cc = iu.a(4, crj.i);
   private boolean cd;
   public long bM;
   private int ce;
   private jd cf = bO;
   private jd cg = bP;
   private jd ch = bQ;
   private jd ci = bR;
   private jd cj = bS;
   private jd ck = bT;

   public cft(bqb<? extends cft> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public cft(cyx $$0, double $$1, double $$2, double $$3) {
      this(bqb.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bru.a r() {
      return dR().a(brv.v, 0.0);
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
   protected void a(ajc.a $$0) {
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
   public Iterable<crj> eX() {
      return this.cb;
   }

   @Override
   public Iterable<crj> eW() {
      return this.cc;
   }

   @Override
   public crj d(bqc $$0) {
      switch ($$0.a()) {
         case a:
            return this.cb.get($$0.b());
         case b:
            return this.cc.get($$0.b());
         default:
            return crj.i;
      }
   }

   @Override
   public boolean c(bqc $$0) {
      return $$0 != bqc.g;
   }

   @Override
   public void a(bqc $$0, crj $$1) {
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
   public boolean f(crj $$0) {
      bqc $$1 = bqq.h($$0);
      return this.d($$1).d() && !this.f($$1);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      ts $$1 = new ts();

      for (crj $$2 : this.cc) {
         $$1.add($$2.b(this.dO()));
      }

      $$0.a("ArmorItems", $$1);
      ts $$3 = new ts();

      for (crj $$4 : this.cb) {
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
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         ts $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            tm $$3 = $$1.a($$2);
            this.cc.set($$2, crj.a(this.dO(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ts $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.cb.size(); $$5++) {
            tm $$6 = $$4.a($$5);
            this.cb.set($$5, crj.a(this.dO(), $$6));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.ce = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.H();
      tm $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(tm $$0) {
      ts $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bO : new jd($$1));
      ts $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bP : new jd($$2));
      ts $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bQ : new jd($$3));
      ts $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bR : new jd($$4));
      ts $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bS : new jd($$5));
      ts $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bT : new jd($$6));
   }

   private tm I() {
      tm $$0 = new tm();
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
   protected void D(bpv $$0) {
   }

   @Override
   protected void q() {
      for (bpv $$1 : this.dM().a(this, this.cH(), ca)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public boa a(cjt $$0, esa $$1, bnz $$2) {
      crj $$3 = $$0.b($$2);
      if (this.z() || $$3.a(crm.uJ)) {
         return boa.d;
      } else if ($$0.N_()) {
         return boa.a;
      } else if ($$0.dM().B) {
         return boa.b;
      } else {
         bqc $$4 = bqq.h($$3);
         if ($$3.d()) {
            bqc $$5 = this.j($$1);
            bqc $$6 = this.f($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return boa.a;
            }
         } else {
            if (this.f($$4)) {
               return boa.e;
            }

            if ($$4.a() == bqc.a.a && !this.v()) {
               return boa.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return boa.a;
            }
         }

         return boa.d;
      }
   }

   private bqc j(esa $$0) {
      bqc $$1 = bqc.a;
      boolean $$2 = this.u();
      double $$3 = $$0.d / (double)(this.eb() * this.ea());
      bqc $$4 = bqc.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bqc.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bqc.e)) {
         $$1 = bqc.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bqc.d)) {
         $$1 = bqc.d;
      } else if ($$3 >= 1.6 && this.b(bqc.f)) {
         $$1 = bqc.f;
      } else if (!this.b(bqc.a) && this.b(bqc.b)) {
         $$1 = bqc.b;
      }

      return $$1;
   }

   private boolean f(bqc $$0) {
      return (this.ce & 1 << $$0.d()) != 0 || $$0.a() == bqc.a.a && !this.v();
   }

   private boolean a(cjt $$0, bqc $$1, crj $$2, bnz $$3) {
      crj $$4 = this.d($$1);
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
   public boolean a(bot $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return false;
      } else if ($$0.a(ave.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.cd || this.z()) {
         return false;
      } else if ($$0.a(ave.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(ave.v)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(ave.w) && this.ex() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(ave.C);
         boolean $$3 = $$0.a(ave.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cjt $$4 && !$$4.ga().e) {
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
                  this.a(dts.o, $$0.d());
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
            this.dM().a(this.dr(), this.dt(), this.dx(), aum.aC, this.db(), 0.3F, 1.0F, false);
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
      if (this.dM() instanceof aps) {
         ((aps)this.dM())
            .a(
               new kd(kl.c, dca.n.n()),
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

   private void g(bot $$0, float $$1) {
      float $$2 = this.ex();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.t($$2);
         this.a(dts.o, $$0.d());
      }
   }

   private void h(bot $$0) {
      crj $$1 = new crj(crm.uD);
      $$1.b(jp.d, this.af());
      dby.a(this.dM(), this.dm(), $$1);
      this.i($$0);
   }

   private void i(bot $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cb.size(); $$1++) {
         crj $$2 = this.cb.get($$1);
         if (!$$2.d()) {
            dby.a(this.dM(), this.dm().c(), $$2);
            this.cb.set($$1, crj.i);
         }
      }

      for (int $$3 = 0; $$3 < this.cc.size(); $$3++) {
         crj $$4 = this.cc.get($$3);
         if (!$$4.d()) {
            dby.a(this.dM(), this.dm().c(), $$4);
            this.cc.set($$3, crj.i);
         }
      }
   }

   private void M() {
      this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.aA, this.db(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aY = this.N;
      this.aX = this.dC();
      return 0.0F;
   }

   @Override
   public void a(esa $$0) {
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
      jd $$0 = this.an.a(bG);
      if (!this.cf.equals($$0)) {
         this.a($$0);
      }

      jd $$1 = this.an.a(bH);
      if (!this.cg.equals($$1)) {
         this.b($$1);
      }

      jd $$2 = this.an.a(bI);
      if (!this.ch.equals($$2)) {
         this.c($$2);
      }

      jd $$3 = this.an.a(bJ);
      if (!this.ci.equals($$3)) {
         this.d($$3);
      }

      jd $$4 = this.an.a(bK);
      if (!this.cj.equals($$4)) {
         this.e($$4);
      }

      jd $$5 = this.an.a(bL);
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
      this.a(bpv.c.a);
      this.a(dts.p);
   }

   @Override
   public boolean a(cyp $$0) {
      return this.ce();
   }

   @Override
   public ekx k_() {
      return this.z() ? ekx.d : super.k_();
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

   public void a(jd $$0) {
      this.cf = $$0;
      this.an.a(bG, $$0);
   }

   public void b(jd $$0) {
      this.cg = $$0;
      this.an.a(bH, $$0);
   }

   public void c(jd $$0) {
      this.ch = $$0;
      this.an.a(bI, $$0);
   }

   public void d(jd $$0) {
      this.ci = $$0;
      this.an.a(bJ, $$0);
   }

   public void e(jd $$0) {
      this.cj = $$0;
      this.an.a(bK, $$0);
   }

   public void f(jd $$0) {
      this.ck = $$0;
      this.an.a(bL, $$0);
   }

   public jd A() {
      return this.cf;
   }

   public jd B() {
      return this.cg;
   }

   public jd C() {
      return this.ch;
   }

   public jd D() {
      return this.ci;
   }

   public jd E() {
      return this.cj;
   }

   public jd G() {
      return this.ck;
   }

   @Override
   public boolean bw() {
      return super.bw() && !this.z();
   }

   @Override
   public boolean u(bpv $$0) {
      return $$0 instanceof cjt && !this.dM().a((cjt)$$0, this.dm());
   }

   @Override
   public bqi fr() {
      return bqi.b;
   }

   @Override
   public bqo.a eI() {
      return new bqo.a(aum.aB, aum.aB);
   }

   @Nullable
   @Override
   protected aul d(bot $$0) {
      return aum.aC;
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.aA;
   }

   @Override
   public void a(aps $$0, bqn $$1) {
   }

   @Override
   public boolean fD() {
      return false;
   }

   @Override
   public void a(aiy<?> $$0) {
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
   public bpy e(bqz $$0) {
      return this.v(this.z());
   }

   private bpy v(boolean $$0) {
      if ($$0) {
         return bU;
      } else {
         return this.p_() ? bV : this.ai().n();
      }
   }

   @Override
   public esa k(float $$0) {
      if (this.z()) {
         erv $$1 = this.v(false).a(this.dk());
         ib $$2 = this.dm();
         int $$3 = Integer.MIN_VALUE;

         for (ib $$4 : ib.a(ib.a($$1.a, $$1.b, $$1.c), ib.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dM().a(czg.b, $$4), this.dM().a(czg.a, $$4));
            if ($$5 == 15) {
               return esa.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return esa.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public crj dz() {
      return new crj(crm.uD);
   }

   @Override
   public boolean er() {
      return !this.ce() && !this.z();
   }
}
