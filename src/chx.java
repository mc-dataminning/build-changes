import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chx extends cfw {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int ca;
   protected static final ImmutableList<ceu<? extends cet<? super chx>>> bY = ImmutableList.of(ceu.c, ceu.d, ceu.f, ceu.s);
   protected static final ImmutableList<cdn<?>> bZ = ImmutableList.of(cdn.n, cdn.h, cdn.m, cdn.E, cdn.t, cdn.K, cdn.P, cdn.R, cdn.O, cdn.r, cdn.Z);

   public chx(btv<? extends cfw> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cam(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cal(this, 10);
   }

   @Override
   protected cdv b(deg $$0) {
      return new cdx(this, $$0);
   }

   @Override
   protected bvl.b<chx> dY() {
      return bvl.a(bZ, bY);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return chy.a(this.dY().a($$0));
   }

   @Override
   public bvl<chx> dX() {
      return (bvl<chx>)super.dX();
   }

   @Override
   protected awd gq() {
      return awe.zA;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("tadpoleBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("tadpoleActivityUpdate");
      chy.a(this);
      this.dS().ah().c();
      super.ad();
   }

   public static bvq.a gr() {
      return cga.gu().a(bvr.v, 1.0).a(bvr.s, 6.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         this.c(this.ca + 1);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Age", this.ca);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awd w() {
      return null;
   }

   @Nullable
   @Override
   protected awd d(bsg $$0) {
      return awe.zC;
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.zz;
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if (this.n($$2)) {
         this.a($$0, $$2);
         return brp.a;
      } else {
         return cgc.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void m(cvp $$0) {
      cgc.a(this, $$0);
      cye.a(kr.S, $$0, $$0x -> $$0x.a("Age", this.gs()));
   }

   @Override
   public void h(uf $$0) {
      cgc.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cvp V_() {
      return new cvp(cvt.qL);
   }

   @Override
   public awd y() {
      return awe.dn;
   }

   private boolean n(cvp $$0) {
      return $$0.a(axc.al);
   }

   private void a(cnu $$0, cvp $$1) {
      this.b($$0, $$1);
      this.b(bth.d_(this.gu()));
      this.dS().a(ln.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cnu $$0, cvp $$1) {
      $$1.a(1, $$0);
   }

   private int gs() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= b) {
         this.gt();
      }
   }

   private void gt() {
      if (this.dS() instanceof arh $$0) {
         chu $$1 = btv.R.a(this.dS(), btu.i);
         if ($$1 != null) {
            $$1.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$1.a($$0, this.dS().d_($$1.ds()), btu.i, null);
            $$1.u(this.ge());
            if (this.ak()) {
               $$1.b(this.al());
               $$1.p(this.cI());
            }

            $$1.fW();
            $$1.a(this.a(this.av()));
            this.a(awe.zB, 0.15F, 1.0F);
            $$0.a_($$1);
            this.as();
         }
      }
   }

   private int gu() {
      return Math.max(0, b - this.ca);
   }

   @Override
   public boolean ei() {
      return false;
   }
}
