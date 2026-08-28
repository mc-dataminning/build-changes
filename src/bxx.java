import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxx {
   public static bvi<bto> a() {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$0 -> $$0.group($$0.b(ccs.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bto $$1xx ? $$1xx : null)
                           .filter(bto::eB)
                           .filter($$1xx -> $$1xx.ak() != bsz.by || $$2.ab().b(dbt.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
