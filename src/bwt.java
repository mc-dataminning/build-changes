import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwt {
   public static bus<bsy> a(bsj<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$2x -> $$2x.group($$2x.a(ccc.n), $$2x.c(ccc.q), $$2x.b(ccc.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bsy> $$9 = $$2x.<cce>b($$5).a($$3xx -> $$3xx.g((bsd)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bsy $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvc($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
