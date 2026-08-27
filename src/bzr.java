import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bzr extends cae implements bmz, bne {
   public static final cqh bU = cqh.a(cnj.eV);
   public static final float bV = 0.45F;
   public static final int bX = 55;
   public static final int bY = 30;
   private static final float cx = 0.1F;
   private static final float cy = 1.4285F;
   private static final float cz = 22.2222F;
   private static final int cA = 5;
   private static final int cB = 40;
   private static final int cC = 52;
   private static final int cD = 80;
   private static final float cE = 1.43F;
   public static final agn<Boolean> bZ = agq.a(bzr.class, agp.k);
   public static final agn<Long> ca = agq.a(bzr.class, agp.c);
   public final bls cb = new bls();
   public final bls cc = new bls();
   public final bls cd = new bls();
   public final bls ce = new bls();
   public final bls cf = new bls();
   private static final blz cF = blz.b(bmc.n.k(), bmc.n.l() - 1.43F).b(0.845F);
   private int cG = 0;
   private int cH = 0;

   public bzr(bmc<? extends bzr> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bzr.c();
      this.bL = new bzr.b();
      bvx $$2 = (bvx)this.N();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.an.b(ca));
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bna.k);
      }

      this.a($$1);
   }

   public static bnt.a u() {
      return gF().a(bnu.n, 32.0).a(bnu.o, 0.09F).a(bnu.j, 0.42F).a(bnu.r, 1.5);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bZ, false);
      this.an.a(ca, 0L);
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      bzs.a(this, $$0.F_());
      this.b($$0.E().X());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bno.b<bzr> dO() {
      return bzs.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return bzs.a(this.dO().a($$0));
   }

   @Override
   public blz e(bna $$0) {
      return $$0 == bna.k ? cF.a(this.dY()) : super.e($$0);
   }

   @Override
   protected void aa() {
      this.dL().af().a("camelBrain");
      bno<?> $$0 = this.dN();
      ((bno<bzr>)$$0).a((ane)this.dL(), this);
      this.dL().af().c();
      this.dL().af().a("camelActivityUpdate");
      bzs.a(this);
      this.dL().af().c();
      super.aa();
   }

   @Override
   public void l() {
      super.l();
      if (this.A() && this.cG < 50 && (this.aC() || this.bd() || this.bO())) {
         this.w(false);
      }

      if (this.cG > 0) {
         this.cG--;
         if (this.cG == 0) {
            this.dL().a(null, this.dl(), art.dq, aru.g, 1.0F, 1.0F);
         }
      }

      if (this.dL().y_()) {
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
      if (this.cH <= 0) {
         this.cH = this.ag.a(40) + 80;
         this.ce.a(this.ah);
      } else {
         this.cH--;
      }

      if (this.go()) {
         this.cd.a();
         this.cf.a();
         if (this.gS()) {
            this.cb.b(this.ah);
            this.cc.a();
         } else {
            this.cb.a();
            this.cc.b(this.ah);
         }
      } else {
         this.cb.a();
         this.cc.a();
         this.cf.a(this.A(), this.ah);
         this.cd.a(this.gp() && this.gt() >= 0L, this.ah);
      }
   }

   @Override
   protected void u(float $$0) {
      float $$1;
      if (this.ap() == bna.a && !this.cf.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void a(emc $$0) {
      if (this.w() && this.aC()) {
         this.g(this.do().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cfq $$0, emc $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.gn() && !this.gp()) {
         this.gr();
      }
   }

   public boolean w() {
      return this.gn() || this.gp();
   }

   @Override
   protected float e(cfq $$0) {
      float $$1 = $$0.bY() && this.ad_() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bnu.o) + $$1;
   }

   @Override
   protected emb j(bmo $$0) {
      return this.w() ? new emb(this.dD(), this.dB()) : super.j($$0);
   }

   @Override
   protected emc b(cfq $$0, emc $$1) {
      return this.w() ? emc.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.w() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cG <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dE() {
      return true;
   }

   @Override
   protected void b(float $$0, emc $$1) {
      double $$2 = this.g(bnu.j) * (double)this.aK() + (double)this.fa();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bnu.o) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cG = 55;
      this.w(true);
      this.au = true;
   }

   public boolean A() {
      return this.an.b(bZ);
   }

   public void w(boolean $$0) {
      this.an.b(bZ, $$0);
   }

   @Override
   public void c(int $$0) {
      this.a(art.dp, 1.0F, this.eX());
      this.b(dnz.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ad_() {
      return this.cG;
   }

   @Override
   protected ars y() {
      return art.do;
   }

   @Override
   protected ars n_() {
      return art.dr;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.dt;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      if ($$1.a(asi.bo)) {
         this.a(art.dy, 1.0F, 1.0F);
      } else {
         this.a(art.dx, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(cng $$0) {
      return bU.a($$0);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$0.fI() && !this.o_()) {
         this.b($$0);
         return bkc.a(this.dL().B);
      } else {
         bkc $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bkc.a(this.dL().B);
         }
      }
   }

   @Override
   protected void C(float $$0) {
      if ($$0 > 6.0F && this.gn() && !this.gp() && this.gf()) {
         this.gr();
      }
   }

   public boolean gf() {
      return this.g(this.gn() ? bna.a : bna.k);
   }

   @Override
   protected boolean a(cfq $$0, cng $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.ev() < this.eM();
         if ($$2) {
            this.b(2.0F);
         }

         boolean $$3 = this.gu() && this.h() == 0 && this.gg();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dL().a(jx.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dL().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               ars $$5 = this.gm();
               if ($$5 != null) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), $$5, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
               }
            }

            this.b(dnz.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gl() {
      return false;
   }

   @Override
   public boolean a(byc $$0) {
      if ($$0 != this && $$0 instanceof bzr $$1 && this.gN() && $$1.gN()) {
         return true;
      }

      return false;
   }

   @Nullable
   public bzr b(ane $$0, blr $$1) {
      return bmc.n.a((ctx)$$0);
   }

   @Nullable
   @Override
   protected ars gm() {
      return art.ds;
   }

   @Override
   protected void f(bkv $$0, float $$1) {
      this.gs();
      super.f($$0, $$1);
   }

   @Override
   protected emc a(blw $$0, blz $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dG() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof byc) {
            $$5 += 0.2F;
         }
      }

      return new emc(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dB() * (float) (Math.PI / 180.0));
   }

   @Override
   public float dY() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, blz $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
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

         float $$15 = aup.a((float)this.gt() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)aup.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)aup.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public emc p(float $$0) {
      blz $$1 = this.a(this.ap());
      float $$2 = this.dY();
      return new emc(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   private void a(blw $$0, float $$1) {
      float $$2 = $$0.cp();
      float $$3 = aup.g(this.aU - $$2);
      float $$4 = aup.a(aup.g(this.aU - $$2), -$$1, $$1);
      float $$5 = $$2 + $$3 - $$4;
      $$0.n($$5);
   }

   @Override
   public int fH() {
      return 30;
   }

   @Override
   protected boolean q(blw $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   public boolean gn() {
      return this.an.b(ca) < 0L;
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
         this.a(art.dv, 1.0F, this.eX());
         this.b(bna.k);
         this.b(dnz.u);
         this.a(-this.dL().X());
      }
   }

   public void gr() {
      if (this.gn()) {
         this.a(art.dw, 1.0F, this.eX());
         this.b(bna.a);
         this.b(dnz.u);
         this.a(this.dL().X());
      }
   }

   public void gs() {
      this.b(bna.a);
      this.b(dnz.u);
      this.b(this.dL().X());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.an.b(ca, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gt() {
      return this.dL().X() - Math.abs(this.an.b(ca));
   }

   @Override
   public ars Z_() {
      return art.du;
   }

   @Override
   public void a(agn<?> $$0) {
      if (!this.am && bZ.equals($$0)) {
         this.cG = this.cG == 0 ? 55 : this.cG;
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return true;
   }

   @Override
   public void b(cfq $$0) {
      if (!this.dL().B) {
         $$0.a(this, this.cq);
      }
   }

   @Override
   protected bsi H() {
      return new bzr.a(this);
   }

   class a extends bsi {
      public a(bzr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bzr.this.w()) {
            super.a();
         }
      }
   }

   class b extends bsm {
      b() {
         super(bzr.this);
      }

      @Override
      public void a() {
         if (!bzr.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bsn {
      public c() {
         super(bzr.this);
      }

      @Override
      public void a() {
         if (this.k == bsn.a.b && !bzr.this.fT() && bzr.this.gn() && !bzr.this.gp() && bzr.this.gf()) {
            bzr.this.gr();
         }

         super.a();
      }
   }
}
