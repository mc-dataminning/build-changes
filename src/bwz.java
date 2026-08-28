import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwz {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bws<btw> a(float $$0) {
      return a($$0, true);
   }

   public static bws<btw> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cem.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bi());
   }

   public static bvi<btw> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cem.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bvi<btw> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bvi<btw> c(float $$0) {
      return a($$0, bwz::a, bsr::bi);
   }

   private static bws<btw> a(float $$0, Function<btw, exa> $$1, Predicate<btw> $$2) {
      return byu.a((Function<byu.b<btw>, ? extends App<byu.c<btw>, byx<btw>>>)($$3 -> $$3.group($$3.c(ccs.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<exa> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new ccv($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static exa a(btw $$0) {
      exa $$1 = null;
      exa $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bvj.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dn().e($$0.dn().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dP().b_(jd.a((jw)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static exa a(btw $$0, int $$1, int $$2) {
      exa $$3 = $$0.g(0.0F);
      return ceh.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
