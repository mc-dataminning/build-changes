import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bqj {
   public static <E extends boi> bqb<E> a(int $$0, BiPredicate<E, bnq> $$1) {
      return btn.a((Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$2 -> $$2.group($$2.a(bxl.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bnq $$7 = $$5.cZ();
               bnq $$8 = $$2.<bnq>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bnq $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(boi $$0, bnq $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
