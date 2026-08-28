import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwv {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bwo<btt> a(float $$0) {
      return a($$0, true);
   }

   public static bwo<btt> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cei.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bh());
   }

   public static bve<btt> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cei.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bve<btt> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bve<btt> c(float $$0) {
      return a($$0, bwv::a, bsp::bh);
   }

   private static bwo<btt> a(float $$0, Function<btt, evm> $$1, Predicate<btt> $$2) {
      return byq.a((Function<byq.b<btt>, ? extends App<byq.c<btt>, byt<btt>>>)($$3 -> $$3.group($$3.c(cco.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<evm> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new ccr($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static evm a(btt $$0) {
      evm $$1 = null;
      evm $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bvf.a($$0, $$3[0], $$3[1]);
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
   private static evm a(btt $$0, int $$1, int $$2) {
      evm $$3 = $$0.f(0.0F);
      return ced.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
