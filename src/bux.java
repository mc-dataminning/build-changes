import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bux extends bfz {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final hw bL = new hw(0.0F, 0.0F, 0.0F);
   private static final hw bM = new hw(0.0F, 0.0F, 0.0F);
   private static final hw bN = new hw(-10.0F, 0.0F, -10.0F);
   private static final hw bO = new hw(-15.0F, 0.0F, 10.0F);
   private static final hw bP = new hw(-1.0F, 0.0F, -1.0F);
   private static final hw bQ = new hw(1.0F, 0.0F, 1.0F);
   private static final bfk bR = new bfk(0.0F, 0.0F, true);
   private static final bfk bS = bfn.d.n().a(0.5F);
   private static final double bT = 0.1;
   private static final double bU = 0.9;
   private static final double bV = 0.4;
   private static final double bW = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int bB = 16;
   public static final aby<Byte> bC = acb.a(bux.class, aca.a);
   public static final aby<hw> bD = acb.a(bux.class, aca.m);
   public static final aby<hw> bE = acb.a(bux.class, aca.m);
   public static final aby<hw> bF = acb.a(bux.class, aca.m);
   public static final aby<hw> bG = acb.a(bux.class, aca.m);
   public static final aby<hw> bH = acb.a(bux.class, aca.m);
   public static final aby<hw> bI = acb.a(bux.class, aca.m);
   private static final Predicate<bfj> bX = $$0 -> $$0 instanceof caf && ((caf)$$0).t() == caf.a.a;
   private final hn<cfz> bY = hn.a(2, cfz.b);
   private final hn<cfz> bZ = hn.a(4, cfz.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private hw cc = bL;
   private hw cd = bM;
   private hw ce = bN;
   private hw cf = bO;
   private hw cg = bP;
   private hw ch = bQ;

   public bux(bfn<? extends bux> $$0, cmm $$1) {
      super($$0, $$1);
      this.r(0.0F);
   }

   public bux(cmm $$0, double $$1, double $$2, double $$3) {
      this(bfn.d, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   public void d_() {
      double $$0 = this.dn();
      double $$1 = this.dp();
      double $$2 = this.dt();
      super.d_();
      this.e($$0, $$1, $$2);
   }

   private boolean E() {
      return !this.w() && !this.aR();
   }

   @Override
   public boolean cV() {
      return super.cV() && this.E();
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bC, (byte)0);
      this.am.a(bD, bL);
      this.am.a(bE, bM);
      this.am.a(bF, bN);
      this.am.a(bG, bO);
      this.am.a(bH, bP);
      this.am.a(bI, bQ);
   }

   @Override
   public Iterable<cfz> bI() {
      return this.bY;
   }

   @Override
   public Iterable<cfz> bJ() {
      return this.bZ;
   }

   @Override
   public cfz c(bfo $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cfz.b;
      }
   }

   @Override
   public void a(bfo $$0, cfz $$1) {
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
   public boolean f(cfz $$0) {
      bfo $$1 = bgb.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      qx $$1 = new qx();

      for (cfz $$2 : this.bZ) {
         qr $$3 = new qr();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      qx $$4 = new qx();

      for (cfz $$5 : this.bY) {
         qr $$6 = new qr();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.cb());
      $$0.a("Small", this.q());
      $$0.a("ShowArms", this.r());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.s());
      if (this.w()) {
         $$0.a("Marker", this.w());
      }

      $$0.a("Pose", this.G());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         qx $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cfz.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         qx $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cfz.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ae = !this.E();
      qr $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(qr $$0) {
      qx $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new hw($$1));
      qx $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new hw($$2));
      qx $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new hw($$3));
      qx $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new hw($$4));
      qx $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new hw($$5));
      qx $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new hw($$6));
   }

   private qr G() {
      qr $$0 = new qr();
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
   public boolean bp() {
      return false;
   }

   @Override
   protected void A(bfj $$0) {
   }

   @Override
   protected void fd() {
      List<bfj> $$0 = this.dI().a(this, this.cE(), bX);

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         bfj $$2 = $$0.get($$1);
         if (this.f($$2) <= 0.2) {
            $$2.g(this);
         }
      }
   }

   @Override
   public bdx a(byo $$0, eei $$1, bdw $$2) {
      cfz $$3 = $$0.b($$2);
      if (this.w() || $$3.a(cgc.tR)) {
         return bdx.d;
      } else if ($$0.G_()) {
         return bdx.a;
      } else if ($$0.dI().B) {
         return bdx.b;
      } else {
         bfo $$4 = bgb.h($$3);
         if ($$3.b()) {
            bfo $$5 = this.j($$1);
            bfo $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bdx.a;
            }
         } else {
            if (this.e($$4)) {
               return bdx.e;
            }

            if ($$4.a() == bfo.a.a && !this.r()) {
               return bdx.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bdx.a;
            }
         }

         return bdx.d;
      }
   }

   private bfo j(eei $$0) {
      bfo $$1 = bfo.a;
      boolean $$2 = this.q();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bfo $$4 = bfo.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bfo.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bfo.e)) {
         $$1 = bfo.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bfo.d)) {
         $$1 = bfo.d;
      } else if ($$3 >= 1.6 && this.b(bfo.f)) {
         $$1 = bfo.f;
      } else if (!this.b(bfo.a) && this.b(bfo.b)) {
         $$1 = bfo.b;
      }

      return $$1;
   }

   private boolean e(bfo $$0) {
      return (this.cb & 1 << $$0.c()) != 0 || $$0.a() == bfo.a.a && !this.r();
   }

   private boolean a(byo $$0, bfo $$1, cfz $$2, bdw $$3) {
      cfz $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.c() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.c() + 16) != 0) {
         return false;
      } else if ($$0.fO().d && $$4.b() && !$$2.b()) {
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
   public boolean a(ben $$0, float $$1) {
      if (this.dI().B || this.dD()) {
         return false;
      } else if ($$0.a(amy.d)) {
         this.ah();
         return false;
      } else if (this.b($$0) || this.ca || this.w()) {
         return false;
      } else if ($$0.a(amy.l)) {
         this.i($$0);
         this.ah();
         return false;
      } else if ($$0.a(amy.u)) {
         if (this.bL()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(amy.v) && this.er() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof byu;
         boolean $$3 = $$2 && ((byu)$$0.c()).w() > 0;
         boolean $$4 = "player".equals($$0.e());
         if (!$$4 && !$$2) {
            return false;
         } else {
            if ($$0.d() instanceof byo $$5 && !$$5.fO().e) {
               return false;
            }

            if ($$0.g()) {
               this.J();
               this.I();
               this.ah();
               return $$3;
            } else {
               long $$6 = this.dI().V();
               if ($$6 - this.bJ > 5L && !$$2) {
                  this.dI().a(this, (byte)32);
                  this.a(dgl.o, $$0.d());
                  this.bJ = $$6;
               } else {
                  this.h($$0);
                  this.I();
                  this.ah();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dI().B) {
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.an, this.cY(), 0.3F, 1.0F, false);
            this.bJ = this.dI().V();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void I() {
      if (this.dI() instanceof aif) {
         ((aif)this.dI())
            .a(
               new in(iv.c, cpo.n.n()),
               this.dn(),
               this.e(0.6666666666666666),
               this.dt(),
               10,
               (double)(this.dd() / 4.0F),
               (double)(this.de() / 4.0F),
               (double)(this.dd() / 4.0F),
               0.05
            );
      }
   }

   private void g(ben $$0, float $$1) {
      float $$2 = this.er();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.ah();
      } else {
         this.t($$2);
         this.a(dgl.o, $$0.d());
      }
   }

   private void h(ben $$0) {
      cfz $$1 = new cfz(cgc.tL);
      if (this.aa()) {
         $$1.a(this.ab());
      }

      cpn.a(this.dI(), this.di(), $$1);
      this.i($$0);
   }

   private void i(ben $$0) {
      this.J();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         cfz $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            cpn.a(this.dI(), this.di().c(), $$2);
            this.bY.set($$1, cfz.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         cfz $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            cpn.a(this.dI(), this.di().c(), $$4);
            this.bZ.set($$3, cfz.b);
         }
      }
   }

   private void J() {
      this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.al, this.cY(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aW = this.M;
      this.aV = this.dy();
      return 0.0F;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b * (this.h_() ? 0.5F : 0.9F);
   }

   @Override
   public double bw() {
      return this.w() ? 0.0 : 0.1F;
   }

   @Override
   public void h(eei $$0) {
      if (this.E()) {
         super.h($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.aW = this.M = $$0;
      this.aY = this.aX = $$0;
   }

   @Override
   public void n(float $$0) {
      this.aW = this.M = $$0;
      this.aY = this.aX = $$0;
   }

   @Override
   public void l() {
      super.l();
      hw $$0 = this.am.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      hw $$1 = this.am.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      hw $$2 = this.am.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      hw $$3 = this.am.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      hw $$4 = this.am.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      hw $$5 = this.am.b(bI);
      if (!this.ch.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void F() {
      this.j(this.ca);
   }

   @Override
   public void j(boolean $$0) {
      this.ca = $$0;
      super.j($$0);
   }

   @Override
   public boolean h_() {
      return this.q();
   }

   @Override
   public void ah() {
      this.a(bfj.c.a);
      this.a(dgl.p);
   }

   @Override
   public boolean cJ() {
      return this.cb();
   }

   @Override
   public dxj l_() {
      return this.w() ? dxj.d : super.l_();
   }

   @Override
   public boolean c_() {
      return this.w();
   }

   private void t(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 1, $$0));
   }

   public boolean q() {
      return (this.am.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 4, $$0));
   }

   public boolean r() {
      return (this.am.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 8, $$0));
   }

   public boolean s() {
      return (this.am.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.am.b(bC, this.a(this.am.b(bC), 16, $$0));
   }

   public boolean w() {
      return (this.am.b(bC) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(hw $$0) {
      this.cc = $$0;
      this.am.b(bD, $$0);
   }

   public void b(hw $$0) {
      this.cd = $$0;
      this.am.b(bE, $$0);
   }

   public void c(hw $$0) {
      this.ce = $$0;
      this.am.b(bF, $$0);
   }

   public void d(hw $$0) {
      this.cf = $$0;
      this.am.b(bG, $$0);
   }

   public void e(hw $$0) {
      this.cg = $$0;
      this.am.b(bH, $$0);
   }

   public void f(hw $$0) {
      this.ch = $$0;
      this.am.b(bI, $$0);
   }

   public hw x() {
      return this.cc;
   }

   public hw y() {
      return this.cd;
   }

   public hw z() {
      return this.ce;
   }

   public hw A() {
      return this.cf;
   }

   public hw C() {
      return this.cg;
   }

   public hw D() {
      return this.ch;
   }

   @Override
   public boolean bo() {
      return super.bo() && !this.w();
   }

   @Override
   public boolean r(bfj $$0) {
      return $$0 instanceof byo && !this.dI().a((byo)$$0, this.di());
   }

   @Override
   public bft fh() {
      return bft.b;
   }

   @Override
   public bfz.a eC() {
      return new bfz.a(amh.am, amh.am);
   }

   @Nullable
   @Override
   protected amg d(ben $$0) {
      return amh.an;
   }

   @Nullable
   @Override
   protected amg g_() {
      return amh.al;
   }

   @Override
   public void a(aif $$0, bfy $$1) {
   }

   @Override
   public boolean ft() {
      return false;
   }

   @Override
   public void a(aby<?> $$0) {
      if (bC.equals($$0)) {
         this.d_();
         this.H = !this.w();
      }

      super.a($$0);
   }

   @Override
   public boolean fu() {
      return false;
   }

   @Override
   public bfk a(bgl $$0) {
      return this.v(this.w());
   }

   private bfk v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.h_() ? bS : this.ae().n();
      }
   }

   @Override
   public eei k(float $$0) {
      if (this.w()) {
         eed $$1 = this.v(false).a(this.dg());
         gu $$2 = this.di();
         int $$3 = Integer.MIN_VALUE;

         for (gu $$4 : gu.a(gu.a($$1.a, $$1.b, $$1.c), gu.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dI().a(cmv.b, $$4), this.dI().a(cmv.a, $$4));
            if ($$5 == 15) {
               return eei.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return eei.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cfz dv() {
      return new cfz(cgc.tL);
   }

   @Override
   public boolean el() {
      return !this.cb() && !this.w();
   }
}
