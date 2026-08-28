import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzf {
   public static bvi<bto> a() {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$0 -> $$0.group($$0.a(ccs.n), $$0.a(ccs.az), $$0.a(ccs.ay), $$0.c(ccs.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iz> $$7 = $$0.<bto>a($$3).map(bst::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bvk($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
