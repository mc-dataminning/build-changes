import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxq {
   public static bve<btk> a(int $$0, BiPredicate<btk, btk> $$1) {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$2 -> $$2.group($$2.b(cco.o), $$2.a(cco.ab), $$2.c(cco.ai), $$2.a(cco.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     btk $$10 = $$2.b($$3);
                     if (!$$10.eB()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dp(), (long)$$0);
                        if ($$10.ak() != bsv.by || $$7.ab().b(dbp.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
