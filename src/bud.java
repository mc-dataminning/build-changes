import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bud {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static btw<brb> a(float $$0) {
      return a($$0, true);
   }

   public static btw<brb> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cbq.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bf());
   }

   public static bsm<brb> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cbq.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bsm<brb> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bsm<brb> c(float $$0) {
      return a($$0, bud::a, bqa::bf);
   }

   private static btw<brb> a(float $$0, Function<brb, esj> $$1, Predicate<brb> $$2) {
      return bvy.a((Function<bvy.b<brb>, ? extends App<bvy.c<brb>, bwb<brb>>>)($$3 -> $$3.group($$3.c(bzw.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<esj> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bzz($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static esj a(brb $$0) {
      esj $$1 = null;
      esj $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bsn.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dk().e($$0.dk().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dM().b_(id.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static esj a(brb $$0, int $$1, int $$2) {
      esj $$3 = $$0.f(0.0F);
      return cbl.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
