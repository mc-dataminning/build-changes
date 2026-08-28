import java.util.function.Predicate;
import javax.annotation.Nullable;

public class coc extends byf {
   public static final int a = 5;
   private static final boolean bE = true;
   public static final jy b = new jy(0.0F, 0.0F, 0.0F);
   public static final jy c = new jy(0.0F, 0.0F, 0.0F);
   public static final jy d = new jy(-10.0F, 0.0F, -10.0F);
   public static final jy e = new jy(-15.0F, 0.0F, 10.0F);
   public static final jy f = new jy(-1.0F, 0.0F, -1.0F);
   public static final jy g = new jy(1.0F, 0.0F, 1.0F);
   private static final bxh bF = bxh.c(0.0F, 0.0F);
   private static final bxh bG = bxn.g.n().a(0.5F).b(0.9875F);
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
   public static final aku<Byte> bw = aky.a(coc.class, akw.a);
   public static final aku<jy> bx = aky.a(coc.class, akw.n);
   public static final aku<jy> by = aky.a(coc.class, akw.n);
   public static final aku<jy> bz = aky.a(coc.class, akw.n);
   public static final aku<jy> bA = aky.a(coc.class, akw.n);
   public static final aku<jy> bB = aky.a(coc.class, akw.n);
   public static final aku<jy> bC = aky.a(coc.class, akw.n);
   private static final Predicate<bxe> bL = $$0 -> {
      if ($$0 instanceof cuv $$1 && $$1.y()) {
         return true;
      }

      return false;
   };
   private static final boolean bM = false;
   private static final int bN = 0;
   private static final boolean bO = false;
   private static final boolean bP = false;
   private static final boolean bQ = false;
   private static final boolean bR = false;
   private boolean bS = false;
   public long bD;
   private int bT = 0;
   private jy bU = b;
   private jy bV = c;
   private jy bW = d;
   private jy bX = e;
   private jy bY = f;
   private jy bZ = g;

   public coc(bxn<? extends coc> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public coc(dkj $$0, double $$1, double $$2, double $$3) {
      this(bxn.g, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bzk.a m() {
      return ee().a(bzl.B, 0.0);
   }

   @Override
   public void h_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.h_();
      this.a_($$0, $$1, $$2);
   }

   private boolean D() {
      return !this.w() && !this.bb();
   }

   @Override
   public boolean dj() {
      return super.dj() && this.D();
   }

   @Override
   protected void a(aky.a $$0) {
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
   public boolean e(bxo $$0) {
      return $$0 != bxo.g && $$0 != bxo.h && !this.g($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Invisible", this.co());
      $$0.a("Small", this.p());
      $$0.a("ShowArms", this.s());
      $$0.a("DisabledSlots", this.bT);
      $$0.a("NoBasePlate", !this.u());
      if (this.w()) {
         $$0.a("Marker", this.w());
      }

      $$0.a("Pose", this.E());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.k($$0.b("Invisible", false));
      this.t($$0.b("Small", false));
      this.a($$0.b("ShowArms", false));
      this.bT = $$0.b("DisabledSlots", 0);
      this.b($$0.b("NoBasePlate", false));
      this.u($$0.b("Marker", false));
      this.ad = !this.D();
      this.c($$0.n("Pose"));
   }

   private void c(ua $$0) {
      this.a($$0.<jy>a("Head", jy.a).orElse(b));
      this.b($$0.<jy>a("Body", jy.a).orElse(c));
      this.c($$0.<jy>a("LeftArm", jy.a).orElse(d));
      this.d($$0.<jy>a("RightArm", jy.a).orElse(e));
      this.e($$0.<jy>a("LeftLeg", jy.a).orElse(f));
      this.f($$0.<jy>a("RightLeg", jy.a).orElse(g));
   }

   private ua E() {
      ua $$0 = new ua();
      if (!b.equals(this.bU)) {
         $$0.a("Head", jy.a, this.bU);
      }

      if (!c.equals(this.bV)) {
         $$0.a("Body", jy.a, this.bV);
      }

      if (!d.equals(this.bW)) {
         $$0.a("LeftArm", jy.a, this.bW);
      }

      if (!e.equals(this.bX)) {
         $$0.a("RightArm", jy.a, this.bX);
      }

      if (!f.equals(this.bY)) {
         $$0.a("LeftLeg", jy.a, this.bY);
      }

      if (!g.equals(this.bZ)) {
         $$0.a("RightLeg", jy.a, this.bZ);
      }

      return $$0;
   }

   @Override
   public boolean bG() {
      return false;
   }

   @Override
   protected void D(bxe $$0) {
   }

   @Override
   protected void n() {
      for (bxe $$1 : this.dV().a(this, this.cR(), bL)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bvc a(csi $$0, fgc $$1, bvb $$2) {
      dak $$3 = $$0.b($$2);
      if (this.w() || $$3.a(dao.vW)) {
         return bvc.e;
      } else if ($$0.ak()) {
         return bvc.a;
      } else if ($$0.dV().C) {
         return bvc.b;
      } else {
         bxo $$4 = this.f($$3);
         if ($$3.f()) {
            bxo $$5 = this.l($$1);
            bxo $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bvc.b;
            }
         } else {
            if (this.g($$4)) {
               return bvc.d;
            }

            if ($$4.a() == bxo.a.a && !this.s()) {
               return bvc.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bvc.b;
            }
         }

         return bvc.e;
      }
   }

   private bxo l(fgc $$0) {
      bxo $$1 = bxo.a;
      boolean $$2 = this.p();
      double $$3 = $$0.e / (double)(this.el() * this.ek());
      bxo $$4 = bxo.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bxo.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bxo.e)) {
         $$1 = bxo.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bxo.d)) {
         $$1 = bxo.d;
      } else if ($$3 >= 1.6 && this.d(bxo.f)) {
         $$1 = bxo.f;
      } else if (!this.d(bxo.a) && this.d(bxo.b)) {
         $$1 = bxo.b;
      }

      return $$1;
   }

   private boolean g(bxo $$0) {
      return (this.bT & 1 << $$0.b(0)) != 0 || $$0.a() == bxo.a.a && !this.s();
   }

   private boolean a(csi $$0, bxo $$1, dak $$2, bvb $$3) {
      dak $$4 = this.a($$1);
      if (!$$4.f() && (this.bT & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.bT & 1 << $$1.b(16)) != 0) {
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
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.dQ()) {
         return false;
      } else if (!$$0.O().c(dkf.d) && $$1.d() instanceof byh) {
         return false;
      } else if ($$1.a(axo.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.bS || this.w()) {
         return false;
      } else if ($$1.a(axo.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(axo.u)) {
         if (this.bX()) {
            this.d($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(axo.v) && this.eG() > 0.5F) {
         this.d($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axo.B);
         boolean $$4 = $$1.a(axo.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof csi $$5 && !$$5.gk().e) {
               return false;
            }

            if ($$1.h()) {
               this.G();
               this.F();
               this.c($$0);
               return true;
            } else {
               long $$6 = $$0.ae();
               if ($$6 - this.bD > 5L && !$$4) {
                  $$0.a(this, (byte)32);
                  this.a(egq.o, $$1.d());
                  this.bD = $$6;
               } else {
                  this.c($$0, $$1);
                  this.F();
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
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.aC, this.dm(), 0.3F, 1.0F, false);
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

   private void F() {
      if (this.dV() instanceof asb) {
         ((asb)this.dV())
            .a(
               new lr(lz.b, dnq.n.m()),
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

   private void d(asb $$0, bvt $$1, float $$2) {
      float $$3 = this.eG();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(egq.o, $$1.d());
      }
   }

   private void c(asb $$0, bvt $$1) {
      dak $$2 = new dak(dao.vQ);
      $$2.b(kl.g, this.aj());
      dno.a(this.dV(), this.dv(), $$2);
      this.d($$0, $$1);
   }

   private void d(asb $$0, bvt $$1) {
      this.G();
      this.b($$0, $$1);

      for (bxo $$2 : bxo.j) {
         dak $$3 = this.bt.a($$2, dak.l);
         if (!$$3.f()) {
            dno.a(this.dV(), this.dv().d(), $$3);
         }
      }
   }

   private void G() {
      this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.aA, this.dm(), 1.0F, 1.0F);
   }

   @Override
   protected void C(float $$0) {
      this.aW = this.N;
      this.aV = this.dL();
   }

   @Override
   public void a_(fgc $$0) {
      if (this.D()) {
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
   public void g() {
      super.g();
      jy $$0 = this.al.a(bx);
      if (!this.bU.equals($$0)) {
         this.a($$0);
      }

      jy $$1 = this.al.a(by);
      if (!this.bV.equals($$1)) {
         this.b($$1);
      }

      jy $$2 = this.al.a(bz);
      if (!this.bW.equals($$2)) {
         this.c($$2);
      }

      jy $$3 = this.al.a(bA);
      if (!this.bX.equals($$3)) {
         this.d($$3);
      }

      jy $$4 = this.al.a(bB);
      if (!this.bY.equals($$4)) {
         this.e($$4);
      }

      jy $$5 = this.al.a(bC);
      if (!this.bZ.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void J() {
      this.k(this.bS);
   }

   @Override
   public void k(boolean $$0) {
      this.bS = $$0;
      super.k($$0);
   }

   @Override
   public boolean e_() {
      return this.p();
   }

   @Override
   public void c(asb $$0) {
      this.a(bxe.d.a);
      this.a(egq.p);
   }

   @Override
   public boolean a(dkc $$0) {
      return $$0.h() ? this.co() : true;
   }

   @Override
   public eyf i_() {
      return this.w() ? eyf.d : super.i_();
   }

   @Override
   public boolean n_() {
      return this.w();
   }

   private void t(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 1, $$0));
   }

   public boolean p() {
      return (this.al.a(bw) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 4, $$0));
   }

   public boolean s() {
      return (this.al.a(bw) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 8, $$0));
   }

   public boolean u() {
      return (this.al.a(bw) & 8) == 0;
   }

   private void u(boolean $$0) {
      this.al.a(bw, this.a(this.al.a(bw), 16, $$0));
   }

   public boolean w() {
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

   public void a(jy $$0) {
      this.bU = $$0;
      this.al.a(bx, $$0);
   }

   public void b(jy $$0) {
      this.bV = $$0;
      this.al.a(by, $$0);
   }

   public void c(jy $$0) {
      this.bW = $$0;
      this.al.a(bz, $$0);
   }

   public void d(jy $$0) {
      this.bX = $$0;
      this.al.a(bA, $$0);
   }

   public void e(jy $$0) {
      this.bY = $$0;
      this.al.a(bB, $$0);
   }

   public void f(jy $$0) {
      this.bZ = $$0;
      this.al.a(bC, $$0);
   }

   public jy x() {
      return this.bU;
   }

   public jy y() {
      return this.bV;
   }

   public jy z() {
      return this.bW;
   }

   public jy A() {
      return this.bX;
   }

   public jy B() {
      return this.bY;
   }

   public jy C() {
      return this.bZ;
   }

   @Override
   public boolean bF() {
      return super.bF() && !this.w();
   }

   @Override
   public boolean v(bxe $$0) {
      if ($$0 instanceof csi $$1 && !this.dV().a($$1, this.dv())) {
         return true;
      }

      return false;
   }

   @Override
   public bxw fy() {
      return bxw.b;
   }

   @Override
   public byf.a eO() {
      return new byf.a(awy.aB, awy.aB);
   }

   @Nullable
   @Override
   protected awx e(bvt $$0) {
      return awy.aC;
   }

   @Nullable
   @Override
   protected awx j_() {
      return awy.aA;
   }

   @Override
   public void a(asb $$0, bye $$1) {
   }

   @Override
   public boolean fL() {
      return false;
   }

   @Override
   public void a(aku<?> $$0) {
      if (bw.equals($$0)) {
         this.h_();
         this.I = !this.w();
      }

      super.a($$0);
   }

   @Override
   public boolean fM() {
      return false;
   }

   @Override
   public bxh e(byr $$0) {
      return this.v(this.w());
   }

   private bxh v(boolean $$0) {
      if ($$0) {
         return bF;
      } else {
         return this.e_() ? bG : this.an().n();
      }
   }

   @Override
   public fgc o(float $$0) {
      if (this.w()) {
         ffx $$1 = this.v(false).a(this.dt());
         iw $$2 = this.dv();
         int $$3 = Integer.MIN_VALUE;

         for (iw $$4 : iw.c(iw.a($$1.a, $$1.b, $$1.c), iw.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dV().a(dks.b, $$4), this.dV().a(dks.a, $$4));
            if ($$5 == 15) {
               return fgc.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fgc.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public dak dI() {
      return new dak(dao.vQ);
   }

   @Override
   public boolean eA() {
      return !this.co() && !this.w();
   }
}
