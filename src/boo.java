import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boo {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static boh<blp> a(float $$0) {
      return a($$0, true);
   }

   public static boh<blp> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bvz.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bc());
   }

   public static bmy<blp> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bvz.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bmy<blp> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bmy<blp> c(float $$0) {
      return a($$0, boo::a, bkq::bc);
   }

   private static boh<blp> a(float $$0, Function<blp, eju> $$1, Predicate<blp> $$2) {
      return bqj.a((Function<bqj.b<blp>, ? extends App<bqj.c<blp>, bqm<blp>>>)($$3 -> $$3.group($$3.c(buh.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eju> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new buk($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eju a(blp $$0) {
      eju $$1 = null;
      eju $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bmz.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dl().e($$0.dl().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dN().b_(ht.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static eju a(blp $$0, int $$1, int $$2) {
      eju $$3 = $$0.f(0.0F);
      return bvu.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
