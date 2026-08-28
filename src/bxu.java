import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxu {
   public static bvi<bto> a(int $$0, BiPredicate<bto, bto> $$1) {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$2 -> $$2.group($$2.b(ccs.o), $$2.a(ccs.ab), $$2.c(ccs.ai), $$2.a(ccs.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bto $$10 = $$2.b($$3);
                     if (!$$10.eB()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dp(), (long)$$0);
                        if ($$10.ak() != bsz.by || $$7.ab().b(dbt.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
