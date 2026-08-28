import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cct {
   public static byw<bxe> a() {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$0 -> $$0.group($$0.a(cgg.o), $$0.a(cgg.aA), $$0.a(cgg.az), $$0.c(cgg.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iu> $$7 = $$0.<bxe>a($$3).map(bwf::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new byy($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
