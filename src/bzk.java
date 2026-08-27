import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bzk extends bxp {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bwn<? extends bwm<? super bzk>>> e = ImmutableList.of(bwn.c, bwn.d, bwn.f, bwn.r);
   protected static final ImmutableList<bvh<?>> bT = ImmutableList.of(bvh.n, bvh.h, bvh.m, bvh.E, bvh.t, bvh.J, bvh.O, bvh.Q, bvh.N, bvh.r, bvh.Y);

   public bzk(blt<? extends bxp> $$0, cti $$1) {
      super($$0, $$1);
      this.bL = new bsg(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bsf(this, 10);
   }

   @Override
   protected bvp b(cti $$0) {
      return new bvr(this, $$0);
   }

   @Override
   protected bnf.b<bzk> dP() {
      return bnf.a(bT, e);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return bzl.a(this.dP().a($$0));
   }

   @Override
   public bnf<bzk> dO() {
      return (bnf<bzk>)super.dO();
   }

   @Override
   protected arl gf() {
      return arm.yx;
   }

   @Override
   protected void Z() {
      this.dM().af().a("tadpoleBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("tadpoleActivityUpdate");
      bzl.a(this);
      this.dM().af().c();
      super.Z();
   }

   public static bnk.a gg() {
      return bmh.C().a(bnl.m, 1.0).a(bnl.l, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected arl y() {
      return null;
   }

   @Nullable
   @Override
   protected arl d(bkn $$0) {
      return arm.yz;
   }

   @Nullable
   @Override
   protected arl n_() {
      return arm.yw;
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bjv.a(this.dM().B);
      } else {
         return bxu.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cmr $$0) {
      bxu.a(this, $$0);
      sl $$1 = $$0.w();
      $$1.a("Age", this.gh());
   }

   @Override
   public void c(sl $$0) {
      bxu.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cmr b() {
      return new cmr(cmu.qH);
   }

   @Override
   public arl A() {
      return arm.cP;
   }

   private boolean m(cmr $$0) {
      return bzh.bT.a($$0);
   }

   private void a(cfb $$0, cmr $$1) {
      this.b($$0, $$1);
      this.c(blk.d_(this.gj()));
      this.dM().a(jx.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cfb $$0, cmr $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   private int gh() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gi();
      }
   }

   private void gi() {
      if (this.dM() instanceof amz $$0) {
         bzh $$1 = blt.P.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bmj.i, null, null);
            $$1.t(this.fU());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fJ();
            this.a(arm.yy, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gj() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ec() {
      return false;
   }
}
