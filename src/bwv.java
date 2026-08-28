import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwv {
   private static je a(bum $$0, je $$1) {
      azl $$2 = $$0.dS().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azl $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bum> bxn<E> a(cdn<je> $$0, int $$1, float $$2) {
      return bzp.a(
         (Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cdn.o), $$3.c(cdn.m), $$3.a(cdn.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     je $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.ds(), (double)$$1);
                     if (!$$8) {
                        bwe.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
