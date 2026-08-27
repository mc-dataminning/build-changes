import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmg {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static blz<bjh> a(float $$0) {
      return a($$0, true);
   }

   public static blz<bjh> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> btr.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.ba());
   }

   public static bkq<bjh> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> btr.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bkq<bjh> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bkq<bjh> c(float $$0) {
      return a($$0, bmg::a, bii::ba);
   }

   private static blz<bjh> a(float $$0, Function<bjh, ehd> $$1, Predicate<bjh> $$2) {
      return bob.a((Function<bob.b<bjh>, ? extends App<bob.c<bjh>, boe<bjh>>>)($$3 -> $$3.group($$3.c(brz.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ehd> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bsc($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehd a(bjh $$0) {
      ehd $$1 = null;
      ehd $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bkr.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.di().e($$0.di().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dK().b_(gu.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ehd a(bjh $$0, int $$1, int $$2) {
      ehd $$3 = $$0.f(0.0F);
      return btm.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
