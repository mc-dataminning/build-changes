import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bia {
   public static <E extends bfz> bhs<E> a(int $$0, BiPredicate<E, bfj> $$1) {
      return bld.a((Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$2 -> $$2.group($$2.a(bpb.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bfj $$7 = $$5.cW();
               bfj $$8 = $$2.<bfj>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bfj $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.Y();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bfz $$0, bfj $$1, int $$2) {
      return $$1.bs() && $$1.a($$0, (double)$$2) && $$1.dI() == $$0.dI();
   }
}
