import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byv {
   public static bwu<bva> a(bul<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$2x -> $$2x.group($$2x.a(cee.n), $$2x.c(cee.q), $$2x.b(cee.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bva> $$9 = $$2x.<ceg>b($$5).a($$3xx -> $$3xx.g((bue)$$7) <= (double)$$2 && $$0.equals($$3xx.ar()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bva $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bxe($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
