import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxp {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bxi<bun> a(float $$0) {
      return a($$0, true);
   }

   public static bxi<bun> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cfc.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bl());
   }

   public static bvy<bun> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cfc.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bvy<bun> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bvy<bun> c(float $$0) {
      return a($$0, bxp::a, btj::bl);
   }

   private static bxi<bun> a(float $$0, Function<bun, eye> $$1, Predicate<bun> $$2) {
      return bzk.a((Function<bzk.b<bun>, ? extends App<bzk.c<bun>, bzn<bun>>>)($$3 -> $$3.group($$3.c(cdi.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eye> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cdl($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eye a(bun $$0) {
      eye $$1 = null;
      eye $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bvz.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dq().e($$0.dq().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dS().b_(je.a((jx)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static eye a(bun $$0, int $$1, int $$2) {
      eye $$3 = $$0.g(0.0F);
      return cex.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
