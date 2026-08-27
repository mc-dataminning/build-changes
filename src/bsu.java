import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bsu {
   public static <E extends bqt> bsm<E> a(int $$0, BiPredicate<E, bqa> $$1) {
      return bvy.a((Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$2 -> $$2.group($$2.a(bzw.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bqa $$7 = $$5.cZ();
               bqa $$8 = $$2.<bqa>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bqa $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bqt $$0, bqa $$1, int $$2) {
      return $$1.bA() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
