import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwm {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bwf<btk> a(float $$0) {
      return a($$0, true);
   }

   public static bwf<btk> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cdz.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bi());
   }

   public static buv<btk> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cdz.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static buv<btk> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static buv<btk> c(float $$0) {
      return a($$0, bwm::a, bsg::bi);
   }

   private static bwf<btk> a(float $$0, Function<btk, ewf> $$1, Predicate<btk> $$2) {
      return byh.a((Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$3 -> $$3.group($$3.c(ccf.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ewf> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cci($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ewf a(btk $$0) {
      ewf $$1 = null;
      ewf $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = buw.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.do().e($$0.do().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dQ().b_(ja.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ewf a(btk $$0, int $$1, int $$2) {
      ewf $$3 = $$0.g(0.0F);
      return cdu.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
