import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwd extends bwq implements bjr, bjw {
   public static final cmg bT = cmg.a(cji.eA);
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
   public static final aef<Boolean> bY = aei.a(bwd.class, aeh.k);
   public static final aef<Long> bZ = aei.a(bwd.class, aeh.c);
   public final bim ca = new bim();
   public final bim cb = new bim();
   public final bim cc = new bim();
   public final bim cd = new bim();
   public final bim ce = new bim();
   private static final bir cD = bir.b(biu.l.k(), biu.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public bwd(biu<? extends bwd> $$0, cpv $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new bwd.c();
      this.bK = new bwd.b();
      bso $$2 = (bso)this.L();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bjs.k);
      }

      this.a($$1);
   }

   public static bkl.a s() {
      return gD().a(bkm.a, 32.0).a(bkm.d, 0.09F).a(bkm.n, 0.42F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      bwe.a(this, $$0.D_());
      this.b($$0.C().V());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bkg.b<bwd> dO() {
      return bwe.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return bwe.a(this.dO().a($$0));
   }

   @Override
   public bir a(bjs $$0) {
      return $$0 == bjs.k ? cD.a(this.dY()) : super.a($$0);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b - 0.1F * this.dY();
   }

   @Override
   protected void Y() {
      this.dL().ad().a("camelBrain");
      bkg<?> $$0 = this.dN();
      ((bkg<bwd>)$$0).a((akr)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("camelActivityUpdate");
      bwe.a(this);
      this.dL().ad().c();
      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cE < 50 && (this.aB() || this.bc() || this.bO())) {
         this.w(false);
      }

      if (this.cE > 0) {
         this.cE--;
         if (this.cE == 0) {
            this.dL().a(null, this.dl(), ape.cS, apf.g, 1.0F, 1.0F);
         }
      }

      if (this.dL().w_()) {
         this.gP();
      }

      if (this.t()) {
         this.a(this, 30.0F);
      }

      if (this.gl() && this.aY()) {
         this.gq();
      }
   }

   private void gP() {
      if (this.cF <= 0) {
         this.cF = this.ag.a(40) + 80;
         this.cd.a(this.ah);
      } else {
         this.cF--;
      }

      if (this.gm()) {
         this.cc.a();
         this.ce.a();
         if (this.gQ()) {
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
         this.cc.a(this.gn() && this.gr() >= 0L, this.ah);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ao() == bjs.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void h(ehn $$0) {
      if (this.t() && this.aB()) {
         this.f(this.do().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.h($$0);
   }

   @Override
   protected void a(cbu $$0, ehn $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gl() && !this.gn()) {
         this.gp();
      }
   }

   public boolean t() {
      return this.gl() || this.gn();
   }

   @Override
   protected float e(cbu $$0) {
      float $$1 = $$0.bY() && this.aa_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bkm.d) + $$1;
   }

   @Override
   protected ehm j(bjg $$0) {
      return this.t() ? new ehm(this.dD(), this.dB()) : super.j($$0);
   }

   @Override
   protected ehn b(cbu $$0, ehn $$1) {
      return this.t() ? ehn.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cE <= 0 && this.aB()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dE() {
      return true;
   }

   @Override
   protected void b(float $$0, ehn $$1) {
      double $$2 = this.b(bkm.n) * (double)this.aJ() + (double)this.eZ();
      this.g(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bkm.d) * (double)this.aK()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.a(ape.cR, 1.0F, this.eW());
      this.a(djt.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int aa_() {
      return this.cE;
   }

   @Override
   protected apd w() {
      return ape.cQ;
   }

   @Override
   protected apd l_() {
      return ape.cT;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.cV;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      if ($$1.a(apt.bo)) {
         this.a(ape.da, 1.0F, 1.0F);
      } else {
         this.a(ape.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(cjf $$0) {
      return bT.a($$0);
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$0.fH() && !this.m_()) {
         this.b($$0);
         return bgy.a(this.dL().B);
      } else {
         bgy $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cQ().size() < 2 && !this.m_()) {
               this.f($$0);
            }

            return bgy.a(this.dL().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gl() && !this.gn() && this.gd()) {
         this.gp();
      }
   }

   public boolean gd() {
      return this.f(this.gl() ? bjs.a : bjs.k);
   }

   @Override
   protected boolean a(cbu $$0, cjf $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.eu() < this.eL();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gs() && this.h() == 0 && this.ge();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.m_();
         if ($$4) {
            this.dL().a(ix.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dL().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aT()) {
               apd $$5 = this.gk();
               if ($$5 != null) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), $$5, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(djt.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gj() {
      return false;
   }

   @Override
   public boolean a(bur $$0) {
      if ($$0 != this && $$0 instanceof bwd $$1 && this.gL() && $$1.gL()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bwd b(akr $$0, bil $$1) {
      return biu.l.a((cpv)$$0);
   }

   @Nullable
   @Override
   protected apd gk() {
      return ape.cU;
   }

   @Override
   protected void f(bho $$0, float $$1) {
      this.gq();
      super.f($$0, $$1);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      int $$3 = Math.max(this.cQ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dG() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cQ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bur) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float dY() {
      return this.m_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bir $$2, float $$3) {
      double $$4 = (double)($$2.b - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gn();
      boolean $$9 = this.gl();
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

         float $$15 = arx.a((float)this.gr() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)arx.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)arx.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ehn p(float $$0) {
      bir $$1 = this.a(this.ao());
      float $$2 = this.dY();
      return new ehn(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   private void a(biq $$0, float $$1) {
      float $$2 = $$0.cp();
      float $$3 = arx.g(this.aU - $$2);
      float $$4 = arx.a(arx.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(biq $$0) {
      return this.cQ().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }

   public boolean gl() {
      return this.an.b(bZ) < 0L;
   }

   public boolean gm() {
      return this.gr() < 0L != this.gl();
   }

   public boolean gn() {
      long $$0 = this.gr();
      return $$0 < (long)(this.gl() ? 40 : 52);
   }

   private boolean gQ() {
      return this.gl() && this.gr() < 40L && this.gr() >= 0L;
   }

   public void go() {
      if (!this.gl()) {
         this.a(ape.cX, 1.0F, this.eW());
         this.b(bjs.k);
         this.a(djt.u);
         this.a(-this.dL().V());
      }
   }

   public void gp() {
      if (this.gl()) {
         this.a(ape.cY, 1.0F, this.eW());
         this.b(bjs.a);
         this.a(djt.u);
         this.a(this.dL().V());
      }
   }

   public void gq() {
      this.b(bjs.a);
      this.a(djt.u);
      this.b(this.dL().V());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gr() {
      return this.dL().V() - Math.abs(this.an.b(bZ));
   }

   @Override
   public apd W_() {
      return ape.cW;
   }

   @Override
   public void a(aef<?> $$0) {
      if (!this.am && bY.equals($$0)) {
         this.cE = this.cE == 0 ? 55 : this.cE;
      }

      super.a($$0);
   }

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void b(cbu $$0) {
      if (!this.dL().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected boz F() {
      return new bwd.a(this);
   }

   class a extends boz {
      public a(bwd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bwd.this.t()) {
            super.a();
         }
      }
   }

   class b extends bpd {
      b() {
         super(bwd.this);
      }

      @Override
      public void a() {
         if (!bwd.this.cP()) {
            super.a();
         }
      }
   }

   class c extends bpe {
      public c() {
         super(bwd.this);
      }

      @Override
      public void a() {
         if (this.k == bpe.a.b && !bwd.this.fR() && bwd.this.gl() && !bwd.this.gn() && bwd.this.gd()) {
            bwd.this.gp();
         }

         super.a();
      }
   }
}
