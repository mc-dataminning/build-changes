import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxx {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bxq<buv> a(float $$0) {
      return a($$0, true);
   }

   public static bxq<buv> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cfk.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bl());
   }

   public static bwg<buv> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cfk.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bwg<buv> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bwg<buv> c(float $$0) {
      return a($$0, bxx::a, btr::bl);
   }

   private static bxq<buv> a(float $$0, Function<buv, eyw> $$1, Predicate<buv> $$2) {
      return bzs.a((Function<bzs.b<buv>, ? extends App<bzs.c<buv>, bzv<buv>>>)($$3 -> $$3.group($$3.c(cdq.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eyw> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cdt($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eyw a(buv $$0) {
      eyw $$1 = null;
      eyw $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bwh.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dq().e($$0.dq().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dS().b_(jf.a((jy)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static eyw a(buv $$0, int $$1, int $$2) {
      eyw $$3 = $$0.g(0.0F);
      return cff.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
