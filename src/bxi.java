import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxi {
   public static buw<btc> a(int $$0, BiPredicate<btc, btc> $$1) {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$2 -> $$2.group($$2.b(ccg.o), $$2.a(ccg.ab), $$2.c(ccg.ai), $$2.a(ccg.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     btc $$10 = $$2.b($$3);
                     if (!$$10.ez()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dr(), (long)$$0);
                        if ($$10.am() != bsn.by || $$7.ab().b(dcc.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
