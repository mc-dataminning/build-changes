import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cib {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bvo<?> a(bvo<cia> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<cia> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new bwa(2.0F), new bxl(45, 90), new bxp(), new bwl(cdq.P)));
   }

   private static void c(bvo<cia> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(1, new bws($$0x -> 1.25F)),
            Pair.of(
               2,
               new bwt(
                  ImmutableMap.of(cdq.m, cdr.b),
                  ImmutableSet.of(),
                  bwt.a.a,
                  bwt.b.b,
                  ImmutableList.of(Pair.of(bxx.c(0.5F), 2), Pair.of(bym.a(0.5F, 3), 3), Pair.of(bzs.a(btr::bl), 5))
               )
            )
         )
      );
   }

   public static void a(cia $$0) {
      $$0.dY().a(ImmutableList.of(cpp.b));
   }
}
