import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bus {
   public static <E extends bsq> buk<E> a(int $$0, BiPredicate<E, brw> $$1) {
      return bxw.a((Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$2 -> $$2.group($$2.a(cbu.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               brw $$7 = $$5.dc();
               brw $$8 = $$2.<brw>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  brw $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bsq $$0, brw $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
