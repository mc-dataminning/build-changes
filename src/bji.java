import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bji {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bjb<bgi> a(float $$0) {
      return a($$0, true);
   }

   public static bjb<bgi> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bqt.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.aY());
   }

   public static bhs<bgi> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bqt.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bhs<bgi> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bhs<bgi> c(float $$0) {
      return a($$0, bji::a, bfj::aY);
   }

   private static bjb<bgi> a(float $$0, Function<bgi, eei> $$1, Predicate<bgi> $$2) {
      return bld.a((Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$3 -> $$3.group($$3.c(bpb.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eei> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bpe($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eei a(bgi $$0) {
      eei $$1 = null;
      eei $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bht.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dg().e($$0.dg().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dI().b_(gu.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static eei a(bgi $$0, int $$1, int $$2) {
      eei $$3 = $$0.f(0.0F);
      return bqo.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
