import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bqy {
   public static <E extends box> bqq<E> a(int $$0, BiPredicate<E, bof> $$1) {
      return buc.a((Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$2 -> $$2.group($$2.a(bya.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bof $$7 = $$5.cW();
               bof $$8 = $$2.<bof>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bof $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.ac();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(box $$0, bof $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dJ() == $$0.dJ();
   }
}
