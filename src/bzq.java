import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzq {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bzj<bwn> a(float $$0) {
      return a($$0, true);
   }

   public static bzj<bwn> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> chd.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bm());
   }

   public static bxz<bwn> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> chd.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bxz<bwn> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bxz<bwn> c(float $$0) {
      return a($$0, bzq::a, bvj::bm);
   }

   private static bzj<bwn> a(float $$0, Function<bwn, fbx> $$1, Predicate<bwn> $$2) {
      return cbl.a((Function<cbl.b<bwn>, ? extends App<cbl.c<bwn>, cbo<bwn>>>)($$3 -> $$3.group($$3.c(cfj.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<fbx> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cfm($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbx a(bwn $$0) {
      fbx $$1 = null;
      fbx $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bya.a($$0, $$3[0], $$3[1]);
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
   private static fbx a(bwn $$0, int $$1, int $$2) {
      fbx $$3 = $$0.g(0.0F);
      return cgy.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
