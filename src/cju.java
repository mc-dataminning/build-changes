import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cju extends cht {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int cb;
   protected static final ImmutableList<cgr<? extends cgq<? super cju>>> bZ = ImmutableList.of(cgr.c, cgr.d, cgr.f, cgr.s);
   protected static final ImmutableList<cfk<?>> ca = ImmutableList.of(cfk.n, cfk.h, cfk.m, cfk.E, cfk.t, cfk.K, cfk.P, cfk.R, cfk.O, cfk.r, cfk.Z);

   public cju(bvr<? extends cht> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new ccj(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cci(this, 10);
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cfu(this, $$0);
   }

   @Override
   protected bxi.b<cju> ed() {
      return bxi.a(ca, bZ);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cjv.a(this.ed().a($$0));
   }

   @Override
   public bxi<cju> ec() {
      return (bxi<cju>)super.ec();
   }

   @Override
   protected axe go() {
      return axf.zT;
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cjv.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bxn.a gp() {
      return chx.gt().a(bxo.v, 1.0).a(bxo.s, 6.0);
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
   protected axe e(bua $$0) {
      return axf.zV;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.zS;
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return btj.a;
      } else {
         return chz.a($$0, $$1, this).orElse(super.b($$0, $$1));
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
   public void i(cxp $$0) {
      chz.a(this, $$0);
      czy.a(ku.X, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void h(ux $$0) {
      chz.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cxp X_() {
      return new cxp(cxt.ri);
   }

   @Override
   public axe t() {
      return axf.do;
   }

   private boolean j(cxp $$0) {
      return $$0.a(ayd.aq);
   }

   private void a(cpx $$0, cxp $$1) {
      this.b($$0, $$1);
      this.b(bvb.d_(this.gs()));
      this.dW().a(ls.O, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cpx $$0, cxp $$1) {
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
         this.a(bvr.ac, bvf.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dW().d_($$1.dw()), bvq.i, null);
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
