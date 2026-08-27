import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byu extends bzh implements bmg, bml {
   public static final cpi bT = cpi.a(cmk.eV);
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
   public static final afz<Boolean> bY = agc.a(byu.class, agb.k);
   public static final afz<Long> bZ = agc.a(byu.class, agb.c);
   public final blb ca = new blb();
   public final blb cb = new blb();
   public final blb cc = new blb();
   public final blb cd = new blb();
   public final blb ce = new blb();
   private static final blg cD = blg.b(blj.m.k(), blj.m.l() - 1.43F);
   private int cE = 0;
   private int cF = 0;

   public byu(blj<? extends byu> $$0, csy $$1) {
      super($$0, $$1);
      this.t(1.5F);
      this.bL = new byu.c();
      this.bK = new byu.b();
      bve $$2 = (bve)this.N();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(bZ));
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bmh.k);
      }

      this.a($$1);
   }

   public static bna.a u() {
      return gE().a(bnb.l, 32.0).a(bnb.m, 0.09F).a(bnb.h, 0.42F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bY, false);
      this.an.a(bZ, 0L);
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      byv.a(this, $$0.F_());
      this.b($$0.D().W());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bmv.b<byu> dP() {
      return byv.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return byv.a(this.dP().a($$0));
   }

   @Override
   public blg a(bmh $$0) {
      return $$0 == bmh.k ? cD.a(this.dZ()) : super.a($$0);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b - 0.1F * this.dZ();
   }

   @Override
   protected void Z() {
      this.dM().ae().a("camelBrain");
      bmv<?> $$0 = this.dO();
      ((bmv<byu>)$$0).a((amp)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("camelActivityUpdate");
      byv.a(this);
      this.dM().ae().c();
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
            this.dM().a(null, this.dm(), arc.db, ard.g, 1.0F, 1.0F);
         }
      }

      if (this.dM().y_()) {
         this.gQ();
      }

      if (this.w()) {
         this.a(this, 30.0F);
      }

      if (this.gm() && this.aZ()) {
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
         this.ce.a(this.A(), this.ah);
         this.cc.a(this.go() && this.gs() >= 0L, this.ah);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ap() == bmh.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void a(elb $$0) {
      if (this.w() && this.aC()) {
         this.g(this.dp().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cer $$0, elb $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gm() && !this.go()) {
         this.gq();
      }
   }

   public boolean w() {
      return this.gm() || this.go();
   }

   @Override
   protected float e(cer $$0) {
      float $$1 = $$0.bY() && this.ad_() == 0 ? 0.1F : 0.0F;
      return (float)this.b(bnb.m) + $$1;
   }

   @Override
   protected ela j(blv $$0) {
      return this.w() ? new ela(this.dE(), this.dC()) : super.j($$0);
   }

   @Override
   protected elb b(cer $$0, elb $$1) {
      return this.w() ? elb.b : super.b($$0, $$1);
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
   public boolean dF() {
      return true;
   }

   @Override
   protected void b(float $$0, elb $$1) {
      double $$2 = this.b(bnb.h) * (double)this.aK() + (double)this.fa();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.b(bnb.m) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.a(arc.da, 1.0F, this.eX());
      this.a(dmz.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ad_() {
      return this.cE;
   }

   @Override
   protected arb y() {
      return arc.cZ;
   }

   @Override
   protected arb n_() {
      return arc.dc;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.de;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      if ($$1.a(arr.bo)) {
         this.a(arc.dj, 1.0F, 1.0F);
      } else {
         this.a(arc.di, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(cmh $$0) {
      return bT.a($$0);
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$0.fI() && !this.o_()) {
         this.b($$0);
         return bjl.a(this.dM().B);
      } else {
         bjl $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bjl.a(this.dM().B);
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
      return this.f(this.gm() ? bmh.a : bmh.k);
   }

   @Override
   protected boolean a(cer $$0, cmh $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.ev() < this.eM();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gt() && this.h() == 0 && this.gf();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dM().a(jv.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dM().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               arb $$5 = this.gl();
               if ($$5 != null) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), $$5, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.a(dmz.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   public boolean a(bxi $$0) {
      if ($$0 != this && $$0 instanceof byu $$1 && this.gM() && $$1.gM()) {
         return true;
      }

      return false;
   }

   @Nullable
   public byu b(amp $$0, bla $$1) {
      return blj.m.a((csy)$$0);
   }

   @Nullable
   @Override
   protected arb gl() {
      return arc.dd;
   }

   @Override
   protected void f(bkd $$0, float $$1) {
      this.gr();
      super.f($$0, $$1);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dH() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bxi) {
            $$5 += 0.2F;
         }
      }

      return new Vector3f(0.0F, $$6, $$5 * $$2);
   }

   @Override
   public float dZ() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, blg $$2, float $$3) {
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

         float $$15 = aty.a((float)this.gs() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)aty.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)aty.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public elb p(float $$0) {
      blg $$1 = this.a(this.ap());
      float $$2 = this.dZ();
      return new elb(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a * 0.56F));
   }

   private void a(blf $$0, float $$1) {
      float $$2 = $$0.cp();
      float $$3 = aty.g(this.aU - $$2);
      float $$4 = aty.a(aty.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(blf $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
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
         this.a(arc.dg, 1.0F, this.eX());
         this.b(bmh.k);
         this.a(dmz.u);
         this.a(-this.dM().W());
      }
   }

   public void gq() {
      if (this.gm()) {
         this.a(arc.dh, 1.0F, this.eX());
         this.b(bmh.a);
         this.a(dmz.u);
         this.a(this.dM().W());
      }
   }

   public void gr() {
      this.b(bmh.a);
      this.a(dmz.u);
      this.b(this.dM().W());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gs() {
      return this.dM().W() - Math.abs(this.an.b(bZ));
   }

   @Override
   public arb Z_() {
      return arc.df;
   }

   @Override
   public void a(afz<?> $$0) {
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
   public void b(cer $$0) {
      if (!this.dM().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected brp H() {
      return new byu.a(this);
   }

   class a extends brp {
      public a(byu $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!byu.this.w()) {
            super.a();
         }
      }
   }

   class b extends brt {
      b() {
         super(byu.this);
      }

      @Override
      public void a() {
         if (!byu.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bru {
      public c() {
         super(byu.this);
      }

      @Override
      public void a() {
         if (this.k == bru.a.b && !byu.this.fS() && byu.this.gm() && !byu.this.go() && byu.this.ge()) {
            byu.this.gq();
         }

         super.a();
      }
   }
}
