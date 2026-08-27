import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cav {
   public static bla<bji> a(int $$0, int $$1) {
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$2 -> $$2.group($$2.b(bsj.ac), $$2.b(bsj.K), $$2.a(bsj.ad), $$2.a(bsj.ae))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.eT().b()) {
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
