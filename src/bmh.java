import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmh {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bma<bjh> a(float $$0) {
      return a($$0, true);
   }

   public static bma<bjh> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bts.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.ba());
   }

   public static bkr<bjh> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bts.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bkr<bjh> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bkr<bjh> c(float $$0) {
      return a($$0, bmh::a, bii::ba);
   }

   private static bma<bjh> a(float $$0, Function<bjh, ehe> $$1, Predicate<bjh> $$2) {
      return boc.a((Function<boc.b<bjh>, ? extends App<boc.c<bjh>, bof<bjh>>>)($$3 -> $$3.group($$3.c(bsa.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ehe> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bsd($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehe a(bjh $$0) {
      ehe $$1 = null;
      ehe $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bks.a($$0, $$3[0], $$3[1]);
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
   private static ehe a(bjh $$0, int $$1, int $$2) {
      ehe $$3 = $$0.f(0.0F);
      return btn.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
