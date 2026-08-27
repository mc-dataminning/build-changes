import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvv extends bwi implements bjj, bjo {
   public static final clx bT = clx.a(cja.eA);
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
   public static final adz<Boolean> bY = aec.a(bvv.class, aeb.k);
   public static final adz<Long> bZ = aec.a(bvv.class, aeb.c);
   public final bie ca = new bie();
   public final bie cb = new bie();
   public final bie cc = new bie();
   public final bie cd = new bie();
   public final bie ce = new bie();
   private static final bij cD = bij.b(bim.l.k(), bim.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public bvv(bim<? extends bvv> $$0, cpl $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new bvv.b();
      bsg $$2 = (bsg)this.H();
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

   public static bkd.a p() {
      return gA().a(bke.a, 32.0).a(bke.d, 0.09F).a(bke.n, 0.42F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      bvw.a(this, $$0.y_());
      this.b($$0.C().V());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bjy.b<bvv> dN() {
      return bvw.a();
   }

   @Override
   protected void w() {
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return bvw.a(this.dN().a($$0));
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
   protected void V() {
      this.dK().ad().a("camelBrain");
      bjy<?> $$0 = this.dM();
      ((bjy<bvv>)$$0).a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("camelActivityUpdate");
      bvw.a(this);
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
         this.gM();
      }

      if (this.q()) {
         this.a(this, 30.0F);
      }

      if (this.gi() && this.aX()) {
         this.gn();
      }
   }

   private void gM() {
      if (this.cF <= 0) {
         this.cF = this.ag.a(40) + 80;
         this.cd.a(this.ah);
      } else {
         this.cF--;
      }

      if (this.gj()) {
         this.cc.a();
         this.ce.a();
         if (this.gN()) {
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
         this.cc.a(this.gk() && this.go() >= 0L, this.ah);
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
   public void h(ehd $$0) {
      if (this.q() && this.aA()) {
         this.f(this.dn().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.h($$0);
   }

   @Override
   protected void a(cbm $$0, ehd $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gi() && !this.gk()) {
         this.gm();
      }
   }

   public boolean q() {
      return this.gi() || this.gk();
   }

   @Override
   protected float e(cbm $$0) {
      float $$1 = $$0.bX() && this.V_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bke.d) + $$1;
   }

   @Override
   protected ehc j(biy $$0) {
      return this.q() ? new ehc(this.dC(), this.dA()) : super.j($$0);
   }

   @Override
   protected ehd b(cbm $$0, ehd $$1) {
      return this.q() ? ehd.b : super.b($$0, $$1);
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
   protected void b(float $$0, ehd $$1) {
      double $$2 = this.b(bke.n) * (double)this.aI() + (double)this.eY();
      this.g(this.bE().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bke.d) * (double)this.aJ()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.a(djj.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int V_() {
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
   protected void b(gu $$0, dez $$1) {
      if ($$1.a(apl.bo)) {
         this.a(aow.da, 1.0F, 1.0F);
      } else {
         this.a(aow.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(cix $$0) {
      return bT.a($$0);
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
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
      if ($$0 > 6.0F && this.gi() && !this.gk() && this.ga()) {
         this.gm();
      }
   }

   public boolean ga() {
      return this.f(this.gi() ? bjk.a : bjk.k);
   }

   @Override
   protected boolean a(cbm $$0, cix $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.et() < this.eK();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gp() && this.h() == 0 && this.gb();
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
               aov $$5 = this.gh();
               if ($$5 != null) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), $$5, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(djj.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gg() {
      return false;
   }

   @Override
   public boolean a(buj $$0) {
      if ($$0 != this && $$0 instanceof bvv $$1 && this.gI() && $$1.gI()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bvv b(akk $$0, bid $$1) {
      return bim.l.a((cpl)$$0);
   }

   @Nullable
   @Override
   protected aov gh() {
      return aow.cU;
   }

   @Override
   protected void f(bhg $$0, float $$1) {
      this.gn();
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

         if ($$0 instanceof buj) {
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
      boolean $$8 = this.gk();
      boolean $$9 = this.gi();
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

         float $$15 = arp.a((float)this.go() + $$1, 0.0F, (float)$$10);
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
   public ehd p(float $$0) {
      bij $$1 = this.a(this.an());
      float $$2 = this.dX();
      return new ehd(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
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

   public boolean gi() {
      return this.an.b(bZ) < 0L;
   }

   public boolean gj() {
      return this.go() < 0L != this.gi();
   }

   public boolean gk() {
      long $$0 = this.go();
      return $$0 < (long)(this.gi() ? 40 : 52);
   }

   private boolean gN() {
      return this.gi() && this.go() < 40L && this.go() >= 0L;
   }

   public void gl() {
      if (!this.gi()) {
         this.a(aow.cX, 1.0F, this.eV());
         this.b(bjk.k);
         this.a(djj.u);
         this.a(-this.dK().V());
      }
   }

   public void gm() {
      if (this.gi()) {
         this.a(aow.cY, 1.0F, this.eV());
         this.b(bjk.a);
         this.a(djj.u);
         this.a(this.dK().V());
      }
   }

   public void gn() {
      this.b(bjk.a);
      this.a(djj.u);
      this.b(this.dK().V());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long go() {
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
   protected bor B() {
      return new bvv.a(this);
   }

   @Override
   public boolean gp() {
      return true;
   }

   @Override
   public void b(cbm $$0) {
      if (!this.dK().B) {
         $$0.a(this, this.cp);
      }
   }

   class a extends bor {
      public a(bvv $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bvv.this.q()) {
            super.a();
         }
      }
   }

   class b extends bow {
      public b() {
         super(bvv.this);
      }

      @Override
      public void a() {
         if (this.k == bow.a.b && !bvv.this.fO() && bvv.this.gi() && !bvv.this.gk() && bvv.this.ga()) {
            bvv.this.gm();
         }

         super.a();
      }
   }
}
