import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bza extends bxf {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bwd<? extends bwc<? super bza>>> e = ImmutableList.of(bwd.c, bwd.d, bwd.f, bwd.r);
   protected static final ImmutableList<bux<?>> bT = ImmutableList.of(bux.n, bux.h, bux.m, bux.E, bux.t, bux.J, bux.O, bux.Q, bux.N, bux.r, bux.Y);

   public bza(blj<? extends bxf> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new brw(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new brv(this, 10);
   }

   @Override
   protected bvf b(csy $$0) {
      return new bvh(this, $$0);
   }

   @Override
   protected bmv.b<bza> dP() {
      return bmv.a(bT, e);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return bzb.a(this.dP().a($$0));
   }

   @Override
   public bmv<bza> dO() {
      return (bmv<bza>)super.dO();
   }

   @Override
   protected arb gf() {
      return arc.yx;
   }

   @Override
   protected void Z() {
      this.dM().ae().a("tadpoleBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("tadpoleActivityUpdate");
      bzb.a(this);
      this.dM().ae().c();
      super.Z();
   }

   public static bna.a gg() {
      return blx.C().a(bnb.m, 1.0).a(bnb.l, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected arb y() {
      return null;
   }

   @Nullable
   @Override
   protected arb d(bkd $$0) {
      return arc.yz;
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.yw;
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bjl.a(this.dM().B);
      } else {
         return bxk.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cmh $$0) {
      bxk.a(this, $$0);
      sj $$1 = $$0.w();
      $$1.a("Age", this.gh());
   }

   @Override
   public void c(sj $$0) {
      bxk.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cmh b() {
      return new cmh(cmk.qH);
   }

   @Override
   public arb A() {
      return arc.cP;
   }

   private boolean m(cmh $$0) {
      return byx.bT.a($$0);
   }

   private void a(cer $$0, cmh $$1) {
      this.b($$0, $$1);
      this.c(bla.d_(this.gj()));
      this.dM().a(jv.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cer $$0, cmh $$1) {
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
      if (this.dM() instanceof amp $$0) {
         byx $$1 = blj.P.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), blz.i, null, null);
            $$1.t(this.fU());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fJ();
            this.a(arc.yy, 0.15F, 1.0F);
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
