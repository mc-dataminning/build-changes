import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buo {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static buh<brm> a(float $$0) {
      return a($$0, true);
   }

   public static buh<brm> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> ccb.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bf());
   }

   public static bsx<brm> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> ccb.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bsx<brm> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bsx<brm> c(float $$0) {
      return a($$0, buo::a, bql::bf);
   }

   private static buh<brm> a(float $$0, Function<brm, etf> $$1, Predicate<brm> $$2) {
      return bwj.a((Function<bwj.b<brm>, ? extends App<bwj.c<brm>, bwm<brm>>>)($$3 -> $$3.group($$3.c(cah.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<etf> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cak($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static etf a(brm $$0) {
      etf $$1 = null;
      etf $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bsy.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dl().e($$0.dl().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dN().b_(im.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static etf a(brm $$0, int $$1, int $$2) {
      etf $$3 = $$0.f(0.0F);
      return cbw.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
