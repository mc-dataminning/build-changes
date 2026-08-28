import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzv {
   public static bvy<buf> a() {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$0 -> $$0.group($$0.a(cdi.n), $$0.a(cdi.az), $$0.a(cdi.ay), $$0.c(cdi.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<je> $$7 = $$0.<buf>a($$3).map(btj::ds).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bwa($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
