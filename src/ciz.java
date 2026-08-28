import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ciz extends cgv implements bsc, bux, bvl, bvo, bvu {
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
   private static final Predicate<bve> ch = $$0 -> $$0 instanceof ciz && ((ciz)$$0).gR();
   private static final cfv ci = cfv.b().a(16.0).d().a(ch);
   private static final ako<Byte> cA = aks.a(ciz.class, akq.a);
   private static final int cB = 2;
   private static final int cC = 4;
   private static final int cD = 8;
   private static final int cE = 16;
   private static final int cF = 32;
   private static final int cG = 64;
   public static final int cn = 0;
   public static final int co = 1;
   public static final int cp = 3;
   private int cH;
   private int cI;
   private int cJ;
   public int cq;
   public int cr;
   protected boolean cs;
   protected bso ct;
   protected int cu;
   protected float cv;
   protected boolean cw;
   private float cK;
   private float cL;
   private float cM;
   private float cN;
   private float cO;
   private float cP;
   protected boolean cx = true;
   protected int cy;
   @Nullable
   private UUID cQ;
   private final bsa cR = new fbd() {
      @Override
      public cwf f() {
         return ciz.this.ak();
      }

      @Override
      public void b(cwf $$0) {
         ciz.this.j($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cor $$0) {
         return $$0.dm() == ciz.this || $$0.b(ciz.this, 4.0);
      }
   };

   protected ciz(bup<? extends ciz> $$0, dff $$1) {
      super($$0, $$1);
      this.gU();
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccv(this, 1.2));
      this.bS.a(1, new cdg(this, 1.2));
      this.bS.a(2, new cbo(this, 1.0, ciz.class));
      this.bS.a(4, new ccb(this, 1.0));
      this.bS.a(6, new cdp(this, 0.7));
      this.bS.a(7, new cck(this, cor.class, 6.0F));
      this.bS.a(8, new ccx(this));
      if (this.gw()) {
         this.bS.a(9, new ccy(this));
      }

      this.gN();
   }

   protected void gN() {
      this.bS.a(0, new cbw(this));
      this.bS.a(3, new cdk(this, 1.25, $$0 -> $$0.a(axm.ak), false));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cA, (byte)0);
   }

   protected boolean t(int $$0) {
      return (this.am.a(cA) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.am.a(cA);
      if ($$1) {
         this.am.a(cA, (byte)($$2 | $$0));
      } else {
         this.am.a(cA, (byte)($$2 & ~$$0));
      }
   }

   public boolean gM() {
      return this.t(2);
   }

   @Nullable
   @Override
   public UUID ab_() {
      return this.cQ;
   }

   public void b(@Nullable UUID $$0) {
      this.cQ = $$0;
   }

   public boolean gO() {
      return this.cs;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   public void z(boolean $$0) {
      this.cs = $$0;
   }

   @Override
   public boolean a(bui $$0, float $$1) {
      if ($$1 > 6.0F && this.gP()) {
         this.B(false);
      }

      return true;
   }

   public boolean gP() {
      return this.t(16);
   }

   public boolean gQ() {
      return this.t(32);
   }

   public boolean gR() {
      return this.t(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bN() && !this.p_() && this.gM();
   }

   @Override
   public void a(cwf $$0, @Nullable awp $$1) {
      this.ct.a(0, $$0);
   }

   public void b(cor $$0, cwf $$1) {
      if (this.a($$1, buq.g)) {
         this.j($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(buq $$0) {
      return $$0 == buq.g && this.gM() || super.f($$0);
   }

   @Override
   public boolean i() {
      return this.t(4);
   }

   public int gS() {
      return this.cu;
   }

   public void u(int $$0) {
      this.cu = $$0;
   }

   public int v(int $$0) {
      int $$1 = azn.a(this.gS() + $$0, 0, this.gY());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bK() {
      return !this.cc();
   }

   private void q() {
      this.y();
      if (!this.bd()) {
         awn $$0 = this.gx();
         if ($$0 != null) {
            this.dY().a(null, this.dD(), this.dF(), this.dJ(), $$0, this.do(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      if ($$0 > 1.0F) {
         this.a(awo.mO, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.cc()) {
            for (bui $$4 : this.df()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eS();
         return true;
      }
   }

   public final int gT() {
      return w(this.ag_());
   }

   public static int w(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gU() {
      bso $$0 = this.ct;
      this.ct = new bso(this.gT());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ct.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cwf $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ct.a($$2, $$3.v());
            }
         }
      }

      this.ct.a(this);
      this.gV();
   }

   protected void gV() {
      if (!this.dY().C) {
         this.d(4, !this.ct.a(0).f());
      }
   }

   @Override
   public void a(bsa $$0) {
      boolean $$1 = this.i();
      this.gV();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.ad_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.af.a(3) == 0) {
         this.hc();
      }

      return $$2;
   }

   protected boolean gw() {
      return true;
   }

   @Nullable
   protected awn gx() {
      return null;
   }

   @Nullable
   protected awn gW() {
      return null;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      if (!$$1.n()) {
         dvo $$2 = this.dY().a_($$0.d());
         dpw $$3 = $$1.A();
         if ($$2.a(dil.dN)) {
            $$3 = $$2.A();
         }

         if (this.cc() && this.cx) {
            this.cy++;
            if (this.cy > 5 && this.cy % 3 == 0) {
               this.a($$3);
            } else if (this.cy <= 5) {
               this.a(awo.mR, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awo.mR, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awo.mQ, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dpw $$0) {
      return $$0 == dpw.b || $$0 == dpw.aT || $$0 == dpw.B || $$0 == dpw.aU || $$0 == dpw.aS;
   }

   protected void a(dpw $$0) {
      this.a(awo.mL, $$0.a() * 0.15F, $$0.b());
   }

   public static bwl.a gX() {
      return cgv.gA().a(bwm.o, 0.7).a(bwm.s, 53.0).a(bwm.v, 0.225F).a(bwm.B, 1.0).a(bwm.x, 6.0).a(bwm.k, 0.5);
   }

   @Override
   public int aj() {
      return 6;
   }

   public int gY() {
      return 100;
   }

   @Override
   protected float fj() {
      return 0.8F;
   }

   @Override
   public int T() {
      return 400;
   }

   @Override
   public void b(cor $$0) {
      if (!this.dY().C && (!this.cc() || this.y($$0)) && this.gM()) {
         $$0.a(this, this.ct);
      }
   }

   public bsh c(cor $$0, cwf $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bsh)(!$$2 && !this.dY().C ? bsh.e : bsh.b);
   }

   protected boolean a(cor $$0, cwf $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cwj.px)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cwj.rR)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dil.ij.j())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cwj.ov)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cwj.uC)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dY().C && this.gM() && this.g() == 0 && !this.gF()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cwj.qb) || $$1.a(cwj.qc)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dY().C && this.gM() && this.g() == 0 && !this.gF()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eH() < this.eW() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dY().a(ls.O, this.d(1.0), this.dG() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dY().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gM()) && this.gS() < this.gY() && !this.dY().C) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(eak.m);
      }

      return $$2;
   }

   protected void a(cor $$0) {
      this.B(false);
      this.C(false);
      if (!this.dY().C) {
         $$0.v(this.dO());
         $$0.w(this.dQ());
         $$0.n(this);
      }
   }

   @Override
   public boolean fl() {
      return super.fl() && this.cc() && this.i() || this.gP() || this.gQ();
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.aj);
   }

   private void t() {
      this.cq = 1;
   }

   @Override
   protected void eK() {
      super.eK();
      if (this.ct != null) {
         for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
            cwf $$1 = this.ct.a($$0);
            if (!$$1.f() && !dby.a($$1, dbx.D)) {
               this.b($$1);
            }
         }
      }
   }

   @Override
   public void n_() {
      if (this.af.a(200) == 0) {
         this.t();
      }

      super.n_();
      if (!this.dY().C && this.bN()) {
         if (this.af.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.ha()) {
            if (!this.gP() && !this.cc() && this.af.a(300) == 0 && this.dY().a_(this.dy().e()).a(dil.i)) {
               this.B(true);
            }

            if (this.gP() && ++this.cH > 50) {
               this.cH = 0;
               this.B(false);
            }
         }

         this.gZ();
      }
   }

   protected void gZ() {
      if (this.gR() && this.p_() && !this.gP()) {
         bve $$0 = this.dY().a(ciz.class, ci, this, this.dD(), this.dF(), this.dJ(), this.cT().g(16.0));
         if ($$0 != null && this.g($$0) > 4.0) {
            this.bR.a($$0, 0);
         }
      }
   }

   public boolean ha() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.cI > 0 && ++this.cI > 30) {
         this.cI = 0;
         this.d(64, false);
      }

      if (this.dl() && this.cJ > 0 && ++this.cJ > 20) {
         this.cJ = 0;
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

      this.cL = this.cK;
      if (this.gP()) {
         this.cK = this.cK + (1.0F - this.cK) * 0.4F + 0.05F;
         if (this.cK > 1.0F) {
            this.cK = 1.0F;
         }
      } else {
         this.cK = this.cK + ((0.0F - this.cK) * 0.4F - 0.05F);
         if (this.cK < 0.0F) {
            this.cK = 0.0F;
         }
      }

      this.cN = this.cM;
      if (this.gQ()) {
         this.cK = 0.0F;
         this.cL = this.cK;
         this.cM = this.cM + (1.0F - this.cM) * 0.4F + 0.05F;
         if (this.cM > 1.0F) {
            this.cM = 1.0F;
         }
      } else {
         this.cw = false;
         this.cM = this.cM + ((0.8F * this.cM * this.cM * this.cM - this.cM) * 0.6F - 0.05F);
         if (this.cM < 0.0F) {
            this.cM = 0.0F;
         }
      }

      this.cP = this.cO;
      if (this.t(64)) {
         this.cO = this.cO + (1.0F - this.cO) * 0.7F + 0.05F;
         if (this.cO > 1.0F) {
            this.cO = 1.0F;
         }
      } else {
         this.cO = this.cO + ((0.0F - this.cO) * 0.7F - 0.05F);
         if (this.cO < 0.0F) {
            this.cO = 0.0F;
         }
      }
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      if (this.cc() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gM() && $$0.gb()) {
         this.b($$0);
         return bsh.a;
      } else {
         cwf $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bsh $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, buq.g) && !this.al()) {
               this.b($$0, $$2);
               return bsh.a;
            }
         }

         this.a($$0);
         return bsh.a;
      }
   }

   private void y() {
      if (!this.dY().C) {
         this.cI = 1;
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
   public awn hb() {
      return this.w();
   }

   public void hc() {
      if (this.gw() && this.dl()) {
         this.cJ = 1;
         this.C(true);
      }
   }

   public void hd() {
      if (!this.gQ()) {
         this.hc();
         this.b(this.gW());
      }
   }

   public boolean g(cor $$0) {
      this.b($$0.cI());
      this.y(true);
      if ($$0 instanceof arr) {
         ao.y.a((arr)$$0, this);
      }

      this.dY().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cor $$0, ezr $$1) {
      super.a($$0, $$1);
      ezq $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aX = this.aZ = this.dO();
      if (this.dk()) {
         if ($$1.f <= 0.0) {
            this.cy = 0;
         }

         if (this.aL()) {
            this.z(false);
            if (this.cv > 0.0F && !this.gO()) {
               this.b(this.cv, $$1);
            }

            this.cv = 0.0F;
         }
      }
   }

   protected ezq j(bve $$0) {
      return new ezq($$0.dQ() * 0.5F, $$0.dO());
   }

   @Override
   protected ezr b(cor $$0, ezr $$1) {
      if (this.aL() && this.cv == 0.0F && this.gQ() && !this.cw) {
         return ezr.c;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ezr((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cor $$0) {
      return (float)this.h(bwm.v);
   }

   protected void b(float $$0, ezr $$1) {
      double $$2 = (double)this.A($$0);
      ezr $$3 = this.dB();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.as = true;
      if ($$1.f > 0.0) {
         float $$4 = azn.a(this.dO() * (float) (Math.PI / 180.0));
         float $$5 = azn.b(this.dO() * (float) (Math.PI / 180.0));
         this.h(this.dB().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void he() {
      this.a(awo.mN, 0.4F, 1.0F);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gP());
      $$0.a("Bred", this.gR());
      $$0.a("Temper", this.gS());
      $$0.a("Tame", this.gM());
      if (this.ab_() != null) {
         $$0.a("Owner", this.ab_());
      }

      if (!this.ct.a(0).f()) {
         $$0.a("SaddleItem", this.ct.a(0).a(this.ea()));
      }
   }

   @Override
   public void a(un $$0) {
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
         $$1 = avq.a(this.cX(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cwf $$4 = cwf.a(this.ea(), (vk)$$0.p("SaddleItem")).orElse(cwf.k);
         if ($$4.a(cwj.nL)) {
            this.ct.a(0, $$4);
         }
      }

      this.gV();
   }

   @Override
   public boolean a(cgv $$0) {
      return false;
   }

   protected boolean hf() {
      return !this.cc() && !this.cb() && this.gM() && !this.p_() && this.eH() >= this.eW() && this.gF();
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return null;
   }

   protected void a(btz $$0, ciz $$1) {
      this.a($$0, $$1, bwm.s, (double)cd, (double)ce);
      this.a($$0, $$1, bwm.o, (double)ca, (double)cc);
      this.a($$0, $$1, bwm.v, (double)bY, (double)bZ);
   }

   private void a(btz $$0, ciz $$1, jq<bwh> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.af);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azv $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azn.a($$0, $$2, $$3);
         $$1 = azn.a($$1, $$2, $$3);
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
      return azn.h($$0, this.cL, this.cK);
   }

   public float K(float $$0) {
      return azn.h($$0, this.cN, this.cM);
   }

   public float L(float $$0) {
      return azn.h($$0, this.cP, this.cO);
   }

   @Override
   public void b(int $$0) {
      if (this.i()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cw = true;
            this.hc();
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
      return this.i();
   }

   @Override
   public void c(int $$0) {
      this.cw = true;
      this.hc();
      this.he();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      lq $$1 = $$0 ? ls.Q : ls.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dY().a($$1, this.d(1.0), this.dG() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(bui $$0, bui.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bve) {
         ((bve)$$0).aX = this.aX;
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
   public bvw a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bvw() {
            @Override
            public cwf a() {
               return ciz.this.ct.a(0);
            }

            @Override
            public boolean a(cwf $$0) {
               if (!$$0.f() && !$$0.a(cwj.nL)) {
                  return false;
               } else {
                  ciz.this.ct.a(0, $$0);
                  ciz.this.gV();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ct.b() ? bvw.a(this.ct, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bve cZ() {
      if (this.i()) {
         bui var2 = this.dc();
         if (var2 instanceof cor) {
            return (cor)var2;
         }
      }

      return super.cZ();
   }

   @Nullable
   private ezr a(ezr $$0, bve $$1) {
      double $$2 = this.dD() + $$0.d;
      double $$3 = this.cT().b;
      double $$4 = this.dJ() + $$0.f;
      jh.a $$5 = new jh.a();
      UnmodifiableIterator var10 = $$1.fR().iterator();

      while (var10.hasNext()) {
         bvq $$6 = (bvq)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cT().e + 0.75;

         do {
            double $$8 = this.dY().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cqt.a($$8)) {
               ezm $$9 = $$1.f($$6);
               ezr $$10 = new ezr($$2, (double)$$5.v() + $$8, $$4);
               if (cqt.a(this.dY(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jm.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ezr b(bve $$0) {
      ezr $$1 = a((double)this.dt(), (double)$$0.dt(), this.dO() + ($$0.fB() == buy.b ? 90.0F : -90.0F));
      ezr $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ezr $$3 = a((double)this.dt(), (double)$$0.dt(), this.dO() + ($$0.fB() == buy.a ? 90.0F : -90.0F));
         ezr $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dw();
      }
   }

   protected void a(azv $$0) {
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$3 == null) {
         $$3 = new btz.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(bsa $$0) {
      return this.ct != $$0;
   }

   public int hg() {
      return this.T();
   }

   @Override
   protected ezr a(bui $$0, bul $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ezr(0.0, 0.15 * (double)this.cN * (double)$$2, -0.7 * (double)this.cN * (double)$$2).b(-this.dO() * (float) (Math.PI / 180.0)));
   }

   public final bsa hh() {
      return this.cR;
   }

   public int ag_() {
      return 0;
   }
}
