import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbn {
   public static bzm<bxu> a(bxc<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$2x -> $$2x.group($$2x.a(cgw.o), $$2x.c(cgw.r), $$2x.b(cgw.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bxu> $$9 = $$2x.<cgy>b($$5).a($$3xx -> $$3xx.g($$7) <= (double)$$2 && $$0.equals($$3xx.an()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bxu $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bzw($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
