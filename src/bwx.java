import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwx {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bwq<btu> a(float $$0) {
      return a($$0, true);
   }

   public static bwq<btu> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cek.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bi());
   }

   public static bvg<btu> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cek.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bvg<btu> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bvg<btu> c(float $$0) {
      return a($$0, bwx::a, bsq::bi);
   }

   private static bwq<btu> a(float $$0, Function<btu, eww> $$1, Predicate<btu> $$2) {
      return bys.a((Function<bys.b<btu>, ? extends App<bys.c<btu>, byv<btu>>>)($$3 -> $$3.group($$3.c(ccq.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eww> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new cct($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eww a(btu $$0) {
      eww $$1 = null;
      eww $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bvh.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.do().e($$0.do().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dQ().b_(jd.a((jw)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static eww a(btu $$0, int $$1, int $$2) {
      eww $$3 = $$0.g(0.0F);
      return cef.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
