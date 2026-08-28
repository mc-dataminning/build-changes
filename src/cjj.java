import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjj extends cjw {
   public static final float bF = 0.45F;
   public static final int bG = 55;
   public static final int bH = 30;
   private static final float cg = 0.1F;
   private static final float ch = 1.4285F;
   private static final float ci = 22.2222F;
   private static final int cj = 5;
   private static final int ck = 40;
   private static final int cl = 52;
   private static final int cm = 80;
   private static final float cp = 1.43F;
   public static final ajx<Boolean> bJ = akb.a(cjj.class, ajz.k);
   public static final ajx<Long> bK = akb.a(cjj.class, ajz.c);
   public final bur bL = new bur();
   public final bur bM = new bur();
   public final bur bN = new bur();
   public final bur bO = new bur();
   public final bur bP = new bur();
   private static final bvd cq = bvd.b(bvi.t.l(), bvi.t.m() - 1.43F).b(0.845F);
   private int cr = 0;
   private int cs = 0;

   public cjj(bvi<? extends cjj> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cjj.c();
      this.by = new cjj.b();
      cfj $$2 = (cfj)this.O();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bK));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bwk.k);
      }

      this.a($$1);
   }

   public static bxf.a q() {
      return gU().a(bxg.s, 32.0).a(bxg.v, 0.09F).a(bxg.o, 0.42F).a(bxg.B, 1.5);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
      $$0.a(bK, 0L);
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      cjk.a(this, $$0.C_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bxa.b<cjj> eb() {
      return cjk.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cjk.a(this.eb().a($$0));
   }

   @Override
   public bvd e(bwk $$0) {
      return $$0 == bwk.k ? cq.a(this.ei()) : super.e($$0);
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("camelBrain");
      bxa<?> $$2 = this.ea();
      ((bxa<cjj>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      cjk.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cr < 50 && (this.aJ() || this.bl() || this.bY())) {
         this.w(false);
      }

      if (this.cr > 0) {
         this.cr--;
         if (this.cr == 0) {
            this.dU().a(null, this.du(), awa.dB, awb.g, 1.0F, 1.0F);
         }
      }

      if (this.dU().w_()) {
         this.he();
      }

      if (this.t()) {
         this.af();
      }

      if (this.gv() && this.bj()) {
         this.gH();
      }
   }

   private void he() {
      if (this.cs <= 0) {
         this.cs = this.ae.a(40) + 80;
         this.bO.a(this.af);
      } else {
         this.cs--;
      }

      if (this.gw()) {
         this.bN.a();
         this.bP.a();
         if (this.hf()) {
            this.bL.b(this.af);
            this.bM.a();
         } else {
            this.bL.a();
            this.bM.b(this.af);
         }
      } else {
         this.bL.a();
         this.bM.a();
         this.bP.a(this.x(), this.af);
         this.bN.a(this.gE() && this.gI() >= 0L, this.af);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.aw() == bwk.a && !this.bP.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fbx $$0) {
      if (this.t() && this.aJ()) {
         this.i(this.dx().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cpr $$0, fbx $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gv() && !this.gE()) {
         this.gG();
      }
   }

   public boolean t() {
      return this.gv() || this.gE();
   }

   @Override
   protected float c(cpr $$0) {
      float $$1 = $$0.ci() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bxg.v) + $$1;
   }

   @Override
   protected fbw j(bvy $$0) {
      return this.t() ? new fbw(this.dM(), this.dK()) : super.j($$0);
   }

   @Override
   protected fbx b(cpr $$0, fbx $$1) {
      return this.t() ? fbx.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.j() && this.cr <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   protected void b(float $$0, fbx $$1) {
      double $$2 = (double)this.fj();
      this.j(this.bS().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bxg.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cr = 55;
      this.w(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(bJ);
   }

   public void w(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awa.dA);
      this.a(ecp.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cr;
   }

   @Override
   protected avz u() {
      return awa.dz;
   }

   @Override
   protected avz l_() {
      return awa.dC;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.dE;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      if ($$1.a(awp.br)) {
         this.a(awa.dJ, 1.0F, 1.0F);
      } else {
         this.a(awa.dI, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ak);
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$0.ga() && !this.n_()) {
         this.b($$0);
         return bsy.a;
      } else {
         bsy $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.j($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cX().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return bsy.a;
         }
      }
   }

   @Override
   public boolean a(bva $$0, float $$1) {
      if ($$1 > 6.0F && this.gv() && !this.gE() && this.gs()) {
         this.gG();
      }

      return true;
   }

   public boolean gs() {
      return this.g(this.gv() ? bwk.a : bwk.k);
   }

   @Override
   protected boolean a(cpr $$0, cxh $$1) {
      if (!this.j($$1)) {
         return false;
      } else {
         boolean $$2 = this.eE() < this.eS();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gJ() && this.g() == 0 && this.gz();
         if ($$3) {
            this.e($$0);
         }

         boolean $$4 = this.n_();
         if ($$4) {
            this.dU().a(lt.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dU().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               avz $$5 = this.gu();
               if ($$5 != null) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), $$5, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(ecp.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean a(chp $$0) {
      if ($$0 != this && $$0 instanceof cjj $$1 && this.hb() && $$1.hb()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cjj b(ard $$0, buq $$1) {
      return bvi.t.a($$0, bvh.e);
   }

   @Nullable
   @Override
   protected avz gu() {
      return awa.dD;
   }

   @Override
   protected void b(ard $$0, btp $$1, float $$2) {
      this.gH();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected fbx a(bva $$0, bvd $$1, float $$2) {
      int $$3 = Math.max(this.cX().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dP() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cX().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof chp) {
            $$5 += 0.2F;
         }
      }

      return new fbx(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dK() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ei() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bvd $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gE();
      boolean $$9 = this.gv();
      if ($$8) {
         int $$10 = $$9 ? 40 : 52;
         int $$11;
         float $$12;
         if ($$9) {
            $$11 = 28;
            $$12 = $$0 ? 0.5F : 0.1F;
         } else {
            $$11 = $$0 ? 24 : 32;
            $$12 = $$0 ? 0.6F : 0.35F;
         }

         float $$15 = ayz.a((float)this.gI() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayz.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayz.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fbx t(float $$0) {
      bvd $$1 = this.a(this.aw());
      float $$2 = this.ei();
      return new fbx(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ad() {
      return 30;
   }

   @Override
   protected boolean r(bva $$0) {
      return this.cX().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   public boolean gv() {
      return this.al.a(bK) < 0L;
   }

   public boolean gw() {
      return this.gI() < 0L != this.gv();
   }

   public boolean gE() {
      long $$0 = this.gI();
      return $$0 < (long)(this.gv() ? 40 : 52);
   }

   private boolean hf() {
      return this.gv() && this.gI() < 40L && this.gI() >= 0L;
   }

   public void gF() {
      if (!this.gv()) {
         this.b(awa.dG);
         this.b(bwk.k);
         this.a(ecp.u);
         this.a(-this.dU().ae());
      }
   }

   public void gG() {
      if (this.gv()) {
         this.b(awa.dH);
         this.b(bwk.a);
         this.a(ecp.u);
         this.a(this.dU().ae());
      }
   }

   public void gH() {
      this.b(bwk.a);
      this.a(ecp.u);
      this.b(this.dU().ae());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(bK, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gI() {
      return this.dU().ae() - Math.abs(this.al.a(bK));
   }

   @Override
   public avz Y_() {
      return awa.dF;
   }

   @Override
   public void a(ajx<?> $$0) {
      if (!this.ak && bJ.equals($$0)) {
         this.cr = this.cr == 0 ? 55 : this.cr;
      }

      super.a($$0);
   }

   @Override
   public boolean gJ() {
      return true;
   }

   @Override
   public void b(cpr $$0) {
      if (!this.dU().C) {
         $$0.a(this, this.ca);
      }
   }

   @Override
   protected cbu I() {
      return new cjj.a(this);
   }

   class a extends cbu {
      public a(final cjj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cjj.this.t()) {
            super.a();
         }
      }
   }

   class b extends cby {
      b() {
         super(cjj.this);
      }

      @Override
      public void a() {
         if (!cjj.this.cW()) {
            super.a();
         }
      }
   }

   class c extends cbz {
      public c() {
         super(cjj.this);
      }

      @Override
      public void a() {
         if (this.k == cbz.a.b && !cjj.this.O_() && cjj.this.gv() && !cjj.this.gE() && cjj.this.gs()) {
            cjj.this.gG();
         }

         super.a();
      }
   }
}
