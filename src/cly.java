import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cly {
   public static bvl<btr> a(int $$0, int $$1) {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$2 -> $$2.group($$2.b(ccv.ad), $$2.b(ccv.L), $$2.a(ccv.ae), $$2.a(ccv.af))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.eY().e()) {
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
