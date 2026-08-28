import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cao {
   public static bxz<bwf> a() {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$0 -> $$0.group($$0.b(cfj.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bwf $$1xx ? $$1xx : null)
                           .filter(bwf::eF)
                           .filter($$1xx -> $$1xx.aq() != bvq.bS || $$2.N().b(dhd.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
