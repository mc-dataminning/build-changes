import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clj<E extends clb> {
   public static buw<btc> a(int $$0) {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$1 -> $$1.group($$1.b(ccg.ad), $$1.a(ccg.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eW().e()) {
                        return false;
                     } else {
                        Optional<civ> $$7 = $$1.a($$3);
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
