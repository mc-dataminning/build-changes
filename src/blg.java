import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class blg {
   public static <E extends bjg> bky<E> a(int $$0, BiPredicate<E, biq> $$1) {
      return boj.a((Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$2 -> $$2.group($$2.a(bsh.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               biq $$7 = $$5.cY();
               biq $$8 = $$2.<biq>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  biq $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bjg $$0, biq $$1, int $$2) {
      return $$1.bv() && $$1.a($$0, (double)$$2) && $$1.dL() == $$0.dL();
   }
}
