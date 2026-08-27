import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bof {
   public static <E extends bmf> bnx<E> a(int $$0, BiPredicate<E, blp> $$1) {
      return brj.a((Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$2 -> $$2.group($$2.a(bvh.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               blp $$7 = $$5.cZ();
               blp $$8 = $$2.<blp>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  blp $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bmf $$0, blp $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
