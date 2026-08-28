import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxu {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bxn<bus> a(float $$0) {
      return a($$0, true);
   }

   public static bxn<bus> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cfh.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bl());
   }

   public static bwd<bus> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cfh.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bwd<bus> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bwd<bus> c(float $$0) {
      return a($$0, bxu::a, bto::bl);
   }

   private static bxn<bus> a(float $$0, Function<bus, eys> $$1, Predicate<bus> $$2) {
      return bzp.a((Function<bzp.b<bus>, ? extends App<bzp.c<bus>, bzs<bus>>>)($$3 -> $$3.group($$3.c(cdn.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eys> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cdq($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eys a(bus $$0) {
      eys $$1 = null;
      eys $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bwe.a($$0, $$3[0], $$3[1]);
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
   private static eys a(bus $$0, int $$1, int $$2) {
      eys $$3 = $$0.g(0.0F);
      return cfc.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
