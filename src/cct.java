import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cct extends cdg implements bpz, bqe {
   public static final ctm bX = ctm.a(cqp.eV);
   public static final float bY = 0.45F;
   public static final int ca = 55;
   public static final int cb = 30;
   private static final float cz = 0.1F;
   private static final float cA = 1.4285F;
   private static final float cB = 22.2222F;
   private static final int cC = 5;
   private static final int cD = 40;
   private static final int cE = 52;
   private static final int cF = 80;
   private static final float cG = 1.43F;
   public static final aim<Boolean> cc = aiq.a(cct.class, aio.k);
   public static final aim<Long> cd = aiq.a(cct.class, aio.c);
   public final bot ce = new bot();
   public final bot cf = new bot();
   public final bot cg = new bot();
   public final bot ch = new bot();
   public final bot ci = new bot();
   private static final bpa cH = bpa.b(bpd.p.k(), bpd.p.l() - 1.43F).b(0.845F);
   private int cI = 0;
   private int cJ = 0;

   public cct(bpd<? extends cct> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new cct.c();
      this.bN = new cct.b();
      byz $$2 = (byz)this.K();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.a(cd));
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bqa.k);
      }

      this.a($$1);
   }

   public static bqv.a r() {
      return gM().a(bqw.q, 32.0).a(bqw.r, 0.09F).a(bqw.m, 0.42F).a(bqw.v, 1.5);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      ccu.a(this, $$0.E_());
      this.b($$0.E().X());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqq.b<cct> dQ() {
      return ccu.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return ccu.a(this.dQ().a($$0));
   }

   @Override
   public bpa e(bqa $$0) {
      return $$0 == bqa.k ? cH.a(this.ea()) : super.e($$0);
   }

   @Override
   protected void Y() {
      this.dM().ae().a("camelBrain");
      bqq<?> $$0 = this.dP();
      ((bqq<cct>)$$0).a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("camelActivityUpdate");
      ccu.a(this);
      this.dM().ae().c();
      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y() && this.cI < 50 && (this.aC() || this.bg() || this.bO())) {
         this.w(false);
      }

      if (this.cI > 0) {
         this.cI--;
         if (this.cI == 0) {
            this.dM().a(null, this.dm(), aty.dy, atz.g, 1.0F, 1.0F);
         }
      }

      if (this.dM().x_()) {
         this.gX();
      }

      if (this.s()) {
         this.ab();
      }

      if (this.gv() && this.bc()) {
         this.gA();
      }
   }

   private void gX() {
      if (this.cJ <= 0) {
         this.cJ = this.ag.a(40) + 80;
         this.ch.a(this.ah);
      } else {
         this.cJ--;
      }

      if (this.gw()) {
         this.cg.a();
         this.ci.a();
         if (this.gY()) {
            this.ce.b(this.ah);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.ah);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.y(), this.ah);
         this.cg.a(this.gx() && this.gB() >= 0L, this.ah);
      }
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.ap() == bqa.a && !this.ci.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aT.a($$1, 0.2F);
   }

   @Override
   public void a(ept $$0) {
      if (this.s() && this.aC()) {
         this.g(this.dp().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(ciu $$0, ept $$1) {
      super.a($$0, $$1);
      if ($$0.bp > 0.0F && this.gv() && !this.gx()) {
         this.gz();
      }
   }

   public boolean s() {
      return this.gv() || this.gx();
   }

   @Override
   protected float e(ciu $$0) {
      float $$1 = $$0.bY() && this.ab_() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bqw.r) + $$1;
   }

   @Override
   protected eps j(bpp $$0) {
      return this.s() ? new eps(this.dE(), this.dC()) : super.j($$0);
   }

   @Override
   protected ept b(ciu $$0, ept $$1) {
      return this.s() ? ept.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.s() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cI <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected void b(float $$0, ept $$1) {
      double $$2 = (double)this.fe();
      this.h(this.bI().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bqw.r) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cI = 55;
      this.w(true);
      this.au = true;
   }

   public boolean y() {
      return this.an.a(cc);
   }

   public void w(boolean $$0) {
      this.an.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(aty.dx);
      this.b(drp.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ab_() {
      return this.cI;
   }

   @Override
   protected atx v() {
      return aty.dw;
   }

   @Override
   protected atx n_() {
      return aty.dz;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.dB;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      if ($$1.a(aun.bp)) {
         this.a(aty.dG, 1.0F, 1.0F);
      } else {
         this.a(aty.dF, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cqm $$0) {
      return bX.a($$0);
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$0.fO() && !this.o_()) {
         this.b($$0);
         return bnd.a(this.dM().B);
      } else {
         bnd $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bnd.a(this.dM().B);
         }
      }
   }

   @Override
   protected void F(float $$0) {
      if ($$0 > 6.0F && this.gv() && !this.gx() && this.gn()) {
         this.gz();
      }
   }

   public boolean gn() {
      return this.g(this.gv() ? bqa.a : bqa.k);
   }

   @Override
   protected boolean a(ciu $$0, cqm $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ex() < this.eO();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gC() && this.g() == 0 && this.go();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dM().a(kc.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dM().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               atx $$5 = this.gu();
               if ($$5 != null) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), $$5, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.b(drp.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean a(cbe $$0) {
      if ($$0 != this && $$0 instanceof cct $$1 && this.gU() && $$1.gU()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cct b(apf $$0, bos $$1) {
      return bpd.p.a((cxb)$$0);
   }

   @Nullable
   @Override
   protected atx gu() {
      return aty.dA;
   }

   @Override
   protected void f(bnw $$0, float $$1) {
      this.gA();
      super.f($$0, $$1);
   }

   @Override
   protected ept a(box $$0, bpa $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dH() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cbe) {
            $$5 += 0.2F;
         }
      }

      return new ept(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dC() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ea() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bpa $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gx();
      boolean $$9 = this.gv();
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

         float $$15 = aww.a((float)this.gB() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)aww.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)aww.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ept p(float $$0) {
      bpa $$1 = this.a(this.ap());
      float $$2 = this.ea();
      return new ept(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(box $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   public boolean gv() {
      return this.an.a(cd) < 0L;
   }

   public boolean gw() {
      return this.gB() < 0L != this.gv();
   }

   public boolean gx() {
      long $$0 = this.gB();
      return $$0 < (long)(this.gv() ? 40 : 52);
   }

   private boolean gY() {
      return this.gv() && this.gB() < 40L && this.gB() >= 0L;
   }

   public void gy() {
      if (!this.gv()) {
         this.b(aty.dD);
         this.b(bqa.k);
         this.b(drp.u);
         this.a(-this.dM().X());
      }
   }

   public void gz() {
      if (this.gv()) {
         this.b(aty.dE);
         this.b(bqa.a);
         this.b(drp.u);
         this.a(this.dM().X());
      }
   }

   public void gA() {
      this.b(bqa.a);
      this.b(drp.u);
      this.b(this.dM().X());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gB() {
      return this.dM().X() - Math.abs(this.an.a(cd));
   }

   @Override
   public atx X_() {
      return aty.dC;
   }

   @Override
   public void a(aim<?> $$0) {
      if (!this.am && cc.equals($$0)) {
         this.cI = this.cI == 0 ? 55 : this.cI;
      }

      super.a($$0);
   }

   @Override
   public boolean gC() {
      return true;
   }

   @Override
   public void b(ciu $$0) {
      if (!this.dM().B) {
         $$0.a(this, this.cs);
      }
   }

   @Override
   protected bvk E() {
      return new cct.a(this);
   }

   class a extends bvk {
      public a(cct $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cct.this.s()) {
            super.a();
         }
      }
   }

   class b extends bvo {
      b() {
         super(cct.this);
      }

      @Override
      public void a() {
         if (!cct.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bvp {
      public c() {
         super(cct.this);
      }

      @Override
      public void a() {
         if (this.k == bvp.a.b && !cct.this.gb() && cct.this.gv() && !cct.this.gx() && cct.this.gn()) {
            cct.this.gz();
         }

         super.a();
      }
   }
}
