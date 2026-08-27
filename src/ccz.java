import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ccz {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bqp<?> a(bqp<ccy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<ccy> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new brb(2.0F), new bsm(45, 90), new bsq(), new brm(byr.P)));
   }

   private static void c(bqp<ccy> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(1, new brt($$0x -> 1.25F)),
            Pair.of(
               2,
               new bru(
                  ImmutableMap.of(byr.m, bys.b),
                  ImmutableSet.of(),
                  bru.a.a,
                  bru.b.b,
                  ImmutableList.of(Pair.of(bsy.c(0.5F), 2), Pair.of(btn.a(0.5F, 3), 3), Pair.of(but.a(bow::bf), 5))
               )
            )
         )
      );
   }

   public static void a(ccy $$0) {
      $$0.dP().a(ImmutableList.of(ckh.b));
   }
}
