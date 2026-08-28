import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjo extends ckb {
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
   public static final alc<Boolean> cd = alg.a(cjo.class, ale.k);
   public static final alc<Long> ce = alg.a(cjo.class, ale.c);
   public final bvc cf = new bvc();
   public final bvc cg = new bvc();
   public final bvc ch = new bvc();
   public final bvc ci = new bvc();
   public final bvc cj = new bvc();
   private static final bvn cK = bvn.b(bvr.t.l(), bvr.t.m() - 1.43F).b(0.845F);
   private int cL = 0;
   private int cM = 0;

   public cjo(bvr<? extends cjo> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new cjo.c();
      this.bP = new cjo.b();
      cfr $$2 = (cfr)this.L();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(ce));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bws.k);
      }

      this.a($$1);
   }

   public static bxn.a p() {
      return gQ().a(bxo.s, 32.0).a(bxo.v, 0.09F).a(bxo.o, 0.42F).a(bxo.B, 1.5);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
      $$0.a(ce, 0L);
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      cjp.a(this, $$0.H_());
      this.b($$0.a().ac());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bxi.b<cjo> ed() {
      return cjp.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cjp.a(this.ed().a($$0));
   }

   @Override
   public bvn e(bws $$0) {
      return $$0 == bws.k ? cK.a(this.ej()) : super.e($$0);
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("camelBrain");
      bxi<?> $$2 = this.ec();
      ((bxi<cjo>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      cjp.a(this);
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
            this.dW().a(null, this.dw(), axf.dB, axg.g, 1.0F, 1.0F);
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
      if (this.aw() == bws.a && !this.cj.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(fby $$0) {
      if (this.t() && this.aJ()) {
         this.h(this.dz().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cpx $$0, fby $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gr() && !this.gA()) {
         this.gC();
      }
   }

   public boolean t() {
      return this.gr() || this.gA();
   }

   @Override
   protected float e(cpx $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bxo.v) + $$1;
   }

   @Override
   protected fbx j(bwg $$0) {
      return this.t() ? new fbx(this.dO(), this.dM()) : super.j($$0);
   }

   @Override
   protected fby b(cpx $$0, fby $$1) {
      return this.t() ? fby.c : super.b($$0, $$1);
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
   protected void b(float $$0, fby $$1) {
      double $$2 = (double)this.fj();
      this.i(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bxo.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(axf.dA);
      this.a(ecr.u);
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
   protected axe u() {
      return axf.dz;
   }

   @Override
   protected axe o_() {
      return axf.dC;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.dE;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      if ($$1.a(axu.br)) {
         this.a(axf.dJ, 1.0F, 1.0F);
      } else {
         this.a(axf.dI, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.am);
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$0.fY() && !this.e_()) {
         this.b($$0);
         return btj.a;
      } else {
         btj $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.j($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cZ().size() < 2 && !this.e_()) {
               this.a($$0);
            }

            return btj.a;
         }
      }
   }

   @Override
   public boolean a(bvk $$0, float $$1) {
      if ($$1 > 6.0F && this.gr() && !this.gA() && this.go()) {
         this.gC();
      }

      return true;
   }

   public boolean go() {
      return this.g(this.gr() ? bws.a : bws.k);
   }

   @Override
   protected boolean a(cpx $$0, cxp $$1) {
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
            this.dW().a(ls.O, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dW().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               axe $$5 = this.gq();
               if ($$5 != null) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), $$5, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(ecr.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(chx $$0) {
      if ($$0 != this && $$0 instanceof cjo $$1 && this.gX() && $$1.gX()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cjo b(ash $$0, bvb $$1) {
      return bvr.t.a($$0, bvq.e);
   }

   @Nullable
   @Override
   protected axe gq() {
      return axf.dD;
   }

   @Override
   protected void b(ash $$0, bua $$1, float $$2) {
      this.gD();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected fby a(bvk $$0, bvn $$1, float $$2) {
      int $$3 = Math.max(this.cZ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dR() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cZ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof chx) {
            $$5 += 0.2F;
         }
      }

      return new fby(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dM() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ej() {
      return this.e_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bvn $$2, float $$3) {
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

         float $$15 = bae.a((float)this.gE() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)bae.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)bae.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public fby s(float $$0) {
      bvn $$1 = this.a(this.aw());
      float $$2 = this.ej();
      return new fby(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bvk $$0) {
      return this.cZ().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
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
         this.b(axf.dG);
         this.b(bws.k);
         this.a(ecr.u);
         this.a(-this.dW().ac());
      }
   }

   public void gC() {
      if (this.gr()) {
         this.b(axf.dH);
         this.b(bws.a);
         this.a(ecr.u);
         this.a(this.dW().ac());
      }
   }

   public void gD() {
      this.b(bws.a);
      this.a(ecr.u);
      this.b(this.dW().ac());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(ce, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gE() {
      return this.dW().ac() - Math.abs(this.al.a(ce));
   }

   @Override
   public axe ac_() {
      return axf.dF;
   }

   @Override
   public void a(alc<?> $$0) {
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
   public void b(cpx $$0) {
      if (!this.dW().C) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected ccc G() {
      return new cjo.a(this);
   }

   class a extends ccc {
      public a(final cjo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cjo.this.t()) {
            super.a();
         }
      }
   }

   class b extends ccg {
      b() {
         super(cjo.this);
      }

      @Override
      public void a() {
         if (!cjo.this.cY()) {
            super.a();
         }
      }
   }

   class c extends cch {
      public c() {
         super(cjo.this);
      }

      @Override
      public void a() {
         if (this.k == cch.a.b && !cjo.this.P_() && cjo.this.gr() && !cjo.this.gA() && cjo.this.go()) {
            cjo.this.gC();
         }

         super.a();
      }
   }
}
