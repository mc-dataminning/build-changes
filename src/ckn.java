import com.google.common.collect.UnmodifiableIterator;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class ckn extends cig implements bwj, bwy, bxb {
   public static final int bP = 499;
   public static final int bQ = 500;
   public static final double bR = 0.15;
   private static final float bE = (float)b(() -> 0.0);
   private static final float bF = (float)b(() -> 1.0);
   private static final float bG = (float)a(() -> 0.0);
   private static final float bI = (float)a(() -> 1.0);
   private static final float bJ = a($$0 -> 0);
   private static final float bK = a($$0 -> $$0 - 1);
   private static final float bL = 0.25F;
   private static final float bM = 0.5F;
   private static final chg.a bN = ($$0, $$1) -> {
      if ($$0 instanceof ckn $$2 && $$2.gM()) {
         return true;
      }

      return false;
   };
   private static final chg bO = chg.b().a(16.0).d().a(bN);
   private static final akg<Byte> cc = akk.a(ckn.class, aki.a);
   private static final int cd = 2;
   private static final int ce = 8;
   private static final int cf = 16;
   private static final int cg = 32;
   private static final int ch = 64;
   public static final int bS = 3;
   private int ci;
   private int cj;
   private int ck;
   public int bT;
   public int bU;
   protected boolean bV;
   protected btx bW;
   protected int bX;
   protected float bY;
   protected boolean bZ;
   private float cl;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   protected boolean ca = true;
   protected int cb;
   @Nullable
   private bvy<bwr> ct;

   protected ckn(bwb<? extends ckn> $$0, dhp $$1) {
      super($$0, $$1);
      this.gP();
   }

   @Override
   protected void D() {
      this.bB.a(1, new ceg(this, 1.2));
      this.bB.a(1, new cer(this, 1.2));
      this.bB.a(2, new ccz(this, 1.0, ckn.class));
      this.bB.a(4, new cdm(this, 1.0));
      this.bB.a(6, new cfa(this, 0.7));
      this.bB.a(7, new cdv(this, cqi.class, 6.0F));
      this.bB.a(8, new cei(this));
      if (this.gr()) {
         this.bB.a(9, new cej(this));
      }

      this.gI();
   }

   protected void gI() {
      this.bB.a(0, new cdh(this));
      this.bB.a(3, new cev(this, 1.25, $$0 -> $$0.a(axi.aj), false));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cc, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(cc) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(cc);
      if ($$1) {
         this.al.a(cc, (byte)($$2 | $$0));
      } else {
         this.al.a(cc, (byte)($$2 & ~$$0));
      }
   }

   public boolean gH() {
      return this.s(2);
   }

   @Nullable
   @Override
   public bvy<bwr> d() {
      return this.ct;
   }

   public void k(@Nullable bwr $$0) {
      this.ct = $$0 != null ? new bvy<>($$0) : null;
   }

   public boolean gJ() {
      return this.bV;
   }

   public void x(boolean $$0) {
      this.d(2, $$0);
   }

   public void y(boolean $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(bvs $$0, float $$1) {
      if ($$1 > 6.0F && this.gK()) {
         this.A(false);
      }

      return true;
   }

   public boolean gK() {
      return this.s(16);
   }

   public boolean gL() {
      return this.s(32);
   }

   public boolean gM() {
      return this.s(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean e(bwc $$0) {
      return $$0 != bwc.h ? super.e($$0) : this.bK() && !this.n_() && this.gH();
   }

   public void b(cqi $$0, cxy $$1) {
      if (this.a($$1, bwc.g)) {
         this.i($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bwc $$0) {
      return ($$0 == bwc.g || $$0 == bwc.h) && this.gH() || super.f($$0);
   }

   public int gN() {
      return this.bX;
   }

   public void t(int $$0) {
      this.bX = $$0;
   }

   public int u(int $$0) {
      int $$1 = azk.a(this.gN() + $$0, 0, this.gS());
      this.t($$1);
      return $$1;
   }

   @Override
   public boolean bH() {
      return !this.ca();
   }

   private void q() {
      this.x();
      if (!this.bb()) {
         awj $$0 = this.gs();
         if ($$0 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
      if ($$0 > 1.0) {
         this.a(awk.nn, 0.4F, 1.0F);
      }

      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.ca()) {
            for (bvs $$4 : this.dc()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eP();
         return true;
      }
   }

   public final int gO() {
      return v(this.aa_());
   }

   public static int v(int $$0) {
      return $$0 * 3;
   }

   protected void gP() {
      btx $$0 = this.bW;
      this.bW = new btx(this.gO());
      if ($$0 != null) {
         int $$1 = Math.min($$0.b(), this.bW.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cxy $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.bW.a($$2, $$3.v());
            }
         }
      }
   }

   @Override
   protected js<awj> a(bwc $$0, cxy $$1, dgc $$2) {
      return (js<awj>)($$0 == bwc.h ? awk.no : super.a($$0, $$1, $$2));
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gV();
      }

      return $$3;
   }

   protected boolean gr() {
      return true;
   }

   @Nullable
   protected awj gs() {
      return null;
   }

   @Nullable
   protected awj gQ() {
      return null;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      if (!$$1.n()) {
         dym $$2 = this.dV().a_($$0.d());
         dsn $$3 = $$1.A();
         if ($$2.a(dkw.ea)) {
            $$3 = $$2.A();
         }

         if (this.ca() && this.ca) {
            this.cb++;
            if (this.cb > 5 && this.cb % 3 == 0) {
               this.a($$3);
            } else if (this.cb <= 5) {
               this.a(awk.nq, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awk.nq, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awk.np, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dsn $$0) {
      return $$0 == dsn.b || $$0 == dsn.aU || $$0 == dsn.B || $$0 == dsn.aV || $$0 == dsn.aT;
   }

   protected void a(dsn $$0) {
      this.a(awk.nk, $$0.a() * 0.15F, $$0.b());
   }

   public static bxw.a gR() {
      return cig.gv().a(bxx.o, 0.7).a(bxx.s, 53.0).a(bxx.v, 0.225F).a(bxx.B, 1.0).a(bxx.x, 6.0).a(bxx.k, 0.5);
   }

   @Override
   public int ai() {
      return 6;
   }

   public int gS() {
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
   public void b(cqi $$0) {
      if (!this.dV().C && (!this.ca() || this.y($$0)) && this.gH()) {
         $$0.a(this, this.bW);
      }
   }

   public btq c(cqi $$0, cxy $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (btq)(!$$2 && !this.dV().C ? btq.e : btq.b);
   }

   protected boolean a(cqi $$0, cxy $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cyc.qf)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cyc.sB)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dkw.iH.i())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cyc.pd)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cyc.vn)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dV().C && this.gH() && this.g() == 0 && !this.gA()) {
            $$2 = true;
            this.e($$0);
         }
      } else if ($$1.a(cyc.qJ) || $$1.a(cyc.qK)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dV().C && this.gH() && this.g() == 0 && !this.gA()) {
            $$2 = true;
            this.e($$0);
         }
      }

      if (this.eF() < this.eT() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.n_() && $$4 > 0) {
         this.dV().a(lv.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gH()) && this.gN() < this.gS() && !this.dV().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(edm.m);
      }

      return $$2;
   }

   protected void a(cqi $$0) {
      this.A(false);
      this.B(false);
      if (!this.dV().C) {
         $$0.w(this.dL());
         $$0.x(this.dN());
         $$0.n(this);
      }
   }

   @Override
   public boolean ff() {
      return super.ff() && this.ca() && this.ak() || this.gK() || this.gL();
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ai);
   }

   private void t() {
      this.bT = 1;
   }

   @Override
   protected void f(arn $$0) {
      super.f($$0);
      if (this.bW != null) {
         for (int $$1 = 0; $$1 < this.bW.b(); $$1++) {
            cxy $$2 = this.bW.a($$1);
            if (!$$2.f() && !dej.a($$2, dei.D)) {
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
      if (this.dV() instanceof arn $$0 && this.bK()) {
         if (this.ae.a(900) == 0 && this.aO == 0) {
            this.c(1.0F);
         }

         if (this.gT()) {
            if (!this.gK() && !this.ca() && this.ae.a(300) == 0 && $$0.a_(this.dv().e()).a(dkw.i)) {
               this.A(true);
            }

            if (this.gK() && ++this.ci > 50) {
               this.ci = 0;
               this.A(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(arn $$0) {
      if (this.gM() && this.n_() && !this.gK()) {
         bwr $$1 = $$0.a(ckn.class, bO, this, this.dA(), this.dC(), this.dG(), this.cR().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bA.a($$1, 0);
         }
      }
   }

   public boolean gT() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.cj > 0 && ++this.cj > 30) {
         this.cj = 0;
         this.d(64, false);
      }

      if (this.dj() && this.ck > 0 && ++this.ck > 20) {
         this.ck = 0;
         this.B(false);
      }

      if (this.bT > 0 && ++this.bT > 8) {
         this.bT = 0;
      }

      if (this.bU > 0) {
         this.bU++;
         if (this.bU > 300) {
            this.bU = 0;
         }
      }

      this.co = this.cl;
      if (this.gK()) {
         this.cl = this.cl + (1.0F - this.cl) * 0.4F + 0.05F;
         if (this.cl > 1.0F) {
            this.cl = 1.0F;
         }
      } else {
         this.cl = this.cl + ((0.0F - this.cl) * 0.4F - 0.05F);
         if (this.cl < 0.0F) {
            this.cl = 0.0F;
         }
      }

      this.cq = this.cp;
      if (this.gL()) {
         this.cl = 0.0F;
         this.co = this.cl;
         this.cp = this.cp + (1.0F - this.cp) * 0.4F + 0.05F;
         if (this.cp > 1.0F) {
            this.cp = 1.0F;
         }
      } else {
         this.bZ = false;
         this.cp = this.cp + ((0.8F * this.cp * this.cp * this.cp - this.cp) * 0.6F - 0.05F);
         if (this.cp < 0.0F) {
            this.cp = 0.0F;
         }
      }

      this.cs = this.cr;
      if (this.s(64)) {
         this.cr = this.cr + (1.0F - this.cr) * 0.7F + 0.05F;
         if (this.cr > 1.0F) {
            this.cr = 1.0F;
         }
      } else {
         this.cr = this.cr + ((0.0F - this.cr) * 0.7F - 0.05F);
         if (this.cr < 0.0F) {
            this.cr = 0.0F;
         }
      }
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      if (this.ca() || this.n_()) {
         return super.b($$0, $$1);
      } else if (this.gH() && $$0.fX()) {
         this.b($$0);
         return btq.a;
      } else {
         cxy $$2 = $$0.b($$1);
         if (!$$2.f()) {
            btq $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bwc.g) && !this.fW()) {
               this.b($$0, $$2);
               return btq.a;
            }
         }

         this.a($$0);
         return btq.a;
      }
   }

   private void x() {
      if (!this.dV().C) {
         this.cj = 1;
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
   public awj gU() {
      return this.u();
   }

   public void gV() {
      if (this.gr() && this.dj()) {
         this.ck = 1;
         this.B(true);
      }
   }

   public void gW() {
      if (!this.gL()) {
         this.gV();
         this.b(this.gQ());
      }
   }

   public boolean f(cqi $$0) {
      this.k($$0);
      this.x(true);
      if ($$0 instanceof aro) {
         ap.y.a((aro)$$0, this);
      }

      this.dV().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cqi $$0, fcu $$1) {
      super.a($$0, $$1);
      fct $$2 = this.j($$0);
      this.b($$2.j, $$2.i);
      this.N = this.aU = this.aW = this.dL();
      if (this.dg()) {
         if ($$1.f <= 0.0) {
            this.cb = 0;
         }

         if (this.aJ()) {
            this.y(false);
            if (this.bY > 0.0F && !this.gJ()) {
               this.b(this.bY, $$1);
            }

            this.bY = 0.0F;
         }
      }
   }

   protected fct j(bwr $$0) {
      return new fct($$0.dN() * 0.5F, $$0.dL());
   }

   @Override
   protected fcu b(cqi $$0, fcu $$1) {
      if (this.aJ() && this.bY == 0.0F && this.gL() && !this.bZ) {
         return fcu.c;
      } else {
         float $$2 = $$0.bf * 0.5F;
         float $$3 = $$0.bh;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new fcu((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float c(cqi $$0) {
      return (float)this.h(bxx.v);
   }

   protected void b(float $$0, fcu $$1) {
      double $$2 = (double)this.A($$0);
      fcu $$3 = this.dy();
      this.n($$3.d, $$2, $$3.f);
      this.y(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = azk.a(this.dL() * (float) (Math.PI / 180.0));
         float $$5 = azk.b(this.dL() * (float) (Math.PI / 180.0));
         this.i(this.dy().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gX() {
      this.a(awk.nm, 0.4F, 1.0F);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gK());
      $$0.a("Bred", this.gM());
      $$0.a("Temper", this.gN());
      $$0.a("Tame", this.gH());
      if (this.ct != null) {
         this.ct.a($$0, "Owner");
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.A($$0.q("EatingHaystack"));
      this.z($$0.q("Bred"));
      this.t($$0.h("Temper"));
      this.x($$0.q("Tame"));
      this.ct = bvy.a($$0, "Owner", this.dV());
   }

   @Override
   public boolean a(cig $$0) {
      return false;
   }

   protected boolean gY() {
      return !this.ca() && !this.bZ() && this.gH() && !this.n_() && this.eF() >= this.eT() && this.gA();
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return null;
   }

   protected void a(bvi $$0, ckn $$1) {
      this.a($$0, $$1, bxx.s, (double)bJ, (double)bK);
      this.a($$0, $$1, bxx.o, (double)bG, (double)bI);
      this.a($$0, $$1, bxx.v, (double)bE, (double)bF);
   }

   private void a(bvi $$0, ckn $$1, js<bxs> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.ae);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azs $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azk.a($$0, $$2, $$3);
         $$1 = azk.a($$1, $$2, $$3);
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

   public float K(float $$0) {
      return azk.h($$0, this.co, this.cl);
   }

   public float L(float $$0) {
      return azk.h($$0, this.cq, this.cp);
   }

   public float M(float $$0) {
      return azk.h($$0, this.cs, this.cr);
   }

   @Override
   public void b(int $$0) {
      if (this.ak()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.bZ = true;
            this.gV();
         }

         if ($$0 >= 90) {
            this.bY = 1.0F;
         } else {
            this.bY = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.ak();
   }

   @Override
   public void c(int $$0) {
      this.bZ = true;
      this.gV();
      this.gX();
   }

   @Override
   public void b() {
   }

   protected void C(boolean $$0) {
      lt $$1 = $$0 ? lv.S : lv.ah;

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
   protected void a(bvs $$0, bvs.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bwr) {
         ((bwr)$$0).aU = this.aU;
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
   public bxi a_(int $$0) {
      int $$1 = $$0 - 500;
      return $$1 >= 0 && $$1 < this.bW.b() ? bxi.a(this.bW, $$1) : super.a_($$0);
   }

   @Nullable
   @Override
   public bwr cW() {
      if (this.ak()) {
         bvs var2 = this.cZ();
         if (var2 instanceof cqi) {
            return (cqi)var2;
         }
      }

      return super.cW();
   }

   @Nullable
   private fcu a(fcu $$0, bwr $$1) {
      double $$2 = this.dA() + $$0.d;
      double $$3 = this.cR().b;
      double $$4 = this.dG() + $$0.f;
      jj.a $$5 = new jj.a();
      UnmodifiableIterator var10 = $$1.fN().iterator();

      while (var10.hasNext()) {
         bxd $$6 = (bxd)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cR().e + 0.75;

         do {
            double $$8 = this.dV().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (csn.a($$8)) {
               fcp $$9 = $$1.f($$6);
               fcu $$10 = new fcu($$2, (double)$$5.v() + $$8, $$4);
               if (csn.a(this.dV(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jo.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public fcu b(bwr $$0) {
      fcu $$1 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fx() == bwk.b ? 90.0F : -90.0F));
      fcu $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         fcu $$3 = a((double)this.dq(), (double)$$0.dq(), this.dL() + ($$0.fx() == bwk.a ? 90.0F : -90.0F));
         fcu $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dt();
      }
   }

   protected void a(azs $$0) {
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$3 == null) {
         $$3 = new bvi.a(0.2F);
      }

      this.a($$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean a(btj $$0) {
      return this.bW != $$0;
   }

   public int gZ() {
      return this.S();
   }

   @Override
   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new fcu(0.0, 0.15 * (double)this.cq * (double)$$2, -0.7 * (double)this.cq * (double)$$2).b(-this.dL() * (float) (Math.PI / 180.0)));
   }

   public int aa_() {
      return 0;
   }
}
