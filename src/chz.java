import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class chz extends cfv implements brf, bty, bum, bup, buu {
   public static final int ck = 400;
   public static final int cl = 499;
   public static final int cm = 500;
   public static final double cn = 0.15;
   private static final float bZ = (float)b(() -> 0.0);
   private static final float ca = (float)b(() -> 1.0);
   private static final float cb = (float)a(() -> 0.0);
   private static final float cd = (float)a(() -> 1.0);
   private static final float ce = a($$0 -> 0);
   private static final float cf = a($$0 -> $$0 - 1);
   private static final float cg = 0.25F;
   private static final float ch = 0.5F;
   private static final Predicate<buf> ci = $$0 -> $$0 instanceof chz && ((chz)$$0).gK();
   private static final cev cj = cev.b().a(16.0).d().a(ci);
   private static final akg<Byte> cB = akk.a(chz.class, aki.a);
   private static final int cC = 2;
   private static final int cD = 4;
   private static final int cE = 8;
   private static final int cF = 16;
   private static final int cG = 32;
   private static final int cH = 64;
   public static final int co = 0;
   public static final int cp = 1;
   public static final int cq = 3;
   private int cI;
   private int cJ;
   private int cK;
   public int cr;
   public int cs;
   protected boolean ct;
   protected brr cu;
   protected int cv;
   protected float cw;
   protected boolean cx;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   private float cP;
   private float cQ;
   protected boolean cy = true;
   protected int cz;
   @Nullable
   private UUID cR;
   private final brd cS = new ezp() {
      @Override
      public cvl f() {
         return chz.this.fS();
      }

      @Override
      public void b(cvl $$0) {
         chz.this.n($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cnp $$0) {
         return $$0.dg() == chz.this || $$0.b(chz.this, 4.0);
      }
   };

   protected chz(btq<? extends chz> $$0, dds $$1) {
      super($$0, $$1);
      this.gN();
   }

   @Override
   protected void D() {
      this.bT.a(1, new cbv(this, 1.2));
      this.bT.a(1, new ccg(this, 1.2));
      this.bT.a(2, new cao(this, 1.0, chz.class));
      this.bT.a(4, new cbb(this, 1.0));
      this.bT.a(6, new ccp(this, 0.7));
      this.bT.a(7, new cbk(this, cnp.class, 6.0F));
      this.bT.a(8, new cbx(this));
      if (this.gp()) {
         this.bT.a(9, new cby(this));
      }

      this.gG();
   }

   protected void gG() {
      this.bT.a(0, new caw(this));
      this.bT.a(3, new cck(this, 1.25, $$0 -> $$0.a(axb.ag), false));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cB, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.am.a(cB) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.am.a(cB);
      if ($$1) {
         this.am.a(cB, (byte)($$2 | $$0));
      } else {
         this.am.a(cB, (byte)($$2 & ~$$0));
      }
   }

   public boolean gF() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID Z_() {
      return this.cR;
   }

   public void b(@Nullable UUID $$0) {
      this.cR = $$0;
   }

   public boolean gH() {
      return this.ct;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   public void z(boolean $$0) {
      this.ct = $$0;
   }

   @Override
   public boolean a(btj $$0, float $$1) {
      if ($$1 > 6.0F && this.gI()) {
         this.B(false);
      }

      return true;
   }

   public boolean gI() {
      return this.t(16);
   }

   public boolean gJ() {
      return this.t(32);
   }

   public boolean gK() {
      return this.t(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_() && this.gF();
   }

   @Override
   public void a(cvl $$0, @Nullable awe $$1) {
      this.cu.a(0, $$0);
   }

   public void b(cnp $$0, cvl $$1) {
      if (this.m($$1)) {
         this.n($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gL() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   public int v(int $$0) {
      int $$1 = azc.a(this.gL() + $$0, 0, this.gR());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bF() {
      return !this.bX();
   }

   private void q() {
      this.y();
      if (!this.ba()) {
         awc $$0 = this.gq();
         if ($$0 != null) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), $$0, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      if ($$0 > 1.0F) {
         this.a(awd.mQ, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bX()) {
            for (btj $$4 : this.da()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eM();
         return true;
      }
   }

   public final int gM() {
      return w(this.ae_());
   }

   public static int w(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gN() {
      brr $$0 = this.cu;
      this.cu = new brr(this.gM());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cu.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cvl $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.cu.a($$2, $$3.u());
            }
         }
      }

      this.cu.a(this);
      this.gO();
   }

   protected void gO() {
      if (!this.dS().B) {
         this.d(4, !this.cu.a(0).f());
      }
   }

   @Override
   public void a(brd $$0) {
      boolean $$1 = this.i();
      this.gO();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.ab_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.af.a(3) == 0) {
         this.gV();
      }

      return $$2;
   }

   protected boolean gp() {
      return true;
   }

   @Nullable
   protected awc gq() {
      return null;
   }

   @Nullable
   protected awc gP() {
      return null;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      if (!$$1.n()) {
         dua $$2 = this.dS().a_($$0.d());
         doj $$3 = $$1.A();
         if ($$2.a(dgx.dN)) {
            $$3 = $$2.A();
         }

         if (this.bX() && this.cy) {
            this.cz++;
            if (this.cz > 5 && this.cz % 3 == 0) {
               this.a($$3);
            } else if (this.cz <= 5) {
               this.a(awd.mT, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awd.mT, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awd.mS, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(doj $$0) {
      return $$0 == doj.b || $$0 == doj.aT || $$0 == doj.B || $$0 == doj.aU || $$0 == doj.aS;
   }

   protected void a(doj $$0) {
      this.a(awd.mN, $$0.a() * 0.15F, $$0.b());
   }

   public static bvl.a gQ() {
      return cfv.gt().a(bvm.o, 0.7).a(bvm.s, 53.0).a(bvm.v, 0.225F).a(bvm.B, 1.0).a(bvm.x, 6.0).a(bvm.k, 0.5);
   }

   @Override
   public int fR() {
      return 6;
   }

   public int gR() {
      return 100;
   }

   @Override
   protected float fd() {
      return 0.8F;
   }

   @Override
   public int T() {
      return 400;
   }

   @Override
   public void b(cnp $$0) {
      if (!this.dS().B && (!this.bX() || this.y($$0)) && this.gF()) {
         $$0.a(this, this.cu);
      }
   }

   public brk c(cnp $$0, cvl $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (brk)(!$$2 && !this.dS().B ? brk.e : brk.b);
   }

   protected boolean a(cnp $$0, cvl $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cvo.px)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cvo.rB)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dgx.ij.r())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cvo.ov)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cvo.um)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dS().B && this.gF() && this.g() == 0 && !this.gy()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cvo.qb) || $$1.a(cvo.qc)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dS().B && this.gF() && this.g() == 0 && !this.gy()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eA() < this.eQ() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dS().a(ln.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dS().B) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gF()) && this.gL() < this.gR() && !this.dS().B) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(dyx.m);
      }

      return $$2;
   }

   protected void a(cnp $$0) {
      this.B(false);
      this.C(false);
      if (!this.dS().B) {
         $$0.v(this.dI());
         $$0.w(this.dK());
         $$0.n(this);
      }
   }

   @Override
   public boolean ff() {
      return super.ff() && this.bX() && this.i() || this.gI() || this.gJ();
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.af);
   }

   private void t() {
      this.cr = 1;
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.cu != null) {
         for (int $$0 = 0; $$0 < this.cu.b(); $$0++) {
            cvl $$1 = this.cu.a($$0);
            if (!$$1.f() && !day.a($$1, dax.D)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void m_() {
      if (this.af.a(200) == 0) {
         this.t();
      }

      super.m_();
      if (!this.dS().B && this.bI()) {
         if (this.af.a(900) == 0 && this.aM == 0) {
            this.c(1.0F);
         }

         if (this.gT()) {
            if (!this.gI() && !this.bX() && this.af.a(300) == 0 && this.dS().a_(this.ds().e()).a(dgx.i)) {
               this.B(true);
            }

            if (this.gI() && ++this.cI > 50) {
               this.cI = 0;
               this.B(false);
            }
         }

         this.gS();
      }
   }

   protected void gS() {
      if (this.gK() && this.o_() && !this.gI()) {
         buf $$0 = this.dS().a(chz.class, cj, this, this.dx(), this.dz(), this.dD(), this.cO().g(16.0));
         if ($$0 != null && this.g($$0) > 4.0) {
            this.bS.a($$0, 0);
         }
      }
   }

   public boolean gT() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cJ > 0 && ++this.cJ > 30) {
         this.cJ = 0;
         this.d(64, false);
      }

      if (this.df() && this.cK > 0 && ++this.cK > 20) {
         this.cK = 0;
         this.C(false);
      }

      if (this.cr > 0 && ++this.cr > 8) {
         this.cr = 0;
      }

      if (this.cs > 0) {
         this.cs++;
         if (this.cs > 300) {
            this.cs = 0;
         }
      }

      this.cM = this.cL;
      if (this.gI()) {
         this.cL = this.cL + (1.0F - this.cL) * 0.4F + 0.05F;
         if (this.cL > 1.0F) {
            this.cL = 1.0F;
         }
      } else {
         this.cL = this.cL + ((0.0F - this.cL) * 0.4F - 0.05F);
         if (this.cL < 0.0F) {
            this.cL = 0.0F;
         }
      }

      this.cO = this.cN;
      if (this.gJ()) {
         this.cL = 0.0F;
         this.cM = this.cL;
         this.cN = this.cN + (1.0F - this.cN) * 0.4F + 0.05F;
         if (this.cN > 1.0F) {
            this.cN = 1.0F;
         }
      } else {
         this.cx = false;
         this.cN = this.cN + ((0.8F * this.cN * this.cN * this.cN - this.cN) * 0.6F - 0.05F);
         if (this.cN < 0.0F) {
            this.cN = 0.0F;
         }
      }

      this.cQ = this.cP;
      if (this.t(64)) {
         this.cP = this.cP + (1.0F - this.cP) * 0.7F + 0.05F;
         if (this.cP > 1.0F) {
            this.cP = 1.0F;
         }
      } else {
         this.cP = this.cP + ((0.0F - this.cP) * 0.7F - 0.05F);
         if (this.cP < 0.0F) {
            this.cP = 0.0F;
         }
      }
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      if (this.bX() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gF() && $$0.fR()) {
         this.b($$0);
         return brk.a;
      } else {
         cvl $$2 = $$0.b($$1);
         if (!$$2.f()) {
            brk $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.e(btr.g) && this.m($$2) && !this.fT()) {
               this.b($$0, $$2);
               return brk.a;
            }
         }

         this.a($$0);
         return brk.a;
      }
   }

   private void y() {
      if (!this.dS().B) {
         this.cJ = 1;
         this.d(64, true);
      }
   }

   public void B(boolean $$0) {
      this.d(16, $$0);
   }

   public void C(boolean $$0) {
      if ($$0) {
         this.B(false);
      }

      this.d(32, $$0);
   }

   @Nullable
   public awc gU() {
      return this.w();
   }

   public void gV() {
      if (this.gp() && this.df()) {
         this.cK = 1;
         this.C(true);
      }
   }

   public void gW() {
      if (!this.gJ()) {
         this.gV();
         this.b(this.gP());
      }
   }

   public boolean g(cnp $$0) {
      this.b($$0.cD());
      this.y(true);
      if ($$0 instanceof arh) {
         an.y.a((arh)$$0, this);
      }

      this.dS().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cnp $$0, eye $$1) {
      super.a($$0, $$1);
      eyd $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aU = this.aW = this.dI();
      if (this.de()) {
         if ($$1.f <= 0.0) {
            this.cz = 0;
         }

         if (this.aH()) {
            this.z(false);
            if (this.cw > 0.0F && !this.gH()) {
               this.b(this.cw, $$1);
            }

            this.cw = 0.0F;
         }
      }
   }

   protected eyd j(buf $$0) {
      return new eyd($$0.dK() * 0.5F, $$0.dI());
   }

   @Override
   protected eye b(cnp $$0, eye $$1) {
      if (this.aH() && this.cw == 0.0F && this.gJ() && !this.cx) {
         return eye.c;
      } else {
         float $$2 = $$0.bl * 0.5F;
         float $$3 = $$0.bn;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new eye((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cnp $$0) {
      return (float)this.h(bvm.v);
   }

   protected void b(float $$0, eye $$1) {
      double $$2 = (double)this.A($$0);
      eye $$3 = this.dv();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.as = true;
      if ($$1.f > 0.0) {
         float $$4 = azc.a(this.dI() * (float) (Math.PI / 180.0));
         float $$5 = azc.b(this.dI() * (float) (Math.PI / 180.0));
         this.h(this.dv().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gX() {
      this.a(awd.mP, 0.4F, 1.0F);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gI());
      $$0.a("Bred", this.gK());
      $$0.a("Temper", this.gL());
      $$0.a("Tame", this.gF());
      if (this.Z_() != null) {
         $$0.a("Owner", this.Z_());
      }

      if (!this.cu.a(0).f()) {
         $$0.a("SaddleItem", this.cu.a(0).a(this.dU()));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.B($$0.q("EatingHaystack"));
      this.A($$0.q("Bred"));
      this.u($$0.h("Temper"));
      this.y($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avf.a(this.cS(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cvl $$4 = cvl.a(this.dU(), (vc)$$0.p("SaddleItem")).orElse(cvl.k);
         if ($$4.a(cvo.nL)) {
            this.cu.a(0, $$4);
         }
      }

      this.gO();
   }

   @Override
   public boolean a(cfv $$0) {
      return false;
   }

   protected boolean gY() {
      return !this.bX() && !this.bW() && this.gF() && !this.o_() && this.eA() >= this.eQ() && this.gy();
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return null;
   }

   protected void a(btc $$0, chz $$1) {
      this.a($$0, $$1, bvm.s, (double)ce, (double)cf);
      this.a($$0, $$1, bvm.o, (double)cb, (double)cd);
      this.a($$0, $$1, bvm.v, (double)bZ, (double)ca);
   }

   private void a(btc $$0, chz $$1, jn<bvh> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.af);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azk $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azc.a($$0, $$2, $$3);
         $$1 = azc.a($$1, $$2, $$3);
         double $$5 = 0.15 * ($$3 - $$2);
         double $$6 = Math.abs($$0 - $$1) + $$5 * 2.0;
         double $$7 = ($$0 + $$1) / 2.0;
         double $$8 = ($$4.j() + $$4.j() + $$4.j()) / 3.0 - 0.5;
         double $$9 = $$7 + $$6 * $$8;
         if ($$9 > $$3) {
            double $$10 = $$9 - $$3;
            return $$3 - $$10;
         } else if ($$9 < $$2) {
            double $$11 = $$2 - $$9;
            return $$2 + $$11;
         } else {
            return $$9;
         }
      }
   }

   public float J(float $$0) {
      return azc.h($$0, this.cM, this.cL);
   }

   public float K(float $$0) {
      return azc.h($$0, this.cO, this.cN);
   }

   public float L(float $$0) {
      return azc.h($$0, this.cQ, this.cP);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cx = true;
            this.gV();
         }

         if ($$0 >= 90) {
            this.cw = 1.0F;
         } else {
            this.cw = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cx = true;
      this.gV();
      this.gX();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      ll $$1 = $$0 ? ln.Q : ln.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dS().a($$1, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.D(true);
      } else if ($$0 == 6) {
         this.D(false);
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void a(btj $$0, btj.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof buf) {
         ((buf)$$0).aU = this.aU;
      }
   }

   protected static float a(IntUnaryOperator $$0) {
      return 15.0F + (float)$$0.applyAsInt(8) + (float)$$0.applyAsInt(9);
   }

   protected static double a(DoubleSupplier $$0) {
      return 0.4F + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2;
   }

   protected static double b(DoubleSupplier $$0) {
      return (0.45F + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3) * 0.25;
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   public buw a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new buw() {
            @Override
            public cvl a() {
               return chz.this.cu.a(0);
            }

            @Override
            public boolean a(cvl $$0) {
               if (!$$0.f() && !$$0.a(cvo.nL)) {
                  return false;
               } else {
                  chz.this.cu.a(0, $$0);
                  chz.this.gO();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cu.b() ? buw.a(this.cu, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public buf cU() {
      if (this.i()) {
         btj var2 = this.cX();
         if (var2 instanceof cnp) {
            return (cnp)var2;
         }
      }

      return super.cU();
   }

   @Nullable
   private eye a(eye $$0, buf $$1) {
      double $$2 = this.dx() + $$0.d;
      double $$3 = this.cO().b;
      double $$4 = this.dD() + $$0.f;
      je.a $$5 = new je.a();
      UnmodifiableIterator var10 = $$1.fI().iterator();

      while (var10.hasNext()) {
         bur $$6 = (bur)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cO().e + 0.75;

         do {
            double $$8 = this.dS().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cpr.a($$8)) {
               exz $$9 = $$1.f($$6);
               eye $$10 = new eye($$2, (double)$$5.v() + $$8, $$4);
               if (cpr.a(this.dS(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jj.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public eye b(buf $$0) {
      eye $$1 = a((double)this.dn(), (double)$$0.dn(), this.dI() + ($$0.fu() == btz.b ? 90.0F : -90.0F));
      eye $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         eye $$3 = a((double)this.dn(), (double)$$0.dn(), this.dI() + ($$0.fu() == btz.a ? 90.0F : -90.0F));
         eye $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dq();
      }
   }

   protected void a(azk $$0) {
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$3 == null) {
         $$3 = new btc.a(0.2F);
      }

      this.a($$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(brd $$0) {
      return this.cu != $$0;
   }

   public int gZ() {
      return this.T();
   }

   @Override
   protected eye a(btj $$0, btm $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new eye(0.0, 0.15 * (double)this.cO * (double)$$2, -0.7 * (double)this.cO * (double)$$2).b(-this.dI() * (float) (Math.PI / 180.0)));
   }

   public final brd ha() {
      return this.cS;
   }

   public int ae_() {
      return 0;
   }
}
