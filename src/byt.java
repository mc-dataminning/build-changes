import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byt {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bym<bvq> a(float $$0) {
      return a($$0, true);
   }

   public static bym<bvq> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cgg.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bm());
   }

   public static bxc<bvq> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cgg.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bxc<bvq> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bxc<bvq> c(float $$0) {
      return a($$0, byt::a, bum::bm);
   }

   private static bym<bvq> a(float $$0, Function<bvq, fbb> $$1, Predicate<bvq> $$2) {
      return cao.a((Function<cao.b<bvq>, ? extends App<cao.c<bvq>, car<bvq>>>)($$3 -> $$3.group($$3.c(cem.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<fbb> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cep($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbb a(bvq $$0) {
      fbb $$1 = null;
      fbb $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bxd.a($$0, $$3[0], $$3[1]);
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
   private static fbb a(bvq $$0, int $$1, int $$2) {
      fbb $$3 = $$0.g(0.0F);
      return cgb.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
