import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgx extends cex {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<cdv<? extends cdu<? super cgx>>> e = ImmutableList.of(cdv.c, cdv.d, cdv.f, cdv.s);
   protected static final ImmutableList<cco<?>> bY = ImmutableList.of(cco.n, cco.h, cco.m, cco.E, cco.t, cco.K, cco.P, cco.R, cco.O, cco.r, cco.Z);

   public cgx(bsv<? extends cex> $$0, dbt $$1) {
      super($$0, $$1);
      this.bP = new bzn(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzm(this, 10);
   }

   @Override
   protected ccw b(dbt $$0) {
      return new ccy(this, $$0);
   }

   @Override
   protected bum.b<cgx> dT() {
      return bum.a(bY, e);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return cgy.a(this.dT().a($$0));
   }

   @Override
   public bum<cgx> dS() {
      return (bum<cgx>)super.dS();
   }

   @Override
   protected avv gr() {
      return avw.zr;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("tadpoleBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("tadpoleActivityUpdate");
      cgy.a(this);
      this.dP().ag().c();
      super.Z();
   }

   public static bur.a gs() {
      return btm.A().a(bus.r, 1.0).a(bus.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.t(this.bZ + 1);
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Age", this.bZ);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avv v() {
      return null;
   }

   @Nullable
   @Override
   protected avv d(bri $$0) {
      return avw.zt;
   }

   @Nullable
   @Override
   protected avv o_() {
      return avw.zq;
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqp.a(this.dP().B);
      } else {
         return cfc.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cuk $$0) {
      cfc.a(this, $$0);
      cwz.a(km.M, $$0, $$0x -> $$0x.a("Age", this.gt()));
   }

   @Override
   public void c(ur $$0) {
      cfc.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cuk b() {
      return new cuk(cun.qK);
   }

   @Override
   public avv y() {
      return avw.dn;
   }

   private boolean o(cuk $$0) {
      return $$0.a(awu.al);
   }

   private void a(cms $$0, cuk $$1) {
      this.b($$0, $$1);
      this.c(bsj.d_(this.gv()));
      this.dP().a(lj.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cms $$0, cuk $$1) {
      $$1.a(1, $$0);
   }

   private int gt() {
      return this.bZ;
   }

   private void c(int $$0) {
      this.t(this.bZ + $$0 * 20);
   }

   private void t(int $$0) {
      this.bZ = $$0;
      if (this.bZ >= b) {
         this.gu();
      }
   }

   private void gu() {
      if (this.dP() instanceof arb $$0) {
         cgu $$1 = bsv.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), bto.i, null);
            $$1.t(this.gg());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            $$1.fU();
            this.a(avw.zs, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ao();
         }
      }
   }

   private int gv() {
      return Math.max(0, b - this.bZ);
   }

   @Override
   public boolean eh() {
      return false;
   }
}
