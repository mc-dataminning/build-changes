import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cbi extends cbv implements boq, bov {
   public static final cry bT = cry.a(cpc.eV);
   public static final float bU = 0.45F;
   public static final int bW = 55;
   public static final int bX = 30;
   private static final float cw = 0.1F;
   private static final float cx = 1.4285F;
   private static final float cy = 22.2222F;
   private static final int cz = 5;
   private static final int cA = 40;
   private static final int cB = 52;
   private static final int cC = 80;
   private static final float cD = 1.43F;
   public static final aie<Boolean> bY = aih.a(cbi.class, aig.k);
   public static final aie<Long> bZ = aih.a(cbi.class, aig.c);
   public final bnk ca = new bnk();
   public final bnk cb = new bnk();
   public final bnk cc = new bnk();
   public final bnk cd = new bnk();
   public final bnk ce = new bnk();
   private static final bnr cE = bnr.b(bnu.n.k(), bnu.n.l() - 1.43F).b(0.845F);
   private int cF = 0;
   private int cG = 0;

   public cbi(bnu<? extends cbi> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new cbi.c();
      this.bK = new cbi.b();
      bxo $$2 = (bxo)this.N();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.b(bZ));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bor.k);
      }

      this.a($$1);
   }

   public static bpk.a u() {
      return gG().a(bpl.n, 32.0).a(bpl.o, 0.09F).a(bpl.j, 0.42F).a(bpl.r, 1.5);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bY, false);
      this.am.a(bZ, 0L);
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      cbj.a(this, $$0.F_());
      this.b($$0.E().X());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpf.b<cbi> dP() {
      return cbj.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cbj.a(this.dP().a($$0));
   }

   @Override
   public bnr e(bor $$0) {
      return $$0 == bor.k ? cE.a(this.dZ()) : super.e($$0);
   }

   @Override
   protected void aa() {
      this.dM().af().a("camelBrain");
      bpf<?> $$0 = this.dO();
      ((bpf<cbi>)$$0).a((aov)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("camelActivityUpdate");
      cbj.a(this);
      this.dM().af().c();
      super.aa();
   }

   @Override
   public void l() {
      super.l();
      if (this.A() && this.cF < 50 && (this.aC() || this.bd() || this.bO())) {
         this.w(false);
      }

      if (this.cF > 0) {
         this.cF--;
         if (this.cF == 0) {
            this.dM().a(null, this.dm(), atk.dq, atl.g, 1.0F, 1.0F);
         }
      }

      if (this.dM().y_()) {
         this.gS();
      }

      if (this.w()) {
         this.fI();
      }

      if (this.go() && this.aZ()) {
         this.gt();
      }
   }

   private void gS() {
      if (this.cG <= 0) {
         this.cG = this.af.a(40) + 80;
         this.cd.a(this.ag);
      } else {
         this.cG--;
      }

      if (this.gp()) {
         this.cc.a();
         this.ce.a();
         if (this.gT()) {
            this.ca.b(this.ag);
            this.cb.a();
         } else {
            this.ca.a();
            this.cb.b(this.ag);
         }
      } else {
         this.ca.a();
         this.cb.a();
         this.ce.a(this.A(), this.ag);
         this.cc.a(this.gq() && this.gu() >= 0L, this.ag);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ap() == bor.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void a(ens $$0) {
      if (this.w() && this.aC()) {
         this.g(this.dp().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(chh $$0, ens $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.go() && !this.gq()) {
         this.gs();
      }
   }

   public boolean w() {
      return this.go() || this.gq();
   }

   @Override
   protected float e(chh $$0) {
      float $$1 = $$0.bY() && this.ad_() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bpl.o) + $$1;
   }

   @Override
   protected enr j(bog $$0) {
      return this.w() ? new enr(this.dE(), this.dC()) : super.j($$0);
   }

   @Override
   protected ens b(chh $$0, ens $$1) {
      return this.w() ? ens.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.w() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cF <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected void b(float $$0, ens $$1) {
      double $$2 = this.g(bpl.j) * (double)this.aK() + (double)this.fa();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bpl.o) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cF = 55;
      this.w(true);
      this.at = true;
   }

   public boolean A() {
      return this.am.b(bY);
   }

   public void w(boolean $$0) {
      this.am.b(bY, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(atk.dp);
      this.b(dpp.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ad_() {
      return this.cF;
   }

   @Override
   protected atj y() {
      return atk.do;
   }

   @Override
   protected atj n_() {
      return atk.dr;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.dt;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      if ($$1.a(atz.bo)) {
         this.a(atk.dy, 1.0F, 1.0F);
      } else {
         this.a(atk.dx, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(coz $$0) {
      return bT.a($$0);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$0.fI() && !this.o_()) {
         this.b($$0);
         return blu.a(this.dM().B);
      } else {
         blu $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return blu.a(this.dM().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.go() && !this.gq() && this.gg()) {
         this.gs();
      }
   }

   public boolean gg() {
      return this.g(this.go() ? bor.a : bor.k);
   }

   @Override
   protected boolean a(chh $$0, coz $$1) {
      if (!this.m($$1)) {
         return false;
      } else {
         boolean $$2 = this.ew() < this.eN();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gv() && this.h() == 0 && this.gh();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dM().a(jz.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dM().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               atj $$5 = this.gn();
               if ($$5 != null) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), $$5, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.b(dpp.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   public boolean a(bzt $$0) {
      if ($$0 != this && $$0 instanceof cbi $$1 && this.gO() && $$1.gO()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cbi b(aov $$0, bnj $$1) {
      return bnu.n.a((cvn)$$0);
   }

   @Nullable
   @Override
   protected atj gn() {
      return atk.ds;
   }

   @Override
   protected void f(bmn $$0, float $$1) {
      this.gt();
      super.f($$0, $$1);
   }

   @Override
   protected ens a(bno $$0, bnr $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dH() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bzt) {
            $$5 += 0.2F;
         }
      }

      return new ens(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dC() * (float) (Math.PI / 180.0));
   }

   @Override
   public float dZ() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bnr $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gq();
      boolean $$9 = this.go();
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

         float $$15 = awh.a((float)this.gu() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)awh.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)awh.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ens p(float $$0) {
      bnr $$1 = this.a(this.ap());
      float $$2 = this.dZ();
      return new ens(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int fH() {
      return 30;
   }

   @Override
   protected boolean q(bno $$0) {
      return this.cP().size() <= 2;
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   public boolean go() {
      return this.am.b(bZ) < 0L;
   }

   public boolean gp() {
      return this.gu() < 0L != this.go();
   }

   public boolean gq() {
      long $$0 = this.gu();
      return $$0 < (long)(this.go() ? 40 : 52);
   }

   private boolean gT() {
      return this.go() && this.gu() < 40L && this.gu() >= 0L;
   }

   public void gr() {
      if (!this.go()) {
         this.b(atk.dv);
         this.b(bor.k);
         this.b(dpp.u);
         this.a(-this.dM().X());
      }
   }

   public void gs() {
      if (this.go()) {
         this.b(atk.dw);
         this.b(bor.a);
         this.b(dpp.u);
         this.a(this.dM().X());
      }
   }

   public void gt() {
      this.b(bor.a);
      this.b(dpp.u);
      this.b(this.dM().X());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.am.b(bZ, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gu() {
      return this.dM().X() - Math.abs(this.am.b(bZ));
   }

   @Override
   public atj Z_() {
      return atk.du;
   }

   @Override
   public void a(aie<?> $$0) {
      if (!this.al && bY.equals($$0)) {
         this.cF = this.cF == 0 ? 55 : this.cF;
      }

      super.a($$0);
   }

   @Override
   public boolean gv() {
      return true;
   }

   @Override
   public void b(chh $$0) {
      if (!this.dM().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected btz H() {
      return new cbi.a(this);
   }

   class a extends btz {
      public a(cbi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cbi.this.w()) {
            super.a();
         }
      }
   }

   class b extends bud {
      b() {
         super(cbi.this);
      }

      @Override
      public void a() {
         if (!cbi.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bue {
      public c() {
         super(cbi.this);
      }

      @Override
      public void a() {
         if (this.k == bue.a.b && !cbi.this.fU() && cbi.this.go() && !cbi.this.gq() && cbi.this.gg()) {
            cbi.this.gs();
         }

         super.a();
      }
   }
}
