import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjp extends cho {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int cb;
   protected static final ImmutableList<cgm<? extends cgl<? super cjp>>> bZ = ImmutableList.of(cgm.c, cgm.d, cgm.f, cgm.s);
   protected static final ImmutableList<cff<?>> ca = ImmutableList.of(cff.n, cff.h, cff.m, cff.E, cff.t, cff.K, cff.P, cff.R, cff.O, cff.r, cff.Z);

   public cjp(bvm<? extends cho> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cce(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new ccd(this, 10);
   }

   @Override
   protected cfn b(dha $$0) {
      return new cfp(this, $$0);
   }

   @Override
   protected bxd.b<cjp> ec() {
      return bxd.a(ca, bZ);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cjq.a(this.ec().a($$0));
   }

   @Override
   public bxd<cjp> eb() {
      return (bxd<cjp>)super.eb();
   }

   @Override
   protected axe gm() {
      return axf.zS;
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cjq.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bxi.a gn() {
      return chs.gr().a(bxj.v, 1.0).a(bxj.s, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
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
   protected axe e(btv $$0) {
      return axf.zU;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.zR;
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bte.a;
      } else {
         return chu.a($$0, $$1, this).orElse(super.b($$0, $$1));
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
   public void i(cxk $$0) {
      chu.a(this, $$0);
      czt.a(ku.X, $$0, $$0x -> $$0x.a("Age", this.go()));
   }

   @Override
   public void h(ux $$0) {
      chu.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cxk X_() {
      return new cxk(cxo.ri);
   }

   @Override
   public axe t() {
      return axf.dn;
   }

   private boolean j(cxk $$0) {
      return $$0.a(ayd.aq);
   }

   private void a(cps $$0, cxk $$1) {
      this.b($$0, $$1);
      this.b(buw.d_(this.gq()));
      this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cps $$0, cxk $$1) {
      $$1.a(1, $$0);
   }

   private int go() {
      return this.cb;
   }

   private void b(int $$0) {
      this.c(this.cb + $$0 * 20);
   }

   private void c(int $$0) {
      this.cb = $$0;
      if (this.cb >= a) {
         this.gp();
      }
   }

   private void gp() {
      if (this.dV() instanceof ash $$0) {
         this.a(bvm.ac, bva.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bvl.i, null);
            $$1.ai();
            $$1.a(this.a(this.aw()));
            this.a(axf.zT, 0.15F, 1.0F);
         });
      }
   }

   private int gq() {
      return Math.max(0, a - this.cb);
   }

   @Override
   public boolean em() {
      return false;
   }
}
