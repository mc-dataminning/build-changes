import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bol {
   public static bkp<biw> a() {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$0 -> $$0.group($$0.a(bry.n), $$0.a(bry.ay), $$0.a(bry.ax), $$0.c(bry.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<gv> $$7 = $$0.<biw>a($$3).map(big::dk).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bkr($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
