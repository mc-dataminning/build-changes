import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwx {
   public static <E extends buv> bwp<E> a(int $$0, BiPredicate<E, btz> $$1) {
      return cab.a((Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$2 -> $$2.group($$2.a(cdz.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               btz $$7 = $$5.dl();
               btz $$8 = $$2.<btz>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  btz $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.af();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(buv $$0, btz $$1, int $$2) {
      return $$1.bM() && $$1.a($$0, (double)$$2) && $$1.dX() == $$0.dX();
   }
}
