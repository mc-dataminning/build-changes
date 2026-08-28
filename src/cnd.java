import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnd extends bxj {
   public static final int a = 5;
   private static final boolean bE = true;
   public static final jx b = new jx(0.0F, 0.0F, 0.0F);
   public static final jx c = new jx(0.0F, 0.0F, 0.0F);
   public static final jx d = new jx(-10.0F, 0.0F, -10.0F);
   public static final jx e = new jx(-15.0F, 0.0F, 10.0F);
   public static final jx f = new jx(-1.0F, 0.0F, -1.0F);
   public static final jx g = new jx(1.0F, 0.0F, 1.0F);
   private static final bwl bF = bwl.c(0.0F, 0.0F);
   private static final bwl bG = bwr.f.n().a(0.5F).b(0.9875F);
   private static final double bH = 0.1;
   private static final double bI = 0.9;
   private static final double bJ = 0.4;
   private static final double bK = 1.6;
   public static final int h = 8;
   public static final int i = 16;
   public static final int j = 1;
   public static final int k = 4;
   public static final int bu = 8;
   public static final int bv = 16;
   public static final akj<Byte> bw = akn.a(cnd.class, akl.a);
   public static final akj<jx> bx = akn.a(cnd.class, akl.n);
   public static final akj<jx> by = akn.a(cnd.class, akl.n);
   public static final akj<jx> bz = akn.a(cnd.class, akl.n);
   public static final akj<jx> bA = akn.a(cnd.class, akl.n);
   public static final akj<jx> bB = akn.a(cnd.class, akl.n);
   public static final akj<jx> bC = akn.a(cnd.class, akl.n);
   private static final Predicate<bwi> bL = $$0 -> {
      if ($$0 instanceof ctw $$1 && $$1.y()) {
         return true;
      }

      return false;
   };
   private boolean bM;
   public long bD;
   private int bN;
   private jx bO = b;
   private jx bP = c;
   private jx bQ = d;
   private jx bR = e;
   private jx bS = f;
   private jx bT = g;

   public cnd(bwr<? extends cnd> $$0, djh $$1) {
      super($$0, $$1);
   }

   public cnd(djh $$0, double $$1, double $$2, double $$3) {
      this(bwr.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static byo.a j() {
      return ed().a(byp.B, 0.0);
   }

   @Override
   public void i_() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   private boolean C() {
      return !this.t() && !this.ba();
   }

   @Override
   public boolean di() {
      return super.di() && this.C();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bw, (byte)0);
      $$0.a(bx, b);
      $$0.a(by, c);
      $$0.a(bz, d);
      $$0.a(bA, e);
      $$0.a(bB, f);
      $$0.a(bC, g);
   }

   @Override
   public boolean e(bws $$0) {
      return $$0 != bws.g && $$0 != bws.h && !this.g($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Invisible", this.cn());
      $$0.a("Small", this.m());
      $$0.a("ShowArms", this.n());
      $$0.a("DisabledSlots", this.bN);
      $$0.a("NoBasePlate", !this.q());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", this.D());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.k($$0.o("Invisible"));
      this.t($$0.o("Small"));
      this.a($$0.o("ShowArms"));
      this.bN = $$0.f("DisabledSlots");
      this.b($$0.o("NoBasePlate"));
      this.u($$0.o("Marker"));
      this.ad = !this.C();
      tz $$1 = $$0.n("Pose");
      this.c($$1);
   }

   private void c(tz $$0) {
      this.a($$0.<jx>a("Head", jx.a).orElse(b));
      this.b($$0.<jx>a("Body", jx.a).orElse(c));
      this.c($$0.<jx>a("LeftArm", jx.a).orElse(d));
      this.d($$0.<jx>a("RightArm", jx.a).orElse(e));
      this.e($$0.<jx>a("LeftLeg", jx.a).orElse(f));
      this.f($$0.<jx>a("RightLeg", jx.a).orElse(g));
   }

   private tz D() {
      tz $$0 = new tz();
      if (!b.equals(this.bO)) {
         $$0.a("Head", jx.a, this.bO);
      }

      if (!c.equals(this.bP)) {
         $$0.a("Body", jx.a, this.bP);
      }

      if (!d.equals(this.bQ)) {
         $$0.a("LeftArm", jx.a, this.bQ);
      }

      if (!e.equals(this.bR)) {
         $$0.a("RightArm", jx.a, this.bR);
      }

      if (!f.equals(this.bS)) {
         $$0.a("LeftLeg", jx.a, this.bS);
      }

      if (!g.equals(this.bT)) {
         $$0.a("RightLeg", jx.a, this.bT);
      }

      return $$0;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   protected void D(bwi $$0) {
   }

   @Override
   protected void o() {
      for (bwi $$1 : this.dU().a(this, this.cQ(), bL)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bug a(crj $$0, fex $$1, buf $$2) {
      czk $$3 = $$0.b($$2);
      if (this.t() || $$3.a(czo.vW)) {
         return bug.e;
      } else if ($$0.V_()) {
         return bug.a;
      } else if ($$0.dU().C) {
         return bug.b;
      } else {
         bws $$4 = this.f($$3);
         if ($$3.f()) {
            bws $$5 = this.l($$1);
            bws $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bug.b;
            }
         } else {
            if (this.g($$4)) {
               return bug.d;
            }

            if ($$4.a() == bws.a.a && !this.n()) {
               return bug.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bug.b;
            }
         }

         return bug.e;
      }
   }

   private bws l(fex $$0) {
      bws $$1 = bws.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (double)(this.ek() * this.ej());
      bws $$4 = bws.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bws.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bws.e)) {
         $$1 = bws.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bws.d)) {
         $$1 = bws.d;
      } else if ($$3 >= 1.6 && this.d(bws.f)) {
         $$1 = bws.f;
      } else if (!this.d(bws.a) && this.d(bws.b)) {
         $$1 = bws.b;
      }

      return $$1;
   }

   private boolean g(bws $$0) {
      return (this.bN & 1 << $$0.b(0)) != 0 || $$0.a() == bws.a.a && !this.n();
   }

   private boolean a(crj $$0, bws $$1, czk $$2, buf $$3) {
      czk $$4 = this.a($$1);
      if (!$$4.f() && (this.bN & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.bN & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.fU() && $$4.f() && !$$2.f()) {
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
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.dP()) {
         return false;
      } else if (!$$0.O().c(djd.d) && $$1.d() instanceof bxl) {
         return false;
      } else if ($$1.a(axd.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.bM || this.t()) {
         return false;
      } else if ($$1.a(axd.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(axd.u)) {
         if (this.bW()) {
            this.d($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(axd.v) && this.eF() > 0.5F) {
         this.d($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axd.B);
         boolean $$4 = $$1.a(axd.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof crj $$5 && !$$5.gj().e) {
               return false;
            }

            if ($$1.h()) {
               this.F();
               this.E();
               this.c($$0);
               return true;
            } else {
               long $$6 = $$0.ae();
               if ($$6 - this.bD > 5L && !$$4) {
                  $$0.a(this, (byte)32);
                  this.a(efo.o, $$1.d());
                  this.bD = $$6;
               } else {
                  this.c($$0, $$1);
                  this.E();
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
         if (this.dU().C) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.aC, this.dl(), 0.3F, 1.0F, false);
            this.bD = this.dU().ae();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cQ().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void E() {
      if (this.dU() instanceof arq) {
         ((arq)this.dU())
            .a(
               new lq(ly.b, dmo.n.m()),
               this.dz(),
               this.e(0.6666666666666666),
               this.dF(),
               10,
               (double)(this.dp() / 4.0F),
               (double)(this.dq() / 4.0F),
               (double)(this.dp() / 4.0F),
               0.05
            );
      }
   }

   private void d(arq $$0, bux $$1, float $$2) {
      float $$3 = this.eF();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(efo.o, $$1.d());
      }
   }

   private void c(arq $$0, bux $$1) {
      czk $$2 = new czk(czo.vQ);
      $$2.b(kk.g, this.ak());
      dmm.a(this.dU(), this.du(), $$2);
      this.d($$0, $$1);
   }

   private void d(arq $$0, bux $$1) {
      this.F();
      this.b($$0, $$1);

      for (bws $$2 : bws.j) {
         czk $$3 = this.bt.a($$2, czk.k);
         if (!$$3.f()) {
            dmm.a(this.dU(), this.du().d(), $$3);
         }
      }
   }

   private void F() {
      this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.aA, this.dl(), 1.0F, 1.0F);
   }

   @Override
   protected void C(float $$0) {
      this.aW = this.N;
      this.aV = this.dK();
   }

   @Override
   public void a_(fex $$0) {
      if (this.C()) {
         super.a_($$0);
      }
   }

   @Override
   public void s(float $$0) {
      this.aW = this.N = $$0;
      this.aY = this.aX = $$0;
   }

   @Override
   public void r(float $$0) {
      this.aW = this.N = $$0;
      this.aY = this.aX = $$0;
   }

   @Override
   public void h() {
      super.h();
      jx $$0 = this.al.a(bx);
      if (!this.bO.equals($$0)) {
         this.a($$0);
      }

      jx $$1 = this.al.a(by);
      if (!this.bP.equals($$1)) {
         this.b($$1);
      }

      jx $$2 = this.al.a(bz);
      if (!this.bQ.equals($$2)) {
         this.c($$2);
      }

      jx $$3 = this.al.a(bA);
      if (!this.bR.equals($$3)) {
         this.d($$3);
      }

      jx $$4 = this.al.a(bB);
      if (!this.bS.equals($$4)) {
         this.e($$4);
      }

      jx $$5 = this.al.a(bC);
      if (!this.bT.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void K() {
      this.k(this.bM);
   }

   @Override
   public void k(boolean $$0) {
      this.bM = $$0;
      super.k($$0);
   }

   @Override
   public boolean n_() {
      return this.m();
   }

   @Override
   public void c(arq $$0) {
      this.a(bwi.d.a);
      this.a(efo.p);
   }

   @Override
   public boolean a(dja $$0) {
      return $$0.h() ? this.cn() : true;
   }

   @Override
   public exa j_() {
      return this.t() ? exa.d : super.j_();
   }

   @Override
   public boolean g_() {
      return this.t();
   }

   private void t(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 1, $$0));
   }

   public boolean m() {
      return (this.al.a(bw) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 4, $$0));
   }

   public boolean n() {
      return (this.al.a(bw) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 8, $$0));
   }

   public boolean q() {
      return (this.al.a(bw) & 8) == 0;
   }

   private void u(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 16, $$0));
   }

   public boolean t() {
      return (this.al.a(bw) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(jx $$0) {
      this.bO = $$0;
      this.al.a(bx, $$0);
   }

   public void b(jx $$0) {
      this.bP = $$0;
      this.al.a(by, $$0);
   }

   public void c(jx $$0) {
      this.bQ = $$0;
      this.al.a(bz, $$0);
   }

   public void d(jx $$0) {
      this.bR = $$0;
      this.al.a(bA, $$0);
   }

   public void e(jx $$0) {
      this.bS = $$0;
      this.al.a(bB, $$0);
   }

   public void f(jx $$0) {
      this.bT = $$0;
      this.al.a(bC, $$0);
   }

   public jx u() {
      return this.bO;
   }

   public jx x() {
      return this.bP;
   }

   public jx y() {
      return this.bQ;
   }

   public jx z() {
      return this.bR;
   }

   public jx A() {
      return this.bS;
   }

   public jx B() {
      return this.bT;
   }

   @Override
   public boolean bE() {
      return super.bE() && !this.t();
   }

   @Override
   public boolean v(bwi $$0) {
      if ($$0 instanceof crj $$1 && !this.dU().a($$1, this.du())) {
         return true;
      }

      return false;
   }

   @Override
   public bxa fx() {
      return bxa.b;
   }

   @Override
   public bxj.a eN() {
      return new bxj.a(awn.aB, awn.aB);
   }

   @Nullable
   @Override
   protected awm e(bux $$0) {
      return awn.aC;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.aA;
   }

   @Override
   public void a(arq $$0, bxi $$1) {
   }

   @Override
   public boolean fK() {
      return false;
   }

   @Override
   public void a(akj<?> $$0) {
      if (bw.equals($$0)) {
         this.i_();
         this.I = !this.t();
      }

      super.a($$0);
   }

   @Override
   public boolean fL() {
      return false;
   }

   @Override
   public bwl e(bxv $$0) {
      return this.v(this.t());
   }

   private bwl v(boolean $$0) {
      if ($$0) {
         return bF;
      } else {
         return this.n_() ? bG : this.an().n();
      }
   }

   @Override
   public fex o(float $$0) {
      if (this.t()) {
         fes $$1 = this.v(false).a(this.ds());
         iv $$2 = this.du();
         int $$3 = Integer.MIN_VALUE;

         for (iv $$4 : iv.c(iv.a($$1.a, $$1.b, $$1.c), iv.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dU().a(djq.b, $$4), this.dU().a(djq.a, $$4));
            if ($$5 == 15) {
               return fex.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fex.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public czk dH() {
      return new czk(czo.vQ);
   }

   @Override
   public boolean ez() {
      return !this.cn() && !this.t();
   }
}
