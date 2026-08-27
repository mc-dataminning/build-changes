import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class blb {
   public static <E extends bjb> bkt<E> a(int $$0, BiPredicate<E, bil> $$1) {
      return boe.a((Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$2 -> $$2.group($$2.a(bsc.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bil $$7 = $$5.cY();
               bil $$8 = $$2.<bil>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bil $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.aa();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bjb $$0, bil $$1, int $$2) {
      return $$1.bv() && $$1.a($$0, (double)$$2) && $$1.dK() == $$0.dK();
   }
}
