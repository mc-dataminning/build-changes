import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwa {
   private static jd a(btp $$0, jd $$1) {
      ayw $$2 = $$0.dP().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayw $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends btp> bws<E> a(ccs<jd> $$0, int $$1, float $$2) {
      return byu.a(
         (Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccs.o), $$3.c(ccs.m), $$3.a(ccs.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jd $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dp(), (double)$$1);
                     if (!$$8) {
                        bvj.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
