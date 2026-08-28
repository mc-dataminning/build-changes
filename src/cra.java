import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cra extends cqw {
   private static final int f = 50;
   private static final float bI = 0.35F;
   private static final int bJ = 7;
   private static final double bK = 12.0;
   protected static final ImmutableList<cio<? extends cin<? super cra>>> d = ImmutableList.of(cio.c, cio.d, cio.b, cio.f, cio.m);
   protected static final ImmutableList<chh<?>> e = ImmutableList.of(
      chh.o, chh.w, chh.g, chh.h, chh.k, chh.l, chh.ap, chh.ao, chh.y, chh.z, chh.n, chh.F, new chh[]{chh.p, chh.q, chh.r, chh.u, chh.ac, chh.N, chh.b}
   );

   public cra(bxn<? extends cra> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 20;
   }

   public static bzk.a n() {
      return cpk.gx().a(bzl.s, 50.0).a(bzl.v, 0.35F).a(bzl.c, 7.0).a(bzl.m, 12.0);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      crb.a(this);
      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      this.a(bxo.a, new dak(dao.pN));
   }

   @Override
   protected bzf.b<cra> ed() {
      return bzf.a(e, d);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return crb.a(this, this.ed().a($$0));
   }

   @Override
   public bzf<cra> ec() {
      return (bzf<cra>)super.ec();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(asb $$0, dak $$1) {
      return $$1.a(dao.pN) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      crb.b(this);
      crb.c(this);
      super.a($$0);
   }

   @Override
   public cqz x() {
      return this.gl() && this.gu() ? cqz.a : cqz.f;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof byf $$4) {
         crb.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awx u() {
      return awy.uD;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.uG;
   }

   @Override
   protected awx l_() {
      return awy.uF;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.uH, 0.15F, 1.0F);
   }

   protected void gy() {
      this.b(awy.uE);
   }

   @Override
   protected void gv() {
      this.b(awy.uI);
   }
}
