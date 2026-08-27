import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cbm extends cbz implements bos, box {
   public static final csc bT = csc.a(cpg.eV);
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
   public static final aie<Boolean> bY = aih.a(cbm.class, aig.k);
   public static final aie<Long> bZ = aih.a(cbm.class, aig.c);
   public final bnm ca = new bnm();
   public final bnm cb = new bnm();
   public final bnm cc = new bnm();
   public final bnm cd = new bnm();
   public final bnm ce = new bnm();
   private static final bnt cE = bnt.b(bnw.n.k(), bnw.n.l() - 1.43F).b(0.845F);
   private int cF = 0;
   private int cG = 0;

   public cbm(bnw<? extends cbm> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new cbm.c();
      this.bK = new cbm.b();
      bxs $$2 = (bxs)this.N();
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
         this.b(bot.k);
      }

      this.a($$1);
   }

   public static bpo.a u() {
      return gG().a(bpp.n, 32.0).a(bpp.o, 0.09F).a(bpp.j, 0.42F).a(bpp.r, 1.5);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bY, false);
      this.am.a(bZ, 0L);
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      cbn.a(this, $$0.F_());
      this.b($$0.E().X());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpj.b<cbm> dP() {
      return cbn.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cbn.a(this.dP().a($$0));
   }

   @Override
   public bnt e(bot $$0) {
      return $$0 == bot.k ? cE.a(this.dZ()) : super.e($$0);
   }

   @Override
   protected void aa() {
      this.dM().ae().a("camelBrain");
      bpj<?> $$0 = this.dO();
      ((bpj<cbm>)$$0).a((aow)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("camelActivityUpdate");
      cbn.a(this);
      this.dM().ae().c();
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
            this.dM().a(null, this.dm(), atl.dr, atm.g, 1.0F, 1.0F);
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
      if (this.ap() == bot.a && !this.ce.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aQ.a($$1, 0.2F);
   }

   @Override
   public void a(enz $$0) {
      if (this.w() && this.aC()) {
         this.g(this.dp().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(chl $$0, enz $$1) {
      super.a($$0, $$1);
      if ($$0.bm > 0.0F && this.go() && !this.gq()) {
         this.gs();
      }
   }

   public boolean w() {
      return this.go() || this.gq();
   }

   @Override
   protected float e(chl $$0) {
      float $$1 = $$0.bY() && this.ad_() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bpp.o) + $$1;
   }

   @Override
   protected eny j(boi $$0) {
      return this.w() ? new eny(this.dE(), this.dC()) : super.j($$0);
   }

   @Override
   protected enz b(chl $$0, enz $$1) {
      return this.w() ? enz.b : super.b($$0, $$1);
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
   protected void b(float $$0, enz $$1) {
      double $$2 = this.g(bpp.j) * (double)this.aK() + (double)this.fa();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bpp.o) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(atl.dq);
      this.b(dpw.u);
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
   protected atk y() {
      return atl.dp;
   }

   @Override
   protected atk n_() {
      return atl.ds;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.du;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      if ($$1.a(aua.bo)) {
         this.a(atl.dz, 1.0F, 1.0F);
      } else {
         this.a(atl.dy, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean m(cpd $$0) {
      return bT.a($$0);
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$0.fI() && !this.o_()) {
         this.b($$0);
         return blw.a(this.dM().B);
      } else {
         blw $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.m($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cP().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return blw.a(this.dM().B);
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
      return this.g(this.go() ? bot.a : bot.k);
   }

   @Override
   protected boolean a(chl $$0, cpd $$1) {
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
               atk $$5 = this.gn();
               if ($$5 != null) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), $$5, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.b(dpw.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   public boolean a(bzx $$0) {
      if ($$0 != this && $$0 instanceof cbm $$1 && this.gO() && $$1.gO()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cbm b(aow $$0, bnl $$1) {
      return bnw.n.a((cvr)$$0);
   }

   @Nullable
   @Override
   protected atk gn() {
      return atl.dt;
   }

   @Override
   protected void f(bmp $$0, float $$1) {
      this.gt();
      super.f($$0, $$1);
   }

   @Override
   protected enz a(bnq $$0, bnt $$1, float $$2) {
      int $$3 = Math.max(this.cP().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dH() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cP().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof bzx) {
            $$5 += 0.2F;
         }
      }

      return new enz(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dC() * (float) (Math.PI / 180.0));
   }

   @Override
   public float dZ() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bnt $$2, float $$3) {
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

         float $$15 = awi.a((float)this.gu() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)awi.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)awi.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public enz p(float $$0) {
      bnt $$1 = this.a(this.ap());
      float $$2 = this.dZ();
      return new enz(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int fH() {
      return 30;
   }

   @Override
   protected boolean q(bnq $$0) {
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
         this.b(atl.dw);
         this.b(bot.k);
         this.b(dpw.u);
         this.a(-this.dM().X());
      }
   }

   public void gs() {
      if (this.go()) {
         this.b(atl.dx);
         this.b(bot.a);
         this.b(dpw.u);
         this.a(this.dM().X());
      }
   }

   public void gt() {
      this.b(bot.a);
      this.b(dpw.u);
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
   public atk Z_() {
      return atl.dv;
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
   public void b(chl $$0) {
      if (!this.dM().B) {
         $$0.a(this, this.cp);
      }
   }

   @Override
   protected bud H() {
      return new cbm.a(this);
   }

   class a extends bud {
      public a(cbm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cbm.this.w()) {
            super.a();
         }
      }
   }

   class b extends buh {
      b() {
         super(cbm.this);
      }

      @Override
      public void a() {
         if (!cbm.this.cO()) {
            super.a();
         }
      }
   }

   class c extends bui {
      public c() {
         super(cbm.this);
      }

      @Override
      public void a() {
         if (this.k == bui.a.b && !cbm.this.fU() && cbm.this.go() && !cbm.this.gq() && cbm.this.gg()) {
            cbm.this.gs();
         }

         super.a();
      }
   }
}
