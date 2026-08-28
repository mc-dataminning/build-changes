import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxc {
   public static <E extends bva> bwu<E> a(int $$0, BiPredicate<E, bue> $$1) {
      return cag.a((Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$2 -> $$2.group($$2.a(cee.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bue $$7 = $$5.dl();
               bue $$8 = $$2.<bue>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bue $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bva $$0, bue $$1, int $$2) {
      return $$1.bM() && $$1.a($$0, (double)$$2) && $$1.dX() == $$0.dX();
   }
}
