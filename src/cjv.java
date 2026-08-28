import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cjv {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bxi<?> a(bxi<cju> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cju> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new bxu(2.0F), new bzf(45, 90), new bzj(), new byf(cfk.P)));
   }

   private static void c(bxi<cju> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(1, new bym($$0x -> 1.25F)),
            Pair.of(
               2,
               new byn(
                  ImmutableMap.of(cfk.m, cfl.b),
                  ImmutableSet.of(),
                  byn.a.a,
                  byn.b.b,
                  ImmutableList.of(Pair.of(bzr.c(0.5F), 2), Pair.of(cag.a(0.5F, 3), 3), Pair.of(cbm.a(bvk::bm), 5))
               )
            )
         )
      );
   }

   public static void a(cju $$0) {
      $$0.ec().a(ImmutableList.of(cro.b));
   }
}
