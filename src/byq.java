import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byq {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static byj<bvn> a(float $$0) {
      return a($$0, true);
   }

   public static byj<bvn> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cgd.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bm());
   }

   public static bwz<bvn> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cgd.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bwz<bvn> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bwz<bvn> c(float $$0) {
      return a($$0, byq::a, buj::bm);
   }

   private static byj<bvn> a(float $$0, Function<bvn, fay> $$1, Predicate<bvn> $$2) {
      return cal.a((Function<cal.b<bvn>, ? extends App<cal.c<bvn>, cao<bvn>>>)($$3 -> $$3.group($$3.c(cej.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<fay> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cem($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fay a(bvn $$0) {
      fay $$1 = null;
      fay $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bxa.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.du().e($$0.du().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dW().b_(ji.a((kb)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static fay a(bvn $$0, int $$1, int $$2) {
      fay $$3 = $$0.g(0.0F);
      return cfy.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
