import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxy {
   public static bvj<btp> a() {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$0 -> $$0.group($$0.b(cct.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof btp $$1xx ? $$1xx : null)
                           .filter(btp::eB)
                           .filter($$1xx -> $$1xx.ak() != bta.by || $$2.ab().b(dbu.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
