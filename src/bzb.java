import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzb {
   public static bwp<buv> a(int $$0, BiPredicate<buv, buv> $$1) {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$2 -> $$2.group($$2.b(cdz.o), $$2.a(cdz.ab), $$2.c(cdz.ai), $$2.a(cdz.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     buv $$10 = $$2.b($$3);
                     if (!$$10.eH()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dx(), (long)$$0);
                        if ($$10.aq() != bug.by || $$7.ac().b(der.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
