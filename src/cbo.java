import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbo {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static cbh<byn> a(float $$0) {
      return a($$0, true);
   }

   public static cbh<byn> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> cjb.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bi());
   }

   public static bzx<byn> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> cjb.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bzx<byn> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bzx<byn> c(float $$0) {
      return a($$0, cbo::a, bxe::bi);
   }

   private static cbh<byn> a(float $$0, Function<byn, fgc> $$1, Predicate<byn> $$2) {
      return cdj.a((Function<cdj.b<byn>, ? extends App<cdj.c<byn>, cdm<byn>>>)($$3 -> $$3.group($$3.c(chh.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<fgc> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new chk($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fgc a(byn $$0) {
      fgc $$1 = null;
      fgc $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bzy.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dt().e($$0.dt().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dV().b_(iw.a((jq)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static fgc a(byn $$0, int $$1, int $$2) {
      fgc $$3 = $$0.h(0.0F);
      return ciw.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
