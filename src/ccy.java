import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccy {
   public static bzb<bxj> a() {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$0 -> $$0.group($$0.a(cgl.o), $$0.a(cgl.aA), $$0.a(cgl.az), $$0.c(cgl.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iv> $$7 = $$0.<bxj>a($$3).map(bwi::du).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bzd($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
