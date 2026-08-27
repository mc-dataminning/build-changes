import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cge {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bts<?> a(bts<cgd> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cgd> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bue(2.0F), new bvp(45, 90), new bvt(), new bup(cbu.P)));
   }

   private static void c(bts<cgd> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(1, new buw($$0x -> 1.25F)),
            Pair.of(
               2,
               new bux(
                  ImmutableMap.of(cbu.m, cbv.b),
                  ImmutableSet.of(),
                  bux.a.a,
                  bux.b.b,
                  ImmutableList.of(Pair.of(bwb.c(0.5F), 2), Pair.of(bwq.a(0.5F, 3), 3), Pair.of(bxw.a(brw::bh), 5))
               )
            )
         )
      );
   }

   public static void a(cgd $$0) {
      $$0.dS().a(ImmutableList.of(cnn.b));
   }
}
