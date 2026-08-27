import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvu extends bwh implements bjh, bjm, bjn {
   public static final clw bT = clw.a(ciz.eA);
   public static final float bU = 0.45F;
   public static final int bW = 55;
   public static final int bX = 30;
   private static final float cv = 0.1F;
   private static final float cw = 1.4285F;
   private static final float cx = 22.2222F;
   private static final int cy = 5;
   private static final int cz = 40;
   private static final int cA = 52;
   private static final int cB = 80;
   private static final float cC = 1.43F;
   public static final adx<Boolean> bY = aea.a(bvu.class, adz.k);
   public static final adx<Long> bZ = aea.a(bvu.class, adz.c);
   public final bic ca = new bic();
   public final bic cb = new bic();
   public final bic cc = new bic();
   public final bic cd = new bic();
   public final bic ce = new bic();
   private static final bih cD = bih.b(bik.l.k(), bik.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public bvu(bik<? extends bvu> $$0, cpk $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new bvu.b();
      bsf $$2 = (bsf)this.H();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bji.k);
      }

      this.a($$1);
   }

   public static bkc.a p() {
      return gz().a(bkd.a, 32.0).a(bkd.d, 0.09F).a(bkd.n, 0.42F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      bvv.a(this, $$0.y_());
      this.b($$0.C().V());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bjx.b<bvu> dN() {
      return bvv.a();
   }

   @Override
   protected void w() {
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bvv.a(this.dN().a($$0));
   }

   @Override
   public bih a(bji $$0) {
      return $$0 == bji.k ? cD.a(this.dX()) : super.a($$0);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b - 0.1F * this.dX();
   }

   @Override
   public double d() {
      return 0.5;
   }

   @Override
   protected void V() {
      this.dK().ad().a("camelBrain");
      bjx<?> $$0 = this.dM();
      ((bjx<bvu>)$$0).a((aki)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("camelActivityUpdate");
      bvv.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   public void l() {
      super.l();
      if (this.t() && this.cE < 50 && (this.aA() || this.bb() || this.bN())) {
         this.w(false);
      }

      if (this.cE > 0) {
         this.cE--;
         if (this.cE == 0) {
            this.dK().a(null, this.dk(), aou.cS, aov.g, 1.0F, 1.0F);
         }
      }

      if (this.dK().r_()) {
         this.gL();
      }

      if (this.q()) {
         this.a(this, 30.0F);
      }

      if (this.gh() && this.aX()) {
         this.gm();
      }
   }

   private void gL() {
      if (this.cF <= 0) {
         this.cF = this.ag.a(40) + 80;
         this.cd.a(this.ah);
      } else {
         this.cF--;
      }

      if (this.gi()) {
         this.cc.a();
         this.ce.a();
         if (this.gM()) {
            this.ca.b(this.ah);
            this.cb.a();
         } else {
            this.ca.a();
            this.cb.b(this.ah);
         }
      } else {
         this.ca.a();
         this.cb.a();
         this.ce.a(this.t(), this.ah);
         this.cc.a(this.gj() && this.gn() >= 0L, this.ah);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.an() == bji.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void h(ehf $$0) {
      if (this.q() && this.aA()) {
         this.f(this.dn().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.h($$0);
   }

   @Override
   protected void a(cbl $$0, ehf $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gh() && !this.gj()) {
         this.gl();
      }
   }

   public boolean q() {
      return this.gh() || this.gj();
   }

   @Override
   protected float e(cbl $$0) {
      float $$1 = $$0.bX() && this.W_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bkd.d) + $$1;
   }

   @Override
   protected ehe l(biw $$0) {
      return this.q() ? new ehe(this.dC(), this.dA()) : super.l($$0);
   }

   @Override
   protected ehf b(cbl $$0, ehf $$1) {
      return this.q() ? ehf.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.q() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cE <= 0 && this.aA()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dD() {
      return true;
   }

   @Override
   protected void b(float $$0, ehf $$1) {
      double $$2 = this.b(bkd.n) * (double)this.aI() + (double)this.eY();
      this.g(this.bE().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bkd.d) * (double)this.aJ()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cE = 55;
      this.w(true);
      this.au = true;
   }

   public boolean t() {
      return this.an.b(bY);
   }

   public void w(boolean $$0) {
      this.an.b(bY, $$0);
   }

   @Override
   public void c(int $$0) {
      this.a(aou.cR, 1.0F, this.eV());
      this.a(dji.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int W_() {
      return this.cE;
   }

   @Override
   protected aot r() {
      return aou.cQ;
   }

   @Override
   protected aot h_() {
      return aou.cT;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.cV;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      if ($$1.a(apj.bo)) {
         this.a(aou.da, 1.0F, 1.0F);
      } else {
         this.a(aou.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(ciw $$0) {
      return bT.a($$0);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$0.fG() && !this.i_()) {
         this.b($$0);
         return bgo.a(this.dK().B);
      } else {
         bgo $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.i_()) {
               this.f($$0);
            }

            return bgo.a(this.dK().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gh() && !this.gj() && this.fZ()) {
         this.gl();
      }
   }

   public boolean fZ() {
      return this.f(this.gh() ? bji.a : bji.k);
   }

   @Override
   protected boolean a(cbl $$0, ciw $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.et() < this.eK();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.go() && this.h() == 0 && this.ga();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.i_();
         if ($$4) {
            this.dK().a(iw.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dK().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aS()) {
               aot $$5 = this.gg();
               if ($$5 != null) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), $$5, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            return true;
         }
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean a(bui $$0) {
      if ($$0 != this && $$0 instanceof bvu $$1 && this.gH() && $$1.gH()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bvu b(aki $$0, bib $$1) {
      return bik.l.a((cpk)$$0);
   }

   @Nullable
   @Override
   protected aot gg() {
      return aou.cU;
   }

   @Override
   protected void f(bhe $$0, float $$1) {
      this.gm();
      super.f($$0, $$1);
   }

   @Override
   protected void a(big $$0, big.a $$1) {
      super.a($$0, $$1);
      this.a($$0);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dF() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bui) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float dX() {
      return this.i_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bih $$2, float $$3) {
      double $$4 = (double)($$2.b - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gj();
      boolean $$9 = this.gh();
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

         float $$15 = aro.a((float)this.gn() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)aro.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)aro.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ehf p(float $$0) {
      bih $$1 = this.a(this.an());
      float $$2 = this.dX();
      return new ehf(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   @Override
   public void j(big $$0) {
      if (this.cN() != $$0) {
         this.a($$0);
      }
   }

   private void a(big $$0) {
      $$0.o(this.dA());
      float $$1 = $$0.dA();
      float $$2 = aro.g($$1 - this.dA());
      float $$3 = aro.a($$2, -160.0F, 160.0F);
      $$0.N += $$3 - $$2;
      float $$4 = $$1 + $$3 - $$2;
      $$0.r($$4);
      $$0.n($$4);
   }

   private void a(big $$0, float $$1) {
      float $$2 = $$0.co();
      float $$3 = aro.g(this.aU - $$2);
      float $$4 = aro.a(aro.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int X() {
      return 30;
   }

   @Override
   protected boolean r(big $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   public boolean gh() {
      return this.an.b(bZ) < 0L;
   }

   public boolean gi() {
      return this.gn() < 0L != this.gh();
   }

   public boolean gj() {
      long $$0 = this.gn();
      return $$0 < (long)(this.gh() ? 40 : 52);
   }

   private boolean gM() {
      return this.gh() && this.gn() < 40L && this.gn() >= 0L;
   }

   public void gk() {
      if (!this.gh()) {
         this.a(aou.cX, 1.0F, this.eV());
         this.b(bji.k);
         this.a(dji.u);
         this.a(-this.dK().V());
      }
   }

   public void gl() {
      if (this.gh()) {
         this.a(aou.cY, 1.0F, this.eV());
         this.b(bji.a);
         this.a(dji.u);
         this.a(this.dK().V());
      }
   }

   public void gm() {
      this.b(bji.a);
      this.a(dji.u);
      this.b(this.dK().V());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gn() {
      return this.dK().V() - Math.abs(this.an.b(bZ));
   }

   @Override
   public aot R_() {
      return aou.cW;
   }

   @Override
   public void a(adx<?> $$0) {
      if (!this.am && bY.equals($$0)) {
         this.cE = this.cE == 0 ? 55 : this.cE;
      }

      super.a($$0);
   }

   @Override
   protected boq B() {
      return new bvu.a(this);
   }

   @Override
   public boolean go() {
      return true;
   }

   @Override
   public void b(cbl $$0) {
      if (!this.dK().B) {
         $$0.a(this, this.cp);
      }
   }

   class a extends boq {
      public a(bvu $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bvu.this.q()) {
            super.a();
         }
      }
   }

   class b extends bov {
      public b() {
         super(bvu.this);
      }

      @Override
      public void a() {
         if (this.k == bov.a.b && !bvu.this.fO() && bvu.this.gh() && !bvu.this.gj() && bvu.this.fZ()) {
            bvu.this.gl();
         }

         super.a();
      }
   }
}
