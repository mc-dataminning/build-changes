import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byl {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bye<bvi> a(float $$0) {
      return a($$0, true);
   }

   public static bye<bvi> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cfy.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bn());
   }

   public static bwu<bvi> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cfy.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bwu<bvi> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bwu<bvi> c(float $$0) {
      return a($$0, byl::a, bue::bn);
   }

   private static bye<bvi> a(float $$0, Function<bvi, ezn> $$1, Predicate<bvi> $$2) {
      return cag.a((Function<cag.b<bvi>, ? extends App<cag.c<bvi>, caj<bvi>>>)($$3 -> $$3.group($$3.c(cee.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ezn> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new ceh($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ezn a(bvi $$0) {
      ezn $$1 = null;
      ezn $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bwv.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dv().e($$0.dv().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dX().b_(jh.a((ka)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ezn a(bvi $$0, int $$1, int $$2) {
      ezn $$3 = $$0.g(0.0F);
      return cft.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
