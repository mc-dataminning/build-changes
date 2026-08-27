import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cai extends bll {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final ix bL = new ix(0.0F, 0.0F, 0.0F);
   private static final ix bM = new ix(0.0F, 0.0F, 0.0F);
   private static final ix bN = new ix(-10.0F, 0.0F, -10.0F);
   private static final ix bO = new ix(-15.0F, 0.0F, 10.0F);
   private static final ix bP = new ix(-1.0F, 0.0F, -1.0F);
   private static final ix bQ = new ix(1.0F, 0.0F, 1.0F);
   private static final bkw bR = new bkw(0.0F, 0.0F, true);
   private static final bkw bS = bkz.d.n().a(0.5F);
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
   public static final afs<Byte> bC = afv.a(cai.class, afu.a);
   public static final afs<ix> bD = afv.a(cai.class, afu.m);
   public static final afs<ix> bE = afv.a(cai.class, afu.m);
   public static final afs<ix> bF = afv.a(cai.class, afu.m);
   public static final afs<ix> bG = afv.a(cai.class, afu.m);
   public static final afs<ix> bH = afv.a(cai.class, afu.m);
   public static final afs<ix> bI = afv.a(cai.class, afu.m);
   private static final Predicate<bkv> bX = $$0 -> $$0 instanceof cfq && ((cfq)$$0).w() == cfq.a.a;
   private final ip<clo> bY = ip.a(2, clo.b);
   private final ip<clo> bZ = ip.a(4, clo.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private ix cc = bL;
   private ix cd = bM;
   private ix ce = bN;
   private ix cf = bO;
   private ix cg = bP;
   private ix ch = bQ;

   public cai(bkz<? extends cai> $$0, csf $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public cai(csf $$0, double $$1, double $$2, double $$3) {
      this(bkz.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public void k_() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.k_();
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
   protected void c_() {
      super.c_();
      this.an.a(bC, (byte)0);
      this.an.a(bD, bL);
      this.an.a(bE, bM);
      this.an.a(bF, bN);
      this.an.a(bG, bO);
      this.an.a(bH, bP);
      this.an.a(bI, bQ);
   }

   @Override
   public Iterable<clo> bK() {
      return this.bY;
   }

   @Override
   public Iterable<clo> bL() {
      return this.bZ;
   }

   @Override
   public clo c(bla $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return clo.b;
      }
   }

   @Override
   public void a(bla $$0, clo $$1) {
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
   public boolean f(clo $$0) {
      bla $$1 = bln.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      sj $$1 = new sj();

      for (clo $$2 : this.bZ) {
         sd $$3 = new sd();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      sj $$4 = new sj();

      for (clo $$5 : this.bY) {
         sd $$6 = new sd();
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
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         sj $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, clo.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         sj $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, clo.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.I();
      sd $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(sd $$0) {
      sj $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new ix($$1));
      sj $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new ix($$2));
      sj $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new ix($$3));
      sj $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new ix($$4));
      sj $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new ix($$5));
      sj $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new ix($$6));
   }

   private sd K() {
      sd $$0 = new sd();
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
   protected void D(bkv $$0) {
   }

   @Override
   protected void M_() {
      for (bkv $$1 : this.dN().a(this, this.cH(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bjb a(cdz $$0, ejz $$1, bja $$2) {
      clo $$3 = $$0.b($$2);
      if (this.A() || $$3.a(clr.uD)) {
         return bjb.d;
      } else if ($$0.P_()) {
         return bjb.a;
      } else if ($$0.dN().B) {
         return bjb.b;
      } else {
         bla $$4 = bln.h($$3);
         if ($$3.b()) {
            bla $$5 = this.j($$1);
            bla $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bjb.a;
            }
         } else {
            if (this.e($$4)) {
               return bjb.e;
            }

            if ($$4.a() == bla.a.a && !this.w()) {
               return bjb.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bjb.a;
            }
         }

         return bjb.d;
      }
   }

   private bla j(ejz $$0) {
      bla $$1 = bla.a;
      boolean $$2 = this.u();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bla $$4 = bla.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bla.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bla.e)) {
         $$1 = bla.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bla.d)) {
         $$1 = bla.d;
      } else if ($$3 >= 1.6 && this.b(bla.f)) {
         $$1 = bla.f;
      } else if (!this.b(bla.a) && this.b(bla.b)) {
         $$1 = bla.b;
      }

      return $$1;
   }

   private boolean e(bla $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == bla.a.a && !this.w();
   }

   private boolean a(cdz $$0, bla $$1, clo $$2, bja $$3) {
      clo $$4 = this.c($$1);
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
   public boolean a(bjt $$0, float $$1) {
      if (this.dN().B || this.dI()) {
         return false;
      } else if ($$0.a(arm.d)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.ca || this.A()) {
         return false;
      } else if ($$0.a(arm.l)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(arm.u)) {
         if (this.bN()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(arm.v) && this.ew() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(arm.B);
         boolean $$3 = $$0.a(arm.A);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cdz $$4 && !$$4.fU().e) {
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
                  this.a(dlx.o, $$0.d());
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
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.an, this.dc(), 0.3F, 1.0F, false);
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
      if (this.dN() instanceof ami) {
         ((ami)this.dN())
            .a(
               new jo(jw.c, cvh.n.o()),
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

   private void g(bjt $$0, float $$1) {
      float $$2 = this.ew();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.c($$2);
         this.a(dlx.o, $$0.d());
      }
   }

   private void h(bjt $$0) {
      clo $$1 = new clo(clr.ux);
      if (this.ae()) {
         $$1.a(this.af());
      }

      cvf.a(this.dN(), this.dn(), $$1);
      this.i($$0);
   }

   private void i(bjt $$0) {
      this.N();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         clo $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            cvf.a(this.dN(), this.dn().c(), $$2);
            this.bY.set($$1, clo.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         clo $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            cvf.a(this.dN(), this.dn().c(), $$4);
            this.bZ.set($$3, clo.b);
         }
      }
   }

   private void N() {
      this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.al, this.dc(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dD();
      return 0.0F;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * (this.o_() ? 0.5F : 0.9F);
   }

   @Override
   public void a(ejz $$0) {
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
      ix $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      ix $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      ix $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      ix $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      ix $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      ix $$5 = this.an.b(bI);
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
   public boolean o_() {
      return this.u();
   }

   @Override
   public void al() {
      this.a(bkv.c.a);
      this.a(dlx.p);
   }

   @Override
   public boolean cM() {
      return this.ce();
   }

   @Override
   public edc s_() {
      return this.A() ? edc.d : super.s_();
   }

   @Override
   public boolean r_() {
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

   public void a(ix $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(ix $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(ix $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(ix $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(ix $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(ix $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public ix B() {
      return this.cc;
   }

   public ix C() {
      return this.cd;
   }

   public ix D() {
      return this.ce;
   }

   public ix E() {
      return this.cf;
   }

   public ix G() {
      return this.cg;
   }

   public ix H() {
      return this.ch;
   }

   @Override
   public boolean bt() {
      return super.bt() && !this.A();
   }

   @Override
   public boolean u(bkv $$0) {
      return $$0 instanceof cdz && !this.dN().a((cdz)$$0, this.dn());
   }

   @Override
   public blf fn() {
      return blf.b;
   }

   @Override
   public bll.a eH() {
      return new bll.a(aqv.am, aqv.am);
   }

   @Nullable
   @Override
   protected aqu d(bjt $$0) {
      return aqv.an;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.al;
   }

   @Override
   public void a(ami $$0, blk $$1) {
   }

   @Override
   public boolean fz() {
      return false;
   }

   @Override
   public void a(afs<?> $$0) {
      if (bC.equals($$0)) {
         this.k_();
         this.I = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fA() {
      return false;
   }

   @Override
   public bkw a(blx $$0) {
      return this.v(this.A());
   }

   private bkw v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.o_() ? bS : this.ai().n();
      }
   }

   @Override
   public ejz k(float $$0) {
      if (this.A()) {
         eju $$1 = this.v(false).a(this.dl());
         hx $$2 = this.dn();
         int $$3 = Integer.MIN_VALUE;

         for (hx $$4 : hx.a(hx.a($$1.a, $$1.b, $$1.c), hx.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dN().a(cso.b, $$4), this.dN().a(cso.a, $$4));
            if ($$5 == 15) {
               return ejz.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ejz.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public clo dA() {
      return new clo(clr.ux);
   }

   @Override
   public boolean eq() {
      return !this.ce() && !this.A();
   }
}
