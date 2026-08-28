import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbp {
   public static bxs<bvy> a() {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$0 -> $$0.group($$0.a(cfc.n), $$0.a(cfc.az), $$0.a(cfc.ay), $$0.c(cfc.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ji> $$7 = $$0.<bvy>a($$3).map(bva::du).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxu($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
