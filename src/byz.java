import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class byz {
   public static <E extends bwz> byr<E> a(int $$0, BiPredicate<E, bwa> $$1) {
      return ccd.a((Function<ccd.b<E>, ? extends App<ccd.c<E>, ccg<E>>>)($$2 -> $$2.group($$2.a(cgb.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bwa $$7 = $$5.dk();
               bwa $$8 = $$2.<bwa>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bwa $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.bP();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bwz $$0, bwa $$1, int $$2) {
      return $$1.bK() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
