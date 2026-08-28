import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clk {
   public static buw<btc> a(int $$0, int $$1) {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$2 -> $$2.group($$2.b(ccg.ad), $$2.b(ccg.L), $$2.a(ccg.ae), $$2.a(ccg.af))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.eW().e()) {
                        return false;
                     } else {
                        Optional<Integer> $$9 = $$2.a($$5);
                        if ($$9.isEmpty()) {
                           $$5.a(0);
                        } else {
                           int $$10 = $$9.get();
                           if ($$10 > $$0) {
                              $$3.b();
                              $$5.b();
                              $$6.a(true, (long)$$1);
                           } else {
                              $$5.a($$10 + 1);
                           }
                        }

                        return true;
                     }
                  }))
      );
   }
}
