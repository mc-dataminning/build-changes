import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clq extends bwg {
   public static final int a = 5;
   private static final boolean bR = true;
   public static final ki b = new ki(0.0F, 0.0F, 0.0F);
   public static final ki c = new ki(0.0F, 0.0F, 0.0F);
   public static final ki d = new ki(-10.0F, 0.0F, -10.0F);
   public static final ki e = new ki(-15.0F, 0.0F, 10.0F);
   public static final ki f = new ki(-1.0F, 0.0F, -1.0F);
   public static final ki g = new ki(1.0F, 0.0F, 1.0F);
   private static final bvn bS = bvn.c(0.0F, 0.0F);
   private static final bvn bT = bvr.f.n().a(0.5F).b(0.9875F);
   private static final double bU = 0.1;
   private static final double bV = 0.9;
   private static final double bW = 0.4;
   private static final double bX = 1.6;
   public static final int h = 8;
   public static final int i = 16;
   public static final int j = 1;
   public static final int k = 4;
   public static final int bH = 8;
   public static final int bI = 16;
   public static final alc<Byte> bJ = alg.a(clq.class, ale.a);
   public static final alc<ki> bK = alg.a(clq.class, ale.n);
   public static final alc<ki> bL = alg.a(clq.class, ale.n);
   public static final alc<ki> bM = alg.a(clq.class, ale.n);
   public static final alc<ki> bN = alg.a(clq.class, ale.n);
   public static final alc<ki> bO = alg.a(clq.class, ale.n);
   public static final alc<ki> bP = alg.a(clq.class, ale.n);
   private static final Predicate<bvk> bY = $$0 -> {
      if ($$0 instanceof crw $$1 && $$1.D()) {
         return true;
      }

      return false;
   };
   private final jz<cxp> bZ = jz.a(2, cxp.j);
   private final jz<cxp> ca = jz.a(4, cxp.j);
   private boolean cb;
   public long bQ;
   private int cc;
   private ki cd = b;
   private ki ce = c;
   private ki cf = d;
   private ki cg = e;
   private ki ch = f;
   private ki ci = g;

   public clq(bvr<? extends clq> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public clq(dhi $$0, double $$1, double $$2, double $$3) {
      this(bvr.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bxn.a m() {
      return ee().a(bxo.B, 0.0);
   }

   @Override
   public void m_() {
      double $$0 = this.dB();
      double $$1 = this.dD();
      double $$2 = this.dH();
      super.m_();
      this.a_($$0, $$1, $$2);
   }

   private boolean E() {
      return !this.x() && !this.bc();
   }

   @Override
   public boolean dk() {
      return super.dk() && this.E();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bJ, (byte)0);
      $$0.a(bK, b);
      $$0.a(bL, c);
      $$0.a(bM, d);
      $$0.a(bN, e);
      $$0.a(bO, f);
      $$0.a(bP, g);
   }

   @Override
   public Iterable<cxp> fc() {
      return this.bZ;
   }

   @Override
   public Iterable<cxp> fb() {
      return this.ca;
   }

   @Override
   public cxp a(bvs $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cxp.j;
      }
   }

   @Override
   public boolean e(bvs $$0) {
      return $$0 != bvs.g && !this.g($$0);
   }

   @Override
   public void a(bvs $$0, cxp $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ca.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      vd $$1 = new vd();

      for (cxp $$2 : this.ca) {
         $$1.add($$2.b(this.dY()));
      }

      $$0.a("ArmorItems", $$1);
      vd $$3 = new vd();

      for (cxp $$4 : this.bZ) {
         $$3.add($$4.b(this.dY()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cp());
      $$0.a("Small", this.p());
      $$0.a("ShowArms", this.t());
      $$0.a("DisabledSlots", this.cc);
      $$0.a("NoBasePlate", !this.u());
      if (this.x()) {
         $$0.a("Marker", this.x());
      }

      $$0.a("Pose", this.F());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         vd $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            ux $$3 = $$1.a($$2);
            this.ca.set($$2, cxp.a(this.dY(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         vd $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bZ.size(); $$5++) {
            ux $$6 = $$4.a($$5);
            this.bZ.set($$5, cxp.a(this.dY(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.v($$0.q("Marker"));
      this.ad = !this.E();
      ux $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(ux $$0) {
      vd $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? b : new ki($$1));
      vd $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? c : new ki($$2));
      vd $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? d : new ki($$3));
      vd $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? e : new ki($$4));
      vd $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? f : new ki($$5));
      vd $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? g : new ki($$6));
   }

   private ux F() {
      ux $$0 = new ux();
      if (!b.equals(this.cd)) {
         $$0.a("Head", this.cd.a());
      }

      if (!c.equals(this.ce)) {
         $$0.a("Body", this.ce.a());
      }

      if (!d.equals(this.cf)) {
         $$0.a("LeftArm", this.cf.a());
      }

      if (!e.equals(this.cg)) {
         $$0.a("RightArm", this.cg.a());
      }

      if (!f.equals(this.ch)) {
         $$0.a("LeftLeg", this.ch.a());
      }

      if (!g.equals(this.ci)) {
         $$0.a("RightLeg", this.ci.a());
      }

      return $$0;
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   protected void D(bvk $$0) {
   }

   @Override
   protected void o() {
      for (bvk $$1 : this.dW().a(this, this.cR(), bY)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public btj a(cpx $$0, fby $$1, bti $$2) {
      cxp $$3 = $$0.b($$2);
      if (this.x() || $$3.a(cxt.vB)) {
         return btj.e;
      } else if ($$0.aa_()) {
         return btj.a;
      } else if ($$0.dW().C) {
         return btj.b;
      } else {
         bvs $$4 = this.f($$3);
         if ($$3.f()) {
            bvs $$5 = this.k($$1);
            bvs $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return btj.b;
            }
         } else {
            if (this.g($$4)) {
               return btj.d;
            }

            if ($$4.a() == bvs.a.a && !this.t()) {
               return btj.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return btj.b;
            }
         }

         return btj.e;
      }
   }

   private bvs k(fby $$0) {
      bvs $$1 = bvs.a;
      boolean $$2 = this.p();
      double $$3 = $$0.e / (double)(this.ek() * this.ej());
      bvs $$4 = bvs.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bvs.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bvs.e)) {
         $$1 = bvs.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bvs.d)) {
         $$1 = bvs.d;
      } else if ($$3 >= 1.6 && this.d(bvs.f)) {
         $$1 = bvs.f;
      } else if (!this.d(bvs.a) && this.d(bvs.b)) {
         $$1 = bvs.b;
      }

      return $$1;
   }

   private boolean g(bvs $$0) {
      return (this.cc & 1 << $$0.b(0)) != 0 || $$0.a() == bvs.a.a && !this.t();
   }

   private boolean a(cpx $$0, bvs $$1, cxp $$2, bti $$3) {
      cxp $$4 = this.a($$1);
      if (!$$4.f() && (this.cc & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.cc & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.fV() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.L() <= 1) {
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
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.dR()) {
         return false;
      } else if (!$$0.N().b(dhe.c) && $$1.d() instanceof bwi) {
         return false;
      } else if ($$1.a(axw.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.cb || this.x()) {
         return false;
      } else if ($$1.a(axw.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(axw.u)) {
         if (this.bY()) {
            this.c($$0, $$1, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$1.a(axw.v) && this.eE() > 0.5F) {
         this.c($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(axw.B);
         boolean $$4 = $$1.a(axw.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof cpx $$5 && !$$5.gj().e) {
               return false;
            }

            if ($$1.h()) {
               this.H();
               this.G();
               this.c($$0);
               return true;
            } else {
               long $$6 = $$0.ac();
               if ($$6 - this.bQ > 5L && !$$4) {
                  $$0.a(this, (byte)32);
                  this.a(ecr.o, $$1.d());
                  this.bQ = $$6;
               } else {
                  this.c($$0, $$1);
                  this.G();
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
         if (this.dW().C) {
            this.dW().a(this.dB(), this.dD(), this.dH(), axf.aC, this.dn(), 0.3F, 1.0F, false);
            this.bQ = this.dW().ac();
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

   private void G() {
      if (this.dW() instanceof ash) {
         ((ash)this.dW())
            .a(
               new lk(ls.b, dko.n.m()),
               this.dB(),
               this.e(0.6666666666666666),
               this.dH(),
               10,
               (double)(this.dr() / 4.0F),
               (double)(this.ds() / 4.0F),
               (double)(this.dr() / 4.0F),
               0.05
            );
      }
   }

   private void c(ash $$0, bua $$1, float $$2) {
      float $$3 = this.eE();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.x($$3);
         this.a(ecr.o, $$1.d());
      }
   }

   private void c(ash $$0, bua $$1) {
      cxp $$2 = new cxp(cxt.vv);
      $$2.b(ku.g, this.an());
      dkm.a(this.dW(), this.dw(), $$2);
      this.d($$0, $$1);
   }

   private void d(ash $$0, bua $$1) {
      this.H();
      this.b($$0, $$1);

      for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
         cxp $$3 = this.bZ.get($$2);
         if (!$$3.f()) {
            dkm.a(this.dW(), this.dw().d(), $$3);
            this.bZ.set($$2, cxp.j);
         }
      }

      for (int $$4 = 0; $$4 < this.ca.size(); $$4++) {
         cxp $$5 = this.ca.get($$4);
         if (!$$5.f()) {
            dkm.a(this.dW(), this.dw().d(), $$5);
            this.ca.set($$4, cxp.j);
         }
      }
   }

   private void H() {
      this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.aA, this.dn(), 1.0F, 1.0F);
   }

   @Override
   protected float g(float $$0, float $$1) {
      this.aY = this.N;
      this.aX = this.dM();
      return 0.0F;
   }

   @Override
   public void a_(fby $$0) {
      if (this.E()) {
         super.a_($$0);
      }
   }

   @Override
   public void r(float $$0) {
      this.aY = this.N = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void q(float $$0) {
      this.aY = this.N = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void h() {
      super.h();
      ki $$0 = this.al.a(bK);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      ki $$1 = this.al.a(bL);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      ki $$2 = this.al.a(bM);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      ki $$3 = this.al.a(bN);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      ki $$4 = this.al.a(bO);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      ki $$5 = this.al.a(bP);
      if (!this.ci.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void K() {
      this.k(this.cb);
   }

   @Override
   public void k(boolean $$0) {
      this.cb = $$0;
      super.k($$0);
   }

   @Override
   public boolean e_() {
      return this.p();
   }

   @Override
   public void c(ash $$0) {
      this.a(bvk.d.a);
      this.a(ecr.p);
   }

   @Override
   public boolean a(dha $$0) {
      return $$0.h() ? this.cp() : true;
   }

   @Override
   public euc n_() {
      return this.x() ? euc.d : super.n_();
   }

   @Override
   public boolean s_() {
      return this.x();
   }

   private void u(boolean $$0) {
      this.al.a(bJ, this.a(this.al.a(bJ), 1, $$0));
   }

   public boolean p() {
      return (this.al.a(bJ) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.al.a(bJ, this.a(this.al.a(bJ), 4, $$0));
   }

   public boolean t() {
      return (this.al.a(bJ) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.al.a(bJ, this.a(this.al.a(bJ), 8, $$0));
   }

   @Override
   public boolean u() {
      return (this.al.a(bJ) & 8) == 0;
   }

   private void v(boolean $$0) {
      this.al.a(bJ, this.a(this.al.a(bJ), 16, $$0));
   }

   public boolean x() {
      return (this.al.a(bJ) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(ki $$0) {
      this.cd = $$0;
      this.al.a(bK, $$0);
   }

   public void b(ki $$0) {
      this.ce = $$0;
      this.al.a(bL, $$0);
   }

   public void c(ki $$0) {
      this.cf = $$0;
      this.al.a(bM, $$0);
   }

   public void d(ki $$0) {
      this.cg = $$0;
      this.al.a(bN, $$0);
   }

   public void e(ki $$0) {
      this.ch = $$0;
      this.al.a(bO, $$0);
   }

   public void f(ki $$0) {
      this.ci = $$0;
      this.al.a(bP, $$0);
   }

   public ki y() {
      return this.cd;
   }

   public ki z() {
      return this.ce;
   }

   public ki A() {
      return this.cf;
   }

   public ki B() {
      return this.cg;
   }

   public ki C() {
      return this.ch;
   }

   public ki D() {
      return this.ci;
   }

   @Override
   public boolean bH() {
      return super.bH() && !this.x();
   }

   @Override
   public boolean v(bvk $$0) {
      return $$0 instanceof cpx && !this.dW().a((cpx)$$0, this.dw());
   }

   @Override
   public bwa fy() {
      return bwa.b;
   }

   @Override
   public bwg.a eM() {
      return new bwg.a(axf.aB, axf.aB);
   }

   @Nullable
   @Override
   protected axe e(bua $$0) {
      return axf.aC;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.aA;
   }

   @Override
   public void a(ash $$0, bwf $$1) {
   }

   @Override
   public boolean fL() {
      return false;
   }

   @Override
   public void a(alc<?> $$0) {
      if (bJ.equals($$0)) {
         this.m_();
         this.I = !this.x();
      }

      super.a($$0);
   }

   @Override
   public boolean fM() {
      return false;
   }

   @Override
   public bvn e(bws $$0) {
      return this.w(this.x());
   }

   private bvn w(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.e_() ? bT : this.aq().n();
      }
   }

   @Override
   public fby n(float $$0) {
      if (this.x()) {
         fbt $$1 = this.w(false).a(this.du());
         jh $$2 = this.dw();
         int $$3 = Integer.MIN_VALUE;

         for (jh $$4 : jh.c(jh.a($$1.a, $$1.b, $$1.c), jh.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dW().a(dhr.b, $$4), this.dW().a(dhr.a, $$4));
            if ($$5 == 15) {
               return fby.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fby.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cxp dJ() {
      return new cxp(cxt.vv);
   }

   @Override
   public boolean ey() {
      return !this.cp() && !this.x();
   }
}
