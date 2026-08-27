import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class brk {
   public static bnn<blv> a() {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$0 -> $$0.group($$0.a(bux.n), $$0.a(bux.ay), $$0.a(bux.ax), $$0.c(bux.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hv> $$7 = $$0.<blv>a($$3).map(blf::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bnp($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
