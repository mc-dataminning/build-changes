import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bro {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static brh<boo> a(float $$0) {
      return a($$0, true);
   }

   public static brh<boo> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bzb.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bc());
   }

   public static bpx<boo> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bzb.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bpx<boo> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bpx<boo> c(float $$0) {
      return a($$0, bro::a, bno::bc);
   }

   private static brh<boo> a(float $$0, Function<boo, ens> $$1, Predicate<boo> $$2) {
      return btj.a((Function<btj.b<boo>, ? extends App<btj.c<boo>, btm<boo>>>)($$3 -> $$3.group($$3.c(bxh.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ens> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bxk($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ens a(boo $$0) {
      ens $$1 = null;
      ens $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bpy.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dk().e($$0.dk().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dM().b_(hz.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ens a(boo $$0, int $$1, int $$2) {
      ens $$3 = $$0.f(0.0F);
      return byw.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
