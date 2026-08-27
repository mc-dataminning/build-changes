import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cad extends blg {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final it bL = new it(0.0F, 0.0F, 0.0F);
   private static final it bM = new it(0.0F, 0.0F, 0.0F);
   private static final it bN = new it(-10.0F, 0.0F, -10.0F);
   private static final it bO = new it(-15.0F, 0.0F, 10.0F);
   private static final it bP = new it(-1.0F, 0.0F, -1.0F);
   private static final it bQ = new it(1.0F, 0.0F, 1.0F);
   private static final bkr bR = new bkr(0.0F, 0.0F, true);
   private static final bkr bS = bku.d.n().a(0.5F);
   private static final double bT = 0.1;
   private static final double bU = 0.9;
   private static final double bV = 0.4;
   private static final double bW = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int bA = 8;
   public static final int bB = 16;
   public static final afo<Byte> bC = afr.a(cad.class, afq.a);
   public static final afo<it> bD = afr.a(cad.class, afq.m);
   public static final afo<it> bE = afr.a(cad.class, afq.m);
   public static final afo<it> bF = afr.a(cad.class, afq.m);
   public static final afo<it> bG = afr.a(cad.class, afq.m);
   public static final afo<it> bH = afr.a(cad.class, afq.m);
   public static final afo<it> bI = afr.a(cad.class, afq.m);
   private static final Predicate<bkq> bX = $$0 -> $$0 instanceof cfl && ((cfl)$$0).w() == cfl.a.a;
   private final il<clj> bY = il.a(2, clj.b);
   private final il<clj> bZ = il.a(4, clj.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private it cc = bL;
   private it cd = bM;
   private it ce = bN;
   private it cf = bO;
   private it cg = bP;
   private it ch = bQ;

   public cad(bku<? extends cad> $$0, csa $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public cad(csa $$0, double $$1, double $$2, double $$3) {
      this(bku.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public void j_() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean I() {
      return !this.A() && !this.aV();
   }

   @Override
   public boolean cZ() {
      return super.cZ() && this.I();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bC, (byte)0);
      this.an.a(bD, bL);
      this.an.a(bE, bM);
      this.an.a(bF, bN);
      this.an.a(bG, bO);
      this.an.a(bH, bP);
      this.an.a(bI, bQ);
   }

   @Override
   public Iterable<clj> bK() {
      return this.bY;
   }

   @Override
   public Iterable<clj> bL() {
      return this.bZ;
   }

   @Override
   public clj c(bkv $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return clj.b;
      }
   }

   @Override
   public void a(bkv $$0, clj $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bY.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(clj $$0) {
      bkv $$1 = bli.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      sf $$1 = new sf();

      for (clj $$2 : this.bZ) {
         rz $$3 = new rz();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      sf $$4 = new sf();

      for (clj $$5 : this.bY) {
         rz $$6 = new rz();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.ce());
      $$0.a("Small", this.u());
      $$0.a("ShowArms", this.w());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.y());
      if (this.A()) {
         $$0.a("Marker", this.A());
      }

      $$0.a("Pose", this.K());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         sf $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, clj.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         sf $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, clj.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.I();
      rz $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(rz $$0) {
      sf $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new it($$1));
      sf $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new it($$2));
      sf $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new it($$3));
      sf $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new it($$4));
      sf $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new it($$5));
      sf $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new it($$6));
   }

   private rz K() {
      rz $$0 = new rz();
      if (!bL.equals(this.cc)) {
         $$0.a("Head", this.cc.a());
      }

      if (!bM.equals(this.cd)) {
         $$0.a("Body", this.cd.a());
      }

      if (!bN.equals(this.ce)) {
         $$0.a("LeftArm", this.ce.a());
      }

      if (!bO.equals(this.cf)) {
         $$0.a("RightArm", this.cf.a());
      }

      if (!bP.equals(this.cg)) {
         $$0.a("LeftLeg", this.cg.a());
      }

      if (!bQ.equals(this.ch)) {
         $$0.a("RightLeg", this.ch.a());
      }

      return $$0;
   }

   @Override
   public boolean bu() {
      return false;
   }

   @Override
   protected void D(bkq $$0) {
   }

   @Override
   protected void L_() {
      for (bkq $$1 : this.dN().a(this, this.cH(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bix a(cdu $$0, eju $$1, biw $$2) {
      clj $$3 = $$0.b($$2);
      if (this.A() || $$3.a(clm.uD)) {
         return bix.d;
      } else if ($$0.O_()) {
         return bix.a;
      } else if ($$0.dN().B) {
         return bix.b;
      } else {
         bkv $$4 = bli.h($$3);
         if ($$3.b()) {
            bkv $$5 = this.j($$1);
            bkv $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bix.a;
            }
         } else {
            if (this.e($$4)) {
               return bix.e;
            }

            if ($$4.a() == bkv.a.a && !this.w()) {
               return bix.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bix.a;
            }
         }

         return bix.d;
      }
   }

   private bkv j(eju $$0) {
      bkv $$1 = bkv.a;
      boolean $$2 = this.u();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bkv $$4 = bkv.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bkv.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bkv.e)) {
         $$1 = bkv.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bkv.d)) {
         $$1 = bkv.d;
      } else if ($$3 >= 1.6 && this.b(bkv.f)) {
         $$1 = bkv.f;
      } else if (!this.b(bkv.a) && this.b(bkv.b)) {
         $$1 = bkv.b;
      }

      return $$1;
   }

   private boolean e(bkv $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == bkv.a.a && !this.w();
   }

   private boolean a(cdu $$0, bkv $$1, clj $$2, biw $$3) {
      clj $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fU().d && $$4.b() && !$$2.b()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.b() || $$2.L() <= 1) {
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
   public boolean a(bjo $$0, float $$1) {
      if (this.dN().B || this.dI()) {
         return false;
      } else if ($$0.a(ari.d)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.ca || this.A()) {
         return false;
      } else if ($$0.a(ari.l)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(ari.u)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(ari.v) && this.ew() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(ari.B);
         boolean $$3 = $$0.a(ari.A);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cdu $$4 && !$$4.fU().e) {
               return false;
            }

            if ($$0.g()) {
               this.N();
               this.M();
               this.al();
               return true;
            } else {
               long $$5 = this.dN().W();
               if ($$5 - this.bJ > 5L && !$$3) {
                  this.dN().a(this, (byte)32);
                  this.a(dls.o, $$0.d());
                  this.bJ = $$5;
               } else {
                  this.h($$0);
                  this.M();
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
         if (this.dN().B) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.an, this.dc(), 0.3F, 1.0F, false);
            this.bJ = this.dN().W();
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

   private void M() {
      if (this.dN() instanceof ame) {
         ((ame)this.dN())
            .a(
               new jk(js.c, cvc.n.o()),
               this.ds(),
               this.e(0.6666666666666666),
               this.dy(),
               10,
               (double)(this.dh() / 4.0F),
               (double)(this.di() / 4.0F),
               (double)(this.dh() / 4.0F),
               0.05
            );
      }
   }

   private void g(bjo $$0, float $$1) {
      float $$2 = this.ew();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.c($$2);
         this.a(dls.o, $$0.d());
      }
   }

   private void h(bjo $$0) {
      clj $$1 = new clj(clm.ux);
      if (this.ae()) {
         $$1.a(this.af());
      }

      cva.a(this.dN(), this.dn(), $$1);
      this.i($$0);
   }

   private void i(bjo $$0) {
      this.N();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         clj $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            cva.a(this.dN(), this.dn().c(), $$2);
            this.bY.set($$1, clj.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         clj $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            cva.a(this.dN(), this.dn().c(), $$4);
            this.bZ.set($$3, clj.b);
         }
      }
   }

   private void N() {
      this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.al, this.dc(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dD();
      return 0.0F;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * (this.n_() ? 0.5F : 0.9F);
   }

   @Override
   public void a(eju $$0) {
      if (this.I()) {
         super.a($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.aV = this.N = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void n(float $$0) {
      this.aV = this.N = $$0;
      this.aX = this.aW = $$0;
   }

   @Override
   public void l() {
      super.l();
      it $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      it $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      it $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      it $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      it $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      it $$5 = this.an.b(bI);
      if (!this.ch.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void J() {
      this.j(this.ca);
   }

   @Override
   public void j(boolean $$0) {
      this.ca = $$0;
      super.j($$0);
   }

   @Override
   public boolean n_() {
      return this.u();
   }

   @Override
   public void al() {
      this.a(bkq.c.a);
      this.a(dls.p);
   }

   @Override
   public boolean cM() {
      return this.ce();
   }

   @Override
   public ecx r_() {
      return this.A() ? ecx.d : super.r_();
   }

   @Override
   public boolean q_() {
      return this.A();
   }

   private void t(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 1, $$0));
   }

   @Override
   public boolean u() {
      return (this.an.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 4, $$0));
   }

   public boolean w() {
      return (this.an.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 8, $$0));
   }

   public boolean y() {
      return (this.an.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 16, $$0));
   }

   public boolean A() {
      return (this.an.b(bC) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(it $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(it $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(it $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(it $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(it $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(it $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public it B() {
      return this.cc;
   }

   public it C() {
      return this.cd;
   }

   public it D() {
      return this.ce;
   }

   public it E() {
      return this.cf;
   }

   public it G() {
      return this.cg;
   }

   public it H() {
      return this.ch;
   }

   @Override
   public boolean bt() {
      return super.bt() && !this.A();
   }

   @Override
   public boolean u(bkq $$0) {
      return $$0 instanceof cdu && !this.dN().a((cdu)$$0, this.dn());
   }

   @Override
   public bla fn() {
      return bla.b;
   }

   @Override
   public blg.a eH() {
      return new blg.a(aqr.am, aqr.am);
   }

   @Nullable
   @Override
   protected aqq d(bjo $$0) {
      return aqr.an;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.al;
   }

   @Override
   public void a(ame $$0, blf $$1) {
   }

   @Override
   public boolean fz() {
      return false;
   }

   @Override
   public void a(afo<?> $$0) {
      if (bC.equals($$0)) {
         this.j_();
         this.I = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fA() {
      return false;
   }

   @Override
   public bkr a(bls $$0) {
      return this.v(this.A());
   }

   private bkr v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.n_() ? bS : this.ai().n();
      }
   }

   @Override
   public eju k(float $$0) {
      if (this.A()) {
         ejp $$1 = this.v(false).a(this.dl());
         ht $$2 = this.dn();
         int $$3 = Integer.MIN_VALUE;

         for (ht $$4 : ht.a(ht.a($$1.a, $$1.b, $$1.c), ht.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dN().a(csj.b, $$4), this.dN().a(csj.a, $$4));
            if ($$5 == 15) {
               return eju.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return eju.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public clj dA() {
      return new clj(clm.ux);
   }

   @Override
   public boolean eq() {
      return !this.ce() && !this.A();
   }
}
