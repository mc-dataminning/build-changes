import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bww {
   public static buh<bso> a() {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$0 -> $$0.group($$0.b(cbr.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bso $$1xx ? $$1xx : null)
                           .filter(bso::eJ)
                           .filter($$1xx -> $$1xx.ak() != bsb.bE || $$2.ab().b(dbw.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
