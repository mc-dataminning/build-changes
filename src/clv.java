import com.google.common.collect.UnmodifiableIterator;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class clv extends cjm implements bxm, byd, byg {
   public static final int bT = 499;
   public static final int bU = 500;
   public static final double bV = 0.15;
   private static final float bI = (float)b(() -> 0.0);
   private static final float bJ = (float)b(() -> 1.0);
   private static final float bK = (float)a(() -> 0.0);
   private static final float bM = (float)a(() -> 1.0);
   private static final float bN = a($$0 -> 0);
   private static final float bO = a($$0 -> $$0 - 1);
   private static final float bP = 0.25F;
   private static final float bQ = 0.5F;
   private static final cil.a bR = ($$0, $$1) -> {
      if ($$0 instanceof clv $$2 && $$2.gQ()) {
         return true;
      }

      return false;
   };
   private static final cil bS = cil.b().a(16.0).d().a(bR);
   private static final akn<Byte> cg = akr.a(clv.class, akp.a);
   private static final int ch = 2;
   private static final int ci = 8;
   private static final int cj = 16;
   private static final int ck = 32;
   private static final int cl = 64;
   public static final int bW = 3;
   private static final int cm = 0;
   private static final boolean cn = false;
   private static final boolean cq = false;
   private static final boolean cr = false;
   private int cs;
   private int ct;
   private int cu;
   public int bX;
   public int bY;
   protected boolean bZ;
   protected bva ca;
   protected int cb = 0;
   protected float cc;
   protected boolean cd;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;
   private float cA;
   protected boolean ce = true;
   protected int cf;
   @Nullable
   private bxb<bxw> cB;

   protected clv(bxe<? extends clv> $$0, djz $$1) {
      super($$0, $$1);
      this.gT();
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfl(this, 1.2));
      this.bF.a(1, new cfw(this, 1.2));
      this.bF.a(2, new cee(this, 1.0, clv.class));
      this.bF.a(4, new cer(this, 1.0));
      this.bF.a(6, new cgf(this, 0.7));
      this.bF.a(7, new cfa(this, crz.class, 6.0F));
      this.bF.a(8, new cfn(this));
      if (this.gv()) {
         this.bF.a(9, new cfo(this));
      }

      this.gM();
   }

   protected void gM() {
      this.bF.a(0, new cem(this));
      this.bF.a(3, new cga(this, 1.25, $$0 -> $$0.a(axo.al), false));
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(cg, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(cg) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(cg);
      if ($$1) {
         this.al.a(cg, (byte)($$2 | $$0));
      } else {
         this.al.a(cg, (byte)($$2 & ~$$0));
      }
   }

   public boolean gL() {
      return this.s(2);
   }

   @Nullable
   @Override
   public bxb<bxw> d() {
      return this.cB;
   }

   public void j(@Nullable bxw $$0) {
      this.cB = $$0 != null ? new bxb<>($$0) : null;
   }

   public boolean gN() {
      return this.bZ;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bwv $$0, float $$1) {
      if ($$1 > 6.0F && this.gO()) {
         this.A(false);
      }

      return true;
   }

   public boolean gO() {
      return this.s(16);
   }

   public boolean gP() {
      return this.s(32);
   }

   public boolean gQ() {
      return this.s(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean e(bxf $$0) {
      return $$0 != bxf.h ? super.e($$0) : this.bJ() && !this.n_() && this.gL();
   }

   public void b(crz $$0, daa $$1) {
      if (this.a($$1, bxf.g)) {
         this.h($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bxf $$0) {
      return ($$0 == bxf.g || $$0 == bxf.h) && this.gL() || super.f($$0);
   }

   public int gR() {
      return this.cb;
   }

   public void t(int $$0) {
      this.cb = $$0;
   }

   public int u(int $$0) {
      int $$1 = azq.a(this.gR() + $$0, 0, this.gW());
      this.t($$1);
      return $$1;
   }

   @Override
   public boolean bG() {
      return !this.bZ();
   }

   private void q() {
      this.x();
      if (!this.ba()) {
         awq $$0 = this.gw();
         if ($$0 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bvk $$2) {
      if ($$0 > 1.0) {
         this.a(awr.nr, 0.4F, 1.0F);
      }

      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         this.b($$0, $$1, $$2);
         this.eQ();
         return true;
      }
   }

   public final int gS() {
      return v(this.ad_());
   }

   public static int v(int $$0) {
      return $$0 * 3;
   }

   protected void gT() {
      bva $$0 = this.ca;
      this.ca = new bva(this.gS());
      if ($$0 != null) {
         int $$1 = Math.min($$0.b(), this.ca.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            daa $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ca.a($$2, $$3.v());
            }
         }
      }
   }

   @Override
   protected jg<awq> a(bxf $$0, daa $$1, dij $$2) {
      return (jg<awq>)($$0 == bxf.h ? awr.ns : super.a($$0, $$1, $$2));
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gZ();
      }

      return $$3;
   }

   protected boolean gv() {
      return true;
   }

   @Nullable
   protected awq gw() {
      return null;
   }

   @Nullable
   protected awq gU() {
      return null;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      if (!$$1.n()) {
         ebg $$2 = this.dV().a_($$0.d());
         dvb $$3 = $$1.A();
         if ($$2.a(dng.ed)) {
            $$3 = $$2.A();
         }

         if (this.bZ() && this.ce) {
            this.cf++;
            if (this.cf > 5 && this.cf % 3 == 0) {
               this.a($$3);
            } else if (this.cf <= 5) {
               this.a(awr.nu, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awr.nu, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awr.nt, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dvb $$0) {
      return $$0 == dvb.b || $$0 == dvb.aV || $$0 == dvb.B || $$0 == dvb.aW || $$0 == dvb.aU;
   }

   protected void a(dvb $$0) {
      this.a(awr.no, $$0.a() * 0.15F, $$0.b());
   }

   public static bzb.a gV() {
      return cjm.gz().a(bzc.o, 0.7).a(bzc.s, 53.0).a(bzc.v, 0.225F).a(bzc.B, 1.0).a(bzc.x, 6.0).a(bzc.k, 0.5);
   }

   @Override
   public int fX() {
      return 6;
   }

   public int gW() {
      return 100;
   }

   @Override
   protected float fe() {
      return 0.8F;
   }

   @Override
   public int S() {
      return 400;
   }

   @Override
   public void b(crz $$0) {
      if (!this.dV().C && (!this.bZ() || this.y($$0)) && this.gL()) {
         $$0.a(this, this.ca);
      }
   }

   public but c(crz $$0, daa $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (but)(!$$2 && !this.dV().C ? but.e : but.b);
   }

   protected boolean a(crz $$0, daa $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(dae.qk)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(dae.sI)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dng.iL.h())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(dae.pi)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(dae.vu)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dV().C && this.gL() && this.g() == 0 && !this.gE()) {
            $$2 = true;
            this.e($$0);
         }
      } else if ($$1.a(dae.qO) || $$1.a(dae.qP)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dV().C && this.gL() && this.g() == 0 && !this.gE()) {
            $$2 = true;
            this.e($$0);
         }
      }

      if (this.eG() < this.eU() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.n_() && $$4 > 0) {
         this.dV().a(lz.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gL()) && this.gR() < this.gW() && !this.dV().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(egg.m);
      }

      return $$2;
   }

   protected void a(crz $$0) {
      this.A(false);
      this.B(false);
      if (!this.dV().C) {
         $$0.w(this.dL());
         $$0.x(this.dN());
         $$0.n(this);
      }
   }

   @Override
   public boolean fg() {
      return super.fg() && this.bZ() && this.fZ() || this.gO() || this.gP();
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ak);
   }

   private void t() {
      this.bX = 1;
   }

   @Override
   protected void f(aru $$0) {
      super.f($$0);
      if (this.ca != null) {
         for (int $$1 = 0; $$1 < this.ca.b(); $$1++) {
            daa $$2 = this.ca.a($$1);
            if (!$$2.f() && !dgp.a($$2, dgo.D)) {
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
      if (this.dV() instanceof aru $$0 && this.bJ()) {
         if (this.ae.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gX()) {
            if (!this.gO() && !this.bZ() && this.ae.a(300) == 0 && $$0.a_(this.dv().e()).a(dng.i)) {
               this.A(true);
            }

            if (this.gO() && ++this.cs > 50) {
               this.cs = 0;
               this.A(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(aru $$0) {
      if (this.gQ() && this.n_() && !this.gO()) {
         bxw $$1 = $$0.a(clv.class, bS, this, this.dA(), this.dC(), this.dG(), this.cR().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bE.a($$1, 0);
         }
      }
   }

   public boolean gX() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.ct > 0 && ++this.ct > 30) {
         this.ct = 0;
         this.d(64, false);
      }

      if (this.dj() && this.cu > 0 && ++this.cu > 20) {
         this.cu = 0;
         this.B(false);
      }

      if (this.bX > 0 && ++this.bX > 8) {
         this.bX = 0;
      }

      if (this.bY > 0) {
         this.bY++;
         if (this.bY > 300) {
            this.bY = 0;
         }
      }

      this.cw = this.cv;
      if (this.gO()) {
         this.cv = this.cv + (1.0F - this.cv) * 0.4F + 0.05F;
         if (this.cv > 1.0F) {
            this.cv = 1.0F;
         }
      } else {
         this.cv = this.cv + ((0.0F - this.cv) * 0.4F - 0.05F);
         if (this.cv < 0.0F) {
            this.cv = 0.0F;
         }
      }

      this.cy = this.cx;
      if (this.gP()) {
         this.cv = 0.0F;
         this.cw = this.cv;
         this.cx = this.cx + (1.0F - this.cx) * 0.4F + 0.05F;
         if (this.cx > 1.0F) {
            this.cx = 1.0F;
         }
      } else {
         this.cd = false;
         this.cx = this.cx + ((0.8F * this.cx * this.cx * this.cx - this.cx) * 0.6F - 0.05F);
         if (this.cx < 0.0F) {
            this.cx = 0.0F;
         }
      }

      this.cA = this.cz;
      if (this.s(64)) {
         this.cz = this.cz + (1.0F - this.cz) * 0.7F + 0.05F;
         if (this.cz > 1.0F) {
            this.cz = 1.0F;
         }
      } else {
         this.cz = this.cz + ((0.0F - this.cz) * 0.7F - 0.05F);
         if (this.cz < 0.0F) {
            this.cz = 0.0F;
         }
      }
   }

   @Override
   public but b(crz $$0, bus $$1) {
      if (this.bZ() || this.n_()) {
         return super.b($$0, $$1);
      } else if (this.gL() && $$0.fY()) {
         this.b($$0);
         return but.a;
      } else {
         daa $$2 = $$0.b($$1);
         if (!$$2.f()) {
            but $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bxf.g) && !this.ga()) {
               this.b($$0, $$2);
               return but.a;
            }
         }

         this.a($$0);
         return but.a;
      }
   }

   private void x() {
      if (!this.dV().C) {
         this.ct = 1;
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
   public awq gY() {
      return this.u();
   }

   public void gZ() {
      if (this.gv() && this.dj()) {
         this.cu = 1;
         this.B(true);
      }
   }

   public void ha() {
      if (!this.gP()) {
         this.gZ();
         this.b(this.gU());
      }
   }

   public boolean f(crz $$0) {
      this.j($$0);
      this.x(true);
      if ($$0 instanceof arv) {
         aq.y.a((arv)$$0, this);
      }

      this.dV().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(crz $$0, ffs $$1) {
      super.a($$0, $$1);
      ffr $$2 = this.i($$0);
      this.b($$2.k, $$2.j);
      this.N = this.aV = this.aX = this.dL();
      if (this.dg()) {
         if ($$1.f <= 0.0) {
            this.cf = 0;
         }

         if (this.aH()) {
            this.y(false);
            if (this.cc > 0.0F && !this.gN()) {
               this.b(this.cc, $$1);
            }

            this.cc = 0.0F;
         }
      }
   }

   protected ffr i(bxw $$0) {
      return new ffr($$0.dN() * 0.5F, $$0.dL());
   }

   @Override
   protected ffs b(crz $$0, ffs $$1) {
      if (this.aH() && this.cc == 0.0F && this.gP() && !this.cd) {
         return ffs.c;
      } else {
         float $$2 = $$0.bg * 0.5F;
         float $$3 = $$0.bi;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ffs((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float c(crz $$0) {
      return (float)this.h(bzc.v);
   }

   protected void b(float $$0, ffs $$1) {
      double $$2 = (double)this.z($$0);
      ffs $$3 = this.dy();
      this.n($$3.d, $$2, $$3.f);
      this.y(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = azq.a(this.dL() * (float) (Math.PI / 180.0));
         float $$5 = azq.b(this.dL() * (float) (Math.PI / 180.0));
         this.i(this.dy().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void hb() {
      this.a(awr.nq, 0.4F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gO());
      $$0.a("Bred", this.gQ());
      $$0.a("Temper", this.gR());
      $$0.a("Tame", this.gL());
      if (this.cB != null) {
         this.cB.a($$0, "Owner");
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.A($$0.b("EatingHaystack", false));
      this.z($$0.b("Bred", false));
      this.t($$0.b("Temper", 0));
      this.x($$0.b("Tame", false));
      this.cB = bxb.a($$0, "Owner", this.dV());
   }

   @Override
   public boolean a(cjm $$0) {
      return false;
   }

   protected boolean hc() {
      return !this.bZ() && !this.bY() && this.gL() && !this.n_() && this.eG() >= this.eU() && this.gE();
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return null;
   }

   protected void a(bwl $$0, clv $$1) {
      this.a($$0, $$1, bzc.s, (double)bN, (double)bO);
      this.a($$0, $$1, bzc.o, (double)bK, (double)bM);
      this.a($$0, $$1, bzc.v, (double)bI, (double)bJ);
   }

   private void a(bwl $$0, clv $$1, jg<byx> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.ae);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azz $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azq.a($$0, $$2, $$3);
         $$1 = azq.a($$1, $$2, $$3);
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
      return azq.h($$0, this.cw, this.cv);
   }

   public float K(float $$0) {
      return azq.h($$0, this.cy, this.cx);
   }

   public float L(float $$0) {
      return azq.h($$0, this.cA, this.cz);
   }

   @Override
   public void b(int $$0) {
      if (this.fZ()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cd = true;
            this.gZ();
         }

         if ($$0 >= 90) {
            this.cc = 1.0F;
         } else {
            this.cc = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.fZ();
   }

   @Override
   public void c(int $$0) {
      this.cd = true;
      this.gZ();
      this.hb();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lx $$1 = $$0 ? lz.S : lz.ah;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bwv $$0, bwv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxw) {
         ((bxw)$$0).aV = this.aV;
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
   public byn a_(int $$0) {
      int $$1 = $$0 - 500;
      return $$1 >= 0 && $$1 < this.ca.b() ? byn.a(this.ca, $$1) : super.a_($$0);
   }

   @Nullable
   @Override
   public bxw cW() {
      if (this.fZ()) {
         bwv var2 = this.cZ();
         if (var2 instanceof crz) {
            return (crz)var2;
         }
      }

      return super.cW();
   }

   @Nullable
   private ffs a(ffs $$0, bxw $$1) {
      double $$2 = this.dA() + $$0.d;
      double $$3 = this.cR().b;
      double $$4 = this.dG() + $$0.f;
      iw.a $$5 = new iw.a();
      UnmodifiableIterator var10 = $$1.fO().iterator();

      while (var10.hasNext()) {
         byi $$6 = (byi)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cR().e + 0.75;

         do {
            double $$8 = this.dV().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cus.a($$8)) {
               ffn $$9 = $$1.f($$6);
               ffs $$10 = new ffs($$2, (double)$$5.v() + $$8, $$4);
               if (cus.a(this.dV(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jc.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ffs b(bxw $$0) {
      ffs $$1 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fy() == bxn.b ? 90.0F : -90.0F));
      ffs $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ffs $$3 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fy() == bxn.a ? 90.0F : -90.0F));
         ffs $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dt();
      }
   }

   protected void a(azz $$0) {
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$3 == null) {
         $$3 = new bwl.a(0.2F);
      }

      this.a($$0.G_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean a(bum $$0) {
      return this.ca != $$0;
   }

   public int hd() {
      return this.S();
   }

   @Override
   protected ffs a(bwv $$0, bwy $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ffs(0.0, 0.15 * (double)this.cy * (double)$$2, -0.7 * (double)this.cy * (double)$$2).b(-this.dL() * (float) (Math.PI / 180.0)));
   }

   public int ad_() {
      return 0;
   }
}
