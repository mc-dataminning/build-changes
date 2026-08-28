import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cki extends ckx {
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
   public static final akh<Boolean> bJ = akl.a(cki.class, akj.k);
   public static final akh<Long> bK = akl.a(cki.class, akj.c);
   public final bvr bL = new bvr();
   public final bvr bM = new bvr();
   public final bvr bN = new bvr();
   public final bvr bO = new bvr();
   public final bvr bP = new bvr();
   private static final bwd cl = bwd.b(bwj.t.l(), bwj.t.m() - 1.43F).b(0.845F);
   private int cm = 0;
   private int cp = 0;

   public cki(bwj<? extends cki> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new cki.c();
      this.by = new cki.b();
      cgi $$2 = (cgi)this.O();
      $$2.a(true);
      $$2.d(true);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(bK));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bxl.k);
      }

      this.a($$1);
   }

   public static bye.a q() {
      return gR().a(byf.s, 32.0).a(byf.v, 0.09F).a(byf.o, 0.42F).a(byf.B, 1.5);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
      $$0.a(bK, 0L);
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      ckj.a(this, $$0.C_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bxz.b<cki> ec() {
      return ckj.a();
   }

   @Override
   protected void D() {
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return ckj.a(this.ec().a($$0));
   }

   @Override
   public bwd e(bxl $$0) {
      return $$0 == bxl.k ? cl.a(this.ej()) : super.e($$0);
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("camelBrain");
      bxz<?> $$2 = this.eb();
      ((bxz<cki>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      ckj.a(this);
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
            this.dV().a(null, this.dv(), awl.dB, awm.g, 1.0F, 1.0F);
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
      if (this.aw() == bxl.a && !this.bP.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fdw $$0) {
      if (this.t() && this.aJ()) {
         this.i(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cqs $$0, fdw $$1) {
      super.a($$0, $$1);
      if ($$0.bi > 0.0F && this.gt() && !this.gC()) {
         this.gE();
      }
   }

   public boolean t() {
      return this.gt() || this.gC();
   }

   @Override
   protected float c(cqs $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(byf.v) + $$1;
   }

   @Override
   protected fdv i(bwz $$0) {
      return this.t() ? new fdv(this.dN(), this.dL()) : super.i($$0);
   }

   @Override
   protected fdw b(cqs $$0, fdw $$1) {
      return this.t() ? fdw.c : super.b($$0, $$1);
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
   protected void b(float $$0, fdw $$1) {
      double $$2 = (double)this.fg();
      this.j(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(byf.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(awl.dA);
      this.a(eeo.u);
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
   protected awk u() {
      return awl.dz;
   }

   @Override
   protected awk l_() {
      return awl.dC;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.dE;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      if ($$1.a(axa.br)) {
         this.a(awl.dJ, 1.0F, 1.0F);
      } else {
         this.a(awl.dI, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ak);
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$0.fX() && !this.n_()) {
         this.b($$0);
         return bty.a;
      } else {
         bty $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.k($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cY().size() < 2 && !this.n_()) {
               this.a($$0);
            }

            return bty.a;
         }
      }
   }

   @Override
   public boolean a(bwa $$0, float $$1) {
      if ($$1 > 6.0F && this.gt() && !this.gC() && this.gq()) {
         this.gE();
      }

      return true;
   }

   public boolean gq() {
      return this.g(this.gt() ? bxl.a : bxl.k);
   }

   @Override
   protected boolean a(cqs $$0, cys $$1) {
      if (!this.k($$1)) {
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
               awk $$5 = this.gs();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(eeo.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(cio $$0) {
      if ($$0 != this && $$0 instanceof cki $$1 && this.gY() && $$1.gY()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cki b(aro $$0, bvq $$1) {
      return bwj.t.a($$0, bwi.e);
   }

   @Nullable
   @Override
   protected awk gs() {
      return awl.dD;
   }

   @Override
   protected void b(aro $$0, bup $$1, float $$2) {
      this.gF();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected fdw a(bwa $$0, bwd $$1, float $$2) {
      int $$3 = Math.max(this.cY().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cY().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cio) {
            $$5 += 0.2F;
         }
      }

      return new fdw(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ej() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bwd $$2, float $$3) {
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

         float $$15 = azk.a((float)this.gG() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azk.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azk.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fdw t(float $$0) {
      bwd $$1 = this.a(this.aw());
      float $$2 = this.ej();
      return new fdw(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ad() {
      return 30;
   }

   @Override
   protected boolean r(bwa $$0) {
      return this.cY().size() <= 2;
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
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
         this.b(awl.dG);
         this.b(bxl.k);
         this.a(eeo.u);
         this.a(-this.dV().ae());
      }
   }

   public void gE() {
      if (this.gt()) {
         this.b(awl.dH);
         this.b(bxl.a);
         this.a(eeo.u);
         this.a(this.dV().ae());
      }
   }

   public void gF() {
      this.b(bxl.a);
      this.a(eeo.u);
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
   protected je<awk> a(bwk $$0, cys $$1, dhb $$2) {
      return (je<awk>)($$0 == bwk.h ? awl.dF : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(akh<?> $$0) {
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
   public void b(cqs $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.bX);
      }
   }

   @Override
   protected cct I() {
      return new cki.a(this);
   }

   class a extends cct {
      public a(final cki $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cki.this.t()) {
            super.a();
         }
      }
   }

   class b extends ccx {
      b() {
         super(cki.this);
      }

      @Override
      public void a() {
         if (!cki.this.cX()) {
            super.a();
         }
      }
   }

   class c extends ccy {
      public c() {
         super(cki.this);
      }

      @Override
      public void a() {
         if (this.k == ccy.a.b && !cki.this.O_() && cki.this.gt() && !cki.this.gC() && cki.this.gq()) {
            cki.this.gE();
         }

         super.a();
      }
   }
}
