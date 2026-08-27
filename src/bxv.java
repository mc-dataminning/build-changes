import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxv extends byi implements blj, blo {
   public static final coc bT = coc.a(cle.eA);
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
   public static final afm<Boolean> bY = afp.a(bxv.class, afo.k);
   public static final afm<Long> bZ = afp.a(bxv.class, afo.c);
   public final bke ca = new bke();
   public final bke cb = new bke();
   public final bke cc = new bke();
   public final bke cd = new bke();
   public final bke ce = new bke();
   private static final bkj cD = bkj.b(bkm.l.k(), bkm.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public bxv(bkm<? extends bxv> $$0, crs $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new bxv.c();
      this.bK = new bxv.b();
      bug $$2 = (bug)this.L();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(blk.k);
      }

      this.a($$1);
   }

   public static bmd.a s() {
      return gE().a(bme.l, 32.0).a(bme.m, 0.09F).a(bme.h, 0.42F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      bxw.a(this, $$0.E_());
      this.b($$0.C().V());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bly.b<bxv> dO() {
      return bxw.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return bxw.a(this.dO().a($$0));
   }

   @Override
   public bkj a(blk $$0) {
      return $$0 == blk.k ? cD.a(this.dY()) : super.a($$0);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return $$1.b - 0.1F * this.dY();
   }

   @Override
   protected void X() {
      this.dL().ad().a("camelBrain");
      bly<?> $$0 = this.dN();
      ((bly<bxv>)$$0).a((ama)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("camelActivityUpdate");
      bxw.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cE < 50 && (this.aA() || this.bb() || this.bN())) {
         this.w(false);
      }

      if (this.cE > 0) {
         this.cE--;
         if (this.cE == 0) {
            this.dL().a(null, this.dl(), aqn.cS, aqo.g, 1.0F, 1.0F);
         }
      }

      if (this.dL().x_()) {
         this.gQ();
      }

      if (this.t()) {
         this.a(this, 30.0F);
      }

      if (this.gm() && this.aX()) {
         this.gr();
      }
   }

   private void gQ() {
      if (this.cF <= 0) {
         this.cF = this.ag.a(40) + 80;
         this.cd.a(this.ah);
      } else {
         this.cF--;
      }

      if (this.gn()) {
         this.cc.a();
         this.ce.a();
         if (this.gR()) {
            this.ca.b(this.ah);
            this.cb.a();
         } else {
            this.ca.a();
            this.cb.b(this.ah);
         }
      } else {
         this.ca.a();
         this.cb.a();
         this.ce.a(this.y(), this.ah);
         this.cc.a(this.go() && this.gs() >= 0L, this.ah);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.an() == blk.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void h(eji $$0) {
      if (this.t() && this.aA()) {
         this.f(this.do().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.h($$0);
   }

   @Override
   protected void a(cdm $$0, eji $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gm() && !this.go()) {
         this.gq();
      }
   }

   public boolean t() {
      return this.gm() || this.go();
   }

   @Override
   protected float e(cdm $$0) {
      float $$1 = $$0.bX() && this.ab_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bme.m) + $$1;
   }

   @Override
   protected ejh j(bky $$0) {
      return this.t() ? new ejh(this.dD(), this.dB()) : super.j($$0);
   }

   @Override
   protected eji b(cdm $$0, eji $$1) {
      return this.t() ? eji.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cE <= 0 && this.aA()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dE() {
      return true;
   }

   @Override
   protected void b(float $$0, eji $$1) {
      double $$2 = this.b(bme.h) * (double)this.aI() + (double)this.eZ();
      this.g(this.bE().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bme.m) * (double)this.aJ()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cE = 55;
      this.w(true);
      this.au = true;
   }

   public boolean y() {
      return this.an.b(bY);
   }

   public void w(boolean $$0) {
      this.an.b(bY, $$0);
   }

   @Override
   public void c(int $$0) {
      this.a(aqn.cR, 1.0F, this.eW());
      this.a(dlg.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ab_() {
      return this.cE;
   }

   @Override
   protected aqm w() {
      return aqn.cQ;
   }

   @Override
   protected aqm m_() {
      return aqn.cT;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.cV;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      if ($$1.a(arc.bo)) {
         this.a(aqn.da, 1.0F, 1.0F);
      } else {
         this.a(aqn.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(clb $$0) {
      return bT.a($$0);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$0.fI() && !this.n_()) {
         this.b($$0);
         return biq.a(this.dL().B);
      } else {
         biq $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.n_()) {
               this.f($$0);
            }

            return biq.a(this.dL().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gm() && !this.go() && this.ge()) {
         this.gq();
      }
   }

   public boolean ge() {
      return this.f(this.gm() ? blk.a : blk.k);
   }

   @Override
   protected boolean a(cdm $$0, clb $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.eu() < this.eL();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gt() && this.h() == 0 && this.gf();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.n_();
         if ($$4) {
            this.dL().a(js.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dL().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aS()) {
               aqm $$5 = this.gl();
               if ($$5 != null) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), $$5, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(dlg.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   public boolean a(bwj $$0) {
      if ($$0 != this && $$0 instanceof bxv $$1 && this.gM() && $$1.gM()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bxv b(ama $$0, bkd $$1) {
      return bkm.l.a((crs)$$0);
   }

   @Nullable
   @Override
   protected aqm gl() {
      return aqn.cU;
   }

   @Override
   protected void f(bjg $$0, float $$1) {
      this.gr();
      super.f($$0, $$1);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dG() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bwj) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float dY() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bkj $$2, float $$3) {
      double $$4 = (double)($$2.b - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.go();
      boolean $$9 = this.gm();
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

         float $$15 = ati.a((float)this.gs() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ati.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ati.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eji p(float $$0) {
      bkj $$1 = this.a(this.an());
      float $$2 = this.dY();
      return new eji(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   private void a(bki $$0, float $$1) {
      float $$2 = $$0.co();
      float $$3 = ati.g(this.aU - $$2);
      float $$4 = ati.a(ati.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int Z() {
      return 30;
   }

   @Override
   protected boolean r(bki $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   public boolean gm() {
      return this.an.b(bZ) < 0L;
   }

   public boolean gn() {
      return this.gs() < 0L != this.gm();
   }

   public boolean go() {
      long $$0 = this.gs();
      return $$0 < (long)(this.gm() ? 40 : 52);
   }

   private boolean gR() {
      return this.gm() && this.gs() < 40L && this.gs() >= 0L;
   }

   public void gp() {
      if (!this.gm()) {
         this.a(aqn.cX, 1.0F, this.eW());
         this.b(blk.k);
         this.a(dlg.u);
         this.a(-this.dL().V());
      }
   }

   public void gq() {
      if (this.gm()) {
         this.a(aqn.cY, 1.0F, this.eW());
         this.b(blk.a);
         this.a(dlg.u);
         this.a(this.dL().V());
      }
   }

   public void gr() {
      this.b(blk.a);
      this.a(dlg.u);
      this.b(this.dL().V());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gs() {
      return this.dL().V() - Math.abs(this.an.b(bZ));
   }

   @Override
   public aqm X_() {
      return aqn.cW;
   }

   @Override
   public void a(afm<?> $$0) {
      if (!this.am && bY.equals($$0)) {
         this.cE = this.cE == 0 ? 55 : this.cE;
      }

      super.a($$0);
   }

   @Override
   public boolean gt() {
      return true;
   }

   @Override
   public void b(cdm $$0) {
      if (!this.dL().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected bqr F() {
      return new bxv.a(this);
   }

   class a extends bqr {
      public a(bxv $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bxv.this.t()) {
            super.a();
         }
      }
   }

   class b extends bqv {
      b() {
         super(bxv.this);
      }

      @Override
      public void a() {
         if (!bxv.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bqw {
      public c() {
         super(bxv.this);
      }

      @Override
      public void a() {
         if (this.k == bqw.a.b && !bxv.this.fS() && bxv.this.gm() && !bxv.this.go() && bxv.this.ge()) {
            bxv.this.gq();
         }

         super.a();
      }
   }
}
