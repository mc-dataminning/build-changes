import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccr {
   public static byu<bxc> a() {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$0 -> $$0.group($$0.a(cge.o), $$0.a(cge.aA), $$0.a(cge.az), $$0.c(cge.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iu> $$7 = $$0.<bxc>a($$3).map(bwd::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new byw($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
