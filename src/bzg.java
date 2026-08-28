import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzg {
   public static bwu<bva> a(int $$0, BiPredicate<bva, bva> $$1) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$2 -> $$2.group($$2.b(cee.o), $$2.a(cee.ab), $$2.c(cee.ai), $$2.a(cee.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bva $$10 = $$2.b($$3);
                     if (!$$10.eH()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dx(), (long)$$0);
                        if ($$10.ar() != bul.by || $$7.ac().b(dex.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
