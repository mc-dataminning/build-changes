import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxb {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bwu<btz> a(float $$0) {
      return a($$0, true);
   }

   public static bwu<btz> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> ceo.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bh());
   }

   public static bvk<btz> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> ceo.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bvk<btz> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bvk<btz> c(float $$0) {
      return a($$0, bxb::a, bsv::bh);
   }

   private static bwu<btz> a(float $$0, Function<btz, evs> $$1, Predicate<btz> $$2) {
      return byw.a((Function<byw.b<btz>, ? extends App<byw.c<btz>, byz<btz>>>)($$3 -> $$3.group($$3.c(ccu.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<evs> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new ccx($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static evs a(btz $$0) {
      evs $$1 = null;
      evs $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bvl.a($$0, $$3[0], $$3[1]);
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
   private static evs a(btz $$0, int $$1, int $$2) {
      evs $$3 = $$0.f(0.0F);
      return cej.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
