import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cqv {
   public static bzm<bxu> a(int $$0, int $$1) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$2 -> $$2.group($$2.b(cgw.ae), $$2.b(cgw.M), $$2.a(cgw.af), $$2.a(cgw.ag))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     if (!$$7.fc().f()) {
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
