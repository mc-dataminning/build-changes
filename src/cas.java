import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cas {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static cal<bxr> a(float $$0) {
      return a($$0, true);
   }

   public static cal<bxr> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cif.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bh());
   }

   public static bzb<bxr> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cif.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bzb<bxr> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bzb<bxr> c(float $$0) {
      return a($$0, cas::a, bwi::bh);
   }

   private static cal<bxr> a(float $$0, Function<bxr, fex> $$1, Predicate<bxr> $$2) {
      return ccn.a((Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$3 -> $$3.group($$3.c(cgl.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<fex> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cgo($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fex a(bxr $$0) {
      fex $$1 = null;
      fex $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bzc.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.ds().e($$0.ds().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dU().b_(iv.a((jp)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static fex a(bxr $$0, int $$1, int $$2) {
      fex $$3 = $$0.h(0.0F);
      return cia.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
