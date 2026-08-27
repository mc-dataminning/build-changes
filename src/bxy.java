import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxy extends bjb {
   public static final int b = 5;
   private static final boolean bK = true;
   private static final hy bL = new hy(0.0F, 0.0F, 0.0F);
   private static final hy bM = new hy(0.0F, 0.0F, 0.0F);
   private static final hy bN = new hy(-10.0F, 0.0F, -10.0F);
   private static final hy bO = new hy(-15.0F, 0.0F, 10.0F);
   private static final hy bP = new hy(-1.0F, 0.0F, -1.0F);
   private static final hy bQ = new hy(1.0F, 0.0F, 1.0F);
   private static final bim bR = new bim(0.0F, 0.0F, true);
   private static final bim bS = bip.d.n().a(0.5F);
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
   public static final aec<Byte> bC = aef.a(bxy.class, aee.a);
   public static final aec<hy> bD = aef.a(bxy.class, aee.m);
   public static final aec<hy> bE = aef.a(bxy.class, aee.m);
   public static final aec<hy> bF = aef.a(bxy.class, aee.m);
   public static final aec<hy> bG = aef.a(bxy.class, aee.m);
   public static final aec<hy> bH = aef.a(bxy.class, aee.m);
   public static final aec<hy> bI = aef.a(bxy.class, aee.m);
   private static final Predicate<bil> bX = $$0 -> $$0 instanceof cdg && ((cdg)$$0).t() == cdg.a.a;
   private final hp<cja> bY = hp.a(2, cja.b);
   private final hp<cja> bZ = hp.a(4, cja.b);
   private boolean ca;
   public long bJ;
   private int cb;
   private hy cc = bL;
   private hy cd = bM;
   private hy ce = bN;
   private hy cf = bO;
   private hy cg = bP;
   private hy ch = bQ;

   public bxy(bip<? extends bxy> $$0, cpq $$1) {
      super($$0, $$1);
      this.t(0.0F);
   }

   public bxy(cpq $$0, double $$1, double $$2, double $$3) {
      this(bip.d, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   public void e_() {
      double $$0 = this.dp();
      double $$1 = this.dr();
      double $$2 = this.dv();
      super.e_();
      this.e($$0, $$1, $$2);
   }

   private boolean D() {
      return !this.t() && !this.aT();
   }

   @Override
   public boolean cX() {
      return super.cX() && this.D();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bC, (byte)0);
      this.an.a(bD, bL);
      this.an.a(bE, bM);
      this.an.a(bF, bN);
      this.an.a(bG, bO);
      this.an.a(bH, bP);
      this.an.a(bI, bQ);
   }

   @Override
   public Iterable<cja> bJ() {
      return this.bY;
   }

   @Override
   public Iterable<cja> bK() {
      return this.bZ;
   }

   @Override
   public cja c(biq $$0) {
      switch ($$0.a()) {
         case a:
            return this.bY.get($$0.b());
         case b:
            return this.bZ.get($$0.b());
         default:
            return cja.b;
      }
   }

   @Override
   public void a(biq $$0, cja $$1) {
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
   public boolean f(cja $$0) {
      biq $$1 = bjd.h($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      ra $$1 = new ra();

      for (cja $$2 : this.bZ) {
         qu $$3 = new qu();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", $$1);
      ra $$4 = new ra();

      for (cja $$5 : this.bY) {
         qu $$6 = new qu();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", $$4);
      $$0.a("Invisible", this.cd());
      $$0.a("Small", this.p());
      $$0.a("ShowArms", this.q());
      $$0.a("DisabledSlots", this.cb);
      $$0.a("NoBasePlate", this.r());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", this.E());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         ra $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
            this.bZ.set($$2, cja.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ra $$3 = $$0.c("HandItems", 10);

         for (int $$4 = 0; $$4 < this.bY.size(); $$4++) {
            this.bY.set($$4, cja.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cb = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.af = !this.D();
      qu $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(qu $$0) {
      ra $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bL : new hy($$1));
      ra $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bM : new hy($$2));
      ra $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bN : new hy($$3));
      ra $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bO : new hy($$4));
      ra $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bP : new hy($$5));
      ra $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bQ : new hy($$6));
   }

   private qu E() {
      qu $$0 = new qu();
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
   protected void D(bil $$0) {
   }

   @Override
   protected void fg() {
      for (bil $$1 : this.dK().a(this, this.cG(), bX)) {
         if (this.f($$1) <= 0.2) {
            $$1.g(this);
         }
      }
   }

   @Override
   public bgt a(cbp $$0, ehi $$1, bgs $$2) {
      cja $$3 = $$0.b($$2);
      if (this.t() || $$3.a(cjd.tR)) {
         return bgt.d;
      } else if ($$0.G_()) {
         return bgt.a;
      } else if ($$0.dK().B) {
         return bgt.b;
      } else {
         biq $$4 = bjd.h($$3);
         if ($$3.b()) {
            biq $$5 = this.j($$1);
            biq $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bgt.a;
            }
         } else {
            if (this.e($$4)) {
               return bgt.e;
            }

            if ($$4.a() == biq.a.a && !this.q()) {
               return bgt.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bgt.a;
            }
         }

         return bgt.d;
      }
   }

   private biq j(ehi $$0) {
      biq $$1 = biq.a;
      boolean $$2 = this.p();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      biq $$4 = biq.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = biq.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(biq.e)) {
         $$1 = biq.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(biq.d)) {
         $$1 = biq.d;
      } else if ($$3 >= 1.6 && this.b(biq.f)) {
         $$1 = biq.f;
      } else if (!this.b(biq.a) && this.b(biq.b)) {
         $$1 = biq.b;
      }

      return $$1;
   }

   private boolean e(biq $$0) {
      return (this.cb & 1 << $$0.d()) != 0 || $$0.a() == biq.a.a && !this.q();
   }

   private boolean a(cbp $$0, biq $$1, cja $$2, bgs $$3) {
      cja $$4 = this.c($$1);
      if (!$$4.b() && (this.cb & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cb & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fR().d && $$4.b() && !$$2.b()) {
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
   public boolean a(bhj $$0, float $$1) {
      if (this.dK().B || this.dF()) {
         return false;
      } else if ($$0.a(apq.d)) {
         this.aj();
         return false;
      } else if (this.b($$0) || this.ca || this.t()) {
         return false;
      } else if ($$0.a(apq.l)) {
         this.i($$0);
         this.aj();
         return false;
      } else if ($$0.a(apq.u)) {
         if (this.bM()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(apq.v) && this.et() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cbv;
         boolean $$3 = $$2 && ((cbv)$$0.c()).w() > 0;
         boolean $$4 = "player".equals($$0.e());
         if (!$$4 && !$$2) {
            return false;
         } else {
            if ($$0.d() instanceof cbp $$5 && !$$5.fR().e) {
               return false;
            }

            if ($$0.g()) {
               this.H();
               this.F();
               this.aj();
               return $$3;
            } else {
               long $$6 = this.dK().V();
               if ($$6 - this.bJ > 5L && !$$2) {
                  this.dK().a(this, (byte)32);
                  this.a(djo.o, $$0.d());
                  this.bJ = $$6;
               } else {
                  this.h($$0);
                  this.F();
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
         if (this.dK().B) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aoz.an, this.da(), 0.3F, 1.0F, false);
            this.bJ = this.dK().V();
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

   private void F() {
      if (this.dK() instanceof akn) {
         ((akn)this.dK())
            .a(
               new ip(ix.c, csr.n.n()),
               this.dp(),
               this.e(0.6666666666666666),
               this.dv(),
               10,
               (double)(this.df() / 4.0F),
               (double)(this.dg() / 4.0F),
               (double)(this.df() / 4.0F),
               0.05
            );
      }
   }

   private void g(bhj $$0, float $$1) {
      float $$2 = this.et();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.aj();
      } else {
         this.c($$2);
         this.a(djo.o, $$0.d());
      }
   }

   private void h(bhj $$0) {
      cja $$1 = new cja(cjd.tL);
      if (this.ac()) {
         $$1.a(this.ad());
      }

      csq.a(this.dK(), this.dk(), $$1);
      this.i($$0);
   }

   private void i(bhj $$0) {
      this.H();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.bY.size(); $$1++) {
         cja $$2 = this.bY.get($$1);
         if (!$$2.b()) {
            csq.a(this.dK(), this.dk().c(), $$2);
            this.bY.set($$1, cja.b);
         }
      }

      for (int $$3 = 0; $$3 < this.bZ.size(); $$3++) {
         cja $$4 = this.bZ.get($$3);
         if (!$$4.b()) {
            csq.a(this.dK(), this.dk().c(), $$4);
            this.bZ.set($$3, cja.b);
         }
      }
   }

   private void H() {
      this.dK().a(null, this.dp(), this.dr(), this.dv(), aoz.al, this.da(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aV = this.N;
      this.aU = this.dA();
      return 0.0F;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * (this.i_() ? 0.5F : 0.9F);
   }

   @Override
   public void h(ehi $$0) {
      if (this.D()) {
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
      hy $$0 = this.an.b(bD);
      if (!this.cc.equals($$0)) {
         this.a($$0);
      }

      hy $$1 = this.an.b(bE);
      if (!this.cd.equals($$1)) {
         this.b($$1);
      }

      hy $$2 = this.an.b(bF);
      if (!this.ce.equals($$2)) {
         this.c($$2);
      }

      hy $$3 = this.an.b(bG);
      if (!this.cf.equals($$3)) {
         this.d($$3);
      }

      hy $$4 = this.an.b(bH);
      if (!this.cg.equals($$4)) {
         this.e($$4);
      }

      hy $$5 = this.an.b(bI);
      if (!this.ch.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void G() {
      this.j(this.ca);
   }

   @Override
   public void j(boolean $$0) {
      this.ca = $$0;
      super.j($$0);
   }

   @Override
   public boolean i_() {
      return this.p();
   }

   @Override
   public void aj() {
      this.a(bil.c.a);
      this.a(djo.p);
   }

   @Override
   public boolean cL() {
      return this.cd();
   }

   @Override
   public eam l_() {
      return this.t() ? eam.d : super.l_();
   }

   @Override
   public boolean d_() {
      return this.t();
   }

   private void t(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 1, $$0));
   }

   @Override
   public boolean p() {
      return (this.an.b(bC) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 4, $$0));
   }

   public boolean q() {
      return (this.an.b(bC) & 4) != 0;
   }

   public void s(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 8, $$0));
   }

   public boolean r() {
      return (this.an.b(bC) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.an.b(bC, this.a(this.an.b(bC), 16, $$0));
   }

   public boolean t() {
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

   public void a(hy $$0) {
      this.cc = $$0;
      this.an.b(bD, $$0);
   }

   public void b(hy $$0) {
      this.cd = $$0;
      this.an.b(bE, $$0);
   }

   public void c(hy $$0) {
      this.ce = $$0;
      this.an.b(bF, $$0);
   }

   public void d(hy $$0) {
      this.cf = $$0;
      this.an.b(bG, $$0);
   }

   public void e(hy $$0) {
      this.cg = $$0;
      this.an.b(bH, $$0);
   }

   public void f(hy $$0) {
      this.ch = $$0;
      this.an.b(bI, $$0);
   }

   public hy w() {
      return this.cc;
   }

   public hy x() {
      return this.cd;
   }

   public hy y() {
      return this.ce;
   }

   public hy z() {
      return this.cf;
   }

   public hy A() {
      return this.cg;
   }

   public hy B() {
      return this.ch;
   }

   @Override
   public boolean br() {
      return super.br() && !this.t();
   }

   @Override
   public boolean u(bil $$0) {
      return $$0 instanceof cbp && !this.dK().a((cbp)$$0, this.dk());
   }

   @Override
   public biv fk() {
      return biv.b;
   }

   @Override
   public bjb.a eE() {
      return new bjb.a(aoz.am, aoz.am);
   }

   @Nullable
   @Override
   protected aoy d(bhj $$0) {
      return aoz.an;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.al;
   }

   @Override
   public void a(akn $$0, bja $$1) {
   }

   @Override
   public boolean fw() {
      return false;
   }

   @Override
   public void a(aec<?> $$0) {
      if (bC.equals($$0)) {
         this.e_();
         this.I = !this.t();
      }

      super.a($$0);
   }

   @Override
   public boolean fx() {
      return false;
   }

   @Override
   public bim a(bjn $$0) {
      return this.v(this.t());
   }

   private bim v(boolean $$0) {
      if ($$0) {
         return bR;
      } else {
         return this.i_() ? bS : this.ag().n();
      }
   }

   @Override
   public ehi k(float $$0) {
      if (this.t()) {
         ehd $$1 = this.v(false).a(this.di());
         gw $$2 = this.dk();
         int $$3 = Integer.MIN_VALUE;

         for (gw $$4 : gw.a(gw.a($$1.a, $$1.b, $$1.c), gw.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dK().a(cpz.b, $$4), this.dK().a(cpz.a, $$4));
            if ($$5 == 15) {
               return ehi.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ehi.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cja dx() {
      return new cja(cjd.tL);
   }

   @Override
   public boolean en() {
      return !this.cd() && !this.t();
   }
}
