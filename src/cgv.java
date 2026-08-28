import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgv extends chi implements bty, bue {
   public static final float ca = 0.45F;
   public static final int cb = 55;
   public static final int cc = 30;
   private static final float cB = 0.1F;
   private static final float cC = 1.4285F;
   private static final float cD = 22.2222F;
   private static final int cE = 5;
   private static final int cF = 40;
   private static final int cG = 52;
   private static final int cH = 80;
   private static final float cI = 1.43F;
   public static final ajw<Boolean> ce = aka.a(cgv.class, ajy.k);
   public static final ajw<Long> cf = aka.a(cgv.class, ajy.c);
   public final bsm cg = new bsm();
   public final bsm ch = new bsm();
   public final bsm ci = new bsm();
   public final bsm cj = new bsm();
   public final bsm ck = new bsm();
   private static final bsu cJ = bsu.b(bsx.o.l(), bsx.o.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public cgv(bsx<? extends cgv> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new cgv.c();
      this.bQ = new cgv.b();
      ccz $$2 = (ccz)this.N();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(cf));
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bua.k);
      }

      this.a($$1);
   }

   public static buv.a s() {
      return gL().a(buw.s, 32.0).a(buw.v, 0.09F).a(buw.o, 0.42F).a(buw.B, 1.5);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0L);
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      cgw.a(this, $$0.E_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected buq.b<cgv> dV() {
      return cgw.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgw.a(this.dV().a($$0));
   }

   @Override
   public bsu e(bua $$0) {
      return $$0 == bua.k ? cJ.a(this.eb()) : super.e($$0);
   }

   @Override
   protected void ab() {
      this.dP().ag().a("camelBrain");
      buq<?> $$0 = this.dU();
      ((buq<cgv>)$$0).a((aqu)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("camelActivityUpdate");
      cgw.a(this);
      this.dP().ag().c();
      super.ab();
   }

   @Override
   public void l() {
      super.l();
      if (this.x() && this.cK < 50 && (this.aF() || this.bj() || this.bS())) {
         this.w(false);
      }

      if (this.cK > 0) {
         this.cK--;
         if (this.cK == 0) {
            this.dP().a(null, this.dp(), avp.dz, avq.g, 1.0F, 1.0F);
         }
      }

      if (this.dP().x_()) {
         this.gW();
      }

      if (this.t()) {
         this.af();
      }

      if (this.go() && this.bf()) {
         this.gy();
      }
   }

   private void gW() {
      if (this.cL <= 0) {
         this.cL = this.ah.a(40) + 80;
         this.cj.a(this.ai);
      } else {
         this.cL--;
      }

      if (this.gp()) {
         this.ci.a();
         this.ck.a();
         if (this.gX()) {
            this.cg.b(this.ai);
            this.ch.a();
         } else {
            this.cg.a();
            this.ch.b(this.ai);
         }
      } else {
         this.cg.a();
         this.ch.a();
         this.ck.a(this.x(), this.ai);
         this.ci.a(this.gv() && this.gz() >= 0L, this.ai);
      }
   }

   @Override
   protected void z(float $$0) {
      float $$1;
      if (this.at() == bua.a && !this.ck.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aU.a($$1, 0.2F);
   }

   @Override
   public void a(exa $$0) {
      if (this.t() && this.aF()) {
         this.i(this.ds().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cmx $$0, exa $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.go() && !this.gv()) {
         this.gx();
      }
   }

   public boolean t() {
      return this.go() || this.gv();
   }

   @Override
   protected float e(cmx $$0) {
      float $$1 = $$0.cc() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(buw.v) + $$1;
   }

   @Override
   protected ewz j(btn $$0) {
      return this.t() ? new ewz(this.dH(), this.dF()) : super.j($$0);
   }

   @Override
   protected exa b(cmx $$0, exa $$1) {
      return this.t() ? exa.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.t() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cK <= 0 && this.aF()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dI() {
      return true;
   }

   @Override
   protected void b(float $$0, exa $$1) {
      double $$2 = (double)this.fe();
      this.j(this.bM().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(buw.v) * (double)this.aO()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cK = 55;
      this.w(true);
      this.av = true;
   }

   public boolean x() {
      return this.ao.a(ce);
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(avp.dy);
      this.a(dxz.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cK;
   }

   @Override
   protected avo v() {
      return avp.dx;
   }

   @Override
   protected avo n_() {
      return avp.dA;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.dC;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      if ($$1.a(awe.bp)) {
         this.a(avp.dH, 1.0F, 1.0F);
      } else {
         this.a(avp.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ah);
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$0.fO() && !this.o_()) {
         this.b($$0);
         return bqr.a(this.dP().B);
      } else {
         bqr $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cT().size() < 2 && !this.o_()) {
               this.a($$0);
            }

            return bqr.a(this.dP().B);
         }
      }
   }

   @Override
   public boolean a(bsr $$0, float $$1) {
      if ($$1 > 6.0F && this.go() && !this.gv() && this.gl()) {
         this.gx();
      }

      return true;
   }

   public boolean gl() {
      return this.g(this.go() ? bua.a : bua.k);
   }

   @Override
   protected boolean a(cmx $$0, cuq $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ex() < this.eO();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gA() && this.g() == 0 && this.gq();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dP().a(lm.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dP().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aX()) {
               avo $$5 = this.gn();
               if ($$5 != null) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), $$5, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dxz.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   public boolean a(cfe $$0) {
      if ($$0 != this && $$0 instanceof cgv $$1 && this.gT() && $$1.gT()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cgv b(aqu $$0, bsl $$1) {
      return bsx.o.a((dcw)$$0);
   }

   @Nullable
   @Override
   protected avo gn() {
      return avp.dB;
   }

   @Override
   protected void f(brk $$0, float $$1) {
      this.gy();
      super.f($$0, $$1);
   }

   @Override
   protected exa a(bsr $$0, bsu $$1, float $$2) {
      int $$3 = Math.max(this.cT().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dK() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cT().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cfe) {
            $$5 += 0.2F;
         }
      }

      return new exa(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dF() * (float) (Math.PI / 180.0));
   }

   @Override
   public float eb() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bsu $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gv();
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

         float $$15 = ayo.a((float)this.gz() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayo.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayo.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public exa q(float $$0) {
      bsu $$1 = this.a(this.at());
      float $$2 = this.eb();
      return new exa(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   protected boolean r(bsr $$0) {
      return this.cT().size() <= 2;
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   public boolean go() {
      return this.ao.a(cf) < 0L;
   }

   public boolean gp() {
      return this.gz() < 0L != this.go();
   }

   public boolean gv() {
      long $$0 = this.gz();
      return $$0 < (long)(this.go() ? 40 : 52);
   }

   private boolean gX() {
      return this.go() && this.gz() < 40L && this.gz() >= 0L;
   }

   public void gw() {
      if (!this.go()) {
         this.b(avp.dE);
         this.b(bua.k);
         this.a(dxz.u);
         this.a(-this.dP().Z());
      }
   }

   public void gx() {
      if (this.go()) {
         this.b(avp.dF);
         this.b(bua.a);
         this.a(dxz.u);
         this.a(this.dP().Z());
      }
   }

   public void gy() {
      this.b(bua.a);
      this.a(dxz.u);
      this.b(this.dP().Z());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cf, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gz() {
      return this.dP().Z() - Math.abs(this.ao.a(cf));
   }

   @Override
   public avo ac_() {
      return avp.dD;
   }

   @Override
   public void a(ajw<?> $$0) {
      if (!this.an && ce.equals($$0)) {
         this.cK = this.cK == 0 ? 55 : this.cK;
      }

      super.a($$0);
   }

   @Override
   public boolean gA() {
      return true;
   }

   @Override
   public void b(cmx $$0) {
      if (!this.dP().B) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected bzk H() {
      return new cgv.a(this);
   }

   class a extends bzk {
      public a(final cgv $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgv.this.t()) {
            super.a();
         }
      }
   }

   class b extends bzo {
      b() {
         super(cgv.this);
      }

      @Override
      public void a() {
         if (!cgv.this.cS()) {
            super.a();
         }
      }
   }

   class c extends bzp {
      public c() {
         super(cgv.this);
      }

      @Override
      public void a() {
         if (this.k == bzp.a.b && !cgv.this.N_() && cgv.this.go() && !cgv.this.gv() && cgv.this.gl()) {
            cgv.this.gx();
         }

         super.a();
      }
   }
}
