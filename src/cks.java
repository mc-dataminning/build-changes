import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cks extends clh {
   public static final float bG = 0.45F;
   public static final int bH = 55;
   public static final int bI = 30;
   private static final float ce = 0.1F;
   private static final float cf = 1.4285F;
   private static final float cg = 22.2222F;
   private static final int ch = 5;
   private static final int ci = 40;
   private static final int cj = 52;
   private static final int ck = 80;
   private static final float cl = 1.43F;
   public static final akj<Boolean> bK = akn.a(cks.class, akl.k);
   public static final akj<Long> bL = akn.a(cks.class, akl.c);
   public final bvw bM = new bvw();
   public final bvw bN = new bvw();
   public final bvw bO = new bvw();
   public final bvw bP = new bvw();
   public final bvw bQ = new bvw();
   private static final bwi cm = bwi.b(bwo.t.l(), bwo.t.m() - 1.43F).b(0.845F);
   private int cn = 0;
   private int cq = 0;

   public cks(bwo<? extends cks> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cks.c();
      this.bz = new cks.b();
      cgn $$2 = (cgn)this.O();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bL).longValue());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bxq.k);
      }

      this.a($$1);
   }

   public static byj.a q() {
      return gS().a(byk.s, 32.0).a(byk.v, 0.09F).a(byk.o, 0.42F).a(byk.B, 1.5);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bK, false);
      $$0.a(bL, 0L);
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      ckt.a(this, $$0.C_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bye.b<cks> ed() {
      return ckt.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return ckt.a(this.ed().a($$0));
   }

   @Override
   public bwi e(bxq $$0) {
      return $$0 == bxq.k ? cm.a(this.ek()) : super.e($$0);
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("camelBrain");
      bye<?> $$2 = this.ec();
      ((bye<cks>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      ckt.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cn < 50 && (this.aJ() || this.bm() || this.bZ())) {
         this.w(false);
      }

      if (this.cn > 0) {
         this.cn--;
         if (this.cn == 0) {
            this.dV().a(null, this.dv(), awn.dD, awo.g, 1.0F, 1.0F);
         }
      }

      if (this.dV().w_()) {
         this.hb();
      }

      if (this.t()) {
         this.af();
      }

      if (this.gu() && this.bj()) {
         this.gG();
      }
   }

   private void hb() {
      if (this.cq <= 0) {
         this.cq = this.ae.a(40) + 80;
         this.bP.a(this.af);
      } else {
         this.cq--;
      }

      if (this.gv()) {
         this.bO.a();
         this.bQ.a();
         if (this.hc()) {
            this.bM.b(this.af);
            this.bN.a();
         } else {
            this.bM.a();
            this.bN.b(this.af);
         }
      } else {
         this.bM.a();
         this.bN.a();
         this.bQ.a(this.x(), this.af);
         this.bO.a(this.gD() && this.gH() >= 0L, this.af);
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.aw() == bxq.a && !this.bQ.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(feq $$0) {
      if (this.t() && this.aJ()) {
         this.i(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(crc $$0, feq $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gu() && !this.gD()) {
         this.gF();
      }
   }

   public boolean t() {
      return this.gu() || this.gD();
   }

   @Override
   protected float c(crc $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(byk.v) + $$1;
   }

   @Override
   protected fep i(bxe $$0) {
      return this.t() ? new fep(this.dN(), this.dL()) : super.i($$0);
   }

   @Override
   protected feq b(crc $$0, feq $$1) {
      return this.t() ? feq.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.ak() && this.cn <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected void b(float $$0, feq $$1) {
      double $$2 = (double)this.fh();
      this.j(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(byk.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cn = 55;
      this.w(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(bK);
   }

   public void w(boolean $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awn.dC);
      this.a(efh.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cn;
   }

   @Override
   protected awm u() {
      return awn.dB;
   }

   @Override
   protected awm l_() {
      return awn.dE;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.dG;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      if ($$1.a(axc.bs)) {
         this.a(awn.dL, 1.0F, 1.0F);
      } else {
         this.a(awn.dK, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.al);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$0.fY() && !this.n_()) {
         this.b($$0);
         return bud.a;
      } else {
         bud $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.i($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cY().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return bud.a;
         }
      }
   }

   @Override
   public boolean a(bwf $$0, float $$1) {
      if ($$1 > 6.0F && this.gu() && !this.gD() && this.gr()) {
         this.gF();
      }

      return true;
   }

   public boolean gr() {
      return this.g(this.gu() ? bxq.a : bxq.k);
   }

   @Override
   protected boolean a(crc $$0, czd $$1) {
      if (!this.i($$1)) {
         return false;
      } else {
         boolean $$2 = this.eG() < this.eU();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gI() && this.g() == 0 && this.gy();
         if ($$3) {
            this.e($$0);
         }

         boolean $$4 = this.n_();
         if ($$4) {
            this.dV().a(lx.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dV().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               awm $$5 = this.gt();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(efh.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   public boolean a(ciu $$0) {
      if ($$0 != this && $$0 instanceof cks $$1 && this.gZ() && $$1.gZ()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cks b(arq $$0, bvv $$1) {
      return bwo.t.a($$0, bwn.e);
   }

   @Nullable
   @Override
   protected awm gt() {
      return awn.dF;
   }

   @Override
   protected void c(arq $$0, buu $$1, float $$2) {
      this.gG();
      super.c($$0, $$1, $$2);
   }

   @Override
   protected feq a(bwf $$0, bwi $$1, float $$2) {
      int $$3 = Math.max(this.cY().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cY().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof ciu) {
            $$5 += 0.2F;
         }
      }

      return new feq(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ek() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bwi $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gD();
      boolean $$9 = this.gu();
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

         float $$15 = azm.a((float)this.gH() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azm.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azm.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public feq t(float $$0) {
      bwi $$1 = this.a(this.aw());
      float $$2 = this.ek();
      return new feq(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ad() {
      return 30;
   }

   @Override
   protected boolean r(bwf $$0) {
      return this.cY().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   public boolean gu() {
      return this.al.a(bL) < 0L;
   }

   public boolean gv() {
      return this.gH() < 0L != this.gu();
   }

   public boolean gD() {
      long $$0 = this.gH();
      return $$0 < (long)(this.gu() ? 40 : 52);
   }

   private boolean hc() {
      return this.gu() && this.gH() < 40L && this.gH() >= 0L;
   }

   public void gE() {
      if (!this.gu()) {
         this.b(awn.dI);
         this.b(bxq.k);
         this.a(efh.u);
         this.a(-this.dV().ae());
      }
   }

   public void gF() {
      if (this.gu()) {
         this.b(awn.dJ);
         this.b(bxq.a);
         this.a(efh.u);
         this.a(this.dV().ae());
      }
   }

   public void gG() {
      this.b(bxq.a);
      this.a(efh.u);
      this.b(this.dV().ae());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(bL, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gH() {
      return this.dV().ae() - Math.abs(this.al.a(bL));
   }

   @Override
   protected je<awm> a(bwp $$0, czd $$1, dhm $$2) {
      return (je<awm>)($$0 == bwp.h ? awn.dH : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(akj<?> $$0) {
      if (!this.ak && bK.equals($$0)) {
         this.cn = this.cn == 0 ? 55 : this.cn;
      }

      super.a($$0);
   }

   @Override
   public boolean gI() {
      return true;
   }

   @Override
   public void b(crc $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.bY);
      }
   }

   @Override
   protected ccy I() {
      return new cks.a(this);
   }

   class a extends ccy {
      public a(final cks $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cks.this.t()) {
            super.a();
         }
      }
   }

   class b extends cdc {
      b() {
         super(cks.this);
      }

      @Override
      public void a() {
         if (!cks.this.cX()) {
            super.a();
         }
      }
   }

   class c extends cdd {
      public c() {
         super(cks.this);
      }

      @Override
      public void a() {
         if (this.k == cdd.a.b && !cks.this.O_() && cks.this.gu() && !cks.this.gD() && cks.this.gr()) {
            cks.this.gF();
         }

         super.a();
      }
   }
}
