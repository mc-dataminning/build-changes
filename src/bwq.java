import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwq {
   private static je a(buh $$0, je $$1) {
      azk $$2 = $$0.dS().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azk $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends buh> bxi<E> a(cdi<je> $$0, int $$1, float $$2) {
      return bzk.a(
         (Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cdi.o), $$3.c(cdi.m), $$3.a(cdi.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     je $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.ds(), (double)$$1);
                     if (!$$8) {
                        bvz.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
