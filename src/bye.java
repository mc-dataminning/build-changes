import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bye {
   public static buh<bso> a() {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$0 -> $$0.group($$0.a(cbr.n), $$0.a(cbr.az), $$0.a(cbr.ay), $$0.c(cbr.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ir> $$7 = $$0.<bso>a($$3).map(brv::du).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new buj($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
