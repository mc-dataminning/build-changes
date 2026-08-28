import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byg {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bxz<bvd> a(float $$0) {
      return a($$0, true);
   }

   public static bxz<bvd> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cft.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bn());
   }

   public static bwp<bvd> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cft.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bwp<bvd> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bwp<bvd> c(float $$0) {
      return a($$0, byg::a, btz::bn);
   }

   private static bxz<bvd> a(float $$0, Function<bvd, ezh> $$1, Predicate<bvd> $$2) {
      return cab.a((Function<cab.b<bvd>, ? extends App<cab.c<bvd>, cae<bvd>>>)($$3 -> $$3.group($$3.c(cdz.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ezh> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cec($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ezh a(bvd $$0) {
      ezh $$1 = null;
      ezh $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bwq.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dv().e($$0.dv().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dX().b_(jg.a((jz)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ezh a(bvd $$0, int $$1, int $$2) {
      ezh $$3 = $$0.g(0.0F);
      return cfo.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
