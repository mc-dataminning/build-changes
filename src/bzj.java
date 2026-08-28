import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzj {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bzc<bwg> a(float $$0) {
      return a($$0, true);
   }

   public static bzc<bwg> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cgw.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bj());
   }

   public static bxs<bwg> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cgw.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bxs<bwg> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bxs<bwg> c(float $$0) {
      return a($$0, bzj::a, bva::bj);
   }

   private static bzc<bwg> a(float $$0, Function<bwg, fbx> $$1, Predicate<bwg> $$2) {
      return cbe.a((Function<cbe.b<bwg>, ? extends App<cbe.c<bwg>, cbh<bwg>>>)($$3 -> $$3.group($$3.c(cfc.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<fbx> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cff($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbx a(bwg $$0) {
      fbx $$1 = null;
      fbx $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bxt.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.ds().e($$0.ds().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dU().b_(ji.a((kb)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static fbx a(bwg $$0, int $$1, int $$2) {
      fbx $$3 = $$0.h(0.0F);
      return cgr.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
