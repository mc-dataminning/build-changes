import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bve {
   public static brh<bpo> a() {
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$0 -> $$0.group($$0.a(byr.n), $$0.a(byr.az), $$0.a(byr.ay), $$0.c(byr.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ib> $$7 = $$0.<bpo>a($$3).map(bow::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new brj($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
