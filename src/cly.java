import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cly {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bzf<?> a(bzf<clx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<clx> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new bzr(2.0F), new cbc(45, 90), new cbg(), new cac(chh.Q)));
   }

   private static void c(bzf<clx> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(1, new caj($$0x -> 1.25F)),
            Pair.of(
               2,
               new cak(
                  ImmutableMap.of(chh.n, chi.b),
                  ImmutableSet.of(),
                  cak.a.a,
                  cak.b.b,
                  ImmutableList.of(Pair.of(cbo.c(0.5F), 2), Pair.of(ccd.a(0.5F, 3), 3), Pair.of(cdj.a(bxe::bi), 5))
               )
            )
         )
      );
   }

   public static void a(clx $$0) {
      $$0.ec().a(ImmutableList.of(cuc.b));
   }
}
