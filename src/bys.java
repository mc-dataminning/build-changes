import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bys {
   public static bwg<bun> a(int $$0, BiPredicate<bun, bun> $$1) {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$2 -> $$2.group($$2.b(cdq.o), $$2.a(cdq.ab), $$2.c(cdq.ai), $$2.a(cdq.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bun $$10 = $$2.b($$3);
                     if (!$$10.eC()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.ds(), (long)$$0);
                        if ($$10.ao() != bty.by || $$7.ac().b(def.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
