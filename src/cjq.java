import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cjq {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bxa<?> a(bxa<cjp> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<cjp> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new bxm(2.0F), new byx(45, 90), new bzb(), new bxx(cfc.P)));
   }

   private static void c(bxa<cjp> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(1, new bye($$0x -> 1.25F)),
            Pair.of(
               2,
               new byf(
                  ImmutableMap.of(cfc.m, cfd.b),
                  ImmutableSet.of(),
                  byf.a.a,
                  byf.b.b,
                  ImmutableList.of(Pair.of(bzj.c(0.5F), 2), Pair.of(bzy.a(0.5F, 3), 3), Pair.of(cbe.a(bva::bj), 5))
               )
            )
         )
      );
   }

   public static void a(cjp $$0) {
      $$0.ea().a(ImmutableList.of(cri.b));
   }
}
