import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cas<E extends cak> {
   public static bky<bjg> a(int $$0) {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$1 -> $$1.group($$1.b(bsh.ac), $$1.a(bsh.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eT().b()) {
                        return false;
                     } else {
                        Optional<byn> $$7 = $$1.a($$3);
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
