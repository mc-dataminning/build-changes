import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byr {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static byk<bvo> a(float $$0) {
      return a($$0, true);
   }

   public static byk<bvo> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cge.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bm());
   }

   public static bxa<bvo> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cge.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bxa<bvo> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bxa<bvo> c(float $$0) {
      return a($$0, byr::a, buk::bm);
   }

   private static byk<bvo> a(float $$0, Function<bvo, faz> $$1, Predicate<bvo> $$2) {
      return cam.a((Function<cam.b<bvo>, ? extends App<cam.c<bvo>, cap<bvo>>>)($$3 -> $$3.group($$3.c(cek.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<faz> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cen($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static faz a(bvo $$0) {
      faz $$1 = null;
      faz $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bxb.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dt().e($$0.dt().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dV().b_(ji.a((kb)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static faz a(bvo $$0, int $$1, int $$2) {
      faz $$3 = $$0.g(0.0F);
      return cfz.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
