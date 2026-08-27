import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bmj {
   public static <E extends bkj> bmb<E> a(int $$0, BiPredicate<E, bjt> $$1) {
      return bpm.a((Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$2 -> $$2.group($$2.a(btk.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bjt $$7 = $$5.cY();
               bjt $$8 = $$2.<bjt>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bjt $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bkj $$0, bjt $$1, int $$2) {
      return $$1.bv() && $$1.a($$0, (double)$$2) && $$1.dL() == $$0.dL();
   }
}
