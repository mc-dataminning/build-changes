import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byp {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static byi<bvm> a(float $$0) {
      return a($$0, true);
   }

   public static byi<bvm> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cgc.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bo());
   }

   public static bwy<bvm> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cgc.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bwy<bvm> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bwy<bvm> c(float $$0) {
      return a($$0, byp::a, bui::bo);
   }

   private static byi<bvm> a(float $$0, Function<bvm, ezr> $$1, Predicate<bvm> $$2) {
      return cak.a((Function<cak.b<bvm>, ? extends App<cak.c<bvm>, can<bvm>>>)($$3 -> $$3.group($$3.c(cei.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ezr> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cel($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ezr a(bvm $$0) {
      ezr $$1 = null;
      ezr $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bwz.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dw().e($$0.dw().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dY().b_(jh.a((ka)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ezr a(bvm $$0, int $$1, int $$2) {
      ezr $$3 = $$0.g(0.0F);
      return cfx.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
