import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvk {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bvd<bsi> a(float $$0) {
      return a($$0, true);
   }

   public static bvd<bsi> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> ccx.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bf());
   }

   public static btt<bsi> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> ccx.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static btt<bsi> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static btt<bsi> c(float $$0) {
      return a($$0, bvk::a, brh::bf);
   }

   private static bvd<bsi> a(float $$0, Function<bsi, etp> $$1, Predicate<bsi> $$2) {
      return bxf.a((Function<bxf.b<bsi>, ? extends App<bxf.c<bsi>, bxi<bsi>>>)($$3 -> $$3.group($$3.c(cbd.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<etp> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cbg($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static etp a(bsi $$0) {
      etp $$1 = null;
      etp $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = btu.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dl().e($$0.dl().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dN().b_(in.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static etp a(bsi $$0, int $$1, int $$2) {
      etp $$3 = $$0.f(0.0F);
      return ccs.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
