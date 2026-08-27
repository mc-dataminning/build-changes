import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwq {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bkm<?> a(bkm<bwp> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkm<bwp> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bky(2.0F), new bmi(45, 90), new bmm(), new blj(bsn.O)));
   }

   private static void c(bkm<bwp> $$0) {
      $$0.a(
         cdl.b,
         ImmutableList.of(
            Pair.of(0, bnc.a(bja.bt, 6.0F, bgp.a(30, 60))),
            Pair.of(1, new blq($$0x -> 1.25F)),
            Pair.of(
               2,
               new blr(
                  ImmutableMap.of(bsn.m, bso.b),
                  ImmutableSet.of(),
                  blr.a.a,
                  blr.b.b,
                  ImmutableList.of(Pair.of(bmu.c(0.5F), 2), Pair.of(bnj.a(0.5F, 3), 3), Pair.of(bop.a(biw::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bwp $$0) {
      $$0.dN().a(ImmutableList.of(cdl.b));
   }
}
