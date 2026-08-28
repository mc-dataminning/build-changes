import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cmv<E extends cmn> {
   public static bwg<bun> a(int $$0) {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$1 -> $$1.group($$1.b(cdq.ad), $$1.a(cdq.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eX().f()) {
                        return false;
                     } else {
                        Optional<ckh> $$7 = $$1.a($$3);
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
