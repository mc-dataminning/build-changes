import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbq {
   public static bzb<bxj> a() {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$0 -> $$0.group($$0.b(cgl.ac))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bxj $$1xx ? $$1xx : null)
                           .filter(bxj::eG)
                           .filter($$1xx -> $$1xx.an() != bwr.bS || $$2.O().c(dji.P))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
