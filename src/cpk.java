import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cpk extends cpg {
   private static final int bG = 50;
   private static final float bH = 0.35F;
   private static final int bI = 7;
   private static final double bJ = 12.0;
   protected static final ImmutableList<chi<? extends chh<? super cpk>>> d = ImmutableList.of(chi.c, chi.d, chi.b, chi.f, chi.m);
   protected static final ImmutableList<cgb<?>> bF = ImmutableList.of(
      cgb.o, cgb.w, cgb.g, cgb.h, cgb.k, cgb.l, cgb.ap, cgb.ao, cgb.y, cgb.z, cgb.n, cgb.F, new cgb[]{cgb.p, cgb.q, cgb.r, cgb.u, cgb.ac, cgb.N, cgb.b}
   );

   public cpk(bwj<? extends cpk> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 20;
   }

   public static bye.a n() {
      return cnt.gt().a(byf.s, 50.0).a(byf.v, 0.35F).a(byf.c, 7.0).a(byf.m, 12.0);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      cpl.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      this.a(bwk.a, new cys(cyw.pI));
   }

   @Override
   protected bxz.b<cpk> ec() {
      return bxz.a(bF, d);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cpl.a(this, this.ec().a($$0));
   }

   @Override
   public bxz<cpk> eb() {
      return (bxz<cpk>)super.eb();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(aro $$0, cys $$1) {
      return $$1.a(cyw.pI) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpl.b(this);
      cpl.c(this);
      super.a($$0);
   }

   @Override
   public cpj x() {
      return this.gh() && this.gq() ? cpj.a : cpj.f;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwz $$4) {
         cpl.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awk u() {
      return awl.uz;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.uC;
   }

   @Override
   protected awk l_() {
      return awl.uB;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.uD, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(awl.uA);
   }

   @Override
   protected void gr() {
      this.b(awl.uE);
   }
}
