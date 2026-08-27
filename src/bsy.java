import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsy {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bsr<bpw> a(float $$0) {
      return a($$0, true);
   }

   public static bsr<bpw> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cal.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bf());
   }

   public static brh<bpw> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cal.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static brh<bpw> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static brh<bpw> c(float $$0) {
      return a($$0, bsy::a, bow::bf);
   }

   private static bsr<bpw> a(float $$0, Function<bpw, epr> $$1, Predicate<bpw> $$2) {
      return but.a((Function<but.b<bpw>, ? extends App<but.c<bpw>, buw<bpw>>>)($$3 -> $$3.group($$3.c(byr.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<epr> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new byu($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static epr a(bpw $$0) {
      epr $$1 = null;
      epr $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bri.a($$0, $$3[0], $$3[1]);
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
   private static epr a(bpw $$0, int $$1, int $$2) {
      epr $$3 = $$0.f(0.0F);
      return cag.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
