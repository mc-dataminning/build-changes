import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class che extends cfe {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<cec<? extends ceb<? super che>>> e = ImmutableList.of(cec.c, cec.d, cec.f, cec.s);
   protected static final ImmutableList<ccv<?>> bY = ImmutableList.of(ccv.n, ccv.h, ccv.m, ccv.E, ccv.t, ccv.K, ccv.P, ccv.R, ccv.O, ccv.r, ccv.Z);

   public che(btc<? extends cfe> $$0, dca $$1) {
      super($$0, $$1);
      this.bP = new bzu(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzt(this, 10);
   }

   @Override
   protected cdd b(dca $$0) {
      return new cdf(this, $$0);
   }

   @Override
   protected but.b<che> dT() {
      return but.a(bY, e);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return chf.a(this.dT().a($$0));
   }

   @Override
   public but<che> dS() {
      return (but<che>)super.dS();
   }

   @Override
   protected avz gr() {
      return awa.zr;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("tadpoleBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("tadpoleActivityUpdate");
      chf.a(this);
      this.dP().ag().c();
      super.Z();
   }

   public static buy.a gs() {
      return btt.A().a(buz.r, 1.0).a(buz.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.t(this.bZ + 1);
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Age", this.bZ);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avz v() {
      return null;
   }

   @Nullable
   @Override
   protected avz d(brp $$0) {
      return awa.zt;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.zq;
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqw.a(this.dP().B);
      } else {
         return cfj.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cur $$0) {
      cfj.a(this, $$0);
      cxg.a(km.N, $$0, $$0x -> $$0x.a("Age", this.gt()));
   }

   @Override
   public void c(us $$0) {
      cfj.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cur b() {
      return new cur(cuu.qK);
   }

   @Override
   public avz y() {
      return awa.dn;
   }

   private boolean o(cur $$0) {
      return $$0.a(awy.al);
   }

   private void a(cmz $$0, cur $$1) {
      this.b($$0, $$1);
      this.c(bsq.d_(this.gv()));
      this.dP().a(li.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmz $$0, cur $$1) {
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
      if (this.dP() instanceof arf $$0) {
         chb $$1 = btc.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), btv.i, null);
            $$1.t(this.gg());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            $$1.fU();
            this.a(awa.zs, 0.15F, 1.0F);
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
