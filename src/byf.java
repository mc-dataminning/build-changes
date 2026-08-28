import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byf {
   public static <T extends bvh> byj<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bvh> byj<T> a(Predicate<T> $$0, int $$1) {
      return cal.a(
         (Function<cal.b<T>, ? extends App<cal.c<T>, cao<T>>>)($$2 -> $$2.group($$2.a(cej.n), $$2.b(cej.o), $$2.c(cej.p), $$2.b(cej.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvf $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cel>b($$6).a($$10)) {
                        $$3.a(new bxj($$10, true));
                        $$8.a(bsh.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bvh $$0) {
      return $$0.b($$1 -> {
         cwj $$2 = $$1.h();
         return $$2 instanceof cxj && $$0.a((cxj)$$2);
      });
   }
}
