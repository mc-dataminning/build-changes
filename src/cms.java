import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cms extends bxc {
   public static final int a = 5;
   private static final boolean bD = true;
   public static final jw b = new jw(0.0F, 0.0F, 0.0F);
   public static final jw c = new jw(0.0F, 0.0F, 0.0F);
   public static final jw d = new jw(-10.0F, 0.0F, -10.0F);
   public static final jw e = new jw(-15.0F, 0.0F, 10.0F);
   public static final jw f = new jw(-1.0F, 0.0F, -1.0F);
   public static final jw g = new jw(1.0F, 0.0F, 1.0F);
   private static final bwg bE = bwg.c(0.0F, 0.0F);
   private static final bwg bF = bwm.f.n().a(0.5F).b(0.9875F);
   private static final double bG = 0.1;
   private static final double bH = 0.9;
   private static final double bI = 0.4;
   private static final double bJ = 1.6;
   public static final int h = 8;
   public static final int i = 16;
   public static final int j = 1;
   public static final int k = 4;
   public static final int bt = 8;
   public static final int bu = 16;
   public static final akj<Byte> bv = akn.a(cms.class, akl.a);
   public static final akj<jw> bw = akn.a(cms.class, akl.n);
   public static final akj<jw> bx = akn.a(cms.class, akl.n);
   public static final akj<jw> by = akn.a(cms.class, akl.n);
   public static final akj<jw> bz = akn.a(cms.class, akl.n);
   public static final akj<jw> bA = akn.a(cms.class, akl.n);
   public static final akj<jw> bB = akn.a(cms.class, akl.n);
   private static final Predicate<bwd> bK = $$0 -> {
      if ($$0 instanceof ctk $$1 && $$1.z()) {
         return true;
      }

      return false;
   };
   private bwh bL = new bwh();
   private boolean bM;
   public long bC;
   private int bN;
   private jw bO = b;
   private jw bP = c;
   private jw bQ = d;
   private jw bR = e;
   private jw bS = f;
   private jw bT = g;

   public cms(bwm<? extends cms> $$0, div $$1) {
      super($$0, $$1);
   }

   public cms(div $$0, double $$1, double $$2, double $$3) {
      this(bwm.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static byh.a j() {
      return ed().a(byi.B, 0.0);
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
      $$0.a(bv, (byte)0);
      $$0.a(bw, b);
      $$0.a(bx, c);
      $$0.a(by, d);
      $$0.a(bz, e);
      $$0.a(bA, f);
      $$0.a(bB, g);
   }

   @Override
   public cyy a(bwn $$0) {
      return this.bL.a($$0);
   }

   @Override
   public boolean e(bwn $$0) {
      return $$0 != bwn.g && $$0 != bwn.h && !this.g($$0);
   }

   @Override
   public void a(bwn $$0, cyy $$1) {
      this.d($$1);
      cyy $$2 = this.bL.a($$0, $$1);
      this.a($$0, $$2, $$1);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.bL.a()) {
         ale<uw> $$1 = this.dX().a(un.a);
         $$0.a("equipment", bwh.a, $$1, this.bL);
      }

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
      ale<uw> $$1 = this.dX().a(un.a);
      this.bL = $$0.<bwh>a("equipment", bwh.a, $$1).orElseGet(bwh::new);
      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.bN = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ad = !this.C();
      tz $$2 = $$0.p("Pose");
      this.c($$2);
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
   protected void D(bwd $$0) {
   }

   @Override
   protected void o() {
      for (bwd $$1 : this.dV().a(this, this.cR(), bK)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bub a(cqy $$0, fei $$1, bua $$2) {
      cyy $$3 = $$0.b($$2);
      if (this.t() || $$3.a(czc.vR)) {
         return bub.e;
      } else if ($$0.U_()) {
         return bub.a;
      } else if ($$0.dV().C) {
         return bub.b;
      } else {
         bwn $$4 = this.g($$3);
         if ($$3.f()) {
            bwn $$5 = this.l($$1);
            bwn $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bub.b;
            }
         } else {
            if (this.g($$4)) {
               return bub.d;
            }

            if ($$4.a() == bwn.a.a && !this.n()) {
               return bub.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bub.b;
            }
         }

         return bub.e;
      }
   }

   private bwn l(fei $$0) {
      bwn $$1 = bwn.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (double)(this.ek() * this.ej());
      bwn $$4 = bwn.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bwn.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bwn.e)) {
         $$1 = bwn.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bwn.d)) {
         $$1 = bwn.d;
      } else if ($$3 >= 1.6 && this.d(bwn.f)) {
         $$1 = bwn.f;
      } else if (!this.d(bwn.a) && this.d(bwn.b)) {
         $$1 = bwn.b;
      }

      return $$1;
   }

   private boolean g(bwn $$0) {
      return (this.bN & 1 << $$0.b(0)) != 0 || $$0.a() == bwn.a.a && !this.n();
   }

   private boolean a(cqy $$0, bwn $$1, cyy $$2, bua $$3) {
      cyy $$4 = this.a($$1);
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
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.dQ()) {
         return false;
      } else if (!$$0.O().c(dir.c) && $$1.d() instanceof bxe) {
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
      } else if ($$1.a(axd.v) && this.eF() > 0.5F) {
         this.d($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axd.B);
         boolean $$4 = $$1.a(axd.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof cqy $$5 && !$$5.gj().e) {
               return false;
            }

            if ($$1.h()) {
               this.F();
               this.E();
               this.c($$0);
               return true;
            } else {
               long $$6 = $$0.ae();
               if ($$6 - this.bC > 5L && !$$4) {
                  $$0.a(this, (byte)32);
                  this.a(eez.o, $$1.d());
                  this.bC = $$6;
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
            this.bC = this.dV().ae();
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
               new lp(lx.b, dmc.n.m()),
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

   private void d(arq $$0, bus $$1, float $$2) {
      float $$3 = this.eF();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(eez.o, $$1.d());
      }
   }

   private void c(arq $$0, bus $$1) {
      cyy $$2 = new cyy(czc.vL);
      $$2.b(kj.g, this.an());
      dma.a(this.dV(), this.dv(), $$2);
      this.d($$0, $$1);
   }

   private void d(arq $$0, bus $$1) {
      this.F();
      this.b($$0, $$1);

      for (bwn $$2 : bwn.j) {
         cyy $$3 = this.bL.a($$2, cyy.k);
         if (!$$3.f()) {
            dma.a(this.dV(), this.dv().d(), $$3);
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
   public void a_(fei $$0) {
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
      jw $$0 = this.al.a(bw);
      if (!this.bO.equals($$0)) {
         this.a($$0);
      }

      jw $$1 = this.al.a(bx);
      if (!this.bP.equals($$1)) {
         this.b($$1);
      }

      jw $$2 = this.al.a(by);
      if (!this.bQ.equals($$2)) {
         this.c($$2);
      }

      jw $$3 = this.al.a(bz);
      if (!this.bR.equals($$3)) {
         this.d($$3);
      }

      jw $$4 = this.al.a(bA);
      if (!this.bS.equals($$4)) {
         this.e($$4);
      }

      jw $$5 = this.al.a(bB);
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
      this.a(bwd.e.a);
      this.a(eez.p);
   }

   @Override
   public boolean a(dio $$0) {
      return $$0.h() ? this.cp() : true;
   }

   @Override
   public ewl j_() {
      return this.t() ? ewl.d : super.j_();
   }

   @Override
   public boolean g_() {
      return this.t();
   }

   private void t(boolean $$0) {
      this.al.a(bv, this.a(this.al.a(bv), 1, $$0));
   }

   public boolean m() {
      return (this.al.a(bv) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.al.a(bv, this.a(this.al.a(bv), 4, $$0));
   }

   public boolean n() {
      return (this.al.a(bv) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.al.a(bv, this.a(this.al.a(bv), 8, $$0));
   }

   public boolean q() {
      return (this.al.a(bv) & 8) == 0;
   }

   private void u(boolean $$0) {
      this.al.a(bv, this.a(this.al.a(bv), 16, $$0));
   }

   public boolean t() {
      return (this.al.a(bv) & 16) != 0;
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
      this.al.a(bw, $$0);
   }

   public void b(jw $$0) {
      this.bP = $$0;
      this.al.a(bx, $$0);
   }

   public void c(jw $$0) {
      this.bQ = $$0;
      this.al.a(by, $$0);
   }

   public void d(jw $$0) {
      this.bR = $$0;
      this.al.a(bz, $$0);
   }

   public void e(jw $$0) {
      this.bS = $$0;
      this.al.a(bA, $$0);
   }

   public void f(jw $$0) {
      this.bT = $$0;
      this.al.a(bB, $$0);
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
   public boolean v(bwd $$0) {
      if ($$0 instanceof cqy $$1 && !this.dV().a($$1, this.dv())) {
         return true;
      }

      return false;
   }

   @Override
   public bwv fx() {
      return bwv.b;
   }

   @Override
   public bxc.a eN() {
      return new bxc.a(awn.aB, awn.aB);
   }

   @Nullable
   @Override
   protected awm e(bus $$0) {
      return awn.aC;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.aA;
   }

   @Override
   public void a(arq $$0, bxb $$1) {
   }

   @Override
   public boolean fK() {
      return false;
   }

   @Override
   public void a(akj<?> $$0) {
      if (bv.equals($$0)) {
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
   public bwg e(bxo $$0) {
      return this.v(this.t());
   }

   private bwg v(boolean $$0) {
      if ($$0) {
         return bE;
      } else {
         return this.n_() ? bF : this.aq().n();
      }
   }

   @Override
   public fei o(float $$0) {
      if (this.t()) {
         fed $$1 = this.v(false).a(this.dt());
         iu $$2 = this.dv();
         int $$3 = Integer.MIN_VALUE;

         for (iu $$4 : iu.c(iu.a($$1.a, $$1.b, $$1.c), iu.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dV().a(dje.b, $$4), this.dV().a(dje.a, $$4));
            if ($$5 == 15) {
               return fei.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fei.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public cyy dI() {
      return new cyy(czc.vL);
   }

   @Override
   public boolean ez() {
      return !this.cp() && !this.t();
   }
}
