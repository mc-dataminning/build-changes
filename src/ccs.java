import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccs<E extends cck> {
   public static bmy<blg> a(int $$0) {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$1 -> $$1.group($$1.b(buh.ac), $$1.a(buh.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eV().b()) {
                        return false;
                     } else {
                        Optional<can> $$7 = $$1.a($$3);
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
