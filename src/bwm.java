import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwm {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bki<?> a(bki<bwl> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bki<bwl> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bku(2.0F), new bme(45, 90), new bmi(), new blf(bsj.O)));
   }

   private static void c(bki<bwl> $$0) {
      $$0.a(
         cdh.b,
         ImmutableList.of(
            Pair.of(0, bmy.a(biw.bt, 6.0F, bgl.a(30, 60))),
            Pair.of(1, new blm($$0x -> 1.25F)),
            Pair.of(
               2,
               new bln(
                  ImmutableMap.of(bsj.m, bsk.b),
                  ImmutableSet.of(),
                  bln.a.a,
                  bln.b.b,
                  ImmutableList.of(Pair.of(bmq.c(0.5F), 2), Pair.of(bnf.a(0.5F, 3), 3), Pair.of(bol.a(bis::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bwl $$0) {
      $$0.dN().a(ImmutableList.of(cdh.b));
   }
}
