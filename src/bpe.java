import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bpe {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static box<bme> a(float $$0) {
      return a($$0, true);
   }

   public static box<bme> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bwq.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bc());
   }

   public static bnn<bme> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bwq.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bnn<bme> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bnn<bme> c(float $$0) {
      return a($$0, bpe::a, blf::bc);
   }

   private static box<bme> a(float $$0, Function<bme, elb> $$1, Predicate<bme> $$2) {
      return bqz.a((Function<bqz.b<bme>, ? extends App<bqz.c<bme>, brc<bme>>>)($$3 -> $$3.group($$3.c(bux.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<elb> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bva($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static elb a(bme $$0) {
      elb $$1 = null;
      elb $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bno.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dk().e($$0.dk().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dM().b_(hv.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static elb a(bme $$0, int $$1, int $$2) {
      elb $$3 = $$0.f(0.0F);
      return bwl.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
