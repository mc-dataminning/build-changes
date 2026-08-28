import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnt extends bxw {
   public static final int a = 5;
   private static final boolean bE = true;
   public static final jy b = new jy(0.0F, 0.0F, 0.0F);
   public static final jy c = new jy(0.0F, 0.0F, 0.0F);
   public static final jy d = new jy(-10.0F, 0.0F, -10.0F);
   public static final jy e = new jy(-15.0F, 0.0F, 10.0F);
   public static final jy f = new jy(-1.0F, 0.0F, -1.0F);
   public static final jy g = new jy(1.0F, 0.0F, 1.0F);
   private static final bwy bF = bwy.c(0.0F, 0.0F);
   private static final bwy bG = bxe.g.n().a(0.5F).b(0.9875F);
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
   public static final akn<Byte> bw = akr.a(cnt.class, akp.a);
   public static final akn<jy> bx = akr.a(cnt.class, akp.n);
   public static final akn<jy> by = akr.a(cnt.class, akp.n);
   public static final akn<jy> bz = akr.a(cnt.class, akp.n);
   public static final akn<jy> bA = akr.a(cnt.class, akp.n);
   public static final akn<jy> bB = akr.a(cnt.class, akp.n);
   public static final akn<jy> bC = akr.a(cnt.class, akp.n);
   private static final Predicate<bwv> bL = $$0 -> {
      if ($$0 instanceof cum $$1 && $$1.y()) {
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

   public cnt(bxe<? extends cnt> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cnt(djz $$0, double $$1, double $$2, double $$3) {
      this(bxe.g, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bzb.a j() {
      return ee().a(bzc.B, 0.0);
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
      return !this.t() && !this.bb();
   }

   @Override
   public boolean dj() {
      return super.dj() && this.C();
   }

   @Override
   protected void a(akr.a $$0) {
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
   public boolean e(bxf $$0) {
      return $$0 != bxf.g && $$0 != bxf.h && !this.g($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Invisible", this.co());
      $$0.a("Small", this.m());
      $$0.a("ShowArms", this.n());
      $$0.a("DisabledSlots", this.bT);
      $$0.a("NoBasePlate", !this.q());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", this.D());
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
      this.ad = !this.C();
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

   private ua D() {
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
   protected void D(bwv $$0) {
   }

   @Override
   protected void o() {
      for (bwv $$1 : this.dV().a(this, this.cR(), bL)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public but a(crz $$0, ffs $$1, bus $$2) {
      daa $$3 = $$0.b($$2);
      if (this.t() || $$3.a(dae.vW)) {
         return but.e;
      } else if ($$0.Z_()) {
         return but.a;
      } else if ($$0.dV().C) {
         return but.b;
      } else {
         bxf $$4 = this.f($$3);
         if ($$3.f()) {
            bxf $$5 = this.l($$1);
            bxf $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return but.b;
            }
         } else {
            if (this.g($$4)) {
               return but.d;
            }

            if ($$4.a() == bxf.a.a && !this.n()) {
               return but.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return but.b;
            }
         }

         return but.e;
      }
   }

   private bxf l(ffs $$0) {
      bxf $$1 = bxf.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (double)(this.el() * this.ek());
      bxf $$4 = bxf.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bxf.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bxf.e)) {
         $$1 = bxf.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bxf.d)) {
         $$1 = bxf.d;
      } else if ($$3 >= 1.6 && this.d(bxf.f)) {
         $$1 = bxf.f;
      } else if (!this.d(bxf.a) && this.d(bxf.b)) {
         $$1 = bxf.b;
      }

      return $$1;
   }

   private boolean g(bxf $$0) {
      return (this.bT & 1 << $$0.b(0)) != 0 || $$0.a() == bxf.a.a && !this.n();
   }

   private boolean a(crz $$0, bxf $$1, daa $$2, bus $$3) {
      daa $$4 = this.a($$1);
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
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.dQ()) {
         return false;
      } else if (!$$0.O().c(djv.d) && $$1.d() instanceof bxy) {
         return false;
      } else if ($$1.a(axh.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.bS || this.t()) {
         return false;
      } else if ($$1.a(axh.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(axh.u)) {
         if (this.bX()) {
            this.d($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(axh.v) && this.eG() > 0.5F) {
         this.d($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axh.B);
         boolean $$4 = $$1.a(axh.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof crz $$5 && !$$5.gk().e) {
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
                  this.a(egg.o, $$1.d());
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
            this.dV().a(this.dA(), this.dC(), this.dG(), awr.aC, this.dm(), 0.3F, 1.0F, false);
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
      if (this.dV() instanceof aru) {
         ((aru)this.dV())
            .a(
               new lr(lz.b, dng.n.m()),
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

   private void d(aru $$0, bvk $$1, float $$2) {
      float $$3 = this.eG();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(egg.o, $$1.d());
      }
   }

   private void c(aru $$0, bvk $$1) {
      daa $$2 = new daa(dae.vQ);
      $$2.b(kl.g, this.ak());
      dne.a(this.dV(), this.dv(), $$2);
      this.d($$0, $$1);
   }

   private void d(aru $$0, bvk $$1) {
      this.F();
      this.b($$0, $$1);

      for (bxf $$2 : bxf.j) {
         daa $$3 = this.bt.a($$2, daa.k);
         if (!$$3.f()) {
            dne.a(this.dV(), this.dv().d(), $$3);
         }
      }
   }

   private void F() {
      this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.aA, this.dm(), 1.0F, 1.0F);
   }

   @Override
   protected void C(float $$0) {
      this.aW = this.N;
      this.aV = this.dL();
   }

   @Override
   public void a_(ffs $$0) {
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
   protected void K() {
      this.k(this.bS);
   }

   @Override
   public void k(boolean $$0) {
      this.bS = $$0;
      super.k($$0);
   }

   @Override
   public boolean n_() {
      return this.m();
   }

   @Override
   public void c(aru $$0) {
      this.a(bwv.d.a);
      this.a(egg.p);
   }

   @Override
   public boolean a(djs $$0) {
      return $$0.h() ? this.co() : true;
   }

   @Override
   public exv j_() {
      return this.t() ? exv.d : super.j_();
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

   public jy u() {
      return this.bU;
   }

   public jy x() {
      return this.bV;
   }

   public jy y() {
      return this.bW;
   }

   public jy z() {
      return this.bX;
   }

   public jy A() {
      return this.bY;
   }

   public jy B() {
      return this.bZ;
   }

   @Override
   public boolean bF() {
      return super.bF() && !this.t();
   }

   @Override
   public boolean v(bwv $$0) {
      if ($$0 instanceof crz $$1 && !this.dV().a($$1, this.dv())) {
         return true;
      }

      return false;
   }

   @Override
   public bxn fy() {
      return bxn.b;
   }

   @Override
   public bxw.a eO() {
      return new bxw.a(awr.aB, awr.aB);
   }

   @Nullable
   @Override
   protected awq e(bvk $$0) {
      return awr.aC;
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.aA;
   }

   @Override
   public void a(aru $$0, bxv $$1) {
   }

   @Override
   public boolean fL() {
      return false;
   }

   @Override
   public void a(akn<?> $$0) {
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
   public bwy e(byi $$0) {
      return this.v(this.t());
   }

   private bwy v(boolean $$0) {
      if ($$0) {
         return bF;
      } else {
         return this.n_() ? bG : this.an().n();
      }
   }

   @Override
   public ffs o(float $$0) {
      if (this.t()) {
         ffn $$1 = this.v(false).a(this.dt());
         iw $$2 = this.dv();
         int $$3 = Integer.MIN_VALUE;

         for (iw $$4 : iw.c(iw.a($$1.a, $$1.b, $$1.c), iw.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dV().a(dki.b, $$4), this.dV().a(dki.a, $$4));
            if ($$5 == 15) {
               return ffs.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return ffs.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public daa dI() {
      return new daa(dae.vQ);
   }

   @Override
   public boolean eA() {
      return !this.co() && !this.t();
   }
}
