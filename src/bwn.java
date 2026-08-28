import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwn {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bwg<btl> a(float $$0) {
      return a($$0, true);
   }

   public static bwg<btl> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cea.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bj());
   }

   public static buw<btl> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cea.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static buw<btl> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static buw<btl> c(float $$0) {
      return a($$0, bwn::a, bsh::bj);
   }

   private static bwg<btl> a(float $$0, Function<btl, ewh> $$1, Predicate<btl> $$2) {
      return byi.a((Function<byi.b<btl>, ? extends App<byi.c<btl>, byl<btl>>>)($$3 -> $$3.group($$3.c(ccg.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ewh> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new ccj($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ewh a(btl $$0) {
      ewh $$1 = null;
      ewh $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bux.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dp().e($$0.dp().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dR().b_(ja.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ewh a(btl $$0, int $$1, int $$2) {
      ewh $$3 = $$0.g(0.0F);
      return cdv.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
