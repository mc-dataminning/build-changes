import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmw extends bxe {
   public static final int a = 5;
   private static final boolean bE = true;
   public static final jw b = new jw(0.0F, 0.0F, 0.0F);
   public static final jw c = new jw(0.0F, 0.0F, 0.0F);
   public static final jw d = new jw(-10.0F, 0.0F, -10.0F);
   public static final jw e = new jw(-15.0F, 0.0F, 10.0F);
   public static final jw f = new jw(-1.0F, 0.0F, -1.0F);
   public static final jw g = new jw(1.0F, 0.0F, 1.0F);
   private static final bwi bF = bwi.c(0.0F, 0.0F);
   private static final bwi bG = bwo.f.n().a(0.5F).b(0.9875F);
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
   public static final akj<Byte> bw = akn.a(cmw.class, akl.a);
   public static final akj<jw> bx = akn.a(cmw.class, akl.n);
   public static final akj<jw> by = akn.a(cmw.class, akl.n);
   public static final akj<jw> bz = akn.a(cmw.class, akl.n);
   public static final akj<jw> bA = akn.a(cmw.class, akl.n);
   public static final akj<jw> bB = akn.a(cmw.class, akl.n);
   public static final akj<jw> bC = akn.a(cmw.class, akl.n);
   private static final Predicate<bwf> bL = $$0 -> {
      if ($$0 instanceof ctp $$1 && $$1.z()) {
         return true;
      }

      return false;
   };
   private boolean bM;
   public long bD;
   private int bN;
   private jw bO = b;
   private jw bP = c;
   private jw bQ = d;
   private jw bR = e;
   private jw bS = f;
   private jw bT = g;

   public cmw(bwo<? extends cmw> $$0, dja $$1) {
      super($$0, $$1);
   }

   public cmw(dja $$0, double $$1, double $$2, double $$3) {
      this(bwo.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static byj.a j() {
      return ee().a(byk.B, 0.0);
   }

   @Override
   public void i_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   private boolean C() {
      return !this.t() && !this.bc();
   }

   @Override
   public boolean dj() {
      return super.dj() && this.C();
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
   public boolean e(bwp $$0) {
      return $$0 != bwp.g && $$0 != bwp.h && !this.g($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Invisible", this.cp());
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
      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.bN = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ad = !this.C();
      tz $$1 = $$0.p("Pose");
      this.c($$1);
   }

   private void c(tz $$0) {
      uf $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? b : new jw($$1));
      uf $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? c : new jw($$2));
      uf $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? d : new jw($$3));
      uf $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? e : new jw($$4));
      uf $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? f : new jw($$5));
      uf $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? g : new jw($$6));
   }

   private tz D() {
      tz $$0 = new tz();
      if (!b.equals(this.bO)) {
         $$0.a("Head", this.bO.a());
      }

      if (!c.equals(this.bP)) {
         $$0.a("Body", this.bP.a());
      }

      if (!d.equals(this.bQ)) {
         $$0.a("LeftArm", this.bQ.a());
      }

      if (!e.equals(this.bR)) {
         $$0.a("RightArm", this.bR.a());
      }

      if (!f.equals(this.bS)) {
         $$0.a("LeftLeg", this.bS.a());
      }

      if (!g.equals(this.bT)) {
         $$0.a("RightLeg", this.bT.a());
      }

      return $$0;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   protected void D(bwf $$0) {
   }

   @Override
   protected void o() {
      for (bwf $$1 : this.dV().a(this, this.cR(), bL)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bud a(crc $$0, feq $$1, buc $$2) {
      czd $$3 = $$0.b($$2);
      if (this.t() || $$3.a(czh.vW)) {
         return bud.e;
      } else if ($$0.V_()) {
         return bud.a;
      } else if ($$0.dV().C) {
         return bud.b;
      } else {
         bwp $$4 = this.f($$3);
         if ($$3.f()) {
            bwp $$5 = this.l($$1);
            bwp $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bud.b;
            }
         } else {
            if (this.g($$4)) {
               return bud.d;
            }

            if ($$4.a() == bwp.a.a && !this.n()) {
               return bud.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bud.b;
            }
         }

         return bud.e;
      }
   }

   private bwp l(feq $$0) {
      bwp $$1 = bwp.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (double)(this.el() * this.ek());
      bwp $$4 = bwp.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bwp.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bwp.e)) {
         $$1 = bwp.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bwp.d)) {
         $$1 = bwp.d;
      } else if ($$3 >= 1.6 && this.d(bwp.f)) {
         $$1 = bwp.f;
      } else if (!this.d(bwp.a) && this.d(bwp.b)) {
         $$1 = bwp.b;
      }

      return $$1;
   }

   private boolean g(bwp $$0) {
      return (this.bN & 1 << $$0.b(0)) != 0 || $$0.a() == bwp.a.a && !this.n();
   }

   private boolean a(crc $$0, bwp $$1, czd $$2, buc $$3) {
      czd $$4 = this.a($$1);
      if (!$$4.f() && (this.bN & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.bN & 1 << $$1.b(16)) != 0) {
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
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.dQ()) {
         return false;
      } else if (!$$0.O().c(diw.d) && $$1.d() instanceof bxg) {
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
         if (this.bY()) {
            this.d($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(axd.v) && this.eG() > 0.5F) {
         this.d($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axd.B);
         boolean $$4 = $$1.a(axd.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof crc $$5 && !$$5.gk().e) {
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
                  this.a(efh.o, $$1.d());
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
         if (this.dV().C) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.aC, this.dm(), 0.3F, 1.0F, false);
            this.bD = this.dV().ae();
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

   private void E() {
      if (this.dV() instanceof arq) {
         ((arq)this.dV())
            .a(
               new lp(lx.b, dmh.n.m()),
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

   private void d(arq $$0, buu $$1, float $$2) {
      float $$3 = this.eG();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(efh.o, $$1.d());
      }
   }

   private void c(arq $$0, buu $$1) {
      czd $$2 = new czd(czh.vQ);
      $$2.b(kj.g, this.an());
      dmf.a(this.dV(), this.dv(), $$2);
      this.d($$0, $$1);
   }

   private void d(arq $$0, buu $$1) {
      this.F();
      this.b($$0, $$1);

      for (bwp $$2 : bwp.j) {
         czd $$3 = this.bt.a($$2, czd.k);
         if (!$$3.f()) {
            dmf.a(this.dV(), this.dv().d(), $$3);
         }
      }
   }

   private void F() {
      this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.aA, this.dm(), 1.0F, 1.0F);
   }

   @Override
   protected void C(float $$0) {
      this.aW = this.N;
      this.aV = this.dL();
   }

   @Override
   public void a_(feq $$0) {
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
      jw $$0 = this.al.a(bx);
      if (!this.bO.equals($$0)) {
         this.a($$0);
      }

      jw $$1 = this.al.a(by);
      if (!this.bP.equals($$1)) {
         this.b($$1);
      }

      jw $$2 = this.al.a(bz);
      if (!this.bQ.equals($$2)) {
         this.c($$2);
      }

      jw $$3 = this.al.a(bA);
      if (!this.bR.equals($$3)) {
         this.d($$3);
      }

      jw $$4 = this.al.a(bB);
      if (!this.bS.equals($$4)) {
         this.e($$4);
      }

      jw $$5 = this.al.a(bC);
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
      this.a(bwf.e.a);
      this.a(efh.p);
   }

   @Override
   public boolean a(dit $$0) {
      return $$0.h() ? this.cp() : true;
   }

   @Override
   public ewt j_() {
      return this.t() ? ewt.d : super.j_();
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

   public void a(jw $$0) {
      this.bO = $$0;
      this.al.a(bx, $$0);
   }

   public void b(jw $$0) {
      this.bP = $$0;
      this.al.a(by, $$0);
   }

   public void c(jw $$0) {
      this.bQ = $$0;
      this.al.a(bz, $$0);
   }

   public void d(jw $$0) {
      this.bR = $$0;
      this.al.a(bA, $$0);
   }

   public void e(jw $$0) {
      this.bS = $$0;
      this.al.a(bB, $$0);
   }

   public void f(jw $$0) {
      this.bT = $$0;
      this.al.a(bC, $$0);
   }

   public jw u() {
      return this.bO;
   }

   public jw x() {
      return this.bP;
   }

   public jw y() {
      return this.bQ;
   }

   public jw z() {
      return this.bR;
   }

   public jw A() {
      return this.bS;
   }

   public jw B() {
      return this.bT;
   }

   @Override
   public boolean bG() {
      return super.bG() && !this.t();
   }

   @Override
   public boolean v(bwf $$0) {
      if ($$0 instanceof crc $$1 && !this.dV().a($$1, this.dv())) {
         return true;
      }

      return false;
   }

   @Override
   public bwx fy() {
      return bwx.b;
   }

   @Override
   public bxe.a eO() {
      return new bxe.a(awn.aB, awn.aB);
   }

   @Nullable
   @Override
   protected awm e(buu $$0) {
      return awn.aC;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.aA;
   }

   @Override
   public void a(arq $$0, bxd $$1) {
   }

   @Override
   public boolean fL() {
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
   public boolean fM() {
      return false;
   }

   @Override
   public bwi e(bxq $$0) {
      return this.v(this.t());
   }

   private bwi v(boolean $$0) {
      if ($$0) {
         return bF;
      } else {
         return this.n_() ? bG : this.aq().n();
      }
   }

   @Override
   public feq o(float $$0) {
      if (this.t()) {
         fel $$1 = this.v(false).a(this.dt());
         iu $$2 = this.dv();
         int $$3 = Integer.MIN_VALUE;

         for (iu $$4 : iu.c(iu.a($$1.a, $$1.b, $$1.c), iu.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dV().a(djj.b, $$4), this.dV().a(djj.a, $$4));
            if ($$5 == 15) {
               return feq.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return feq.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public czd dI() {
      return new czd(czh.vQ);
   }

   @Override
   public boolean eA() {
      return !this.cp() && !this.t();
   }
}
