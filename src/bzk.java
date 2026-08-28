import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzk {
   public static bwy<bve> a(int $$0, BiPredicate<bve, bve> $$1) {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$2 -> $$2.group($$2.b(cei.o), $$2.a(cei.ab), $$2.c(cei.ai), $$2.a(cei.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bve $$10 = $$2.b($$3);
                     if (!$$10.eI()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dy(), (long)$$0);
                        if ($$10.ar() != bup.by || $$7.ac().b(dfb.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
