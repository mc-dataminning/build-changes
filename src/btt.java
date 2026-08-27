import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class btt {
   public static brh<bpo> a(int $$0, BiPredicate<bpo, bpo> $$1) {
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$2 -> $$2.group($$2.b(byr.o), $$2.a(byr.ab), $$2.c(byr.ai), $$2.a(byr.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bpo $$10 = $$2.b($$3);
                     if (!$$10.ey()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != bpc.bx || $$7.Z().b(cwv.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
