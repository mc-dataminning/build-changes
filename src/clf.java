import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clf<E extends ckx> {
   public static bus<bsy> a(int $$0) {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$1 -> $$1.group($$1.b(ccc.ad), $$1.a(ccc.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eU().e()) {
                        return false;
                     } else {
                        Optional<cir> $$7 = $$1.a($$3);
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
