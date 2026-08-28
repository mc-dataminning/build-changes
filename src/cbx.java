import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbx {
   public static bya<bwg> a() {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$0 -> $$0.group($$0.a(cfk.n), $$0.a(cfk.az), $$0.a(cfk.ay), $$0.c(cfk.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jh> $$7 = $$0.<bwg>a($$3).map(bvk::dw).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new byc($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
