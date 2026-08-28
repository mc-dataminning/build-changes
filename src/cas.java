import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cas {
   public static <T extends bxw> caw<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bxw> caw<T> a(Predicate<T> $$0, int $$1) {
      return ccy.a(
         (Function<ccy.b<T>, ? extends App<ccy.c<T>, cdb<T>>>)($$2 -> $$2.group($$2.a(cgw.o), $$2.b(cgw.p), $$2.c(cgw.q), $$2.b(cgw.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxu $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.h($$10) && $$2.<cgy>b($$6).a($$10)) {
                        $$3.a(new bzw($$10, true));
                        $$8.a(buq.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bxw $$0) {
      return $$0.b($$1 -> {
         czu $$2 = $$1.h();
         return $$2 instanceof dat && $$0.a((dat)$$2);
      });
   }
}
