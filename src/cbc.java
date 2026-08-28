import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbc {
   public static bzb<bxj> a(bwr<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$2x -> $$2x.group($$2x.a(cgl.o), $$2x.c(cgl.r), $$2x.b(cgl.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bxj> $$9 = $$2x.<cgn>b($$5).a($$3xx -> $$3xx.g($$7) <= (double)$$2 && $$0.equals($$3xx.an()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bxj $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bzl($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
