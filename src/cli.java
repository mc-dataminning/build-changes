import com.google.common.collect.UnmodifiableIterator;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class cli extends ciz implements bwz, bxq, bxt {
   public static final int bR = 499;
   public static final int bS = 500;
   public static final double bT = 0.15;
   private static final float bG = (float)b(() -> 0.0);
   private static final float bH = (float)b(() -> 1.0);
   private static final float bI = (float)a(() -> 0.0);
   private static final float bK = (float)a(() -> 1.0);
   private static final float bL = a($$0 -> 0);
   private static final float bM = a($$0 -> $$0 - 1);
   private static final float bN = 0.25F;
   private static final float bO = 0.5F;
   private static final chy.a bP = ($$0, $$1) -> {
      if ($$0 instanceof cli $$2 && $$2.gP()) {
         return true;
      }

      return false;
   };
   private static final chy bQ = chy.b().a(16.0).d().a(bP);
   private static final akj<Byte> ce = akn.a(cli.class, akl.a);
   private static final int cf = 2;
   private static final int cg = 8;
   private static final int ch = 16;
   private static final int ci = 32;
   private static final int cj = 64;
   public static final int bU = 3;
   private int ck;
   private int cl;
   private int cm;
   public int bV;
   public int bW;
   protected boolean bX;
   protected bun bY;
   protected int bZ;
   protected float ca;
   protected boolean cb;
   private float cn;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;
   protected boolean cc = true;
   protected int cd;
   @Nullable
   private bwo<bxj> cv;

   protected cli(bwr<? extends cli> $$0, djm $$1) {
      super($$0, $$1);
      this.gS();
   }

   @Override
   protected void D() {
      this.bD.a(1, new cey(this, 1.2));
      this.bD.a(1, new cfj(this, 1.2));
      this.bD.a(2, new cdr(this, 1.0, cli.class));
      this.bD.a(4, new cee(this, 1.0));
      this.bD.a(6, new cfs(this, 0.7));
      this.bD.a(7, new cen(this, crm.class, 6.0F));
      this.bD.a(8, new cfa(this));
      if (this.gu()) {
         this.bD.a(9, new cfb(this));
      }

      this.gL();
   }

   protected void gL() {
      this.bD.a(0, new cdz(this));
      this.bD.a(3, new cfn(this, 1.25, $$0 -> $$0.a(axk.ak), false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ce, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(ce) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(ce);
      if ($$1) {
         this.al.a(ce, (byte)($$2 | $$0));
      } else {
         this.al.a(ce, (byte)($$2 & ~$$0));
      }
   }

   public boolean gK() {
      return this.s(2);
   }

   @Nullable
   @Override
   public bwo<bxj> d() {
      return this.cv;
   }

   public void j(@Nullable bxj $$0) {
      this.cv = $$0 != null ? new bwo<>($$0) : null;
   }

   public boolean gM() {
      return this.bX;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.bX = $$0;
   }

   @Override
   public boolean a(bwi $$0, float $$1) {
      if ($$1 > 6.0F && this.gN()) {
         this.A(false);
      }

      return true;
   }

   public boolean gN() {
      return this.s(16);
   }

   public boolean gO() {
      return this.s(32);
   }

   public boolean gP() {
      return this.s(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean e(bws $$0) {
      return $$0 != bws.h ? super.e($$0) : this.bI() && !this.n_() && this.gK();
   }

   public void b(crm $$0, czn $$1) {
      if (this.a($$1, bws.g)) {
         this.h($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bws $$0) {
      return ($$0 == bws.g || $$0 == bws.h) && this.gK() || super.f($$0);
   }

   public int gQ() {
      return this.bZ;
   }

   public void t(int $$0) {
      this.bZ = $$0;
   }

   public int u(int $$0) {
      int $$1 = azm.a(this.gQ() + $$0, 0, this.gV());
      this.t($$1);
      return $$1;
   }

   @Override
   public boolean bF() {
      return !this.bY();
   }

   private void q() {
      this.x();
      if (!this.aZ()) {
         awm $$0 = this.gv();
         if ($$0 != null) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), $$0, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
      if ($$0 > 1.0) {
         this.a(awn.nr, 0.4F, 1.0F);
      }

      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         this.b($$0, $$1, $$2);
         this.eP();
         return true;
      }
   }

   public final int gR() {
      return v(this.Z_());
   }

   public static int v(int $$0) {
      return $$0 * 3;
   }

   protected void gS() {
      bun $$0 = this.bY;
      this.bY = new bun(this.gR());
      if ($$0 != null) {
         int $$1 = Math.min($$0.b(), this.bY.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            czn $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.bY.a($$2, $$3.v());
            }
         }
      }
   }

   @Override
   protected jf<awm> a(bws $$0, czn $$1, dhw $$2) {
      return (jf<awm>)($$0 == bws.h ? awn.ns : super.a($$0, $$1, $$2));
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gY();
      }

      return $$3;
   }

   protected boolean gu() {
      return true;
   }

   @Nullable
   protected awm gv() {
      return null;
   }

   @Nullable
   protected awm gT() {
      return null;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      if (!$$1.n()) {
         eat $$2 = this.dU().a_($$0.d());
         duo $$3 = $$1.A();
         if ($$2.a(dmt.ed)) {
            $$3 = $$2.A();
         }

         if (this.bY() && this.cc) {
            this.cd++;
            if (this.cd > 5 && this.cd % 3 == 0) {
               this.a($$3);
            } else if (this.cd <= 5) {
               this.a(awn.nu, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awn.nu, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awn.nt, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(duo $$0) {
      return $$0 == duo.b || $$0 == duo.aV || $$0 == duo.B || $$0 == duo.aW || $$0 == duo.aU;
   }

   protected void a(duo $$0) {
      this.a(awn.no, $$0.a() * 0.15F, $$0.b());
   }

   public static byo.a gU() {
      return ciz.gy().a(byp.o, 0.7).a(byp.s, 53.0).a(byp.v, 0.225F).a(byp.B, 1.0).a(byp.x, 6.0).a(byp.k, 0.5);
   }

   @Override
   public int fW() {
      return 6;
   }

   public int gV() {
      return 100;
   }

   @Override
   protected float fd() {
      return 0.8F;
   }

   @Override
   public int S() {
      return 400;
   }

   @Override
   public void b(crm $$0) {
      if (!this.dU().C && (!this.bY() || this.y($$0)) && this.gK()) {
         $$0.a(this, this.bY);
      }
   }

   public bug c(crm $$0, czn $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bug)(!$$2 && !this.dU().C ? bug.e : bug.b);
   }

   protected boolean a(crm $$0, czn $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(czr.qk)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(czr.sI)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dmt.iL.h())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(czr.pi)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(czr.vu)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dU().C && this.gK() && this.g() == 0 && !this.gD()) {
            $$2 = true;
            this.e($$0);
         }
      } else if ($$1.a(czr.qO) || $$1.a(czr.qP)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dU().C && this.gK() && this.g() == 0 && !this.gD()) {
            $$2 = true;
            this.e($$0);
         }
      }

      if (this.eF() < this.eT() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.n_() && $$4 > 0) {
         this.dU().a(ly.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dU().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gK()) && this.gQ() < this.gV() && !this.dU().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(eft.m);
      }

      return $$2;
   }

   protected void a(crm $$0) {
      this.A(false);
      this.B(false);
      if (!this.dU().C) {
         $$0.w(this.dK());
         $$0.x(this.dM());
         $$0.n(this);
      }
   }

   @Override
   public boolean ff() {
      return super.ff() && this.bY() && this.fY() || this.gN() || this.gO();
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.aj);
   }

   private void t() {
      this.bV = 1;
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (this.bY != null) {
         for (int $$1 = 0; $$1 < this.bY.b(); $$1++) {
            czn $$2 = this.bY.a($$1);
            if (!$$2.f() && !dgc.a($$2, dgb.D)) {
               this.a($$0, $$2);
            }
         }
      }
   }

   @Override
   public void k_() {
      if (this.ae.a(200) == 0) {
         this.t();
      }

      super.k_();
      if (this.dU() instanceof arq $$0 && this.bI()) {
         if (this.ae.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gW()) {
            if (!this.gN() && !this.bY() && this.ae.a(300) == 0 && $$0.a_(this.du().e()).a(dmt.i)) {
               this.A(true);
            }

            if (this.gN() && ++this.ck > 50) {
               this.ck = 0;
               this.A(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(arq $$0) {
      if (this.gP() && this.n_() && !this.gN()) {
         bxj $$1 = $$0.a(cli.class, bQ, this, this.dz(), this.dB(), this.dF(), this.cQ().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bC.a($$1, 0);
         }
      }
   }

   public boolean gW() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.cl > 0 && ++this.cl > 30) {
         this.cl = 0;
         this.d(64, false);
      }

      if (this.di() && this.cm > 0 && ++this.cm > 20) {
         this.cm = 0;
         this.B(false);
      }

      if (this.bV > 0 && ++this.bV > 8) {
         this.bV = 0;
      }

      if (this.bW > 0) {
         this.bW++;
         if (this.bW > 300) {
            this.bW = 0;
         }
      }

      this.cq = this.cn;
      if (this.gN()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F + 0.05F;
         if (this.cn > 1.0F) {
            this.cn = 1.0F;
         }
      } else {
         this.cn = this.cn + ((0.0F - this.cn) * 0.4F - 0.05F);
         if (this.cn < 0.0F) {
            this.cn = 0.0F;
         }
      }

      this.cs = this.cr;
      if (this.gO()) {
         this.cn = 0.0F;
         this.cq = this.cn;
         this.cr = this.cr + (1.0F - this.cr) * 0.4F + 0.05F;
         if (this.cr > 1.0F) {
            this.cr = 1.0F;
         }
      } else {
         this.cb = false;
         this.cr = this.cr + ((0.8F * this.cr * this.cr * this.cr - this.cr) * 0.6F - 0.05F);
         if (this.cr < 0.0F) {
            this.cr = 0.0F;
         }
      }

      this.cu = this.ct;
      if (this.s(64)) {
         this.ct = this.ct + (1.0F - this.ct) * 0.7F + 0.05F;
         if (this.ct > 1.0F) {
            this.ct = 1.0F;
         }
      } else {
         this.ct = this.ct + ((0.0F - this.ct) * 0.7F - 0.05F);
         if (this.ct < 0.0F) {
            this.ct = 0.0F;
         }
      }
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      if (this.bY() || this.n_()) {
         return super.b($$0, $$1);
      } else if (this.gK() && $$0.fX()) {
         this.b($$0);
         return bug.a;
      } else {
         czn $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bug $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bws.g) && !this.fZ()) {
               this.b($$0, $$2);
               return bug.a;
            }
         }

         this.a($$0);
         return bug.a;
      }
   }

   private void x() {
      if (!this.dU().C) {
         this.cl = 1;
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
   public awm gX() {
      return this.u();
   }

   public void gY() {
      if (this.gu() && this.di()) {
         this.cm = 1;
         this.B(true);
      }
   }

   public void gZ() {
      if (!this.gO()) {
         this.gY();
         this.b(this.gT());
      }
   }

   public boolean f(crm $$0) {
      this.j($$0);
      this.x(true);
      if ($$0 instanceof arr) {
         aq.y.a((arr)$$0, this);
      }

      this.dU().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(crm $$0, ffc $$1) {
      super.a($$0, $$1);
      ffb $$2 = this.i($$0);
      this.b($$2.k, $$2.j);
      this.N = this.aV = this.aX = this.dK();
      if (this.df()) {
         if ($$1.f <= 0.0) {
            this.cd = 0;
         }

         if (this.aH()) {
            this.y(false);
            if (this.ca > 0.0F && !this.gM()) {
               this.b(this.ca, $$1);
            }

            this.ca = 0.0F;
         }
      }
   }

   protected ffb i(bxj $$0) {
      return new ffb($$0.dM() * 0.5F, $$0.dK());
   }

   @Override
   protected ffc b(crm $$0, ffc $$1) {
      if (this.aH() && this.ca == 0.0F && this.gO() && !this.cb) {
         return ffc.c;
      } else {
         float $$2 = $$0.bg * 0.5F;
         float $$3 = $$0.bi;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ffc((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float c(crm $$0) {
      return (float)this.h(byp.v);
   }

   protected void b(float $$0, ffc $$1) {
      double $$2 = (double)this.z($$0);
      ffc $$3 = this.dx();
      this.n($$3.d, $$2, $$3.f);
      this.y(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = azm.a(this.dK() * (float) (Math.PI / 180.0));
         float $$5 = azm.b(this.dK() * (float) (Math.PI / 180.0));
         this.i(this.dx().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void ha() {
      this.a(awn.nq, 0.4F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gN());
      $$0.a("Bred", this.gP());
      $$0.a("Temper", this.gQ());
      $$0.a("Tame", this.gK());
      if (this.cv != null) {
         this.cv.a($$0, "Owner");
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.A($$0.o("EatingHaystack"));
      this.z($$0.o("Bred"));
      this.t($$0.f("Temper"));
      this.x($$0.o("Tame"));
      this.cv = bwo.a($$0, "Owner", this.dU());
   }

   @Override
   public boolean a(ciz $$0) {
      return false;
   }

   protected boolean hb() {
      return !this.bY() && !this.bX() && this.gK() && !this.n_() && this.eF() >= this.eT() && this.gD();
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return null;
   }

   protected void a(bvy $$0, cli $$1) {
      this.a($$0, $$1, byp.s, (double)bL, (double)bM);
      this.a($$0, $$1, byp.o, (double)bI, (double)bK);
      this.a($$0, $$1, byp.v, (double)bG, (double)bH);
   }

   private void a(bvy $$0, cli $$1, jf<byk> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.ae);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azv $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azm.a($$0, $$2, $$3);
         $$1 = azm.a($$1, $$2, $$3);
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
      return azm.h($$0, this.cq, this.cn);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cs, this.cr);
   }

   public float L(float $$0) {
      return azm.h($$0, this.cu, this.ct);
   }

   @Override
   public void b(int $$0) {
      if (this.fY()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cb = true;
            this.gY();
         }

         if ($$0 >= 90) {
            this.ca = 1.0F;
         } else {
            this.ca = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.fY();
   }

   @Override
   public void c(int $$0) {
      this.cb = true;
      this.gY();
      this.ha();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lw $$1 = $$0 ? ly.S : ly.ah;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
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
   protected void a(bwi $$0, bwi.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxj) {
         ((bxj)$$0).aV = this.aV;
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
   public boolean d_() {
      return false;
   }

   @Override
   public bya a_(int $$0) {
      int $$1 = $$0 - 500;
      return $$1 >= 0 && $$1 < this.bY.b() ? bya.a(this.bY, $$1) : super.a_($$0);
   }

   @Nullable
   @Override
   public bxj cV() {
      if (this.fY()) {
         bwi var2 = this.cY();
         if (var2 instanceof crm) {
            return (crm)var2;
         }
      }

      return super.cV();
   }

   @Nullable
   private ffc a(ffc $$0, bxj $$1) {
      double $$2 = this.dz() + $$0.d;
      double $$3 = this.cQ().b;
      double $$4 = this.dF() + $$0.f;
      iv.a $$5 = new iv.a();
      UnmodifiableIterator var10 = $$1.fN().iterator();

      while (var10.hasNext()) {
         bxv $$6 = (bxv)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cQ().e + 0.75;

         do {
            double $$8 = this.dU().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cuf.a($$8)) {
               fex $$9 = $$1.f($$6);
               ffc $$10 = new ffc($$2, (double)$$5.v() + $$8, $$4);
               if (cuf.a(this.dU(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jb.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ffc b(bxj $$0) {
      ffc $$1 = a((double)this.dp(), (double)$$0.dp(), this.dK() + ($$0.fx() == bxa.b ? 90.0F : -90.0F));
      ffc $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ffc $$3 = a((double)this.dp(), (double)$$0.dp(), this.dK() + ($$0.fx() == bxa.a ? 90.0F : -90.0F));
         ffc $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.ds();
      }
   }

   protected void a(azv $$0) {
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$3 == null) {
         $$3 = new bvy.a(0.2F);
      }

      this.a($$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean a(btz $$0) {
      return this.bY != $$0;
   }

   public int hc() {
      return this.S();
   }

   @Override
   protected ffc a(bwi $$0, bwl $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ffc(0.0, 0.15 * (double)this.cs * (double)$$2, -0.7 * (double)this.cs * (double)$$2).b(-this.dK() * (float) (Math.PI / 180.0)));
   }

   public int Z_() {
      return 0;
   }
}
