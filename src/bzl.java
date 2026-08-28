import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzl {
   public static bwz<bvf> a(int $$0, BiPredicate<bvf, bvf> $$1) {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$2 -> $$2.group($$2.b(cej.o), $$2.a(cej.ab), $$2.c(cej.ai), $$2.a(cej.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvf $$10 = $$2.b($$3);
                     if (!$$10.eF()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dw(), (long)$$0);
                        if ($$10.aq() != buq.bR || $$7.O().b(dgc.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
