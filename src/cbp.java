import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbp {
   public static bzo<bxw> a(bxe<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$2x -> $$2x.group($$2x.a(cgy.o), $$2x.c(cgy.r), $$2x.b(cgy.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bxw> $$9 = $$2x.<cha>b($$5).a($$3xx -> $$3xx.g($$7) <= (double)$$2 && $$0.equals($$3xx.an()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bxw $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bzy($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
