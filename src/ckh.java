import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ckh {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bxr<?> a(bxr<ckg> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<ckg> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new byd(2.0F), new bzo(45, 90), new bzs(), new byo(cft.Q)));
   }

   private static void c(bxr<ckg> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(1, new byv($$0x -> 1.25F)),
            Pair.of(
               2,
               new byw(
                  ImmutableMap.of(cft.n, cfu.b),
                  ImmutableSet.of(),
                  byw.a.a,
                  byw.b.b,
                  ImmutableList.of(Pair.of(caa.c(0.5F), 2), Pair.of(cap.a(0.5F, 3), 3), Pair.of(cbv.a(bvs::bj), 5))
               )
            )
         )
      );
   }

   public static void a(ckg $$0) {
      $$0.eb().a(ImmutableList.of(crz.b));
   }
}
