import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cap {
   public static bya<bwg> a() {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$0 -> $$0.group($$0.b(cfk.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bwg $$1xx ? $$1xx : null)
                           .filter(bwg::eF)
                           .filter($$1xx -> $$1xx.aq() != bvr.bS || $$2.N().b(dhe.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
