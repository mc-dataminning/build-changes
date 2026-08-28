import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzr {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bzk<bwo> a(float $$0) {
      return a($$0, true);
   }

   public static bzk<bwo> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> che.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bm());
   }

   public static bya<bwo> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> che.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bya<bwo> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bya<bwo> c(float $$0) {
      return a($$0, bzr::a, bvk::bm);
   }

   private static bzk<bwo> a(float $$0, Function<bwo, fby> $$1, Predicate<bwo> $$2) {
      return cbm.a((Function<cbm.b<bwo>, ? extends App<cbm.c<bwo>, cbp<bwo>>>)($$3 -> $$3.group($$3.c(cfk.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<fby> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cfn($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fby a(bwo $$0) {
      fby $$1 = null;
      fby $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = byb.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.du().e($$0.du().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dW().b_(jh.a((ka)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static fby a(bwo $$0, int $$1, int $$2) {
      fby $$3 = $$0.g(0.0F);
      return cgz.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
