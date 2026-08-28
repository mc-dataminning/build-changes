import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cha {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static buo<?> a(buo<cgz> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<cgz> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bva(2.0F), new bwl(45, 90), new bwp(), new bvl(ccq.P)));
   }

   private static void c(buo<cgz> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(1, new bvs($$0x -> 1.25F)),
            Pair.of(
               2,
               new bvt(
                  ImmutableMap.of(ccq.m, ccr.b),
                  ImmutableSet.of(),
                  bvt.a.a,
                  bvt.b.b,
                  ImmutableList.of(Pair.of(bwx.c(0.5F), 2), Pair.of(bxm.a(0.5F, 3), 3), Pair.of(bys.a(bsq::bi), 5))
               )
            )
         )
      );
   }

   public static void a(cgz $$0) {
      $$0.dU().a(ImmutableList.of(cok.b));
   }
}
