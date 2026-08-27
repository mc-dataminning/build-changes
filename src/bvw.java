import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvw extends bwj implements bjj, bjo, bjp {
   public static final cly bT = cly.a(cjb.eA);
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
   public static final adz<Boolean> bY = aec.a(bvw.class, aeb.k);
   public static final adz<Long> bZ = aec.a(bvw.class, aeb.c);
   public final bie ca = new bie();
   public final bie cb = new bie();
   public final bie cc = new bie();
   public final bie cd = new bie();
   public final bie ce = new bie();
   private static final bij cD = bij.b(bim.l.k(), bim.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public bvw(bim<? extends bvw> $$0, cpm $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new bvw.b();
      bsh $$2 = (bsh)this.H();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bjk.k);
      }

      this.a($$1);
   }

   public static bke.a p() {
      return gz().a(bkf.a, 32.0).a(bkf.d, 0.09F).a(bkf.n, 0.42F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      bvx.a(this, $$0.y_());
      this.b($$0.C().V());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bjz.b<bvw> dN() {
      return bvx.a();
   }

   @Override
   protected void w() {
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return bvx.a(this.dN().a($$0));
   }

   @Override
   public bij a(bjk $$0) {
      return $$0 == bjk.k ? cD.a(this.dX()) : super.a($$0);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b - 0.1F * this.dX();
   }

   @Override
   public double d() {
      return 0.5;
   }

   @Override
   protected void V() {
      this.dK().ad().a("camelBrain");
      bjz<?> $$0 = this.dM();
      ((bjz<bvw>)$$0).a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("camelActivityUpdate");
      bvx.a(this);
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
            this.dK().a(null, this.dk(), aow.cS, aox.g, 1.0F, 1.0F);
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
      if (this.an() == bjk.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void h(ehe $$0) {
      if (this.q() && this.aA()) {
         this.f(this.dn().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.h($$0);
   }

   @Override
   protected void a(cbn $$0, ehe $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gh() && !this.gj()) {
         this.gl();
      }
   }

   public boolean q() {
      return this.gh() || this.gj();
   }

   @Override
   protected float e(cbn $$0) {
      float $$1 = $$0.bX() && this.W_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bkf.d) + $$1;
   }

   @Override
   protected ehd l(biy $$0) {
      return this.q() ? new ehd(this.dC(), this.dA()) : super.l($$0);
   }

   @Override
   protected ehe b(cbn $$0, ehe $$1) {
      return this.q() ? ehe.b : super.b($$0, $$1);
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
   protected void b(float $$0, ehe $$1) {
      double $$2 = this.b(bkf.n) * (double)this.aI() + (double)this.eY();
      this.g(this.bE().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bkf.d) * (double)this.aJ()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.a(aow.cR, 1.0F, this.eV());
      this.a(djk.u);
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
   protected aov r() {
      return aow.cQ;
   }

   @Override
   protected aov h_() {
      return aow.cT;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.cV;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      if ($$1.a(apl.bo)) {
         this.a(aow.da, 1.0F, 1.0F);
      } else {
         this.a(aow.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(ciy $$0) {
      return bT.a($$0);
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$0.fG() && !this.i_()) {
         this.b($$0);
         return bgq.a(this.dK().B);
      } else {
         bgq $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.i_()) {
               this.f($$0);
            }

            return bgq.a(this.dK().B);
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
      return this.f(this.gh() ? bjk.a : bjk.k);
   }

   @Override
   protected boolean a(cbn $$0, ciy $$1) {
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
            this.dK().a(iv.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dK().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aS()) {
               aov $$5 = this.gg();
               if ($$5 != null) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), $$5, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(djk.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean a(buk $$0) {
      if ($$0 != this && $$0 instanceof bvw $$1 && this.gH() && $$1.gH()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bvw b(akk $$0, bid $$1) {
      return bim.l.a((cpm)$$0);
   }

   @Nullable
   @Override
   protected aov gg() {
      return aow.cU;
   }

   @Override
   protected void f(bhg $$0, float $$1) {
      this.gm();
      super.f($$0, $$1);
   }

   @Override
   protected void a(bii $$0, bii.a $$1) {
      super.a($$0, $$1);
      this.a($$0);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dF() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof buk) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float dX() {
      return this.i_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bij $$2, float $$3) {
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

         float $$15 = arp.a((float)this.gn() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)arp.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)arp.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ehe p(float $$0) {
      bij $$1 = this.a(this.an());
      float $$2 = this.dX();
      return new ehe(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   @Override
   public void j(bii $$0) {
      if (this.cN() != $$0) {
         this.a($$0);
      }
   }

   private void a(bii $$0) {
      $$0.o(this.dA());
      float $$1 = $$0.dA();
      float $$2 = arp.g($$1 - this.dA());
      float $$3 = arp.a($$2, -160.0F, 160.0F);
      $$0.N += $$3 - $$2;
      float $$4 = $$1 + $$3 - $$2;
      $$0.r($$4);
      $$0.n($$4);
   }

   private void a(bii $$0, float $$1) {
      float $$2 = $$0.co();
      float $$3 = arp.g(this.aU - $$2);
      float $$4 = arp.a(arp.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int X() {
      return 30;
   }

   @Override
   protected boolean r(bii $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
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
         this.a(aow.cX, 1.0F, this.eV());
         this.b(bjk.k);
         this.a(djk.u);
         this.a(-this.dK().V());
      }
   }

   public void gl() {
      if (this.gh()) {
         this.a(aow.cY, 1.0F, this.eV());
         this.b(bjk.a);
         this.a(djk.u);
         this.a(this.dK().V());
      }
   }

   public void gm() {
      this.b(bjk.a);
      this.a(djk.u);
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
   public aov R_() {
      return aow.cW;
   }

   @Override
   public void a(adz<?> $$0) {
      if (!this.am && bY.equals($$0)) {
         this.cE = this.cE == 0 ? 55 : this.cE;
      }

      super.a($$0);
   }

   @Override
   protected bos B() {
      return new bvw.a(this);
   }

   @Override
   public boolean go() {
      return true;
   }

   @Override
   public void b(cbn $$0) {
      if (!this.dK().B) {
         $$0.a(this, this.cp);
      }
   }

   class a extends bos {
      public a(bvw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bvw.this.q()) {
            super.a();
         }
      }
   }

   class b extends box {
      public b() {
         super(bvw.this);
      }

      @Override
      public void a() {
         if (this.k == box.a.b && !bvw.this.fO() && bvw.this.gh() && !bvw.this.gj() && bvw.this.fZ()) {
            bvw.this.gl();
         }

         super.a();
      }
   }
}
