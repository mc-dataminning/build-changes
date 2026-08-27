import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cgi extends cee implements bpv, bsh, bsv, bsy, btd {
   public static final int cs = 400;
   public static final int ct = 499;
   public static final int cu = 500;
   public static final double cv = 0.15;
   private static final float ch = (float)b(() -> 0.0);
   private static final float ci = (float)b(() -> 1.0);
   private static final float ck = (float)a(() -> 0.0);
   private static final float cl = (float)a(() -> 1.0);
   private static final float cm = a($$0 -> 0);
   private static final float cn = a($$0 -> $$0 - 1);
   private static final float co = 0.25F;
   private static final float cp = 0.5F;
   private static final Predicate<bso> cq = $$0 -> $$0 instanceof cgi && ((cgi)$$0).gS();
   private static final cde cr = cde.b().a(16.0).d().a(cq);
   private static final ajy<Byte> cH = akc.a(cgi.class, aka.a);
   private static final int cI = 2;
   private static final int cJ = 4;
   private static final int cK = 8;
   private static final int cL = 16;
   private static final int cM = 32;
   private static final int cN = 64;
   public static final int cw = 0;
   public static final int cx = 1;
   private int cO;
   private int cQ;
   private int cR;
   public int cy;
   public int cz;
   protected boolean cA;
   protected bqj cB;
   protected int cC;
   protected float cD;
   protected boolean cE;
   private float cS;
   private float cT;
   private float cU;
   private float cV;
   private float cW;
   private float cX;
   protected boolean cF = true;
   protected int cG;
   @Nullable
   private UUID cY;
   private final bpt cZ = new eyf() {
      @Override
      public cuh f() {
         return cgi.this.fZ();
      }

      @Override
      public void b(cuh $$0) {
         cgi.this.m($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cly $$0) {
         return $$0.dh() == cgi.this || $$0.b(cgi.this, 4.0);
      }
   };

   protected cgi(bsb<? extends cgi> $$0, dca $$1) {
      super($$0, $$1);
      this.gU();
   }

   @Override
   protected void y() {
      this.cb.a(1, new cae(this, 1.2));
      this.cb.a(1, new cap(this, 1.2));
      this.cb.a(2, new byx(this, 1.0, cgi.class));
      this.cb.a(4, new bzk(this, 1.0));
      this.cb.a(6, new cay(this, 0.7));
      this.cb.a(7, new bzt(this, cly.class, 6.0F));
      this.cb.a(8, new cag(this));
      if (this.gE()) {
         this.cb.a(9, new cah(this));
      }

      this.gO();
   }

   protected void gO() {
      this.cb.a(0, new bzf(this));
      this.cb.a(3, new cat(this, 1.25, $$0 -> $$0.a(awm.ag), false));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cH, (byte)0);
   }

   protected boolean v(int $$0) {
      return (this.as.a(cH) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.as.a(cH);
      if ($$1) {
         this.as.a(cH, (byte)($$2 | $$0));
      } else {
         this.as.a(cH, (byte)($$2 & ~$$0));
      }
   }

   public boolean gN() {
      return this.v(2);
   }

   @Nullable
   @Override
   public UUID X_() {
      return this.cY;
   }

   public void b(@Nullable UUID $$0) {
      this.cY = $$0;
   }

   public boolean gP() {
      return this.cA;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.cA = $$0;
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gQ()) {
         this.A(false);
      }
   }

   public boolean gQ() {
      return this.v(16);
   }

   public boolean gR() {
      return this.v(32);
   }

   public boolean gS() {
      return this.v(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_() && this.gN();
   }

   @Override
   public void a(@Nullable avq $$0) {
      this.cB.a(0, new cuh(cuk.pb));
   }

   public void b(cly $$0, cuh $$1) {
      if (this.l($$1)) {
         this.m($$1.c(1));
         $$1.a(1, $$0);
      }
   }

   @Override
   public boolean i() {
      return this.v(4);
   }

   public int gT() {
      return this.cC;
   }

   public void w(int $$0) {
      this.cC = $$0;
   }

   public int x(int $$0) {
      int $$1 = aym.a(this.gT() + $$0, 0, this.gY());
      this.w($$1);
      return $$1;
   }

   @Override
   public boolean bF() {
      return !this.bX();
   }

   private void r() {
      this.gy();
      if (!this.ba()) {
         avn $$0 = this.gF();
         if ($$0 != null) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), $$0, this.dj(), 1.0F, 1.0F + (this.al.i() - this.al.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      if ($$0 > 1.0F) {
         this.a(avo.nf, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bX()) {
            for (brv $$4 : this.db()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eV();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aym.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int ac_() {
      return 1;
   }

   protected void gU() {
      bqj $$0 = this.cB;
      this.cB = new bqj(this.ac_());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cB.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cuh $$3 = $$0.a($$2);
            if (!$$3.d()) {
               this.cB.a($$2, $$3.r());
            }
         }
      }

      this.cB.a(this);
      this.gV();
   }

   protected void gV() {
      if (!this.dU().C) {
         this.d(4, !this.cB.a(0).d());
      }
   }

   @Override
   public void a(bpt $$0) {
      boolean $$1 = this.i();
      this.gV();
      if (this.am > 20 && !$$1 && this.i()) {
         this.a(this.Z_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.al.a(3) == 0) {
         this.hc();
      }

      return $$2;
   }

   protected boolean gE() {
      return true;
   }

   @Nullable
   protected avn gF() {
      return null;
   }

   @Nullable
   protected avn gW() {
      return null;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      if (!$$1.k()) {
         dtc $$2 = this.dU().a_($$0.c());
         dnd $$3 = $$1.w();
         if ($$2.a(dfe.eB)) {
            $$3 = $$2.w();
         }

         if (this.bX() && this.cF) {
            this.cG++;
            if (this.cG > 5 && this.cG % 3 == 0) {
               this.a($$3);
            } else if (this.cG <= 5) {
               this.a(avo.ni, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(avo.ni, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(avo.nh, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dnd $$0) {
      return $$0 == dnd.b || $$0 == dnd.aT || $$0 == dnd.B || $$0 == dnd.aZ || $$0 == dnd.aS;
   }

   protected void a(dnd $$0) {
      this.a(avo.nc, $$0.a() * 0.15F, $$0.b());
   }

   public static btu.a gX() {
      return bsq.A().a(btv.m, 0.7).a(btv.q, 53.0).a(btv.r, 0.225F).a(btv.v, 1.0);
   }

   @Override
   public int ad() {
      return 6;
   }

   public int gY() {
      return 100;
   }

   @Override
   protected float fn() {
      return 0.8F;
   }

   @Override
   public int O() {
      return 400;
   }

   @Override
   public void b(cly $$0) {
      if (!this.dU().C && (!this.bX() || this.x($$0)) && this.gN()) {
         $$0.a(this, this.cB);
      }
   }

   public bqa c(cly $$0, cuh $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      if (this.dU().C) {
         return bqa.b;
      } else {
         return $$2 ? bqa.a : bqa.d;
      }
   }

   protected boolean a(cly $$0, cuh $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cuk.qP)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cuk.sX)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dfe.jd.q())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cuk.pJ)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cuk.vV)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dU().C && this.gN() && this.g() == 0 && !this.gC()) {
            $$2 = true;
            this.g($$0);
         }
      } else if ($$1.a(cuk.rv) || $$1.a(cuk.rw)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dU().C && this.gN() && this.g() == 0 && !this.gC()) {
            $$2 = true;
            this.g($$0);
         }
      }

      if (this.eI() < this.eZ() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.o_() && $$4 > 0) {
         this.dU().a(lb.M, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dU().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gN()) && this.gT() < this.gY() && !this.dU().C) {
         this.x($$5);
         $$2 = true;
      }

      if ($$2) {
         this.r();
         this.a(dxv.m);
      }

      return $$2;
   }

   protected void f(cly $$0) {
      this.A(false);
      this.B(false);
      if (!this.dU().C) {
         $$0.r(this.dK());
         $$0.s(this.dM());
         $$0.n(this);
      }
   }

   @Override
   public boolean fp() {
      return super.fp() && this.bX() && this.i() || this.gQ() || this.gR();
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.af);
   }

   private void t() {
      this.cy = 1;
   }

   @Override
   protected void eL() {
      super.eL();
      if (this.cB != null) {
         for (int $$0 = 0; $$0 < this.cB.b(); $$0++) {
            cuh $$1 = this.cB.a($$0);
            if (!$$1.d() && !dae.g($$1)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void m_() {
      if (this.al.a(200) == 0) {
         this.t();
      }

      super.m_();
      if (!this.dU().C && this.bI()) {
         if (this.al.a(900) == 0 && this.bb == 0) {
            this.c(1.0F);
         }

         if (this.ha()) {
            if (!this.gQ() && !this.bX() && this.al.a(300) == 0 && this.dU().a_(this.du().d()).a(awe.bZ)) {
               this.A(true);
            }

            if (this.gQ() && ++this.cO > 50) {
               this.cO = 0;
               this.A(false);
            }
         }

         this.gZ();
      }
   }

   protected void gZ() {
      if (this.gS() && this.o_() && !this.gQ()) {
         bso $$0 = this.dU().a(cgi.class, cr, this, this.dz(), this.dB(), this.dF(), this.cP().g(16.0));
         if ($$0 != null && this.g((brv)$$0) > 4.0) {
            this.ca.a($$0, 0);
         }
      }
   }

   public boolean ha() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cQ > 0 && ++this.cQ > 30) {
         this.cQ = 0;
         this.d(64, false);
      }

      if (this.dg() && this.cR > 0 && ++this.cR > 20) {
         this.cR = 0;
         this.B(false);
      }

      if (this.cy > 0 && ++this.cy > 8) {
         this.cy = 0;
      }

      if (this.cz > 0) {
         this.cz++;
         if (this.cz > 300) {
            this.cz = 0;
         }
      }

      this.cT = this.cS;
      if (this.gQ()) {
         this.cS = this.cS + (1.0F - this.cS) * 0.4F + 0.05F;
         if (this.cS > 1.0F) {
            this.cS = 1.0F;
         }
      } else {
         this.cS = this.cS + ((0.0F - this.cS) * 0.4F - 0.05F);
         if (this.cS < 0.0F) {
            this.cS = 0.0F;
         }
      }

      this.cV = this.cU;
      if (this.gR()) {
         this.cS = 0.0F;
         this.cT = this.cS;
         this.cU = this.cU + (1.0F - this.cU) * 0.4F + 0.05F;
         if (this.cU > 1.0F) {
            this.cU = 1.0F;
         }
      } else {
         this.cE = false;
         this.cU = this.cU + ((0.8F * this.cU * this.cU * this.cU - this.cU) * 0.6F - 0.05F);
         if (this.cU < 0.0F) {
            this.cU = 0.0F;
         }
      }

      this.cX = this.cW;
      if (this.v(64)) {
         this.cW = this.cW + (1.0F - this.cW) * 0.7F + 0.05F;
         if (this.cW > 1.0F) {
            this.cW = 1.0F;
         }
      } else {
         this.cW = this.cW + ((0.0F - this.cW) * 0.7F - 0.05F);
         if (this.cW < 0.0F) {
            this.cW = 0.0F;
         }
      }
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      if (this.bX() || this.o_()) {
         return super.b($$0, $$1);
      } else if (this.gN() && $$0.ga()) {
         this.b($$0);
         return bqa.a(this.dU().C);
      } else {
         cuh $$2 = $$0.b($$1);
         if (!$$2.d()) {
            bqa $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.ga() && this.l($$2) && !this.gb()) {
               this.b($$0, $$2);
               return bqa.a(this.dU().C);
            }
         }

         this.f($$0);
         return bqa.a(this.dU().C);
      }
   }

   private void gy() {
      if (!this.dU().C) {
         this.cQ = 1;
         this.d(64, true);
      }
   }

   public void A(boolean $$0) {
      this.d(16, $$0);
   }

   public void B(boolean $$0) {
      if ($$0) {
         this.A(false);
      }

      this.d(32, $$0);
   }

   @Nullable
   public avn hb() {
      return this.u();
   }

   public void hc() {
      if (this.gE() && this.dg()) {
         this.cR = 1;
         this.B(true);
      }
   }

   public void hd() {
      if (!this.gR()) {
         this.hc();
         this.b(this.gW());
      }
   }

   public boolean h(cly $$0) {
      this.b($$0.cE());
      this.x(true);
      if ($$0 instanceof aqu) {
         an.y.a((aqu)$$0, this);
      }

      this.dU().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cly $$0, ewu $$1) {
      super.a($$0, $$1);
      ewt $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.P = this.bj = this.bl = this.dK();
      if (this.df()) {
         if ($$1.e <= 0.0) {
            this.cG = 0;
         }

         if (this.aE()) {
            this.y(false);
            if (this.cD > 0.0F && !this.gP()) {
               this.b(this.cD, $$1);
            }

            this.cD = 0.0F;
         }
      }
   }

   protected ewt j(bso $$0) {
      return new ewt($$0.dM() * 0.5F, $$0.dK());
   }

   @Override
   protected ewu b(cly $$0, ewu $$1) {
      if (this.aE() && this.cD == 0.0F && this.gR() && !this.cE) {
         return ewu.b;
      } else {
         float $$2 = $$0.bz * 0.5F;
         float $$3 = $$0.bB;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ewu((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cly $$0) {
      return (float)this.g(btv.r);
   }

   protected void b(float $$0, ewu $$1) {
      double $$2 = (double)this.w($$0);
      ewu $$3 = this.dx();
      this.o($$3.c, $$2, $$3.e);
      this.y(true);
      this.az = true;
      if ($$1.e > 0.0) {
         float $$4 = aym.a(this.dK() * (float) (Math.PI / 180.0));
         float $$5 = aym.b(this.dK() * (float) (Math.PI / 180.0));
         this.g(this.dx().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void he() {
      this.a(avo.ne, 0.4F, 1.0F);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gQ());
      $$0.a("Bred", this.gS());
      $$0.a("Temper", this.gT());
      $$0.a("Tame", this.gN());
      if (this.X_() != null) {
         $$0.a("Owner", this.X_());
      }

      if (!this.cB.a(0).d()) {
         $$0.a("SaddleItem", this.cB.a(0).a(this.dY()));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.w($$0.h("Temper"));
      this.x($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aup.a(this.cT(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cuh $$4 = cuh.a(this.dY(), (vh)$$0.p("SaddleItem")).orElse(cuh.i);
         if ($$4.a(cuk.pb)) {
            this.cB.a(0, $$4);
         }
      }

      this.gV();
   }

   @Override
   public boolean a(cee $$0) {
      return false;
   }

   protected boolean hf() {
      return !this.bX() && !this.bW() && this.gN() && !this.o_() && this.eI() >= this.eZ() && this.gC();
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      return null;
   }

   protected void a(brp $$0, cgi $$1) {
      this.a($$0, $$1, btv.q, (double)cm, (double)cn);
      this.a($$0, $$1, btv.m, (double)ck, (double)cl);
      this.a($$0, $$1, btv.r, (double)ch, (double)ci);
   }

   private void a(brp $$0, cgi $$1, ja<btq> $$2, double $$3, double $$4) {
      double $$5 = a(this.h($$2), $$0.h($$2), $$3, $$4, this.al);
      $$1.f($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, ayt $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = aym.a($$0, $$2, $$3);
         $$1 = aym.a($$1, $$2, $$3);
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

   public float G(float $$0) {
      return aym.i($$0, this.cT, this.cS);
   }

   public float H(float $$0) {
      return aym.i($$0, this.cV, this.cU);
   }

   public float I(float $$0) {
      return aym.i($$0, this.cX, this.cW);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cE = true;
            this.hc();
         }

         if ($$0 >= 90) {
            this.cD = 1.0F;
         } else {
            this.cD = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cE = true;
      this.hc();
      this.he();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      kz $$1 = $$0 ? lb.O : lb.ac;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.al.k() * 0.02;
         double $$4 = this.al.k() * 0.02;
         double $$5 = this.al.k() * 0.02;
         this.dU().a($$1, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.C(true);
      } else if ($$0 == 6) {
         this.C(false);
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void a(brv $$0, brv.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bso) {
         ((bso)$$0).bj = this.bj;
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
   public btf a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new btf() {
            @Override
            public cuh a() {
               return cgi.this.cB.a(0);
            }

            @Override
            public boolean a(cuh $$0) {
               if (!$$0.d() && !$$0.a(cuk.pb)) {
                  return false;
               } else {
                  cgi.this.cB.a(0, $$0);
                  cgi.this.gV();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cB.b() ? btf.a(this.cB, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bso cV() {
      if (this.i()) {
         brv var2 = this.cY();
         if (var2 instanceof cly) {
            return (cly)var2;
         }
      }

      return super.cV();
   }

   @Nullable
   private ewu a(ewu $$0, bso $$1) {
      double $$2 = this.dz() + $$0.c;
      double $$3 = this.cP().b;
      double $$4 = this.dF() + $$0.e;
      ir.a $$5 = new ir.a();
      UnmodifiableIterator var10 = $$1.fR().iterator();

      while (var10.hasNext()) {
         bsz $$6 = (bsz)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cP().e + 0.75;

         do {
            double $$8 = this.dU().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cob.a($$8)) {
               ewp $$9 = $$1.f($$6);
               ewu $$10 = new ewu($$2, (double)$$5.v() + $$8, $$4);
               if (cob.a(this.dU(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.d(iw.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ewu b(bso $$0) {
      ewu $$1 = a((double)this.do(), (double)$$0.do(), this.dK() + ($$0.fD() == bsi.b ? 90.0F : -90.0F));
      ewu $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ewu $$3 = a((double)this.do(), (double)$$0.do(), this.dK() + ($$0.fD() == bsi.a ? 90.0F : -90.0F));
         ewu $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.ds();
      }
   }

   protected void a(ayt $$0) {
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$3 == null) {
         $$3 = new brp.a(0.2F);
      }

      this.a($$0.F_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bpt $$0) {
      return this.cB != $$0;
   }

   public int hg() {
      return this.O();
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ewu(0.0, 0.15 * (double)this.cV * (double)$$2, -0.7 * (double)this.cV * (double)$$2).b(-this.dK() * (float) (Math.PI / 180.0)));
   }

   public final bpt hh() {
      return this.cZ;
   }
}
