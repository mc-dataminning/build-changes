import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cio extends cgn {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int ca;
   protected static final ImmutableList<cfl<? extends cfk<? super cio>>> bY = ImmutableList.of(cfl.c, cfl.d, cfl.f, cfl.s);
   protected static final ImmutableList<cee<?>> bZ = ImmutableList.of(cee.n, cee.h, cee.m, cee.E, cee.t, cee.K, cee.P, cee.R, cee.O, cee.r, cee.Z);

   public cio(bul<? extends cgn> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cbd(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbc(this, 10);
   }

   @Override
   protected cem b(dfb $$0) {
      return new ceo(this, $$0);
   }

   @Override
   protected bwc.b<cio> ee() {
      return bwc.a(bZ, bY);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cip.a(this.ee().a($$0));
   }

   @Override
   public bwc<cio> ed() {
      return (bwc<cio>)super.ed();
   }

   @Override
   protected awk gv() {
      return awl.zy;
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("tadpoleBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      $$0.a("tadpoleActivityUpdate");
      cip.a(this);
      $$0.c();
      super.ac();
   }

   public static bwh.a gw() {
      return cgr.gz().a(bwi.v, 1.0).a(bwi.s, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         this.c(this.ca + 1);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Age", this.ca);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awk w() {
      return null;
   }

   @Nullable
   @Override
   protected awk d(bsu $$0) {
      return awl.zA;
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.zx;
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if (this.l($$2)) {
         this.a($$0, $$2);
         return bsd.a;
      } else {
         return cgt.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void k(cwb $$0) {
      cgt.a(this, $$0);
      cyk.a(ku.X, $$0, $$0x -> $$0x.a("Age", this.gx()));
   }

   @Override
   public void h(uk $$0) {
      cgt.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cwb X_() {
      return new cwb(cwf.qL);
   }

   @Override
   public awk y() {
      return awl.dn;
   }

   private boolean l(cwb $$0) {
      return $$0.a(axj.ao);
   }

   private void a(com $$0, cwb $$1) {
      this.b($$0, $$1);
      this.b(btv.d_(this.gz()));
      this.dX().a(lr.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(com $$0, cwb $$1) {
      $$1.a(1, $$0);
   }

   private int gx() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= b) {
         this.gy();
      }
   }

   private void gy() {
      if (this.dX() instanceof arn $$0) {
         this.a(bul.R, btz.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dX().d_($$1.dx()), buk.i, null);
            $$1.ga();
            $$1.a(this.a(this.ay()));
            this.a(awl.zz, 0.15F, 1.0F);
         });
      }
   }

   private int gz() {
      return Math.max(0, b - this.ca);
   }

   @Override
   public boolean eo() {
      return false;
   }
}
