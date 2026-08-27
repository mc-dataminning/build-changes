import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmj {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bmc<bjk> a(float $$0) {
      return a($$0, true);
   }

   public static bmc<bjk> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> btu.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.ba());
   }

   public static bkt<bjk> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> btu.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bkt<bjk> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bkt<bjk> c(float $$0) {
      return a($$0, bmj::a, bil::ba);
   }

   private static bmc<bjk> a(float $$0, Function<bjk, ehi> $$1, Predicate<bjk> $$2) {
      return boe.a((Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$3 -> $$3.group($$3.c(bsc.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ehi> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bsf($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehi a(bjk $$0) {
      ehi $$1 = null;
      ehi $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bku.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.di().e($$0.di().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dK().b_(gw.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ehi a(bjk $$0, int $$1, int $$2) {
      ehi $$3 = $$0.f(0.0F);
      return btp.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
