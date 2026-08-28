import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class byp {
   public static bwd<buk> a(int $$0, BiPredicate<buk, buk> $$1) {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$2 -> $$2.group($$2.b(cdn.o), $$2.a(cdn.ab), $$2.c(cdn.ai), $$2.a(cdn.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     buk $$10 = $$2.b($$3);
                     if (!$$10.eB()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.ds(), (long)$$0);
                        if ($$10.ao() != btv.by || $$7.ac().b(dec.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
