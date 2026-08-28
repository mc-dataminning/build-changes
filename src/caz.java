import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caz {
   public static bxc<bvi> a() {
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$0 -> $$0.group($$0.a(cem.n), $$0.a(cem.az), $$0.a(cem.ay), $$0.c(cem.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ji> $$7 = $$0.<bvi>a($$3).map(bum::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxe($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
