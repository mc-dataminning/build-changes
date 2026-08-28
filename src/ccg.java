import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccg {
   public static byj<bwr> a() {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$0 -> $$0.group($$0.a(cft.o), $$0.a(cft.aA), $$0.a(cft.az), $$0.c(cft.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jj> $$7 = $$0.<bwr>a($$3).map(bvs::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new byl($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
