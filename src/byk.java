import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class byk {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bmg<?> a(bmg<byj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmg<byj> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new bms(2.0F), new boc(45, 90), new bog(), new bnd(buh.O)));
   }

   private static void c(bmg<byj> $$0) {
      $$0.a(
         cff.b,
         ImmutableList.of(
            Pair.of(0, bow.a(bku.bt, 6.0F, bii.a(30, 60))),
            Pair.of(1, new bnk($$0x -> 1.25F)),
            Pair.of(
               2,
               new bnl(
                  ImmutableMap.of(buh.m, bui.b),
                  ImmutableSet.of(),
                  bnl.a.a,
                  bnl.b.b,
                  ImmutableList.of(Pair.of(boo.c(0.5F), 2), Pair.of(bpd.a(0.5F, 3), 3), Pair.of(bqj.a(bkq::bc), 5))
               )
            )
         )
      );
   }

   public static void a(byj $$0) {
      $$0.dP().a(ImmutableList.of(cff.b));
   }
}
