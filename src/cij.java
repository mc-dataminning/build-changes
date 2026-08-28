import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cij extends cgi {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int ca;
   protected static final ImmutableList<cfg<? extends cff<? super cij>>> bY = ImmutableList.of(cfg.c, cfg.d, cfg.f, cfg.s);
   protected static final ImmutableList<cdz<?>> bZ = ImmutableList.of(cdz.n, cdz.h, cdz.m, cdz.E, cdz.t, cdz.K, cdz.P, cdz.R, cdz.O, cdz.r, cdz.Z);

   public cij(bug<? extends cgi> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cay(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cax(this, 10);
   }

   @Override
   protected ceh b(dev $$0) {
      return new cej(this, $$0);
   }

   @Override
   protected bvx.b<cij> ee() {
      return bvx.a(bZ, bY);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cik.a(this.ee().a($$0));
   }

   @Override
   public bvx<cij> ed() {
      return (bvx<cij>)super.ed();
   }

   @Override
   protected awj gw() {
      return awk.zy;
   }

   @Override
   protected void ac() {
      this.dX().ah().a("tadpoleBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      this.dX().ah().a("tadpoleActivityUpdate");
      cik.a(this);
      this.dX().ah().c();
      super.ac();
   }

   public static bwc.a gx() {
      return cgm.gA().a(bwd.v, 1.0).a(bwd.s, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         this.c(this.ca + 1);
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Age", this.ca);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awj w() {
      return null;
   }

   @Nullable
   @Override
   protected awj d(bsp $$0) {
      return awk.zA;
   }

   @Nullable
   @Override
   protected awj o_() {
      return awk.zx;
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if (this.l($$2)) {
         this.a($$0, $$2);
         return bry.a;
      } else {
         return cgo.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void k(cvx $$0) {
      cgo.a(this, $$0);
      cyg.a(kt.W, $$0, $$0x -> $$0x.a("Age", this.gy()));
   }

   @Override
   public void h(uj $$0) {
      cgo.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cvx X_() {
      return new cvx(cwb.qL);
   }

   @Override
   public awj y() {
      return awk.dn;
   }

   private boolean l(cvx $$0) {
      return $$0.a(axi.am);
   }

   private void a(coh $$0, cvx $$1) {
      this.b($$0, $$1);
      this.b(btq.d_(this.gA()));
      this.dX().a(lq.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(coh $$0, cvx $$1) {
      $$1.a(1, $$0);
   }

   private int gy() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= b) {
         this.gz();
      }
   }

   private void gz() {
      if (this.dX() instanceof arm $$0) {
         this.a(bug.R, btu.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dX().d_($$1.dx()), buf.i, null);
            $$1.gb();
            $$1.a(this.a(this.ax()));
            this.a(awk.zz, 0.15F, 1.0F);
         });
      }
   }

   private int gA() {
      return Math.max(0, b - this.ca);
   }

   @Override
   public boolean eo() {
      return false;
   }
}
