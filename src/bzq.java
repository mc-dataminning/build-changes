import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bzq extends bxv {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bwt<? extends bws<? super bzq>>> e = ImmutableList.of(bwt.c, bwt.d, bwt.f, bwt.r);
   protected static final ImmutableList<bvn<?>> bT = ImmutableList.of(bvn.n, bvn.h, bvn.m, bvn.E, bvn.t, bvn.J, bvn.O, bvn.Q, bvn.N, bvn.r, bvn.Y);

   public bzq(blz<? extends bxv> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new bsm(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bsl(this, 10);
   }

   @Override
   protected bvv b(ctp $$0) {
      return new bvx(this, $$0);
   }

   @Override
   protected bnl.b<bzq> dP() {
      return bnl.a(bT, e);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return bzr.a(this.dP().a($$0));
   }

   @Override
   public bnl<bzq> dO() {
      return (bnl<bzq>)super.dO();
   }

   @Override
   protected arr gf() {
      return ars.yx;
   }

   @Override
   protected void Z() {
      this.dM().af().a("tadpoleBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("tadpoleActivityUpdate");
      bzr.a(this);
      this.dM().af().c();
      super.Z();
   }

   public static bnq.a gg() {
      return bmn.C().a(bnr.m, 1.0).a(bnr.l, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected arr y() {
      return null;
   }

   @Nullable
   @Override
   protected arr d(bkt $$0) {
      return ars.yz;
   }

   @Nullable
   @Override
   protected arr n_() {
      return ars.yw;
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bkb.a(this.dM().B);
      } else {
         return bya.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cmy $$0) {
      bya.a(this, $$0);
      sn $$1 = $$0.w();
      $$1.a("Age", this.gh());
   }

   @Override
   public void c(sn $$0) {
      bya.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cmy b() {
      return new cmy(cnb.qH);
   }

   @Override
   public arr A() {
      return ars.cP;
   }

   private boolean m(cmy $$0) {
      return bzn.bT.a($$0);
   }

   private void a(cfi $$0, cmy $$1) {
      this.b($$0, $$1);
      this.c(blq.d_(this.gj()));
      this.dM().a(jx.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cfi $$0, cmy $$1) {
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
      if (this.dM() instanceof and $$0) {
         bzn $$1 = blz.P.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bmp.i, null, null);
            $$1.t(this.fU());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fJ();
            this.a(ars.yy, 0.15F, 1.0F);
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
