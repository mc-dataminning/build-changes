import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxx {
   public static bvi<btn> a() {
      return byu.a(
         (Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$0 -> $$0.group($$0.b(ccs.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof btn $$1xx ? $$1xx : null)
                           .filter(btn::ey)
                           .filter($$1xx -> $$1xx.am() != bsx.by || $$2.ab().b(dcs.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
