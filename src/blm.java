import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class blm {
   public static <E extends bjm> ble<E> a(int $$0, BiPredicate<E, biw> $$1) {
      return bop.a((Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$2 -> $$2.group($$2.a(bsn.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               biw $$7 = $$5.cY();
               biw $$8 = $$2.<biw>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  biw $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bjm $$0, biw $$1, int $$2) {
      return $$1.bv() && $$1.a($$0, (double)$$2) && $$1.dL() == $$0.dL();
   }
}
