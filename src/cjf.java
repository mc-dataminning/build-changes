import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjf extends cjs {
   public static final float bZ = 0.45F;
   public static final int ca = 55;
   public static final int cb = 30;
   private static final float cC = 0.1F;
   private static final float cD = 1.4285F;
   private static final float cE = 22.2222F;
   private static final int cF = 5;
   private static final int cG = 40;
   private static final int cH = 52;
   private static final int cI = 80;
   private static final float cJ = 1.43F;
   public static final aks<Boolean> cd = akw.a(cjf.class, aku.k);
   public static final aks<Long> ce = akw.a(cjf.class, aku.c);
   public final but cf = new but();
   public final but cg = new but();
   public final but ch = new but();
   public final but ci = new but();
   public final but cj = new but();
   private static final bve cK = bve.b(bvi.t.l(), bvi.t.m() - 1.43F).b(0.845F);
   private int cL = 0;
   private int cM = 0;

   public cjf(bvi<? extends cjf> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cjf.c();
      this.bP = new cjf.b();
      cfi $$2 = (cfi)this.L();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(ce));
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bwj.k);
      }

      this.a($$1);
   }

   public static bxe.a p() {
      return gQ().a(bxf.s, 32.0).a(bxf.v, 0.09F).a(bxf.o, 0.42F).a(bxf.B, 1.5);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
      $$0.a(ce, 0L);
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      cjg.a(this, $$0.H_());
      this.b($$0.a().ad());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bwz.b<cjf> ed() {
      return cjg.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cjg.a(this.ed().a($$0));
   }

   @Override
   public bve e(bwj $$0) {
      return $$0 == bwj.k ? cK.a(this.ej()) : super.e($$0);
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("camelBrain");
      bwz<?> $$2 = this.ec();
      ((bwz<cjf>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      cjg.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.x() && this.cL < 50 && (this.aJ() || this.bn() || this.bZ())) {
         this.x(false);
      }

      if (this.cL > 0) {
         this.cL--;
         if (this.cL == 0) {
            this.dW().a(null, this.dw(), awv.dB, aww.g, 1.0F, 1.0F);
         }
      }

      if (this.dW().B_()) {
         this.ha();
      }

      if (this.t()) {
         this.ab();
      }

      if (this.gr() && this.bj()) {
         this.gD();
      }
   }

   private void ha() {
      if (this.cM <= 0) {
         this.cM = this.ae.a(40) + 80;
         this.ci.a(this.af);
      } else {
         this.cM--;
      }

      if (this.gs()) {
         this.ch.a();
         this.cj.a();
         if (this.hb()) {
            this.cf.b(this.af);
            this.cg.a();
         } else {
            this.cf.a();
            this.cg.b(this.af);
         }
      } else {
         this.cf.a();
         this.cg.a();
         this.cj.a(this.x(), this.af);
         this.ch.a(this.gA() && this.gE() >= 0L, this.af);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.aw() == bwj.a && !this.cj.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fbr $$0) {
      if (this.t() && this.aJ()) {
         this.h(this.dz().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cpo $$0, fbr $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gr() && !this.gA()) {
         this.gC();
      }
   }

   public boolean t() {
      return this.gr() || this.gA();
   }

   @Override
   protected float e(cpo $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bxf.v) + $$1;
   }

   @Override
   protected fbq j(bvx $$0) {
      return this.t() ? new fbq(this.dO(), this.dM()) : super.j($$0);
   }

   @Override
   protected fbr b(cpo $$0, fbr $$1) {
      return this.t() ? fbr.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.j() && this.cL <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   protected void b(float $$0, fbr $$1) {
      double $$2 = (double)this.fj();
      this.i(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bxf.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cL = 55;
      this.x(true);
      this.ar = true;
   }

   public boolean x() {
      return this.al.a(cd);
   }

   public void x(boolean $$0) {
      this.al.a(cd, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awv.dA);
      this.a(eck.u);
      this.x(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cL;
   }

   @Override
   protected awu u() {
      return awv.dz;
   }

   @Override
   protected awu o_() {
      return awv.dC;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.dE;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      if ($$1.a(axk.br)) {
         this.a(awv.dJ, 1.0F, 1.0F);
      } else {
         this.a(awv.dI, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.am);
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$0.fY() && !this.e_()) {
         this.b($$0);
         return bta.a;
      } else {
         bta $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.j($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cZ().size() < 2 && !this.e_()) {
               this.a($$0);
            }

            return bta.a;
         }
      }
   }

   @Override
   public boolean a(bvb $$0, float $$1) {
      if ($$1 > 6.0F && this.gr() && !this.gA() && this.go()) {
         this.gC();
      }

      return true;
   }

   public boolean go() {
      return this.g(this.gr() ? bwj.a : bwj.k);
   }

   @Override
   protected boolean a(cpo $$0, cxg $$1) {
      if (!this.j($$1)) {
         return false;
      } else {
         boolean $$2 = this.eE() < this.eS();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gF() && this.Z_() == 0 && this.gv();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.e_();
         if ($$4) {
            this.dW().a(ls.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dW().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               awu $$5 = this.gq();
               if ($$5 != null) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), $$5, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(eck.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(cho $$0) {
      if ($$0 != this && $$0 instanceof cjf $$1 && this.gX() && $$1.gX()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cjf b(arx $$0, bus $$1) {
      return bvi.t.a($$0, bvh.e);
   }

   @Nullable
   @Override
   protected awu gq() {
      return awv.dD;
   }

   @Override
   protected void b(arx $$0, btr $$1, float $$2) {
      this.gD();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected fbr a(bvb $$0, bve $$1, float $$2) {
      int $$3 = Math.max(this.cZ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dR() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cZ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cho) {
            $$5 += 0.2F;
         }
      }

      return new fbr(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dM() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ej() {
      return this.e_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bve $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gA();
      boolean $$9 = this.gr();
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

         float $$15 = azu.a((float)this.gE() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azu.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azu.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fbr s(float $$0) {
      bve $$1 = this.a(this.aw());
      float $$2 = this.ej();
      return new fbr(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bvb $$0) {
      return this.cZ().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   public boolean gr() {
      return this.al.a(ce) < 0L;
   }

   public boolean gs() {
      return this.gE() < 0L != this.gr();
   }

   public boolean gA() {
      long $$0 = this.gE();
      return $$0 < (long)(this.gr() ? 40 : 52);
   }

   private boolean hb() {
      return this.gr() && this.gE() < 40L && this.gE() >= 0L;
   }

   public void gB() {
      if (!this.gr()) {
         this.b(awv.dG);
         this.b(bwj.k);
         this.a(eck.u);
         this.a(-this.dW().ad());
      }
   }

   public void gC() {
      if (this.gr()) {
         this.b(awv.dH);
         this.b(bwj.a);
         this.a(eck.u);
         this.a(this.dW().ad());
      }
   }

   public void gD() {
      this.b(bwj.a);
      this.a(eck.u);
      this.b(this.dW().ad());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(ce, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gE() {
      return this.dW().ad() - Math.abs(this.al.a(ce));
   }

   @Override
   public awu ac_() {
      return awv.dF;
   }

   @Override
   public void a(aks<?> $$0) {
      if (!this.ak && cd.equals($$0)) {
         this.cL = this.cL == 0 ? 55 : this.cL;
      }

      super.a($$0);
   }

   @Override
   public boolean gF() {
      return true;
   }

   @Override
   public void b(cpo $$0) {
      if (!this.dW().C) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected cbt G() {
      return new cjf.a(this);
   }

   class a extends cbt {
      public a(final cjf $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cjf.this.t()) {
            super.a();
         }
      }
   }

   class b extends cbx {
      b() {
         super(cjf.this);
      }

      @Override
      public void a() {
         if (!cjf.this.cY()) {
            super.a();
         }
      }
   }

   class c extends cby {
      public c() {
         super(cjf.this);
      }

      @Override
      public void a() {
         if (this.k == cby.a.b && !cjf.this.P_() && cjf.this.gr() && !cjf.this.gA() && cjf.this.go()) {
            cjf.this.gC();
         }

         super.a();
      }
   }
}
