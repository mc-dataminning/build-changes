import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byv {
   public static bwg<bun> a() {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$0 -> $$0.group($$0.b(cdq.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bun $$1xx ? $$1xx : null)
                           .filter(bun::eC)
                           .filter($$1xx -> $$1xx.ao() != bty.by || $$2.ac().b(def.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
