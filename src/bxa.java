import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxa {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bwt<bty> a(float $$0) {
      return a($$0, true);
   }

   public static bwt<bty> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cen.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bh());
   }

   public static bvj<bty> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cen.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bvj<bty> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bvj<bty> c(float $$0) {
      return a($$0, bxa::a, bsu::bh);
   }

   private static bwt<bty> a(float $$0, Function<bty, evr> $$1, Predicate<bty> $$2) {
      return byv.a((Function<byv.b<bty>, ? extends App<byv.c<bty>, byy<bty>>>)($$3 -> $$3.group($$3.c(cct.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<evr> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new ccw($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static evr a(bty $$0) {
      evr $$1 = null;
      evr $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bvk.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dn().e($$0.dn().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dP().b_(iz.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static evr a(bty $$0, int $$1, int $$2) {
      evr $$3 = $$0.f(0.0F);
      return cei.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
