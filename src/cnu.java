import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cnu<E extends cnm> {
   public static bxc<bvi> a(int $$0) {
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$1 -> $$1.group($$1.b(cem.ad), $$1.a(cem.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fa().f()) {
                        return false;
                     } else {
                        Optional<cld> $$7 = $$1.a($$3);
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
