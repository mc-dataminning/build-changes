import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwf {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bkb<?> a(bkb<bwe> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkb<bwe> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new bkn(2.0F), new blx(45, 90), new bmb(), new bky(bsc.O)));
   }

   private static void c(bkb<bwe> $$0) {
      $$0.a(
         cda.b,
         ImmutableList.of(
            Pair.of(0, bmr.a(bip.bt, 6.0F, bge.a(30, 60))),
            Pair.of(1, new blf($$0x -> 1.25F)),
            Pair.of(
               2,
               new blg(
                  ImmutableMap.of(bsc.m, bsd.b),
                  ImmutableSet.of(),
                  blg.a.a,
                  blg.b.b,
                  ImmutableList.of(Pair.of(bmj.c(0.5F), 2), Pair.of(bmy.a(0.5F, 3), 3), Pair.of(boe.a(bil::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bwe $$0) {
      $$0.dM().a(ImmutableList.of(cda.b));
   }
}
