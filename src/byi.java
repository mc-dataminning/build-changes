import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byi {
   public static <T extends bvk> bym<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bvk> bym<T> a(Predicate<T> $$0, int $$1) {
      return cao.a(
         (Function<cao.b<T>, ? extends App<cao.c<T>, car<T>>>)($$2 -> $$2.group($$2.a(cem.n), $$2.b(cem.o), $$2.c(cem.p), $$2.b(cem.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvi $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<ceo>b($$6).a($$10)) {
                        $$3.a(new bxm($$10, true));
                        $$8.a(bsk.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bvk $$0) {
      return $$0.b($$1 -> {
         cwm $$2 = $$1.h();
         return $$2 instanceof cxm && $$0.a((cxm)$$2);
      });
   }
}
