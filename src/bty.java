import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bty {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static btr<bqw> a(float $$0) {
      return a($$0, true);
   }

   public static btr<bqw> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cbl.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bf());
   }

   public static bsh<bqw> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cbl.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bsh<bqw> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bsh<bqw> c(float $$0) {
      return a($$0, bty::a, bpv::bf);
   }

   private static btr<bqw> a(float $$0, Function<bqw, esa> $$1, Predicate<bqw> $$2) {
      return bvt.a((Function<bvt.b<bqw>, ? extends App<bvt.c<bqw>, bvw<bqw>>>)($$3 -> $$3.group($$3.c(bzr.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<esa> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bzu($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static esa a(bqw $$0) {
      esa $$1 = null;
      esa $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bsi.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dk().e($$0.dk().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dM().b_(ib.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static esa a(bqw $$0, int $$1, int $$2) {
      esa $$3 = $$0.f(0.0F);
      return cbg.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
