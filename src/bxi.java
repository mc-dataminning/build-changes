import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxi {
   public static <E extends bvg> bxa<E> a(int $$0, BiPredicate<E, buk> $$1) {
      return cam.a((Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$2 -> $$2.group($$2.a(cek.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               buk $$7 = $$5.dl();
               buk $$8 = $$2.<buk>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  buk $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.ae();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bvg $$0, buk $$1, int $$2) {
      return $$1.bL() && $$1.a($$0, (double)$$2) && $$1.dW() == $$0.dW();
   }
}
