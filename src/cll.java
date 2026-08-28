import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cll extends bvy {
   public static final int a = 5;
   private static final boolean bD = true;
   public static final kj b = new kj(0.0F, 0.0F, 0.0F);
   public static final kj c = new kj(0.0F, 0.0F, 0.0F);
   public static final kj d = new kj(-10.0F, 0.0F, -10.0F);
   public static final kj e = new kj(-15.0F, 0.0F, 10.0F);
   public static final kj f = new kj(-1.0F, 0.0F, -1.0F);
   public static final kj g = new kj(1.0F, 0.0F, 1.0F);
   private static final bvd bE = bvd.c(0.0F, 0.0F);
   private static final bvd bF = bvi.f.n().a(0.5F).b(0.9875F);
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
   public static final ajx<Byte> bv = akb.a(cll.class, ajz.a);
   public static final ajx<kj> bw = akb.a(cll.class, ajz.n);
   public static final ajx<kj> bx = akb.a(cll.class, ajz.n);
   public static final ajx<kj> by = akb.a(cll.class, ajz.n);
   public static final ajx<kj> bz = akb.a(cll.class, ajz.n);
   public static final ajx<kj> bA = akb.a(cll.class, ajz.n);
   public static final ajx<kj> bB = akb.a(cll.class, ajz.n);
   private static final Predicate<bva> bK = $$0 -> {
      if ($$0 instanceof crq $$1 && $$1.z()) {
         return true;
      }

      return false;
   };
   private final ka<cxh> bL = ka.a(2, cxh.k);
   private final ka<cxh> bM = ka.a(4, cxh.k);
   private boolean bN;
   public long bC;
   private int bO;
   private kj bP = b;
   private kj bQ = c;
   private kj bR = d;
   private kj bS = e;
   private kj bT = f;
   private kj bU = g;

   public cll(bvi<? extends cll> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cll(dgz $$0, double $$1, double $$2, double $$3) {
      this(bvi.f, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bxf.a j() {
      return ec().a(bxg.B, 0.0);
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
      return !this.t() && !this.bc();
   }

   @Override
   public boolean di() {
      return super.di() && this.C();
   }

   @Override
   protected void a(akb.a $$0) {
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
   public Iterable<cxh> fc() {
      return this.bL;
   }

   @Override
   public Iterable<cxh> fb() {
      return this.bM;
   }

   @Override
   public cxh a(bvj $$0) {
      switch ($$0.a()) {
         case a:
            return this.bL.get($$0.b());
         case b:
            return this.bM.get($$0.b());
         default:
            return cxh.k;
      }
   }

   @Override
   public boolean e(bvj $$0) {
      return $$0 != bvj.g && !this.g($$0);
   }

   @Override
   public void a(bvj $$0, cxh $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bL.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bM.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      tw $$1 = new tw();

      for (cxh $$2 : this.bM) {
         $$1.add($$2.b(this.dW()));
      }

      $$0.a("ArmorItems", $$1);
      tw $$3 = new tw();

      for (cxh $$4 : this.bL) {
         $$3.add($$4.b(this.dW()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.co());
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
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         tw $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bM.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            this.bM.set($$2, cxh.a(this.dW(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         tw $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bL.size(); $$5++) {
            tq $$6 = $$4.a($$5);
            this.bL.set($$5, cxh.a(this.dW(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.bO = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ad = !this.C();
      tq $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(tq $$0) {
      tw $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? b : new kj($$1));
      tw $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? c : new kj($$2));
      tw $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? d : new kj($$3));
      tw $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? e : new kj($$4));
      tw $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? f : new kj($$5));
      tw $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? g : new kj($$6));
   }

   private tq D() {
      tq $$0 = new tq();
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
   public boolean bG() {
      return false;
   }

   @Override
   protected void D(bva $$0) {
   }

   @Override
   protected void o() {
      for (bva $$1 : this.dU().a(this, this.cQ(), bK)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bsy a(cpr $$0, fbx $$1, bsx $$2) {
      cxh $$3 = $$0.b($$2);
      if (this.t() || $$3.a(cxl.vN)) {
         return bsy.e;
      } else if ($$0.U_()) {
         return bsy.a;
      } else if ($$0.dU().C) {
         return bsy.b;
      } else {
         bvj $$4 = this.f($$3);
         if ($$3.f()) {
            bvj $$5 = this.l($$1);
            bvj $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bsy.b;
            }
         } else {
            if (this.g($$4)) {
               return bsy.d;
            }

            if ($$4.a() == bvj.a.a && !this.n()) {
               return bsy.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bsy.b;
            }
         }

         return bsy.e;
      }
   }

   private bvj l(fbx $$0) {
      bvj $$1 = bvj.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (double)(this.ej() * this.ei());
      bvj $$4 = bvj.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bvj.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bvj.e)) {
         $$1 = bvj.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bvj.d)) {
         $$1 = bvj.d;
      } else if ($$3 >= 1.6 && this.d(bvj.f)) {
         $$1 = bvj.f;
      } else if (!this.d(bvj.a) && this.d(bvj.b)) {
         $$1 = bvj.b;
      }

      return $$1;
   }

   private boolean g(bvj $$0) {
      return (this.bO & 1 << $$0.b(0)) != 0 || $$0.a() == bvj.a.a && !this.n();
   }

   private boolean a(cpr $$0, bvj $$1, cxh $$2, bsx $$3) {
      cxh $$4 = this.a($$1);
      if (!$$4.f() && (this.bO & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.bO & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.fX() && $$4.f() && !$$2.f()) {
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
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.dP()) {
         return false;
      } else if (!$$0.O().b(dgv.c) && $$1.d() instanceof bwa) {
         return false;
      } else if ($$1.a(awr.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.bN || this.t()) {
         return false;
      } else if ($$1.a(awr.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(awr.u)) {
         if (this.bX()) {
            this.c($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(awr.v) && this.eE() > 0.5F) {
         this.c($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(awr.B);
         boolean $$4 = $$1.a(awr.A);
         if (!$$3 && !$$4) {
            return false;
         } else {
            if ($$1.d() instanceof cpr $$5 && !$$5.gm().e) {
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
                  this.a(ecp.o, $$1.d());
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
         if (this.dU().C) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awa.aC, this.dl(), 0.3F, 1.0F, false);
            this.bC = this.dU().ae();
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
      if (this.dU() instanceof ard) {
         ((ard)this.dU())
            .a(
               new ll(lt.b, dkg.n.m()),
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

   private void c(ard $$0, btp $$1, float $$2) {
      float $$3 = this.eE();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.d($$3);
         this.a(ecp.o, $$1.d());
      }
   }

   private void c(ard $$0, btp $$1) {
      cxh $$2 = new cxh(cxl.vH);
      $$2.b(kv.g, this.an());
      dke.a(this.dU(), this.du(), $$2);
      this.d($$0, $$1);
   }

   private void d(ard $$0, btp $$1) {
      this.F();
      this.b($$0, $$1);

      for (int $$2 = 0; $$2 < this.bL.size(); $$2++) {
         cxh $$3 = this.bL.get($$2);
         if (!$$3.f()) {
            dke.a(this.dU(), this.du().d(), $$3);
            this.bL.set($$2, cxh.k);
         }
      }

      for (int $$4 = 0; $$4 < this.bM.size(); $$4++) {
         cxh $$5 = this.bM.get($$4);
         if (!$$5.f()) {
            dke.a(this.dU(), this.du().d(), $$5);
            this.bM.set($$4, cxh.k);
         }
      }
   }

   private void F() {
      this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.aA, this.dl(), 1.0F, 1.0F);
   }

   @Override
   protected void D(float $$0) {
      this.aW = this.N;
      this.aV = this.dK();
   }

   @Override
   public void a_(fbx $$0) {
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
      kj $$0 = this.al.a(bw);
      if (!this.bP.equals($$0)) {
         this.a($$0);
      }

      kj $$1 = this.al.a(bx);
      if (!this.bQ.equals($$1)) {
         this.b($$1);
      }

      kj $$2 = this.al.a(by);
      if (!this.bR.equals($$2)) {
         this.c($$2);
      }

      kj $$3 = this.al.a(bz);
      if (!this.bS.equals($$3)) {
         this.d($$3);
      }

      kj $$4 = this.al.a(bA);
      if (!this.bT.equals($$4)) {
         this.e($$4);
      }

      kj $$5 = this.al.a(bB);
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
   public void c(ard $$0) {
      this.a(bva.d.a);
      this.a(ecp.p);
   }

   @Override
   public boolean a(dgs $$0) {
      return $$0.h() ? this.co() : true;
   }

   @Override
   public eub j_() {
      return this.t() ? eub.d : super.j_();
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

   public void a(kj $$0) {
      this.bP = $$0;
      this.al.a(bw, $$0);
   }

   public void b(kj $$0) {
      this.bQ = $$0;
      this.al.a(bx, $$0);
   }

   public void c(kj $$0) {
      this.bR = $$0;
      this.al.a(by, $$0);
   }

   public void d(kj $$0) {
      this.bS = $$0;
      this.al.a(bz, $$0);
   }

   public void e(kj $$0) {
      this.bT = $$0;
      this.al.a(bA, $$0);
   }

   public void f(kj $$0) {
      this.bU = $$0;
      this.al.a(bB, $$0);
   }

   public kj u() {
      return this.bP;
   }

   public kj x() {
      return this.bQ;
   }

   public kj y() {
      return this.bR;
   }

   public kj z() {
      return this.bS;
   }

   public kj A() {
      return this.bT;
   }

   public kj B() {
      return this.bU;
   }

   @Override
   public boolean bF() {
      return super.bF() && !this.t();
   }

   @Override
   public boolean v(bva $$0) {
      if ($$0 instanceof cpr $$1 && !this.dU().a($$1, this.du())) {
         return true;
      }

      return false;
   }

   @Override
   public bvr fA() {
      return bvr.b;
   }

   @Override
   public bvy.a eM() {
      return new bvy.a(awa.aB, awa.aB);
   }

   @Nullable
   @Override
   protected avz e(btp $$0) {
      return awa.aC;
   }

   @Nullable
   @Override
   protected avz l_() {
      return awa.aA;
   }

   @Override
   public void a(ard $$0, bvx $$1) {
   }

   @Override
   public boolean fN() {
      return false;
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bv.equals($$0)) {
         this.i_();
         this.I = !this.t();
      }

      super.a($$0);
   }

   @Override
   public boolean fO() {
      return false;
   }

   @Override
   public bvd e(bwk $$0) {
      return this.v(this.t());
   }

   private bvd v(boolean $$0) {
      if ($$0) {
         return bE;
      } else {
         return this.n_() ? bF : this.aq().n();
      }
   }

   @Override
   public fbx o(float $$0) {
      if (this.t()) {
         fbs $$1 = this.v(false).a(this.ds());
         ji $$2 = this.du();
         int $$3 = Integer.MIN_VALUE;

         for (ji $$4 : ji.c(ji.a($$1.a, $$1.b, $$1.c), ji.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dU().a(dhi.b, $$4), this.dU().a(dhi.a, $$4));
            if ($$5 == 15) {
               return fbx.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fbx.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.vH);
   }

   @Override
   public boolean ey() {
      return !this.co() && !this.t();
   }
}
