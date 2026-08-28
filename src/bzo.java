import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzo {
   public static bxc<bvi> a(int $$0, BiPredicate<bvi, bvi> $$1) {
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$2 -> $$2.group($$2.b(cem.o), $$2.a(cem.ab), $$2.c(cem.ai), $$2.a(cem.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvi $$10 = $$2.b($$3);
                     if (!$$10.eE()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != but.bR || $$7.O().b(dgf.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
