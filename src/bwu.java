import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwu {
   public static bui<bso> a(int $$0, BiPredicate<bso, bso> $$1) {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$2 -> $$2.group($$2.b(cbs.o), $$2.a(cbs.ab), $$2.c(cbs.ai), $$2.a(cbs.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bso $$10 = $$2.b($$3);
                     if (!$$10.eB()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dp(), (long)$$0);
                        if ($$10.ak() != bsa.by || $$7.aa().b(dat.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
