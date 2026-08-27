import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvy {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bvr<bsw> a(float $$0) {
      return a($$0, true);
   }

   public static bvr<bsw> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cdl.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bl());
   }

   public static buh<bsw> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cdl.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static buh<bsw> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static buh<bsw> c(float $$0) {
      return a($$0, bvy::a, brv::bl);
   }

   private static bvr<bsw> a(float $$0, Function<bsw, ewu> $$1, Predicate<bsw> $$2) {
      return bxt.a((Function<bxt.b<bsw>, ? extends App<bxt.c<bsw>, bxw<bsw>>>)($$3 -> $$3.group($$3.c(cbr.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ewu> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cbu($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ewu a(bsw $$0) {
      ewu $$1 = null;
      ewu $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bui.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.ds().e($$0.ds().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dU().b_(ir.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ewu a(bsw $$0, int $$1, int $$2) {
      ewu $$3 = $$0.f(0.0F);
      return cdg.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
