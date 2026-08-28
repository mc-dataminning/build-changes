import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjt extends chs {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int cb;
   protected static final ImmutableList<cgq<? extends cgp<? super cjt>>> bZ = ImmutableList.of(cgq.c, cgq.d, cgq.f, cgq.s);
   protected static final ImmutableList<cfj<?>> ca = ImmutableList.of(cfj.n, cfj.h, cfj.m, cfj.E, cfj.t, cfj.K, cfj.P, cfj.R, cfj.O, cfj.r, cfj.Z);

   public cjt(bvq<? extends chs> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new cci(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cch(this, 10);
   }

   @Override
   protected cfr b(dhh $$0) {
      return new cft(this, $$0);
   }

   @Override
   protected bxh.b<cjt> ed() {
      return bxh.a(ca, bZ);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cju.a(this.ed().a($$0));
   }

   @Override
   public bxh<cjt> ec() {
      return (bxh<cjt>)super.ec();
   }

   @Override
   protected axe go() {
      return axf.zT;
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cju.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bxm.a gp() {
      return chw.gt().a(bxn.v, 1.0).a(bxn.s, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.c(this.cb + 1);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Age", this.cb);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected axe u() {
      return null;
   }

   @Nullable
   @Override
   protected axe e(btz $$0) {
      return axf.zV;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.zS;
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bti.a;
      } else {
         return chy.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void i(cxo $$0) {
      chy.a(this, $$0);
      czx.a(ku.X, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void h(ux $$0) {
      chy.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cxo X_() {
      return new cxo(cxs.ri);
   }

   @Override
   public axe t() {
      return axf.do;
   }

   private boolean j(cxo $$0) {
      return $$0.a(ayd.aq);
   }

   private void a(cpw $$0, cxo $$1) {
      this.b($$0, $$1);
      this.b(bva.d_(this.gs()));
      this.dW().a(ls.O, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cpw $$0, cxo $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.cb;
   }

   private void b(int $$0) {
      this.c(this.cb + $$0 * 20);
   }

   private void c(int $$0) {
      this.cb = $$0;
      if (this.cb >= a) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dW() instanceof ash $$0) {
         this.a(bvq.ac, bve.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dW().d_($$1.dw()), bvp.i, null);
            $$1.ai();
            $$1.a(this.a(this.aw()));
            this.a(axf.zU, 0.15F, 1.0F);
         });
      }
   }

   private int gs() {
      return Math.max(0, a - this.cb);
   }

   @Override
   public boolean en() {
      return false;
   }
}
