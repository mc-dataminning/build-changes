import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzp {
   public static <T extends bwt> bzt<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bwt> bzt<T> a(Predicate<T> $$0, int $$1) {
      return cbv.a(
         (Function<cbv.b<T>, ? extends App<cbv.c<T>, cby<T>>>)($$2 -> $$2.group($$2.a(cft.o), $$2.b(cft.p), $$2.c(cft.q), $$2.b(cft.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwr $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cfv>b($$6).a($$10)) {
                        $$3.a(new byt($$10, true));
                        $$8.a(btp.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bwt $$0) {
      return $$0.b($$1 -> {
         cxu $$2 = $$1.h();
         return $$2 instanceof cyt && $$0.a((cyt)$$2);
      });
   }
}
