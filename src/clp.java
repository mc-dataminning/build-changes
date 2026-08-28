import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class clp {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static byw<?> a(byw<clo> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<clo> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new bzi(2.0F), new cat(45, 90), new cax(), new bzt(cgy.Q)));
   }

   private static void c(byw<clo> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(1, new caa($$0x -> 1.25F)),
            Pair.of(
               2,
               new cab(
                  ImmutableMap.of(cgy.n, cgz.b),
                  ImmutableSet.of(),
                  cab.a.a,
                  cab.b.b,
                  ImmutableList.of(Pair.of(cbf.c(0.5F), 2), Pair.of(cbu.a(0.5F, 3), 3), Pair.of(cda.a(bwv::bi), 5))
               )
            )
         )
      );
   }

   public static void a(clo $$0) {
      $$0.ec().a(ImmutableList.of(ctt.b));
   }
}
