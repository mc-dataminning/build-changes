import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ckf<E extends cjx> {
   public static btt<bsa> a(int $$0) {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$1 -> $$1.group($$1.b(cbd.ad), $$1.a(cbd.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eW().d()) {
                        return false;
                     } else {
                        Optional<chr> $$7 = $$1.a($$3);
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
