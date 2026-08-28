import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdl {
   public static bzo<bxw> a() {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$0 -> $$0.group($$0.a(cgy.o), $$0.a(cgy.aA), $$0.a(cgy.az), $$0.c(cgy.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iw> $$7 = $$0.<bxw>a($$3).map(bwv::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bzq($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
