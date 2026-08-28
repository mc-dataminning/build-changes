import com.google.common.collect.UnmodifiableIterator;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class ckb extends chx implements bte, bvz, bwn, bwq, bww {
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
   private static final cgx.a ci = ($$0, $$1) -> {
      if ($$0 instanceof ckb $$2 && $$2.gK()) {
         return true;
      }

      return false;
   };
   private static final cgx cj = cgx.b().a(16.0).d().a(ci);
   private static final alc<Byte> cC = alg.a(ckb.class, ale.a);
   private static final int cD = 2;
   private static final int cE = 4;
   private static final int cF = 8;
   private static final int cG = 16;
   private static final int cH = 32;
   private static final int cI = 64;
   public static final int co = 0;
   public static final int cp = 1;
   public static final int cq = 3;
   private int cJ;
   private int cK;
   private int cL;
   public int cr;
   public int cs;
   protected boolean ct;
   protected btq cu;
   protected int cv;
   protected float cw;
   protected boolean cx;
   private float cM;
   private float cN;
   private float cO;
   private float cP;
   private float cQ;
   private float cR;
   protected boolean cy = true;
   protected int cz;
   @Nullable
   private UUID cS;
   private final btc cT = new fdk() {
      @Override
      public cxp f() {
         return ckb.this.af();
      }

      @Override
      public void b(cxp $$0) {
         ckb.this.h($$0);
      }

      @Override
      public void e() {
      }

      @Override
      public boolean a(cpx $$0) {
         return $$0.dl() == ckb.this || $$0.b(ckb.this, 4.0);
      }
   };

   protected ckb(bvr<? extends ckb> $$0, dhi $$1) {
      super($$0, $$1);
      this.gN();
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdx(this, 1.2));
      this.bT.a(1, new cei(this, 1.2));
      this.bT.a(2, new ccq(this, 1.0, ckb.class));
      this.bT.a(4, new cdd(this, 1.0));
      this.bT.a(6, new cer(this, 0.7));
      this.bT.a(7, new cdm(this, cpx.class, 6.0F));
      this.bT.a(8, new cdz(this));
      if (this.gp()) {
         this.bT.a(9, new cea(this));
      }

      this.gG();
   }

   protected void gG() {
      this.bT.a(0, new ccy(this));
      this.bT.a(3, new cem(this, 1.25, $$0 -> $$0.a(ayd.al), false));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cC, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.al.a(cC) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(cC);
      if ($$1) {
         this.al.a(cC, (byte)($$2 | $$0));
      } else {
         this.al.a(cC, (byte)($$2 & ~$$0));
      }
   }

   public boolean gF() {
      return this.s(2);
   }

   @Nullable
   @Override
   public UUID ab_() {
      return this.cS;
   }

   public void b(@Nullable UUID $$0) {
      this.cS = $$0;
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
   public boolean a(bvk $$0, float $$1) {
      if ($$1 > 6.0F && this.gI()) {
         this.B(false);
      }

      return true;
   }

   public boolean gI() {
      return this.s(16);
   }

   public boolean gJ() {
      return this.s(32);
   }

   public boolean gK() {
      return this.s(8);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_() && this.gF();
   }

   @Override
   public void a(cxp $$0, @Nullable axg $$1) {
      this.cu.a(0, $$0);
   }

   public void b(cpx $$0, cxp $$1) {
      if (this.a($$1, bvs.g)) {
         this.h($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bvs $$0) {
      return $$0 == bvs.g && this.gF() || super.f($$0);
   }

   @Override
   public boolean j() {
      return this.s(4);
   }

   public int gL() {
      return this.cv;
   }

   public void t(int $$0) {
      this.cv = $$0;
   }

   public int u(int $$0) {
      int $$1 = bae.a(this.gL() + $$0, 0, this.gR());
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
         axe $$0 = this.gq();
         if ($$0 != null) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), $$0, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bua $$2) {
      if ($$0 > 1.0F) {
         this.a(axf.nh, 0.4F, 1.0F);
      }

      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.ca()) {
            for (bvk $$4 : this.dd()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.eO();
         return true;
      }
   }

   public final int gM() {
      return v(this.ag_());
   }

   public static int v(int $$0) {
      return $$0 * 3 + 1;
   }

   protected void gN() {
      btq $$0 = this.cu;
      this.cu = new btq(this.gM());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.cu.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            cxp $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.cu.a($$2, $$3.v());
            }
         }
      }

      this.cu.a(this);
      this.gO();
   }

   protected void gO() {
      if (!this.dW().C) {
         this.d(4, !this.cu.a(0).f());
      }
   }

   @Override
   public void a(btc $$0) {
      boolean $$1 = this.j();
      this.gO();
      if (this.af > 20 && !$$1 && this.j()) {
         this.a(this.ac_(), 0.5F, 1.0F);
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ae.a(3) == 0) {
         this.gU();
      }

      return $$3;
   }

   protected boolean gp() {
      return true;
   }

   @Nullable
   protected axe gq() {
      return null;
   }

   @Nullable
   protected axe gP() {
      return null;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      if (!$$1.n()) {
         dxv $$2 = this.dW().a_($$0.d());
         dsc $$3 = $$1.A();
         if ($$2.a(dko.ea)) {
            $$3 = $$2.A();
         }

         if (this.ca() && this.cy) {
            this.cz++;
            if (this.cz > 5 && this.cz % 3 == 0) {
               this.a($$3);
            } else if (this.cz <= 5) {
               this.a(axf.nk, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(axf.nk, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(axf.nj, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dsc $$0) {
      return $$0 == dsc.b || $$0 == dsc.aT || $$0 == dsc.B || $$0 == dsc.aU || $$0 == dsc.aS;
   }

   protected void a(dsc $$0) {
      this.a(axf.ne, $$0.a() * 0.15F, $$0.b());
   }

   public static bxn.a gQ() {
      return chx.gt().a(bxo.o, 0.7).a(bxo.s, 53.0).a(bxo.v, 0.225F).a(bxo.B, 1.0).a(bxo.x, 6.0).a(bxo.k, 0.5);
   }

   @Override
   public int ad() {
      return 6;
   }

   public int gR() {
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
   public void b(cpx $$0) {
      if (!this.dW().C && (!this.ca() || this.y($$0)) && this.gF()) {
         $$0.a(this, this.cu);
      }
   }

   public btj c(cpx $$0, cxp $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (btj)(!$$2 && !this.dW().C ? btj.e : btj.b);
   }

   protected boolean a(cpx $$0, cxp $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(cxt.pS)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(cxt.so)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dko.iA.j())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(cxt.oQ)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(cxt.va)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.dW().C && this.gF() && this.Z_() == 0 && !this.gy()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(cxt.qw) || $$1.a(cxt.qx)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.dW().C && this.gF() && this.Z_() == 0 && !this.gy()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.eE() < this.eS() && $$3 > 0.0F) {
         this.c($$3);
         $$2 = true;
      }

      if (this.e_() && $$4 > 0) {
         this.dW().a(ls.O, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dW().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gF()) && this.gL() < this.gR() && !this.dW().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.p();
         this.a(ecr.m);
      }

      return $$2;
   }

   protected void a(cpx $$0) {
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
      return super.fi() && this.ca() && this.j() || this.gI() || this.gJ();
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ak);
   }

   private void t() {
      this.cr = 1;
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (this.cu != null) {
         for (int $$1 = 0; $$1 < this.cu.b(); $$1++) {
            cxp $$2 = this.cu.a($$1);
            if (!$$2.f() && !deb.a($$2, dea.D)) {
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
      if (this.dW() instanceof ash $$0 && this.bL()) {
         if (this.ae.a(900) == 0 && this.aP == 0) {
            this.c(1.0F);
         }

         if (this.gS()) {
            if (!this.gI() && !this.ca() && this.ae.a(300) == 0 && $$0.a_(this.dw().e()).a(dko.i)) {
               this.B(true);
            }

            if (this.gI() && ++this.cJ > 50) {
               this.cJ = 0;
               this.B(false);
            }
         }

         this.g($$0);
         return;
      }
   }

   protected void g(ash $$0) {
      if (this.gK() && this.e_() && !this.gI()) {
         bwg $$1 = $$0.a(ckb.class, cj, this, this.dB(), this.dD(), this.dH(), this.cR().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.bS.a($$1, 0);
         }
      }
   }

   public boolean gS() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.cK > 0 && ++this.cK > 30) {
         this.cK = 0;
         this.d(64, false);
      }

      if (this.dk() && this.cL > 0 && ++this.cL > 20) {
         this.cL = 0;
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

      this.cN = this.cM;
      if (this.gI()) {
         this.cM = this.cM + (1.0F - this.cM) * 0.4F + 0.05F;
         if (this.cM > 1.0F) {
            this.cM = 1.0F;
         }
      } else {
         this.cM = this.cM + ((0.0F - this.cM) * 0.4F - 0.05F);
         if (this.cM < 0.0F) {
            this.cM = 0.0F;
         }
      }

      this.cP = this.cO;
      if (this.gJ()) {
         this.cM = 0.0F;
         this.cN = this.cM;
         this.cO = this.cO + (1.0F - this.cO) * 0.4F + 0.05F;
         if (this.cO > 1.0F) {
            this.cO = 1.0F;
         }
      } else {
         this.cx = false;
         this.cO = this.cO + ((0.8F * this.cO * this.cO * this.cO - this.cO) * 0.6F - 0.05F);
         if (this.cO < 0.0F) {
            this.cO = 0.0F;
         }
      }

      this.cR = this.cQ;
      if (this.s(64)) {
         this.cQ = this.cQ + (1.0F - this.cQ) * 0.7F + 0.05F;
         if (this.cQ > 1.0F) {
            this.cQ = 1.0F;
         }
      } else {
         this.cQ = this.cQ + ((0.0F - this.cQ) * 0.7F - 0.05F);
         if (this.cQ < 0.0F) {
            this.cQ = 0.0F;
         }
      }
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      if (this.ca() || this.e_()) {
         return super.b($$0, $$1);
      } else if (this.gF() && $$0.fY()) {
         this.b($$0);
         return btj.a;
      } else {
         cxp $$2 = $$0.b($$1);
         if (!$$2.f()) {
            btj $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bvs.g) && !this.ag()) {
               this.b($$0, $$2);
               return btj.a;
            }
         }

         this.a($$0);
         return btj.a;
      }
   }

   private void x() {
      if (!this.dW().C) {
         this.cK = 1;
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
   public axe gT() {
      return this.u();
   }

   public void gU() {
      if (this.gp() && this.dk()) {
         this.cL = 1;
         this.C(true);
      }
   }

   public void gV() {
      if (!this.gJ()) {
         this.gU();
         this.b(this.gP());
      }
   }

   public boolean g(cpx $$0) {
      this.b($$0.cG());
      this.y(true);
      if ($$0 instanceof asi) {
         ao.y.a((asi)$$0, this);
      }

      this.dW().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cpx $$0, fby $$1) {
      super.a($$0, $$1);
      fbx $$2 = this.j($$0);
      this.b($$2.j, $$2.i);
      this.N = this.aX = this.aZ = this.dM();
      if (this.di()) {
         if ($$1.f <= 0.0) {
            this.cz = 0;
         }

         if (this.aJ()) {
            this.z(false);
            if (this.cw > 0.0F && !this.gH()) {
               this.b(this.cw, $$1);
            }

            this.cw = 0.0F;
         }
      }
   }

   protected fbx j(bwg $$0) {
      return new fbx($$0.dO() * 0.5F, $$0.dM());
   }

   @Override
   protected fby b(cpx $$0, fby $$1) {
      if (this.aJ() && this.cw == 0.0F && this.gJ() && !this.cx) {
         return fby.c;
      } else {
         float $$2 = $$0.bo * 0.5F;
         float $$3 = $$0.bq;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new fby((double)$$2, 0.0, (double)$$3);
      }
   }

   @Override
   protected float e(cpx $$0) {
      return (float)this.h(bxo.v);
   }

   protected void b(float $$0, fby $$1) {
      double $$2 = (double)this.A($$0);
      fby $$3 = this.dz();
      this.n($$3.d, $$2, $$3.f);
      this.z(true);
      this.ar = true;
      if ($$1.f > 0.0) {
         float $$4 = bae.a(this.dM() * (float) (Math.PI / 180.0));
         float $$5 = bae.b(this.dM() * (float) (Math.PI / 180.0));
         this.h(this.dz().b((double)(-0.4F * $$4 * $$0), 0.0, (double)(0.4F * $$5 * $$0)));
      }
   }

   protected void gW() {
      this.a(axf.ng, 0.4F, 1.0F);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.gI());
      $$0.a("Bred", this.gK());
      $$0.a("Temper", this.gL());
      $$0.a("Tame", this.gF());
      if (this.ab_() != null) {
         $$0.a("Owner", this.ab_());
      }

      if (!this.cu.a(0).f()) {
         $$0.a("SaddleItem", this.cu.a(0).a(this.dY()));
      }
   }

   @Override
   public void a(ux $$0) {
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
         $$1 = awh.a(this.cV(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cxp $$4 = cxp.a(this.dY(), (vu)$$0.p("SaddleItem")).orElse(cxp.j);
         if ($$4.a(cxt.oe)) {
            this.cu.a(0, $$4);
         }
      }

      this.gO();
   }

   @Override
   public boolean a(chx $$0) {
      return false;
   }

   protected boolean gX() {
      return !this.ca() && !this.bZ() && this.gF() && !this.e_() && this.eE() >= this.eS() && this.gy();
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      return null;
   }

   protected void a(bvb $$0, ckb $$1) {
      this.a($$0, $$1, bxo.s, (double)ce, (double)cf);
      this.a($$0, $$1, bxo.o, (double)cb, (double)cd);
      this.a($$0, $$1, bxo.v, (double)bZ, (double)ca);
   }

   private void a(bvb $$0, ckb $$1, jq<bxj> $$2, double $$3, double $$4) {
      double $$5 = a(this.i($$2), $$0.i($$2), $$3, $$4, this.ae);
      $$1.g($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, bam $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = bae.a($$0, $$2, $$3);
         $$1 = bae.a($$1, $$2, $$3);
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
      return bae.h($$0, this.cN, this.cM);
   }

   public float K(float $$0) {
      return bae.h($$0, this.cP, this.cO);
   }

   public float L(float $$0) {
      return bae.h($$0, this.cR, this.cQ);
   }

   @Override
   public void b(int $$0) {
      if (this.j()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cx = true;
            this.gU();
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
      return this.j();
   }

   @Override
   public void c(int $$0) {
      this.cx = true;
      this.gU();
      this.gW();
   }

   @Override
   public void b() {
   }

   protected void D(boolean $$0) {
      lq $$1 = $$0 ? ls.Q : ls.af;

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
   protected void a(bvk $$0, bvk.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bwg) {
         ((bwg)$$0).aX = this.aX;
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
   public bwy a_(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 == 0) {
         return new bwy() {
            @Override
            public cxp a() {
               return ckb.this.cu.a(0);
            }

            @Override
            public boolean a(cxp $$0) {
               if (!$$0.f() && !$$0.a(cxt.oe)) {
                  return false;
               } else {
                  ckb.this.cu.a(0, $$0);
                  ckb.this.gO();
                  return true;
               }
            }
         };
      } else {
         int $$2 = $$0 - 500 + 1;
         return $$2 >= 1 && $$2 < this.cu.b() ? bwy.a(this.cu, $$2) : super.a_($$0);
      }
   }

   @Nullable
   @Override
   public bwg cX() {
      if (this.j()) {
         bvk var2 = this.da();
         if (var2 instanceof cpx) {
            return (cpx)var2;
         }
      }

      return super.cX();
   }

   @Nullable
   private fby a(fby $$0, bwg $$1) {
      double $$2 = this.dB() + $$0.d;
      double $$3 = this.cR().b;
      double $$4 = this.dH() + $$0.f;
      jh.a $$5 = new jh.a();
      UnmodifiableIterator var10 = $$1.fO().iterator();

      while (var10.hasNext()) {
         bws $$6 = (bws)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cR().e + 0.75;

         do {
            double $$8 = this.dW().j($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (csc.a($$8)) {
               fbt $$9 = $$1.f($$6);
               fby $$10 = new fby($$2, (double)$$5.v() + $$8, $$4);
               if (csc.a(this.dW(), $$1, $$9.c($$10))) {
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
   public fby b(bwg $$0) {
      fby $$1 = a((double)this.dr(), (double)$$0.dr(), this.dM() + ($$0.fy() == bwa.b ? 90.0F : -90.0F));
      fby $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         fby $$3 = a((double)this.dr(), (double)$$0.dr(), this.dM() + ($$0.fy() == bwa.a ? 90.0F : -90.0F));
         fby $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.du();
      }
   }

   protected void a(bam $$0) {
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      if ($$3 == null) {
         $$3 = new bvb.a(0.2F);
      }

      this.a($$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean b(btc $$0) {
      return this.cu != $$0;
   }

   public int gY() {
      return this.Q();
   }

   @Override
   protected fby a(bvk $$0, bvn $$1, float $$2) {
      return super.a($$0, $$1, $$2)
         .e(new fby(0.0, 0.15 * (double)this.cP * (double)$$2, -0.7 * (double)this.cP * (double)$$2).b(-this.dM() * (float) (Math.PI / 180.0)));
   }

   public final btc gZ() {
      return this.cT;
   }

   public int ag_() {
      return 0;
   }
}
