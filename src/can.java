import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class can {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static cag<bxm> a(float $$0) {
      return a($$0, true);
   }

   public static cag<bxm> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cia.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bj());
   }

   public static byw<bxm> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cia.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static byw<bxm> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static byw<bxm> c(float $$0) {
      return a($$0, can::a, bwf::bj);
   }

   private static cag<bxm> a(float $$0, Function<bxm, feq> $$1, Predicate<bxm> $$2) {
      return cci.a((Function<cci.b<bxm>, ? extends App<cci.c<bxm>, ccl<bxm>>>)($$3 -> $$3.group($$3.c(cgg.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<feq> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cgj($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static feq a(bxm $$0) {
      feq $$1 = null;
      feq $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = byx.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dt().e($$0.dt().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dV().b_(iu.a((jo)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static feq a(bxm $$0, int $$1, int $$2) {
      feq $$3 = $$0.h(0.0F);
      return chv.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
