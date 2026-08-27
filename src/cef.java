import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cef extends ccf {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bY;
   protected static final ImmutableList<cbd<? extends cbc<? super cef>>> e = ImmutableList.of(cbd.c, cbd.d, cbd.f, cbd.s);
   protected static final ImmutableList<bzw<?>> bX = ImmutableList.of(bzw.n, bzw.h, bzw.m, bzw.E, bzw.t, bzw.K, bzw.P, bzw.R, bzw.O, bzw.r, bzw.Z);

   public cef(bqg<? extends ccf> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new bwv(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bwu(this, 10);
   }

   @Override
   protected cae b(czg $$0) {
      return new cag(this, $$0);
   }

   @Override
   protected bru.b<cef> dQ() {
      return bru.a(bX, e);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return ceg.a(this.dQ().a($$0));
   }

   @Override
   public bru<cef> dP() {
      return (bru<cef>)super.dP();
   }

   @Override
   protected aun go() {
      return auo.yY;
   }

   @Override
   protected void Y() {
      this.dM().af().a("tadpoleBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("tadpoleActivityUpdate");
      ceg.a(this);
      this.dM().af().c();
      super.Y();
   }

   public static brz.a gp() {
      return bqv.A().a(bsa.r, 1.0).a(bsa.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         this.t(this.bY + 1);
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Age", this.bY);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aun v() {
      return null;
   }

   @Nullable
   @Override
   protected aun d(boy $$0) {
      return auo.za;
   }

   @Nullable
   @Override
   protected aun o_() {
      return auo.yX;
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bof.a(this.dM().B);
      } else {
         return cck.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(crs $$0) {
      cck.a(this, $$0);
      cuc.a(jr.E, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void c(to $$0) {
      cck.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public crs b() {
      return new crs(crv.qJ);
   }

   @Override
   public aun y() {
      return auo.dn;
   }

   private boolean o(crs $$0) {
      return cec.bX.a($$0);
   }

   private void a(cka $$0, crs $$1) {
      this.b($$0, $$1);
      this.c(bpu.d_(this.gs()));
      this.dM().a(kn.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cka $$0, crs $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.bY;
   }

   private void c(int $$0) {
      this.t(this.bY + $$0 * 20);
   }

   private void t(int $$0) {
      this.bY = $$0;
      if (this.bY >= b) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dM() instanceof apu $$0) {
         cec $$1 = bqg.R.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bqx.i, null);
            $$1.t(this.gd());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fS();
            this.a(auo.yZ, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gs() {
      return Math.max(0, b - this.bY);
   }

   @Override
   public boolean ee() {
      return false;
   }
}
