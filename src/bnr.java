import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnr {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bnk<bks> a(float $$0) {
      return a($$0, true);
   }

   public static bnk<bks> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bvc.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.ba());
   }

   public static bmb<bks> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bvc.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bmb<bks> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bmb<bks> c(float $$0) {
      return a($$0, bnr::a, bjt::ba);
   }

   private static bnk<bks> a(float $$0, Function<bks, eif> $$1, Predicate<bks> $$2) {
      return bpm.a((Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$3 -> $$3.group($$3.c(btk.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eif> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new btn($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eif a(bks $$0) {
      eif $$1 = null;
      eif $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bmc.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dj().e($$0.dj().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dL().b_(ht.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static eif a(bks $$0, int $$1, int $$2) {
      eif $$3 = $$0.f(0.0F);
      return bux.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
