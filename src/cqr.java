import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cqr extends cjv implements cpc, cqt {
   private static final aku<Boolean> bM = aky.a(cqr.class, akw.k);
   private static final int bN = 40;
   private static final float bO = 0.3F;
   private static final int bP = 1;
   private static final float bQ = 0.6F;
   private static final int bR = 6;
   private static final float bS = 0.5F;
   private static final boolean bT = false;
   private static final int bU = 0;
   private static final boolean bV = false;
   public static final int bI = 300;
   private int bW;
   private int bX = 0;
   private boolean bY = false;
   protected static final ImmutableList<? extends cio<? extends cin<? super cqr>>> bJ = ImmutableList.of(cio.c, cio.d, cio.o, cio.n);
   protected static final ImmutableList<? extends chh<?>> bK = ImmutableList.of(
      chh.s,
      chh.g,
      chh.h,
      chh.k,
      chh.l,
      chh.o,
      chh.n,
      chh.F,
      chh.u,
      chh.p,
      chh.q,
      chh.ar,
      new chh[]{chh.A, chh.at, chh.au, chh.aq, chh.L, chh.ax, chh.ay, chh.aa}
   );

   public cqr(bxn<? extends cqr> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.bX = $$0;
   }

   @Override
   public boolean w() {
      return true;
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.s, 40.0).a(bzl.v, 0.3F).a(bzl.p, 0.6F).a(bzl.d, 1.0).a(bzl.c, 6.0);
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      if ($$1 instanceof byf $$2) {
         this.bW = 10;
         this.dV().a(this, (byte)4);
         this.b(awy.mS);
         cqs.a(this, $$2);
         return cqt.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(byf $$0) {
      if (this.p()) {
         cqt.a(this, $$0);
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof byf $$4) {
         cqs.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bzf.b<cqr> ed() {
      return bzf.a(bK, bJ);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cqs.a(this.ed().a($$0));
   }

   @Override
   public bzf<cqr> ec() {
      return (bzf<cqr>)super.ec();
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqs.a(this);
      if (this.u()) {
         this.bX++;
         if (this.bX > 300) {
            this.b(awy.mT);
            this.gw();
         }
      } else {
         this.bX = 0;
      }
   }

   @Override
   public void d_() {
      if (this.bW > 0) {
         this.bW--;
      }

      super.d_();
   }

   @Override
   protected void h() {
      if (this.e_()) {
         this.bA = 3;
         this.g(bzl.c).a(0.5);
      } else {
         this.bA = 5;
         this.g(bzl.c).a(6.0);
      }
   }

   public static boolean c(bxn<cqr> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return !$$1.a_($$3.e()).a(dnq.lq);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gd();
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      if (cqs.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dnq.pc) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      bvc $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gc();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bW = 10;
         this.b(awy.mS);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gu() {
      return this.bW;
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected int e(asb $$0) {
      return this.bA;
   }

   private void gw() {
      this.a(bxn.bO, bwy.a(this, true, false), $$0 -> $$0.a(new bwi(bwk.i, 200, 0)));
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ar);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsImmuneToZombification", this.gx());
      $$0.a("TimeInOverworld", this.bX);
      $$0.a("CannotBeHunted", this.bY);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("IsImmuneToZombification", false));
      this.bX = $$0.b("TimeInOverworld", 0);
      this.x($$0.b("CannotBeHunted", false));
   }

   public void w(boolean $$0) {
      this.ar().a(bM, $$0);
   }

   private boolean gx() {
      return this.ar().a(bM);
   }

   public boolean u() {
      return !this.dV().F_().b() && !this.gx() && !this.gj();
   }

   private void x(boolean $$0) {
      this.bY = $$0;
   }

   public boolean gv() {
      return this.p() && !this.bY;
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      cqr $$2 = bxn.ak.a($$0, bxm.e);
      if ($$2 != null) {
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean gB() {
      return !cqs.c(this) && super.gB();
   }

   @Override
   public awz dm() {
      return awz.f;
   }

   @Override
   protected awx s() {
      return this.dV().C ? null : cqs.b(this).orElse(null);
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.mV;
   }

   @Override
   protected awx j_() {
      return awy.mU;
   }

   @Override
   protected awx aU() {
      return awy.nA;
   }

   @Override
   protected awx aV() {
      return awy.nz;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.mX, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a(this);
   }

   @Nullable
   @Override
   public byf e() {
      return this.P();
   }
}
