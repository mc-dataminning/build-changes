import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class boo {
   public static <E extends bmo> bog<E> a(int $$0, BiPredicate<E, blw> $$1) {
      return brs.a((Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$2 -> $$2.group($$2.a(bvq.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               blw $$7 = $$5.cZ();
               blw $$8 = $$2.<blw>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  blw $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bmo $$0, blw $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dL() == $$0.dL();
   }
}
