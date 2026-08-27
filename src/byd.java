import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byd extends byq implements blr, blw {
   public static final cok bT = cok.a(clm.eV);
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
   public static final afo<Boolean> bY = afr.a(byd.class, afq.k);
   public static final afo<Long> bZ = afr.a(byd.class, afq.c);
   public final bkm ca = new bkm();
   public final bkm cb = new bkm();
   public final bkm cc = new bkm();
   public final bkm cd = new bkm();
   public final bkm ce = new bkm();
   private static final bkr cD = bkr.b(bku.l.k(), bku.l.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public byd(bku<? extends byd> $$0, csa $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new byd.c();
      this.bK = new byd.b();
      buo $$2 = (buo)this.N();
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
         this.b(bls.k);
      }

      this.a($$1);
   }

   public static bml.a u() {
      return gF().a(bmm.l, 32.0).a(bmm.m, 0.09F).a(bmm.h, 0.42F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      bye.a(this, $$0.E_());
      this.b($$0.D().W());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bmg.b<byd> dQ() {
      return bye.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return bye.a(this.dQ().a($$0));
   }

   @Override
   public bkr a(bls $$0) {
      return $$0 == bls.k ? cD.a(this.ea()) : super.a($$0);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b - 0.1F * this.ea();
   }

   @Override
   protected void Z() {
      this.dN().ae().a("camelBrain");
      bmg<?> $$0 = this.dP();
      ((bmg<byd>)$$0).a((ame)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("camelActivityUpdate");
      bye.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.A() && this.cE < 50 && (this.aC() || this.bd() || this.bO())) {
         this.w(false);
      }

      if (this.cE > 0) {
         this.cE--;
         if (this.cE == 0) {
            this.dN().a(null, this.dn(), aqr.cS, aqs.g, 1.0F, 1.0F);
         }
      }

      if (this.dN().x_()) {
         this.gR();
      }

      if (this.w()) {
         this.a(this, 30.0F);
      }

      if (this.gn() && this.aZ()) {
         this.gs();
      }
   }

   private void gR() {
      if (this.cF <= 0) {
         this.cF = this.ag.a(40) + 80;
         this.cd.a(this.ah);
      } else {
         this.cF--;
      }

      if (this.go()) {
         this.cc.a();
         this.ce.a();
         if (this.gS()) {
            this.ca.b(this.ah);
            this.cb.a();
         } else {
            this.ca.a();
            this.cb.b(this.ah);
         }
      } else {
         this.ca.a();
         this.cb.a();
         this.ce.a(this.A(), this.ah);
         this.cc.a(this.gp() && this.gt() >= 0L, this.ah);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ap() == bls.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void a(eju $$0) {
      if (this.w() && this.aC()) {
         this.g(this.dq().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cdu $$0, eju $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gn() && !this.gp()) {
         this.gr();
      }
   }

   public boolean w() {
      return this.gn() || this.gp();
   }

   @Override
   protected float e(cdu $$0) {
      float $$1 = $$0.bY() && this.ac_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bmm.m) + $$1;
   }

   @Override
   protected ejt j(blg $$0) {
      return this.w() ? new ejt(this.dF(), this.dD()) : super.j($$0);
   }

   @Override
   protected eju b(cdu $$0, eju $$1) {
      return this.w() ? eju.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.w() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cE <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dG() {
      return true;
   }

   @Override
   protected void b(float $$0, eju $$1) {
      double $$2 = this.b(bmm.h) * (double)this.aK() + (double)this.fb();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bmm.m) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cE = 55;
      this.w(true);
      this.au = true;
   }

   public boolean A() {
      return this.an.b(bY);
   }

   public void w(boolean $$0) {
      this.an.b(bY, $$0);
   }

   @Override
   public void c(int $$0) {
      this.a(aqr.cR, 1.0F, this.eY());
      this.a(dls.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ac_() {
      return this.cE;
   }

   @Override
   protected aqq y() {
      return aqr.cQ;
   }

   @Override
   protected aqq m_() {
      return aqr.cT;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.cV;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      if ($$1.a(arg.bo)) {
         this.a(aqr.da, 1.0F, 1.0F);
      } else {
         this.a(aqr.cZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(clj $$0) {
      return bT.a($$0);
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$0.fJ() && !this.n_()) {
         this.b($$0);
         return bix.a(this.dN().B);
      } else {
         bix $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cQ().size() < 2 && !this.n_()) {
               this.f($$0);
            }

            return bix.a(this.dN().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gn() && !this.gp() && this.gf()) {
         this.gr();
      }
   }

   public boolean gf() {
      return this.f(this.gn() ? bls.a : bls.k);
   }

   @Override
   protected boolean a(cdu $$0, clj $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.ew() < this.eN();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gu() && this.h() == 0 && this.gg();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.n_();
         if ($$4) {
            this.dN().a(js.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dN().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               aqq $$5 = this.gm();
               if ($$5 != null) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), $$5, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(dls.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gl() {
      return false;
   }

   @Override
   public boolean a(bwr $$0) {
      if ($$0 != this && $$0 instanceof byd $$1 && this.gN() && $$1.gN()) {
         return true;
      }

      return false;
   }

   @Nullable
   public byd b(ame $$0, bkl $$1) {
      return bku.l.a((csa)$$0);
   }

   @Nullable
   @Override
   protected aqq gm() {
      return aqr.cU;
   }

   @Override
   protected void f(bjo $$0, float $$1) {
      this.gs();
      super.f($$0, $$1);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      int $$3 = Math.max(this.cQ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dI() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cQ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bwr) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float ea() {
      return this.n_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bkr $$2, float $$3) {
      double $$4 = (double)($$2.b - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gp();
      boolean $$9 = this.gn();
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

         float $$15 = atm.a((float)this.gt() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)atm.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)atm.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eju p(float $$0) {
      bkr $$1 = this.a(this.ap());
      float $$2 = this.ea();
      return new eju(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   private void a(bkq $$0, float $$1) {
      float $$2 = $$0.cp();
      float $$3 = atm.g(this.aU - $$2);
      float $$4 = atm.a(atm.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bkq $$0) {
      return this.cQ().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   public boolean gn() {
      return this.an.b(bZ) < 0L;
   }

   public boolean go() {
      return this.gt() < 0L != this.gn();
   }

   public boolean gp() {
      long $$0 = this.gt();
      return $$0 < (long)(this.gn() ? 40 : 52);
   }

   private boolean gS() {
      return this.gn() && this.gt() < 40L && this.gt() >= 0L;
   }

   public void gq() {
      if (!this.gn()) {
         this.a(aqr.cX, 1.0F, this.eY());
         this.b(bls.k);
         this.a(dls.u);
         this.a(-this.dN().W());
      }
   }

   public void gr() {
      if (this.gn()) {
         this.a(aqr.cY, 1.0F, this.eY());
         this.b(bls.a);
         this.a(dls.u);
         this.a(this.dN().W());
      }
   }

   public void gs() {
      this.b(bls.a);
      this.a(dls.u);
      this.b(this.dN().W());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gt() {
      return this.dN().W() - Math.abs(this.an.b(bZ));
   }

   @Override
   public aqq Y_() {
      return aqr.cW;
   }

   @Override
   public void a(afo<?> $$0) {
      if (!this.am && bY.equals($$0)) {
         this.cE = this.cE == 0 ? 55 : this.cE;
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return true;
   }

   @Override
   public void b(cdu $$0) {
      if (!this.dN().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected bqz H() {
      return new byd.a(this);
   }

   class a extends bqz {
      public a(byd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!byd.this.w()) {
            super.a();
         }
      }
   }

   class b extends brd {
      b() {
         super(byd.this);
      }

      @Override
      public void a() {
         if (!byd.this.cP()) {
            super.a();
         }
      }
   }

   class c extends bre {
      public c() {
         super(byd.this);
      }

      @Override
      public void a() {
         if (this.k == bre.a.b && !byd.this.fT() && byd.this.gn() && !byd.this.gp() && byd.this.gf()) {
            byd.this.gr();
         }

         super.a();
      }
   }
}
