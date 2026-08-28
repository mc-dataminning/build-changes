import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cqu {
   public static bzo<bxw> a(int $$0) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$1 -> $$1.group($$1.b(cgy.M), $$1.c(cgy.ae), $$1.c(cgy.ah), $$1.c(cgy.ag))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$4x, $$5x, $$6) -> {
                     coe $$7 = $$1.b($$2);
                     if (!cqp.a($$7.f())) {
                        return false;
                     } else {
                        $$3.a(true, (long)$$0);
                        return true;
                     }
                  }))
      );
   }
}
