import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbw {
   public static bxz<bwf> a() {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$0 -> $$0.group($$0.a(cfj.n), $$0.a(cfj.az), $$0.a(cfj.ay), $$0.c(cfj.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jh> $$7 = $$0.<bwf>a($$3).map(bvj::dw).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new byb($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
