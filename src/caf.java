import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class caf {
   public static <E extends byf> bzx<E> a(int $$0, BiPredicate<E, bxe> $$1) {
      return cdj.a((Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$2 -> $$2.group($$2.a(chh.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bxe $$7 = $$5.dk();
               bxe $$8 = $$2.<bxe>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bxe $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.bO();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(byf $$0, bxe $$1, int $$2) {
      return $$1.bJ() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
