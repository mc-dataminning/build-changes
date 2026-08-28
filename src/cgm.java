import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cgm {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bua<?> a(bua<cgl> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<cgl> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bum(2.0F), new bvx(45, 90), new bwb(), new bux(ccc.P)));
   }

   private static void c(bua<cgl> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(1, new bve($$0x -> 1.25F)),
            Pair.of(
               2,
               new bvf(
                  ImmutableMap.of(ccc.m, ccd.b),
                  ImmutableSet.of(),
                  bvf.a.a,
                  bvf.b.b,
                  ImmutableList.of(Pair.of(bwj.c(0.5F), 2), Pair.of(bwy.a(0.5F, 3), 3), Pair.of(bye.a(bsd::bh), 5))
               )
            )
         )
      );
   }

   public static void a(cgl $$0) {
      $$0.dT().a(ImmutableList.of(cnw.b));
   }
}
