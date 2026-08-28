import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class clx {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<ceu<? extends cet<? super clw>>> e = ImmutableList.of(ceu.c, ceu.f, ceu.d, ceu.z);
   static final List<cdn<?>> f = ImmutableList.of(
      cdn.n, cdn.h, cdn.B, cdn.E, cdn.o, cdn.m, cdn.aU, cdn.aZ, cdn.aV, cdn.aW, cdn.aX, cdn.aY, new cdn[]{cdn.ba, cdn.bb, cdn.x, cdn.y, cdn.t}
   );
   private static final int g = 100;

   protected static bvl<?> a(clw $$0, bvl<clw> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cpm.a));
      $$1.b(cpm.k);
      $$1.f();
      return $$1;
   }

   private static void a(bvl<clw> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new byw(0.8F), new bxi(45, 90)));
   }

   private static void b(bvl<clw> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, byo.a($$0x -> $$0x.dX().c(cdn.B))),
            Pair.of(1, byo.a(clw::gq)),
            Pair.of(2, new clx.a(20, 40)),
            Pair.of(3, new bxz(ImmutableList.of(Pair.of(new bwm(20, 100), 1), Pair.of(bxu.a(0.6F), 2))))
         )
      );
   }

   private static void b(clw $$0, bvl<clw> $$1) {
      $$1.a(
         cpm.k,
         ImmutableList.of(
            Pair.of(0, byr.a(cet.a($$0, 100).negate())), Pair.of(1, new cma()), Pair.of(2, new clz()), Pair.of(3, new cmb()), Pair.of(4, new cmc())
         ),
         ImmutableSet.of(Pair.of(cdn.o, cdo.a), Pair.of(cdn.m, cdo.b))
      );
   }

   static void a(clw $$0) {
      $$0.dX().a(ImmutableList.of(cpm.k, cpm.b));
   }

   public static class a extends bxm {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arh $$0, bum $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awe.cM);
         $$1.b(buw.p);
      }

      @Override
      protected void b(arh $$0, bum $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(buw.a);
         if ($$1.dX().a(cdn.o)) {
            $$1.dX().a(cdn.aV, bai.a, 60L);
         }
      }
   }
}
