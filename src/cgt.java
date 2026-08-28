import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgt extends chg implements btw, buc {
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
   public static final ajv<Boolean> ce = ajz.a(cgt.class, ajx.k);
   public static final ajv<Long> cf = ajz.a(cgt.class, ajx.c);
   public final bsl cg = new bsl();
   public final bsl ch = new bsl();
   public final bsl ci = new bsl();
   public final bsl cj = new bsl();
   public final bsl ck = new bsl();
   private static final bst cJ = bst.b(bsw.o.l(), bsw.o.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public cgt(bsw<? extends cgt> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new cgt.c();
      this.bQ = new cgt.b();
      ccx $$2 = (ccx)this.J();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.ao.a(cf));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bty.k);
      }

      this.a($$1);
   }

   public static but.a s() {
      return gL().a(buu.s, 32.0).a(buu.v, 0.09F).a(buu.o, 0.42F).a(buu.B, 1.5);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0L);
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      cgu.a(this, $$0.E_());
      this.b($$0.E().Z());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected buo.b<cgt> dV() {
      return cgu.a();
   }

   @Override
   protected void z() {
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cgu.a(this.dV().a($$0));
   }

   @Override
   public bst e(bty $$0) {
      return $$0 == bty.k ? cJ.a(this.eb()) : super.e($$0);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("camelBrain");
      buo<?> $$0 = this.dU();
      ((buo<cgt>)$$0).a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("camelActivityUpdate");
      cgu.a(this);
      this.dQ().ag().c();
      super.Z();
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
            this.dQ().a(null, this.dq(), avo.dz, avp.g, 1.0F, 1.0F);
         }
      }

      if (this.dQ().x_()) {
         this.gW();
      }

      if (this.t()) {
         this.ac();
      }

      if (this.gp() && this.bf()) {
         this.gz();
      }
   }

   private void gW() {
      if (this.cL <= 0) {
         this.cL = this.ah.a(40) + 80;
         this.cj.a(this.ai);
      } else {
         this.cL--;
      }

      if (this.gq()) {
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
         this.ci.a(this.gw() && this.gA() >= 0L, this.ai);
      }
   }

   @Override
   protected void y(float $$0) {
      float $$1;
      if (this.at() == bty.a && !this.ck.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aU.a($$1, 0.2F);
   }

   @Override
   public void a(eww $$0) {
      if (this.t() && this.aF()) {
         this.i(this.dt().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cmv $$0, eww $$1) {
      super.a($$0, $$1);
      if ($$0.bq > 0.0F && this.gp() && !this.gw()) {
         this.gy();
      }
   }

   public boolean t() {
      return this.gp() || this.gw();
   }

   @Override
   protected float e(cmv $$0) {
      float $$1 = $$0.cc() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.g(buu.v) + $$1;
   }

   @Override
   protected ewv j(btl $$0) {
      return this.t() ? new ewv(this.dI(), this.dG()) : super.j($$0);
   }

   @Override
   protected eww b(cmv $$0, eww $$1) {
      return this.t() ? eww.b : super.b($$0, $$1);
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
   public boolean dJ() {
      return true;
   }

   @Override
   protected void b(float $$0, eww $$1) {
      double $$2 = (double)this.fe();
      this.j(this.bM().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(buu.v) * (double)this.aO()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
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
      this.b(avo.dy);
      this.a(dxw.u);
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
   protected avn v() {
      return avo.dx;
   }

   @Override
   protected avn n_() {
      return avo.dA;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.dC;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      if ($$1.a(awd.bp)) {
         this.a(avo.dH, 1.0F, 1.0F);
      } else {
         this.a(avo.dG, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ah);
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$0.fO() && !this.o_()) {
         this.b($$0);
         return bqq.a(this.dQ().B);
      } else {
         bqq $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cT().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bqq.a(this.dQ().B);
         }
      }
   }

   @Override
   protected void G(float $$0) {
      if ($$0 > 6.0F && this.gp() && !this.gw() && this.gm()) {
         this.gy();
      }
   }

   public boolean gm() {
      return this.g(this.gp() ? bty.a : bty.k);
   }

   @Override
   protected boolean a(cmv $$0, cuo $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.ex() < this.eO();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gB() && this.g() == 0 && this.gr();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dQ().a(lm.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dQ().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aX()) {
               avn $$5 = this.go();
               if ($$5 != null) {
                  this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$5, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
               }
            }

            this.a(dxw.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   public boolean a(cfc $$0) {
      if ($$0 != this && $$0 instanceof cgt $$1 && this.gT() && $$1.gT()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cgt b(aqt $$0, bsk $$1) {
      return bsw.o.a((dcu)$$0);
   }

   @Nullable
   @Override
   protected avn go() {
      return avo.dB;
   }

   @Override
   protected void f(brj $$0, float $$1) {
      this.gz();
      super.f($$0, $$1);
   }

   @Override
   protected eww a(bsq $$0, bst $$1, float $$2) {
      int $$3 = Math.max(this.cT().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dL() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cT().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cfc) {
            $$5 += 0.2F;
         }
      }

      return new eww(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dG() * (float) (Math.PI / 180.0));
   }

   @Override
   public float eb() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bst $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gw();
      boolean $$9 = this.gp();
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

         float $$15 = ayn.a((float)this.gA() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)ayn.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)ayn.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eww q(float $$0) {
      bst $$1 = this.a(this.at());
      float $$2 = this.eb();
      return new eww(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   protected boolean r(bsq $$0) {
      return this.cT().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   public boolean gp() {
      return this.ao.a(cf) < 0L;
   }

   public boolean gq() {
      return this.gA() < 0L != this.gp();
   }

   public boolean gw() {
      long $$0 = this.gA();
      return $$0 < (long)(this.gp() ? 40 : 52);
   }

   private boolean gX() {
      return this.gp() && this.gA() < 40L && this.gA() >= 0L;
   }

   public void gx() {
      if (!this.gp()) {
         this.b(avo.dE);
         this.b(bty.k);
         this.a(dxw.u);
         this.a(-this.dQ().Z());
      }
   }

   public void gy() {
      if (this.gp()) {
         this.b(avo.dF);
         this.b(bty.a);
         this.a(dxw.u);
         this.a(this.dQ().Z());
      }
   }

   public void gz() {
      this.b(bty.a);
      this.a(dxw.u);
      this.b(this.dQ().Z());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ao.a(cf, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gA() {
      return this.dQ().Z() - Math.abs(this.ao.a(cf));
   }

   @Override
   public avn Y_() {
      return avo.dD;
   }

   @Override
   public void a(ajv<?> $$0) {
      if (!this.an && ce.equals($$0)) {
         this.cK = this.cK == 0 ? 55 : this.cK;
      }

      super.a($$0);
   }

   @Override
   public boolean gB() {
      return true;
   }

   @Override
   public void b(cmv $$0) {
      if (!this.dQ().B) {
         $$0.a(this, this.cu);
      }
   }

   @Override
   protected bzi E() {
      return new cgt.a(this);
   }

   class a extends bzi {
      public a(final cgt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgt.this.t()) {
            super.a();
         }
      }
   }

   class b extends bzm {
      b() {
         super(cgt.this);
      }

      @Override
      public void a() {
         if (!cgt.this.cS()) {
            super.a();
         }
      }
   }

   class c extends bzn {
      public c() {
         super(cgt.this);
      }

      @Override
      public void a() {
         if (this.k == bzn.a.b && !cgt.this.fY() && cgt.this.gp() && !cgt.this.gw() && cgt.this.gm()) {
            cgt.this.gy();
         }

         super.a();
      }
   }
}
