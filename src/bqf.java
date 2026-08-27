import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bqf {
   public static <E extends bog> bpx<E> a(int $$0, BiPredicate<E, bno> $$1) {
      return btj.a((Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$2 -> $$2.group($$2.a(bxh.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bno $$7 = $$5.cZ();
               bno $$8 = $$2.<bno>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bno $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bog $$0, bno $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
