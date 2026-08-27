import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwf extends bws implements bjt, bjy {
   public static final cmi bT = cmi.a(cjk.eA);
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
   public static final aeg<Boolean> bY = aej.a(bwf.class, aei.k);
   public static final aeg<Long> bZ = aej.a(bwf.class, aei.c);
   public final bio ca = new bio();
   public final bio cb = new bio();
   public final bio cc = new bio();
   public final bio cd = new bio();
   public final bio ce = new bio();
   private static final bit cD = bit.b(biw.l.k(), biw.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public bwf(biw<? extends bwf> $$0, cpx $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new bwf.c();
      this.bK = new bwf.b();
      bsq $$2 = (bsq)this.L();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bju.k);
      }

      this.a($$1);
   }

   public static bkn.a s() {
      return gD().a(bko.a, 32.0).a(bko.d, 0.09F).a(bko.n, 0.42F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      bwg.a(this, $$0.D_());
      this.b($$0.C().V());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bki.b<bwf> dO() {
      return bwg.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return bwg.a(this.dO().a($$0));
   }

   @Override
   public bit a(bju $$0) {
      return $$0 == bju.k ? cD.a(this.dY()) : super.a($$0);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b - 0.1F * this.dY();
   }

   @Override
   protected void X() {
      this.dL().ad().a("camelBrain");
      bki<?> $$0 = this.dN();
      ((bki<bwf>)$$0).a((aks)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("camelActivityUpdate");
      bwg.a(this);
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
            this.dL().a(null, this.dl(), apf.cS, apg.g, 1.0F, 1.0F);
         }
      }

      if (this.dL().w_()) {
         this.gP();
      }

      if (this.t()) {
         this.a(this, 30.0F);
      }

      if (this.gl() && this.aX()) {
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
      if (this.an() == bju.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void h(ehp $$0) {
      if (this.t() && this.aA()) {
         this.f(this.do().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.h($$0);
   }

   @Override
   protected void a(cbw $$0, ehp $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gl() && !this.gn()) {
         this.gp();
      }
   }

   public boolean t() {
      return this.gl() || this.gn();
   }

   @Override
   protected float e(cbw $$0) {
      float $$1 = $$0.bX() && this.aa_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bko.d) + $$1;
   }

   @Override
   protected eho j(bji $$0) {
      return this.t() ? new eho(this.dD(), this.dB()) : super.j($$0);
   }

   @Override
   protected ehp b(cbw $$0, ehp $$1) {
      return this.t() ? ehp.b : super.b($$0, $$1);
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
   protected void b(float $$0, ehp $$1) {
      double $$2 = this.b(bko.n) * (double)this.aI() + (double)this.eZ();
      this.g(this.bE().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bko.d) * (double)this.aJ()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.a(apf.cR, 1.0F, this.eW());
      this.a(djv.u);
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
   protected ape w() {
      return apf.cQ;
   }

   @Override
   protected ape l_() {
      return apf.cT;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.cV;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      if ($$1.a(apu.bo)) {
         this.a(apf.da, 1.0F, 1.0F);
      } else {
         this.a(apf.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(cjh $$0) {
      return bT.a($$0);
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$0.fH() && !this.m_()) {
         this.b($$0);
         return bha.a(this.dL().B);
      } else {
         bha $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.m_()) {
               this.f($$0);
            }

            return bha.a(this.dL().B);
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
      return this.f(this.gl() ? bju.a : bju.k);
   }

   @Override
   protected boolean a(cbw $$0, cjh $$1) {
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
            if (!this.aS()) {
               ape $$5 = this.gk();
               if ($$5 != null) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), $$5, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(djv.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gj() {
      return false;
   }

   @Override
   public boolean a(but $$0) {
      if ($$0 != this && $$0 instanceof bwf $$1 && this.gL() && $$1.gL()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bwf b(aks $$0, bin $$1) {
      return biw.l.a((cpx)$$0);
   }

   @Nullable
   @Override
   protected ape gk() {
      return apf.cU;
   }

   @Override
   protected void f(bhq $$0, float $$1) {
      this.gq();
      super.f($$0, $$1);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dG() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof but) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float dY() {
      return this.m_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bit $$2, float $$3) {
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

         float $$15 = ary.a((float)this.gr() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ary.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ary.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ehp p(float $$0) {
      bit $$1 = this.a(this.an());
      float $$2 = this.dY();
      return new ehp(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   private void a(bis $$0, float $$1) {
      float $$2 = $$0.co();
      float $$3 = ary.g(this.aU - $$2);
      float $$4 = ary.a(ary.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int Z() {
      return 30;
   }

   @Override
   protected boolean r(bis $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
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
         this.a(apf.cX, 1.0F, this.eW());
         this.b(bju.k);
         this.a(djv.u);
         this.a(-this.dL().V());
      }
   }

   public void gp() {
      if (this.gl()) {
         this.a(apf.cY, 1.0F, this.eW());
         this.b(bju.a);
         this.a(djv.u);
         this.a(this.dL().V());
      }
   }

   public void gq() {
      this.b(bju.a);
      this.a(djv.u);
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
   public ape W_() {
      return apf.cW;
   }

   @Override
   public void a(aeg<?> $$0) {
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
   public void b(cbw $$0) {
      if (!this.dL().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected bpb F() {
      return new bwf.a(this);
   }

   class a extends bpb {
      public a(bwf $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bwf.this.t()) {
            super.a();
         }
      }
   }

   class b extends bpf {
      b() {
         super(bwf.this);
      }

      @Override
      public void a() {
         if (!bwf.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bpg {
      public c() {
         super(bwf.this);
      }

      @Override
      public void a() {
         if (this.k == bpg.a.b && !bwf.this.fR() && bwf.this.gl() && !bwf.this.gn() && bwf.this.gd()) {
            bwf.this.gp();
         }

         super.a();
      }
   }
}
