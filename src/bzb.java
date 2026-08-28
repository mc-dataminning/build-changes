import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzb {
   public static <T extends bwd> bzf<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bwd> bzf<T> a(Predicate<T> $$0, int $$1) {
      return cbh.a(
         (Function<cbh.b<T>, ? extends App<cbh.c<T>, cbk<T>>>)($$2 -> $$2.group($$2.a(cff.n), $$2.b(cff.o), $$2.c(cff.p), $$2.b(cff.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwb $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cfh>b($$6).a($$10)) {
                        $$3.a(new byf($$10, true));
                        $$8.a(btd.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bwd $$0) {
      return $$0.b($$1 -> {
         cxg $$2 = $$1.h();
         return $$2 instanceof cyg && $$0.a((cyg)$$2);
      });
   }
}
