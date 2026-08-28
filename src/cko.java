import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cko extends cld {
   public static final float bF = 0.45F;
   public static final int bG = 55;
   public static final int bH = 30;
   private static final float cd = 0.1F;
   private static final float ce = 1.4285F;
   private static final float cf = 22.2222F;
   private static final int cg = 5;
   private static final int ch = 40;
   private static final int ci = 52;
   private static final int cj = 80;
   private static final float ck = 1.43F;
   public static final akj<Boolean> bJ = akn.a(cko.class, akl.k);
   public static final akj<Long> bK = akn.a(cko.class, akl.c);
   public final bvu bL = new bvu();
   public final bvu bM = new bvu();
   public final bvu bN = new bvu();
   public final bvu bO = new bvu();
   public final bvu bP = new bvu();
   private static final bwg cl = bwg.b(bwm.t.l(), bwm.t.m() - 1.43F).b(0.845F);
   private int cm = 0;
   private int cp = 0;

   public cko(bwm<? extends cko> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new cko.c();
      this.by = new cko.b();
      cgl $$2 = (cgl)this.O();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bK).longValue());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bxo.k);
      }

      this.a($$1);
   }

   public static byh.a q() {
      return gR().a(byi.s, 32.0).a(byi.v, 0.09F).a(byi.o, 0.42F).a(byi.B, 1.5);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
      $$0.a(bK, 0L);
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      ckp.a(this, $$0.C_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected byc.b<cko> ec() {
      return ckp.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return ckp.a(this.ec().a($$0));
   }

   @Override
   public bwg e(bxo $$0) {
      return $$0 == bxo.k ? cl.a(this.ej()) : super.e($$0);
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("camelBrain");
      byc<?> $$2 = this.eb();
      ((byc<cko>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      ckp.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cm < 50 && (this.aJ() || this.bm() || this.bZ())) {
         this.w(false);
      }

      if (this.cm > 0) {
         this.cm--;
         if (this.cm == 0) {
            this.dV().a(null, this.dv(), awn.dB, awo.g, 1.0F, 1.0F);
         }
      }

      if (this.dV().w_()) {
         this.ha();
      }

      if (this.t()) {
         this.af();
      }

      if (this.gt() && this.bj()) {
         this.gF();
      }
   }

   private void ha() {
      if (this.cp <= 0) {
         this.cp = this.ae.a(40) + 80;
         this.bO.a(this.af);
      } else {
         this.cp--;
      }

      if (this.gu()) {
         this.bN.a();
         this.bP.a();
         if (this.hb()) {
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
         this.bN.a(this.gC() && this.gG() >= 0L, this.af);
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.aw() == bxo.a && !this.bP.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fei $$0) {
      if (this.t() && this.aJ()) {
         this.i(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cqy $$0, fei $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gt() && !this.gC()) {
         this.gE();
      }
   }

   public boolean t() {
      return this.gt() || this.gC();
   }

   @Override
   protected float c(cqy $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(byi.v) + $$1;
   }

   @Override
   protected feh i(bxc $$0) {
      return this.t() ? new feh(this.dN(), this.dL()) : super.i($$0);
   }

   @Override
   protected fei b(cqy $$0, fei $$1) {
      return this.t() ? fei.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.ak() && this.cm <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected void b(float $$0, fei $$1) {
      double $$2 = (double)this.fg();
      this.j(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(byi.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cm = 55;
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
      this.b(awn.dA);
      this.a(eez.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cm;
   }

   @Override
   protected awm u() {
      return awn.dz;
   }

   @Override
   protected awm l_() {
      return awn.dC;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.dE;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      if ($$1.a(axc.br)) {
         this.a(awn.dJ, 1.0F, 1.0F);
      } else {
         this.a(awn.dI, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ak);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$0.fX() && !this.n_()) {
         this.b($$0);
         return bub.a;
      } else {
         bub $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.j($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cY().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return bub.a;
         }
      }
   }

   @Override
   public boolean a(bwd $$0, float $$1) {
      if ($$1 > 6.0F && this.gt() && !this.gC() && this.gq()) {
         this.gE();
      }

      return true;
   }

   public boolean gq() {
      return this.g(this.gt() ? bxo.a : bxo.k);
   }

   @Override
   protected boolean a(cqy $$0, cyy $$1) {
      if (!this.j($$1)) {
         return false;
      } else {
         boolean $$2 = this.eF() < this.eT();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gH() && this.g() == 0 && this.gx();
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
               awm $$5 = this.gs();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(eez.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(cis $$0) {
      if ($$0 != this && $$0 instanceof cko $$1 && this.gY() && $$1.gY()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cko b(arq $$0, bvt $$1) {
      return bwm.t.a($$0, bwl.e);
   }

   @Nullable
   @Override
   protected awm gs() {
      return awn.dD;
   }

   @Override
   protected void c(arq $$0, bus $$1, float $$2) {
      this.gF();
      super.c($$0, $$1, $$2);
   }

   @Override
   protected fei a(bwd $$0, bwg $$1, float $$2) {
      int $$3 = Math.max(this.cY().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cY().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cis) {
            $$5 += 0.2F;
         }
      }

      return new fei(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ej() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bwg $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gC();
      boolean $$9 = this.gt();
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

         float $$15 = azm.a((float)this.gG() + $$1, 0.0F, (float)$$10);
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
   public fei t(float $$0) {
      bwg $$1 = this.a(this.aw());
      float $$2 = this.ej();
      return new fei(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ad() {
      return 30;
   }

   @Override
   protected boolean r(bwd $$0) {
      return this.cY().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   public boolean gt() {
      return this.al.a(bK) < 0L;
   }

   public boolean gu() {
      return this.gG() < 0L != this.gt();
   }

   public boolean gC() {
      long $$0 = this.gG();
      return $$0 < (long)(this.gt() ? 40 : 52);
   }

   private boolean hb() {
      return this.gt() && this.gG() < 40L && this.gG() >= 0L;
   }

   public void gD() {
      if (!this.gt()) {
         this.b(awn.dG);
         this.b(bxo.k);
         this.a(eez.u);
         this.a(-this.dV().ae());
      }
   }

   public void gE() {
      if (this.gt()) {
         this.b(awn.dH);
         this.b(bxo.a);
         this.a(eez.u);
         this.a(this.dV().ae());
      }
   }

   public void gF() {
      this.b(bxo.a);
      this.a(eez.u);
      this.b(this.dV().ae());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(bK, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gG() {
      return this.dV().ae() - Math.abs(this.al.a(bK));
   }

   @Override
   protected je<awm> a(bwn $$0, cyy $$1, dhh $$2) {
      return (je<awm>)($$0 == bwn.h ? awn.dF : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(akj<?> $$0) {
      if (!this.ak && bJ.equals($$0)) {
         this.cm = this.cm == 0 ? 55 : this.cm;
      }

      super.a($$0);
   }

   @Override
   public boolean gH() {
      return true;
   }

   @Override
   public void b(cqy $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.bX);
      }
   }

   @Override
   protected ccw I() {
      return new cko.a(this);
   }

   class a extends ccw {
      public a(final cko $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cko.this.t()) {
            super.a();
         }
      }
   }

   class b extends cda {
      b() {
         super(cko.this);
      }

      @Override
      public void a() {
         if (!cko.this.cX()) {
            super.a();
         }
      }
   }

   class c extends cdb {
      public c() {
         super(cko.this);
      }

      @Override
      public void a() {
         if (this.k == cdb.a.b && !cko.this.O_() && cko.this.gt() && !cko.this.gC() && cko.this.gq()) {
            cko.this.gE();
         }

         super.a();
      }
   }
}
