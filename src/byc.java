import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class byc {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bly<?> a(bly<byb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   private static void b(bly<byb> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bmk(2.0F), new bnu(45, 90), new bny(), new bmv(btz.O)));
   }

   private static void c(bly<byb> $$0) {
      $$0.a(
         cex.b,
         ImmutableList.of(
            Pair.of(0, boo.a(bkm.bt, 6.0F, bib.a(30, 60))),
            Pair.of(1, new bnc($$0x -> 1.25F)),
            Pair.of(
               2,
               new bnd(
                  ImmutableMap.of(btz.m, bua.b),
                  ImmutableSet.of(),
                  bnd.a.a,
                  bnd.b.b,
                  ImmutableList.of(Pair.of(bog.c(0.5F), 2), Pair.of(bov.a(0.5F, 3), 3), Pair.of(bqb.a(bki::ba), 5))
               )
            )
         )
      );
   }

   public static void a(byb $$0) {
      $$0.dN().a(ImmutableList.of(cex.b));
   }
}
