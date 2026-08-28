import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbj {
   public static byu<bxc> a() {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$0 -> $$0.group($$0.b(cge.ac))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bxc $$1xx ? $$1xx : null)
                           .filter(bxc::eG)
                           .filter($$1xx -> $$1xx.aq() != bwm.bS || $$2.O().c(dir.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
