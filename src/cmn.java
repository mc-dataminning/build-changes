import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cmn<E extends cmf> {
   public static bvy<buf> a(int $$0) {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$1 -> $$1.group($$1.b(cdi.ad), $$1.a(cdi.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eX().f()) {
                        return false;
                     } else {
                        Optional<cjz> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
