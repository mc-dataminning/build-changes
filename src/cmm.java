import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmm extends bwz {
   public static final int a = 5;
   private static final boolean bD = true;
   private static final Logger bE = LogUtils.getLogger();
   public static final jw b = new jw(0.0F, 0.0F, 0.0F);
   public static final jw c = new jw(0.0F, 0.0F, 0.0F);
   public static final jw d = new jw(-10.0F, 0.0F, -10.0F);
   public static final jw e = new jw(-15.0F, 0.0F, 10.0F);
   public static final jw f = new jw(-1.0F, 0.0F, -1.0F);
   public static final jw g = new jw(1.0F, 0.0F, 1.0F);
   private static final bwd bF = bwd.c(0.0F, 0.0F);
   private static final bwd bG = bwj.f.n().a(0.5F).b(0.9875F);
   private static final double bH = 0.1;
   private static final double bI = 0.9;
   private static final double bJ = 0.4;
   private static final double bK = 1.6;
   public static final int h = 8;
   public static final int i = 16;
   public static final int j = 1;
   public static final int k = 4;
   public static final int bt = 8;
   public static final int bu = 16;
   public static final akh<Byte> bv = akl.a(cmm.class, akj.a);
   public static final akh<jw> bw = akl.a(cmm.class, akj.n);
   public static final akh<jw> bx = akl.a(cmm.class, akj.n);
   public static final akh<jw> by = akl.a(cmm.class, akj.n);
   public static final akh<jw> bz = akl.a(cmm.class, akj.n);
   public static final akh<jw> bA = akl.a(cmm.class, akj.n);
   public static final akh<jw> bB = akl.a(cmm.class, akj.n);
   private static final Predicate<bwa> bL = $$0 -> {
      if ($$0 instanceof cte $$1 && $$1.z()) {
         return true;
      }

      return false;
   };
   private bwe bM = new bwe();
   private boolean bN;
   public long bC;
   private int bO;
   private jw bP = b;
   private jw bQ = c;
   private jw bR = d;
   private jw bS = e;
   private jw bT = f;
   private jw bU = g;

   public cmm(bwj<? extends cmm> $$0, dip $$1) {
      super($$0, $$1);
   }

   public cmm(dip $$0, double $$1, double $$2, double $$3) {
      this(bwj.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bye.a j() {
      return ed().a(byf.B, 0.0);
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
   protected void a(akl.a $$0) {
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
   public cys a(bwk $$0) {
      return this.bM.a($$0);
   }

   @Override
   public boolean e(bwk $$0) {
      return $$0 != bwk.g && $$0 != bwk.h && !this.g($$0);
   }

   @Override
   public void a(bwk $$0, cys $$1) {
      this.d($$1);
      cys $$2 = this.bM.a($$0, $$1);
      this.a($$0, $$2, $$1);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (!this.bM.a()) {
         alc<uu> $$1 = this.dX().a(ul.a);
         $$0.a("equipment", (uu)bwe.a.encodeStart($$1, this.bM).getOrThrow());
      }

      $$0.a("Invisible", this.cp());
      $$0.a("Small", this.m());
      $$0.a("ShowArms", this.n());
      $$0.a("DisabledSlots", this.bO);
      $$0.a("NoBasePlate", !this.q());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", this.D());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("equipment")) {
         alc<uu> $$1 = this.dX().a(ul.a);
         bwe.a.parse($$1, $$0.c("equipment")).resultOrPartial($$0x -> bE.warn("Failed to parse equipment: {}", $$0x)).ifPresent($$0x -> this.bM = $$0x);
      } else {
         this.bM = new bwe();
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.bO = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ad = !this.C();
      tx $$2 = $$0.p("Pose");
      this.c($$2);
   }

   private void c(tx $$0) {
      ud $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? b : new jw($$1));
      ud $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? c : new jw($$2));
      ud $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? d : new jw($$3));
      ud $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? e : new jw($$4));
      ud $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? f : new jw($$5));
      ud $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? g : new jw($$6));
   }

   private tx D() {
      tx $$0 = new tx();
      if (!b.equals(this.bP)) {
         $$0.a("Head", this.bP.a());
      }

      if (!c.equals(this.bQ)) {
         $$0.a("Body", this.bQ.a());
      }

      if (!d.equals(this.bR)) {
         $$0.a("LeftArm", this.bR.a());
      }

      if (!e.equals(this.bS)) {
         $$0.a("RightArm", this.bS.a());
      }

      if (!f.equals(this.bT)) {
         $$0.a("LeftLeg", this.bT.a());
      }

      if (!g.equals(this.bU)) {
         $$0.a("RightLeg", this.bU.a());
      }

      return $$0;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   protected void D(bwa $$0) {
   }

   @Override
   protected void o() {
      for (bwa $$1 : this.dV().a(this, this.cR(), bL)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bty a(cqs $$0, fdw $$1, btx $$2) {
      cys $$3 = $$0.b($$2);
      if (this.t() || $$3.a(cyw.vP)) {
         return bty.e;
      } else if ($$0.U_()) {
         return bty.a;
      } else if ($$0.dV().C) {
         return bty.b;
      } else {
         bwk $$4 = this.g($$3);
         if ($$3.f()) {
            bwk $$5 = this.l($$1);
            bwk $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bty.b;
            }
         } else {
            if (this.g($$4)) {
               return bty.d;
            }

            if ($$4.a() == bwk.a.a && !this.n()) {
               return bty.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bty.b;
            }
         }

         return bty.e;
      }
   }

   private bwk l(fdw $$0) {
      bwk $$1 = bwk.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (double)(this.ek() * this.ej());
      bwk $$4 = bwk.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bwk.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bwk.e)) {
         $$1 = bwk.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bwk.d)) {
         $$1 = bwk.d;
      } else if ($$3 >= 1.6 && this.d(bwk.f)) {
         $$1 = bwk.f;
      } else if (!this.d(bwk.a) && this.d(bwk.b)) {
         $$1 = bwk.b;
      }

      return $$1;
   }

   private boolean g(bwk $$0) {
      return (this.bO & 1 << $$0.b(0)) != 0 || $$0.a() == bwk.a.a && !this.n();
   }

   private boolean a(cqs $$0, bwk $$1, cys $$2, btx $$3) {
      cys $$4 = this.a($$1);
      if (!$$4.f() && (this.bO & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.bO & 1 << $$1.b(16)) != 0) {
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
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.dQ()) {
         return false;
      } else if (!$$0.O().c(dil.c) && $$1.d() instanceof bxb) {
         return false;
      } else if ($$1.a(axb.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.bN || this.t()) {
         return false;
      } else if ($$1.a(axb.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(axb.u)) {
         if (this.bY()) {
            this.c($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(axb.v) && this.eF() > 0.5F) {
         this.c($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axb.B);
         boolean $$4 = $$1.a(axb.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof cqs $$5 && !$$5.gj().e) {
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
                  this.a(eeo.o, $$1.d());
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
            this.dV().a(this.dA(), this.dC(), this.dG(), awl.aC, this.dm(), 0.3F, 1.0F, false);
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
      if (this.dV() instanceof aro) {
         ((aro)this.dV())
            .a(
               new lp(lx.b, dlw.n.m()),
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

   private void c(aro $$0, bup $$1, float $$2) {
      float $$3 = this.eF();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(eeo.o, $$1.d());
      }
   }

   private void c(aro $$0, bup $$1) {
      cys $$2 = new cys(cyw.vJ);
      $$2.b(kj.g, this.an());
      dlu.a(this.dV(), this.dv(), $$2);
      this.d($$0, $$1);
   }

   private void d(aro $$0, bup $$1) {
      this.F();
      this.b($$0, $$1);

      for (bwk $$2 : bwk.j) {
         cys $$3 = this.bM.a($$2, cys.k);
         if (!$$3.f()) {
            dlu.a(this.dV(), this.dv().d(), $$3);
         }
      }
   }

   private void F() {
      this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.aA, this.dm(), 1.0F, 1.0F);
   }

   @Override
   protected void C(float $$0) {
      this.aW = this.N;
      this.aV = this.dL();
   }

   @Override
   public void a_(fdw $$0) {
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
      if (!this.bP.equals($$0)) {
         this.a($$0);
      }

      jw $$1 = this.al.a(bx);
      if (!this.bQ.equals($$1)) {
         this.b($$1);
      }

      jw $$2 = this.al.a(by);
      if (!this.bR.equals($$2)) {
         this.c($$2);
      }

      jw $$3 = this.al.a(bz);
      if (!this.bS.equals($$3)) {
         this.d($$3);
      }

      jw $$4 = this.al.a(bA);
      if (!this.bT.equals($$4)) {
         this.e($$4);
      }

      jw $$5 = this.al.a(bB);
      if (!this.bU.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void K() {
      this.k(this.bN);
   }

   @Override
   public void k(boolean $$0) {
      this.bN = $$0;
      super.k($$0);
   }

   @Override
   public boolean n_() {
      return this.m();
   }

   @Override
   public void c(aro $$0) {
      this.a(bwa.e.a);
      this.a(eeo.p);
   }

   @Override
   public boolean a(dii $$0) {
      return $$0.h() ? this.cp() : true;
   }

   @Override
   public ewa j_() {
      return this.t() ? ewa.d : super.j_();
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
      this.bP = $$0;
      this.al.a(bw, $$0);
   }

   public void b(jw $$0) {
      this.bQ = $$0;
      this.al.a(bx, $$0);
   }

   public void c(jw $$0) {
      this.bR = $$0;
      this.al.a(by, $$0);
   }

   public void d(jw $$0) {
      this.bS = $$0;
      this.al.a(bz, $$0);
   }

   public void e(jw $$0) {
      this.bT = $$0;
      this.al.a(bA, $$0);
   }

   public void f(jw $$0) {
      this.bU = $$0;
      this.al.a(bB, $$0);
   }

   public jw u() {
      return this.bP;
   }

   public jw x() {
      return this.bQ;
   }

   public jw y() {
      return this.bR;
   }

   public jw z() {
      return this.bS;
   }

   public jw A() {
      return this.bT;
   }

   public jw B() {
      return this.bU;
   }

   @Override
   public boolean bG() {
      return super.bG() && !this.t();
   }

   @Override
   public boolean v(bwa $$0) {
      if ($$0 instanceof cqs $$1 && !this.dV().a($$1, this.dv())) {
         return true;
      }

      return false;
   }

   @Override
   public bws fx() {
      return bws.b;
   }

   @Override
   public bwz.a eN() {
      return new bwz.a(awl.aB, awl.aB);
   }

   @Nullable
   @Override
   protected awk e(bup $$0) {
      return awl.aC;
   }

   @Nullable
   @Override
   protected awk l_() {
      return awl.aA;
   }

   @Override
   public void a(aro $$0, bwy $$1) {
   }

   @Override
   public boolean fK() {
      return false;
   }

   @Override
   public void a(akh<?> $$0) {
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
   public bwd e(bxl $$0) {
      return this.v(this.t());
   }

   private bwd v(boolean $$0) {
      if ($$0) {
         return bF;
      } else {
         return this.n_() ? bG : this.aq().n();
      }
   }

   @Override
   public fdw o(float $$0) {
      if (this.t()) {
         fdr $$1 = this.v(false).a(this.dt());
         iu $$2 = this.dv();
         int $$3 = Integer.MIN_VALUE;

         for (iu $$4 : iu.c(iu.a($$1.a, $$1.b, $$1.c), iu.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dV().a(diy.b, $$4), this.dV().a(diy.a, $$4));
            if ($$5 == 15) {
               return fdw.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fdw.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public cys dI() {
      return new cys(cyw.vJ);
   }

   @Override
   public boolean ez() {
      return !this.cp() && !this.t();
   }
}
