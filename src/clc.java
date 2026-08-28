import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class clc {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static byj<?> a(byj<clb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctg.a));
      $$0.b(ctg.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<clb> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new byv(2.0F), new cag(45, 90), new cak(), new bzg(cgl.Q)));
   }

   private static void c(byj<clb> $$0) {
      $$0.a(
         ctg.b,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(1, new bzn($$0x -> 1.25F)),
            Pair.of(
               2,
               new bzo(
                  ImmutableMap.of(cgl.n, cgm.b),
                  ImmutableSet.of(),
                  bzo.a.a,
                  bzo.b.b,
                  ImmutableList.of(Pair.of(cas.c(0.5F), 2), Pair.of(cbh.a(0.5F, 3), 3), Pair.of(ccn.a(bwi::bh), 5))
               )
            )
         )
      );
   }

   public static void a(clb $$0) {
      $$0.eb().a(ImmutableList.of(ctg.b));
   }
}
