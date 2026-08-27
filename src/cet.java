import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cet extends bpo {
   public static final int b = 5;
   private static final boolean bN = true;
   private static final jd bO = new jd(0.0F, 0.0F, 0.0F);
   private static final jd bP = new jd(0.0F, 0.0F, 0.0F);
   private static final jd bQ = new jd(-10.0F, 0.0F, -10.0F);
   private static final jd bR = new jd(-15.0F, 0.0F, 10.0F);
   private static final jd bS = new jd(-1.0F, 0.0F, -1.0F);
   private static final jd bT = new jd(1.0F, 0.0F, 1.0F);
   private static final boz bU = boz.c(0.0F, 0.0F);
   private static final boz bV = bpc.e.n().a(0.5F).b(0.9875F);
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
   public static final aim<Byte> bF = aiq.a(cet.class, aio.a);
   public static final aim<jd> bG = aiq.a(cet.class, aio.m);
   public static final aim<jd> bH = aiq.a(cet.class, aio.m);
   public static final aim<jd> bI = aiq.a(cet.class, aio.m);
   public static final aim<jd> bJ = aiq.a(cet.class, aio.m);
   public static final aim<jd> bK = aiq.a(cet.class, aio.m);
   public static final aim<jd> bL = aiq.a(cet.class, aio.m);
   private static final Predicate<bow> ca = $$0 -> $$0 instanceof ckn && ((ckn)$$0).v() == ckn.a.a;
   private final iu<cqk> cb = iu.a(2, cqk.h);
   private final iu<cqk> cc = iu.a(4, cqk.h);
   private boolean cd;
   public long bM;
   private int ce;
   private jd cf = bO;
   private jd cg = bP;
   private jd ch = bQ;
   private jd ci = bR;
   private jd cj = bS;
   private jd ck = bT;

   public cet(bpc<? extends cet> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cet(cwz $$0, double $$1, double $$2, double $$3) {
      this(bpc.e, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bqu.a r() {
      return dR().a(bqv.v, 0.0);
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
   protected void a(aiq.a $$0) {
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
   public Iterable<cqk> eX() {
      return this.cb;
   }

   @Override
   public Iterable<cqk> eW() {
      return this.cc;
   }

   @Override
   public cqk d(bpd $$0) {
      switch ($$0.a()) {
         case a:
            return this.cb.get($$0.b());
         case b:
            return this.cc.get($$0.b());
         default:
            return cqk.h;
      }
   }

   @Override
   public boolean c(bpd $$0) {
      return $$0 != bpd.g;
   }

   @Override
   public void a(bpd $$0, cqk $$1) {
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
   public boolean f(cqk $$0) {
      bpd $$1 = bpq.h($$0);
      return this.d($$1).b() && !this.f($$1);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      tg $$1 = new tg();

      for (cqk $$2 : this.cc) {
         ta $$3 = new ta();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      tg $$4 = new tg();

      for (cqk $$5 : this.cb) {
         ta $$6 = new ta();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.ce());
      $$0.a("Small", this.s());
      $$0.a("ShowArms", this.v());
      $$0.a("DisabledSlots", this.ce);
      $$0.a("NoBasePlate", this.y());
      if (this.z()) {
         $$0.a("Marker", this.z());
      }

      $$0.a("Pose", this.I());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         tg $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cc.size(); $$2++) {
            this.cc.set($$2, cqk.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tg $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.cb.size(); $$4++) {
            this.cb.set($$4, cqk.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.ce = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.H();
      ta $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(ta $$0) {
      tg $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bO : new jd($$1));
      tg $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bP : new jd($$2));
      tg $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bQ : new jd($$3));
      tg $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bR : new jd($$4));
      tg $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bS : new jd($$5));
      tg $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bT : new jd($$6));
   }

   private ta I() {
      ta $$0 = new ta();
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
   protected void D(bow $$0) {
   }

   @Override
   protected void q() {
      for (bow $$1 : this.dM().a(this, this.cH(), ca)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bnc a(cis $$0, epr $$1, bnb $$2) {
      cqk $$3 = $$0.b($$2);
      if (this.z() || $$3.a(cqn.uI)) {
         return bnc.d;
      } else if ($$0.N_()) {
         return bnc.a;
      } else if ($$0.dM().B) {
         return bnc.b;
      } else {
         bpd $$4 = bpq.h($$3);
         if ($$3.b()) {
            bpd $$5 = this.j($$1);
            bpd $$6 = this.f($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bnc.a;
            }
         } else {
            if (this.f($$4)) {
               return bnc.e;
            }

            if ($$4.a() == bpd.a.a && !this.v()) {
               return bnc.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bnc.a;
            }
         }

         return bnc.d;
      }
   }

   private bpd j(epr $$0) {
      bpd $$1 = bpd.a;
      boolean $$2 = this.s();
      double $$3 = $$0.d / (double)(this.eb() * this.ea());
      bpd $$4 = bpd.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bpd.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bpd.e)) {
         $$1 = bpd.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bpd.d)) {
         $$1 = bpd.d;
      } else if ($$3 >= 1.6 && this.b(bpd.f)) {
         $$1 = bpd.f;
      } else if (!this.b(bpd.a) && this.b(bpd.b)) {
         $$1 = bpd.b;
      }

      return $$1;
   }

   private boolean f(bpd $$0) {
      return (this.ce & 1 << $$0.d()) != 0 || $$0.a() == bpd.a.a && !this.v();
   }

   private boolean a(cis $$0, bpd $$1, cqk $$2, bnb $$3) {
      cqk $$4 = this.d($$1);
      if (!$$4.b() && (this.ce & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.ce & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fM() && $$4.b() && !$$2.b()) {
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
   public boolean a(bnv $$0, float $$1) {
      if (this.dM().B || this.dH()) {
         return false;
      } else if ($$0.a(aup.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.cd || this.z()) {
         return false;
      } else if ($$0.a(aup.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(aup.v)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(aup.w) && this.ex() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(aup.C);
         boolean $$3 = $$0.a(aup.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cis $$4 && !$$4.ga().e) {
               return false;
            }

            if ($$0.g()) {
               this.M();
               this.K();
               this.al();
               return true;
            } else {
               long $$5 = this.dM().X();
               if ($$5 - this.bM > 5L && !$$3) {
                  this.dM().a(this, (byte)32);
                  this.a(drn.o, $$0.d());
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
            this.dM().a(this.dr(), this.dt(), this.dx(), aty.aC, this.db(), 0.3F, 1.0F, false);
            this.bM = this.dM().X();
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
      if (this.dM() instanceof apf) {
         ((apf)this.dM())
            .a(
               new ju(kc.c, dac.n.o()),
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

   private void g(bnv $$0, float $$1) {
      float $$2 = this.ex();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.t($$2);
         this.a(drn.o, $$0.d());
      }
   }

   private void h(bnv $$0) {
      cqk $$1 = new cqk(cqn.uC);
      if (this.ae()) {
         $$1.a(this.af());
      }

      daa.a(this.dM(), this.dm(), $$1);
      this.i($$0);
   }

   private void i(bnv $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cb.size(); $$1++) {
         cqk $$2 = this.cb.get($$1);
         if (!$$2.b()) {
            daa.a(this.dM(), this.dm().c(), $$2);
            this.cb.set($$1, cqk.h);
         }
      }

      for (int $$3 = 0; $$3 < this.cc.size(); $$3++) {
         cqk $$4 = this.cc.get($$3);
         if (!$$4.b()) {
            daa.a(this.dM(), this.dm().c(), $$4);
            this.cc.set($$3, cqk.h);
         }
      }
   }

   private void M() {
      this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.aA, this.db(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aY = this.N;
      this.aX = this.dC();
      return 0.0F;
   }

   @Override
   public void a(epr $$0) {
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
   public boolean o_() {
      return this.s();
   }

   @Override
   public void al() {
      this.a(bow.c.a);
      this.b(drn.p);
   }

   @Override
   public boolean a(cwr $$0) {
      return this.ce();
   }

   @Override
   public eis r_() {
      return this.z() ? eis.d : super.r_();
   }

   @Override
   public boolean q_() {
      return this.z();
   }

   private void t(boolean $$0) {
      this.an.a(bF, this.a(this.an.a(bF), 1, $$0));
   }

   public boolean s() {
      return (this.an.a(bF) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.a(bF, this.a(this.an.a(bF), 4, $$0));
   }

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
   public boolean u(bow $$0) {
      return $$0 instanceof cis && !this.dM().a((cis)$$0, this.dm());
   }

   @Override
   public bpi fr() {
      return bpi.b;
   }

   @Override
   public bpo.a eI() {
      return new bpo.a(aty.aB, aty.aB);
   }

   @Nullable
   @Override
   protected atx d(bnv $$0) {
      return aty.aC;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.aA;
   }

   @Override
   public void a(apf $$0, bpn $$1) {
   }

   @Override
   public boolean fD() {
      return false;
   }

   @Override
   public void a(aim<?> $$0) {
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
   public boz e(bpz $$0) {
      return this.v(this.z());
   }

   private boz v(boolean $$0) {
      if ($$0) {
         return bU;
      } else {
         return this.o_() ? bV : this.ai().n();
      }
   }

   @Override
   public epr k(float $$0) {
      if (this.z()) {
         epm $$1 = this.v(false).a(this.dk());
         ib $$2 = this.dm();
         int $$3 = Integer.MIN_VALUE;

         for (ib $$4 : ib.a(ib.a($$1.a, $$1.b, $$1.c), ib.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dM().a(cxi.b, $$4), this.dM().a(cxi.a, $$4));
            if ($$5 == 15) {
               return epr.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return epr.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cqk dz() {
      return new cqk(cqn.uC);
   }

   @Override
   public boolean er() {
      return !this.ce() && !this.z();
   }
}
