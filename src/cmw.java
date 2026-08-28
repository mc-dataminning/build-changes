import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cmw {
   public static bwg<bun> a(int $$0, int $$1) {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$2 -> $$2.group($$2.b(cdq.ad), $$2.b(cdq.L), $$2.a(cdq.ae), $$2.a(cdq.af))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.eX().f()) {
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
