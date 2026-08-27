import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzg extends bkj {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final it bL = new it(0.0F, 0.0F, 0.0F);
   private static final it bM = new it(0.0F, 0.0F, 0.0F);
   private static final it bN = new it(-10.0F, 0.0F, -10.0F);
   private static final it bO = new it(-15.0F, 0.0F, 10.0F);
   private static final it bP = new it(-1.0F, 0.0F, -1.0F);
   private static final it bQ = new it(1.0F, 0.0F, 1.0F);
   private static final bju bR = new bju(0.0F, 0.0F, true);
   private static final bju bS = bjx.d.n().a(0.5F);
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
   public static final afc<Byte> bC = aff.a(bzg.class, afe.a);
   public static final afc<it> bD = aff.a(bzg.class, afe.m);
   public static final afc<it> bE = aff.a(bzg.class, afe.m);
   public static final afc<it> bF = aff.a(bzg.class, afe.m);
   public static final afc<it> bG = aff.a(bzg.class, afe.m);
   public static final afc<it> bH = aff.a(bzg.class, afe.m);
   public static final afc<it> bI = aff.a(bzg.class, afe.m);
   private static final Predicate<bjt> bX = $$0 -> $$0 instanceof ceo && ((ceo)$$0).v() == ceo.a.a;
   private final il<ckj> bY = il.a(2, ckj.b);
   private final il<ckj> bZ = il.a(4, ckj.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private it cc = bL;
   private it cd = bM;
   private it ce = bN;
   private it cf = bO;
   private it cg = bP;
   private it ch = bQ;

   public bzg(bjx<? extends bzg> $$0, cqz $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public bzg(cqz $$0, double $$1, double $$2, double $$3) {
      this(bjx.d, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   public void j_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.j_();
      this.e($$0, $$1, $$2);
   }

   private boolean G() {
      return !this.y() && !this.aT();
   }

   @Override
   public boolean cX() {
      return super.cX() && this.G();
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
   public Iterable<ckj> bJ() {
      return this.bY;
   }

   @Override
   public Iterable<ckj> bK() {
      return this.bZ;
   }

   @Override
   public ckj c(bjy $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return ckj.b;
      }
   }

   @Override
   public void a(bjy $$0, ckj $$1) {
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
   public boolean f(ckj $$0) {
      bjy $$1 = bkl.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      rz $$1 = new rz();

      for (ckj $$2 : this.bZ) {
         rt $$3 = new rt();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      rz $$4 = new rz();

      for (ckj $$5 : this.bY) {
         rt $$6 = new rt();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.cd());
      $$0.a("Small", this.s());
      $$0.a("ShowArms", this.t());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.w());
      if (this.y()) {
         $$0.a("Marker", this.y());
      }

      $$0.a("Pose", this.I());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         rz $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, ckj.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         rz $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, ckj.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.G();
      rt $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(rt $$0) {
      rz $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new it($$1));
      rz $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new it($$2));
      rz $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new it($$3));
      rz $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new it($$4));
      rz $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new it($$5));
      rz $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new it($$6));
   }

   private rt I() {
      rt $$0 = new rt();
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
   public boolean bs() {
      return false;
   }

   @Override
   protected void D(bjt $$0) {
   }

   @Override
   protected void fi() {
      for (bjt $$1 : this.dL().a(this, this.cG(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bib a(ccx $$0, eif $$1, bia $$2) {
      ckj $$3 = $$0.b($$2);
      if (this.y() || $$3.a(ckm.tR)) {
         return bib.d;
      } else if ($$0.N_()) {
         return bib.a;
      } else if ($$0.dL().B) {
         return bib.b;
      } else {
         bjy $$4 = bkl.h($$3);
         if ($$3.b()) {
            bjy $$5 = this.j($$1);
            bjy $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bib.a;
            }
         } else {
            if (this.e($$4)) {
               return bib.e;
            }

            if ($$4.a() == bjy.a.a && !this.t()) {
               return bib.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bib.a;
            }
         }

         return bib.d;
      }
   }

   private bjy j(eif $$0) {
      bjy $$1 = bjy.a;
      boolean $$2 = this.s();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bjy $$4 = bjy.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bjy.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bjy.e)) {
         $$1 = bjy.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bjy.d)) {
         $$1 = bjy.d;
      } else if ($$3 >= 1.6 && this.b(bjy.f)) {
         $$1 = bjy.f;
      } else if (!this.b(bjy.a) && this.b(bjy.b)) {
         $$1 = bjy.b;
      }

      return $$1;
   }

   private boolean e(bjy $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == bjy.a.a && !this.t();
   }

   private boolean a(ccx $$0, bjy $$1, ckj $$2, bia $$3) {
      ckj $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fT().d && $$4.b() && !$$2.b()) {
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
   public boolean a(bir $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return false;
      } else if ($$0.a(aqu.d)) {
         this.aj();
         return false;
      } else if (this.b($$0) || this.ca || this.y()) {
         return false;
      } else if ($$0.a(aqu.l)) {
         this.i($$0);
         this.aj();
         return false;
      } else if ($$0.a(aqu.u)) {
         if (this.bM()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(aqu.v) && this.eu() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(aqu.B);
         boolean $$3 = $$0.a(aqu.A);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof ccx $$4 && !$$4.fT().e) {
               return false;
            }

            if ($$0.g()) {
               this.L();
               this.K();
               this.aj();
               return true;
            } else {
               long $$5 = this.dL().V();
               if ($$5 - this.bJ > 5L && !$$3) {
                  this.dL().a(this, (byte)32);
                  this.a(dkl.o, $$0.d());
                  this.bJ = $$5;
               } else {
                  this.h($$0);
                  this.K();
                  this.aj();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dL().B) {
            this.dL().a(this.dq(), this.ds(), this.dw(), aqd.an, this.da(), 0.3F, 1.0F, false);
            this.bJ = this.dL().V();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void K() {
      if (this.dL() instanceof alq) {
         ((alq)this.dL())
            .a(
               new jk(js.c, cuc.n.o()),
               this.dq(),
               this.e(0.6666666666666666),
               this.dw(),
               10,
               (double)(this.df() / 4.0F),
               (double)(this.dg() / 4.0F),
               (double)(this.df() / 4.0F),
               0.05
            );
      }
   }

   private void g(bir $$0, float $$1) {
      float $$2 = this.eu();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.aj();
      } else {
         this.c($$2);
         this.a(dkl.o, $$0.d());
      }
   }

   private void h(bir $$0) {
      ckj $$1 = new ckj(ckm.tL);
      if (this.ac()) {
         $$1.a(this.ad());
      }

      cua.a(this.dL(), this.dl(), $$1);
      this.i($$0);
   }

   private void i(bir $$0) {
      this.L();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         ckj $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            cua.a(this.dL(), this.dl().c(), $$2);
            this.bY.set($$1, ckj.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         ckj $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            cua.a(this.dL(), this.dl().c(), $$4);
            this.bZ.set($$3, ckj.b);
         }
      }
   }

   private void L() {
      this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.al, this.da(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dB();
      return 0.0F;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * (this.n_() ? 0.5F : 0.9F);
   }

   @Override
   public void h(eif $$0) {
      if (this.G()) {
         super.h($$0);
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
   protected void H() {
      this.j(this.ca);
   }

   @Override
   public void j(boolean $$0) {
      this.ca = $$0;
      super.j($$0);
   }

   @Override
   public boolean n_() {
      return this.s();
   }

   @Override
   public void aj() {
      this.a(bjt.c.a);
      this.a(dkl.p);
   }

   @Override
   public boolean cL() {
      return this.cd();
   }

   @Override
   public ebj r_() {
      return this.y() ? ebj.d : super.r_();
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   private void t(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 1, $$0));
   }

   public boolean s() {
      return (this.an.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 4, $$0));
   }

   public boolean t() {
      return (this.an.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 8, $$0));
   }

   @Override
   public boolean w() {
      return (this.an.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 16, $$0));
   }

   public boolean y() {
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

   public it z() {
      return this.cc;
   }

   public it A() {
      return this.cd;
   }

   public it B() {
      return this.ce;
   }

   public it C() {
      return this.cf;
   }

   public it E() {
      return this.cg;
   }

   public it F() {
      return this.ch;
   }

   @Override
   public boolean br() {
      return super.br() && !this.y();
   }

   @Override
   public boolean u(bjt $$0) {
      return $$0 instanceof ccx && !this.dL().a((ccx)$$0, this.dl());
   }

   @Override
   public bkd fm() {
      return bkd.b;
   }

   @Override
   public bkj.a eF() {
      return new bkj.a(aqd.am, aqd.am);
   }

   @Nullable
   @Override
   protected aqc d(bir $$0) {
      return aqd.an;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.al;
   }

   @Override
   public void a(alq $$0, bki $$1) {
   }

   @Override
   public boolean fy() {
      return false;
   }

   @Override
   public void a(afc<?> $$0) {
      if (bC.equals($$0)) {
         this.j_();
         this.I = !this.y();
      }

      super.a($$0);
   }

   @Override
   public boolean fz() {
      return false;
   }

   @Override
   public bju a(bkv $$0) {
      return this.v(this.y());
   }

   private bju v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.n_() ? bS : this.ag().n();
      }
   }

   @Override
   public eif k(float $$0) {
      if (this.y()) {
         eia $$1 = this.v(false).a(this.dj());
         ht $$2 = this.dl();
         int $$3 = Integer.MIN_VALUE;

         for (ht $$4 : ht.a(ht.a($$1.a, $$1.b, $$1.c), ht.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dL().a(cri.b, $$4), this.dL().a(cri.a, $$4));
            if ($$5 == 15) {
               return eif.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return eif.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public ckj dy() {
      return new ckj(ckm.tL);
   }

   @Override
   public boolean eo() {
      return !this.cd() && !this.y();
   }
}
