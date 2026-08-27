import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmf {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bly<bjf> a(float $$0) {
      return a($$0, true);
   }

   public static bly<bjf> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> btq.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.ba());
   }

   public static bkp<bjf> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> btq.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bkp<bjf> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bkp<bjf> c(float $$0) {
      return a($$0, bmf::a, big::ba);
   }

   private static bly<bjf> a(float $$0, Function<bjf, ehf> $$1, Predicate<bjf> $$2) {
      return boa.a((Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$3 -> $$3.group($$3.c(bry.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ehf> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bsb($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehf a(bjf $$0) {
      ehf $$1 = null;
      ehf $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bkq.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.di().e($$0.di().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dK().b_(gv.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ehf a(bjf $$0, int $$1, int $$2) {
      ehf $$3 = $$0.f(0.0F);
      return btl.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
