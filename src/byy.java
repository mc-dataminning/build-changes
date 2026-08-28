import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byy {
   public static <T extends bwa> bzc<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bwa> bzc<T> a(Predicate<T> $$0, int $$1) {
      return cbe.a(
         (Function<cbe.b<T>, ? extends App<cbe.c<T>, cbh<T>>>)($$2 -> $$2.group($$2.a(cfc.n), $$2.b(cfc.o), $$2.c(cfc.p), $$2.b(cfc.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvy $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cfe>b($$6).a($$10)) {
                        $$3.a(new byc($$10, true));
                        $$8.a(bsx.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bwa $$0) {
      return $$0.b($$1 -> {
         cxd $$2 = $$1.h();
         return $$2 instanceof cyc && $$0.a((cyc)$$2);
      });
   }
}
