import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cad {
   public static bwg<bun> a() {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$0 -> $$0.group($$0.a(cdq.n), $$0.a(cdq.az), $$0.a(cdq.ay), $$0.c(cdq.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jf> $$7 = $$0.<bun>a($$3).map(btr::ds).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bwi($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
