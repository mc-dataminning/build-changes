import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceu extends bpp {
   public static final int b = 5;
   private static final boolean bN = true;
   private static final jd bO = new jd(0.0F, 0.0F, 0.0F);
   private static final jd bP = new jd(0.0F, 0.0F, 0.0F);
   private static final jd bQ = new jd(-10.0F, 0.0F, -10.0F);
   private static final jd bR = new jd(-15.0F, 0.0F, 10.0F);
   private static final jd bS = new jd(-1.0F, 0.0F, -1.0F);
   private static final jd bT = new jd(1.0F, 0.0F, 1.0F);
   private static final bpa bU = bpa.c(0.0F, 0.0F);
   private static final bpa bV = bpd.e.n().a(0.5F).b(0.9875F);
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
   public static final aim<Byte> bF = aiq.a(ceu.class, aio.a);
   public static final aim<jd> bG = aiq.a(ceu.class, aio.m);
   public static final aim<jd> bH = aiq.a(ceu.class, aio.m);
   public static final aim<jd> bI = aiq.a(ceu.class, aio.m);
   public static final aim<jd> bJ = aiq.a(ceu.class, aio.m);
   public static final aim<jd> bK = aiq.a(ceu.class, aio.m);
   public static final aim<jd> bL = aiq.a(ceu.class, aio.m);
   private static final Predicate<box> ca = $$0 -> $$0 instanceof ckp && ((ckp)$$0).v() == ckp.a.a;
   private final iu<cqm> cb = iu.a(2, cqm.h);
   private final iu<cqm> cc = iu.a(4, cqm.h);
   private boolean cd;
   public long bM;
   private int ce;
   private jd cf = bO;
   private jd cg = bP;
   private jd ch = bQ;
   private jd ci = bR;
   private jd cj = bS;
   private jd ck = bT;

   public ceu(bpd<? extends ceu> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public ceu(cxb $$0, double $$1, double $$2, double $$3) {
      this(bpd.e, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bqv.a r() {
      return dR().a(bqw.v, 0.0);
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
   public Iterable<cqm> eX() {
      return this.cb;
   }

   @Override
   public Iterable<cqm> eW() {
      return this.cc;
   }

   @Override
   public cqm d(bpe $$0) {
      switch ($$0.a()) {
         case a:
            return this.cb.get($$0.b());
         case b:
            return this.cc.get($$0.b());
         default:
            return cqm.h;
      }
   }

   @Override
   public boolean c(bpe $$0) {
      return $$0 != bpe.g;
   }

   @Override
   public void a(bpe $$0, cqm $$1) {
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
   public boolean f(cqm $$0) {
      bpe $$1 = bpr.h($$0);
      return this.d($$1).b() && !this.f($$1);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      tg $$1 = new tg();

      for (cqm $$2 : this.cc) {
         ta $$3 = new ta();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      tg $$4 = new tg();

      for (cqm $$5 : this.cb) {
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
            this.cc.set($$2, cqm.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tg $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.cb.size(); $$4++) {
            this.cb.set($$4, cqm.a($$3.a($$4)));
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
   protected void D(box $$0) {
   }

   @Override
   protected void q() {
      for (box $$1 : this.dM().a(this, this.cH(), ca)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bnd a(ciu $$0, ept $$1, bnc $$2) {
      cqm $$3 = $$0.b($$2);
      if (this.z() || $$3.a(cqp.uJ)) {
         return bnd.d;
      } else if ($$0.N_()) {
         return bnd.a;
      } else if ($$0.dM().B) {
         return bnd.b;
      } else {
         bpe $$4 = bpr.h($$3);
         if ($$3.b()) {
            bpe $$5 = this.j($$1);
            bpe $$6 = this.f($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bnd.a;
            }
         } else {
            if (this.f($$4)) {
               return bnd.e;
            }

            if ($$4.a() == bpe.a.a && !this.v()) {
               return bnd.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bnd.a;
            }
         }

         return bnd.d;
      }
   }

   private bpe j(ept $$0) {
      bpe $$1 = bpe.a;
      boolean $$2 = this.s();
      double $$3 = $$0.d / (double)(this.eb() * this.ea());
      bpe $$4 = bpe.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bpe.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bpe.e)) {
         $$1 = bpe.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bpe.d)) {
         $$1 = bpe.d;
      } else if ($$3 >= 1.6 && this.b(bpe.f)) {
         $$1 = bpe.f;
      } else if (!this.b(bpe.a) && this.b(bpe.b)) {
         $$1 = bpe.b;
      }

      return $$1;
   }

   private boolean f(bpe $$0) {
      return (this.ce & 1 << $$0.d()) != 0 || $$0.a() == bpe.a.a && !this.v();
   }

   private boolean a(ciu $$0, bpe $$1, cqm $$2, bnc $$3) {
      cqm $$4 = this.d($$1);
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
   public boolean a(bnw $$0, float $$1) {
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
            if ($$0.d() instanceof ciu $$4 && !$$4.ga().e) {
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
                  this.a(drp.o, $$0.d());
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
               new ju(kc.c, dae.n.o()),
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

   private void g(bnw $$0, float $$1) {
      float $$2 = this.ex();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.t($$2);
         this.a(drp.o, $$0.d());
      }
   }

   private void h(bnw $$0) {
      cqm $$1 = new cqm(cqp.uD);
      if (this.ae()) {
         $$1.a(this.af());
      }

      dac.a(this.dM(), this.dm(), $$1);
      this.i($$0);
   }

   private void i(bnw $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cb.size(); $$1++) {
         cqm $$2 = this.cb.get($$1);
         if (!$$2.b()) {
            dac.a(this.dM(), this.dm().c(), $$2);
            this.cb.set($$1, cqm.h);
         }
      }

      for (int $$3 = 0; $$3 < this.cc.size(); $$3++) {
         cqm $$4 = this.cc.get($$3);
         if (!$$4.b()) {
            dac.a(this.dM(), this.dm().c(), $$4);
            this.cc.set($$3, cqm.h);
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
   public void a(ept $$0) {
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
      this.a(box.c.a);
      this.b(drp.p);
   }

   @Override
   public boolean a(cwt $$0) {
      return this.ce();
   }

   @Override
   public eiu r_() {
      return this.z() ? eiu.d : super.r_();
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
   public boolean u(box $$0) {
      return $$0 instanceof ciu && !this.dM().a((ciu)$$0, this.dm());
   }

   @Override
   public bpj fr() {
      return bpj.b;
   }

   @Override
   public bpp.a eI() {
      return new bpp.a(aty.aB, aty.aB);
   }

   @Nullable
   @Override
   protected atx d(bnw $$0) {
      return aty.aC;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.aA;
   }

   @Override
   public void a(apf $$0, bpo $$1) {
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
   public bpa e(bqa $$0) {
      return this.v(this.z());
   }

   private bpa v(boolean $$0) {
      if ($$0) {
         return bU;
      } else {
         return this.o_() ? bV : this.ai().n();
      }
   }

   @Override
   public ept k(float $$0) {
      if (this.z()) {
         epo $$1 = this.v(false).a(this.dk());
         ib $$2 = this.dm();
         int $$3 = Integer.MIN_VALUE;

         for (ib $$4 : ib.a(ib.a($$1.a, $$1.b, $$1.c), ib.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dM().a(cxk.b, $$4), this.dM().a(cxk.a, $$4));
            if ($$5 == 15) {
               return ept.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ept.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cqm dz() {
      return new cqm(cqp.uD);
   }

   @Override
   public boolean er() {
      return !this.ce() && !this.z();
   }
}
