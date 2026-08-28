import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class cja extends cgw implements bsd, buy, bvm, bvp, bvv {
   public static final int cj = 400;
   public static final int ck = 499;
   public static final int cl = 500;
   public static final double cm = 0.15;
   private static final float bY = (float)b(() -> 0.0);
   private static final float bZ = (float)b(() -> 1.0);
   private static final float ca = (float)a(() -> 0.0);
   private static final float cc = (float)a(() -> 1.0);
   private static final float cd = a($$0 -> 0);
   private static final float ce = a($$0 -> $$0 - 1);
   private static final float cf = 0.25F;
   private static final float cg = 0.5F;
   private static final cfw.a ch = ($$0, $$1) -> {
      if ($$0 instanceof cja $$2 && $$2.gL()) {
         return true;
      }

      return false;
   };
   private static final cfw ci = cfw.b().a(16.0).d().a(ch);
   private static final ajx<Byte> cz = akb.a(cja.class, ajz.a);
   private static final int cC = 2;
   private static final int cD = 4;
   private static final int cE = 8;
   private static final int cF = 16;
   private static final int cG = 32;
   private static final int cH = 64;
   public static final int cn = 0;
   public static final int co = 1;
   public static final int cp = 3;
   private int cI;
   private int cJ;
   private int cK;
   public int cq;
   public int cr;
   protected boolean cs;
   protected bsp ct;
   protected int cu;
   protected float cv;
   protected boolean cw;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   private float cP;
   private float cQ;
   protected boolean cx = true;
   protected int cy;
   @Nullable
   private UUID cR;
   private final bsb cS = new fck() {
      @Override
      public cwn f() {
         return cja.this.ag();
      }

      @Override
      public void b(cwn $$0) {
         cja.this.h($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cov $$0) {
         return $$0.dl() == cja.this || $$0.b(cja.this, 4.0);
      }
   };

   protected cja(buq<? extends cja> $$0, dgg $$1) {
      super($$0, $$1);
      this.gO();
   }

   @Override
   protected void B() {
      this.bS.a(1, new ccw(this, 1.2));
      this.bS.a(1, new cdh(this, 1.2));
      this.bS.a(2, new cbp(this, 1.0, cja.class));
      this.bS.a(4, new ccc(this, 1.0));
      this.bS.a(6, new cdq(this, 0.7));
      this.bS.a(7, new ccl(this, cov.class, 6.0F));
      this.bS.a(8, new ccy(this));
      if (this.gq()) {
         this.bS.a(9, new ccz(this));
      }

      this.gH();
   }

   protected void gH() {
      this.bS.a(0, new cbx(this));
      this.bS.a(3, new cdl(this, 1.25, $$0 -> $$0.a(awx.aj), false));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cz, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(cz) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(cz);
      if ($$1) {
         this.al.a(cz, (byte)($$2 | $$0));
      } else {
         this.al.a(cz, (byte)($$2 & ~$$0));
      }
   }

   public boolean gG() {
      return this.s(2);
   }

   @Nullable
   @Override
   public UUID aa_() {
      return this.cR;
   }

   public void b(@Nullable UUID $$0) {
      this.cR = $$0;
   }

   public boolean gI() {
      return this.cs;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   public void z(boolean $$0) {
      this.cs = $$0;
   }

   @Override
   public boolean a(buj $$0, float $$1) {
      if ($$1 > 6.0F && this.gJ()) {
         this.B(false);
      }

      return true;
   }

   public boolean gJ() {
      return this.s(16);
   }

   public boolean gK() {
      return this.s(32);
   }

   public boolean gL() {
      return this.s(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_() && this.gG();
   }

   @Override
   public void a(cwn $$0, @Nullable awa $$1) {
      this.ct.a(0, $$0);
   }

   public void b(cov $$0, cwn $$1) {
      if (this.a($$1, bur.g)) {
         this.h($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bur $$0) {
      return $$0 == bur.g && this.gG() || super.f($$0);
   }

   @Override
   public boolean j() {
      return this.s(4);
   }

   public int gM() {
      return this.cu;
   }

   public void t(int $$0) {
      this.cu = $$0;
   }

   public int u(int $$0) {
      int $$1 = ayy.a(this.gM() + $$0, 0, this.gS());
      this.t($$1);
      return $$1;
   }

   @Override
   public boolean bI() {
      return !this.ca();
   }

   private void p() {
      this.x();
      if (!this.bb()) {
         avy $$0 = this.gr();
         if ($$0 != null) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), $$0, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsz $$2) {
      if ($$0 > 1.0F) {
         this.a(avz.nn, 0.4F, 1.0F);
      }

      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.ca()) {
            for (buj $$4 : this.dd()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eO();
         return true;
      }
   }

   public final int gN() {
      return v(this.af_());
   }

   public static int v(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gO() {
      bsp $$0 = this.ct;
      this.ct = new bsp(this.gN());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ct.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cwn $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ct.a($$2, $$3.v());
            }
         }
      }

      this.ct.a(this);
      this.gP();
   }

   protected void gP() {
      if (!this.dW().C) {
         this.d(4, !this.ct.a(0).f());
      }
   }

   @Override
   public void a(bsb $$0) {
      boolean $$1 = this.j();
      this.gP();
      if (this.af > 20 && !$$1 && this.j()) {
         this.a(this.ab_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gV();
      }

      return $$3;
   }

   protected boolean gq() {
      return true;
   }

   @Nullable
   protected avy gr() {
      return null;
   }

   @Nullable
   protected avy gQ() {
      return null;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      if (!$$1.n()) {
         dwv $$2 = this.dW().a_($$0.d());
         drc $$3 = $$1.A();
         if ($$2.a(djm.ea)) {
            $$3 = $$2.A();
         }

         if (this.ca() && this.cx) {
            this.cy++;
            if (this.cy > 5 && this.cy % 3 == 0) {
               this.a($$3);
            } else if (this.cy <= 5) {
               this.a(avz.nq, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avz.nq, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avz.np, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(drc $$0) {
      return $$0 == drc.b || $$0 == drc.aT || $$0 == drc.B || $$0 == drc.aU || $$0 == drc.aS;
   }

   protected void a(drc $$0) {
      this.a(avz.nk, $$0.a() * 0.15F, $$0.b());
   }

   public static bwm.a gR() {
      return cgw.gu().a(bwn.o, 0.7).a(bwn.s, 53.0).a(bwn.v, 0.225F).a(bwn.B, 1.0).a(bwn.x, 6.0).a(bwn.k, 0.5);
   }

   @Override
   public int af() {
      return 6;
   }

   public int gS() {
      return 100;
   }

   @Override
   protected float fg() {
      return 0.8F;
   }

   @Override
   public int Q() {
      return 400;
   }

   @Override
   public void b(cov $$0) {
      if (!this.dW().C && (!this.ca() || this.y($$0)) && this.gG()) {
         $$0.a(this, this.ct);
      }
   }

   public bsi c(cov $$0, cwn $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bsi)(!$$2 && !this.dW().C ? bsi.e : bsi.b);
   }

   protected boolean a(cov $$0, cwn $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cwr.qb)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cwr.sx)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(djm.iH.j())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cwr.oZ)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cwr.vj)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dW().C && this.gG() && this.Y_() == 0 && !this.gz()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cwr.qF) || $$1.a(cwr.qG)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dW().C && this.gG() && this.Y_() == 0 && !this.gz()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eE() < this.eS() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.e_() && $$4 > 0) {
         this.dW().a(lt.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dW().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gG()) && this.gM() < this.gS() && !this.dW().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.p();
         this.a(ebr.m);
      }

      return $$2;
   }

   protected void a(cov $$0) {
      this.B(false);
      this.C(false);
      if (!this.dW().C) {
         $$0.v(this.dM());
         $$0.w(this.dO());
         $$0.n(this);
      }
   }

   @Override
   public boolean fi() {
      return super.fi() && this.ca() && this.j() || this.gJ() || this.gK();
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.ai);
   }

   private void t() {
      this.cq = 1;
   }

   @Override
   protected void f(arc $$0) {
      super.f($$0);
      if (this.ct != null) {
         for (int $$1 = 0; $$1 < this.ct.b(); $$1++) {
            cwn $$2 = this.ct.a($$1);
            if (!$$2.f() && !dcz.a($$2, dcy.D)) {
               this.a($$0, $$2);
            }
         }
      }
   }

   @Override
   public void d_() {
      if (this.ae.a(200) == 0) {
         this.t();
      }

      super.d_();
      if (this.dW() instanceof arc $$0 && this.bL()) {
         if (this.ae.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gT()) {
            if (!this.gJ() && !this.ca() && this.ae.a(300) == 0 && $$0.a_(this.dw().e()).a(djm.i)) {
               this.B(true);
            }

            if (this.gJ() && ++this.cI > 50) {
               this.cI = 0;
               this.B(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(arc $$0) {
      if (this.gL() && this.e_() && !this.gJ()) {
         bvf $$1 = $$0.a(cja.class, ci, this, this.dB(), this.dD(), this.dH(), this.cR().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bR.a($$1, 0);
         }
      }
   }

   public boolean gT() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.cJ > 0 && ++this.cJ > 30) {
         this.cJ = 0;
         this.d(64, false);
      }

      if (this.dk() && this.cK > 0 && ++this.cK > 20) {
         this.cK = 0;
         this.C(false);
      }

      if (this.cq > 0 && ++this.cq > 8) {
         this.cq = 0;
      }

      if (this.cr > 0) {
         this.cr++;
         if (this.cr > 300) {
            this.cr = 0;
         }
      }

      this.cM = this.cL;
      if (this.gJ()) {
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
      if (this.gK()) {
         this.cL = 0.0F;
         this.cM = this.cL;
         this.cN = this.cN + (1.0F - this.cN) * 0.4F + 0.05F;
         if (this.cN > 1.0F) {
            this.cN = 1.0F;
         }
      } else {
         this.cw = false;
         this.cN = this.cN + ((0.8F * this.cN * this.cN * this.cN - this.cN) * 0.6F - 0.05F);
         if (this.cN < 0.0F) {
            this.cN = 0.0F;
         }
      }

      this.cQ = this.cP;
      if (this.s(64)) {
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
   public bsi b(cov $$0, bsh $$1) {
      if (this.ca() || this.e_()) {
         return super.b($$0, $$1);
      } else if (this.gG() && $$0.fY()) {
         this.b($$0);
         return bsi.a;
      } else {
         cwn $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bsi $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bur.g) && !this.ai()) {
               this.b($$0, $$2);
               return bsi.a;
            }
         }

         this.a($$0);
         return bsi.a;
      }
   }

   private void x() {
      if (!this.dW().C) {
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
   public avy gU() {
      return this.u();
   }

   public void gV() {
      if (this.gq() && this.dk()) {
         this.cK = 1;
         this.C(true);
      }
   }

   public void gW() {
      if (!this.gK()) {
         this.gV();
         this.b(this.gQ());
      }
   }

   public boolean g(cov $$0) {
      this.b($$0.cG());
      this.y(true);
      if ($$0 instanceof ard) {
         ap.y.a((ard)$$0, this);
      }

      this.dW().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cov $$0, fay $$1) {
      super.a($$0, $$1);
      fax $$2 = this.j($$0);
      this.b($$2.j, $$2.i);
      this.N = this.aX = this.aZ = this.dM();
      if (this.di()) {
         if ($$1.f <= 0.0) {
            this.cy = 0;
         }

         if (this.aJ()) {
            this.z(false);
            if (this.cv > 0.0F && !this.gI()) {
               this.b(this.cv, $$1);
            }

            this.cv = 0.0F;
         }
      }
   }

   protected fax j(bvf $$0) {
      return new fax($$0.dO() * 0.5F, $$0.dM());
   }

   @Override
   protected fay b(cov $$0, fay $$1) {
      if (this.aJ() && this.cv == 0.0F && this.gK() && !this.cw) {
         return fay.c;
      } else {
         float $$2 = $$0.bn * 0.5F;
         float $$3 = $$0.bp;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new fay((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cov $$0) {
      return (float)this.h(bwn.v);
   }

   protected void b(float $$0, fay $$1) {
      double $$2 = (double)this.A($$0);
      fay $$3 = this.dz();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = ayy.a(this.dM() * (float) (Math.PI / 180.0));
         float $$5 = ayy.b(this.dM() * (float) (Math.PI / 180.0));
         this.h(this.dz().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gX() {
      this.a(avz.nm, 0.4F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gJ());
      $$0.a("Bred", this.gL());
      $$0.a("Temper", this.gM());
      $$0.a("Tame", this.gG());
      if (this.aa_() != null) {
         $$0.a("Owner", this.aa_());
      }

      if (!this.ct.a(0).f()) {
         $$0.a("SaddleItem", this.ct.a(0).a(this.dY()));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.B($$0.q("EatingHaystack"));
      this.A($$0.q("Bred"));
      this.t($$0.h("Temper"));
      this.y($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avb.a(this.cV(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cwn $$4 = cwn.a(this.dY(), (un)$$0.p("SaddleItem")).orElse(cwn.j);
         if ($$4.a(cwr.on)) {
            this.ct.a(0, $$4);
         }
      }

      this.gP();
   }

   @Override
   public boolean a(cgw $$0) {
      return false;
   }

   protected boolean gY() {
      return !this.ca() && !this.bZ() && this.gG() && !this.e_() && this.eE() >= this.eS() && this.gz();
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return null;
   }

   protected void a(bua $$0, cja $$1) {
      this.a($$0, $$1, bwn.s, (double)cd, (double)ce);
      this.a($$0, $$1, bwn.o, (double)ca, (double)cc);
      this.a($$0, $$1, bwn.v, (double)bY, (double)bZ);
   }

   private void a(bua $$0, cja $$1, jr<bwi> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.ae);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azg $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = ayy.a($$0, $$2, $$3);
         $$1 = ayy.a($$1, $$2, $$3);
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
      return ayy.h($$0, this.cM, this.cL);
   }

   public float K(float $$0) {
      return ayy.h($$0, this.cO, this.cN);
   }

   public float L(float $$0) {
      return ayy.h($$0, this.cQ, this.cP);
   }

   @Override
   public void b(int $$0) {
      if (this.j()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cw = true;
            this.gV();
         }

         if ($$0 >= 90) {
            this.cv = 1.0F;
         } else {
            this.cv = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.j();
   }

   @Override
   public void c(int $$0) {
      this.cw = true;
      this.gV();
      this.gX();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      lr $$1 = $$0 ? lt.R : lt.ag;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dW().a($$1, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(buj $$0, buj.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bvf) {
         ((bvf)$$0).aX = this.aX;
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
   public boolean q_() {
      return false;
   }

   @Override
   public bvx a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bvx() {
            @Override
            public cwn a() {
               return cja.this.ct.a(0);
            }

            @Override
            public boolean a(cwn $$0) {
               if (!$$0.f() && !$$0.a(cwr.on)) {
                  return false;
               } else {
                  cja.this.ct.a(0, $$0);
                  cja.this.gP();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ct.b() ? bvx.a(this.ct, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bvf cX() {
      if (this.j()) {
         buj var2 = this.da();
         if (var2 instanceof cov) {
            return (cov)var2;
         }
      }

      return super.cX();
   }

   @Nullable
   private fay a(fay $$0, bvf $$1) {
      double $$2 = this.dB() + $$0.d;
      double $$3 = this.cR().b;
      double $$4 = this.dH() + $$0.f;
      ji.a $$5 = new ji.a();
      UnmodifiableIterator var10 = $$1.fO().iterator();

      while (var10.hasNext()) {
         bvr $$6 = (bvr)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cR().e + 0.75;

         do {
            double $$8 = this.dW().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cra.a($$8)) {
               fat $$9 = $$1.f($$6);
               fay $$10 = new fay($$2, (double)$$5.v() + $$8, $$4);
               if (cra.a(this.dW(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jn.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public fay b(bvf $$0) {
      fay $$1 = a((double)this.dr(), (double)$$0.dr(), this.dM() + ($$0.fy() == buz.b ? 90.0F : -90.0F));
      fay $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         fay $$3 = a((double)this.dr(), (double)$$0.dr(), this.dM() + ($$0.fy() == buz.a ? 90.0F : -90.0F));
         fay $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.du();
      }
   }

   protected void a(azg $$0) {
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if ($$3 == null) {
         $$3 = new bua.a(0.2F);
      }

      this.a($$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bsb $$0) {
      return this.ct != $$0;
   }

   public int gZ() {
      return this.Q();
   }

   @Override
   protected fay a(buj $$0, bum $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new fay(0.0, 0.15 * (double)this.cO * (double)$$2, -0.7 * (double)this.cO * (double)$$2).b(-this.dM() * (float) (Math.PI / 180.0)));
   }

   public final bsb ha() {
      return this.cS;
   }

   public int af_() {
      return 0;
   }
}
