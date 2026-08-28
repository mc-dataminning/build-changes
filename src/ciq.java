import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ciq extends cgm implements brt, buo, bvc, bvf, bvl {
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
   private static final Predicate<buv> ch = $$0 -> $$0 instanceof ciq && ((ciq)$$0).gR();
   private static final cfm ci = cfm.b().a(16.0).d().a(ch);
   private static final akk<Byte> cA = ako.a(ciq.class, akm.a);
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
   protected bsf ct;
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
   private final brr cR = new fat() {
      @Override
      public cvx f() {
         return ciq.this.ak();
      }

      @Override
      public void b(cvx $$0) {
         ciq.this.j($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(coh $$0) {
         return $$0.dl() == ciq.this || $$0.b(ciq.this, 4.0);
      }
   };

   protected ciq(bug<? extends ciq> $$0, dev $$1) {
      super($$0, $$1);
      this.gU();
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccm(this, 1.2));
      this.bS.a(1, new ccx(this, 1.2));
      this.bS.a(2, new cbf(this, 1.0, ciq.class));
      this.bS.a(4, new cbs(this, 1.0));
      this.bS.a(6, new cdg(this, 0.7));
      this.bS.a(7, new ccb(this, coh.class, 6.0F));
      this.bS.a(8, new cco(this));
      if (this.gw()) {
         this.bS.a(9, new ccp(this));
      }

      this.gN();
   }

   protected void gN() {
      this.bS.a(0, new cbn(this));
      this.bS.a(3, new cdb(this, 1.25, $$0 -> $$0.a(axi.ah), false));
   }

   @Override
   protected void a(ako.a $$0) {
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
   public boolean a(btz $$0, float $$1) {
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
      return this.bM() && !this.p_() && this.gM();
   }

   @Override
   public void a(cvx $$0, @Nullable awl $$1) {
      this.ct.a(0, $$0);
   }

   public void b(coh $$0, cvx $$1) {
      if (this.a($$1, buh.g)) {
         this.j($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(buh $$0) {
      return $$0 == buh.g && this.gM() || super.f($$0);
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
      int $$1 = azj.a(this.gS() + $$0, 0, this.gY());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bJ() {
      return !this.cb();
   }

   private void q() {
      this.y();
      if (!this.bc()) {
         awj $$0 = this.gx();
         if ($$0 != null) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), $$0, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsp $$2) {
      if ($$0 > 1.0F) {
         this.a(awk.mO, 0.4F, 1.0F);
      }

      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.cb()) {
            for (btz $$4 : this.de()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eR();
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
      bsf $$0 = this.ct;
      this.ct = new bsf(this.gT());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ct.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cvx $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.ct.a($$2, $$3.v());
            }
         }
      }

      this.ct.a(this);
      this.gV();
   }

   protected void gV() {
      if (!this.dX().C) {
         this.d(4, !this.ct.a(0).f());
      }
   }

   @Override
   public void a(brr $$0) {
      boolean $$1 = this.i();
      this.gV();
      if (this.ag > 20 && !$$1 && this.i()) {
         this.a(this.ad_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
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
   protected awj gx() {
      return null;
   }

   @Nullable
   protected awj gW() {
      return null;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      if (!$$1.n()) {
         dvd $$2 = this.dX().a_($$0.d());
         dpl $$3 = $$1.A();
         if ($$2.a(dia.dN)) {
            $$3 = $$2.A();
         }

         if (this.cb() && this.cx) {
            this.cy++;
            if (this.cy > 5 && this.cy % 3 == 0) {
               this.a($$3);
            } else if (this.cy <= 5) {
               this.a(awk.mR, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(awk.mR, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(awk.mQ, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dpl $$0) {
      return $$0 == dpl.b || $$0 == dpl.aT || $$0 == dpl.B || $$0 == dpl.aU || $$0 == dpl.aS;
   }

   protected void a(dpl $$0) {
      this.a(awk.mL, $$0.a() * 0.15F, $$0.b());
   }

   public static bwc.a gX() {
      return cgm.gA().a(bwd.o, 0.7).a(bwd.s, 53.0).a(bwd.v, 0.225F).a(bwd.B, 1.0).a(bwd.x, 6.0).a(bwd.k, 0.5);
   }

   @Override
   public int aj() {
      return 6;
   }

   public int gY() {
      return 100;
   }

   @Override
   protected float fi() {
      return 0.8F;
   }

   @Override
   public int T() {
      return 400;
   }

   @Override
   public void b(coh $$0) {
      if (!this.dX().C && (!this.cb() || this.y($$0)) && this.gM()) {
         $$0.a(this, this.ct);
      }
   }

   public bry c(coh $$0, cvx $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bry)(!$$2 && !this.dX().C ? bry.e : bry.b);
   }

   protected boolean a(coh $$0, cvx $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cwb.px)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cwb.rB)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dia.ij.j())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cwb.ov)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cwb.um)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dX().C && this.gM() && this.g() == 0 && !this.gF()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cwb.qb) || $$1.a(cwb.qc)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dX().C && this.gM() && this.g() == 0 && !this.gF()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eG() < this.eV() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.p_() && $$4 > 0) {
         this.dX().a(lq.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dX().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gM()) && this.gS() < this.gY() && !this.dX().C) {
         this.v($$5);
         $$2 = true;
      }

      if ($$2) {
         this.q();
         this.a(eaa.m);
      }

      return $$2;
   }

   protected void a(coh $$0) {
      this.B(false);
      this.C(false);
      if (!this.dX().C) {
         $$0.v(this.dN());
         $$0.w(this.dP());
         $$0.n(this);
      }
   }

   @Override
   public boolean fk() {
      return super.fk() && this.cb() && this.i() || this.gP() || this.gQ();
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.ag);
   }

   private void t() {
      this.cq = 1;
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.ct != null) {
         for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
            cvx $$1 = this.ct.a($$0);
            if (!$$1.f() && !dbo.a($$1, dbn.D)) {
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
      if (!this.dX().C && this.bM()) {
         if (this.af.a(900) == 0 && this.aM == 0) {
            this.c(1.0F);
         }

         if (this.ha()) {
            if (!this.gP() && !this.cb() && this.af.a(300) == 0 && this.dX().a_(this.dx().e()).a(dia.i)) {
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
         buv $$0 = this.dX().a(ciq.class, ci, this, this.dC(), this.dE(), this.dI(), this.cS().g(16.0));
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

      if (this.dk() && this.cJ > 0 && ++this.cJ > 20) {
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
   public bry b(coh $$0, brx $$1) {
      if (this.cb() || this.p_()) {
         return super.b($$0, $$1);
      } else if (this.gM() && $$0.ga()) {
         this.b($$0);
         return bry.a;
      } else {
         cvx $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bry $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, buh.g) && !this.fZ()) {
               this.b($$0, $$2);
               return bry.a;
            }
         }

         this.a($$0);
         return bry.a;
      }
   }

   private void y() {
      if (!this.dX().C) {
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
   public awj hb() {
      return this.w();
   }

   public void hc() {
      if (this.gw() && this.dk()) {
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

   public boolean g(coh $$0) {
      this.b($$0.cH());
      this.y(true);
      if ($$0 instanceof arn) {
         an.y.a((arn)$$0, this);
      }

      this.dX().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(coh $$0, ezh $$1) {
      super.a($$0, $$1);
      ezg $$2 = this.j($$0);
      this.a($$2.j, $$2.i);
      this.O = this.aU = this.aW = this.dN();
      if (this.dj()) {
         if ($$1.f <= 0.0) {
            this.cy = 0;
         }

         if (this.aJ()) {
            this.z(false);
            if (this.cv > 0.0F && !this.gO()) {
               this.b(this.cv, $$1);
            }

            this.cv = 0.0F;
         }
      }
   }

   protected ezg j(buv $$0) {
      return new ezg($$0.dP() * 0.5F, $$0.dN());
   }

   @Override
   protected ezh b(coh $$0, ezh $$1) {
      if (this.aJ() && this.cv == 0.0F && this.gQ() && !this.cw) {
         return ezh.c;
      } else {
         float $$2 = $$0.bl * 0.5F;
         float $$3 = $$0.bn;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new ezh((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(coh $$0) {
      return (float)this.h(bwd.v);
   }

   protected void b(float $$0, ezh $$1) {
      double $$2 = (double)this.A($$0);
      ezh $$3 = this.dA();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.as = true;
      if ($$1.f > 0.0) {
         float $$4 = azj.a(this.dN() * (float) (Math.PI / 180.0));
         float $$5 = azj.b(this.dN() * (float) (Math.PI / 180.0));
         this.h(this.dA().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void he() {
      this.a(awk.mN, 0.4F, 1.0F);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gP());
      $$0.a("Bred", this.gR());
      $$0.a("Temper", this.gS());
      $$0.a("Tame", this.gM());
      if (this.ab_() != null) {
         $$0.a("Owner", this.ab_());
      }

      if (!this.ct.a(0).f()) {
         $$0.a("SaddleItem", this.ct.a(0).a(this.dZ()));
      }
   }

   @Override
   public void a(uj $$0) {
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
         $$1 = avm.a(this.cW(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cvx $$4 = cvx.a(this.dZ(), (vg)$$0.p("SaddleItem")).orElse(cvx.k);
         if ($$4.a(cwb.nL)) {
            this.ct.a(0, $$4);
         }
      }

      this.gV();
   }

   @Override
   public boolean a(cgm $$0) {
      return false;
   }

   protected boolean hf() {
      return !this.cb() && !this.ca() && this.gM() && !this.p_() && this.eG() >= this.eV() && this.gF();
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return null;
   }

   protected void a(btq $$0, ciq $$1) {
      this.a($$0, $$1, bwd.s, (double)cd, (double)ce);
      this.a($$0, $$1, bwd.o, (double)ca, (double)cc);
      this.a($$0, $$1, bwd.v, (double)bY, (double)bZ);
   }

   private void a(btq $$0, ciq $$1, jp<bvy> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.af);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, azr $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = azj.a($$0, $$2, $$3);
         $$1 = azj.a($$1, $$2, $$3);
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
      return azj.h($$0, this.cL, this.cK);
   }

   public float K(float $$0) {
      return azj.h($$0, this.cN, this.cM);
   }

   public float L(float $$0) {
      return azj.h($$0, this.cP, this.cO);
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
      lo $$1 = $$0 ? lq.Q : lq.ae;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dX().a($$1, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   protected void a(btz $$0, btz.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof buv) {
         ((buv)$$0).aU = this.aU;
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
   public bvn a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bvn() {
            @Override
            public cvx a() {
               return ciq.this.ct.a(0);
            }

            @Override
            public boolean a(cvx $$0) {
               if (!$$0.f() && !$$0.a(cwb.nL)) {
                  return false;
               } else {
                  ciq.this.ct.a(0, $$0);
                  ciq.this.gV();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.ct.b() ? bvn.a(this.ct, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public buv cY() {
      if (this.i()) {
         btz var2 = this.db();
         if (var2 instanceof coh) {
            return (coh)var2;
         }
      }

      return super.cY();
   }

   @Nullable
   private ezh a(ezh $$0, buv $$1) {
      double $$2 = this.dC() + $$0.d;
      double $$3 = this.cS().b;
      double $$4 = this.dI() + $$0.f;
      jg.a $$5 = new jg.a();
      UnmodifiableIterator var10 = $$1.fQ().iterator();

      while (var10.hasNext()) {
         bvh $$6 = (bvh)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cS().e + 0.75;

         do {
            double $$8 = this.dX().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (cqk.a($$8)) {
               ezc $$9 = $$1.f($$6);
               ezh $$10 = new ezh($$2, (double)$$5.v() + $$8, $$4);
               if (cqk.a(this.dX(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jl.b);
         } while (!((double)$$5.v() < $$7));
      }

      return null;
   }

   @Override
   public ezh b(buv $$0) {
      ezh $$1 = a((double)this.ds(), (double)$$0.ds(), this.dN() + ($$0.fA() == bup.b ? 90.0F : -90.0F));
      ezh $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ezh $$3 = a((double)this.ds(), (double)$$0.ds(), this.dN() + ($$0.fA() == bup.a ? 90.0F : -90.0F));
         ezh $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dv();
      }
   }

   protected void a(azr $$0) {
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$3 == null) {
         $$3 = new btq.a(0.2F);
      }

      this.a($$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(brr $$0) {
      return this.ct != $$0;
   }

   public int hg() {
      return this.T();
   }

   @Override
   protected ezh a(btz $$0, buc $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new ezh(0.0, 0.15 * (double)this.cN * (double)$$2, -0.7 * (double)this.cN * (double)$$2).b(-this.dN() * (float) (Math.PI / 180.0)));
   }

   public final brr hh() {
      return this.cR;
   }

   public int ag_() {
      return 0;
   }
}
