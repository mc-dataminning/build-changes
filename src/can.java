import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class can<E extends caf> {
   public static bkt<bjb> a(int $$0) {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$1 -> $$1.group($$1.b(bsc.ac), $$1.a(bsc.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eS().b()) {
                        return false;
                     } else {
                        Optional<byi> $$7 = $$1.a($$3);
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
