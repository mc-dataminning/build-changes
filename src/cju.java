import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cju {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bxh<?> a(bxh<cjt> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<cjt> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new bxt(2.0F), new bze(45, 90), new bzi(), new bye(cfj.P)));
   }

   private static void c(bxh<cjt> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(1, new byl($$0x -> 1.25F)),
            Pair.of(
               2,
               new bym(
                  ImmutableMap.of(cfj.m, cfk.b),
                  ImmutableSet.of(),
                  bym.a.a,
                  bym.b.b,
                  ImmutableList.of(Pair.of(bzq.c(0.5F), 2), Pair.of(caf.a(0.5F, 3), 3), Pair.of(cbl.a(bvj::bm), 5))
               )
            )
         )
      );
   }

   public static void a(cjt $$0) {
      $$0.eb().a(ImmutableList.of(crn.b));
   }
}
