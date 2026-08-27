import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cgc {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static btp<?> a(btp<cgb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cgb> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bub(2.0F), new bvm(45, 90), new bvq(), new bum(cbr.P)));
   }

   private static void c(btp<cgb> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(1, new but($$0x -> 1.25F)),
            Pair.of(
               2,
               new buu(
                  ImmutableMap.of(cbr.m, cbs.b),
                  ImmutableSet.of(),
                  buu.a.a,
                  buu.b.b,
                  ImmutableList.of(Pair.of(bvy.c(0.5F), 2), Pair.of(bwn.a(0.5F, 3), 3), Pair.of(bxt.a(brv::bl), 5))
               )
            )
         )
      );
   }

   public static void a(cgb $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.b));
   }
}
