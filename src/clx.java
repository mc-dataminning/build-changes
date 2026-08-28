import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clx extends cjr {
   private static final int bI = 0;
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bJ = 0;
   protected static final ImmutableList<cio<? extends cin<? super clx>>> e = ImmutableList.of(cio.c, cio.d, cio.f, cio.s);
   protected static final ImmutableList<chh<?>> f = ImmutableList.of(chh.o, chh.h, chh.n, chh.F, chh.u, chh.L, chh.Q, chh.S, chh.P, chh.s, chh.aa);

   public clx(bxn<? extends cjr> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new ceg(this, 85, 10, 0.02F, 0.1F, true);
      this.bB = new cef(this, 10);
   }

   @Override
   protected chp b(dkj $$0) {
      return new chr(this, $$0);
   }

   @Override
   protected bzf.b<clx> ed() {
      return bzf.a(f, e);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cly.a(this.ed().a($$0));
   }

   @Override
   public bzf<clx> ec() {
      return (bzf<clx>)super.ec();
   }

   @Override
   protected awx t() {
      return awy.Ay;
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cly.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bzk.a x() {
      return cjv.gz().a(bzl.v, 1.0).a(bzl.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.c(this.bJ + 1);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Age", this.bJ);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c($$0.b("Age", 0));
   }

   @Nullable
   @Override
   protected awx u() {
      return null;
   }

   @Nullable
   @Override
   protected awx e(bvt $$0) {
      return awy.AA;
   }

   @Nullable
   @Override
   protected awx l_() {
      return awy.Ax;
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bvc.a;
      } else {
         return cjx.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void a_(dak $$0) {
      cjx.a(this, $$0);
      dcs.a(kl.Z, $$0, $$0x -> $$0x.a("Age", this.gu()));
   }

   @Override
   public void d(ua $$0) {
      cjx.a(this, $$0);
      $$0.e("Age").ifPresent(this::c);
   }

   @Override
   public dak X_() {
      return new dak(dao.rA);
   }

   @Override
   public awx n() {
      return awy.do;
   }

   private boolean j(dak $$0) {
      return $$0.a(axv.aq);
   }

   private void a(csi $$0, dak $$1) {
      this.b($$0, $$1);
      this.b(bwu.d_(this.gw()));
      this.dV().a(lz.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(csi $$0, dak $$1) {
      $$1.a(1, $$0);
   }

   private int gu() {
      return this.bJ;
   }

   private void b(int $$0) {
      this.c(this.bJ + $$0 * 20);
   }

   private void c(int $$0) {
      this.bJ = $$0;
      if (this.bJ >= a) {
         this.gv();
      }
   }

   private void gv() {
      if (this.dV() instanceof asb $$0) {
         this.a(bxn.ac, bwy.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bxm.i, null);
            $$1.gc();
            $$1.a(this.a(this.at()));
            this.a(awy.Az, 0.15F, 1.0F);
         });
      }
   }

   private int gw() {
      return Math.max(0, a - this.bJ);
   }

   @Override
   public boolean eo() {
      return false;
   }
}
