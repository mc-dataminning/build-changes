import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caa {
   public static bwd<buk> a() {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$0 -> $$0.group($$0.a(cdn.n), $$0.a(cdn.az), $$0.a(cdn.ay), $$0.c(cdn.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<je> $$7 = $$0.<buk>a($$3).map(bto::ds).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bwf($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
