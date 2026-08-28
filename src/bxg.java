import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxg {
   public static <E extends bve> bwy<E> a(int $$0, BiPredicate<E, bui> $$1) {
      return cak.a((Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$2 -> $$2.group($$2.a(cei.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bui $$7 = $$5.dm();
               bui $$8 = $$2.<bui>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bui $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bve $$0, bui $$1, int $$2) {
      return $$1.bN() && $$1.a($$0, (double)$$2) && $$1.dY() == $$0.dY();
   }
}
